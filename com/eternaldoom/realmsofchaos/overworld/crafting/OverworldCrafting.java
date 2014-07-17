package com.eternaldoom.realmsofchaos.overworld.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.eternaldoom.realmsofchaos.overworld.blocks.ROCBlocks;

import cpw.mods.fml.common.registry.GameRegistry;

public class OverworldCrafting {
	
	public static void initRecipes(){
		//TODO: add recipes 
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.netherrack_bricks, 4), new Object[]{"XX", "XX", 'X', Blocks.netherrack});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.charwood_planks, 4), new Object[]{"X", 'X', ROCBlocks.charwood_log});
		GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table), new Object[]{"XX", "XX", 'X', ROCBlocks.charwood_planks});
		GameRegistry.addRecipe(new ItemStack(Items.stick, 4), new Object[]{"X", "X", 'X', ROCBlocks.charwood_planks});
	}

}
