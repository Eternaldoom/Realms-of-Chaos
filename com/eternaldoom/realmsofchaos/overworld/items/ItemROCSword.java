package com.eternaldoom.realmsofchaos.overworld.items;

import java.util.List;

import com.eternaldoom.realmsofchaos.ROCTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemROCSword extends ItemSword{
	
    public ItemROCSword(ToolMaterial par2EnumToolMaterial, String tex, String name, boolean isVanilla) {
		super(par2EnumToolMaterial);
		setTextureName(tex);
		setUnlocalizedName(name);
		if (!isVanilla) setCreativeTab(ROCTabs.Combat); else setCreativeTab(null);
	}

	@Override
	public boolean isItemTool(ItemStack par1ItemStack) {
		return true;
	}

	@Override
	public void addInformation(ItemStack item, EntityPlayer player, List infoList, boolean par4) {
		if(item.getMaxDamage() == -1) {
			infoList.add("Infinite Uses");
		}
		else {
			infoList.add(item.getMaxDamage() - item.getItemDamage() + " Uses Remaining");
		}
	}
	
	public ItemROCSword register(String name){
		GameRegistry.registerItem(this, name);
		return this;
	}
}