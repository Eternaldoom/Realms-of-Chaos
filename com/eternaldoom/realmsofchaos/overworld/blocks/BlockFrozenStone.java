package com.eternaldoom.realmsofchaos.overworld.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockFrozenStone extends OverworldBlock{

	public BlockFrozenStone() {
		super(Material.rock, "realmsofchaos:frozen_stone", "stoneFrozen", 18f, 0f,soundTypePiston);
	}

	@Override
	public Item getItemDropped(int par1, Random rand, int par3){
		return Item.getItemFromBlock(ROCBlocks.frozen_cobblestone);
	}
}
