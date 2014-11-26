package com.eternaldoom.realmsofchaos.event;

import net.minecraft.item.ItemBow;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.eternaldoom.realmsofchaos.items.ItemROCSword;
import com.eternaldoom.realmsofchaos.items.ItemROCTool;
import com.eternaldoom.realmsofchaos.items.ROCItems;

public class TooltipEvent {
	
	@SubscribeEvent
	public void tooltipEvent(ItemTooltipEvent evt){
		if (evt.itemStack.getItem() instanceof ItemROCSword){
			for(int i = 0; i < evt.toolTip.size(); i++){
				if(evt.toolTip.get(i).contains("Attack Damage") && evt.toolTip.get(i).contains("+")){
					evt.toolTip.remove(i);
					evt.toolTip.remove(i - 1);
				}
			}
		}
		
		if (evt.itemStack.getItem() instanceof ItemROCTool){
			for(int i = 0; i < evt.toolTip.size(); i++){
				if(evt.toolTip.get(i).contains("Attack Damage") && evt.toolTip.get(i).contains("+")){
					evt.toolTip.remove(i);
					evt.toolTip.remove(i - 1);
				}
			}
		}
		
		if (evt.itemStack.getItem() instanceof ItemBow){
			evt.toolTip.add(EnumChatFormatting.GREEN + "" + (evt.itemStack.getMaxDamage() - evt.itemStack.getItemDamage()) + " Uses Remaining");
			evt.toolTip.add(EnumChatFormatting.RED + "" + "2 Minimum Ranged Damage");
		}
		
		if (evt.itemStack.getItem() == ROCItems.mystic_gem){
			evt.toolTip.add(EnumChatFormatting.DARK_AQUA + "Allows higher level");
			evt.toolTip.add(EnumChatFormatting.DARK_AQUA + "ores to be mined.");
		}
	}
}
