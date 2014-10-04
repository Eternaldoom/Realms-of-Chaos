package com.eternaldoom.realmsofchaos.items;

import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.eternaldoom.realmsofchaos.ROCTabs;

public class ItemROCHoe extends ItemHoe
{

	public ItemROCHoe(ToolMaterial par1)
	{
		super(par1);
		setCreativeTab(ROCTabs.Tools);
	}
	
	public ItemROCHoe register(String name){
		GameRegistry.registerItem(this, name);
		ROCItems.itemNames.add(name);
		return this;
	}
}
