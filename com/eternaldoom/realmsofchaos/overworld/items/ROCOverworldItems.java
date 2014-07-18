package com.eternaldoom.realmsofchaos.overworld.items;

import net.minecraft.item.Item;

public class ROCOverworldItems {

	//Overworld
	public static OverworldItem citronite_gem;
	public static OverworldItem xylite_crystal;
	public static OverworldItem xylite_ingot;
	
	//Nether
	public static OverworldItem ash_dust;
	
	public static void init(){
		citronite_gem = new OverworldItem("realmsofchaos:citronite_gem", "gemCitronite");
		ash_dust = new OverworldItem("realmsofchaos:ash_dust", "dustAsh");
		xylite_crystal = new OverworldItem("realmsofchaos:xylite_crystal", "crystalXylite");
		xylite_ingot = new OverworldItem("realmsofchaos:xylite_ingot", "ingotXylite");
		
		citronite_gem.register("citronite_gem");
		ash_dust.register("ash_dust");
		xylite_crystal.register("xylite_crystal");
		xylite_ingot.register("xylite_ingot");
	}
}
