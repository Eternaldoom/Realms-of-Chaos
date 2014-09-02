package com.eternaldoom.realmsofchaos.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.IIcon;

public class BlockROCSlab extends BlockSlab{
	private Block materialBlock;
	private boolean isDouble;
	public BlockROCSlab(boolean isDouble, Block b, float hard, float resist, String name) {
		super(isDouble, b.getMaterial());
		this.materialBlock = b;
		setBlockName(name);
		setHardness(hard);
		setResistance(resist);
		this.isDouble = isDouble;
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
	
	public BlockROCSlab register(String name){
		if(isDouble) GameRegistry.registerBlock(this, ItemSlab.class, name, new Object[]{ROCBlocks.netherrack_brick_slab_double, ROCBlocks.netherrack_brick_slab, ROCBlocks.netherrack_brick_slab_double, true});
		else GameRegistry.registerBlock(this, ItemSlab.class, name, new Object[]{ROCBlocks.netherrack_brick_slab, ROCBlocks.netherrack_brick_slab, ROCBlocks.netherrack_brick_slab_double, false});
		return this;
	}
}
