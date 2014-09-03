package com.eternaldoom.realmsofchaos.crafting;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.eternaldoom.realmsofchaos.items.ItemCannon;
import com.eternaldoom.realmsofchaos.items.ItemROCArmor;
import com.eternaldoom.realmsofchaos.items.ItemROCAxe;
import com.eternaldoom.realmsofchaos.items.ItemROCBow;
import com.eternaldoom.realmsofchaos.items.ItemROCPickaxe;
import com.eternaldoom.realmsofchaos.items.ItemROCShovel;
import com.eternaldoom.realmsofchaos.items.ItemROCSword;
import com.eternaldoom.realmsofchaos.items.ROCModItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHelper {
	
	private static String[][] armorPatterns = new String[][] {{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
	private static String[][] toolPatterns = new String[][] {{" X ", " X ", " S "}, {"XXX", " S ", " S "}, {"XX ", "XS ", " S "}, {" X ", " S ", " S "}, {"F", "M", "T"}, {" XS", "X S", " XS"}};
	private static String[] cannonPattern = {"B  ", "BS ", " S "};
	public static String[][] stonePatterns = {{"MMM"}, {"M  ", "MM ", "MMM"}, {"MM", "MM"}, {"S", "S"}};

	public static void addArmorRecipe(ItemROCArmor helmet, ItemROCArmor chestplate, ItemROCArmor leggings, ItemROCArmor boots, ROCModItem material){
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[]{armorPatterns[0], 'X', material});
		GameRegistry.addRecipe(new ItemStack(chestplate), new Object[]{armorPatterns[1], 'X', material});
		GameRegistry.addRecipe(new ItemStack(leggings), new Object[]{armorPatterns[2], 'X', material});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[]{armorPatterns[3], 'X', material});
		
		helmet.getArmorMaterial().customCraftingMaterial = material;
		chestplate.getArmorMaterial().customCraftingMaterial = material;
		leggings.getArmorMaterial().customCraftingMaterial = material;
		boots.getArmorMaterial().customCraftingMaterial = material;
	}
	
	public static void addToolRecipe(ItemROCSword sword, ItemROCPickaxe pickaxe, ItemROCAxe axe, ItemROCShovel shovel, ItemROCBow bow, Item arrow, Item material){
		GameRegistry.addRecipe(new ItemStack(sword), new Object[]{toolPatterns[0], 'X', material, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[]{toolPatterns[1], 'X', material, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(axe), new Object[]{toolPatterns[2], 'X', material, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[]{toolPatterns[3], 'X', material, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(arrow, 16), new Object[]{toolPatterns[4], 'F', Items.flint, 'M', material, 'T', Items.feather});
		GameRegistry.addRecipe(new ItemStack(bow), new Object[]{toolPatterns[5], 'X', material, 'S', Items.string});
	}
	
	public static void addToolRecipe(ItemROCSword sword, ItemROCPickaxe pickaxe, ItemROCAxe axe, ItemROCShovel shovel, ItemROCBow bow, Item arrow, Item material, Item arrowFin){
		GameRegistry.addRecipe(new ItemStack(sword), new Object[]{toolPatterns[0], 'X', material, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[]{toolPatterns[1], 'X', material, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(axe), new Object[]{toolPatterns[2], 'X', material, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[]{toolPatterns[3], 'X', material, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(arrow, 16), new Object[]{toolPatterns[4], 'F', Items.flint, 'M', material, 'T', arrowFin});
		GameRegistry.addRecipe(new ItemStack(bow), new Object[]{toolPatterns[5], 'X', material, 'S', Items.string});
	}
	
	public static void addCannonRecipe(Block block, ItemCannon cannon, Item material, ROCModItem bullet){
		GameRegistry.addRecipe(new ItemStack(cannon), new Object[]{cannonPattern, 'B', Item.getItemFromBlock(block), 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(bullet, 12), new Object[]{"M", 'M', material});
	}
	
	public static void addStoneRecipe(Block material, Block bricks, Block slab, Block stairs, Block brickslab, Block cobblestone, Block cobbleslab, Block cobblestairs, Block brickstairs){
		GameRegistry.addRecipe(new ItemStack(slab, 6), new Object[]{stonePatterns[0], 'M', material});
		GameRegistry.addRecipe(new ItemStack(stairs, 4), new Object[]{stonePatterns[1], 'M', material});
		GameRegistry.addRecipe(new ItemStack(bricks, 4, 0), new Object[]{stonePatterns[2], 'M', material});
		GameRegistry.addSmelting(new ItemStack(bricks, 1, 0), new ItemStack(bricks, 1, 1), 10);
		GameRegistry.addRecipe(new ItemStack(bricks, 1, 2), new Object[]{stonePatterns[3], 'S', slab});
		GameRegistry.addRecipe(new ItemStack(brickslab, 6), new Object[]{stonePatterns[0], 'M', new ItemStack(bricks, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(cobbleslab, 6), new Object[]{stonePatterns[0], 'M', cobblestone});
		GameRegistry.addSmelting(cobblestone, new ItemStack(material), 10);
		GameRegistry.addRecipe(new ItemStack(cobblestairs, 4), new Object[]{stonePatterns[1], 'M', cobblestone});
		GameRegistry.addRecipe(new ItemStack(brickstairs, 4), new Object[]{stonePatterns[1], 'M', new ItemStack(bricks, 1, 0)});
	}
}