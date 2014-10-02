package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockOceanStone extends ROCModBlock{

	public BlockOceanStone() {
		super(Material.rock, "stoneOcean", 8.5f, 3.5f, soundTypePiston);
		register("ocean_stone");
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random r, int par3){
		return Item.getItemFromBlock(ROCBlocks.ocean_cobblestone);
	}

}
