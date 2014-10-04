package com.eternaldoom.realmsofchaos.items;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.google.common.collect.Sets;

public class ItemROCAxe extends ItemROCTool
{	
    private static final Set breaks = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});

    protected ItemROCAxe(Item.ToolMaterial tool, String name, boolean vanilla)
    {
        super(Math.round((tool.getDamageVsEntity() + 4)/2)+1, tool, breaks, name, vanilla);
    }

    @Override
    public float getStrVsBlock(ItemStack p_150893_1_, Block p_150893_2_)
    {
        return p_150893_2_.getMaterial() != Material.wood && p_150893_2_.getMaterial() != Material.plants && p_150893_2_.getMaterial() != Material.vine ? super.getStrVsBlock(p_150893_1_, p_150893_2_) : this.efficiencyOnProperMaterial;
    }
    
    public ItemROCAxe register(String name){
    	GameRegistry.registerItem(this, name);
    	ROCItems.itemNames.add(name);
    	return this;
    }
}