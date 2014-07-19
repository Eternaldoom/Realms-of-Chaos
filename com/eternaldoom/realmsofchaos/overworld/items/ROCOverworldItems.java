package com.eternaldoom.realmsofchaos.overworld.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ROCOverworldItems {
	
	public static final int HELMET = 0, CHESTPLATE = 1, LEGGINGS = 2, BOOTS = 3;
	
	public static final ArmorMaterial CITRONITEa = addArmorMaterial("CITRONITE", 2651, new int[]{3, 5, 4, 2}, 10);
	public static final ArmorMaterial HELIOTROPEa = addArmorMaterial("HELIOTROPE", 3151, new int[]{3, 5, 4, 2}, 20);
	public static final ArmorMaterial XYLITEa = addArmorMaterial("XYLITE", 3651, new int[]{3, 5, 5, 3}, 15);
	
	public static final ToolMaterial IRONt = EnumHelper.addToolMaterial("IRON", 2, 250, 6.0f, 0.0f, 14);
	public static final ToolMaterial DIAMONDt = EnumHelper.addToolMaterial("DIAMOND", 3, 1561, 8.0f, 1.0f, 10);
	public static final ToolMaterial CITRONITEt = EnumHelper.addToolMaterial("CITRONITE", 4, 2651, 12.0f, 2.0f, 10);
	public static final ToolMaterial HELIOTROPEt = EnumHelper.addToolMaterial("HELIOTROPE", 5, 3151, 12.0f, 2.0f, 20);
	public static final ToolMaterial XYLITEt = EnumHelper.addToolMaterial("XYLITE", 6, 3651, 14.0f, 3.5f, 15);
	
	//Overworld
	public static OverworldItem citronite_gem;
	public static OverworldItem xylite_crystal;
	public static OverworldItem xylite_ingot;
	public static OverworldItem citronite_stone;
	
	public static ItemROCArmor citronite_helmet;
	public static ItemROCArmor citronite_chestplate;
	public static ItemROCArmor citronite_leggings;
	public static ItemROCArmor citronite_boots;
	
	public static ItemROCArmor heliotrope_helmet;
	public static ItemROCArmor heliotrope_chestplate;
	public static ItemROCArmor heliotrope_leggings;
	public static ItemROCArmor heliotrope_boots;
	
	public static ItemROCArmor xylite_helmet;
	public static ItemROCArmor xylite_chestplate;
	public static ItemROCArmor xylite_leggings;
	public static ItemROCArmor xylite_boots;
	
	public static ItemROCSword citronite_sword;
	public static ItemROCAxe citronite_axe;
	public static ItemROCPickaxe citronite_pickaxe;
	public static ItemROCShovel citronite_shovel;
	
	public static ItemROCSword heliotrope_sword;
	public static ItemROCAxe heliotrope_axe;
	public static ItemROCPickaxe heliotrope_pickaxe;
	public static ItemROCShovel heliotrope_shovel;
	
	public static ItemROCSword xylite_sword;
	public static ItemROCAxe xylite_axe;
	public static ItemROCPickaxe xylite_pickaxe;
	public static ItemROCShovel xylite_shovel;
	
	//Replaced vanilla items
	public static ItemROCSword diamond_sword;
	public static ItemROCSword iron_sword;
	public static ItemROCAxe diamond_axe;
	public static ItemROCAxe iron_axe;
	public static ItemROCPickaxe diamond_pickaxe;
	public static ItemROCPickaxe iron_pickaxe;
	public static ItemROCShovel diamond_shovel;
	public static ItemROCShovel iron_shovel;
	
	//Nether
	public static OverworldItem ash_dust;
	public static OverworldItem flame_stone;
	
	public static void init(){
		citronite_gem = new OverworldItem("realmsofchaos:citronite_gem", "gemCitronite");
		ash_dust = new OverworldItem("realmsofchaos:ash_dust", "dustAsh");
		xylite_crystal = new OverworldItem("realmsofchaos:xylite_crystal", "crystalXylite");
		xylite_ingot = new OverworldItem("realmsofchaos:xylite_ingot", "ingotXylite");
		citronite_stone = new OverworldItem("realmsofchaos:citronite_stone", "stoneCitronite");
		flame_stone = new OverworldItem("realmsofchaos:flame_stone", "stoneFlame");
		
		citronite_helmet = new ItemROCArmor(CITRONITEa, HELMET, "citronite", "realmsofchaos:citronite_helmet", "helmetCitronite").register("citronite_helmet");
		citronite_chestplate = new ItemROCArmor(CITRONITEa, CHESTPLATE, "citronite", "realmsofchaos:citronite_chestplate", "chestplateCitronite").register("citronite_chestplate");
		citronite_leggings = new ItemROCArmor(CITRONITEa, LEGGINGS, "citronite", "realmsofchaos:citronite_leggings", "leggingsCitronite").register("citronite_leggings");
		citronite_boots = new ItemROCArmor(CITRONITEa, BOOTS, "citronite", "realmsofchaos:citronite_boots", "bootsCitronite").register("citronite_boots");
		
		heliotrope_helmet = new ItemROCArmor(HELIOTROPEa, HELMET, "heliotrope", "realmsofchaos:heliotrope_helmet", "helmetHeliotrope").register("heliotrope_helmet");
		heliotrope_chestplate = new ItemROCArmor(HELIOTROPEa, CHESTPLATE, "heliotrope", "realmsofchaos:heliotrope_chestplate", "chestplateHeliotrope").register("heliotrope_chestplate");
		heliotrope_leggings = new ItemROCArmor(HELIOTROPEa, LEGGINGS, "heliotrope", "realmsofchaos:heliotrope_leggings", "leggingsHeliotrope").register("heliotrope_leggings");
		heliotrope_boots = new ItemROCArmor(HELIOTROPEa, BOOTS, "heliotrope", "realmsofchaos:heliotrope_boots", "bootsHeliotrope").register("heliotrope_boots");
		
		xylite_helmet = new ItemROCArmor(XYLITEa, HELMET, "xylite", "realmsofchaos:xylite_helmet", "helmetXylite").register("xylite_helmet");
		xylite_chestplate = new ItemROCArmor(XYLITEa, CHESTPLATE, "xylite", "realmsofchaos:xylite_chestplate", "chestplateXylite").register("xylite_chestplate");
		xylite_leggings = new ItemROCArmor(XYLITEa, LEGGINGS, "xylite", "realmsofchaos:xylite_leggings", "leggingsXylite").register("xylite_leggings");
		xylite_boots = new ItemROCArmor(XYLITEa, BOOTS, "xylite", "realmsofchaos:xylite_boots", "bootsXylite").register("xylite_boots");
		
		citronite_sword = new ItemROCSword(CITRONITEt, "realmsofchaos:citronite_sword", "swordCitronite", false).register("citronite_sword");
		citronite_axe = new ItemROCAxe(CITRONITEt, "realmsofchaos:citronite_axe", "axeCitronite", false).register("citronite_axe");
		citronite_pickaxe = new ItemROCPickaxe(CITRONITEt, "realmsofchaos:citronite_pickaxe", "pickaxeCitronite", false).register("citronite_pickaxe");
		citronite_shovel = new ItemROCShovel(CITRONITEt, "realmsofchaos:citronite_shovel", "shovelCitronite", false).register("citronite_shovel");
		
		heliotrope_sword = new ItemROCSword(HELIOTROPEt, "realmsofchaos:heliotrope_sword", "swordHeliotrope", false).register("heliotrope_sword");
		heliotrope_axe = new ItemROCAxe(HELIOTROPEt, "realmsofchaos:heliotrope_axe", "axeHeliotrope", false).register("heliotrope_axe");
		heliotrope_pickaxe = new ItemROCPickaxe(HELIOTROPEt, "realmsofchaos:heliotrope_pickaxe", "pickaxeHeliotrope", false).register("heliotrope_pickaxe");
		heliotrope_shovel = new ItemROCShovel(HELIOTROPEt, "realmsofchaos:heliotrope_shovel", "shovelHeliotrope", false).register("heliotrope_shovel");

		xylite_sword = new ItemROCSword(XYLITEt, "realmsofchaos:xylite_sword", "swordXylite", false).register("xylite_sword");
		xylite_axe = new ItemROCAxe(XYLITEt, "realmsofchaos:xylite_axe", "axeXylite", false).register("xylite_axe");
		xylite_pickaxe = new ItemROCPickaxe(XYLITEt, "realmsofchaos:xylite_pickaxe", "pickaxeXylite", false).register("xylite_pickaxe");
		xylite_shovel = new ItemROCShovel(XYLITEt, "realmsofchaos:xylite_shovel", "shovelXylite", false).register("xylite_shovel");
		
		diamond_sword = new ItemROCSword(DIAMONDt, "minecraft:diamond_sword", "swordDiamond", true).register("diamond_sword");
		iron_sword = new ItemROCSword(IRONt, "minecraft:iron_sword", "swordIron", true).register("iron_sword");
		diamond_axe = new ItemROCAxe(DIAMONDt, "minecraft:diamond_axe", "hatchetDiamond", true).register("diamond_axe");
		iron_axe = new ItemROCAxe(IRONt, "minecraft:iron_axe", "hatchetIron", true).register("iron_axe");
		diamond_pickaxe = new ItemROCPickaxe(DIAMONDt, "minecraft:diamond_pickaxe", "pickaxeDiamond", true).register("diamond_pickaxe");
		iron_pickaxe = new ItemROCPickaxe(IRONt, "minecraft:iron_pickaxe", "pickaxeIron", true).register("iron_pickaxe");
		diamond_shovel = new ItemROCShovel(DIAMONDt, "minecraft:diamond_shovel", "shovelDiamond", true).register("diamond_shovel");
		iron_shovel = new ItemROCShovel(IRONt, "minecraft:iron_shovel", "shovelIron", true).register("iron_shovel");

		citronite_gem.register("citronite_gem");
		ash_dust.register("ash_dust");
		xylite_crystal.register("xylite_crystal");
		xylite_ingot.register("xylite_ingot");
		citronite_stone.register("citronite_stone");
		flame_stone.register("flame_stone");
	}
	
	public static ArmorMaterial addArmorMaterial(String name, int durability, int[] damReduct, int enchantability)
	{
        return EnumHelper.addEnum(ArmorMaterial.class, name, durability/14, damReduct, enchantability);
    }
}
