package com.eternaldoom.realmsofchaos.event;

import net.minecraft.util.BlockPos;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

public class PortalFixEvent {
	
	@SubscribeEvent
	public void stopBucket(FillBucketEvent evt){
		if(evt.world.getBlockState(new BlockPos(evt.target.hitVec)) == ROCBlocks.water_portal)evt.setCanceled(true);
	}

}
