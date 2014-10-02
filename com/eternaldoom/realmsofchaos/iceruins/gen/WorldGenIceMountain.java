package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenIceMountain extends WorldGenerator {

	private BlockPos helperPos = new BlockPos(0, 0, 0);
    private World helperWorld = null;
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		
		int i = pos.getX(), j = pos.getY(), k = pos.getZ();
    	helperWorld = world;

		Random random = new Random();

		int size = random.nextInt(25) + 40;

		if (getBlock(i, j + 11, k) != Blocks.air
				&& getBlock(i, j + 14, k) == Blocks.air) {
			for (int o = 1; o < size; o++) {

				setBlock(i + 2, j + o, k + 2, Blocks.ice);

				for (int r = 1; r < size; r++) {
					setBlock(i + 2 + r, j, k + 2, Blocks.ice);

					int tri = (int) Math.sqrt((double) (o * o)
							+ (double) (r * r));

					if(tri<size)
					setBlock(i + 2 + size - tri, j + tri, k + 2,
							Blocks.ice);

					for (int a = tri + j; a < tri + j + random.nextInt(6); a++) {
						if(tri<size)
						setBlock(i + 2 + size - tri, a, k + 2, Blocks.ice);
					}

					for (int down = tri + j - 1; down > j; down--) {
						if (getBlock(i - tri + 2 + size, down, k + 2) == Blocks.air) {
							if(tri<size)
							setBlock(i - tri + 2 + size, down, k + 2,
									Blocks.ice);
						} else if (getBlock(i - tri + 2 + size, down,
								k + 2) != Blocks.air) {
							break;
						}
					}
				}

				for (int r = 1; r < size; r++) {
					setBlock(i + 2 - r, j, k + 2, Blocks.ice);

					int tri = (int) Math.sqrt((double) (o * o)
							+ (double) (r * r));

					if(tri<size)
					setBlock(i - 2 - size + tri, j + tri, k + 2,
							Blocks.ice);

					for (int a = tri + j; a < tri + j + random.nextInt(6); a++) {
						if(tri<size)
						setBlock(i - 2 - size + tri, a, k + 2, Blocks.ice);
					}

					for (int down = tri + j - 1; down > j; down--) {
						if (getBlock(i + tri - 2 - size, down, k + 2) == Blocks.air) {
							if(tri<size)
							setBlock(i + tri - 2 - size, down, k + 2,
									Blocks.ice);
						} else if (getBlock(i + tri - 2 - size, down,
								k + 2) != Blocks.air) {
							break;
						}
					}
				}

				for (int r = 1; r < size; r++) {
					setBlock(i + 2, j, k + 2 + r, Blocks.ice);

					int tri = (int) Math.sqrt((double) (o * o)
							+ (double) (r * r));

					if(tri<size)
					setBlock(i + 2, j + tri, k + 2 + size - tri,
							Blocks.ice);

					for (int a = tri + j; a < tri + j + random.nextInt(6); a++) {
						if(tri<size)
						setBlock(i + 2, a, k + 2 + size - tri, Blocks.ice);
					}

					for (int down = tri + j - 1; down > j; down--) {
						if (getBlock(i + 2, down, k + 2 + size - tri) == Blocks.air) {
							if(tri<size)
							setBlock(i + 2, down, k + 2 + size - tri,
									Blocks.ice);
						} else if (getBlock(i + 2, down, k + 2 + size
								- tri) != Blocks.air) {
							break;
						}
					}
				}

				for (int r = 1; r < size; r++) {
					setBlock(i + 2, j, k + 2 - r, Blocks.ice);

					int tri = (int) Math.sqrt((double) (o * o)
							+ (double) (r * r));

					if(tri<size)
					setBlock(i + 2, j + tri, k - 2 - size + tri,
							Blocks.ice);

					for (int a = tri + j; a < tri + j + random.nextInt(6); a++) {
						if(tri<size)
						setBlock(i + 2, a, k - 2 - size + tri, Blocks.ice);
					}

					for (int down = tri + j - 1; down > j; down--) {
						if (getBlock(i + 2, down, k - 2 - size + tri) == Blocks.air) {
							if(tri<size)
							setBlock(i + 2, down, k - 2 - size + tri,
									Blocks.ice);
						} else if (getBlock(i + 2, down, k - 2 - size
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
								if (getBlock(i + root + 2 - ycoord, j
										+ rough - ycoord, k + root + 2) != Blocks.ice && root<size)
									setBlock(i + root + 2 - ycoord, j
											+ rough - ycoord, k + root + 2,
											Blocks.ice);
								else if (getBlock(i + root + 2, j + rough
										- ycoord, k + root + 2 - ycoord) != Blocks.ice && root<size)
									setBlock(i + root + 2, j + rough
											- ycoord, k + root + 2 - ycoord,
											Blocks.ice);
								else if (getBlock(i - root + 2 + ycoord,
										j + rough - ycoord, k + root + 2) != Blocks.ice && root<size)
									setBlock(i - root + 2 + ycoord, j
											+ rough - ycoord, k + root + 2,
											Blocks.ice);
								else if (getBlock(i + root - 2 - ycoord,
										j + rough - ycoord, k - root + 2) != Blocks.ice && root<size) {
									setBlock(i + root - 2 - ycoord, j
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
	
	private void setBlock(int i, int j, int k, Block block){
    	this.helperWorld.setBlockState(this.helperPos.add(i, j, k), block.getDefaultState());
    }
	
	private Block getBlock(int i, int j, int k){
		return this.helperWorld.getBlockState(this.helperPos.add(i, j, k)).getBlock();
	}
    
    private void setBlock(int i, int j, int k, Block block, int meta, int flag){
    	this.helperWorld.setBlockState(this.helperPos.add(i, j, k), block.getStateFromMeta(meta), flag);
    }
}