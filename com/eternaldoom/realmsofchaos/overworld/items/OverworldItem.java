package com.eternaldoom.realmsofchaos.overworld.items;

import com.eternaldoom.realmsofchaos.ROCTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class OverworldItem extends Item{
	
	public OverworldItem(String tex, String name){
		super();
		setTextureName(tex);
		setUnlocalizedName(name);
		setCreativeTab(ROCTabs.OverworldItems);
	}

	public void register(String name){
		GameRegistry.registerItem(this, name);
	}
}
