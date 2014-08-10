package com.eternaldoom.realmsofchaos;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import net.minecraft.util.DamageSource;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

import com.eternaldoom.realmsofchaos.client.ClientProxy;
import com.eternaldoom.realmsofchaos.entity.Entities;
import com.eternaldoom.realmsofchaos.entity.EntityIronArrow;
import com.eternaldoom.realmsofchaos.iceruins.gen.BiomeGenIceRuins;
import com.eternaldoom.realmsofchaos.iceruins.gen.WorldProviderIceRuins;
import com.eternaldoom.realmsofchaos.overworld.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.overworld.blocks.TERegistry;
import com.eternaldoom.realmsofchaos.overworld.crafting.OverworldCrafting;
import com.eternaldoom.realmsofchaos.overworld.gen.OverworldGen;
import com.eternaldoom.realmsofchaos.overworld.items.ROCItems;
import com.eternaldoom.realmsofchaos.water.gen.BiomeGenWater;
import com.eternaldoom.realmsofchaos.water.gen.WorldProviderWater;
import com.jadarstudios.developercapes.DevCapes;
import com.jadarstudios.developercapes.cape.CapeConfig;
import com.jadarstudios.developercapes.cape.CapeConfigManager;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = RealmsOfChaos.MODID, version = RealmsOfChaos.VERSION)
public class RealmsOfChaos {
	public static final String MODID = "realmsofchaos";
	public static final String VERSION = "Alpha 1.0 pre 1";
	
	@Instance(MODID)
	public static RealmsOfChaos instance;
	
	public static int waterDimID = 23;
	public static int iceDimID = 24;

	public static BiomeGenBase waterBiome;
	public static BiomeGenBase iceBiome;
	
	public static DamageSource molten = (new DamageSource("molten")).setFireDamage();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent evt){
		System.out.println("[Realms of Chaos] Initializing mod.");
		DimensionManager.registerProviderType(waterDimID, WorldProviderWater.class, true);
    	DimensionManager.registerDimension(waterDimID, waterDimID);
    	DimensionManager.registerProviderType(iceDimID, WorldProviderIceRuins.class, true);
    	DimensionManager.registerDimension(iceDimID, iceDimID);
    	
    	waterBiome = new BiomeGenWater(55).setColor(48).setBiomeName("Water Biome").setHeight(new BiomeGenBase.Height(-1.8f, 1.0f));  
    	iceBiome = new BiomeGenIceRuins(56).setColor(48).setBiomeName("Ice Ruins").setHeight(new BiomeGenBase.Height(0.2f, 0.2f)).setEnableSnow().setTemperatureRainfall(0.0f, 0.5f);  

		ROCBlocks.init();
		ROCItems.init();
		TERegistry.init();
		GameRegistry.registerWorldGenerator(new OverworldGen(), 1);
		OverworldCrafting.initRecipes();
		Entities.preinit();
		if(FMLCommonHandler.instance().getSide().isClient()) ClientProxy.init();
		NetworkRegistry.INSTANCE.registerGuiHandler(RealmsOfChaos.instance, new GUIHandler());
		FMLCommonHandler.instance().bus().register(new ItemReplaceEvent());
		FMLCommonHandler.instance().bus().register(new ArmorBonusEvent());
		MinecraftForge.EVENT_BUS.register(new TooltipHideEvent());
		
		if(FMLCommonHandler.instance().getSide().isClient()) MinecraftForge.EVENT_BUS.register(new OverlayEvent());
		EntityRegistry.registerGlobalEntityID(EntityIronArrow.class, "IronArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityIronArrow.class, "IronArrow", EntityRegistry.findGlobalUniqueEntityId(), this, 64, 1, true);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent evt){
		Entities.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent evt){
		
		System.out.println("[Realms of Chaos] Sucessfully enabled mod. Have fun!");
	}
}
