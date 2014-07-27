package com.eternaldoom.realmsofchaos;

import net.minecraft.init.Blocks;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.RenderBlockOverlayEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class OverlayEvent {
	
	@SubscribeEvent
	public void addOverlay(RenderBlockOverlayEvent evt){
		if(evt.overlayType == evt.overlayType.WATER && ArmorBonusEvent.getAquatic()){
			evt.setCanceled(true);
		}
	}

	@SubscribeEvent
	public void fogColors(EntityViewRenderEvent.FogColors evt){
		if (evt.block == Blocks.water && ArmorBonusEvent.getAquatic()){
			evt.red = 0.6f;
			evt.green = 0.6f;
			evt.blue = 0.7f;
		}
	}
}