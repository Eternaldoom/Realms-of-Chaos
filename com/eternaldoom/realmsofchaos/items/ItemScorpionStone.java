package com.eternaldoom.realmsofchaos.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemScorpionStone extends ROCModItem{

	public static boolean isActive;
	
	public ItemScorpionStone(boolean active) {
		super("realmsofchaos:scorpion_stone", "stoneScorpion");
		setMaxStackSize(1);
		isActive = active;
		setMaxDamage(160);
	}
	
	@Override
	public boolean hasEffect(ItemStack par1ItemStack, int pass){
		if (this == ROCItems.scorpion_stone_active) return true;
		return false;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
		
        if (this == ROCItems.scorpion_stone) return new ItemStack(ROCItems.scorpion_stone_active, 1, stack.getItemDamage());
        else return new ItemStack(ROCItems.scorpion_stone, 1, stack.getItemDamage());
    }
}
