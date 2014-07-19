package com.eternaldoom.realmsofchaos.overworld.items;

import net.minecraft.item.ItemHoe;

import com.eternaldoom.realmsofchaos.ROCTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemROCHoe extends ItemHoe
{

	public ItemROCHoe(ToolMaterial par1)
	{
		super(par1);
		setCreativeTab(ROCTabs.Tools);
	}
	
	public ItemROCHoe register(String name){
		GameRegistry.registerItem(this, name);
		return this;
	}
}
