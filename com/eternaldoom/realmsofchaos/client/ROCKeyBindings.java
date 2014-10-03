package com.eternaldoom.realmsofchaos.client;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

import org.lwjgl.input.Keyboard;

public class ROCKeyBindings {
	
	public static KeyBinding freeze;
	
	public static void init(){
		freeze = new KeyBinding("key.freeze", Keyboard.KEY_F, "key.categories.movement");

		ClientRegistry.registerKeyBinding(freeze);
	}

}
