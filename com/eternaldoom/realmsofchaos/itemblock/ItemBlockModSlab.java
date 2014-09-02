package com.eternaldoom.realmsofchaos.itemblock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

import com.eternaldoom.realmsofchaos.blocks.BlockROCSlab;

public class ItemBlockModSlab extends ItemSlab{

	public ItemBlockModSlab(BlockROCSlab p_i45355_1_, BlockROCSlab p_i45355_2_,
			BlockROCSlab p_i45355_3_, boolean p_i45355_4_) {
		super(p_i45355_1_, p_i45355_2_, p_i45355_3_, p_i45355_4_);
	}
	
	public ItemBlockModSlab(Block b, BlockROCSlab p_i45355_1_, BlockROCSlab p_i45355_2_,
			BlockROCSlab p_i45355_3_, boolean p_i45355_4_) {
		this(p_i45355_1_, p_i45355_2_, p_i45355_3_, p_i45355_4_);
	}
}
