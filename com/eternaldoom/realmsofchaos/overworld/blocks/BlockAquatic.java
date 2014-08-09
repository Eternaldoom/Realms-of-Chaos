package com.eternaldoom.realmsofchaos.overworld.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BlockAquatic extends ROCModBlock {

	public BlockAquatic() {
		super(Material.glass, "realmsofchaos:aquatic_block", "blockAquatic",
				15f, 12f, soundTypeGlass);
	}

	@Override
	public int onBlockPlaced(World world, int i, int j, int k, int p_149660_5_,
			float p_149660_6_, float p_149660_7_, float p_149660_8_,
			int p_149660_9_) {
		if (world.getBlock(i, j - 1, k) == ROCBlocks.compressed_lava
				&& world.getBlock(i, j - 2, k) == ROCBlocks.compressed_lava
				&& world.getBlock(i, j - 3, k) == ROCBlocks.compressed_lava
				&& world.getBlock(i, j - 4, k) == ROCBlocks.compressed_lava
				&& world.getBlock(i+1, j - 1, k) == Blocks.ice
				&& world.getBlock(i+1, j - 2, k) == Blocks.ice
				&& world.getBlock(i+1, j - 3, k) == Blocks.ice
				&& world.getBlock(i+1, j - 4, k) == Blocks.ice
				&& world.getBlock(i-1, j - 1, k) == Blocks.ice
				&& world.getBlock(i-1, j - 2, k) == Blocks.ice
				&& world.getBlock(i-1, j - 3, k) == Blocks.ice
				&& world.getBlock(i-1, j - 4, k) == Blocks.ice
				&& world.getBlock(i, j - 1, k+1) == Blocks.ice
				&& world.getBlock(i, j - 2, k+1) == Blocks.ice
				&& world.getBlock(i, j - 3, k+1) == Blocks.ice
				&& world.getBlock(i, j - 4, k+1) == Blocks.ice
				&& world.getBlock(i, j - 1, k-1) == Blocks.ice
				&& world.getBlock(i, j - 2, k-1) == Blocks.ice
				&& world.getBlock(i, j - 3, k-1) == Blocks.ice
				&& world.getBlock(i, j - 4, k-1) == Blocks.ice) {
			world.scheduleBlockUpdate(i, j, k, this, 4);
			world.setBlock(i, j-1, k, ROCBlocks.ice_portal);
			world.setBlock(i, j-2, k, ROCBlocks.ice_portal);
			world.setBlock(i, j-3, k, ROCBlocks.ice_portal);
			world.setBlock(i, j-4, k, ROCBlocks.ice_portal);
			world.setBlock(i, j-5, k, Blocks.packed_ice);
			world.setBlock(i+1, j, k, Blocks.packed_ice);
			world.setBlock(i-1, j, k, Blocks.packed_ice);
			world.setBlock(i, j, k-1, Blocks.packed_ice);
			world.setBlock(i, j, k+1, Blocks.packed_ice);
			world.setBlock(i+1, j-4, k, Blocks.packed_ice);
			world.setBlock(i-1, j-4, k, Blocks.packed_ice);
			world.setBlock(i, j-4, k-1, Blocks.packed_ice);
			world.setBlock(i, j-4, k+1, Blocks.packed_ice);
			world.setBlock(i+1, j-1, k, Blocks.air);
			world.setBlock(i+1, j-2, k, Blocks.air);
			world.setBlock(i+1, j-3, k, Blocks.air);
			world.setBlock(i-1, j-1, k, Blocks.air);
			world.setBlock(i-1, j-2, k, Blocks.air);
			world.setBlock(i-1, j-3, k, Blocks.air);
			world.setBlock(i, j-1, k+1, Blocks.air);
			world.setBlock(i, j-2, k+1, Blocks.air);
			world.setBlock(i, j-3, k+1, Blocks.air);
			world.setBlock(i, j-1, k-1, Blocks.air);
			world.setBlock(i, j-2, k-1, Blocks.air);
			world.setBlock(i, j-3, k-1, Blocks.air);
		}

		return p_149660_9_;
	}
	
	@Override
	public void updateTick(World world, int i, int j, int k, Random p_149674_5_) {
		world.setBlock(i, j, k, Blocks.packed_ice);
	}
}
