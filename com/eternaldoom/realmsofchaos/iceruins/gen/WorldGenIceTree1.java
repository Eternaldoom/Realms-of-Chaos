/*
 *** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
 */
//edit: kinda sorta
package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;
import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

public class WorldGenIceTree1 extends WorldGenerator {
	public WorldGenIceTree1() {
	}

	public boolean generate(World world, Random rand, BlockPos pos) {
		
		int i = pos.getX(), yCoord = pos.getY(), k = pos.getZ();
		
		if (RealmsOfChaos.getBlock(world, i+3, yCoord, k+2, pos) == Blocks.air
				&& RealmsOfChaos.getBlock(world, i+3, yCoord - 1, k+3, pos) == Blocks.snow) {
			int height = rand.nextInt(6) + 2;
			for (int o = yCoord; o < yCoord + height; o++) {
				RealmsOfChaos.setBlock(world, i+3, o, k+3, pos, ROCBlocks.frozen_log);
			}
			int j = yCoord + height;

			RealmsOfChaos.setBlock(world, i + 0, j + 7, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 2, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 3, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 3, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 3, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 6, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 7, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 7, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 7, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 1, j + 8, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 1, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 2, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 2, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 2, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 3, k + 1, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 3, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 3, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 3, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 3, k + 5, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 4, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 4, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 4, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 5, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 6, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 6, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 6, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 7, k + 1, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 7, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 7, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 7, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 7, k + 5, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 8, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 8, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 8, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 9, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 9, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 9, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 10, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 2, j + 11, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 0, k + 3, pos, ROCBlocks.frozen_log);
			RealmsOfChaos.setBlock(world, i + 3, j + 1, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 1, k + 3, pos, ROCBlocks.frozen_log);
			RealmsOfChaos.setBlock(world, i + 3, j + 1, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 2, k + 1, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 2, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 2, k + 3, pos, ROCBlocks.frozen_log);
			RealmsOfChaos.setBlock(world, i + 3, j + 2, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 2, k + 5, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 3, k + 1, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 3, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 3, k + 3, pos, ROCBlocks.frozen_log);
			RealmsOfChaos.setBlock(world, i + 3, j + 3, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 3, k + 5, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 4, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 4, k + 3, pos, ROCBlocks.frozen_log);
			RealmsOfChaos.setBlock(world, i + 3, j + 4, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 5, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 5, k + 3, pos, ROCBlocks.frozen_log);
			RealmsOfChaos.setBlock(world, i + 3, j + 5, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 6, k + 1, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 6, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 6, k + 3, pos, ROCBlocks.frozen_log);
			RealmsOfChaos.setBlock(world, i + 3, j + 6, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 6, k + 5, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 7, k + 0, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 7, k + 1, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 7, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 7, k + 3, pos, ROCBlocks.frozen_log);
			RealmsOfChaos.setBlock(world, i + 3, j + 7, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 7, k + 5, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 7, k + 6, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 8, k + 1, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 8, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 8, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 8, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 8, k + 5, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 9, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 9, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 9, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 10, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 10, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 10, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 11, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 11, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 11, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 12, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 13, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 14, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 3, j + 15, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 1, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 2, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 2, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 2, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 3, k + 1, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 3, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 3, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 3, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 3, k + 5, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 4, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 4, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 4, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 5, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 6, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 6, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 6, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 7, k + 1, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 7, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 7, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 7, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 7, k + 5, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 8, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 8, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 8, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 9, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 9, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 9, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 10, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 4, j + 11, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 5, j + 2, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 5, j + 3, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 5, j + 3, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 5, j + 3, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 5, j + 6, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 5, j + 7, k + 2, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 5, j + 7, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 5, j + 7, k + 4, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 5, j + 8, k + 3, pos, ROCBlocks.frozen_leaves);
			RealmsOfChaos.setBlock(world, i + 6, j + 7, k + 3, pos, ROCBlocks.frozen_leaves);

			return true;
		}
		return false;
	}
}