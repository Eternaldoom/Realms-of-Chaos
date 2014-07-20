package com.eternaldoom.realmsofchaos.client;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class ROCKeyBindings {
	
	public static KeyBinding lavaMove;
	
	public static void init(){
		lavaMove = new KeyBinding("key.lavamove", Keyboard.KEY_W, "key.categories.movement");
		
		ClientRegistry.registerKeyBinding(lavaMove);
	}

}
