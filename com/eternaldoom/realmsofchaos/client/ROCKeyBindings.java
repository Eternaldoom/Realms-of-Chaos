package com.eternaldoom.realmsofchaos.client;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class ROCKeyBindings {
	
	public static KeyBinding freeze;
	
	public static void init(){
		freeze = new KeyBinding("key.freeze", Keyboard.KEY_F, "key.categories.movement");

		ClientRegistry.registerKeyBinding(freeze);
	}

}
