package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import com.eternaldoom.realmsofchaos.ROCTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockROCSlab extends BlockSlab{
	private Block materialBlock;
	private boolean isDouble;
	private BlockROCSlab singleslab;
	public BlockROCSlab(boolean isDouble, Block b, float hard, float resist, String name) {
		super(isDouble, b.getMaterial());
		this.materialBlock = b;
		setBlockName(name);
		setHardness(hard);
		setResistance(resist);
		this.isDouble = isDouble;
		if(!isDouble)setCreativeTab(ROCTabs.Blocks);
	}
	
	public BlockROCSlab(boolean isDouble, Block b, float hard, float resist, String name, BlockROCSlab single) {
		super(isDouble, b.getMaterial());
		this.materialBlock = b;
		setBlockName(name);
		setHardness(hard);
		setResistance(resist);
		this.isDouble = isDouble;
		if(!isDouble)setCreativeTab(ROCTabs.Blocks);
		this.singleslab = single;
	}

	@Override
	public String func_150002_b(int p_150002_1_) {
		return this.getUnlocalizedName();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return this.materialBlock.getIcon(p_149691_1_, 0);
    }
	
	@Override
	public Item getItemDropped(int par1, Random rand, int par3){
		return isDouble ? Item.getItemFromBlock(singleslab) : Item.getItemFromBlock(this);
	}
}
