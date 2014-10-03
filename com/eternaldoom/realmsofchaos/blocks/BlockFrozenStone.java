package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockFrozenStone extends ROCModBlock{

	public BlockFrozenStone() {
		super(Material.rock, "stoneFrozen", 18f, 0f,soundTypePiston);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3){
		return Item.getItemFromBlock(ROCBlocks.frozen_cobblestone);
	}
}
