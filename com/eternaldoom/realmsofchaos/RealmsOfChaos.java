package com.eternaldoom.realmsofchaos;

import com.eternaldoom.realmsofchaos.overworld.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.overworld.items.ROCOverworldItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RealmsOfChaos.MODID, version = RealmsOfChaos.VERSION)
public class RealmsOfChaos {
	public static final String MODID = "realmsofchaos";
	public static final String VERSION = "Alpha 1.0 pre 1";

	@EventHandler
	public void preInit(FMLPreInitializationEvent evt){
		System.out.println("[Realms of Chaos] Initializing mod.");
		ROCBlocks.init();
		ROCOverworldItems.init();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent evt){
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent evt){
		
		System.out.println("[Realms of Chaos] Sucessfully enabled mod. Have fun!");
	}
}
