package com.eternaldoom.realmsofchaos.blocks;

import com.eternaldoom.realmsofchaos.ROCTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class BlockROCStairs extends BlockStairs{

	public BlockROCStairs(Block b, int meta, String name) {
		super(b, meta);
		setBlockName(name);
		setCreativeTab(ROCTabs.Blocks);
	}

	public BlockROCStairs register(String name){
		GameRegistry.registerBlock(this, name);
		return this;
	}
}
