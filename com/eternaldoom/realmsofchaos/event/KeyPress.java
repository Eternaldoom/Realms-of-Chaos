package com.eternaldoom.realmsofchaos.event;

import com.eternaldoom.realmsofchaos.client.ROCKeyBindings;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyPress {
	
	private static boolean freeze = false;
	
	@SubscribeEvent
	public void onKeyPressed(KeyInputEvent evt){
		if(ROCKeyBindings.freeze.isPressed()){
			freeze = true;
		}else{
			freeze = false;
		}
	}
	
	public static boolean getFreeze(){
		return freeze;
	}

}
