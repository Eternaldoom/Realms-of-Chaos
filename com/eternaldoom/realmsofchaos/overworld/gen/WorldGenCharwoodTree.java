package com.eternaldoom.realmsofchaos.overworld.gen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

public class WorldGenCharwoodTree {

	public WorldGenCharwoodTree() {
	}

	public boolean generate(World world, Random rand, int i, int j, int k) {
		if (world.getBlock(i + 2, j - 1, k + 2) == Blocks.netherrack
				&& world.getBlock(i + 3, j, k + 2) == Blocks.air
				&& world.getBlock(i, j + 5, k) == Blocks.air
				&& world.getBlock(i + 3, j + 5, k + 3) == Blocks.air
				&& world.getBlock(i - 3, j + 5, k + 3) == Blocks.air
				&& world.getBlock(i + 3, j + 5, k - 3) == Blocks.air
				&& world.getBlock(i - 3, j + 5, k - 3) == Blocks.air) {
			world.setBlock(i + 0, j + 2, k + 1, ROCBlocks.charwood_leaves);
			world.setBlock(i + 0, j + 2, k + 3, ROCBlocks.charwood_leaves);
			world.setBlock(i + 1, j + 1, k + 2, ROCBlocks.charwood_log);
			world.setBlock(i + 1, j + 2, k + 0, ROCBlocks.charwood_leaves);
			world.setBlock(i + 1, j + 2, k + 1, ROCBlocks.charwood_leaves);
			world.setBlock(i + 1, j + 2, k + 2, ROCBlocks.charwood_leaves);
			world.setBlock(i + 1, j + 2, k + 3, ROCBlocks.charwood_leaves);
			world.setBlock(i + 1, j + 2, k + 4, ROCBlocks.charwood_leaves);
			world.setBlock(i + 1, j + 3, k + 1, ROCBlocks.charwood_leaves);
			world.setBlock(i + 1, j + 3, k + 3, ROCBlocks.charwood_leaves);
			world.setBlock(i + 2, j + 0, k + 2, ROCBlocks.charwood_log);
			world.setBlock(i + 2, j + 1, k + 1, ROCBlocks.charwood_log);
			world.setBlock(i + 2, j + 1, k + 2, ROCBlocks.charwood_log);
			world.setBlock(i + 2, j + 1, k + 3, ROCBlocks.charwood_log);
			world.setBlock(i + 2, j + 2, k + 1, ROCBlocks.charwood_leaves);
			world.setBlock(i + 2, j + 2, k + 2, ROCBlocks.charwood_leaves);
			world.setBlock(i + 2, j + 2, k + 3, ROCBlocks.charwood_leaves);
			world.setBlock(i + 2, j + 3, k + 2, ROCBlocks.charwood_leaves);
			world.setBlock(i + 2, j + 4, k + 2, ROCBlocks.charwood_leaves);
			world.setBlock(i + 3, j + 1, k + 2, ROCBlocks.charwood_log);
			world.setBlock(i + 3, j + 2, k + 0, ROCBlocks.charwood_leaves);
			world.setBlock(i + 3, j + 2, k + 1, ROCBlocks.charwood_leaves);
			world.setBlock(i + 3, j + 2, k + 2, ROCBlocks.charwood_leaves);
			world.setBlock(i + 3, j + 2, k + 3, ROCBlocks.charwood_leaves);
			world.setBlock(i + 3, j + 2, k + 4, ROCBlocks.charwood_leaves);
			world.setBlock(i + 3, j + 3, k + 1, ROCBlocks.charwood_leaves);
			world.setBlock(i + 3, j + 3, k + 3, ROCBlocks.charwood_leaves);
			world.setBlock(i + 4, j + 2, k + 1, ROCBlocks.charwood_leaves);
			world.setBlock(i + 4, j + 2, k + 3, ROCBlocks.charwood_leaves);
		}

		return true;
	}
}
