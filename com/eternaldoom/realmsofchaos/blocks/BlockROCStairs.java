package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.eternaldoom.realmsofchaos.ROCTabs;

public class BlockROCStairs extends BlockStairs{

	public BlockROCStairs(Block b, IBlockState modelBlockState, String name) {
		super(modelBlockState);
		setUnlocalizedName(name);
		setCreativeTab(ROCTabs.Blocks);
	}

	public BlockROCStairs register(String name){
		GameRegistry.registerBlock(this, name);
		return this;
	}
}
