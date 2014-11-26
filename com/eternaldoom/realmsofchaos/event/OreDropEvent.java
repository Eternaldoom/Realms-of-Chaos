package com.eternaldoom.realmsofchaos.event;

import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.items.ROCItems;

public class OreDropEvent {
	
	@SubscribeEvent
	public void oreDrop(HarvestDropsEvent evt){
		if(evt.state.getBlock() == ROCBlocks.neptunite_ore || evt.state.getBlock() == ROCBlocks.osmaralt_ore || evt.state.getBlock() == ROCBlocks.fractonite_ore){
			if(!evt.harvester.inventory.hasItem(ROCItems.mystic_gem))evt.drops.clear();
		}
	}
}
