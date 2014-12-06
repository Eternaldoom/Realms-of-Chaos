package com.eternaldoom.realmsofchaos.asm;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.blocks.TileEntityDisplayCase;
import com.eternaldoom.realmsofchaos.items.ItemROCBow;

public class CoreMethods {
	
	/**Inserted into BlockModelShapes to allow for textured particles for blocks that don't need models.*/
	public static TextureAtlasSprite getTexture(IBlockState state){
		IBakedModel model = Minecraft.getMinecraft().getBlockRendererDispatcher().func_175023_a().func_178125_b(state);
		
		if(state.getBlock() == ROCBlocks.frozen_chest){
			return Minecraft.getMinecraft().getBlockRendererDispatcher().func_175023_a().func_178126_b().func_174952_b().getAtlasSprite("minecraft:blocks/ice");
		}
		
		if(state.getBlock() == ROCBlocks.ocean_chest){
			return Minecraft.getMinecraft().getBlockRendererDispatcher().func_175023_a().func_178126_b().func_174952_b().getAtlasSprite("realmsofchaos:blocks/ocean_chest_top");
		}
		
		if(state.getBlock() == ROCBlocks.nether_chest){
			return Minecraft.getMinecraft().getBlockRendererDispatcher().func_175023_a().func_178126_b().func_174952_b().getAtlasSprite("realmsofchaos:blocks/nether_chest_top");
		}
		
		if(state.getBlock() == ROCBlocks.soy_plant){
			return Minecraft.getMinecraft().getBlockRendererDispatcher().func_175023_a().func_178126_b().func_174952_b().getAtlasSprite("realmsofchaos:blocks/soy_plant_2");
		}
		
		return model.getTexture();
		
	}
	
}