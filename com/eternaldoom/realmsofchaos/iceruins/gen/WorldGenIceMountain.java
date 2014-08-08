package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenIceMountain extends WorldGenerator {

	@Override
	public boolean generate(World world, Random rand, int i, int j, int k) {

		Random random = new Random();

		if (world.getBlock(i, j + 11, k) != Blocks.air
				&& world.getBlock(i, j + 14, k) == Blocks.air) {
			for (int o = 1; o < 20; o++) {

				world.setBlock(i + 2, j + o, k + 2, Blocks.ice);

				for (int r = 1; r < 20; r++) {
					world.setBlock(i + 2 + r, j, k + 2, Blocks.ice);

					int tri = (int) Math.sqrt((double) (o * o)
							+ (double) (r * r));

					world.setBlock(i + 22 - tri, j + tri, k + 2, Blocks.ice);

					for (int a = tri + j; a < tri + j + random.nextInt(12); a++) {
						world.setBlock(i + 22 - tri, a, k + 2, Blocks.ice);
					}

					for (int down = tri + j - 1; down > j; down--) {
						if (world.getBlock(i - tri + 22, down, k + 2) == Blocks.air) {
							world.setBlock(i - tri + 22, down, k + 2,
									Blocks.ice);
						} else if (world.getBlock(i - tri + 22, down, k + 2) != Blocks.air) {
							break;
						}
					}
				}

				for (int r = 1; r < 20; r++) {
					world.setBlock(i + 2 - r, j, k + 2, Blocks.ice);

					int tri = (int) Math.sqrt((double) (o * o)
							+ (double) (r * r));

					world.setBlock(i - 22 + tri, j + tri, k + 2, Blocks.ice);

					for (int a = tri + j; a < tri + j + random.nextInt(12); a++) {
						world.setBlock(i - 22 + tri, a, k + 2, Blocks.ice);
					}

					for (int down = tri + j - 1; down > j; down--) {
						if (world.getBlock(i + tri - 22, down, k + 2) == Blocks.air) {
							world.setBlock(i + tri - 22, down, k + 2,
									Blocks.ice);
						} else if (world.getBlock(i + tri - 22, down, k + 2) != Blocks.air) {
							break;
						}
					}
				}

				for (int r = 1; r < 20; r++) {
					world.setBlock(i + 2, j, k + 2 + r, Blocks.ice);

					int tri = (int) Math.sqrt((double) (o * o)
							+ (double) (r * r));

					world.setBlock(i + 2, j + tri, k + 22 - tri, Blocks.ice);

					for (int a = tri + j; a < tri + j + random.nextInt(12); a++) {
						world.setBlock(i + 2, a, k + 22 - tri, Blocks.ice);
					}

					for (int down = tri + j - 1; down > j; down--) {
						if (world.getBlock(i + 2, down, k + 22 - tri) == Blocks.air) {
							world.setBlock(i + 2, down, k + 22 - tri,
									Blocks.ice);
						} else if (world.getBlock(i + 2, down, k + 22 - tri) != Blocks.air) {
							break;
						}
					}
				}

				for (int r = 1; r < 20; r++) {
					world.setBlock(i + 2, j, k + 2 - r, Blocks.ice);

					int tri = (int) Math.sqrt((double) (o * o)
							+ (double) (r * r));

					world.setBlock(i + 2, j + tri, k - 22 + tri, Blocks.ice);

					for (int a = tri + j; a < tri + j + random.nextInt(12); a++) {
						world.setBlock(i + 2, a, k - 22 + tri, Blocks.ice);
					}

					for (int down = tri + j - 1; down > j; down--) {
						if (world.getBlock(i + 2, down, k - 22 + tri) == Blocks.air) {
							world.setBlock(i + 2, down, k - 22 + tri,
									Blocks.ice);
						} else if (world.getBlock(i + 2, down, k - 22 - tri) != Blocks.air) {
							break;
						}
					}
				}

				for (int ycoord = 0; ycoord < 20; ycoord++) {
					for (int xcoord = ycoord; xcoord > 0; xcoord--) {
						for (int zcoord = ycoord; zcoord > 0; zcoord--) {
							int root = (int) Math.round(Math
									.sqrt((double) (xcoord * xcoord)
											+ (double) (zcoord * zcoord)));

							for (int rough = 0; rough < random.nextInt(12) + 20; rough++) {
								if (world.getBlock(i + root + 2 - ycoord, j
										+ rough - ycoord, k + root + 2) != Blocks.ice)
									world.setBlock(i + root + 2 - ycoord, j
											+ rough - ycoord, k + root + 2,
											Blocks.ice);
								if (world.getBlock(i + root + 2, j + rough
										- ycoord, k + root + 2 - ycoord) != Blocks.ice)
									world.setBlock(i + root + 2, j + rough
											- ycoord, k + root + 2 - ycoord,
											Blocks.ice);
								if (world.getBlock(i - root + 2 + ycoord, j
										+ rough - ycoord, k + root + 2) != Blocks.ice)
									world.setBlock(i - root + 2 + ycoord, j
											+ rough - ycoord, k + root + 2,
											Blocks.ice);
								if (world.getBlock(i + root - 2 - ycoord, j
										+ rough - ycoord, k - root + 2) != Blocks.ice)
									world.setBlock(i + root - 2 - ycoord, j
											+ rough - ycoord, k - root + 2,
											Blocks.ice);
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
