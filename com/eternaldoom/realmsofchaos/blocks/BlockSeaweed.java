package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockSeaweed extends ROCModBlock{

	public BlockSeaweed() {
		super(Material.water, "realmsofchaos:seaweed", "seaweed", 0, 0, soundTypeGrass);
		float f = 0.375f;
		setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
		setTickRandomly(true);
	}
	
	@Override
	public boolean canPlaceBlockAt(World world, int i, int j, int k)
    {
        return super.canPlaceBlockAt(world, i, j, k) && world.getBlock(i, j - 1, k) == ROCBlocks.ocean_stone || world.getBlock(i, j - 1, k) == ROCBlocks.seaweed && world.getBlock(i, j, k) == Blocks.water;
    }
	
	@Override
	public boolean canBlockStay(World world, int i, int j, int k)
    {
		return world.getBlock(i, j, k-1) == Blocks.water && world.getBlock(i-1, j, k) == Blocks.water && world.getBlock(i, j, k+1) == Blocks.water && world.getBlock(i+1, j, k) == Blocks.water && (world.getBlock(i, j-1, k) == ROCBlocks.ocean_stone || world.getBlock(i, j-1, k) == ROCBlocks.seaweed);
    }
	
	@Override
	public int damageDropped(int par1){
		return 0;
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	public int getRenderType()
    {
        return 1;
    }
	
	@Override
	public void updateTick(World world, int i, int j, int k, Random rand){
		if(this.canBlockStay(world, i, j, k) && this.canBlockStay(world, i, j+1, k)) world.setBlock(i, j+1, k, ROCBlocks.seaweed, 1, 2);
	}
}
