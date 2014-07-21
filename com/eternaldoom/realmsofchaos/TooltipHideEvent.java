package com.eternaldoom.realmsofchaos;

import net.minecraftforge.event.entity.player.ItemTooltipEvent;

import com.eternaldoom.realmsofchaos.overworld.items.ItemROCSword;
import com.eternaldoom.realmsofchaos.overworld.items.ItemROCTool;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class TooltipHideEvent {
	
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
	}

}
