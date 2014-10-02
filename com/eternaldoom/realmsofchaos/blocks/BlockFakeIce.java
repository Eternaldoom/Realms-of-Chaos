package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFakeIce extends ROCModBlock{

	public BlockFakeIce() {
		super(Material.ice, "ice", 0.5f, 0, soundTypeGlass);
		setCreativeTab(null);
		setLightOpacity(3);
		slipperiness = 0.98F;
		setTickRandomly(true);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.TRANSLUCENT;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess world, BlockPos pos, EnumFacing side)
    {
        IBlockState block = world.getBlockState(pos);

        return block == this.getDefaultState() ? false : super.shouldSideBeRendered(world, pos, side);
    }
	
	@Override
	public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }
	
	@Override
	public void updateTick(World p_149674_1_, BlockPos pos, IBlockState state, Random p_149674_5_)
    {
	    this.checkAndDropBlock(p_149674_1_, pos);
    }
	
	@Override
	public boolean isVisuallyOpaque(){
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	protected void checkAndDropBlock(World p_149855_1_, BlockPos pos)
    {
		p_149855_1_.setBlockState(pos, Blocks.water.getDefaultState());
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public Item getItem(World world, BlockPos pos)
    {
        return Item.getItemFromBlock(Blocks.ice);
    }
}
