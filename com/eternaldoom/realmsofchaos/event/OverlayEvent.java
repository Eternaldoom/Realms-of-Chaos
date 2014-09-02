package com.eternaldoom.realmsofchaos.event;

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
		else if (evt.overlayType == evt.overlayType.FIRE && ArmorBonusEvent.hasFlamestone){
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
	
	@SubscribeEvent
	public void fogDensity(EntityViewRenderEvent.FogDensity evt){
		if (evt.block == Blocks.lava && ArmorBonusEvent.getFlamestone()){
			evt.density = 0.1f;
			evt.setCanceled(true);
		}
		else if (evt.block == Blocks.water && ArmorBonusEvent.getAquatic()){
			evt.density = 0.1f;
			evt.setCanceled(true);
		}else{
			evt.density = 2;
			evt.setCanceled(false);
		}
	}
}