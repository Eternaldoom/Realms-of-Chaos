/*
 *** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
 */

package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRuinsStatue extends WorldGenerator {
	public WorldGenRuinsStatue() {
	}

	public boolean generate(World world, Random rand, int i, int j, int k) {
		if (world.getBlock(i, j, k) == Blocks.air
				&& world.getBlock(i + 5, j, k) == Blocks.air
				&& world.getBlock(i, j, k + 4) == Blocks.air
				&& world.getBlock(i + 5, j, k + 4) == Blocks.air
				&& world.getBlock(i, j-1, k) == Blocks.snow
				&& world.getBlock(i+5, j-1, k) == Blocks.snow
				&& world.getBlock(i, j-1, k+4) == Blocks.snow
				&& world.getBlock(i+5, j-1, k+4) == Blocks.snow) {
			world.setBlock(i + 0, j + 0, k + 2, Blocks.stone_brick_stairs, 2, 2);
			world.setBlock(i + 2, j + 0, k + 2, Blocks.stone_brick_stairs, 1, 2);
			world.setBlock(i + 2, j + 2, k + 1, Blocks.packed_ice);
			world.setBlock(i + 2, j + 2, k + 2, Blocks.packed_ice);
			world.setBlock(i + 2, j + 2, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 3, k + 1, Blocks.packed_ice);
			world.setBlock(i + 2, j + 3, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 3, k + 3, Blocks.packed_ice);
			world.setBlock(i + 2, j + 4, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 4, k + 2, Blocks.packed_ice);
			world.setBlock(i + 2, j + 4, k + 3, Blocks.packed_ice);
			world.setBlock(i + 3, j + 0, k + 0, Blocks.stone_brick_stairs, 6, 2);
			world.setBlock(i + 3, j + 0, k + 1, Blocks.stone_brick_stairs, 3, 2);
			world.setBlock(i + 3, j + 0, k + 2, Blocks.stonebrick);
			world.setBlock(i + 3, j + 0, k + 3, Blocks.stone_brick_stairs, 2, 2);
			world.setBlock(i + 3, j + 0, k + 4, Blocks.stone_brick_stairs, 3, 2);
			world.setBlock(i + 3, j + 1, k + 0, Blocks.stone_brick_stairs, 3, 2);
			world.setBlock(i + 3, j + 1, k + 2, Blocks.stonebrick);
			world.setBlock(i + 3, j + 2, k + 1, Blocks.packed_ice);
			world.setBlock(i + 3, j + 2, k + 2, Blocks.stonebrick);
			world.setBlock(i + 3, j + 2, k + 3, Blocks.packed_ice);
			world.setBlock(i + 3, j + 3, k + 1, Blocks.packed_ice);
			world.setBlock(i + 3, j + 3, k + 2, Blocks.stonebrick);
			world.setBlock(i + 3, j + 3, k + 3, Blocks.packed_ice);
			world.setBlock(i + 3, j + 4, k + 1, Blocks.packed_ice);
			world.setBlock(i + 3, j + 4, k + 2, Blocks.stonebrick);
			world.setBlock(i + 3, j + 4, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 5, k + 2, Blocks.stonebrick);
			world.setBlock(i + 4, j + 0, k + 2, Blocks.stone_brick_stairs);
			world.setBlock(i + 4, j + 2, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 2, k + 2, Blocks.packed_ice);
			world.setBlock(i + 4, j + 2, k + 3, Blocks.packed_ice);
			world.setBlock(i + 4, j + 3, k + 1, Blocks.packed_ice);
			world.setBlock(i + 4, j + 3, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 3, k + 3, Blocks.packed_ice);
			world.setBlock(i + 4, j + 4, k + 1, Blocks.packed_ice);
			world.setBlock(i + 4, j + 4, k + 2, Blocks.packed_ice);
			world.setBlock(i + 4, j + 4, k + 3, Blocks.packed_ice);
			world.setBlock(i + 5, j + 0, k + 2, Blocks.stone_brick_stairs, 5, 2);
			world.setBlock(i + 1, j + 2, k + 1, Blocks.vine, 8, 2);
			world.setBlock(i + 1, j + 3, k + 3, Blocks.vine, 8, 2);
			world.setBlock(i + 2, j + 2, k + 0, Blocks.vine, 1, 2);
			world.setBlock(i + 3, j + 4, k + 0, Blocks.vine, 1, 2);
			world.setBlock(i + 3, j + 4, k + 4, Blocks.vine, 4, 2);
			world.setBlock(i + 4, j + 2, k + 4, Blocks.vine, 4, 2);
			world.setBlock(i + 4, j + 3, k + 4, Blocks.vine, 4, 2);
			world.setBlock(i + 4, j + 4, k + 4, Blocks.vine, 4, 2);
			world.setBlock(i + 5, j + 2, k + 1, Blocks.vine, 2, 2);
			world.setBlock(i + 5, j + 2, k + 2, Blocks.vine, 2, 2);

			return true;
		}
		return false;
	}
}