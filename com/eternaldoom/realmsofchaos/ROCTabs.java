package com.eternaldoom.realmsofchaos;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.eternaldoom.realmsofchaos.overworld.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.overworld.items.ROCOverworldItems;

public class ROCTabs {
	public static final CreativeTabs OverworldBlocks = new CreativeTabs(CreativeTabs.getNextID(), "ROCOverworldBlocks"){
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ROCBlocks.citronite_ore);
		}
	};

	public static final CreativeTabs OverworldItems = new CreativeTabs(CreativeTabs.getNextID(), "ROCOverworldItems"){
		@Override
		public Item getTabIconItem() {
			return ROCOverworldItems.ash_dust;
		}
	};
}
