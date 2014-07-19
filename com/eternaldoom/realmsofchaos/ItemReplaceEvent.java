package com.eternaldoom.realmsofchaos;

import com.eternaldoom.realmsofchaos.overworld.items.ROCOverworldItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class ItemReplaceEvent {
	
	@SubscribeEvent
	public void onTickEvent(PlayerTickEvent evt){
			for (int i = 0; i < 35; i++){
				if (evt.player.inventory.getStackInSlot(i) != null){
					if(evt.player.inventory.getStackInSlot(i).getItem() == Items.diamond_sword){
						evt.player.inventory.consumeInventoryItem(Items.diamond_sword);
						evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCOverworldItems.diamond_sword));
					}
				}
					
		}
		
	}

}
