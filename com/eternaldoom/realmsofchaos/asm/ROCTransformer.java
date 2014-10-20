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
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class ROCTransformer implements IClassTransformer
{
	private static boolean isObf;
	
	private boolean foundOnce = false;
	
	private static String NHPCName;
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
	private static String iBlockStateName;
	private static String blockModelShapesName;
	private static String getTextureName;
	private static String textureAtlasSpriteName;
		
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
		
		renderItemName = isObf ? "cqh" : "net/minecraft/client/renderer/entity/RenderItem";
		itemMethodName = isObf ? "a" : "getModelNameFromUseState";
		itemName = isObf ? "alq" : "net/minecraft/item/Item";
		entityPlayerName = isObf ? "ahd" : "net/minecraft/entity/player/EntityPlayer";
		itemStackName = isObf ? "amj" : "net/minecraft/item/ItemStack";
		modelResourceLocationName = isObf ? "cxl" : "net/minecraft/client/resources/model/ModelResourceLocation";
		entityLivingBaseName = isObf ? "xm" : "net/minecraft/entity/EntityLivingBase";
		cameraTransformTypeName = isObf ? "cmz" : "net/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType";
		
		iBlockStateName = isObf ? "bec" : "net/minecraft/block/state/IBlockState";
		blockModelShapesName = isObf ? "clc" : "net/minecraft/client/renderer/BlockModelShapes";
		getTextureName = isObf ? "a" : "getTexture";
		textureAtlasSpriteName = isObf ? "cue" : "net/minecraft/client/renderer/texture/TextureAtlasSprite";
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
		
		if (name.equals(renderItemName.replace("/", "."))){
			LogManager.getLogger().info("About to patch getModelNameFromUseState() in class RenderItem (cqh)");
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
		
		if (name.equals(blockModelShapesName.replace("/", "."))){
			LogManager.getLogger().info("About to patch getTexture() in class BlockModelShapes (clc)");
			ClassNode classNode = ASMHelper.getClassNode(clazz);
			MethodNode renderMethodNode = ASMHelper.getMethodNode(classNode, getTextureName, "(L" + iBlockStateName + ";)L" + textureAtlasSpriteName + ";");
			
			InsnList instructions = new InsnList();
			
			instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
			instructions.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "com/eternaldoom/realmsofchaos/asm/CoreMethods", "getTexture", "(L" + iBlockStateName + ";)L" + textureAtlasSpriteName + ";", false));
			instructions.add(new InsnNode(Opcodes.ARETURN));
			
			renderMethodNode.instructions.insertBefore(getBlockModelShapesInsertionPoint(renderMethodNode), instructions);
			LogManager.getLogger().info("Successfully patched " + blockModelShapesName + ".");
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
		
		throw new RuntimeException("Couldn't find the insertion point for getModelNameFromUseState(). Update to the latest version of the mod.");
    }
	
	private AbstractInsnNode getBlockModelShapesInsertionPoint(MethodNode methodNode)
    {
		Iterator<AbstractInsnNode> iterator = methodNode.instructions.iterator();
		AbstractInsnNode returnNode = null;
		
		while (iterator.hasNext())
		{
			AbstractInsnNode currentNode = iterator.next();
			
			if (currentNode.getOpcode() == Opcodes.INVOKEINTERFACE && !foundOnce) foundOnce = true;
			if (currentNode.getOpcode() == Opcodes.INVOKEINTERFACE && foundOnce)returnNode = currentNode.getPrevious();
		}
		
		if (returnNode != null) return returnNode;
		
		throw new RuntimeException("Couldn't find the insertion point for getTexture(). Update to the latest version of the mod.");
    }
}