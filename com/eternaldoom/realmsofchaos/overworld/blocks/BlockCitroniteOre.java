package com.eternaldoom.realmsofchaos.overworld.blocks;

import java.util.Random;

import com.eternaldoom.realmsofchaos.overworld.items.ROCItems;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockCitroniteOre extends OverworldBlock {

	public BlockCitroniteOre() {
		super(Material.rock, "realmsofchaos:citronite_ore", "oreCitronite", 5.0f, 1000000.0f, soundTypePiston);
	}
	
	@Override
	public Item getItemDropped(int par1, Random par2random, int par3){
		return ROCItems.citronite_gem;
	}
	@Override
	public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        if (p_149679_1_ > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, p_149679_2_, p_149679_1_))
        {
            int var3 = p_149679_2_.nextInt(p_149679_1_ + 2) - 1;

            if (var3 < 0)
            {
                var3 = 0;
            }

            return this.quantityDropped(p_149679_2_) * (var3 + 1);
        }
        else
        {
            return this.quantityDropped(p_149679_2_);
        }
    }

}
