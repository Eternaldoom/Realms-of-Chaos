package com.eternaldoom.realmsofchaos.items;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.google.common.collect.Sets;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemROCShovel extends ItemROCTool
{	
    private static final Set breaks = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});
    
    public ItemROCShovel(Item.ToolMaterial tool, String tex, String name, boolean vanilla)
    {
        super(Math.round((tool.getDamageVsEntity() + 4)/5), tool, breaks, tex, name, vanilla);
    }

    public boolean func_150897_b(Block p_150897_1_)
    {
        return p_150897_1_ == Blocks.snow_layer ? true : p_150897_1_ == Blocks.snow;
    }
    
    public ItemROCShovel register(String name){
    	GameRegistry.registerItem(this, name);
    	return this;
    }
}