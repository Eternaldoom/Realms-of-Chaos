package com.eternaldoom.realmsofchaos.items;

import com.eternaldoom.realmsofchaos.ROCTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemROCFood extends ItemFood{

	public ItemROCFood(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_, String tex, String name) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        setCreativeTab(ROCTabs.Items);
        setTextureName(tex);
        setUnlocalizedName(name);
	}
	
	public ItemROCFood register(String name){
		GameRegistry.registerItem(this, name);
		return this;
	}
}
