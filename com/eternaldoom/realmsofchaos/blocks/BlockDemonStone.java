package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockDemonStone extends ROCModBlock{

	public BlockDemonStone() {
		super(Material.rock, "stoneDemon", 22f, 8f, soundTypePiston);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3){
		return Item.getItemFromBlock(ROCBlocks.demon_cobblestone);
	}

}
