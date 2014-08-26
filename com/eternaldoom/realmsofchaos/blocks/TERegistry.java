package com.eternaldoom.realmsofchaos.blocks;

import cpw.mods.fml.common.registry.GameRegistry;

public class TERegistry {
	public static void init(){
		GameRegistry.registerTileEntity(TileEntityExtractor.class, "ROCExtractor");
		GameRegistry.registerTileEntity(TileEntityOceanChest.class, "OceanChest");
	}
}