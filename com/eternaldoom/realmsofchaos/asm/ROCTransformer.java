package com.eternaldoom.realmsofchaos.asm;

import java.io.IOException;
import java.util.Iterator;

import net.minecraft.launchwrapper.IClassTransformer;
import net.minecraft.launchwrapper.Launch;

import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

public class ROCTransformer implements IClassTransformer
{
	static boolean isObf;
	static String NHPCName;
	static String registerVariantNames;
	static String variantNames;
	static String bakeryName;
	static String handleUpdateTileEntityName;
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
		
		bakeryName = isObf ? "cxh" : "net/minecraft/client/resources/model/ModelBakery";
		registerVariantNames = isObf ? "e" : "registerVariantNames";
		variantNames = isObf ? "u" : "variantNames";
	}
	
	@Override
	public byte[] transform(String name, String transformedName, byte[] clazz) {
		/*if (name.equals(NHPCName.replace("/", "."))){
			ClassNode classnode = CoreUtils.getClassNode(clazz);
			MethodNode teMethodNode = CoreUtils.getMethodNode(classnode, handleUpdateTileEntityName, "(Lnet/minecraft/network/play/server/S35PacketUpdateTileEntity;)V");

			InsnList instructions = new InsnList();

			instructions.add(new VarInsnNode(Opcodes.ALOAD, 2));
			instructions.add(new TypeInsnNode(Opcodes.INSTANCEOF, "com/eternaldoom/realmsofchaos/blocks/TileEntityDisplayCase"));
			Label l7 = new Label();
			instructions.add(new JumpInsnNode(Opcodes.IFNE, new LabelNode(l7)));	
			
			teMethodNode.instructions.insertBefore(getTEInsertionPoint(teMethodNode), instructions);
			return CoreUtils.getBytes(classnode);
	    }*/
		
		if (name.equals(bakeryName.replace("/", "."))){
			ClassNode classNode = CoreUtils.getClassNode(clazz);
			MethodNode variantsMethodNode = CoreUtils.getMethodNode(classNode, registerVariantNames, "()V");
			InsnList instructions = new InsnList();
			instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
			instructions.add(new FieldInsnNode(Opcodes.GETFIELD, bakeryName, variantNames, "Ljava/util/Map;"));
			instructions.add(new FieldInsnNode(Opcodes.GETSTATIC, "com/eternaldoom/realmsofchaos/asm/ModelNames", "variantNames", "Ljava/util/HashMap;"));
			instructions.add(new MethodInsnNode(Opcodes.INVOKEINTERFACE, "java/util/Map", "putAll", "(Ljava/util/Map;)V", true));
			variantsMethodNode.instructions.insertBefore(getVariantsInsertionPoint(variantsMethodNode), instructions);
			return CoreUtils.getBytes(classNode);
	    }
		return clazz;
	}
	
	private AbstractInsnNode getTEInsertionPoint(MethodNode methodNode){
	Iterator<AbstractInsnNode> iterator = methodNode.instructions.iterator();
	AbstractInsnNode returnNode = null;
	
	while (iterator.hasNext()){
		AbstractInsnNode currentNode = iterator.next();
		
		if (currentNode.getOpcode() == Opcodes.INSTANCEOF) returnNode = currentNode.getNext().getNext();
	}
	
	if (returnNode != null) return returnNode;
	throw new RuntimeException("Couldn't find the instruction insertion point.");
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
		
		throw new RuntimeException("Couldb't find the insertion point for registerVariantsNames()");
    }
	
}