package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;

public class BlockAquatic extends ROCModBlock {

	public BlockAquatic() {
		super(Material.glass, "blockAquatic", 15f, 12f, soundTypeGlass);
	}

	@Override
	public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){
		int i = pos.getX(), j = pos.getY(), k = pos.getZ();
		if (RealmsOfChaos.getBlock(world, i, j - 1, k, pos) == ROCBlocks.compressed_lava
				&& RealmsOfChaos.getBlock(world, i, j - 2, k, pos) == ROCBlocks.compressed_lava
				&& RealmsOfChaos.getBlock(world, i, j - 3, k, pos) == ROCBlocks.compressed_lava
				&& RealmsOfChaos.getBlock(world, i, j - 4, k, pos) == ROCBlocks.compressed_lava
				&& RealmsOfChaos.getBlock(world, i+1, j - 1, k, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i+1, j - 2, k, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i+1, j - 3, k, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i+1, j - 4, k, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i-1, j - 1, k, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i-1, j - 2, k, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i-1, j - 3, k, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i-1, j - 4, k, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i, j - 1, k+1, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i, j - 2, k+1, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i, j - 3, k+1, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i, j - 4, k+1, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i, j - 1, k-1, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i, j - 2, k-1, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i, j - 3, k-1, pos) == Blocks.ice
				&& RealmsOfChaos.getBlock(world, i, j - 4, k-1, pos) == Blocks.ice) {
			world.scheduleUpdate(pos, this, 4);
			RealmsOfChaos.setBlock(world, i, j-1, k, pos, ROCBlocks.ice_portal);
			RealmsOfChaos.setBlock(world, i, j-2, k, pos, ROCBlocks.ice_portal);
			RealmsOfChaos.setBlock(world, i, j-3, k, pos, ROCBlocks.ice_portal);
			RealmsOfChaos.setBlock(world, i, j-4, k, pos, ROCBlocks.ice_portal);
			RealmsOfChaos.setBlock(world, i, j-5, k, pos, Blocks.packed_ice);
			RealmsOfChaos.setBlock(world, i+1, j, k, pos, Blocks.packed_ice);
			RealmsOfChaos.setBlock(world, i-1, j, k, pos, Blocks.packed_ice);
			RealmsOfChaos.setBlock(world, i, j, k-1, pos, Blocks.packed_ice);
			RealmsOfChaos.setBlock(world, i, j, k+1, pos, Blocks.packed_ice);
			RealmsOfChaos.setBlock(world, i+1, j-4, k, pos, Blocks.packed_ice);
			RealmsOfChaos.setBlock(world, i-1, j-4, k, pos, Blocks.packed_ice);
			RealmsOfChaos.setBlock(world, i, j-4, k-1, pos, Blocks.packed_ice);
			RealmsOfChaos.setBlock(world, i, j-4, k+1, pos, Blocks.packed_ice);
			RealmsOfChaos.setBlock(world, i+1, j-1, k, pos, Blocks.air);
			RealmsOfChaos.setBlock(world, i+1, j-2, k, pos, Blocks.air);
			RealmsOfChaos.setBlock(world, i+1, j-3, k, pos, Blocks.air);
			RealmsOfChaos.setBlock(world, i-1, j-1, k, pos, Blocks.air);
			RealmsOfChaos.setBlock(world, i-1, j-2, k, pos, Blocks.air);
			RealmsOfChaos.setBlock(world, i-1, j-3, k, pos, Blocks.air);
			RealmsOfChaos.setBlock(world, i, j-1, k+1, pos, Blocks.air);
			RealmsOfChaos.setBlock(world, i, j-2, k+1, pos, Blocks.air);
			RealmsOfChaos.setBlock(world, i, j-3, k+1, pos, Blocks.air);
			RealmsOfChaos.setBlock(world, i, j-1, k-1, pos, Blocks.air);
			RealmsOfChaos.setBlock(world, i, j-2, k-1, pos, Blocks.air);
			RealmsOfChaos.setBlock(world, i, j-3, k-1, pos, Blocks.air);
		}

		return this.getStateFromMeta(meta);
	}
	
	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random p_149674_5_) {
		world.setBlockState(pos, Blocks.packed_ice.getDefaultState());
	}
	
}
