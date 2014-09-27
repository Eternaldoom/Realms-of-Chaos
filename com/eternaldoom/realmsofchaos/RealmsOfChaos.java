package com.eternaldoom.realmsofchaos;

import net.minecraft.command.CommandHandler;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.blocks.TERegistry;
import com.eternaldoom.realmsofchaos.client.ClientProxy;
import com.eternaldoom.realmsofchaos.crafting.OverworldCrafting;
import com.eternaldoom.realmsofchaos.entity.Entities;
import com.eternaldoom.realmsofchaos.event.ArmorBonusEvent;
import com.eternaldoom.realmsofchaos.event.ItemReplaceEvent;
import com.eternaldoom.realmsofchaos.event.KeyPress;
import com.eternaldoom.realmsofchaos.event.OreDropEvent;
import com.eternaldoom.realmsofchaos.event.OverlayEvent;
import com.eternaldoom.realmsofchaos.event.PortalFixEvent;
import com.eternaldoom.realmsofchaos.event.TooltipEvent;
import com.eternaldoom.realmsofchaos.gen.OverworldGen;
import com.eternaldoom.realmsofchaos.iceruins.gen.BiomeGenIceRuins;
import com.eternaldoom.realmsofchaos.iceruins.gen.WorldProviderIceRuins;
import com.eternaldoom.realmsofchaos.items.ROCItems;
import com.eternaldoom.realmsofchaos.network.PacketArmorFreeze;
import com.eternaldoom.realmsofchaos.water.gen.BiomeGenWater;
import com.eternaldoom.realmsofchaos.water.gen.WorldProviderWater;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = RealmsOfChaos.MODID, version = RealmsOfChaos.VERSION)
public class RealmsOfChaos {
	public static final String MODID = "realmsofchaos";
	public static final String VERSION = "Alpha 1.0 pre 1";
	
	@Instance(MODID)
	public static RealmsOfChaos instance;
	
	public static SimpleNetworkWrapper network;
	
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

    	network = NetworkRegistry.INSTANCE.newSimpleChannel("ROCPackets");
    	network.registerMessage(PacketArmorFreeze.Handler.class, PacketArmorFreeze.class, 0, Side.SERVER);
    	
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
		MinecraftForge.EVENT_BUS.register(new TooltipEvent());
		MinecraftForge.EVENT_BUS.register(new PortalFixEvent());
		MinecraftForge.EVENT_BUS.register(new OreDropEvent());
		
		if(FMLCommonHandler.instance().getSide().isClient()){
			MinecraftForge.EVENT_BUS.register(new OverlayEvent());
			FMLCommonHandler.instance().bus().register(new KeyPress());
		}
	}
	
	@EventHandler
	public void init(FMLInitializationEvent evt){
		
		Entities.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent evt){
		
		System.out.println("[Realms of Chaos] Sucessfully enabled mod. Have fun!");
	}
	
	@EventHandler
    public void serverStarting(FMLServerStartingEvent event){
		if (MinecraftServer.getServer().getCommandManager() instanceof ServerCommandManager) {
			((CommandHandler) MinecraftServer.getServer().getCommandManager()).registerCommand(new CommandFloor());
		}
	}
}
