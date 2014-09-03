package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import com.eternaldoom.realmsofchaos.items.ROCItems;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockCharwoodLeaves extends BlockROCLeaves {

	public BlockCharwoodLeaves() {
		super(Material.cloth, "realmsofchaos:charwood_leaves", "leavesCharwood", 0.0f, 5.0f, ROCModBlock.soundTypeCloth);
	}
	

	@Override
	public Item getItemDropped(int par1, Random rand, int par3) {

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
