package com.eternaldoom.realmsofchaos;

import net.minecraft.init.Blocks;
import net.minecraftforge.client.event.RenderBlockOverlayEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class OverlayEvent {
	
	@SubscribeEvent
	public void addOverlay(RenderBlockOverlayEvent evt){
		if(evt.overlayType == evt.overlayType.WATER && ArmorBonusEvent.getAquatic()){
			System.out.println(ArmorBonusEvent.getAquatic());
			evt.setCanceled(true);
		}
	}

}