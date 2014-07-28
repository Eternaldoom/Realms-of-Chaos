package com.eternaldoom.realmsofchaos.overworld.blocks;

import cpw.mods.fml.common.registry.GameRegistry;

public class TERegistry {
	public static void init(){
		GameRegistry.registerTileEntity(TileEntityExtractor.class, "Extractor");
		GameRegistry.registerTileEntity(TileEntityOceanChest.class, "OceanChest");
	}
}