/*
 *** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
 */

package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRuinsTower extends WorldGenerator {
	
	private BlockPos helperPos = new BlockPos(0, 0, 0);
    private World helperWorld = null;
    
	public boolean generate(World world, Random rand, BlockPos pos) {
		
		int i = pos.getX(), j = pos.getY(), k = pos.getZ();
    	helperWorld = world;
    	
		if (getBlock(i, j, k) == Blocks.air
				&& getBlock(i, j - 1, k) != Blocks.air
				&& getBlock(i+4, j-1, k) != Blocks.air
				&& getBlock(i, j-1, k+4) != Blocks.air
				&& getBlock(i+4, j-1, k+4) != Blocks.air) {
			setBlock(i + 0, j + 0, k + 1, Blocks.packed_ice);
			setBlock(i + 1, j + 0, k + 3, Blocks.packed_ice);
			setBlock(i + 1, j + 0, k + 4, Blocks.packed_ice);
			setBlock(i + 1, j + 1, k + 2, Blocks.packed_ice);
			setBlock(i + 1, j + 1, k + 4, Blocks.packed_ice);
			setBlock(i + 1, j + 2, k + 2, Blocks.packed_ice);
			setBlock(i + 1, j + 4, k + 1, Blocks.stone_brick_stairs, 4, 2);
			setBlock(i + 1, j + 5, k + 1, Blocks.stone_brick_stairs, 2, 2);
			setBlock(i + 1, j + 5, k + 2, Blocks.packed_ice);
			setBlock(i + 1, j + 6, k + 2, Blocks.packed_ice);
			setBlock(i + 2, j + 0, k + 1, Blocks.packed_ice);
			setBlock(i + 2, j + 0, k + 2, Blocks.mossy_cobblestone);
			setBlock(i + 2, j + 0, k + 3, Blocks.stone_brick_stairs);
			setBlock(i + 2, j + 0, k + 4, Blocks.packed_ice);
			setBlock(i + 2, j + 1, k + 1, Blocks.packed_ice);
			setBlock(i + 2, j + 1, k + 2, Blocks.mossy_cobblestone);
			setBlock(i + 2, j + 1, k + 4, Blocks.packed_ice);
			setBlock(i + 2, j + 2, k + 2, Blocks.mossy_cobblestone);
			setBlock(i + 2, j + 2, k + 3, Blocks.packed_ice);
			setBlock(i + 2, j + 3, k + 2, Blocks.mossy_cobblestone);
			setBlock(i + 2, j + 3, k + 3, Blocks.packed_ice);
			setBlock(i + 2, j + 4, k + 1, Blocks.packed_ice);
			setBlock(i + 2, j + 4, k + 2, Blocks.mossy_cobblestone);
			setBlock(i + 2, j + 5, k + 1, Blocks.packed_ice);
			setBlock(i + 2, j + 5, k + 2, Blocks.mossy_cobblestone);
			setBlock(i + 2, j + 6, k + 2, Blocks.mossy_cobblestone);
			setBlock(i + 2, j + 7, k + 2, Blocks.mossy_cobblestone);
			setBlock(i + 2, j + 7, k + 3, Blocks.packed_ice);
			setBlock(i + 2, j + 8, k + 2, Blocks.mossy_cobblestone);
			setBlock(i + 2, j + 8, k + 3, Blocks.packed_ice);
			setBlock(i + 2, j + 9, k + 2, Blocks.mossy_cobblestone);
			setBlock(i + 2, j + 10, k + 2, Blocks.packed_ice);
			setBlock(i + 2, j + 11, k + 2, Blocks.packed_ice);
			setBlock(i + 3, j + 0, k + 0, Blocks.packed_ice);
			setBlock(i + 3, j + 0, k + 2, Blocks.packed_ice);
			setBlock(i + 3, j + 0, k + 3, Blocks.stone_brick_stairs, 5, 2);
			setBlock(i + 3, j + 1, k + 0, Blocks.packed_ice);
			setBlock(i + 3, j + 1, k + 2, Blocks.stone_brick_stairs, 6, 2);
			setBlock(i + 3, j + 2, k + 1, Blocks.stone_brick_stairs, 6, 2);
			setBlock(i + 3, j + 2, k + 2, Blocks.stone_brick_stairs, 3, 2);
			setBlock(i + 3, j + 3, k + 1, Blocks.stone_brick_stairs, 1, 2);
			setBlock(i + 3, j + 3, k + 2, Blocks.packed_ice);
			setBlock(i + 3, j + 4, k + 2, Blocks.packed_ice);
			setBlock(i + 4, j + 0, k + 0, Blocks.packed_ice);
			setBlock(i + 4, j + 0, k + 2, Blocks.packed_ice);
			setBlock(i + 4, j + 0, k + 3, Blocks.packed_ice);
			setBlock(i + 4, j + 1, k + 2, Blocks.packed_ice);

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