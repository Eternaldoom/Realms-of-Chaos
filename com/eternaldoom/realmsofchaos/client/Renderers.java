package com.eternaldoom.realmsofchaos.client;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.eternaldoom.realmsofchaos.overworld.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.overworld.blocks.TileEntityOceanChest;

import cpw.mods.fml.client.registry.ClientRegistry;

public class Renderers {
	
	public static void init(){
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOceanChest.class, new RenderOceanChest());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ROCBlocks.ocean_chest), new ItemRendererOceanChest());
	}
}
