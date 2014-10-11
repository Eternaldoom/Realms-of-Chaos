package com.eternaldoom.realmsofchaos.asm;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public class ASMHelper
{
	public static ClassNode getClassNode(byte[] classBytes)
	{
		ClassReader reader = new ClassReader(classBytes);
		ClassNode node = new ClassNode();
		reader.accept(node, 0);
		
		return node;
	}
	
	public static byte[] getBytes(ClassNode classNode)
	{
		ClassWriter writer = new ClassWriter(0);
		classNode.accept(writer);
		
		return writer.toByteArray();
	}
	
	public static MethodNode getMethodNode(ClassNode classNode, String methodName, String desc)
	{
		for (MethodNode method : classNode.methods)
		{
			if (method.name.equals(methodName) && method.desc.equals(desc)) return method;
		}
		
		throw new RuntimeException(methodName + " doesn't exist in " + classNode.name + "!");
	}
}