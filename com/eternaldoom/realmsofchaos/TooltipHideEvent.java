package com.eternaldoom.realmsofchaos;

import net.minecraftforge.event.entity.player.ItemTooltipEvent;

import com.eternaldoom.realmsofchaos.overworld.items.ItemROCSword;
import com.eternaldoom.realmsofchaos.overworld.items.ItemROCTool;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class TooltipHideEvent {
	
	@SubscribeEvent
	public void tooltipEvent(ItemTooltipEvent evt){
		if (evt.itemStack.getItem() instanceof ItemROCSword){
		evt.toolTip.remove(4);
		evt.toolTip.remove(3);
		}
		
		if (evt.itemStack.getItem() instanceof ItemROCTool){
			evt.toolTip.remove(5);
			evt.toolTip.remove(4);
		}
	}

}
