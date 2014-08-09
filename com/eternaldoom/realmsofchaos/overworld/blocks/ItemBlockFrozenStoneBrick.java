package com.eternaldoom.realmsofchaos.overworld.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockFrozenStoneBrick extends ItemBlock {
	public ItemBlockFrozenStoneBrick(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "";
		switch (itemstack.getItemDamage()) {
		case 0: {
			name = "";
			break;
		}
		case 1: {
			name = "Cracked";
			break;
		}
		case 2:
			name = "Carved";
		}
		return getUnlocalizedName() + name;
	}

	@Override
	public int getMetadata(int par1) {
		return par1;
	}
}