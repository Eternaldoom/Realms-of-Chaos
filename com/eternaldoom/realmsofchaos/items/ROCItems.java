package com.eternaldoom.realmsofchaos.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

public class ROCItems {
	
	public static final int HELMET = 0, CHESTPLATE = 1, LEGGINGS = 2, BOOTS = 3;
	
	public static final ArmorMaterial IRONa = addArmorMaterial("IRON", 206, 9);
	public static final ArmorMaterial DIAMONDa = addArmorMaterial("DIAMOND", 454, 10);
	public static final ArmorMaterial HELIOTROPEa = addArmorMaterial("HELIOTROPE", 2651, 10);
	public static final ArmorMaterial CITRONITEa = addArmorMaterial("CITRONITE", 3151, 20);
	public static final ArmorMaterial XYLITEa = addArmorMaterial("XYLITE", 3651, 15);
	public static final ArmorMaterial FLAMEa = addArmorMaterial("FLAME", 2151, 12);
	public static final ArmorMaterial NEPTUNITEa = addArmorMaterial("NEPTUNITE", -1, 12);
	public static final ArmorMaterial AQUATICa = addArmorMaterial("AQUATIC", 3651, 6);
	public static final ArmorMaterial OSMARALTa = addArmorMaterial("OSMARALT", 5151, 50);
	public static final ArmorMaterial FRACTONITEa = addArmorMaterial("FRACTONITE", -1, 20);
	
	/*public static final ToolMaterial IRONt = EnumHelper.addToolMaterial("IRON", 2, 250, 6.0f, 0.0f, 14);
	public static final ToolMaterial DIAMONDt = EnumHelper.addToolMaterial("DIAMOND", 3, 1561, 8.0f, 1.0f, 10);
	public static final ToolMaterial HELIOTROPEt = EnumHelper.addToolMaterial("HELIOTROPE", 4, 2651, 9.5f, 2.0f, 10);
	public static final ToolMaterial CITRONITEt = EnumHelper.addToolMaterial("CITRONITE", 5, 3151, 10.5f, 2.0f, 20);
	public static final ToolMaterial XYLITEt = EnumHelper.addToolMaterial("XYLITE", 6, 3651, 12.0f, 3.5f, 15);
	public static final ToolMaterial FLAMEt = EnumHelper.addToolMaterial("FLAME", 7, 2151, 13.5f, 5.0f, 12);
	public static final ToolMaterial NEPTUNITEt = EnumHelper.addToolMaterial("NEPTUNITE", 8, -1, 15.0f, 6.5f, 12);
	public static final ToolMaterial AQUATICt = EnumHelper.addToolMaterial("AQUATIC", 9, 3651, 17f, 8f, 6);
	public static final ToolMaterial OSMARALTt = EnumHelper.addToolMaterial("OSMARALT", 10, 4651, 19.5f, 10f, 50);
	public static final ToolMaterial FRACTONITEt = EnumHelper.addToolMaterial("FRACTONITE", 11, 5651, 22f, 12f, 20);*/
	
	//Overworld
	public static ROCModItem citronite_gem;
	public static ROCModItem xylite_crystal;
	public static ROCModItem xylite_ingot;
	public static ROCModItem citronite_stone;
	public static ROCModItem heliotrope;
	public static ROCModItem aquatic_shard;
	public static ROCModItem aquatic_orb;
	public static ROCModItem neptunite_ingot;
	
	public static ItemROCArmor citronite_helmet;
	public static ItemROCArmor citronite_chestplate;
	public static ItemROCArmor citronite_leggings;
	public static ItemROCArmor citronite_boots;
	
	public static ItemROCArmor heliotrope_helmet;
	public static ItemROCArmor heliotrope_chestplate;
	public static ItemROCArmor heliotrope_leggings;
	public static ItemROCArmor heliotrope_boots;
	
	public static ItemROCArmor xylite_helmet, xylite_chestplate, xylite_leggings, xylite_boots;
	
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
	public static ItemROCArmor neptunite_helmet, neptunite_chestplate, neptunite_leggings, neptunite_boots;
	
	public static ROCModItem osmaralt_ingot;
	public static ROCModItem fractonite_stone;
	
	public static ItemROCArmor fractonite_helmet, fractonite_chestplate, fractonite_leggings, fractonite_boots;
	public static ItemROCArmor osmaralt_helmet, osmaralt_chestplate, osmaralt_leggings, osmaralt_boots;

	public static ItemROCSword aquatic_sword;
	public static ItemROCAxe aquatic_axe;
	public static ItemROCPickaxe aquatic_pickaxe;
	public static ItemROCShovel aquatic_shovel;
	
	public static ItemROCSword neptunite_sword;
	public static ItemROCAxe neptunite_axe;
	public static ItemROCPickaxe neptunite_pickaxe;
	public static ItemROCShovel neptunite_shovel;
	
	public static ItemROCSword osmaralt_sword;
	public static ItemROCAxe osmaralt_axe;
	public static ItemROCPickaxe osmaralt_pickaxe;
	public static ItemROCShovel osmaralt_shovel;
	
	public static ItemROCSword fractonite_sword;
	public static ItemROCAxe fractonite_axe;
	public static ItemROCPickaxe fractonite_pickaxe;
	public static ItemROCShovel fractonite_shovel;
	
	public static ROCModItem soybean;
	public static ItemROCFood raw_scorpion, cooked_scorpion;
	public static ItemROCFood dried_seaweed, miso_soup, tofu;
	public static ROCModItem soymilk;
	
	public static ItemScorpionStone scorpion_stone, scorpion_stone_active;
	
	public static ROCModItem scorpius_crystal;
	public static ROCModItem mystic_gem;
	
	public static ItemROCBow iron_bow, diamond_bow, heliotrope_bow, citronite_bow, xylite_bow, flamestone_bow, neptunite_bow, aquatic_bow, osmaralt_bow, fractonite_bow;
	public static ROCModItem iron_arrow, diamond_arrow, heliotrope_arrow, citronite_arrow, xylite_arrow, flamestone_arrow, neptunite_arrow, aquatic_arrow, osmaralt_arrow, fractonite_arrow;
	
	public static ItemCannon iron_cannon, diamond_cannon, heliotrope_cannon, citronite_cannon, xylite_cannon, flamestone_cannon, neptunite_cannon, aquatic_cannon, osmaralt_cannon, fractonite_cannon;
	public static ROCModItem iron_bullet, diamond_bullet, heliotrope_bullet, citronite_bullet, xylite_bullet, flamestone_bullet, neptunite_bullet, aquatic_bullet, osmaralt_bullet, fractonite_bullet;
	
	public static ROCModItem fish_scale;
	
	public static ROCModItem seaweed;
	
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
	public static ROCModItem ash_dust;
	public static ROCModItem flame_stone;
		
	public static void init(){
		citronite_gem = new ROCModItem("gemCitronite");
		ash_dust = new ROCModItem("dustAsh");
		xylite_crystal = new ROCModItem("crystalXylite");
		xylite_ingot = new ROCModItem("ingotXylite");
		citronite_stone = new ROCModItem("stoneCitronite");
		flame_stone = new ROCModItem("stoneFlame");
		heliotrope = new ROCModItem("heliotrope");
		aquatic_shard = new ROCModItem("shardAquatic");
		aquatic_orb = new ROCModItem("orbAquatic");
		neptunite_ingot = new ROCModItem("ingotNeptunite");
		
		/*heliotrope_helmet = new ItemROCArmor(HELIOTROPEa, HELMET, "heliotrope", "realmsofchaos:heliotrope_helmet", "helmetHeliotrope", 54D);
		heliotrope_chestplate = new ItemROCArmor(HELIOTROPEa, CHESTPLATE, "heliotrope", "realmsofchaos:heliotrope_chestplate", "chestplateHeliotrope", 54D);
		heliotrope_leggings = new ItemROCArmor(HELIOTROPEa, LEGGINGS, "heliotrope", "realmsofchaos:heliotrope_leggings", "leggingsHeliotrope", 54D);
		heliotrope_boots = new ItemROCArmor(HELIOTROPEa, BOOTS, "heliotrope", "realmsofchaos:heliotrope_boots", "bootsHeliotrope", 54D);
		
		citronite_helmet = new ItemROCArmor(CITRONITEa, HELMET, "citronite", "realmsofchaos:citronite_helmet", "helmetCitronite", 56D);
		citronite_chestplate = new ItemROCArmor(CITRONITEa, CHESTPLATE, "citronite", "realmsofchaos:citronite_chestplate", "chestplateCitronite", 56D);
		citronite_leggings = new ItemROCArmor(CITRONITEa, LEGGINGS, "citronite", "realmsofchaos:citronite_leggings", "leggingsCitronite", 56D);
		citronite_boots = new ItemROCArmor(CITRONITEa, BOOTS, "citronite", "realmsofchaos:citronite_boots", "bootsCitronite", 56D);
		
		xylite_helmet = new ItemROCArmor(XYLITEa, HELMET, "xylite", "realmsofchaos:xylite_helmet", "helmetXylite", 60D);
		xylite_chestplate = new ItemROCArmor(XYLITEa, CHESTPLATE, "xylite", "realmsofchaos:xylite_chestplate", "chestplateXylite", 60D);
		xylite_leggings = new ItemROCArmor(XYLITEa, LEGGINGS, "xylite", "realmsofchaos:xylite_leggings", "leggingsXylite", 60D);
		xylite_boots = new ItemROCArmor(XYLITEa, BOOTS, "xylite", "realmsofchaos:xylite_boots", "bootsXylite", 60D);
		
		flame_helmet = new ItemROCArmor(FLAMEa, HELMET, "flame", "realmsofchaos:flame_helmet", "helmetFlame", 63.5D);
		flame_chestplate = new ItemROCArmor(FLAMEa, CHESTPLATE, "flame", "realmsofchaos:flame_chestplate", "chestplateFlame", 63.5D);
		flame_leggings = new ItemROCArmor(FLAMEa, LEGGINGS, "flame", "realmsofchaos:flame_leggings", "leggingsFlame", 63.5D);
		flame_boots = new ItemROCArmor(FLAMEa, BOOTS, "flame", "realmsofchaos:flame_boots", "bootsFlame", 63.5D);*/

		/*citronite_sword = new ItemROCSword(CITRONITEt, "realmsofchaos:citronite_sword", "swordCitronite", false).register("citronite_sword");
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
		flame_shovel = new ItemROCShovel(FLAMEt, "realmsofchaos:flame_shovel", "shovelFlame", false);*/
		
		/*neptunite_helmet = new ItemROCArmor(NEPTUNITEa, HELMET, "neptunite", "realmsofchaos:neptunite_helmet", "helmetNeptunite", 65D);
		neptunite_chestplate = new ItemROCArmor(NEPTUNITEa, CHESTPLATE, "neptunite", "realmsofchaos:neptunite_chestplate", "chestplateNeptunite", 65D);
		neptunite_leggings = new ItemROCArmor(NEPTUNITEa, LEGGINGS, "neptunite", "realmsofchaos:neptunite_leggings", "leggingsNeptunite", 65D);
		neptunite_boots = new ItemROCArmor(NEPTUNITEa, BOOTS, "neptunite", "realmsofchaos:neptunite_boots", "bootsNeptunite", 65D);
		
		aquatic_helmet = new ItemROCArmor(AQUATICa, HELMET, "aquatic", "realmsofchaos:aquatic_helmet", "helmetAquatic", 66.5D);
		aquatic_chestplate = new ItemROCArmor(AQUATICa, CHESTPLATE, "aquatic", "realmsofchaos:aquatic_chestplate", "chestplateAquatic", 66.5D);
		aquatic_leggings = new ItemROCArmor(AQUATICa, LEGGINGS, "aquatic", "realmsofchaos:aquatic_leggings", "leggingsAquatic", 66.5D);
		aquatic_boots = new ItemROCArmor(AQUATICa, BOOTS, "aquatic", "realmsofchaos:aquatic_boots", "bootsAquatic", 66.5D);*/
		
		osmaralt_ingot = new ROCModItem("ingotOsmaralt");
		fractonite_stone = new ROCModItem("stoneFractonite");
		
		/*osmaralt_helmet = new ItemROCArmor(OSMARALTa, HELMET, "osmaralt", "realmsofchaos:osmaralt_helmet", "helmetOsmaralt", 68.25D);
		osmaralt_chestplate = new ItemROCArmor(OSMARALTa, CHESTPLATE, "osmaralt", "realmsofchaos:osmaralt_chestplate", "chestplateOsmaralt", 68.25D);
		osmaralt_leggings = new ItemROCArmor(OSMARALTa, LEGGINGS, "osmaralt", "realmsofchaos:osmaralt_leggings", "leggingsOsmaralt", 68.25D);
		osmaralt_boots = new ItemROCArmor(OSMARALTa, BOOTS, "osmaralt", "realmsofchaos:osmaralt_boots", "bootsOsmaralt", 68.25D);
		
		fractonite_helmet = new ItemROCArmor(FRACTONITEa, HELMET, "fractonite", "realmsofchaos:fractonite_helmet", "helmetFractonite", 70D);
		fractonite_chestplate = new ItemROCArmor(FRACTONITEa, CHESTPLATE, "fractonite", "realmsofchaos:fractonite_chestplate", "chestplateFractonite", 70D);
		fractonite_leggings = new ItemROCArmor(FRACTONITEa, LEGGINGS, "fractonite", "realmsofchaos:fractonite_leggings", "leggingsFractonite", 70D);
		fractonite_boots = new ItemROCArmor(FRACTONITEa, BOOTS, "fractonite", "realmsofchaos:fractonite_boots", "bootsFractonite", 70D);*/
		
		/*aquatic_sword = new ItemROCSword(AQUATICt, "realmsofchaos:aquatic_sword", "swordAquatic", false);
		aquatic_pickaxe = new ItemROCPickaxe(AQUATICt, "realmsofchaos:aquatic_pickaxe", "pickaxeAquatic", false);
		aquatic_axe = new ItemROCAxe(AQUATICt, "realmsofchaos:aquatic_axe", "axeAquatic", false);
		aquatic_shovel = new ItemROCShovel(AQUATICt, "realmsofchaos:aquatic_shovel", "shovelAquatic", false);
		
		neptunite_sword = new ItemROCSword(NEPTUNITEt, "realmsofchaos:neptunite_sword", "swordNeptunite", false);
		neptunite_pickaxe = new ItemROCPickaxe(NEPTUNITEt, "realmsofchaos:neptunite_pickaxe", "pickaxeNeptunite", false);
		neptunite_axe = new ItemROCAxe(NEPTUNITEt, "realmsofchaos:neptunite_axe", "axeNeptunite", false);
		neptunite_shovel = new ItemROCShovel(NEPTUNITEt, "realmsofchaos:neptunite_shovel", "shovelNeptunite", false);
		
		osmaralt_sword = new ItemROCSword(OSMARALTt, "realmsofchaos:osmaralt_sword", "swordOsmaralt", false);
		osmaralt_axe = new ItemROCAxe(OSMARALTt, "realmsofchaos:osmaralt_axe", "axeOsmaralt", false);
		osmaralt_pickaxe = new ItemROCPickaxe(OSMARALTt, "realmsofchaos:osmaralt_pickaxe", "pickaxeOsmaralt", false);
		osmaralt_shovel = new ItemROCShovel(OSMARALTt, "realmsofchaos:osmaralt_shovel", "shovelOsmaralt", false);
		
		fractonite_sword = new ItemROCSword(FRACTONITEt, "realmsofchaos:fractonite_sword", "swordFractonite", false);
		fractonite_pickaxe = new ItemROCPickaxe(FRACTONITEt, "realmsofchaos:fractonite_pickaxe", "pickaxeFractonite", false);
		fractonite_axe = new ItemROCAxe(FRACTONITEt, "realmsofchaos:fractonite_axe", "axeFractonite", false);
		fractonite_shovel = new ItemROCShovel(FRACTONITEt, "realmsofchaos:fractonite_shovel", "shovelFractonite", false);*/
		
		soybean = new ItemSoybean().register("soybean");
		raw_scorpion = new ItemROCFood(2, 0.2f, true, "realmsofchaos:raw_scorpion", "scorpionRaw");
		cooked_scorpion = new ItemROCFood(10, 1.0f, true, "realmsofchaos:cooked_scorpion", "scorpionCooked");
		dried_seaweed = new ItemROCFood(2, 0.1f, false, "realmsofchaos:dried_seaweed", "seaweedDried");
		miso_soup = (ItemROCFood) new ItemROCFood(10, 10, false, "realmsofchaos:miso_soup", "soupMiso").setMaxStackSize(1);
		tofu = new ItemROCFood(7, 12, false, "realmsofchaos:tofu", "tofu");
		soymilk = new ItemSoymilk().register("soymilk");
		
		scorpion_stone = (ItemScorpionStone) new ItemScorpionStone(false).register("scorpion_stone");
		scorpion_stone_active = (ItemScorpionStone) new ItemScorpionStone(true).register("scorpion_stone_active").setCreativeTab(null);
		
		scorpius_crystal = new ItemScorpiusCrystal().register("scorpius_crystal");
		mystic_gem = new ROCModItem("gemMystic").register("mystic_gem");
		
		fish_scale = new ROCModItem("scaleFish").register("fish_scale");
		
		seaweed = new ItemSeaweed(ROCBlocks.seaweed).register("seaweed");
		
		iron_arrow = new ROCModItem("arrowIron");
		diamond_arrow = new ROCModItem("arrowDiamond");
		heliotrope_arrow = new ROCModItem("arrowHeliotrope");
		citronite_arrow = new ROCModItem("arrowCitronite");
		xylite_arrow = new ROCModItem("arrowXylite");
		flamestone_arrow = new ROCModItem("arrowFlamestone");
	    neptunite_arrow = new ROCModItem("arrowNeptunite");
		aquatic_arrow = new ROCModItem("arrowAquatic");
		osmaralt_arrow = new ROCModItem("arrowOsmaralt");
		fractonite_arrow = new ROCModItem("arrowFractonite");
		
		iron_bow = new ItemROCBow("bowIron", ROCItems.iron_arrow, 425, 3);
		diamond_bow = new ItemROCBow("bowDiamond", ROCItems.diamond_arrow, 700, 5);
		heliotrope_bow = new ItemROCBow("bowHeliotrope", ROCItems.heliotrope_arrow, 1000, 5.5f);
		citronite_bow = new ItemROCBow("bowCitronite", ROCItems.citronite_arrow, 1200, 6);
		xylite_bow = new ItemROCBow("bowXylite", ROCItems.xylite_arrow, 1500, 7);
		flamestone_bow = new ItemROCBow("bowFlamestone", ROCItems.flamestone_arrow, 1700, 7.5f);
		neptunite_bow = new ItemROCBow("bowNeptunite", ROCItems.neptunite_arrow, -1, 8);
		aquatic_bow = new ItemROCBow("bowAquatic", ROCItems.aquatic_arrow, 2000, 8.5f);
		osmaralt_bow = new ItemROCBow("bowOsmaralt", ROCItems.osmaralt_arrow, 2200, 9);
		fractonite_bow = new ItemROCBow("bowFractonite", ROCItems.fractonite_arrow, -1, 10);

		iron_bullet = new ROCModItem("bulletIron");
		diamond_bullet = new ROCModItem("bulletDiamond");
		heliotrope_bullet = new ROCModItem("bulletHeliotrope");
		citronite_bullet = new ROCModItem("bulletCitronite");
		xylite_bullet = new ROCModItem("bulletXylite");
		flamestone_bullet = new ROCModItem("bulletFlamestone");
		neptunite_bullet = new ROCModItem("bulletNeptunite");
		aquatic_bullet = new ROCModItem("bulletAquatic");
		osmaralt_bullet = new ROCModItem("bulletOsmaralt");
		fractonite_bullet = new ROCModItem("bulletFractonite");
		
		iron_cannon = new ItemCannon("cannonIron", 300, iron_bullet, 2);
		diamond_cannon = new ItemCannon("cannonDiamond", 500, diamond_bullet, 4);
		heliotrope_cannon = new ItemCannon("cannonHeliotrope", 600, heliotrope_bullet, 5);
		citronite_cannon = new ItemCannon("cannonCitronite", 650, citronite_bullet, 5.5f);
		xylite_cannon = new ItemCannon("cannonXylite", 700, xylite_bullet, 6.5f);
		flamestone_cannon = new ItemCannon("cannonFlamestone", 750, flamestone_bullet, 7);
		neptunite_cannon = new ItemCannon("cannonNeptunite", 850, neptunite_bullet, 8.5f);
		aquatic_cannon = new ItemCannon("cannonAquatic", 1000, aquatic_bullet, 9.5f);
		osmaralt_cannon = new ItemCannon("cannonOsmaralt", 1150, osmaralt_bullet, 10.5f);
		fractonite_cannon = new ItemCannon("cannonFractonite", 1300, fractonite_bullet, 12);

		/*diamond_sword = new ItemROCSword(DIAMONDt, "minecraft:diamond_sword", "swordDiamond", true).register("diamond_sword");
		iron_sword = new ItemROCSword(IRONt, "minecraft:iron_sword", "swordIron", true).register("iron_sword");
		diamond_axe = new ItemROCAxe(DIAMONDt, "minecraft:diamond_axe", "hatchetDiamond", true).register("diamond_axe");
		iron_axe = new ItemROCAxe(IRONt, "minecraft:iron_axe", "hatchetIron", true).register("iron_axe");
		diamond_pickaxe = new ItemROCPickaxe(DIAMONDt, "minecraft:diamond_pickaxe", "pickaxeDiamond", true).register("diamond_pickaxe");
		iron_pickaxe = new ItemROCPickaxe(IRONt, "minecraft:iron_pickaxe", "pickaxeIron", true).register("iron_pickaxe");
		diamond_shovel = new ItemROCShovel(DIAMONDt, "minecraft:diamond_shovel", "shovelDiamond", true).register("diamond_shovel");
		iron_shovel = new ItemROCShovel(IRONt, "minecraft:iron_shovel", "shovelIron", true).register("iron_shovel");
		iron_helmet = new ItemROCArmor(IRONa, HELMET, "iron", "minecraft:iron_helmet", "helmetIron", 44D).register("iron_helmet");
		iron_chestplate = new ItemROCArmor(IRONa, CHESTPLATE, "iron", "minecraft:iron_chestplate", "chestplateIron", 44D).register("iron_chestplate");
		iron_leggings = new ItemROCArmor(IRONa, LEGGINGS, "iron", "minecraft:iron_leggings", "leggingsIron", 44D).register("iron_leggings");
		iron_boots = new ItemROCArmor(IRONa, BOOTS, "iron", "minecraft:iron_boots", "bootsIron", 44D).register("iron_boots");
		diamond_helmet = new ItemROCArmor(DIAMONDa, HELMET, "diamond", "minecraft:diamond_helmet", "helmetDiamond", 52D).register("diamond_helmet");
		diamond_chestplate = new ItemROCArmor(DIAMONDa, CHESTPLATE, "diamond", "minecraft:diamond_chestplate", "chestplateDiamond", 52D).register("diamond_chestplate");
		diamond_leggings = new ItemROCArmor(DIAMONDa, LEGGINGS, "diamond", "minecraft:diamond_leggings", "leggingsDiamond", 52D).register("diamond_leggings");
		diamond_boots = new ItemROCArmor(DIAMONDa, BOOTS, "diamond", "minecraft:diamond_boots", "bootsDiamond", 52D).register("diamond_boots");*/
		
		flame_sword.register("flamestone_sword");
		aquatic_sword.register("aquatic_sword");
		neptunite_sword.register("neptunite_sword");
		osmaralt_sword.register("osmaralt_sword");
		fractonite_sword.register("fractonite_sword");

		citronite_gem.register("citronite_gem");
		ash_dust.register("ash_dust");
		xylite_crystal.register("xylite_crystal");
		xylite_ingot.register("xylite_ingot");
		citronite_stone.register("citronite_stone");
		flame_stone.register("flame_stone");
		heliotrope.register("heliotrope");
		aquatic_shard.register("aquatic_shard");
		aquatic_orb.register("aquatic_orb");
		neptunite_ingot.register("neptunite_ingot");
		osmaralt_ingot.register("osmaralt_ingot");
		fractonite_stone.register("fractonite_stone");
		
		raw_scorpion.register("raw_scorpion");
		cooked_scorpion.register("cooked_scorpion");
		dried_seaweed.register("dried_seaweed");
		miso_soup.register("miso_soup");
		tofu.register("tofu");
		
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
		
		neptunite_helmet.register("neptunite_helmet");
		neptunite_chestplate.register("neptunite_chestplate");
		neptunite_leggings.register("neptunite_leggings");
		neptunite_boots.register("neptunite_boots");
		
		aquatic_helmet.register("aquatic_helmet");
		aquatic_chestplate.register("aquatic_chestplate");
		aquatic_leggings.register("aquatic_leggings");
		aquatic_boots.register("aquatic_boots");
		
		osmaralt_helmet.register("osmaralt_helmet");
		osmaralt_chestplate.register("osmaralt_chestplate");
		osmaralt_leggings.register("osmaralt_leggings");
		osmaralt_boots.register("osmaralt_boots");
		
		fractonite_helmet.register("fractonite_helmet");
		fractonite_chestplate.register("fractonite_chestplate");
		fractonite_leggings.register("fractonite_leggings");
		fractonite_boots.register("fractonite_boots");
		
		flame_pickaxe.register("flamestone_pickaxe");
		flame_axe.register("flamestone_axe");
		flame_shovel.register("flamestone_shovel");
		
		aquatic_pickaxe.register("aquatic_pickaxe");
		aquatic_axe.register("aquatic_axe");
		aquatic_shovel.register("aquatic_shovel");
		
		neptunite_pickaxe.register("neptunite_pickaxe");
		neptunite_axe.register("neptunite_axe");
		neptunite_shovel.register("neptunite_shovel");
		
		osmaralt_pickaxe.register("osmaralt_pickaxe");
		osmaralt_axe.register("osmaralt_axe");
		osmaralt_shovel.register("osmaralt_shovel");
		
		fractonite_pickaxe.register("fractonite_pickaxe");
		fractonite_axe.register("fractonite_axe");
		fractonite_shovel.register("fractonite_shovel");
		
		iron_bow.register("iron_bow");
		diamond_bow.register("diamond_bow");
		heliotrope_bow.register("heliotrope_bow");
		citronite_bow.register("citronite_bow");
		xylite_bow.register("xylite_bow");
		flamestone_bow.register("flamestone_bow");
		neptunite_bow.register("neptunite_bow");
		aquatic_bow.register("aquatic_bow");
		osmaralt_bow.register("osmaralt_bow");
		fractonite_bow.register("fractonite_bow");
		
		iron_arrow.register("iron_arrow");
		diamond_arrow.register("diamond_arrow");
		heliotrope_arrow.register("heliotrope_arrow");
		citronite_arrow.register("citronite_arrow");
		xylite_arrow.register("xylite_arrow");
		flamestone_arrow.register("flamestone_arrow");
		neptunite_arrow.register("neptunite_arrow");
		aquatic_arrow.register("aquatic_arrow");
		osmaralt_arrow.register("osmaralt_arrow");
		fractonite_arrow.register("fractonite_arrow");
		
		iron_cannon.register("iron_cannon");
		diamond_cannon.register("diamond_cannon");
		heliotrope_cannon.register("heliotrope_cannon");
		citronite_cannon.register("citronite_cannon");
		xylite_cannon.register("xylite_cannon");
		flamestone_cannon.register("flamestone_cannon");
		neptunite_cannon.register("neptunite_cannon");
		aquatic_cannon.register("aquatic_cannon");
		osmaralt_cannon.register("osmaralt_cannon");
		fractonite_cannon.register("fractonite_cannon");
		
		iron_bullet.register("iron_bullet");
		diamond_bullet.register("diamond_bullet");
		heliotrope_bullet.register("heliotrope_bullet");
		citronite_bullet.register("citronite_bullet");
		xylite_bullet.register("xylite_bullet");
		flamestone_bullet.register("flamestone_bullet");
		neptunite_bullet.register("neptunite_bullet");
		aquatic_bullet.register("aquatic_bullet");
		osmaralt_bullet.register("osmaralt_bullet");
		fractonite_bullet.register("fractonite_bullet");
	}
	
	public static ArmorMaterial addArmorMaterial(String name, int durability, int enchantability)
	{
        //return EnumHelper.addEnum(ArmorMaterial.class, name, durability/14, new int[]{0, 0, 0, 0}, enchantability);
		return null;
    }
}
