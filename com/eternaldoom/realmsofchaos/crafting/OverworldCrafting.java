package com.eternaldoom.realmsofchaos.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.items.ROCItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class OverworldCrafting {
	
	public static void initRecipes(){
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.netherrack_bricks, 4), new Object[]{"XX", "XX", 'X', Blocks.netherrack});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.charwood_planks, 4), new Object[]{"X", 'X', ROCBlocks.charwood_log});
		GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table), new Object[]{"XX", "XX", 'X', ROCBlocks.charwood_planks});
		GameRegistry.addRecipe(new ItemStack(Items.stick, 4), new Object[]{"X", "X", 'X', ROCBlocks.charwood_planks});
		GameRegistry.addRecipe(new ItemStack(ROCItems.citronite_stone), new Object[]{" C ", "C C", " C ", 'C', ROCItems.citronite_gem});
		GameRegistry.addRecipe(new ItemStack(ROCItems.flame_stone), new Object[]{"ACA", "CLC", "ACA", 'A', ROCItems.ash_dust, 'C', ROCItems.citronite_gem, 'L', Items.lava_bucket});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.extractor), new Object[]{"CWC", "WWW", "CWC", 'C', ROCBlocks.citronite_block, 'W', ROCBlocks.charwood_log});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.heliotrope_block), new Object[]{"CCC", "CCC", "CCC", 'C', ROCItems.heliotrope});
		GameRegistry.addRecipe(new ItemStack(ROCItems.heliotrope, 9), new Object[]{"C", 'C', ROCBlocks.heliotrope_block});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.citronite_block), new Object[]{"CCC", "CCC", "CCC", 'C', ROCItems.citronite_stone});
		GameRegistry.addRecipe(new ItemStack(ROCItems.citronite_stone, 9), new Object[]{"C", 'C', ROCBlocks.citronite_block});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.xylite_block), new Object[]{"XXX", "XXX", "XXX", 'X', ROCItems.xylite_ingot});
		GameRegistry.addRecipe(new ItemStack(ROCItems.xylite_ingot, 9), new Object[]{"X", 'X', ROCBlocks.xylite_block});
		GameRegistry.addRecipe(new ItemStack(ROCItems.aquatic_orb), new Object[]{" A ", "A A", " A ", 'A', ROCItems.aquatic_shard});
		GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(ROCBlocks.compressed_lava)), new Object[]{"LL", "LL", 'L', Items.lava_bucket});
		GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(ROCBlocks.ocean_glass_pane), 12), new Object[]{"GGG", "GGG", 'G', ROCBlocks.ocean_glass});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.neptunite_block), new Object[]{"XXX", "XXX", "XXX", 'X', ROCItems.neptunite_ingot});
		GameRegistry.addRecipe(new ItemStack(ROCItems.neptunite_ingot, 9), new Object[]{"X", 'X', ROCBlocks.neptunite_block});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.aquatic_block), new Object[]{"XXX", "XXX", "XXX", 'X', ROCItems.aquatic_orb});
		GameRegistry.addRecipe(new ItemStack(ROCItems.aquatic_orb, 9), new Object[]{"X", 'X', ROCBlocks.aquatic_block});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.fractonite_block), new Object[]{"XXX", "XXX", "XXX", 'X', ROCItems.fractonite_stone});
		GameRegistry.addRecipe(new ItemStack(ROCItems.fractonite_stone, 9), new Object[]{"X", 'X', ROCBlocks.fractonite_block});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.osmaralt_block), new Object[]{"XXX", "XXX", "XXX", 'X', ROCItems.osmaralt_ingot});
		GameRegistry.addRecipe(new ItemStack(ROCItems.osmaralt_ingot, 9), new Object[]{"X", 'X', ROCBlocks.osmaralt_block});
		GameRegistry.addRecipe(new ItemStack(ROCItems.iron_bow), new Object[]{" XS", "X S", " XS", 'X', Items.iron_ingot, 'S', Items.string});
		GameRegistry.addRecipe(new ItemStack(ROCItems.diamond_bow), new Object[]{" XS", "X S", " XS", 'X', Items.diamond, 'S', Items.string});
		GameRegistry.addRecipe(new ItemStack(ROCItems.iron_arrow, 16), new Object[]{"F", "X", "C", 'F', Items.flint, 'X', Items.iron_ingot, 'C', Items.feather});
		GameRegistry.addRecipe(new ItemStack(ROCItems.diamond_arrow, 16), new Object[]{"F", "X", "C", 'F', Items.flint, 'X', Items.diamond, 'C', Items.feather});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.netherrack_bricks), new Object[]{RecipeHelper.stonePatterns[2], 'M', Blocks.netherrack});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.netherrack_brick_slab, 6), new Object[]{RecipeHelper.stonePatterns[0], 'M', ROCBlocks.netherrack_bricks});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.netherrack_brick_stairs, 4), new Object[]{RecipeHelper.stonePatterns[1], 'M', ROCBlocks.netherrack_bricks});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.charwood_slab, 6), new Object[]{RecipeHelper.stonePatterns[0], 'M', ROCBlocks.charwood_planks});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.charwood_stairs, 4), new Object[]{RecipeHelper.stonePatterns[1], 'M', ROCBlocks.charwood_planks});
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.flamestone_block), new Object[]{"XXX", "XXX", "XXX", 'X', ROCItems.flame_stone});
		GameRegistry.addRecipe(new ItemStack(ROCItems.flame_stone, 9), new Object[]{"X", 'X', ROCBlocks.flamestone_block});
		
		RecipeHelper.addCannonRecipe(Blocks.iron_block, ROCItems.iron_cannon, Items.iron_ingot, ROCItems.iron_bullet);
		RecipeHelper.addCannonRecipe(Blocks.diamond_block, ROCItems.diamond_cannon, Items.diamond, ROCItems.diamond_bullet);
		RecipeHelper.addCannonRecipe(ROCBlocks.heliotrope_block, ROCItems.heliotrope_cannon, ROCItems.heliotrope, ROCItems.heliotrope_bullet);
		RecipeHelper.addCannonRecipe(ROCBlocks.citronite_block, ROCItems.citronite_cannon, ROCItems.citronite_stone, ROCItems.citronite_bullet);
		RecipeHelper.addCannonRecipe(ROCBlocks.xylite_block, ROCItems.xylite_cannon, ROCItems.xylite_ingot, ROCItems.xylite_bullet);
		RecipeHelper.addCannonRecipe(ROCBlocks.flamestone_block, ROCItems.flamestone_cannon, ROCItems.flame_stone, ROCItems.flamestone_bullet);
		RecipeHelper.addCannonRecipe(ROCBlocks.neptunite_block, ROCItems.neptunite_cannon, ROCItems.neptunite_ingot, ROCItems.neptunite_bullet);
		RecipeHelper.addCannonRecipe(ROCBlocks.aquatic_block, ROCItems.aquatic_cannon, ROCItems.aquatic_orb, ROCItems.aquatic_bullet);
		RecipeHelper.addCannonRecipe(ROCBlocks.osmaralt_block, ROCItems.osmaralt_cannon, ROCItems.osmaralt_ingot, ROCItems.osmaralt_bullet);
		RecipeHelper.addCannonRecipe(ROCBlocks.fractonite_block, ROCItems.fractonite_cannon, ROCItems.fractonite_stone, ROCItems.fractonite_bullet);

		RecipeHelper.addArmorRecipe(ROCItems.heliotrope_helmet, ROCItems.heliotrope_chestplate, ROCItems.heliotrope_leggings, ROCItems.heliotrope_boots, ROCItems.heliotrope);
		RecipeHelper.addArmorRecipe(ROCItems.citronite_helmet, ROCItems.citronite_chestplate, ROCItems.citronite_leggings, ROCItems.citronite_boots, ROCItems.citronite_gem);
		RecipeHelper.addArmorRecipe(ROCItems.xylite_helmet, ROCItems.xylite_chestplate, ROCItems.xylite_leggings, ROCItems.xylite_boots, ROCItems.xylite_ingot);
		RecipeHelper.addArmorRecipe(ROCItems.flame_helmet, ROCItems.flame_chestplate, ROCItems.flame_leggings, ROCItems.flame_boots, ROCItems.flame_stone);
		RecipeHelper.addArmorRecipe(ROCItems.neptunite_helmet, ROCItems.neptunite_chestplate, ROCItems.neptunite_leggings, ROCItems.neptunite_boots, ROCItems.neptunite_ingot);
		RecipeHelper.addArmorRecipe(ROCItems.aquatic_helmet, ROCItems.aquatic_chestplate, ROCItems.aquatic_leggings, ROCItems.aquatic_boots, ROCItems.aquatic_orb);
		RecipeHelper.addArmorRecipe(ROCItems.osmaralt_helmet, ROCItems.osmaralt_chestplate, ROCItems.osmaralt_leggings, ROCItems.osmaralt_boots, ROCItems.osmaralt_ingot);
		RecipeHelper.addArmorRecipe(ROCItems.fractonite_helmet, ROCItems.fractonite_chestplate, ROCItems.fractonite_leggings, ROCItems.fractonite_boots, ROCItems.fractonite_stone);
		
		RecipeHelper.addToolRecipe(ROCItems.heliotrope_sword, ROCItems.heliotrope_pickaxe, ROCItems.heliotrope_axe, ROCItems.heliotrope_shovel, ROCItems.heliotrope_bow, ROCItems.heliotrope_arrow, ROCItems.heliotrope);
		RecipeHelper.addToolRecipe(ROCItems.citronite_sword, ROCItems.citronite_pickaxe, ROCItems.citronite_axe, ROCItems.citronite_shovel, ROCItems.citronite_bow, ROCItems.citronite_arrow, ROCItems.citronite_stone);
		RecipeHelper.addToolRecipe(ROCItems.xylite_sword, ROCItems.xylite_pickaxe, ROCItems.xylite_axe, ROCItems.xylite_shovel, ROCItems.xylite_bow, ROCItems.xylite_arrow, ROCItems.xylite_ingot);
		RecipeHelper.addToolRecipe(ROCItems.flame_sword, ROCItems.flame_pickaxe, ROCItems.flame_axe, ROCItems.flame_shovel, ROCItems.flamestone_bow, ROCItems.flamestone_arrow, ROCItems.flame_stone, Items.lava_bucket);
		RecipeHelper.addToolRecipe(ROCItems.neptunite_sword, ROCItems.neptunite_pickaxe, ROCItems.neptunite_axe, ROCItems.neptunite_shovel, ROCItems.neptunite_bow, ROCItems.neptunite_arrow, ROCItems.neptunite_ingot, ROCItems.fish_scale);
		RecipeHelper.addToolRecipe(ROCItems.aquatic_sword, ROCItems.aquatic_pickaxe, ROCItems.aquatic_axe, ROCItems.aquatic_shovel, ROCItems.aquatic_bow, ROCItems.aquatic_arrow, ROCItems.aquatic_orb, ROCItems.fish_scale);
		RecipeHelper.addToolRecipe(ROCItems.osmaralt_sword, ROCItems.osmaralt_pickaxe, ROCItems.osmaralt_axe, ROCItems.osmaralt_shovel, ROCItems.osmaralt_bow, ROCItems.osmaralt_arrow, ROCItems.osmaralt_ingot);
		RecipeHelper.addToolRecipe(ROCItems.fractonite_sword, ROCItems.fractonite_pickaxe, ROCItems.fractonite_axe, ROCItems.fractonite_shovel, ROCItems.fractonite_bow, ROCItems.fractonite_arrow, ROCItems.fractonite_stone);
		
		RecipeHelper.addStoneRecipe(ROCBlocks.ocean_stone, ROCBlocks.oceanstone_bricks, ROCBlocks.oceanstone_slab, ROCBlocks.oceanstone_stairs, ROCBlocks.oceanstone_brick_slab, ROCBlocks.ocean_cobblestone, ROCBlocks.ocean_cobblestone_slab, ROCBlocks.ocean_cobblestone_stairs, ROCBlocks.oceanstone_brick_stairs);
		RecipeHelper.addStoneRecipe(ROCBlocks.frozen_stone, ROCBlocks.frozen_stone_bricks, ROCBlocks.frozen_stone_slab, ROCBlocks.frozen_stone_stairs, ROCBlocks.frozen_stone_brick_slab, ROCBlocks.frozen_cobblestone, ROCBlocks.frozen_cobblestone_slab, ROCBlocks.frozen_cobblestone_stairs, ROCBlocks.frozen_stone_brick_stairs);

		GameRegistry.addRecipe(new ItemStack(ROCItems.fish_scale, 2), new Object[]{"F", 'F', Items.fish});
		GameRegistry.addShapelessRecipe(new ItemStack(ROCItems.miso_soup), new Object[]{ROCItems.dried_seaweed, Items.fermented_spider_eye, Items.bowl});

    	ExtractorRecipes.addItemRecipe(ROCItems.xylite_crystal, new ItemStack(ROCItems.xylite_ingot), 50.0f);
    	ExtractorRecipes.addItemRecipe(Item.getItemFromBlock(ROCBlocks.neptunite_ore), new ItemStack(ROCItems.neptunite_ingot), 40.0f);
    	ExtractorRecipes.addItemRecipe(Item.getItemFromBlock(ROCBlocks.ocean_stone), new ItemStack(Item.getItemFromBlock(ROCBlocks.ocean_glass)), 10.0f);
    	ExtractorRecipes.addItemRecipe(Item.getItemFromBlock(ROCBlocks.osmaralt_ore), new ItemStack(ROCItems.osmaralt_ingot), 50f);
    	ExtractorRecipes.addItemRecipe(Item.getItemFromBlock(ROCBlocks.fractonite_ore), new ItemStack(ROCItems.fractonite_stone), 65f);
    	
    	GameRegistry.addSmelting(ROCBlocks.heliotrope_ore, new ItemStack(ROCItems.heliotrope), 30.0f);
    	GameRegistry.addSmelting(ROCItems.raw_scorpion, new ItemStack(ROCItems.cooked_scorpion), 20.0f);
    	GameRegistry.addSmelting(ROCItems.seaweed, new ItemStack(ROCItems.dried_seaweed), 10);
	}
}
