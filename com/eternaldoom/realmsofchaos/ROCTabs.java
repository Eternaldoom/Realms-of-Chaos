package com.eternaldoom.realmsofchaos;

import com.eternaldoom.realmsofchaos.overworld.blocks.ROCBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ROCTabs {
	public static final CreativeTabs ROCOverworldBlocks = new CreativeTabs(CreativeTabs.getNextID(), "ROCOverworldBlocks"){
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ROCBlocks.citronite_ore);
		}
	};

}
