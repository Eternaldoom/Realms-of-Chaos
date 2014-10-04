package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockXylite extends ROCModBlock {
	
	private BlockPos helperPos = new BlockPos(0, 0, 0);

	public BlockXylite() {
		super(Material.iron, "blockXylite", 7.5f,
				13.5f, soundTypeMetal);
		register("xylite_block");
		setTickRandomly(true);
	}

	@Override
	public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){
		
		int i = pos.getX(), j = pos.getY(), k = pos.getZ();
		
		if (getBlock(world, i, j + 1, k) == Blocks.water
				&& getBlock(world, i + 1, j, k) == Blocks.water
				&& getBlock(world, i + 1, j + 1, k) == Blocks.water
				&& getBlock(world, i, j, k + 1) == Blocks.water
				&& getBlock(world, i, j + 1, k + 1) == Blocks.water
				&& getBlock(world, i + 1, j, k + 1) == Blocks.water
				&& getBlock(world, i + 1, j + 1, k + 1) == Blocks.water
				&& getBlock(world, i, j, k+2) == Blocks.stonebrick
				&& getBlock(world, i, j+1, k+2) == Blocks.stonebrick
				&& getBlock(world, i+1, j, k+2) == Blocks.stonebrick
				&& getBlock(world, i+1, j+1, k+2) == Blocks.stonebrick
				&& getBlock(world, i+2, j, k) == Blocks.stonebrick
				&& getBlock(world, i+2, j+1, k) == Blocks.stonebrick
				&& getBlock(world, i+2, j, k+1) == Blocks.stonebrick
				&& getBlock(world, i+2, j+1, k+1) == Blocks.stonebrick
				&& getBlock(world, i, j, k-1) == Blocks.stonebrick
				&& getBlock(world, i, j+1, k-1) == Blocks.stonebrick
				&& getBlock(world, i+1, j, k-1) == Blocks.stonebrick
				&& getBlock(world, i+1, j+1, k-1) == Blocks.stonebrick
				&& getBlock(world, i-1, j, k) == Blocks.stonebrick
				&& getBlock(world, i-1, j+1, k) == Blocks.stonebrick
				&& getBlock(world, i-1, j, k+1) == Blocks.stonebrick
				&& getBlock(world, i-1, j+1, k+1) == Blocks.stonebrick
				&& getBlock(world, i, j-1, k) == Blocks.stonebrick
				&& getBlock(world, i, j-1, k+1) == Blocks.stonebrick
				&& getBlock(world, i+1, j-1, k+1) == Blocks.stonebrick
				&& getBlock(world, i+1, j-1, k) == Blocks.stonebrick
		){
			setBlock(world, i, j + 1, k, ROCBlocks.water_portal);
			setBlock(world, i + 1, j, k, ROCBlocks.water_portal);
			setBlock(world, i + 1, j + 1, k, ROCBlocks.water_portal);
			setBlock(world, i, j, k + 1, ROCBlocks.water_portal);
			setBlock(world, i, j + 1, k + 1, ROCBlocks.water_portal);
			setBlock(world, i + 1, j, k + 1, ROCBlocks.water_portal);
			setBlock(world, i + 1, j + 1, k + 1, ROCBlocks.water_portal);
		}
		
		if (getBlock(world, i, j + 1, k) == Blocks.water
				&& getBlock(world, i - 1, j, k) == Blocks.water
				&& getBlock(world, i - 1, j + 1, k) == Blocks.water
				&& getBlock(world, i, j, k + 1) == Blocks.water
				&& getBlock(world, i, j + 1, k + 1) == Blocks.water
				&& getBlock(world, i - 1, j, k + 1) == Blocks.water
				&& getBlock(world, i - 1, j + 1, k + 1) == Blocks.water
				&& getBlock(world, i, j, k+2) == Blocks.stonebrick
				&& getBlock(world, i, j+1, k+2) == Blocks.stonebrick
				&& getBlock(world, i-1, j, k+2) == Blocks.stonebrick
				&& getBlock(world, i-1, j+1, k+2) == Blocks.stonebrick
				&& getBlock(world, i-2, j, k) == Blocks.stonebrick
				&& getBlock(world, i-2, j+1, k) == Blocks.stonebrick
				&& getBlock(world, i-2, j, k+1) == Blocks.stonebrick
				&& getBlock(world, i-2, j+1, k+1) == Blocks.stonebrick
				&& getBlock(world, i, j, k-1) == Blocks.stonebrick
				&& getBlock(world, i, j+1, k-1) == Blocks.stonebrick
				&& getBlock(world, i-1, j, k-1) == Blocks.stonebrick
				&& getBlock(world, i-1, j+1, k-1) == Blocks.stonebrick
				&& getBlock(world, i+1, j, k) == Blocks.stonebrick
				&& getBlock(world, i+1, j+1, k) == Blocks.stonebrick
				&& getBlock(world, i+1, j, k+1) == Blocks.stonebrick
				&& getBlock(world, i+1, j+1, k+1) == Blocks.stonebrick
				&& getBlock(world, i, j-1, k) == Blocks.stonebrick
				&& getBlock(world, i, j-1, k+1) == Blocks.stonebrick
				&& getBlock(world, i-1, j-1, k+1) == Blocks.stonebrick
				&& getBlock(world, i-1, j-1, k) == Blocks.stonebrick
				) {
			setBlock(world, i, j + 1, k, ROCBlocks.water_portal);
			setBlock(world, i - 1, j, k, ROCBlocks.water_portal);
			setBlock(world, i - 1, j + 1, k, ROCBlocks.water_portal);
			setBlock(world, i, j, k + 1, ROCBlocks.water_portal);
			setBlock(world, i, j + 1, k + 1, ROCBlocks.water_portal);
			setBlock(world, i - 1, j, k + 1, ROCBlocks.water_portal);
			setBlock(world, i - 1, j + 1, k + 1, ROCBlocks.water_portal);
		}
		
		if (getBlock(world, i, j + 1, k) == Blocks.water
				&& getBlock(world, i + 1, j, k) == Blocks.water
				&& getBlock(world, i + 1, j + 1, k) == Blocks.water
				&& getBlock(world, i, j, k - 1) == Blocks.water
				&& getBlock(world, i, j + 1, k - 1) == Blocks.water
				&& getBlock(world, i + 1, j, k - 1) == Blocks.water
				&& getBlock(world, i + 1, j + 1, k - 1) == Blocks.water
				&& getBlock(world, i, j, k-2) == Blocks.stonebrick
				&& getBlock(world, i, j+1, k-2) == Blocks.stonebrick
				&& getBlock(world, i+1, j, k-2) == Blocks.stonebrick
				&& getBlock(world, i+1, j+1, k-2) == Blocks.stonebrick
				&& getBlock(world, i+2, j, k) == Blocks.stonebrick
				&& getBlock(world, i+2, j+1, k) == Blocks.stonebrick
				&& getBlock(world, i+2, j, k-1) == Blocks.stonebrick
				&& getBlock(world, i+2, j+1, k-1) == Blocks.stonebrick
				&& getBlock(world, i, j, k+1) == Blocks.stonebrick
				&& getBlock(world, i, j+1, k+1) == Blocks.stonebrick
				&& getBlock(world, i+1, j, k+1) == Blocks.stonebrick
				&& getBlock(world, i+1, j+1, k+1) == Blocks.stonebrick
				&& getBlock(world, i-1, j, k) == Blocks.stonebrick
				&& getBlock(world, i-1, j+1, k) == Blocks.stonebrick
				&& getBlock(world, i-1, j, k-1) == Blocks.stonebrick
				&& getBlock(world, i-1, j+1, k-1) == Blocks.stonebrick
				&& getBlock(world, i, j-1, k) == Blocks.stonebrick
				&& getBlock(world, i, j-1, k-1) == Blocks.stonebrick
				&& getBlock(world, i+1, j-1, k-1) == Blocks.stonebrick
				&& getBlock(world, i+1, j-1, k) == Blocks.stonebrick
				) {
			setBlock(world, i, j + 1, k, ROCBlocks.water_portal);
			setBlock(world, i + 1, j, k, ROCBlocks.water_portal);
			setBlock(world, i + 1, j + 1, k, ROCBlocks.water_portal);
			setBlock(world, i, j, k - 1, ROCBlocks.water_portal);
			setBlock(world, i, j + 1, k - 1, ROCBlocks.water_portal);
			setBlock(world, i + 1, j, k - 1, ROCBlocks.water_portal);
			setBlock(world, i + 1, j + 1, k - 1, ROCBlocks.water_portal);
		}
		
		if (getBlock(world, i, j + 1, k) == Blocks.water
				&& getBlock(world, i - 1, j, k) == Blocks.water
				&& getBlock(world, i - 1, j + 1, k) == Blocks.water
				&& getBlock(world, i, j, k - 1) == Blocks.water
				&& getBlock(world, i, j + 1, k - 1) == Blocks.water
				&& getBlock(world, i - 1, j, k - 1) == Blocks.water
				&& getBlock(world, i - 1, j + 1, k - 1) == Blocks.water
				
				&& getBlock(world, i, j, k-2) == Blocks.stonebrick
				&& getBlock(world, i, j+1, k-2) == Blocks.stonebrick
				&& getBlock(world, i-1, j, k-2) == Blocks.stonebrick
				&& getBlock(world, i-1, j+1, k-2) == Blocks.stonebrick
				&& getBlock(world, i-2, j, k) == Blocks.stonebrick
				&& getBlock(world, i-2, j+1, k) == Blocks.stonebrick
				&& getBlock(world, i-2, j, k-1) == Blocks.stonebrick
				&& getBlock(world, i-2, j+1, k-1) == Blocks.stonebrick
				&& getBlock(world, i, j, k+1) == Blocks.stonebrick
				&& getBlock(world, i, j+1, k+1) == Blocks.stonebrick
				&& getBlock(world, i-1, j, k+1) == Blocks.stonebrick
				&& getBlock(world, i-1, j+1, k+1) == Blocks.stonebrick
				&& getBlock(world, i+1, j, k) == Blocks.stonebrick
				&& getBlock(world, i+1, j+1, k) == Blocks.stonebrick
				&& getBlock(world, i+1, j, k-1) == Blocks.stonebrick
				&& getBlock(world, i+1, j+1, k-1) == Blocks.stonebrick
				&& getBlock(world, i, j-1, k) == Blocks.stonebrick
				&& getBlock(world, i, j-1, k-1) == Blocks.stonebrick
				&& getBlock(world, i-1, j-1, k-1) == Blocks.stonebrick
				&& getBlock(world, i-1, j-1, k) == Blocks.stonebrick
				) {
			setBlock(world, i, j + 1, k, ROCBlocks.water_portal);
			setBlock(world, i - 1, j, k, ROCBlocks.water_portal);
			setBlock(world, i - 1, j + 1, k, ROCBlocks.water_portal);
			setBlock(world, i, j, k - 1, ROCBlocks.water_portal);
			setBlock(world, i, j + 1, k - 1, ROCBlocks.water_portal);
			setBlock(world, i - 1, j, k - 1, ROCBlocks.water_portal);
			setBlock(world, i - 1, j + 1, k - 1, ROCBlocks.water_portal);
		}
		world.scheduleUpdate(pos, this, 4);
		return this.getDefaultState();
	}
	
    public void updateTick(World world, int i, int j, int k, Random p_149674_5_) {
    	if (getBlock(world, i, j+1, k) == ROCBlocks.water_portal){
    		setBlock(world, i, j, k, ROCBlocks.water_portal);
    	}
    }
    
    private void setBlock(World w, int i, int j, int k, Block block){
        if(w != null)
    	w.setBlockState(this.helperPos.add(i, j, k), block.getDefaultState());
    }
	
	private Block getBlock(World w, int i, int j, int k){
		return w.getBlockState(this.helperPos.add(i, j, k)).getBlock();
	}
    
    private void setBlock(World w, int i, int j, int k, Block block, int meta, int flag){
    	w.setBlockState(this.helperPos.add(i, j, k), block.getStateFromMeta(meta), flag);
    }

}