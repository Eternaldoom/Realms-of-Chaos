package com.eternaldoom.realmsofchaos.overworld.items;

import net.minecraft.item.Item;

public class ROCOverworldItems {

	//Overworld
	public static OverworldItem citronite_gem;
	
	//Nether
	public static OverworldItem ash_dust;
	
	public static void init(){
		citronite_gem = new OverworldItem("realmsofchaos:citronite_gem", "gemCitronite");
		ash_dust = new OverworldItem("realmsofchaos:ash_dust", "dustAsh");
		
		citronite_gem.register("citronite_gem");
		ash_dust.register("ash_dust");
	}
}
