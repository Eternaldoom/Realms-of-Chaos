package com.eternaldoom.realmsofchaos;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.items.ROCItems;

public class ROCTabs {
	public static final CreativeTabs OverworldBlocks = new CreativeTabs(CreativeTabs.getNextID(), "ROCOverworldBlocks"){
		@Override
		public Item getTabIconItem(){
			return Item.getItemFromBlock(ROCBlocks.citronite_ore);
		}
	};

	public static final CreativeTabs OverworldItems = new CreativeTabs(CreativeTabs.getNextID(), "ROCOverworldItems"){
		@Override
		public Item getTabIconItem(){
			return ROCItems.ash_dust;
		}
	};
	
	public static final CreativeTabs Combat = new CreativeTabs(CreativeTabs.getNextID(), "ROCCombat"){
		@Override
		public Item getTabIconItem(){
			return ROCItems.heliotrope_helmet;
		}
	};
	
	public static final CreativeTabs Tools = new CreativeTabs(CreativeTabs.getNextID(), "ROCTools"){
		@Override
		public Item getTabIconItem(){
			return ROCItems.xylite_pickaxe;
		}
	};
}
