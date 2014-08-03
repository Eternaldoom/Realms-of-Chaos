/*
 *** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
 */

package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRuinsWell extends WorldGenerator {
	public WorldGenRuinsWell() {
	}

	public boolean generate(World world, Random rand, int i, int j, int k) {
		if (world.getBlock(i, j, k) == Blocks.air
				&& world.getBlock(i + 5, j, k) == Blocks.air
				&& world.getBlock(i, j, k + 5) == Blocks.air
				&& world.getBlock(i + 5, j, k + 5) == Blocks.air
				&& world.getBlock(i, j - 1, k) != Blocks.air
				&& world.getBlock(i + 5, j - 1, k) != Blocks.air
				&& world.getBlock(i, j - 1, k + 5) != Blocks.air
				&& world.getBlock(i + 5, j - 1, k + 5) != Blocks.air) {
			world.setBlock(i + 0, j + 0, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 0, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 1, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 1, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 2, k + 0, Blocks.packed_ice);
			world.setBlock(i + 0, j + 2, k + 5, Blocks.packed_ice);
			world.setBlock(i + 0, j + 3, k + 5, Blocks.packed_ice);
			world.setBlock(i + 1, j + 0, k + 2, Blocks.stone_brick_stairs);
			world.setBlock(i + 1, j + 0, k + 3, Blocks.stone_brick_stairs);
			world.setBlock(i + 1, j + 1, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 1, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 2, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 2, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 3, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 3, k + 2, Blocks.stone_brick_stairs, 7, 2);
			world.setBlock(i + 1, j + 3, k + 3, Blocks.stonebrick);
			world.setBlock(i + 1, j + 3, k + 4, Blocks.stone_brick_stairs);
			world.setBlock(i + 2, j + 0, k + 1, Blocks.stone_brick_stairs, 2, 2);
			world.setBlock(i + 2, j + 0, k + 4, Blocks.stone_brick_stairs, 3, 2);
			world.setBlock(i + 2, j + 3, k + 1, Blocks.stonebrick);
			world.setBlock(i + 2, j + 3, k + 4, Blocks.stone_brick_stairs, 5, 2);
			world.setBlock(i + 3, j + 0, k + 1, Blocks.stone_brick_stairs, 2, 2);
			world.setBlock(i + 3, j + 0, k + 4, Blocks.stone_brick_stairs, 3, 2);
			world.setBlock(i + 3, j + 3, k + 1, Blocks.stonebrick);
			world.setBlock(i + 3, j + 3, k + 4, Blocks.stone_brick_stairs);
			world.setBlock(i + 4, j + 0, k + 2, Blocks.stone_brick_stairs, 1, 2);
			world.setBlock(i + 4, j + 0, k + 3, Blocks.stone_brick_stairs, 1, 2);
			world.setBlock(i + 4, j + 1, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 1, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 2, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 2, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 3, k + 1, Blocks.stone_brick_stairs, 1, 2);
			world.setBlock(i + 4, j + 3, k + 2, Blocks.stone_brick_stairs, 3, 2);
			world.setBlock(i + 4, j + 3, k + 3, Blocks.stonebrick);
			world.setBlock(i + 4, j + 3, k + 4, Blocks.stone_brick_stairs, 3, 2);
			world.setBlock(i + 5, j + 0, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 0, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 1, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 1, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 2, k + 0, Blocks.packed_ice);
			world.setBlock(i + 5, j + 2, k + 5, Blocks.packed_ice);
			world.setBlock(i + 5, j + 3, k + 0, Blocks.packed_ice);
			world.setBlock(i + 5, j + 4, k + 0, Blocks.packed_ice);
			world.setBlock(i + 0, j + 1, k + 1, Blocks.vine, 8, 2);
			world.setBlock(i + 0, j + 1, k + 4, Blocks.vine, 8, 2);
			world.setBlock(i + 0, j + 2, k + 4, Blocks.vine, 8, 2);
			world.setBlock(i + 2, j + 0, k + 2, Blocks.lava);
			world.setBlock(i + 2, j + 0, k + 3, Blocks.lava);
			world.setBlock(i + 3, j + 0, k + 2, Blocks.lava);
			world.setBlock(i + 3, j + 0, k + 3, Blocks.lava);
			world.setBlock(i + 4, j + 0, k + 5, Blocks.vine, 4, 2);
			world.setBlock(i + 4, j + 1, k + 5, Blocks.vine, 4, 2);

			return true;
		}
		return false;
	}
}