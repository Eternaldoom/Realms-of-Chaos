package com.eternaldoom.realmsofchaos.gen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;
import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

public class WorldGenCharwoodTree {

	public boolean generate(World world, Random rand, BlockPos pos) {
		
		int i = pos.getX(), j = pos.getY(), k = pos.getZ();
		
		if (RealmsOfChaos.getBlock(world, i + 2, j - 1, k + 2, pos) == Blocks.netherrack
				&& RealmsOfChaos.getBlock(world, i + 3, j, k + 2, pos) == Blocks.air
				&& RealmsOfChaos.getBlock(world, i, j + 5, k, pos) == Blocks.air
				&& RealmsOfChaos.getBlock(world, i + 3, j + 5, k + 3, pos) == Blocks.air
				&& RealmsOfChaos.getBlock(world, i - 3, j + 5, k + 3, pos) == Blocks.air
				&& RealmsOfChaos.getBlock(world, i + 3, j + 5, k - 3, pos) == Blocks.air
				&& RealmsOfChaos.getBlock(world, i - 3, j + 5, k - 3, pos) == Blocks.air) {
			RealmsOfChaos.setBlock(world, i + 0, j + 2, k + 1, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 0, j + 2, k + 3, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 1, k + 2, pos, ROCBlocks.charwood_log);
			RealmsOfChaos.setBlock(world, i + 1, j + 2, k + 0, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 2, k + 1, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 2, k + 2, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 2, k + 3, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 2, k + 4, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 3, k + 1, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 3, k + 3, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 0, k + 2, pos, ROCBlocks.charwood_log);
			RealmsOfChaos.setBlock(world, i + 2, j + 1, k + 1, pos, ROCBlocks.charwood_log);
			RealmsOfChaos.setBlock(world, i + 2, j + 1, k + 2, pos, ROCBlocks.charwood_log);
			RealmsOfChaos.setBlock(world, i + 2, j + 1, k + 3, pos, ROCBlocks.charwood_log);
			RealmsOfChaos.setBlock(world, i + 2, j + 2, k + 1, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 2, k + 2, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 2, k + 3, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 3, k + 2, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 4, k + 2, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 1, k + 2, pos, ROCBlocks.charwood_log);
			RealmsOfChaos.setBlock(world, i + 3, j + 2, k + 0, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 2, k + 1, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 2, k + 2, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 2, k + 3, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 2, k + 4, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 3, k + 1, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 3, k + 3, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 2, k + 1, pos, ROCBlocks.charwood_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 2, k + 3, pos, ROCBlocks.charwood_leaves);
		}

		return true;
	}
}
