package com.eternaldoom.realmsofchaos.overworld.items;

import net.minecraft.item.Item;

public class ROCOverworldItems {

	//Overworld
	public static OverworldItem citronite_gem;
	public static OverworldItem xylite_crystal;
	public static OverworldItem xylite_ingot;
	public static OverworldItem citronite_stone;
	
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
		
		citronite_gem.register("citronite_gem");
		ash_dust.register("ash_dust");
		xylite_crystal.register("xylite_crystal");
		xylite_ingot.register("xylite_ingot");
		citronite_stone.register("citronite_stone");
		flame_stone.register("flame_stone");
	}
}
