package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.eternaldoom.realmsofchaos.ROCTabs;

public class BlockOceanGlass extends ROCModBlock{

	public BlockOceanGlass() {
		super(Material.glass, "glassOcean", 3.5f, 0.1f, soundTypeGlass);
		setCreativeTab(ROCTabs.Blocks);
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public boolean isVisuallyOpaque(){
		return false;
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
}
