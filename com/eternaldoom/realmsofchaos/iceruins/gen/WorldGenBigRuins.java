/*
 *** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
 */

package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.eternaldoom.realmsofchaos.overworld.blocks.ROCBlocks;

public class WorldGenBigRuins extends WorldGenerator {
	public WorldGenBigRuins() {
	}

	public boolean generate(World world, Random rand, int i, int j, int k) {
		if (world.getBlock(i, j - 3, k) == Blocks.snow
				&& world.getBlock(i + 35, j - 2, k) == Blocks.snow
				&& world.getBlock(i, j - 2, k + 35) == Blocks.snow
				&& world.getBlock(i + 35, j - 2, k + 35) == Blocks.snow
				&& world.getBlock(i, j + 1, k) == Blocks.air
				&& world.getBlock(i + 35, j + 1, k) == Blocks.air
				&& world.getBlock(i, j + 1, k + 35) == Blocks.air
				&& world.getBlock(i + 35, j + 1, k + 35) == Blocks.air) {
			world.setBlock(i + 0, j + 6, k + 0, Blocks.packed_ice);
			world.setBlock(i + 0, j + 6, k + 19, Blocks.packed_ice);
			world.setBlock(i + 0, j + 6, k + 35, Blocks.packed_ice);
			world.setBlock(i + 0, j + 7, k + 0, Blocks.packed_ice);
			world.setBlock(i + 0, j + 7, k + 2, Blocks.packed_ice);
			world.setBlock(i + 0, j + 7, k + 17, Blocks.packed_ice);
			world.setBlock(i + 0, j + 7, k + 19, Blocks.packed_ice);
			world.setBlock(i + 0, j + 7, k + 33, Blocks.packed_ice);
			world.setBlock(i + 0, j + 7, k + 35, Blocks.packed_ice);
			world.setBlock(i + 0, j + 8, k + 0, Blocks.packed_ice);
			world.setBlock(i + 0, j + 8, k + 2, Blocks.packed_ice);
			world.setBlock(i + 0, j + 8, k + 5, Blocks.packed_ice);
			world.setBlock(i + 0, j + 8, k + 17, Blocks.packed_ice);
			world.setBlock(i + 0, j + 8, k + 19, Blocks.packed_ice);
			world.setBlock(i + 0, j + 8, k + 31, Blocks.packed_ice);
			world.setBlock(i + 0, j + 8, k + 33, Blocks.packed_ice);
			world.setBlock(i + 0, j + 8, k + 35, Blocks.packed_ice);
			world.setBlock(i + 0, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 6, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 7, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 8, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 9, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 10, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 11, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 12, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 13, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 14, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 15, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 16, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 17, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 18, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 19, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 20, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 21, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 22, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 23, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 24, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 25, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 26, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 27, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 28, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 29, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 0, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 9, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 9, k + 6, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 9, k + 11, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 9, k + 16, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 9, k + 19, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 9, k + 24, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 9, k + 29, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 9, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 6, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 7, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 8, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 9, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 10, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 11, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 12, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 13, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 14, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 15, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 16, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 17, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 18, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 19, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 20, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 21, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 22, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 23, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 24, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 25, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 26, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 27, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 28, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 29, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 1, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 0, k + 2, Blocks.stone_brick_stairs);
			world.setBlock(i + 2, j + 0, k + 3, Blocks.stone_brick_stairs);
			world.setBlock(i + 2, j + 0, k + 4, Blocks.stone_brick_stairs);
			world.setBlock(i + 2, j + 0, k + 5, Blocks.stone_brick_stairs);
			world.setBlock(i + 2, j + 0, k + 16, Blocks.stone_brick_stairs);
			world.setBlock(i + 2, j + 0, k + 17, Blocks.stone_brick_stairs);
			world.setBlock(i + 2, j + 0, k + 18, Blocks.stone_brick_stairs);
			world.setBlock(i + 2, j + 0, k + 19, Blocks.stone_brick_stairs);
			world.setBlock(i + 2, j + 0, k + 30, Blocks.stone_brick_stairs);
			world.setBlock(i + 2, j + 0, k + 31, Blocks.stone_brick_stairs);
			world.setBlock(i + 2, j + 0, k + 32, Blocks.stone_brick_stairs);
			world.setBlock(i + 2, j + 0, k + 33, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 2, j + 7, k + 0, Blocks.packed_ice);
			world.setBlock(i + 2, j + 7, k + 35, Blocks.packed_ice);
			world.setBlock(i + 2, j + 8, k + 0, Blocks.packed_ice);
			world.setBlock(i + 2, j + 8, k + 2, Blocks.stone_brick_stairs, 6, 0);
			world.setBlock(i + 2, j + 8, k + 3, Blocks.stone_brick_stairs, 4, 0);
			world.setBlock(i + 2, j + 8, k + 4, Blocks.stone_brick_stairs, 4, 0);
			world.setBlock(i + 2, j + 8, k + 5, Blocks.stone_brick_stairs, 4, 0);
			world.setBlock(i + 2, j + 8, k + 16, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 2, j + 8, k + 17, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 2, j + 8, k + 18, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 2, j + 8, k + 19, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 2, j + 8, k + 30, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 2, j + 8, k + 31, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 2, j + 8, k + 32, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 2, j + 8, k + 33, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 2, j + 8, k + 35, Blocks.packed_ice);
			world.setBlock(i + 2, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 9, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 9, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 9, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 9, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 9, k + 16, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 9, k + 19, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 9, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 9, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 9, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 9, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 10, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 10, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 10, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 10, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 10, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 10, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 10, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 10, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 11, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 11, k + 4, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 2, j + 11, k + 31, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 2, j + 11, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 12, k + 2, Blocks.stonebrick);
			world.setBlock(i + 2, j + 12, k + 33, Blocks.stonebrick);
			world.setBlock(i + 3, j + 0, k + 2, Blocks.stone_brick_stairs, 2, 0);
			world.setBlock(i + 3, j + 0, k + 3, Blocks.stonebrick);
			world.setBlock(i + 3, j + 0, k + 4, Blocks.stonebrick);
			world.setBlock(i + 3, j + 0, k + 5, Blocks.stone_brick_stairs, 3, 0);
			world.setBlock(i + 3, j + 0, k + 16, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 3, j + 0, k + 17, Blocks.stonebrick);
			world.setBlock(i + 3, j + 0, k + 18, Blocks.stonebrick);
			world.setBlock(i + 3, j + 0, k + 19, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 3, j + 0, k + 30, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 3, j + 0, k + 31, Blocks.stonebrick);
			world.setBlock(i + 3, j + 0, k + 32, Blocks.stonebrick);
			world.setBlock(i + 3, j + 0, k + 33, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 3, j + 1, k + 3, Blocks.stonebrick);
			world.setBlock(i + 3, j + 1, k + 4, Blocks.stonebrick);
			world.setBlock(i + 3, j + 1, k + 17, Blocks.stonebrick);
			world.setBlock(i + 3, j + 1, k + 18, Blocks.stonebrick);
			world.setBlock(i + 3, j + 1, k + 31, Blocks.stonebrick);
			world.setBlock(i + 3, j + 1, k + 32, Blocks.stonebrick);
			world.setBlock(i + 3, j + 2, k + 3, Blocks.stonebrick);
			world.setBlock(i + 3, j + 2, k + 4, Blocks.stonebrick);
			world.setBlock(i + 3, j + 2, k + 17, Blocks.stonebrick);
			world.setBlock(i + 3, j + 2, k + 18, Blocks.stonebrick);
			world.setBlock(i + 3, j + 2, k + 31, Blocks.stonebrick);
			world.setBlock(i + 3, j + 2, k + 32, Blocks.stonebrick);
			world.setBlock(i + 3, j + 3, k + 3, Blocks.stonebrick);
			world.setBlock(i + 3, j + 3, k + 4, Blocks.stonebrick);
			world.setBlock(i + 3, j + 3, k + 17, Blocks.stonebrick);
			world.setBlock(i + 3, j + 3, k + 18, Blocks.stonebrick);
			world.setBlock(i + 3, j + 3, k + 31, Blocks.stonebrick);
			world.setBlock(i + 3, j + 3, k + 32, Blocks.stonebrick);
			world.setBlock(i + 3, j + 4, k + 3, Blocks.stonebrick);
			world.setBlock(i + 3, j + 4, k + 4, Blocks.stonebrick);
			world.setBlock(i + 3, j + 4, k + 17, Blocks.stonebrick);
			world.setBlock(i + 3, j + 4, k + 18, Blocks.stonebrick);
			world.setBlock(i + 3, j + 4, k + 31, Blocks.stonebrick);
			world.setBlock(i + 3, j + 4, k + 32, Blocks.stonebrick);
			world.setBlock(i + 3, j + 5, k + 3, Blocks.stonebrick);
			world.setBlock(i + 3, j + 5, k + 4, Blocks.stonebrick);
			world.setBlock(i + 3, j + 5, k + 17, Blocks.stonebrick);
			world.setBlock(i + 3, j + 5, k + 18, Blocks.stonebrick);
			world.setBlock(i + 3, j + 5, k + 31, Blocks.stonebrick);
			world.setBlock(i + 3, j + 5, k + 32, Blocks.stonebrick);
			world.setBlock(i + 3, j + 6, k + 3, Blocks.stonebrick);
			world.setBlock(i + 3, j + 6, k + 4, Blocks.stonebrick);
			world.setBlock(i + 3, j + 6, k + 17, Blocks.stonebrick);
			world.setBlock(i + 3, j + 6, k + 18, Blocks.stonebrick);
			world.setBlock(i + 3, j + 6, k + 31, Blocks.stonebrick);
			world.setBlock(i + 3, j + 6, k + 32, Blocks.stonebrick);
			world.setBlock(i + 3, j + 7, k + 3, Blocks.stonebrick);
			world.setBlock(i + 3, j + 7, k + 4, Blocks.stonebrick);
			world.setBlock(i + 3, j + 7, k + 17, Blocks.stonebrick);
			world.setBlock(i + 3, j + 7, k + 18, Blocks.stonebrick);
			world.setBlock(i + 3, j + 7, k + 31, Blocks.stonebrick);
			world.setBlock(i + 3, j + 7, k + 32, Blocks.stonebrick);
			world.setBlock(i + 3, j + 8, k + 2, Blocks.stone_brick_stairs, 6, 0);
			world.setBlock(i + 3, j + 8, k + 3, Blocks.stonebrick);
			world.setBlock(i + 3, j + 8, k + 4, Blocks.stonebrick);
			world.setBlock(i + 3, j + 8, k + 5, Blocks.stone_brick_stairs, 7, 0);
			world.setBlock(i + 3, j + 8, k + 16, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 3, j + 8, k + 19, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 3, j + 8, k + 30, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 3, j + 8, k + 31, Blocks.stonebrick);
			world.setBlock(i + 3, j + 8, k + 32, Blocks.stonebrick);
			world.setBlock(i + 3, j + 8, k + 33, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 3, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 9, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 9, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 9, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 9, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 9, k + 16, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 3, j + 9, k + 19, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 3, j + 9, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 9, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 9, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 9, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 10, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 10, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 10, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 10, k + 5, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 3, j + 10, k + 30, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 3, j + 10, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 10, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 10, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 3, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 0, k + 2, Blocks.stone_brick_stairs, 2, 0);
			world.setBlock(i + 4, j + 0, k + 3, Blocks.stonebrick);
			world.setBlock(i + 4, j + 0, k + 4, Blocks.stonebrick);
			world.setBlock(i + 4, j + 0, k + 5, Blocks.stone_brick_stairs, 3, 0);
			world.setBlock(i + 4, j + 0, k + 16, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 4, j + 0, k + 17, Blocks.stonebrick);
			world.setBlock(i + 4, j + 0, k + 18, Blocks.stonebrick);
			world.setBlock(i + 4, j + 0, k + 19, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 4, j + 0, k + 30, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 4, j + 0, k + 31, Blocks.stonebrick);
			world.setBlock(i + 4, j + 0, k + 32, Blocks.stonebrick);
			world.setBlock(i + 4, j + 0, k + 33, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 4, j + 1, k + 3, Blocks.stonebrick);
			world.setBlock(i + 4, j + 1, k + 4, Blocks.stonebrick);
			world.setBlock(i + 4, j + 1, k + 17, Blocks.stonebrick);
			world.setBlock(i + 4, j + 1, k + 18, Blocks.stonebrick);
			world.setBlock(i + 4, j + 1, k + 31, Blocks.stonebrick);
			world.setBlock(i + 4, j + 1, k + 32, Blocks.stonebrick);
			world.setBlock(i + 4, j + 2, k + 3, Blocks.stonebrick);
			world.setBlock(i + 4, j + 2, k + 4, Blocks.stonebrick);
			world.setBlock(i + 4, j + 2, k + 17, Blocks.stonebrick);
			world.setBlock(i + 4, j + 2, k + 18, Blocks.stonebrick);
			world.setBlock(i + 4, j + 2, k + 31, Blocks.stonebrick);
			world.setBlock(i + 4, j + 2, k + 32, Blocks.stonebrick);
			world.setBlock(i + 4, j + 3, k + 3, Blocks.stonebrick);
			world.setBlock(i + 4, j + 3, k + 4, Blocks.stonebrick);
			world.setBlock(i + 4, j + 3, k + 17, Blocks.stonebrick);
			world.setBlock(i + 4, j + 3, k + 18, Blocks.stonebrick);
			world.setBlock(i + 4, j + 3, k + 31, Blocks.stonebrick);
			world.setBlock(i + 4, j + 3, k + 32, Blocks.stonebrick);
			world.setBlock(i + 4, j + 4, k + 3, Blocks.stonebrick);
			world.setBlock(i + 4, j + 4, k + 4, Blocks.stonebrick);
			world.setBlock(i + 4, j + 4, k + 17, Blocks.stonebrick);
			world.setBlock(i + 4, j + 4, k + 18, Blocks.stonebrick);
			world.setBlock(i + 4, j + 4, k + 31, Blocks.stonebrick);
			world.setBlock(i + 4, j + 4, k + 32, Blocks.stonebrick);
			world.setBlock(i + 4, j + 5, k + 3, Blocks.stonebrick);
			world.setBlock(i + 4, j + 5, k + 4, Blocks.stonebrick);
			world.setBlock(i + 4, j + 5, k + 17, Blocks.stonebrick);
			world.setBlock(i + 4, j + 5, k + 18, Blocks.stonebrick);
			world.setBlock(i + 4, j + 5, k + 31, Blocks.stonebrick);
			world.setBlock(i + 4, j + 5, k + 32, Blocks.stonebrick);
			world.setBlock(i + 4, j + 6, k + 3, Blocks.stonebrick);
			world.setBlock(i + 4, j + 6, k + 4, Blocks.stonebrick);
			world.setBlock(i + 4, j + 6, k + 17, Blocks.stonebrick);
			world.setBlock(i + 4, j + 6, k + 18, Blocks.stonebrick);
			world.setBlock(i + 4, j + 6, k + 31, Blocks.stonebrick);
			world.setBlock(i + 4, j + 6, k + 32, Blocks.stonebrick);
			world.setBlock(i + 4, j + 7, k + 3, Blocks.stonebrick);
			world.setBlock(i + 4, j + 7, k + 4, Blocks.stonebrick);
			world.setBlock(i + 4, j + 7, k + 17, Blocks.stonebrick);
			world.setBlock(i + 4, j + 7, k + 18, Blocks.stonebrick);
			world.setBlock(i + 4, j + 7, k + 31, Blocks.stonebrick);
			world.setBlock(i + 4, j + 7, k + 32, Blocks.stonebrick);
			world.setBlock(i + 4, j + 8, k + 0, Blocks.packed_ice);
			world.setBlock(i + 4, j + 8, k + 2, Blocks.stone_brick_stairs, 6, 0);
			world.setBlock(i + 4, j + 8, k + 3, Blocks.stonebrick);
			world.setBlock(i + 4, j + 8, k + 4, Blocks.stonebrick);
			world.setBlock(i + 4, j + 8, k + 5, Blocks.stone_brick_stairs, 7, 0);
			world.setBlock(i + 4, j + 8, k + 16, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 4, j + 8, k + 19, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 4, j + 8, k + 30, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 4, j + 8, k + 31, Blocks.stonebrick);
			world.setBlock(i + 4, j + 8, k + 32, Blocks.stonebrick);
			world.setBlock(i + 4, j + 8, k + 33, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 4, j + 8, k + 35, Blocks.packed_ice);
			world.setBlock(i + 4, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 9, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 9, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 9, k + 4, Blocks.chest, 5, 2);
			world.setBlock(i + 4, j + 9, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 9, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 9, k + 31, Blocks.chest, 5, 2);
			world.setBlock(i + 4, j + 9, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 9, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 10, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 10, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 10, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 10, k + 5, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 4, j + 10, k + 30, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 4, j + 10, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 10, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 10, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 4, j + 11, k + 2, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 4, j + 11, k + 33, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 5, j + 0, k + 2, Blocks.stone_brick_stairs, 2, 0);
			world.setBlock(i + 5, j + 0, k + 3, Blocks.stone_brick_stairs, 1, 0);
			world.setBlock(i + 5, j + 0, k + 4, Blocks.stone_brick_stairs, 1, 0);
			world.setBlock(i + 5, j + 0, k + 5, Blocks.stone_brick_stairs, 3, 0);
			world.setBlock(i + 5, j + 0, k + 16, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 5, j + 0, k + 17, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 5, j + 0, k + 18, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 5, j + 0, k + 19, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 5, j + 0, k + 30, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 5, j + 0, k + 31, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 5, j + 0, k + 32, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 5, j + 0, k + 33, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 5, j + 8, k + 2, Blocks.stone_brick_stairs, 6, 0);
			world.setBlock(i + 5, j + 8, k + 3, Blocks.stone_brick_stairs, 5, 0);
			world.setBlock(i + 5, j + 8, k + 4, Blocks.stone_brick_stairs, 5, 0);
			world.setBlock(i + 5, j + 8, k + 5, Blocks.stone_brick_stairs, 5, 0);
			world.setBlock(i + 5, j + 8, k + 16, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 5, j + 8, k + 17, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 5, j + 8, k + 18, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 5, j + 8, k + 19, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 5, j + 8, k + 30, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 5, j + 8, k + 31, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 5, j + 8, k + 32, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 5, j + 8, k + 33, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 5, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 9, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 9, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 9, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 9, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 9, k + 16, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 9, k + 19, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 9, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 9, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 9, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 9, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 10, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 10, k + 3, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 5, j + 10, k + 4, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 5, j + 10, k + 5, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 5, j + 10, k + 16, Blocks.stone_brick_stairs);
			world.setBlock(i + 5, j + 10, k + 19, Blocks.stone_brick_stairs);
			world.setBlock(i + 5, j + 10, k + 30, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 5, j + 10, k + 31, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 5, j + 10, k + 32, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 5, j + 10, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 5, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 6, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 6, j + 9, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 6, j + 9, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 6, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 6, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 6, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 7, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 7, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 7, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 7, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 8, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 8, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 8, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 8, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 9, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 9, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 9, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 9, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 10, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 10, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 10, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 10, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 11, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 11, j + 9, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 11, j + 9, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 11, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 11, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 11, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 12, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 12, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 12, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 12, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 13, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 13, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 13, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 13, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 14, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 14, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 14, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 14, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 15, j + 0, k + 16, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 15, j + 0, k + 17, Blocks.stone_brick_stairs);
			world.setBlock(i + 15, j + 0, k + 18, Blocks.stone_brick_stairs);
			world.setBlock(i + 15, j + 0, k + 19, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 15, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 15, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 15, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 15, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 16, j + 0, k + 2, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 16, j + 0, k + 3, Blocks.stone_brick_stairs);
			world.setBlock(i + 16, j + 0, k + 4, Blocks.stone_brick_stairs);
			world.setBlock(i + 16, j + 0, k + 5, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 16, j + 0, k + 15, Blocks.stone_brick_stairs);
			world.setBlock(i + 16, j + 0, k + 16, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 16, j + 0, k + 17, Blocks.stonebrick);
			world.setBlock(i + 16, j + 0, k + 18, Blocks.stonebrick);
			world.setBlock(i + 16, j + 0, k + 19, Blocks.stone_brick_stairs);
			world.setBlock(i + 16, j + 0, k + 20, Blocks.stone_brick_stairs);
			world.setBlock(i + 16, j + 0, k + 30, Blocks.stone_brick_stairs);
			world.setBlock(i + 16, j + 0, k + 31, Blocks.stone_brick_stairs);
			world.setBlock(i + 16, j + 0, k + 32, Blocks.stone_brick_stairs);
			world.setBlock(i + 16, j + 0, k + 33, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 16, j + 1, k + 17, Blocks.stone_brick_stairs);
			world.setBlock(i + 16, j + 1, k + 18, Blocks.stone_brick_stairs);
			world.setBlock(i + 16, j + 8, k + 2, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 16, j + 8, k + 3, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 16, j + 8, k + 4, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 16, j + 8, k + 5, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 16, j + 8, k + 30, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 16, j + 8, k + 31, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 16, j + 8, k + 32, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 16, j + 8, k + 33, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 16, j + 8, k + 35, Blocks.packed_ice);
			world.setBlock(i + 16, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 16, j + 9, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 16, j + 9, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 16, j + 9, k + 3, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 16, j + 9, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 16, j + 9, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 16, j + 9, k + 32, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 16, j + 9, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 16, j + 9, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 16, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 16, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 16, j + 10, k + 5, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 16, j + 10, k + 30, Blocks.stone_brick_stairs,
					3, 0);
			world.setBlock(i + 16, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 17, j + 0, k + 2, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 17, j + 0, k + 3, Blocks.stonebrick);
			world.setBlock(i + 17, j + 0, k + 4, Blocks.stonebrick);
			world.setBlock(i + 17, j + 0, k + 5, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 17, j + 0, k + 15, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 17, j + 0, k + 16, Blocks.stonebrick);
			world.setBlock(i + 17, j + 0, k + 17, ROCBlocks.fractonite_ore);
			world.setBlock(i + 17, j + 0, k + 18, ROCBlocks.fractonite_ore);
			world.setBlock(i + 17, j + 0, k + 19, Blocks.stonebrick);
			world.setBlock(i + 17, j + 0, k + 20, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 17, j + 0, k + 30, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 17, j + 0, k + 31, Blocks.stonebrick);
			world.setBlock(i + 17, j + 0, k + 32, Blocks.stonebrick);
			world.setBlock(i + 17, j + 0, k + 33, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 17, j + 1, k + 3, Blocks.stonebrick);
			world.setBlock(i + 17, j + 1, k + 4, Blocks.stonebrick);
			world.setBlock(i + 17, j + 1, k + 16, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 17, j + 1, k + 19, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 17, j + 1, k + 31, Blocks.stonebrick);
			world.setBlock(i + 17, j + 1, k + 32, Blocks.stonebrick);
			world.setBlock(i + 17, j + 2, k + 3, Blocks.stonebrick);
			world.setBlock(i + 17, j + 2, k + 4, Blocks.stonebrick);
			world.setBlock(i + 17, j + 2, k + 31, Blocks.stonebrick);
			world.setBlock(i + 17, j + 2, k + 32, Blocks.stonebrick);
			world.setBlock(i + 17, j + 3, k + 3, Blocks.stonebrick);
			world.setBlock(i + 17, j + 3, k + 4, Blocks.stonebrick);
			world.setBlock(i + 17, j + 3, k + 31, Blocks.stonebrick);
			world.setBlock(i + 17, j + 3, k + 32, Blocks.stonebrick);
			world.setBlock(i + 17, j + 4, k + 3, Blocks.stonebrick);
			world.setBlock(i + 17, j + 4, k + 4, Blocks.stonebrick);
			world.setBlock(i + 17, j + 4, k + 31, Blocks.stonebrick);
			world.setBlock(i + 17, j + 4, k + 32, Blocks.stonebrick);
			world.setBlock(i + 17, j + 5, k + 3, Blocks.stonebrick);
			world.setBlock(i + 17, j + 5, k + 4, Blocks.stonebrick);
			world.setBlock(i + 17, j + 5, k + 31, Blocks.stonebrick);
			world.setBlock(i + 17, j + 5, k + 32, Blocks.stonebrick);
			world.setBlock(i + 17, j + 6, k + 0, Blocks.packed_ice);
			world.setBlock(i + 17, j + 6, k + 3, Blocks.stonebrick);
			world.setBlock(i + 17, j + 6, k + 4, Blocks.stonebrick);
			world.setBlock(i + 17, j + 6, k + 31, Blocks.stonebrick);
			world.setBlock(i + 17, j + 6, k + 32, Blocks.stonebrick);
			world.setBlock(i + 17, j + 7, k + 0, Blocks.packed_ice);
			world.setBlock(i + 17, j + 7, k + 3, Blocks.stonebrick);
			world.setBlock(i + 17, j + 7, k + 4, Blocks.stonebrick);
			world.setBlock(i + 17, j + 7, k + 31, Blocks.stonebrick);
			world.setBlock(i + 17, j + 7, k + 32, Blocks.stonebrick);
			world.setBlock(i + 17, j + 8, k + 0, Blocks.packed_ice);
			world.setBlock(i + 17, j + 8, k + 2, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 17, j + 8, k + 5, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 17, j + 8, k + 30, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 17, j + 8, k + 33, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 17, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 17, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 17, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 17, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 18, j + 0, k + 2, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 18, j + 0, k + 3, Blocks.stonebrick);
			world.setBlock(i + 18, j + 0, k + 4, Blocks.stonebrick);
			world.setBlock(i + 18, j + 0, k + 5, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 18, j + 0, k + 15, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 18, j + 0, k + 16, Blocks.stonebrick);
			world.setBlock(i + 18, j + 0, k + 17, ROCBlocks.fractonite_ore);
			world.setBlock(i + 18, j + 0, k + 18, ROCBlocks.fractonite_ore);
			world.setBlock(i + 18, j + 0, k + 19, Blocks.stonebrick);
			world.setBlock(i + 18, j + 0, k + 20, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 18, j + 0, k + 30, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 18, j + 0, k + 31, Blocks.stonebrick);
			world.setBlock(i + 18, j + 0, k + 32, Blocks.stonebrick);
			world.setBlock(i + 18, j + 0, k + 33, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 18, j + 1, k + 3, Blocks.stonebrick);
			world.setBlock(i + 18, j + 1, k + 4, Blocks.stonebrick);
			world.setBlock(i + 18, j + 1, k + 16, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 18, j + 1, k + 19, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 18, j + 1, k + 31, Blocks.stonebrick);
			world.setBlock(i + 18, j + 1, k + 32, Blocks.stonebrick);
			world.setBlock(i + 18, j + 2, k + 3, Blocks.stonebrick);
			world.setBlock(i + 18, j + 2, k + 4, Blocks.stonebrick);
			world.setBlock(i + 18, j + 2, k + 31, Blocks.stonebrick);
			world.setBlock(i + 18, j + 2, k + 32, Blocks.stonebrick);
			world.setBlock(i + 18, j + 3, k + 3, Blocks.stonebrick);
			world.setBlock(i + 18, j + 3, k + 4, Blocks.stonebrick);
			world.setBlock(i + 18, j + 3, k + 31, Blocks.stonebrick);
			world.setBlock(i + 18, j + 3, k + 32, Blocks.stonebrick);
			world.setBlock(i + 18, j + 4, k + 3, Blocks.stonebrick);
			world.setBlock(i + 18, j + 4, k + 4, Blocks.stonebrick);
			world.setBlock(i + 18, j + 4, k + 31, Blocks.stonebrick);
			world.setBlock(i + 18, j + 4, k + 32, Blocks.stonebrick);
			world.setBlock(i + 18, j + 5, k + 3, Blocks.stonebrick);
			world.setBlock(i + 18, j + 5, k + 4, Blocks.stonebrick);
			world.setBlock(i + 18, j + 5, k + 31, Blocks.stonebrick);
			world.setBlock(i + 18, j + 5, k + 32, Blocks.stonebrick);
			world.setBlock(i + 18, j + 6, k + 3, Blocks.stonebrick);
			world.setBlock(i + 18, j + 6, k + 4, Blocks.stonebrick);
			world.setBlock(i + 18, j + 6, k + 31, Blocks.stonebrick);
			world.setBlock(i + 18, j + 6, k + 32, Blocks.stonebrick);
			world.setBlock(i + 18, j + 7, k + 3, Blocks.stonebrick);
			world.setBlock(i + 18, j + 7, k + 4, Blocks.stonebrick);
			world.setBlock(i + 18, j + 7, k + 31, Blocks.stonebrick);
			world.setBlock(i + 18, j + 7, k + 32, Blocks.stonebrick);
			world.setBlock(i + 18, j + 7, k + 35, Blocks.packed_ice);
			world.setBlock(i + 18, j + 8, k + 2, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 18, j + 8, k + 5, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 18, j + 8, k + 30, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 18, j + 8, k + 33, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 18, j + 8, k + 35, Blocks.packed_ice);
			world.setBlock(i + 18, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 18, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 18, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 18, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 19, j + 0, k + 2, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 19, j + 0, k + 3, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 19, j + 0, k + 4, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 19, j + 0, k + 5, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 19, j + 0, k + 15, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 19, j + 0, k + 16, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 19, j + 0, k + 17, Blocks.stonebrick);
			world.setBlock(i + 19, j + 0, k + 18, Blocks.stonebrick);
			world.setBlock(i + 19, j + 0, k + 19, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 19, j + 0, k + 20, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 19, j + 0, k + 30, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 19, j + 0, k + 31, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 19, j + 0, k + 32, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 19, j + 0, k + 33, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 19, j + 1, k + 17, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 19, j + 1, k + 18, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 19, j + 7, k + 0, Blocks.packed_ice);
			world.setBlock(i + 19, j + 8, k + 0, Blocks.packed_ice);
			world.setBlock(i + 19, j + 8, k + 2, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 19, j + 8, k + 3, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 19, j + 8, k + 4, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 19, j + 8, k + 5, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 19, j + 8, k + 30, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 19, j + 8, k + 31, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 19, j + 8, k + 32, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 19, j + 8, k + 33, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 19, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 19, j + 9, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 19, j + 9, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 19, j + 9, k + 3, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 19, j + 9, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 19, j + 9, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 19, j + 9, k + 32, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 19, j + 9, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 19, j + 9, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 19, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 19, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 19, j + 10, k + 5, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 19, j + 10, k + 30, Blocks.stone_brick_stairs,
					3, 0);
			world.setBlock(i + 19, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 20, j + 0, k + 16, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 20, j + 0, k + 17, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 20, j + 0, k + 18, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 20, j + 0, k + 19, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 20, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 20, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 20, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 20, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 21, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 21, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 21, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 21, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 22, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 22, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 22, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 22, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 23, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 23, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 23, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 23, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 24, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 24, j + 9, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 24, j + 9, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 24, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 24, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 24, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 25, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 25, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 25, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 25, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 26, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 26, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 26, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 26, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 27, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 27, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 27, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 27, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 28, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 28, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 28, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 28, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 29, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 29, j + 9, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 29, j + 9, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 29, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 29, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 29, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 0, k + 2, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 0, k + 3, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 0, k + 4, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 0, k + 5, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 0, k + 16, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 30, j + 0, k + 17, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 0, k + 18, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 0, k + 19, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 0, k + 30, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 0, k + 31, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 0, k + 32, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 0, k + 33, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 30, j + 8, k + 2, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 30, j + 8, k + 3, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 30, j + 8, k + 4, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 30, j + 8, k + 5, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 30, j + 8, k + 16, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 30, j + 8, k + 17, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 30, j + 8, k + 18, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 30, j + 8, k + 19, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 30, j + 8, k + 30, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 30, j + 8, k + 31, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 30, j + 8, k + 32, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 30, j + 8, k + 33, Blocks.stone_brick_stairs, 4,
					0);
			world.setBlock(i + 30, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 9, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 9, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 9, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 9, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 9, k + 16, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 9, k + 19, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 9, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 9, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 9, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 9, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 10, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 10, k + 3, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 10, k + 4, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 10, k + 5, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 10, k + 16, Blocks.stone_brick_stairs,
					1, 0);
			world.setBlock(i + 30, j + 10, k + 19, Blocks.stone_brick_stairs,
					1, 0);
			world.setBlock(i + 30, j + 10, k + 30, Blocks.stone_brick_stairs,
					2, 0);
			world.setBlock(i + 30, j + 10, k + 31, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 10, k + 32, Blocks.stone_brick_stairs);
			world.setBlock(i + 30, j + 10, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 30, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 0, k + 2, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 31, j + 0, k + 3, Blocks.stonebrick);
			world.setBlock(i + 31, j + 0, k + 4, Blocks.stonebrick);
			world.setBlock(i + 31, j + 0, k + 5, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 31, j + 0, k + 16, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 31, j + 0, k + 17, Blocks.stonebrick);
			world.setBlock(i + 31, j + 0, k + 18, Blocks.stonebrick);
			world.setBlock(i + 31, j + 0, k + 19, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 31, j + 0, k + 30, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 31, j + 0, k + 31, Blocks.stonebrick);
			world.setBlock(i + 31, j + 0, k + 32, Blocks.stonebrick);
			world.setBlock(i + 31, j + 0, k + 33, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 31, j + 1, k + 3, Blocks.stonebrick);
			world.setBlock(i + 31, j + 1, k + 4, Blocks.stonebrick);
			world.setBlock(i + 31, j + 1, k + 17, Blocks.stonebrick);
			world.setBlock(i + 31, j + 1, k + 18, Blocks.stonebrick);
			world.setBlock(i + 31, j + 1, k + 31, Blocks.stonebrick);
			world.setBlock(i + 31, j + 1, k + 32, Blocks.stonebrick);
			world.setBlock(i + 31, j + 2, k + 3, Blocks.stonebrick);
			world.setBlock(i + 31, j + 2, k + 4, Blocks.stonebrick);
			world.setBlock(i + 31, j + 2, k + 17, Blocks.stonebrick);
			world.setBlock(i + 31, j + 2, k + 18, Blocks.stonebrick);
			world.setBlock(i + 31, j + 2, k + 31, Blocks.stonebrick);
			world.setBlock(i + 31, j + 2, k + 32, Blocks.stonebrick);
			world.setBlock(i + 31, j + 3, k + 3, Blocks.stonebrick);
			world.setBlock(i + 31, j + 3, k + 4, Blocks.stonebrick);
			world.setBlock(i + 31, j + 3, k + 17, Blocks.stonebrick);
			world.setBlock(i + 31, j + 3, k + 18, Blocks.stonebrick);
			world.setBlock(i + 31, j + 3, k + 31, Blocks.stonebrick);
			world.setBlock(i + 31, j + 3, k + 32, Blocks.stonebrick);
			world.setBlock(i + 31, j + 4, k + 3, Blocks.stonebrick);
			world.setBlock(i + 31, j + 4, k + 4, Blocks.stonebrick);
			world.setBlock(i + 31, j + 4, k + 17, Blocks.stonebrick);
			world.setBlock(i + 31, j + 4, k + 18, Blocks.stonebrick);
			world.setBlock(i + 31, j + 4, k + 31, Blocks.stonebrick);
			world.setBlock(i + 31, j + 4, k + 32, Blocks.stonebrick);
			world.setBlock(i + 31, j + 5, k + 3, Blocks.stonebrick);
			world.setBlock(i + 31, j + 5, k + 4, Blocks.stonebrick);
			world.setBlock(i + 31, j + 5, k + 17, Blocks.stonebrick);
			world.setBlock(i + 31, j + 5, k + 18, Blocks.stonebrick);
			world.setBlock(i + 31, j + 5, k + 31, Blocks.stonebrick);
			world.setBlock(i + 31, j + 5, k + 32, Blocks.stonebrick);
			world.setBlock(i + 31, j + 6, k + 3, Blocks.stonebrick);
			world.setBlock(i + 31, j + 6, k + 4, Blocks.stonebrick);
			world.setBlock(i + 31, j + 6, k + 17, Blocks.stonebrick);
			world.setBlock(i + 31, j + 6, k + 18, Blocks.stonebrick);
			world.setBlock(i + 31, j + 6, k + 31, Blocks.stonebrick);
			world.setBlock(i + 31, j + 6, k + 32, Blocks.stonebrick);
			world.setBlock(i + 31, j + 7, k + 3, Blocks.stonebrick);
			world.setBlock(i + 31, j + 7, k + 4, Blocks.stonebrick);
			world.setBlock(i + 31, j + 7, k + 17, Blocks.stonebrick);
			world.setBlock(i + 31, j + 7, k + 18, Blocks.stonebrick);
			world.setBlock(i + 31, j + 7, k + 31, Blocks.stonebrick);
			world.setBlock(i + 31, j + 7, k + 32, Blocks.stonebrick);
			world.setBlock(i + 31, j + 8, k + 0, Blocks.packed_ice);
			world.setBlock(i + 31, j + 8, k + 2, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 31, j + 8, k + 3, Blocks.stonebrick);
			world.setBlock(i + 31, j + 8, k + 4, Blocks.stonebrick);
			world.setBlock(i + 31, j + 8, k + 5, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 31, j + 8, k + 16, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 31, j + 8, k + 19, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 31, j + 8, k + 30, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 31, j + 8, k + 31, Blocks.stonebrick);
			world.setBlock(i + 31, j + 8, k + 32, Blocks.stonebrick);
			world.setBlock(i + 31, j + 8, k + 33, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 31, j + 8, k + 35, Blocks.packed_ice);
			world.setBlock(i + 31, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 9, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 9, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 9, k + 4, Blocks.chest, 4, 2);
			world.setBlock(i + 31, j + 9, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 9, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 9, k + 31, Blocks.chest, 4, 2);
			world.setBlock(i + 31, j + 9, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 9, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 10, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 10, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 10, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 10, k + 5, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 31, j + 10, k + 30, Blocks.stone_brick_stairs,
					2, 0);
			world.setBlock(i + 31, j + 10, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 10, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 10, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 31, j + 11, k + 2, Blocks.stone_brick_stairs);
			world.setBlock(i + 31, j + 11, k + 33, Blocks.stone_brick_stairs);
			world.setBlock(i + 32, j + 0, k + 2, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 32, j + 0, k + 3, Blocks.stonebrick);
			world.setBlock(i + 32, j + 0, k + 4, Blocks.stonebrick);
			world.setBlock(i + 32, j + 0, k + 5, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 32, j + 0, k + 16, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 32, j + 0, k + 17, Blocks.stonebrick);
			world.setBlock(i + 32, j + 0, k + 18, Blocks.stonebrick);
			world.setBlock(i + 32, j + 0, k + 19, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 32, j + 0, k + 30, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 32, j + 0, k + 31, Blocks.stonebrick);
			world.setBlock(i + 32, j + 0, k + 32, Blocks.stonebrick);
			world.setBlock(i + 32, j + 0, k + 33, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 32, j + 1, k + 3, Blocks.stonebrick);
			world.setBlock(i + 32, j + 1, k + 4, Blocks.stonebrick);
			world.setBlock(i + 32, j + 1, k + 17, Blocks.stonebrick);
			world.setBlock(i + 32, j + 1, k + 18, Blocks.stonebrick);
			world.setBlock(i + 32, j + 1, k + 31, Blocks.stonebrick);
			world.setBlock(i + 32, j + 1, k + 32, Blocks.stonebrick);
			world.setBlock(i + 32, j + 2, k + 3, Blocks.stonebrick);
			world.setBlock(i + 32, j + 2, k + 4, Blocks.stonebrick);
			world.setBlock(i + 32, j + 2, k + 17, Blocks.stonebrick);
			world.setBlock(i + 32, j + 2, k + 18, Blocks.stonebrick);
			world.setBlock(i + 32, j + 2, k + 31, Blocks.stonebrick);
			world.setBlock(i + 32, j + 2, k + 32, Blocks.stonebrick);
			world.setBlock(i + 32, j + 3, k + 3, Blocks.stonebrick);
			world.setBlock(i + 32, j + 3, k + 4, Blocks.stonebrick);
			world.setBlock(i + 32, j + 3, k + 17, Blocks.stonebrick);
			world.setBlock(i + 32, j + 3, k + 18, Blocks.stonebrick);
			world.setBlock(i + 32, j + 3, k + 31, Blocks.stonebrick);
			world.setBlock(i + 32, j + 3, k + 32, Blocks.stonebrick);
			world.setBlock(i + 32, j + 4, k + 3, Blocks.stonebrick);
			world.setBlock(i + 32, j + 4, k + 4, Blocks.stonebrick);
			world.setBlock(i + 32, j + 4, k + 17, Blocks.stonebrick);
			world.setBlock(i + 32, j + 4, k + 18, Blocks.stonebrick);
			world.setBlock(i + 32, j + 4, k + 31, Blocks.stonebrick);
			world.setBlock(i + 32, j + 4, k + 32, Blocks.stonebrick);
			world.setBlock(i + 32, j + 5, k + 3, Blocks.stonebrick);
			world.setBlock(i + 32, j + 5, k + 4, Blocks.stonebrick);
			world.setBlock(i + 32, j + 5, k + 17, Blocks.stonebrick);
			world.setBlock(i + 32, j + 5, k + 18, Blocks.stonebrick);
			world.setBlock(i + 32, j + 5, k + 31, Blocks.stonebrick);
			world.setBlock(i + 32, j + 5, k + 32, Blocks.stonebrick);
			world.setBlock(i + 32, j + 6, k + 3, Blocks.stonebrick);
			world.setBlock(i + 32, j + 6, k + 4, Blocks.stonebrick);
			world.setBlock(i + 32, j + 6, k + 17, Blocks.stonebrick);
			world.setBlock(i + 32, j + 6, k + 18, Blocks.stonebrick);
			world.setBlock(i + 32, j + 6, k + 31, Blocks.stonebrick);
			world.setBlock(i + 32, j + 6, k + 32, Blocks.stonebrick);
			world.setBlock(i + 32, j + 7, k + 3, Blocks.stonebrick);
			world.setBlock(i + 32, j + 7, k + 4, Blocks.stonebrick);
			world.setBlock(i + 32, j + 7, k + 17, Blocks.stonebrick);
			world.setBlock(i + 32, j + 7, k + 18, Blocks.stonebrick);
			world.setBlock(i + 32, j + 7, k + 31, Blocks.stonebrick);
			world.setBlock(i + 32, j + 7, k + 32, Blocks.stonebrick);
			world.setBlock(i + 32, j + 8, k + 2, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 32, j + 8, k + 3, Blocks.stonebrick);
			world.setBlock(i + 32, j + 8, k + 4, Blocks.stonebrick);
			world.setBlock(i + 32, j + 8, k + 5, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 32, j + 8, k + 16, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 32, j + 8, k + 19, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 32, j + 8, k + 30, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 32, j + 8, k + 31, Blocks.stonebrick);
			world.setBlock(i + 32, j + 8, k + 32, Blocks.stonebrick);
			world.setBlock(i + 32, j + 8, k + 33, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 32, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 9, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 9, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 9, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 9, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 9, k + 16, Blocks.stone_brick_stairs);
			world.setBlock(i + 32, j + 9, k + 19, Blocks.stone_brick_stairs);
			world.setBlock(i + 32, j + 9, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 9, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 9, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 9, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 10, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 10, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 10, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 10, k + 5, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 32, j + 10, k + 30, Blocks.stone_brick_stairs,
					2, 0);
			world.setBlock(i + 32, j + 10, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 10, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 10, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 32, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 0, k + 2, Blocks.stone_brick_stairs, 2,
					0);
			world.setBlock(i + 33, j + 0, k + 3, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 33, j + 0, k + 4, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 33, j + 0, k + 5, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 33, j + 0, k + 16, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 33, j + 0, k + 17, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 33, j + 0, k + 18, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 33, j + 0, k + 19, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 33, j + 0, k + 30, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 33, j + 0, k + 31, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 33, j + 0, k + 32, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 33, j + 0, k + 33, Blocks.stone_brick_stairs, 1,
					0);
			world.setBlock(i + 33, j + 7, k + 0, Blocks.packed_ice);
			world.setBlock(i + 33, j + 7, k + 35, Blocks.packed_ice);
			world.setBlock(i + 33, j + 8, k + 0, Blocks.packed_ice);
			world.setBlock(i + 33, j + 8, k + 2, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 33, j + 8, k + 3, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 33, j + 8, k + 4, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 33, j + 8, k + 5, Blocks.stone_brick_stairs, 7,
					0);
			world.setBlock(i + 33, j + 8, k + 16, Blocks.stone_brick_stairs, 6,
					0);
			world.setBlock(i + 33, j + 8, k + 17, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 33, j + 8, k + 18, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 33, j + 8, k + 19, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 33, j + 8, k + 30, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 33, j + 8, k + 31, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 33, j + 8, k + 32, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 33, j + 8, k + 33, Blocks.stone_brick_stairs, 5,
					0);
			world.setBlock(i + 33, j + 8, k + 35, Blocks.packed_ice);
			world.setBlock(i + 33, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 9, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 9, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 9, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 9, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 9, k + 16, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 9, k + 19, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 9, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 9, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 9, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 9, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 10, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 10, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 10, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 10, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 10, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 10, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 10, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 10, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 11, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 11, k + 4, Blocks.stone_brick_stairs, 3,
					0);
			world.setBlock(i + 33, j + 11, k + 31, Blocks.stone_brick_stairs,
					2, 0);
			world.setBlock(i + 33, j + 11, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 33, j + 12, k + 2, Blocks.stonebrick);
			world.setBlock(i + 33, j + 12, k + 33, Blocks.stonebrick);
			world.setBlock(i + 34, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 9, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 9, k + 6, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 9, k + 11, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 9, k + 16, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 9, k + 19, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 9, k + 24, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 9, k + 29, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 9, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 6, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 7, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 8, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 9, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 10, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 11, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 12, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 13, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 14, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 15, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 16, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 17, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 18, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 19, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 20, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 21, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 22, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 23, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 24, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 25, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 26, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 27, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 28, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 29, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 34, j + 10, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 6, k + 0, Blocks.packed_ice);
			world.setBlock(i + 35, j + 6, k + 16, Blocks.packed_ice);
			world.setBlock(i + 35, j + 6, k + 35, Blocks.packed_ice);
			world.setBlock(i + 35, j + 7, k + 0, Blocks.packed_ice);
			world.setBlock(i + 35, j + 7, k + 2, Blocks.packed_ice);
			world.setBlock(i + 35, j + 7, k + 16, Blocks.packed_ice);
			world.setBlock(i + 35, j + 7, k + 33, Blocks.packed_ice);
			world.setBlock(i + 35, j + 7, k + 35, Blocks.packed_ice);
			world.setBlock(i + 35, j + 8, k + 0, Blocks.packed_ice);
			world.setBlock(i + 35, j + 8, k + 2, Blocks.packed_ice);
			world.setBlock(i + 35, j + 8, k + 4, Blocks.packed_ice);
			world.setBlock(i + 35, j + 8, k + 16, Blocks.packed_ice);
			world.setBlock(i + 35, j + 8, k + 19, Blocks.packed_ice);
			world.setBlock(i + 35, j + 8, k + 31, Blocks.packed_ice);
			world.setBlock(i + 35, j + 8, k + 33, Blocks.packed_ice);
			world.setBlock(i + 35, j + 8, k + 35, Blocks.packed_ice);
			world.setBlock(i + 35, j + 9, k + 0, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 1, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 2, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 3, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 4, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 5, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 6, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 7, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 8, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 9, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 10, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 11, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 12, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 13, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 14, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 15, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 16, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 17, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 18, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 19, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 20, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 21, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 22, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 23, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 24, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 25, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 26, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 27, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 28, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 29, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 30, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 31, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 32, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 33, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 34, Blocks.mossy_cobblestone);
			world.setBlock(i + 35, j + 9, k + 35, Blocks.mossy_cobblestone);
			world.setBlock(i + 2, j + 1, k + 4, Blocks.vine, 8, 0);
			world.setBlock(i + 2, j + 1, k + 18, Blocks.vine, 8, 0);
			world.setBlock(i + 2, j + 2, k + 4, Blocks.vine, 8, 0);
			world.setBlock(i + 2, j + 2, k + 18, Blocks.vine, 8, 0);
			world.setBlock(i + 2, j + 3, k + 4, Blocks.vine, 8, 0);
			world.setBlock(i + 2, j + 3, k + 17, Blocks.vine, 8, 0);
			world.setBlock(i + 2, j + 3, k + 18, Blocks.vine, 8, 0);
			world.setBlock(i + 2, j + 4, k + 4, Blocks.vine, 8, 0);
			world.setBlock(i + 2, j + 4, k + 17, Blocks.vine, 8, 0);
			world.setBlock(i + 2, j + 4, k + 18, Blocks.vine, 8, 0);
			world.setBlock(i + 2, j + 5, k + 4, Blocks.vine, 8, 0);
			world.setBlock(i + 2, j + 5, k + 17, Blocks.vine, 8, 0);
			world.setBlock(i + 2, j + 5, k + 31, Blocks.vine, 8, 0);
			world.setBlock(i + 2, j + 6, k + 17, Blocks.vine, 8, 0);
			world.setBlock(i + 3, j + 1, k + 5, Blocks.vine, 4, 0);
			world.setBlock(i + 3, j + 1, k + 19, Blocks.vine, 4, 0);
			world.setBlock(i + 3, j + 2, k + 19, Blocks.vine, 4, 0);
			world.setBlock(i + 3, j + 2, k + 30, Blocks.vine, 1, 0);
			world.setBlock(i + 3, j + 3, k + 19, Blocks.vine, 4, 0);
			world.setBlock(i + 3, j + 5, k + 16, Blocks.vine, 1, 0);
			world.setBlock(i + 3, j + 8, k + 17, Blocks.lava);
			world.setBlock(i + 3, j + 8, k + 18, Blocks.lava);
			world.setBlock(i + 4, j + 1, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 4, j + 2, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 4, j + 2, k + 30, Blocks.vine, 1, 0);
			world.setBlock(i + 4, j + 2, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 4, j + 3, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 4, j + 3, k + 30, Blocks.vine, 1, 0);
			world.setBlock(i + 4, j + 3, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 4, j + 4, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 4, j + 4, k + 16, Blocks.vine, 1, 0);
			world.setBlock(i + 4, j + 4, k + 19, Blocks.vine, 4, 0);
			world.setBlock(i + 4, j + 4, k + 30, Blocks.vine, 1, 0);
			world.setBlock(i + 4, j + 4, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 4, j + 5, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 4, j + 5, k + 16, Blocks.vine, 1, 0);
			world.setBlock(i + 4, j + 5, k + 19, Blocks.vine, 4, 0);
			world.setBlock(i + 4, j + 5, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 4, j + 6, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 4, j + 6, k + 19, Blocks.vine, 4, 0);
			world.setBlock(i + 4, j + 7, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 4, j + 7, k + 30, Blocks.vine, 1, 0);
			world.setBlock(i + 4, j + 8, k + 17, Blocks.lava);
			world.setBlock(i + 4, j + 8, k + 18, Blocks.lava);
			world.setBlock(i + 5, j + 1, k + 3, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 1, k + 17, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 2, k + 3, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 2, k + 17, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 3, k + 3, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 3, k + 4, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 3, k + 17, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 4, k + 3, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 4, k + 4, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 4, k + 17, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 4, k + 32, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 5, k + 4, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 5, k + 18, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 5, k + 31, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 5, k + 32, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 6, k + 4, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 6, k + 18, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 6, k + 32, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 7, k + 3, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 7, k + 4, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 7, k + 31, Blocks.vine, 2, 0);
			world.setBlock(i + 5, j + 7, k + 32, Blocks.vine, 2, 0);
			world.setBlock(i + 16, j + 1, k + 32, Blocks.vine, 8, 0);
			world.setBlock(i + 16, j + 2, k + 4, Blocks.vine, 8, 0);
			world.setBlock(i + 16, j + 2, k + 32, Blocks.vine, 8, 0);
			world.setBlock(i + 16, j + 3, k + 4, Blocks.vine, 8, 0);
			world.setBlock(i + 16, j + 3, k + 32, Blocks.vine, 8, 0);
			world.setBlock(i + 16, j + 4, k + 4, Blocks.vine, 8, 0);
			world.setBlock(i + 16, j + 4, k + 31, Blocks.vine, 8, 0);
			world.setBlock(i + 16, j + 4, k + 32, Blocks.vine, 8, 0);
			world.setBlock(i + 16, j + 5, k + 4, Blocks.vine, 8, 0);
			world.setBlock(i + 16, j + 5, k + 32, Blocks.vine, 8, 0);
			world.setBlock(i + 16, j + 6, k + 4, Blocks.vine, 8, 0);
			world.setBlock(i + 16, j + 6, k + 32, Blocks.vine, 8, 0);
			world.setBlock(i + 16, j + 7, k + 32, Blocks.vine, 8, 0);
			world.setBlock(i + 17, j + 1, k + 5, Blocks.vine, 4, 0);
			world.setBlock(i + 17, j + 1, k + 17, Blocks.lava);
			world.setBlock(i + 17, j + 1, k + 18, Blocks.lava);
			world.setBlock(i + 17, j + 1, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 17, j + 2, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 17, j + 3, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 17, j + 3, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 17, j + 4, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 17, j + 4, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 17, j + 5, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 17, j + 6, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 17, j + 6, k + 5, Blocks.vine, 4, 0);
			world.setBlock(i + 17, j + 6, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 17, j + 7, k + 5, Blocks.vine, 4, 0);
			world.setBlock(i + 17, j + 7, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 17, j + 8, k + 3, Blocks.lava);
			world.setBlock(i + 17, j + 8, k + 4, Blocks.lava);
			world.setBlock(i + 17, j + 8, k + 31, Blocks.lava);
			world.setBlock(i + 17, j + 8, k + 32, Blocks.lava);
			world.setBlock(i + 18, j + 1, k + 5, Blocks.vine, 4, 0);
			world.setBlock(i + 18, j + 1, k + 17, Blocks.lava);
			world.setBlock(i + 18, j + 1, k + 18, Blocks.lava);
			world.setBlock(i + 18, j + 1, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 18, j + 2, k + 5, Blocks.vine, 4, 0);
			world.setBlock(i + 18, j + 2, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 18, j + 3, k + 5, Blocks.vine, 4, 0);
			world.setBlock(i + 18, j + 3, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 18, j + 4, k + 5, Blocks.vine, 4, 0);
			world.setBlock(i + 18, j + 4, k + 30, Blocks.vine, 1, 0);
			world.setBlock(i + 18, j + 5, k + 30, Blocks.vine, 1, 0);
			world.setBlock(i + 18, j + 6, k + 30, Blocks.vine, 1, 0);
			world.setBlock(i + 18, j + 7, k + 5, Blocks.vine, 4, 0);
			world.setBlock(i + 18, j + 7, k + 30, Blocks.vine, 1, 0);
			world.setBlock(i + 18, j + 7, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 18, j + 8, k + 3, Blocks.lava);
			world.setBlock(i + 18, j + 8, k + 4, Blocks.lava);
			world.setBlock(i + 18, j + 8, k + 31, Blocks.lava);
			world.setBlock(i + 18, j + 8, k + 32, Blocks.lava);
			world.setBlock(i + 19, j + 1, k + 4, Blocks.vine, 2, 0);
			world.setBlock(i + 19, j + 1, k + 32, Blocks.vine, 2, 0);
			world.setBlock(i + 19, j + 2, k + 32, Blocks.vine, 2, 0);
			world.setBlock(i + 19, j + 3, k + 4, Blocks.vine, 2, 0);
			world.setBlock(i + 19, j + 3, k + 32, Blocks.vine, 2, 0);
			world.setBlock(i + 19, j + 4, k + 4, Blocks.vine, 2, 0);
			world.setBlock(i + 19, j + 4, k + 31, Blocks.vine, 2, 0);
			world.setBlock(i + 19, j + 5, k + 31, Blocks.vine, 2, 0);
			world.setBlock(i + 19, j + 6, k + 3, Blocks.vine, 2, 0);
			world.setBlock(i + 19, j + 6, k + 31, Blocks.vine, 2, 0);
			world.setBlock(i + 30, j + 1, k + 31, Blocks.vine, 8, 0);
			world.setBlock(i + 30, j + 1, k + 32, Blocks.vine, 8, 0);
			world.setBlock(i + 30, j + 2, k + 4, Blocks.vine, 8, 0);
			world.setBlock(i + 30, j + 2, k + 31, Blocks.vine, 8, 0);
			world.setBlock(i + 30, j + 2, k + 32, Blocks.vine, 8, 0);
			world.setBlock(i + 30, j + 3, k + 4, Blocks.vine, 8, 0);
			world.setBlock(i + 30, j + 3, k + 18, Blocks.vine, 8, 0);
			world.setBlock(i + 30, j + 3, k + 31, Blocks.vine, 8, 0);
			world.setBlock(i + 30, j + 4, k + 3, Blocks.vine, 8, 0);
			world.setBlock(i + 30, j + 4, k + 4, Blocks.vine, 8, 0);
			world.setBlock(i + 30, j + 4, k + 18, Blocks.vine, 8, 0);
			world.setBlock(i + 30, j + 5, k + 3, Blocks.vine, 8, 0);
			world.setBlock(i + 30, j + 6, k + 3, Blocks.vine, 8, 0);
			world.setBlock(i + 31, j + 1, k + 19, Blocks.vine, 4, 0);
			world.setBlock(i + 31, j + 2, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 31, j + 2, k + 16, Blocks.vine, 1, 0);
			world.setBlock(i + 31, j + 3, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 31, j + 3, k + 16, Blocks.vine, 1, 0);
			world.setBlock(i + 31, j + 4, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 31, j + 4, k + 19, Blocks.vine, 4, 0);
			world.setBlock(i + 31, j + 5, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 31, j + 5, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 31, j + 6, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 31, j + 6, k + 5, Blocks.vine, 4, 0);
			world.setBlock(i + 31, j + 6, k + 16, Blocks.vine, 1, 0);
			world.setBlock(i + 31, j + 8, k + 17, Blocks.lava);
			world.setBlock(i + 31, j + 8, k + 18, Blocks.lava);
			world.setBlock(i + 32, j + 1, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 32, j + 1, k + 19, Blocks.vine, 4, 0);
			world.setBlock(i + 32, j + 1, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 32, j + 2, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 32, j + 2, k + 5, Blocks.vine, 4, 0);
			world.setBlock(i + 32, j + 2, k + 16, Blocks.vine, 1, 0);
			world.setBlock(i + 32, j + 2, k + 19, Blocks.vine, 4, 0);
			world.setBlock(i + 32, j + 2, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 32, j + 3, k + 2, Blocks.vine, 1, 0);
			world.setBlock(i + 32, j + 3, k + 5, Blocks.vine, 4, 0);
			world.setBlock(i + 32, j + 3, k + 19, Blocks.vine, 4, 0);
			world.setBlock(i + 32, j + 3, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 32, j + 4, k + 16, Blocks.vine, 1, 0);
			world.setBlock(i + 32, j + 4, k + 19, Blocks.vine, 4, 0);
			world.setBlock(i + 32, j + 4, k + 30, Blocks.vine, 1, 0);
			world.setBlock(i + 32, j + 4, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 32, j + 5, k + 16, Blocks.vine, 1, 0);
			world.setBlock(i + 32, j + 5, k + 30, Blocks.vine, 1, 0);
			world.setBlock(i + 32, j + 5, k + 33, Blocks.vine, 4, 0);
			world.setBlock(i + 32, j + 6, k + 16, Blocks.vine, 1, 0);
			world.setBlock(i + 32, j + 6, k + 30, Blocks.vine, 1, 0);
			world.setBlock(i + 32, j + 7, k + 16, Blocks.vine, 1, 0);
			world.setBlock(i + 32, j + 8, k + 17, Blocks.lava);
			world.setBlock(i + 32, j + 8, k + 18, Blocks.lava);
			world.setBlock(i + 33, j + 1, k + 3, Blocks.vine, 2, 0);
			world.setBlock(i + 33, j + 1, k + 32, Blocks.vine, 2, 0);
			world.setBlock(i + 33, j + 2, k + 3, Blocks.vine, 2, 0);
			world.setBlock(i + 33, j + 2, k + 31, Blocks.vine, 2, 0);
			world.setBlock(i + 33, j + 2, k + 32, Blocks.vine, 2, 0);
			world.setBlock(i + 33, j + 3, k + 3, Blocks.vine, 2, 0);
			world.setBlock(i + 33, j + 3, k + 31, Blocks.vine, 2, 0);
			world.setBlock(i + 33, j + 4, k + 18, Blocks.vine, 2, 0);
			world.setBlock(i + 33, j + 4, k + 31, Blocks.vine, 2, 0);
			world.setBlock(i + 33, j + 5, k + 3, Blocks.vine, 2, 0);
			world.setBlock(i + 33, j + 5, k + 18, Blocks.vine, 2, 0);
			world.setBlock(i + 33, j + 5, k + 31, Blocks.vine, 2, 0);
			world.setBlock(i + 33, j + 6, k + 31, Blocks.vine, 2, 0);

			return true;
		}
		return false;
	}
}