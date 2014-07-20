package com.eternaldoom.realmsofchaos.overworld.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.eternaldoom.realmsofchaos.overworld.items.ItemROCArmor;
import com.eternaldoom.realmsofchaos.overworld.items.ItemROCAxe;
import com.eternaldoom.realmsofchaos.overworld.items.ItemROCPickaxe;
import com.eternaldoom.realmsofchaos.overworld.items.ItemROCShovel;
import com.eternaldoom.realmsofchaos.overworld.items.ItemROCSword;
import com.eternaldoom.realmsofchaos.overworld.items.OverworldItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHelper {
	
	private static String[][] armorPatterns = new String[][] {{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
	private static String[][] toolPatterns = new String[][] {{" X ", " X ", " S "}, {"XXX", " S ", " S "}, {"XX ", "XS ", " S "}, {" X ", " S ", " S "}};

	public static void addArmorRecipe(ItemROCArmor helmet, ItemROCArmor chestplate, ItemROCArmor leggings, ItemROCArmor boots, OverworldItem material){
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[]{armorPatterns[0], 'X', material});
		GameRegistry.addRecipe(new ItemStack(chestplate), new Object[]{armorPatterns[1], 'X', material});
		GameRegistry.addRecipe(new ItemStack(leggings), new Object[]{armorPatterns[2], 'X', material});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[]{armorPatterns[3], 'X', material});
		
		helmet.getArmorMaterial().customCraftingMaterial = material;
		chestplate.getArmorMaterial().customCraftingMaterial = material;
		leggings.getArmorMaterial().customCraftingMaterial = material;
		boots.getArmorMaterial().customCraftingMaterial = material;
	}
	
	public static void addToolRecipe(ItemROCSword sword, ItemROCPickaxe pickaxe, ItemROCAxe axe, ItemROCShovel shovel, OverworldItem material){
		GameRegistry.addRecipe(new ItemStack(sword), new Object[]{toolPatterns[0], 'X', material, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[]{toolPatterns[1], 'X', material, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(axe), new Object[]{toolPatterns[2], 'X', material, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[]{toolPatterns[3], 'X', material, 'S', Items.stick});
	}
}