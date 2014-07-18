package com.eternaldoom.realmsofchaos.overworld.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.eternaldoom.realmsofchaos.overworld.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.overworld.items.ROCOverworldItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class OverworldCrafting {
	
	public static void initRecipes(){
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.netherrack_bricks, 4), new Object[]{"XX", "XX", 'X', Blocks.netherrack});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.charwood_planks, 4), new Object[]{"X", 'X', ROCBlocks.charwood_log});
		GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table), new Object[]{"XX", "XX", 'X', ROCBlocks.charwood_planks});
		GameRegistry.addRecipe(new ItemStack(Items.stick, 4), new Object[]{"X", "X", 'X', ROCBlocks.charwood_planks});
		GameRegistry.addRecipe(new ItemStack(ROCOverworldItems.citronite_stone), new Object[]{" C ", "C C", " C ", 'C', ROCOverworldItems.citronite_gem});
		GameRegistry.addRecipe(new ItemStack(ROCOverworldItems.flame_stone), new Object[]{"AAA", "ALA", "AAA", 'A', ROCOverworldItems.ash_dust, 'L', Items.lava_bucket});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.extractor), new Object[]{"CWC", "WWW", "CWC", 'C', ROCBlocks.citronite_block, 'W', ROCBlocks.charwood_log});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.citronite_block), new Object[]{"CCC", "CCC", "CCC", 'C', ROCOverworldItems.citronite_stone});
		GameRegistry.addRecipe(new ItemStack(ROCOverworldItems.citronite_stone, 9), new Object[]{"C", 'C', ROCBlocks.citronite_block});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.xylite_block), new Object[]{"XXX", "XXX", "XXX", 'X', ROCOverworldItems.xylite_ingot});
		GameRegistry.addRecipe(new ItemStack(ROCOverworldItems.xylite_ingot, 9), new Object[]{"X", 'X', ROCBlocks.xylite_block});
		
    	ExtractorRecipes.addItemRecipe(ROCOverworldItems.xylite_crystal, new ItemStack(ROCOverworldItems.xylite_ingot), 10.0f);
	}
}
