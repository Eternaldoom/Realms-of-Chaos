package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.eternaldoom.realmsofchaos.ROCTabs;

public class BlockROCSlab extends BlockSlab{
	private Block materialBlock;
	private boolean isDouble;
	private BlockROCSlab singleslab;
	public BlockROCSlab(boolean isDouble, Block b, float hard, float resist, String name) {
		super(b.getMaterial());
		this.materialBlock = b;
		setUnlocalizedName(name);
		setHardness(hard);
		setResistance(resist);
		this.isDouble = isDouble;
		if(!isDouble)setCreativeTab(ROCTabs.Blocks);
	}
	
	public BlockROCSlab(boolean isDouble, Block b, float hard, float resist, String name, BlockROCSlab single) {
		super(b.getMaterial());
		this.materialBlock = b;
		setUnlocalizedName(name);
		setHardness(hard);
		setResistance(resist);
		this.isDouble = isDouble;
		if(!isDouble)setCreativeTab(ROCTabs.Blocks);
		this.singleslab = single;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3){
		return isDouble ? Item.getItemFromBlock(singleslab) : Item.getItemFromBlock(this);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, BlockPos pos)
	{
		if (this.isDouble) return Item.getItemFromBlock(singleslab);
		else return Item.getItemFromBlock(this);
	}
}
