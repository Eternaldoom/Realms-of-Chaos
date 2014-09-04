package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.items.ROCItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSeaweed extends ROCModBlock{
		
	public BlockSeaweed(){
		super(Material.water, "realmsofchaos:seaweed", "seaweed", 0, 0, soundTypeGrass);
		float f = 0.375f;
		setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
		setTickRandomly(true);
		setCreativeTab(null);
	}
	
	@Override
	public boolean canPlaceBlockAt(World world, int i, int j, int k)
    {
        return super.canPlaceBlockAt(world, i, j, k) && world.getBlock(i, j - 1, k) == ROCBlocks.ocean_stone && world.getBlock(i, j, k) == Blocks.water;
    }
	
	@Override
	public boolean canBlockStay(World world, int i, int j, int k)
    {
		return (world.getBlock(i, j, k-1) == Blocks.water || world.getBlock(i, j, k-1) == ROCBlocks.seaweed) && (world.getBlock(i-1, j, k) == Blocks.water || world.getBlock(i-1, j, k) == ROCBlocks.seaweed) && (world.getBlock(i, j, k+1) == Blocks.water || world.getBlock(i, j, k+1) == ROCBlocks.seaweed) && (world.getBlock(i+1, j, k) == Blocks.water || world.getBlock(i+1, j, k) == ROCBlocks.seaweed) && (world.getBlock(i, j-1, k) == ROCBlocks.ocean_stone || world.getBlock(i, j-1, k) == ROCBlocks.seaweed);
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
        return 6;
    }
	
	@Override
	public void updateTick(World world, int i, int j, int k, Random rand){
		if(this.canBlockStay(world, i, j, k) && this.canBlockStay(world, i, j+1, k) && world.getBlock(i, j-10, k) != ROCBlocks.seaweed) world.setBlock(i, j+1, k, ROCBlocks.seaweed);
		if(!this.canBlockStay(world, i, j, k)){
			world.setBlock(i, j, k, Blocks.water);
			this.dropBlockAsItem(world, i, j, k, new ItemStack(ROCItems.seaweed));
		}
	}
	
	@Override
	public void onBlockPreDestroy(World world, int i, int j, int k, int oldmeta) {
		world.scheduleBlockUpdate(i, j+1, k, this, 1);
		world.scheduleBlockUpdate(i, j-1, k, this, 1);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public Item getItem(World world, int i, int j, int k)
    {
        return ROCItems.seaweed;
    }
	
	@Override
	public Item getItemDropped(int par1, Random rand, int par3){
		return ROCItems.seaweed;
	}
}
