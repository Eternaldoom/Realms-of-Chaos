package com.eternaldoom.realmsofchaos.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.eternaldoom.realmsofchaos.ROCTabs;

public class ROCModItem extends Item{
	
	public ROCModItem(String name){
		super();
		setUnlocalizedName(name);
		setCreativeTab(null);
	}

	public ROCModItem register(String name){
		GameRegistry.registerItem(this, name);
		ROCItems.itemList.add(name);
		return this;
	}
}
