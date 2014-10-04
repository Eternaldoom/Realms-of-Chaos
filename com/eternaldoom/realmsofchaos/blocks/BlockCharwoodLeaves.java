package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.eternaldoom.realmsofchaos.items.ROCItems;

public class BlockCharwoodLeaves extends BlockROCLeaves {

	public BlockCharwoodLeaves() {
		super(Material.cloth, "leavesCharwood", 0.0f, 5.0f, ROCModBlock.soundTypeCloth);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3) {

		int dropChance = rand.nextInt(40);
		if (dropChance == 10 || dropChance == 20) {
			return ROCItems.ash_dust;
		}
		
		if (dropChance == 30){
			return Item.getItemFromBlock(ROCBlocks.charwood_sapling);
		}
		
		return Item.getItemFromBlock(Blocks.air);

	}
}
