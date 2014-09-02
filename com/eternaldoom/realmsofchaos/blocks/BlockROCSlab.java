package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockROCSlab extends BlockSlab{
	private Block materialBlock;
	private boolean isDouble;
	private BlockROCSlab theDouble;
	public BlockROCSlab(boolean isDouble, Block b, float hard, float resist, String name) {
		super(isDouble, b.getMaterial());
		this.materialBlock = b;
		setBlockName(name);
		setHardness(hard);
		setResistance(resist);
		this.isDouble = isDouble;
	}
	
	public BlockROCSlab(boolean isDouble, Block b, float hard, float resist, String name, BlockROCSlab theDouble) {
		super(isDouble, b.getMaterial());
		this.materialBlock = b;
		setBlockName(name);
		setHardness(hard);
		setResistance(resist);
		this.isDouble = isDouble;
		this.theDouble = theDouble;
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
		/*if(isDouble) */GameRegistry.registerBlock(this, /*ItemBlockModSlab.class,*/ name/*, new Object[]{ROCBlocks.netherrack_brick_slab_double, ROCBlocks.netherrack_brick_slab, ROCBlocks.netherrack_brick_slab_double, true}*/);
		//else GameRegistry.registerBlock(this, ItemBlockModSlab.class, name, new Object[]{ROCBlocks.netherrack_brick_slab, ROCBlocks.netherrack_brick_slab, ROCBlocks.netherrack_brick_slab_double, false});
		return this;
	}
}
