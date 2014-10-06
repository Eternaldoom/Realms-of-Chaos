package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.eternaldoom.realmsofchaos.ROCTabs;

public class BlockROCStairs extends BlockStairs{

	public BlockROCStairs(Block b, IBlockState modelBlockState, String name) {
		super(modelBlockState);
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.tabBlock);
		this.useNeighborBrightness = true;
	}

	public BlockROCStairs register(String name){
	    ROCBlocks.registerBlock(this, name);
        ROCBlocks.blockNames.add(name);
		return this;
	}
}
