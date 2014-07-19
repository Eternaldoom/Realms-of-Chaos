package com.eternaldoom.realmsofchaos;

import net.minecraft.init.Items;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemReplaceEvent {
	
	@SubscribeEvent
	public void onTickEvent(PlayerTickEvent evt){
			/*for (int i = 0; i < 35; i++){
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.diamond_sword){
					System.out.println(i);
				}
					//evt.player.inventory.consumeInventoryItem(Items.diamond_sword);
					//evt.player.inventory.setInventorySlotContents(i, new ItemStack(Items.diamond));
				//}
		}*/
		
	}

}
