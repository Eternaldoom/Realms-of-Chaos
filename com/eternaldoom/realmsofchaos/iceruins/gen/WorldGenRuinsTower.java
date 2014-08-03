/*
 *** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
 */

package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRuinsTower extends WorldGenerator {
	public WorldGenRuinsTower() {
	}

	public boolean generate(World world, Random rand, int i, int j, int k) {
		if (world.getBlock(i, j, k) == Blocks.air
				&& world.getBlock(i, j - 1, k) != Blocks.air
				&& world.getBlock(i+4, j-1, k) != Blocks.air
				&& world.getBlock(i, j-1, k+4) != Blocks.air
				&& world.getBlock(i+4, j-1, k+4) != Blocks.air) {
			world.setBlock(i + 0, j + 0, k + 1, Blocks.packed_ice);
			world.setBlock(i + 1, j + 0, k + 3, Blocks.packed_ice);
			world.setBlock(i + 1, j + 0, k + 4, Blocks.packed_ice);
			world.setBlock(i + 1, j + 1, k + 2, Blocks.packed_ice);
			world.setBlock(i + 1, j + 1, k + 4, Blocks.packed_ice);
			world.setBlock(i + 1, j + 2, k + 2, Blocks.packed_ice);
			world.setBlock(i + 1, j + 4, k + 1, Blocks.stone_brick_stairs, 4, 2);
			world.setBlock(i + 1, j + 5, k + 1, Blocks.stone_brick_stairs, 2, 2);
			world.setBlock(i + 1, j + 5, k + 2, Blocks.packed_ice);
			world.setBlock(i + 1, j + 6, k + 2, Blocks.packed_ice);
			world.setBlock(i + 2, j + 0, k + 1, Blocks.packed_ice);
			world.setBlock(i + 2, j + 0, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 0, k + 3, Blocks.stone_brick_stairs);
			world.setBlock(i + 2, j + 0, k + 4, Blocks.packed_ice);
			world.setBlock(i + 2, j + 1, k + 1, Blocks.packed_ice);
			world.setBlock(i + 2, j + 1, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 1, k + 4, Blocks.packed_ice);
			world.setBlock(i + 2, j + 2, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 2, k + 3, Blocks.packed_ice);
			world.setBlock(i + 2, j + 3, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 3, k + 3, Blocks.packed_ice);
			world.setBlock(i + 2, j + 4, k + 1, Blocks.packed_ice);
			world.setBlock(i + 2, j + 4, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 5, k + 1, Blocks.packed_ice);
			world.setBlock(i + 2, j + 5, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 6, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 7, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 7, k + 3, Blocks.packed_ice);
			world.setBlock(i + 2, j + 8, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 8, k + 3, Blocks.packed_ice);
			world.setBlock(i + 2, j + 9, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 10, k + 2, Blocks.packed_ice);
			world.setBlock(i + 2, j + 11, k + 2, Blocks.packed_ice);
			world.setBlock(i + 3, j + 0, k + 0, Blocks.packed_ice);
			world.setBlock(i + 3, j + 0, k + 2, Blocks.packed_ice);
			world.setBlock(i + 3, j + 0, k + 3, Blocks.stone_brick_stairs, 5, 2);
			world.setBlock(i + 3, j + 1, k + 0, Blocks.packed_ice);
			world.setBlock(i + 3, j + 1, k + 2, Blocks.stone_brick_stairs, 6, 2);
			world.setBlock(i + 3, j + 2, k + 1, Blocks.stone_brick_stairs, 6, 2);
			world.setBlock(i + 3, j + 2, k + 2, Blocks.stone_brick_stairs, 3, 2);
			world.setBlock(i + 3, j + 3, k + 1, Blocks.stone_brick_stairs, 1, 2);
			world.setBlock(i + 3, j + 3, k + 2, Blocks.packed_ice);
			world.setBlock(i + 3, j + 4, k + 2, Blocks.packed_ice);
			world.setBlock(i + 4, j + 0, k + 0, Blocks.packed_ice);
			world.setBlock(i + 4, j + 0, k + 2, Blocks.packed_ice);
			world.setBlock(i + 4, j + 0, k + 3, Blocks.packed_ice);
			world.setBlock(i + 4, j + 1, k + 2, Blocks.packed_ice);

			return true;
		}
		return false;
	}
}