package com.eternaldoom.realmsofchaos.asm;

import java.io.IOException;
import java.util.Iterator;

import net.minecraft.launchwrapper.IClassTransformer;
import net.minecraft.launchwrapper.Launch;

import org.apache.logging.log4j.LogManager;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class ROCTransformer implements IClassTransformer
{
	private static boolean isObf;
	
	private static String NHPCName;
	private static String registerVariantNamesName;
	private static String variantNames;
	private static String bakeryName;
	private static String handleUpdateTileEntityName;
	private static String tileEntityName;
	private static String tileEntityPacketName;
	private static String renderItemName;
	private static String itemMethodName;
	private static String itemName;
	private static String entityPlayerName;
	private static String itemStackName;
	private static String modelResourceLocationName;
	private static String entityLivingBaseName;
	private static String cameraTransformTypeName;
		
	//Set the values/obf mappings
	static
	{
		boolean obfuscated = true;
		
		try
		{
			obfuscated = Launch.classLoader.getClassBytes("net.minecraft.world.World") == null;
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		isObf = obfuscated;
		
		NHPCName = isObf ? "cee" : "net/minecraft/client/network/NetHandlerPlayClient";
		handleUpdateTileEntityName = isObf ? "a" : "handleUpdateTileEntity";
		tileEntityName = isObf ? "bcm" : "net/minecraft/tileentity/TileEntity";
		tileEntityPacketName = isObf ? "iu" : "net/minecraft/network/play/server/S35PacketUpdateTileEntity";
		
		bakeryName = isObf ? "cxh" : "net/minecraft/client/resources/model/ModelBakery";
		registerVariantNamesName = isObf ? "e" : "registerVariantNames";
		variantNames = isObf ? "u" : "variantNames";
		
		renderItemName = isObf ? "cqh" : "net/minecraft/client/renderer/entity/RenderItem";
		itemMethodName = isObf ? "a" : "func_175049_a";
		itemName = isObf ? "alq" : "net/minecraft/item/Item";
		entityPlayerName = isObf ? "ahd" : "net/minecraft/entity/player/EntityPlayer";
		itemStackName = isObf ? "amj" : "net/minecraft/item/ItemStack";
		modelResourceLocationName = isObf ? "cxl" : "net/minecraft/client/resources/model/ModelResourceLocation";
		entityLivingBaseName = isObf ? "xm" : "net/minecraft/entity/EntityLivingBase";
		cameraTransformTypeName = isObf ? "cmz" : "net/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType";
	}
	
	@Override
	public byte[] transform(String name, String transformedName, byte[] clazz) {
		if (name.equals(NHPCName.replace("/", "."))){
			LogManager.getLogger().info("About to patch handleUpdateTileEntity() in class NetHandlerPlayClient (cee)");
			ClassNode classnode = ASMHelper.getClassNode(clazz);
			MethodNode teMethodNode = ASMHelper.getMethodNode(classnode, handleUpdateTileEntityName, "(L" + tileEntityPacketName +";)V");

			InsnList instructions = new InsnList();
			
			instructions.add(new VarInsnNode(Opcodes.ALOAD, 2)); //Load the TileEntity instance.
			instructions.add(new VarInsnNode(Opcodes.ALOAD, 1)); //Load the S35CustomPayloadPacket instance.
			instructions.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "com/eternaldoom/realmsofchaos/asm/CoreMethods", "handleTileEntityPackets", "(L" + tileEntityName + ";L" + tileEntityPacketName +";)V", false)); //Call the handleTileEntityPackets method in CoreMethods, which takes care of the rest.
			
			//Insert the instructions right after the ISTORE opcode (where the TileEntity type variable is declared.).
			teMethodNode.instructions.insertBefore(getTEInsertionPoint(teMethodNode), instructions);
			LogManager.getLogger().info("Successfully patched " + NHPCName + ".");
			return ASMHelper.getBytes(classnode);
	    }
		
		if (name.equals(bakeryName.replace("/", "."))){
			LogManager.getLogger().info("About to patch registerVariantNames() in class ModelBakery (cxh)");
			ClassNode classNode = ASMHelper.getClassNode(clazz);
			MethodNode variantsMethodNode = ASMHelper.getMethodNode(classNode, registerVariantNamesName, "()V");
			
			InsnList instructions = new InsnList();
			
			instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
			instructions.add(new FieldInsnNode(Opcodes.GETFIELD, bakeryName, variantNames, "Ljava/util/Map;"));
			instructions.add(new FieldInsnNode(Opcodes.GETSTATIC, "com/eternaldoom/realmsofchaos/asm/CoreMethods", "variantNames", "Ljava/util/HashMap;"));
			instructions.add(new MethodInsnNode(Opcodes.INVOKEINTERFACE, "java/util/Map", "putAll", "(Ljava/util/Map;)V", true));
			variantsMethodNode.instructions.insertBefore(getVariantsInsertionPoint(variantsMethodNode), instructions);
			LogManager.getLogger().info("Successfully patched " + bakeryName + ".");
			return ASMHelper.getBytes(classNode);
	    }
		
		if (name.equals(renderItemName.replace("/", "."))){
			LogManager.getLogger().info("About to patch func_175049_a() in class RenderItem (cqh)");
			ClassNode classNode = ASMHelper.getClassNode(clazz);
			MethodNode renderMethodNode = ASMHelper.getMethodNode(classNode, itemMethodName, "(L" + itemStackName + ";L" + entityLivingBaseName + ";L" + cameraTransformTypeName + ";)V");
			
			InsnList instructions = new InsnList();
			
			instructions.add(new VarInsnNode(Opcodes.ALOAD, 5));
			instructions.add(new VarInsnNode(Opcodes.ALOAD, 6));
			instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
			instructions.add(new VarInsnNode(Opcodes.ALOAD, 7));
			instructions.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "com/eternaldoom/realmsofchaos/asm/CoreMethods", "getBowTextures", "(L" + entityPlayerName + ";L" + itemName + ";L" + itemStackName + ";L" + modelResourceLocationName + ";)L" + modelResourceLocationName + ";", false));
			instructions.add(new VarInsnNode(Opcodes.ASTORE, 7));
			
			renderMethodNode.instructions.insertBefore(getRenderItemInsertionPoint(renderMethodNode), instructions);
			LogManager.getLogger().info("Successfully patched " + renderItemName + ".");
			return ASMHelper.getBytes(classNode);
	    }
		return clazz;
	}
	
	private AbstractInsnNode getTEInsertionPoint(MethodNode methodNode){
	Iterator<AbstractInsnNode> iterator = methodNode.instructions.iterator();
	AbstractInsnNode returnNode = null;
	
	while (iterator.hasNext()){
		AbstractInsnNode currentNode = iterator.next();
		
		if (currentNode.getOpcode() == Opcodes.ISTORE) returnNode = currentNode.getNext();
	}
	
	if (returnNode != null) return returnNode;
	throw new RuntimeException("Couldn't find the insertion point for handleUpdateTileEntity(S35PacketUpdateTileEntity). Update to the latest version of the mod.");
	}
	
	private AbstractInsnNode getVariantsInsertionPoint(MethodNode methodNode)
    {
		Iterator<AbstractInsnNode> iterator = methodNode.instructions.iterator();
		AbstractInsnNode returnNode = null;
		
		while (iterator.hasNext())
		{
			AbstractInsnNode currentNode = iterator.next();
			
			if (currentNode.getOpcode() == Opcodes.RETURN) returnNode = currentNode;
		}
		
		if (returnNode != null) return returnNode;
		
		throw new RuntimeException("Couldn't find the insertion point for registerVariantsNames(). Update to the latest version of the mod.");
    }
	
	private AbstractInsnNode getRenderItemInsertionPoint(MethodNode methodNode)
    {
		Iterator<AbstractInsnNode> iterator = methodNode.instructions.iterator();
		AbstractInsnNode returnNode = null;
		
		while (iterator.hasNext())
		{
			AbstractInsnNode currentNode = iterator.next();
			
			if (currentNode.getOpcode() == Opcodes.ACONST_NULL) returnNode = currentNode.getNext().getNext();
		}
		
		if (returnNode != null) return returnNode;
		
		throw new RuntimeException("Couldn't find the insertion point for func_175049_a(). Update to the latest version of the mod.");
    }
}