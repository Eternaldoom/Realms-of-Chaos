package com.eternaldoom.realmsofchaos.overworld.items;

import net.minecraft.item.Item;

public class ROCOverworldItems {

	public static OverworldItem citronite_gem;
	
	public static void init(){
		citronite_gem = new OverworldItem("realmsofchaos:citronite_gem", "gemCitronite");
		citronite_gem.register("citronite_gem");
	}
}
