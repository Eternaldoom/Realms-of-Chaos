package com.eternaldoom.realmsofchaos.event;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

import com.eternaldoom.realmsofchaos.client.ROCKeyBindings;

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
