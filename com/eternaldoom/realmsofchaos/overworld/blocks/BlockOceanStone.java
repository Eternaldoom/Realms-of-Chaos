package com.eternaldoom.realmsofchaos.overworld.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockOceanStone extends OverworldBlock{

	public BlockOceanStone() {
		super(Material.rock, "realmsofchaos:ocean_stone", "stoneOcean", 8.5f, 3.5f, soundTypePiston);
		register("ocean_stone");
	}
	
	@Override
	public Item getItemDropped(int par1, Random r, int par3){
		return Item.getItemFromBlock(ROCBlocks.ocean_cobblestone);
	}

}
