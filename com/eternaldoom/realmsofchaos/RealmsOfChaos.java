package com.eternaldoom.realmsofchaos;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

import com.eternaldoom.realmsofchaos.overworld.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.overworld.blocks.TERegistry;
import com.eternaldoom.realmsofchaos.overworld.crafting.OverworldCrafting;
import com.eternaldoom.realmsofchaos.overworld.gen.OverworldGen;
import com.eternaldoom.realmsofchaos.overworld.items.ROCOverworldItems;
import com.eternaldoom.realmsofchaos.water.gen.BiomeGenWater;
import com.eternaldoom.realmsofchaos.water.gen.WorldProviderWater;

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
	
	public static int waterDimID = 23;

	public static BiomeGenBase waterBiome;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent evt){
		System.out.println("[Realms of Chaos] Initializing mod.");
		DimensionManager.registerProviderType(waterDimID, WorldProviderWater.class, true);
    	DimensionManager.registerDimension(waterDimID, waterDimID);
    	
    	waterBiome = new BiomeGenWater(55).setColor(48).setBiomeName("Water Biome").setHeight(new BiomeGenBase.Height(-1.8f, 1.0f));  
    	
		ROCBlocks.init();
		ROCOverworldItems.init();
		TERegistry.init();
		GameRegistry.registerWorldGenerator(new OverworldGen(), 1);
		OverworldCrafting.initRecipes();
		NetworkRegistry.INSTANCE.registerGuiHandler(RealmsOfChaos.instance, new GUIHandler());
		FMLCommonHandler.instance().bus().register(new ItemReplaceEvent());
		FMLCommonHandler.instance().bus().register(new ArmorBonusEvent());
		MinecraftForge.EVENT_BUS.register(new TooltipHideEvent());
	}
	
	@EventHandler
	public void init(FMLInitializationEvent evt){
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent evt){
		
		System.out.println("[Realms of Chaos] Sucessfully enabled mod. Have fun!");
	}
}
