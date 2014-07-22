package com.eternaldoom.realmsofchaos.overworld.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ROCOverworldItems {
	
	public static final int HELMET = 0, CHESTPLATE = 1, LEGGINGS = 2, BOOTS = 3;
	
	public static final ArmorMaterial IRONa = addArmorMaterial("IRON", 206, new int[]{11, 11, 11, 11}, 9);
	public static final ArmorMaterial DIAMONDa = addArmorMaterial("DIAMOND", 454, new int[]{13, 13, 13, 13}, 10);
	public static final ArmorMaterial HELIOTROPEa = addArmorMaterial("HELIOTROPE", 2651, new int[]{14, 14, 14, 14}, 10);
	public static final ArmorMaterial CITRONITEa = addArmorMaterial("CITRONITE", 3151, new int[]{14, 14, 14, 14}, 20);
	public static final ArmorMaterial XYLITEa = addArmorMaterial("XYLITE", 3651, new int[]{15, 15, 15, 15}, 15);
	public static final ArmorMaterial FLAMEa = addArmorMaterial("FLAME", 2151, new int[]{16, 16, 16, 16}, 12);
	public static final ArmorMaterial AQUATICa = addArmorMaterial("AQUATIC", -1, new int[]{17, 17, 17, 17}, 6);
	
	public static final ToolMaterial IRONt = EnumHelper.addToolMaterial("IRON", 2, 250, 6.0f, 0.0f, 14);
	public static final ToolMaterial DIAMONDt = EnumHelper.addToolMaterial("DIAMOND", 3, 1561, 8.0f, 1.0f, 10);
	public static final ToolMaterial HELIOTROPEt = EnumHelper.addToolMaterial("HELIOTROPE", 4, 2651, 12.0f, 2.0f, 10);
	public static final ToolMaterial CITRONITEt = EnumHelper.addToolMaterial("CITRONITE", 5, 3151, 12.0f, 2.0f, 20);
	public static final ToolMaterial XYLITEt = EnumHelper.addToolMaterial("XYLITE", 6, 3651, 14.0f, 3.5f, 15);
	public static final ToolMaterial FLAMEt = EnumHelper.addToolMaterial("FLAME", 7, 2151, 15.5f, 5.0f, 12);
	public static final ToolMaterial AQUATICt = EnumHelper.addToolMaterial("AQUATIC", 8, -1, 20.0f, 8.0f, 8);
	
	//Overworld
	public static OverworldItem citronite_gem;
	public static OverworldItem xylite_crystal;
	public static OverworldItem xylite_ingot;
	public static OverworldItem citronite_stone;
	public static OverworldItem heliotrope;
	
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
	
	public static ItemROCArmor flame_helmet, flame_chestplate, flame_leggings, flame_boots;
	
	public static ItemROCSword flame_sword;
	public static ItemROCPickaxe flame_pickaxe;
	public static ItemROCAxe flame_axe;
	public static ItemROCShovel flame_shovel;
	
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
	
	public static ItemROCArmor aquatic_helmet, aquatic_chestplate, aquatic_leggings, aquatic_boots;
	
	public static ItemROCSword aquatic_sword;
	public static ItemROCAxe aquatic_axe;
	public static ItemROCPickaxe aquatic_pickaxe;
	public static ItemROCShovel aquatic_shovel;
	
	//Replaced vanilla items
	public static ItemROCSword diamond_sword;
	public static ItemROCSword iron_sword;
	public static ItemROCAxe diamond_axe;
	public static ItemROCAxe iron_axe;
	public static ItemROCPickaxe diamond_pickaxe;
	public static ItemROCPickaxe iron_pickaxe;
	public static ItemROCShovel diamond_shovel;
	public static ItemROCShovel iron_shovel;
	public static ItemROCArmor iron_helmet, iron_chestplate, iron_leggings, iron_boots;
	public static ItemROCArmor diamond_helmet, diamond_chestplate, diamond_leggings, diamond_boots;
	
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
		heliotrope = new OverworldItem("realmsofchaos:heliotrope", "heliotrope");
		
		citronite_helmet = new ItemROCArmor(CITRONITEa, HELMET, "citronite", "realmsofchaos:citronite_helmet", "helmetCitronite", false);
		citronite_chestplate = new ItemROCArmor(CITRONITEa, CHESTPLATE, "citronite", "realmsofchaos:citronite_chestplate", "chestplateCitronite", false);
		citronite_leggings = new ItemROCArmor(CITRONITEa, LEGGINGS, "citronite", "realmsofchaos:citronite_leggings", "leggingsCitronite", false);
		citronite_boots = new ItemROCArmor(CITRONITEa, BOOTS, "citronite", "realmsofchaos:citronite_boots", "bootsCitronite", false);
		
		heliotrope_helmet = new ItemROCArmor(HELIOTROPEa, HELMET, "heliotrope", "realmsofchaos:heliotrope_helmet", "helmetHeliotrope", false);
		heliotrope_chestplate = new ItemROCArmor(HELIOTROPEa, CHESTPLATE, "heliotrope", "realmsofchaos:heliotrope_chestplate", "chestplateHeliotrope", false);
		heliotrope_leggings = new ItemROCArmor(HELIOTROPEa, LEGGINGS, "heliotrope", "realmsofchaos:heliotrope_leggings", "leggingsHeliotrope", false);
		heliotrope_boots = new ItemROCArmor(HELIOTROPEa, BOOTS, "heliotrope", "realmsofchaos:heliotrope_boots", "bootsHeliotrope", false);
		
		xylite_helmet = new ItemROCArmor(XYLITEa, HELMET, "xylite", "realmsofchaos:xylite_helmet", "helmetXylite", false);
		xylite_chestplate = new ItemROCArmor(XYLITEa, CHESTPLATE, "xylite", "realmsofchaos:xylite_chestplate", "chestplateXylite", false);
		xylite_leggings = new ItemROCArmor(XYLITEa, LEGGINGS, "xylite", "realmsofchaos:xylite_leggings", "leggingsXylite", false);
		xylite_boots = new ItemROCArmor(XYLITEa, BOOTS, "xylite", "realmsofchaos:xylite_boots", "bootsXylite", false);
		
		flame_helmet = new ItemROCArmor(FLAMEa, HELMET, "flame", "realmsofchaos:flame_helmet", "helmetFlame", false);
		flame_chestplate = new ItemROCArmor(FLAMEa, CHESTPLATE, "flame", "realmsofchaos:flame_chestplate", "chestplateFlame", false);
		flame_leggings = new ItemROCArmor(FLAMEa, LEGGINGS, "flame", "realmsofchaos:flame_leggings", "leggingsFlame", false);
		flame_boots = new ItemROCArmor(FLAMEa, BOOTS, "flame", "realmsofchaos:flame_boots", "bootsFlame", false);

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
		
		flame_sword = new ItemROCSword(FLAMEt, "realmsofchaos:flame_sword", "swordFlame", false);
		flame_pickaxe = new ItemROCPickaxe(FLAMEt, "realmsofchaos:flame_pickaxe", "pickaxeFlame", false);
		flame_axe = new ItemROCAxe(FLAMEt, "realmsofchaos:flame_axe", "axeFlame", false);
		flame_shovel = new ItemROCShovel(FLAMEt, "realmsofchaos:flame_shovel", "shovelFlame", false);
		
		aquatic_helmet = new ItemROCArmor(AQUATICa, HELMET, "aquatic", "realmsofchaos:aquatic_helmet", "helmetAquatic", false);
		aquatic_chestplate = new ItemROCArmor(AQUATICa, CHESTPLATE, "aquatic", "realmsofchaos:aquatic_chestplate", "chestplateAquatic", false);
		aquatic_leggings = new ItemROCArmor(AQUATICa, LEGGINGS, "aquatic", "realmsofchaos:aquatic_leggings", "leggingsAquatic", false);
		aquatic_boots = new ItemROCArmor(AQUATICa, BOOTS, "aquatic", "realmsofchaos:aquatic_boots", "bootsAquatic", false);
		
		aquatic_sword = new ItemROCSword(AQUATICt, "realmsofchaos:aquatic_sword", "swordAquatic", false);
		aquatic_pickaxe = new ItemROCPickaxe(AQUATICt, "realmsofchaos:aquatic_pickaxe", "pickaxeAquatic", false);
		aquatic_axe = new ItemROCAxe(AQUATICt, "realmsofchaos:aquatic_axe", "axeAquatic", false);
		aquatic_shovel = new ItemROCShovel(AQUATICt, "realmsofchaos:aquatic_shovel", "shovelAquatic", false);

		diamond_sword = new ItemROCSword(DIAMONDt, "minecraft:diamond_sword", "swordDiamond", true).register("diamond_sword");
		iron_sword = new ItemROCSword(IRONt, "minecraft:iron_sword", "swordIron", true).register("iron_sword");
		diamond_axe = new ItemROCAxe(DIAMONDt, "minecraft:diamond_axe", "hatchetDiamond", true).register("diamond_axe");
		iron_axe = new ItemROCAxe(IRONt, "minecraft:iron_axe", "hatchetIron", true).register("iron_axe");
		diamond_pickaxe = new ItemROCPickaxe(DIAMONDt, "minecraft:diamond_pickaxe", "pickaxeDiamond", true).register("diamond_pickaxe");
		iron_pickaxe = new ItemROCPickaxe(IRONt, "minecraft:iron_pickaxe", "pickaxeIron", true).register("iron_pickaxe");
		diamond_shovel = new ItemROCShovel(DIAMONDt, "minecraft:diamond_shovel", "shovelDiamond", true).register("diamond_shovel");
		iron_shovel = new ItemROCShovel(IRONt, "minecraft:iron_shovel", "shovelIron", true).register("iron_shovel");
		iron_helmet = new ItemROCArmor(IRONa, HELMET, "iron", "minecraft:iron_helmet", "helmetIron", true).register("iron_helmet");
		iron_chestplate = new ItemROCArmor(IRONa, CHESTPLATE, "iron", "minecraft:iron_chestplate", "chestplateIron", true).register("iron_chestplate");
		iron_leggings = new ItemROCArmor(IRONa, LEGGINGS, "iron", "minecraft:iron_leggings", "leggingsIron", true).register("iron_leggings");
		iron_boots = new ItemROCArmor(IRONa, BOOTS, "iron", "minecraft:iron_boots", "bootsIron", true).register("iron_boots");
		diamond_helmet = new ItemROCArmor(DIAMONDa, HELMET, "diamond", "minecraft:diamond_helmet", "helmetDiamond", true).register("diamond_helmet");
		diamond_chestplate = new ItemROCArmor(DIAMONDa, CHESTPLATE, "diamond", "minecraft:diamond_chestplate", "chestplateDiamond", true).register("diamond_chestplate");
		diamond_leggings = new ItemROCArmor(DIAMONDa, LEGGINGS, "diamond", "minecraft:diamond_leggings", "leggingsDiamond", true).register("diamond_leggings");
		diamond_boots = new ItemROCArmor(DIAMONDa, BOOTS, "diamond", "minecraft:diamond_boots", "bootsDiamond", true).register("diamond_boots");
		
		flame_sword.register("flamestone_sword");
		aquatic_sword.register("aquatic_sword");

		citronite_gem.register("citronite_gem");
		ash_dust.register("ash_dust");
		xylite_crystal.register("xylite_crystal");
		xylite_ingot.register("xylite_ingot");
		citronite_stone.register("citronite_stone");
		flame_stone.register("flame_stone");
		heliotrope.register("heliotrope");
		
		heliotrope_helmet.register("heliotrope_helmet");
		heliotrope_chestplate.register("heliotrope_chestplate");
		heliotrope_leggings.register("heliotrope_leggings");
		heliotrope_boots.register("heliotrope_boots");
		
		citronite_helmet.register("citronite_helmet");
		citronite_chestplate.register("citronite_chestplate");
		citronite_leggings.register("citronite_leggings");
		citronite_boots.register("citronite_boots");
		
		xylite_helmet.register("xylite_helmet");
		xylite_chestplate.register("xylite_chestplate");
		xylite_leggings.register("xylite_leggings");
		xylite_boots.register("xylite_boots");
		
		flame_helmet.register("flamestone_helmet");
		flame_chestplate.register("flamestone_chestplate");
		flame_leggings.register("flamestone_leggings");
		flame_boots.register("flamestone_boots");
		
		aquatic_helmet.register("aquatic_helmet");
		aquatic_chestplate.register("aquatic_chestplate");
		aquatic_leggings.register("aquatic_leggings");
		aquatic_boots.register("aquatic_boots");
		
		flame_pickaxe.register("flamestone_pickaxe");
		flame_axe.register("flamestone_axe");
		flame_shovel.register("flamestone_shovel");
		
		aquatic_pickaxe.register("aquatic_pickaxe");
		aquatic_axe.register("aquatic_axe");
		aquatic_shovel.register("aquatic_shovel");
	}
	
	public static ArmorMaterial addArmorMaterial(String name, int durability, int[] damReduct, int enchantability)
	{
        return EnumHelper.addEnum(ArmorMaterial.class, name, durability/14, damReduct, enchantability);
    }
}
