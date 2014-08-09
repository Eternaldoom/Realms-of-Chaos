package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenIceMountain extends WorldGenerator {

	@Override
	public boolean generate(World world, Random rand, int i, int j, int k) {

		Random random = new Random();

		int size = random.nextInt(25) + 40;

		if (world.getBlock(i, j + 11, k) != Blocks.air
				&& world.getBlock(i, j + 14, k) == Blocks.air) {
			for (int o = 1; o < size; o++) {

				world.setBlock(i + 2, j + o, k + 2, Blocks.ice);

				for (int r = 1; r < size; r++) {
					world.setBlock(i + 2 + r, j, k + 2, Blocks.ice);

					int tri = (int) Math.sqrt((double) (o * o)
							+ (double) (r * r));

					if(tri<size)
					world.setBlock(i + 2 + size - tri, j + tri, k + 2,
							Blocks.ice);

					for (int a = tri + j; a < tri + j + random.nextInt(6); a++) {
						if(tri<size)
						world.setBlock(i + 2 + size - tri, a, k + 2, Blocks.ice);
					}

					for (int down = tri + j - 1; down > j; down--) {
						if (world.getBlock(i - tri + 2 + size, down, k + 2) == Blocks.air) {
							if(tri<size)
							world.setBlock(i - tri + 2 + size, down, k + 2,
									Blocks.ice);
						} else if (world.getBlock(i - tri + 2 + size, down,
								k + 2) != Blocks.air) {
							break;
						}
					}
				}

				for (int r = 1; r < size; r++) {
					world.setBlock(i + 2 - r, j, k + 2, Blocks.ice);

					int tri = (int) Math.sqrt((double) (o * o)
							+ (double) (r * r));

					if(tri<size)
					world.setBlock(i - 2 - size + tri, j + tri, k + 2,
							Blocks.ice);

					for (int a = tri + j; a < tri + j + random.nextInt(6); a++) {
						if(tri<size)
						world.setBlock(i - 2 - size + tri, a, k + 2, Blocks.ice);
					}

					for (int down = tri + j - 1; down > j; down--) {
						if (world.getBlock(i + tri - 2 - size, down, k + 2) == Blocks.air) {
							if(tri<size)
							world.setBlock(i + tri - 2 - size, down, k + 2,
									Blocks.ice);
						} else if (world.getBlock(i + tri - 2 - size, down,
								k + 2) != Blocks.air) {
							break;
						}
					}
				}

				for (int r = 1; r < size; r++) {
					world.setBlock(i + 2, j, k + 2 + r, Blocks.ice);

					int tri = (int) Math.sqrt((double) (o * o)
							+ (double) (r * r));

					if(tri<size)
					world.setBlock(i + 2, j + tri, k + 2 + size - tri,
							Blocks.ice);

					for (int a = tri + j; a < tri + j + random.nextInt(6); a++) {
						if(tri<size)
						world.setBlock(i + 2, a, k + 2 + size - tri, Blocks.ice);
					}

					for (int down = tri + j - 1; down > j; down--) {
						if (world.getBlock(i + 2, down, k + 2 + size - tri) == Blocks.air) {
							if(tri<size)
							world.setBlock(i + 2, down, k + 2 + size - tri,
									Blocks.ice);
						} else if (world.getBlock(i + 2, down, k + 2 + size
								- tri) != Blocks.air) {
							break;
						}
					}
				}

				for (int r = 1; r < size; r++) {
					world.setBlock(i + 2, j, k + 2 - r, Blocks.ice);

					int tri = (int) Math.sqrt((double) (o * o)
							+ (double) (r * r));

					if(tri<size)
					world.setBlock(i + 2, j + tri, k - 2 - size + tri,
							Blocks.ice);

					for (int a = tri + j; a < tri + j + random.nextInt(6); a++) {
						if(tri<size)
						world.setBlock(i + 2, a, k - 2 - size + tri, Blocks.ice);
					}

					for (int down = tri + j - 1; down > j; down--) {
						if (world.getBlock(i + 2, down, k - 2 - size + tri) == Blocks.air) {
							if(tri<size)
							world.setBlock(i + 2, down, k - 2 - size + tri,
									Blocks.ice);
						} else if (world.getBlock(i + 2, down, k - 2 - size
								- tri) != Blocks.air) {
							break;
						}
					}
				}

				for (int ycoord = 0; ycoord < size; ycoord++) {
					for (int xcoord = ycoord; xcoord > 0; xcoord--) {
						for (int zcoord = ycoord; zcoord > 0; zcoord--) {
							int root = (int) Math.round(Math
									.sqrt((double) (xcoord * xcoord)
											+ (double) (zcoord * zcoord)));

							for (int rough = 0; rough < random.nextInt(12)
									+ size; rough++) {
								if (world.getBlock(i + root + 2 - ycoord, j
										+ rough - ycoord, k + root + 2) != Blocks.ice && root<size)
									world.setBlock(i + root + 2 - ycoord, j
											+ rough - ycoord, k + root + 2,
											Blocks.ice);
								else if (world.getBlock(i + root + 2, j + rough
										- ycoord, k + root + 2 - ycoord) != Blocks.ice && root<size)
									world.setBlock(i + root + 2, j + rough
											- ycoord, k + root + 2 - ycoord,
											Blocks.ice);
								else if (world.getBlock(i - root + 2 + ycoord,
										j + rough - ycoord, k + root + 2) != Blocks.ice && root<size)
									world.setBlock(i - root + 2 + ycoord, j
											+ rough - ycoord, k + root + 2,
											Blocks.ice);
								else if (world.getBlock(i + root - 2 - ycoord,
										j + rough - ycoord, k - root + 2) != Blocks.ice && root<size) {
									world.setBlock(i + root - 2 - ycoord, j
											+ rough - ycoord, k - root + 2,
											Blocks.ice);
								} else {
									break;
								}
							}
						}
					}
				}
			}

			return true;
		}
		return false;
	}
}