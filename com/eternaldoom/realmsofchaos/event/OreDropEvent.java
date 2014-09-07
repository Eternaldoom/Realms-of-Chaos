package com.eternaldoom.realmsofchaos.event;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.items.ROCItems;

import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class OreDropEvent {
	
	@SubscribeEvent
	public void oreDrop(HarvestDropsEvent evt){
		if(evt.block == ROCBlocks.neptunite_ore || evt.block == ROCBlocks.osmaralt_ore || evt.block == ROCBlocks.fractonite_ore){
			if(!evt.harvester.inventory.hasItem(ROCItems.mystic_gem))evt.drops.clear();
		}
	}
}
