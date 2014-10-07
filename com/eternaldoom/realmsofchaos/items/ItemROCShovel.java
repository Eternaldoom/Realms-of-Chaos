package com.eternaldoom.realmsofchaos.items;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.google.common.collect.Sets;

public class ItemROCShovel extends ItemROCTool
{	
    private static final Set breaks = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});
    
    public ItemROCShovel(ROCItems.ToolMaterial tool, String name, boolean vanilla)
    {
        super(Math.round((tool.getAttackDamage() + 4)/5), tool, breaks, name, vanilla);
    }

    @Override
    public boolean canHarvestBlock(Block p_150897_1_)
    {
        return p_150897_1_ == Blocks.snow_layer ? true : p_150897_1_ == Blocks.snow;
    }
    
    public ItemROCShovel register(String name){
    	GameRegistry.registerItem(this, name);
    	ROCItems.itemList.add(name);
    	return this;
    }
}