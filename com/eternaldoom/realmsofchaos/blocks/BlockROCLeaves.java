package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockROCLeaves extends ROCModBlock {

	public BlockROCLeaves(Material mat, String name, float hard, float resist, SoundType sound) {
		super(mat, name, hard, resist, sound);
		setLightOpacity(1);
		setTickRandomly(true);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess world, BlockPos pos, EnumFacing side) {
		return true;
	}
	
	@Override
	public int quantityDropped(Random rand){
		int dropCount = rand.nextInt(4) + 1;
		return dropCount;
	}

}
