package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.eternaldoom.realmsofchaos.items.ROCItems;

public class BlockSeaweed extends ROCModBlock{
	
	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);//So the game doesnt crash
		
	public BlockSeaweed(){
		super(Material.water, "seaweed", 0, 0, soundTypeGrass);
		float f = 0.375f;
        this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, Integer.valueOf(0)));
		setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
		setTickRandomly(true);
		setCreativeTab(null);
	}
	
	@Override
	public boolean canPlaceBlockAt(World world, BlockPos pos)
    {
        return super.canPlaceBlockAt(world, pos) && world.getBlockState(pos.offsetDown()).getBlock() == ROCBlocks.ocean_stone && world.getBlockState(pos).getBlock() == Blocks.water;
    }
	
	public boolean canBlockStay(World world, BlockPos pos)
    {
		return (world.getBlockState(pos.offsetNorth()).getBlock() == Blocks.water || world.getBlockState(pos.offsetNorth()).getBlock() == ROCBlocks.seaweed) && (world.getBlockState(pos.offsetWest()).getBlock() == Blocks.water || world.getBlockState(pos.offsetWest()).getBlock() == ROCBlocks.seaweed) && (world.getBlockState(pos.offsetSouth()).getBlock() == Blocks.water || world.getBlockState(pos.offsetSouth()).getBlock() == ROCBlocks.seaweed) && (world.getBlockState(pos.offsetEast()).getBlock() == Blocks.water || world.getBlockState(pos.offsetEast()).getBlock() == ROCBlocks.seaweed) && (world.getBlockState(pos.offsetDown()).getBlock() == ROCBlocks.ocean_stone || world.getBlockState(pos.offsetDown()).getBlock() == ROCBlocks.seaweed) && (world.getBlockState(pos.offsetUp()).getBlock() == Blocks.water || world.getBlockState(pos.offsetUp()).getBlock() == ROCBlocks.seaweed);
    }
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(World p_149668_1_, BlockPos pos, IBlockState state)
    {
        return null;
    }
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public boolean isFullCube(){
		return false;
	}
	
	@Override
	public EnumWorldBlockLayer getBlockLayer(){
		return EnumWorldBlockLayer.CUTOUT;
	}
	
	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand){
		if(this.canBlockStay(world, pos) && this.canBlockStay(world, pos.offsetUp()) && world.getBlockState(pos.offsetDown(10)) != ROCBlocks.seaweed) world.setBlockState(pos.offsetUp(), ROCBlocks.seaweed.getDefaultState());
		if(!this.canBlockStay(world, pos)){
			world.setBlockState(pos, Blocks.water.getDefaultState());
			this.dropBlockAsItem(world, pos, this.getDefaultState(), 0);
		}
	}
	
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		world.scheduleUpdate(pos.offsetUp(), this, 1);
		world.scheduleUpdate(pos.offsetDown(), this, 1);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public Item getItem(World world, BlockPos pos)
    {
        return ROCItems.seaweed;
    }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3){
		return ROCItems.seaweed;
	}
	
	public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(LEVEL, Integer.valueOf(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((Integer)state.getValue(LEVEL)).intValue();
    }

    @Override
    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {LEVEL});
    }
}
