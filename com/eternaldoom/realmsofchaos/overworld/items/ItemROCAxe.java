package com.eternaldoom.realmsofchaos.overworld.items;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.google.common.collect.Sets;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemROCAxe extends ItemROCTool
{
    private static final Set field_150917_c = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});

    protected ItemROCAxe(Item.ToolMaterial p_i45327_1_, String tex, String name, boolean vanilla)
    {
        super(3.0F, p_i45327_1_, field_150917_c, tex, name, vanilla);
    }

    public float func_150893_a(ItemStack p_150893_1_, Block p_150893_2_)
    {
        return p_150893_2_.getMaterial() != Material.wood && p_150893_2_.getMaterial() != Material.plants && p_150893_2_.getMaterial() != Material.vine ? super.func_150893_a(p_150893_1_, p_150893_2_) : this.efficiencyOnProperMaterial;
    }
    
    public ItemROCAxe register(String name){
    	GameRegistry.registerItem(this, name);
    	return this;
    }
}