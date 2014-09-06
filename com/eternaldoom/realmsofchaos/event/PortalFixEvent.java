package com.eternaldoom.realmsofchaos.event;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

import net.minecraftforge.event.entity.player.FillBucketEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PortalFixEvent {
	
	@SubscribeEvent
	public void stopBucket(FillBucketEvent evt){
		if(evt.world.getBlock(evt.target.blockX, evt.target.blockY, evt.target.blockZ) == ROCBlocks.water_portal)evt.setCanceled(true);
	}

}
