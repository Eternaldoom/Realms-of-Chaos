package com.eternaldoom.realmsofchaos;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;

import com.eternaldoom.realmsofchaos.overworld.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.overworld.blocks.TERegistry;
import com.eternaldoom.realmsofchaos.overworld.crafting.OverworldCrafting;
import com.eternaldoom.realmsofchaos.overworld.gen.OverworldGen;
import com.eternaldoom.realmsofchaos.overworld.items.ROCOverworldItems;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = RealmsOfChaos.MODID, version = RealmsOfChaos.VERSION)
public class RealmsOfChaos {
	public static final String MODID = "realmsofchaos";
	public static final String VERSION = "Alpha 1.0 pre 1";
	
	@Instance(MODID)
	public static RealmsOfChaos instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent evt){
		System.out.println("[Realms of Chaos] Initializing mod.");
		ROCBlocks.init();
		ROCOverworldItems.init();
		TERegistry.init();
		GameRegistry.registerWorldGenerator(new OverworldGen(), 1);
		OverworldCrafting.initRecipes();
		NetworkRegistry.INSTANCE.registerGuiHandler(RealmsOfChaos.instance, new GUIHandler());
		FMLCommonHandler.instance().bus().register(new ItemReplaceEvent());
	}
	
	@EventHandler
	public void init(FMLInitializationEvent evt){
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent evt){
		
		System.out.println("[Realms of Chaos] Sucessfully enabled mod. Have fun!");
	}
}
