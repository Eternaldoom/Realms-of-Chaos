package com.eternaldoom.realmsofchaos.items;

import com.eternaldoom.realmsofchaos.ROCTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ROCModItem extends Item{
	
	public ROCModItem(String tex, String name){
		super();
		setTextureName(tex);
		setUnlocalizedName(name);
		setCreativeTab(ROCTabs.OverworldItems);
	}

	public ROCModItem register(String name){
		GameRegistry.registerItem(this, name);
		return this;
	}
}
