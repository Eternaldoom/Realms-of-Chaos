package com.eternaldoom.realmsofchaos.overworld.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BlockXylite extends OverworldBlock {

	public BlockXylite() {
		super(Material.iron, "realmsofchaos:xylite_block", "blockXylite", 7.5f,
				13.5f, soundTypeMetal);
		register("xylite_block");
		setTickRandomly(true);
	}

	public int onBlockPlaced(World world, int i, int j, int k, int p_149660_5_,
			float p_149660_6_, float p_149660_7_, float p_149660_8_,
			int p_149660_9_) {
		if (world.getBlock(i, j + 1, k) == Blocks.water
				&& world.getBlock(i + 1, j, k) == Blocks.water
				&& world.getBlock(i + 1, j + 1, k) == Blocks.water
				&& world.getBlock(i, j, k + 1) == Blocks.water
				&& world.getBlock(i, j + 1, k + 1) == Blocks.water
				&& world.getBlock(i + 1, j, k + 1) == Blocks.water
				&& world.getBlock(i + 1, j + 1, k + 1) == Blocks.water
				&& world.getBlock(i, j, k+2) == Blocks.stonebrick
				&& world.getBlock(i, j+1, k+2) == Blocks.stonebrick
				&& world.getBlock(i+1, j, k+2) == Blocks.stonebrick
				&& world.getBlock(i+1, j+1, k+2) == Blocks.stonebrick
				&& world.getBlock(i+2, j, k) == Blocks.stonebrick
				&& world.getBlock(i+2, j+1, k) == Blocks.stonebrick
				&& world.getBlock(i+2, j, k+1) == Blocks.stonebrick
				&& world.getBlock(i+2, j+1, k+1) == Blocks.stonebrick
				&& world.getBlock(i, j, k-1) == Blocks.stonebrick
				&& world.getBlock(i, j+1, k-1) == Blocks.stonebrick
				&& world.getBlock(i+1, j, k-1) == Blocks.stonebrick
				&& world.getBlock(i+1, j+1, k-1) == Blocks.stonebrick
				&& world.getBlock(i-1, j, k) == Blocks.stonebrick
				&& world.getBlock(i-1, j+1, k) == Blocks.stonebrick
				&& world.getBlock(i-1, j, k+1) == Blocks.stonebrick
				&& world.getBlock(i-1, j+1, k+1) == Blocks.stonebrick
				&& world.getBlock(i, j-1, k) == Blocks.stonebrick
				&& world.getBlock(i, j-1, k+1) == Blocks.stonebrick
				&& world.getBlock(i+1, j-1, k+1) == Blocks.stonebrick
				&& world.getBlock(i+1, j-1, k) == Blocks.stonebrick
		){
			world.setBlock(i, j + 1, k, ROCBlocks.water_portal);
			world.setBlock(i + 1, j, k, ROCBlocks.water_portal);
			world.setBlock(i + 1, j + 1, k, ROCBlocks.water_portal);
			world.setBlock(i, j, k + 1, ROCBlocks.water_portal);
			world.setBlock(i, j + 1, k + 1, ROCBlocks.water_portal);
			world.setBlock(i + 1, j, k + 1, ROCBlocks.water_portal);
			world.setBlock(i + 1, j + 1, k + 1, ROCBlocks.water_portal);
		}
		
		if (world.getBlock(i, j + 1, k) == Blocks.water
				&& world.getBlock(i - 1, j, k) == Blocks.water
				&& world.getBlock(i - 1, j + 1, k) == Blocks.water
				&& world.getBlock(i, j, k + 1) == Blocks.water
				&& world.getBlock(i, j + 1, k + 1) == Blocks.water
				&& world.getBlock(i - 1, j, k + 1) == Blocks.water
				&& world.getBlock(i - 1, j + 1, k + 1) == Blocks.water
				&& world.getBlock(i, j, k+2) == Blocks.stonebrick
				&& world.getBlock(i, j+1, k+2) == Blocks.stonebrick
				&& world.getBlock(i-1, j, k+2) == Blocks.stonebrick
				&& world.getBlock(i-1, j+1, k+2) == Blocks.stonebrick
				&& world.getBlock(i-2, j, k) == Blocks.stonebrick
				&& world.getBlock(i-2, j+1, k) == Blocks.stonebrick
				&& world.getBlock(i-2, j, k+1) == Blocks.stonebrick
				&& world.getBlock(i-2, j+1, k+1) == Blocks.stonebrick
				&& world.getBlock(i, j, k-1) == Blocks.stonebrick
				&& world.getBlock(i, j+1, k-1) == Blocks.stonebrick
				&& world.getBlock(i-1, j, k-1) == Blocks.stonebrick
				&& world.getBlock(i-1, j+1, k-1) == Blocks.stonebrick
				&& world.getBlock(i+1, j, k) == Blocks.stonebrick
				&& world.getBlock(i+1, j+1, k) == Blocks.stonebrick
				&& world.getBlock(i+1, j, k+1) == Blocks.stonebrick
				&& world.getBlock(i+1, j+1, k+1) == Blocks.stonebrick
				&& world.getBlock(i, j-1, k) == Blocks.stonebrick
				&& world.getBlock(i, j-1, k+1) == Blocks.stonebrick
				&& world.getBlock(i-1, j-1, k+1) == Blocks.stonebrick
				&& world.getBlock(i-1, j-1, k) == Blocks.stonebrick
				) {
			world.setBlock(i, j + 1, k, ROCBlocks.water_portal);
			world.setBlock(i - 1, j, k, ROCBlocks.water_portal);
			world.setBlock(i - 1, j + 1, k, ROCBlocks.water_portal);
			world.setBlock(i, j, k + 1, ROCBlocks.water_portal);
			world.setBlock(i, j + 1, k + 1, ROCBlocks.water_portal);
			world.setBlock(i - 1, j, k + 1, ROCBlocks.water_portal);
			world.setBlock(i - 1, j + 1, k + 1, ROCBlocks.water_portal);
		}
		
		if (world.getBlock(i, j + 1, k) == Blocks.water
				&& world.getBlock(i + 1, j, k) == Blocks.water
				&& world.getBlock(i + 1, j + 1, k) == Blocks.water
				&& world.getBlock(i, j, k - 1) == Blocks.water
				&& world.getBlock(i, j + 1, k - 1) == Blocks.water
				&& world.getBlock(i + 1, j, k - 1) == Blocks.water
				&& world.getBlock(i + 1, j + 1, k - 1) == Blocks.water
				&& world.getBlock(i, j, k-2) == Blocks.stonebrick
				&& world.getBlock(i, j+1, k-2) == Blocks.stonebrick
				&& world.getBlock(i+1, j, k-2) == Blocks.stonebrick
				&& world.getBlock(i+1, j+1, k-2) == Blocks.stonebrick
				&& world.getBlock(i+2, j, k) == Blocks.stonebrick
				&& world.getBlock(i+2, j+1, k) == Blocks.stonebrick
				&& world.getBlock(i+2, j, k-1) == Blocks.stonebrick
				&& world.getBlock(i+2, j+1, k-1) == Blocks.stonebrick
				&& world.getBlock(i, j, k+1) == Blocks.stonebrick
				&& world.getBlock(i, j+1, k+1) == Blocks.stonebrick
				&& world.getBlock(i+1, j, k+1) == Blocks.stonebrick
				&& world.getBlock(i+1, j+1, k+1) == Blocks.stonebrick
				&& world.getBlock(i-1, j, k) == Blocks.stonebrick
				&& world.getBlock(i-1, j+1, k) == Blocks.stonebrick
				&& world.getBlock(i-1, j, k-1) == Blocks.stonebrick
				&& world.getBlock(i-1, j+1, k-1) == Blocks.stonebrick
				&& world.getBlock(i, j-1, k) == Blocks.stonebrick
				&& world.getBlock(i, j-1, k-1) == Blocks.stonebrick
				&& world.getBlock(i+1, j-1, k-1) == Blocks.stonebrick
				&& world.getBlock(i+1, j-1, k) == Blocks.stonebrick
				) {
			world.setBlock(i, j + 1, k, ROCBlocks.water_portal);
			world.setBlock(i + 1, j, k, ROCBlocks.water_portal);
			world.setBlock(i + 1, j + 1, k, ROCBlocks.water_portal);
			world.setBlock(i, j, k - 1, ROCBlocks.water_portal);
			world.setBlock(i, j + 1, k - 1, ROCBlocks.water_portal);
			world.setBlock(i + 1, j, k - 1, ROCBlocks.water_portal);
			world.setBlock(i + 1, j + 1, k - 1, ROCBlocks.water_portal);
		}
		
		if (world.getBlock(i, j + 1, k) == Blocks.water
				&& world.getBlock(i - 1, j, k) == Blocks.water
				&& world.getBlock(i - 1, j + 1, k) == Blocks.water
				&& world.getBlock(i, j, k - 1) == Blocks.water
				&& world.getBlock(i, j + 1, k - 1) == Blocks.water
				&& world.getBlock(i - 1, j, k - 1) == Blocks.water
				&& world.getBlock(i - 1, j + 1, k - 1) == Blocks.water
				
				&& world.getBlock(i, j, k-2) == Blocks.stonebrick
				&& world.getBlock(i, j+1, k-2) == Blocks.stonebrick
				&& world.getBlock(i-1, j, k-2) == Blocks.stonebrick
				&& world.getBlock(i-1, j+1, k-2) == Blocks.stonebrick
				&& world.getBlock(i-2, j, k) == Blocks.stonebrick
				&& world.getBlock(i-2, j+1, k) == Blocks.stonebrick
				&& world.getBlock(i-2, j, k-1) == Blocks.stonebrick
				&& world.getBlock(i-2, j+1, k-1) == Blocks.stonebrick
				&& world.getBlock(i, j, k+1) == Blocks.stonebrick
				&& world.getBlock(i, j+1, k+1) == Blocks.stonebrick
				&& world.getBlock(i-1, j, k+1) == Blocks.stonebrick
				&& world.getBlock(i-1, j+1, k+1) == Blocks.stonebrick
				&& world.getBlock(i+1, j, k) == Blocks.stonebrick
				&& world.getBlock(i+1, j+1, k) == Blocks.stonebrick
				&& world.getBlock(i+1, j, k-1) == Blocks.stonebrick
				&& world.getBlock(i+1, j+1, k-1) == Blocks.stonebrick
				&& world.getBlock(i, j-1, k) == Blocks.stonebrick
				&& world.getBlock(i, j-1, k-1) == Blocks.stonebrick
				&& world.getBlock(i-1, j-1, k-1) == Blocks.stonebrick
				&& world.getBlock(i-1, j-1, k) == Blocks.stonebrick
				) {
			world.setBlock(i, j + 1, k, ROCBlocks.water_portal);
			world.setBlock(i - 1, j, k, ROCBlocks.water_portal);
			world.setBlock(i - 1, j + 1, k, ROCBlocks.water_portal);
			world.setBlock(i, j, k - 1, ROCBlocks.water_portal);
			world.setBlock(i, j + 1, k - 1, ROCBlocks.water_portal);
			world.setBlock(i - 1, j, k - 1, ROCBlocks.water_portal);
			world.setBlock(i - 1, j + 1, k - 1, ROCBlocks.water_portal);
		}
		world.scheduleBlockUpdate(i, j, k, this, 4);
		return p_149660_9_;
	}
	
    public void updateTick(World world, int i, int j, int k, Random p_149674_5_) {
    	if (world.getBlock(i, j+1, k) == ROCBlocks.water_portal){
    		world.setBlock(i, j, k, ROCBlocks.water_portal);
    	}
    }


}