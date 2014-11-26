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
	
	/**Inserted into RenderItem to allow for customized textures based on use time.*/
	public static ModelResourceLocation getBowTextures(EntityPlayer player, Item item, ItemStack stack, ModelResourceLocation location){
		if (item instanceof ItemROCBow && player.getItemInUse() != null)
        {
	        location = new ModelResourceLocation(((ResourceLocation) Item.itemRegistry.getNameForObject(item)).toString(), "inventory");

            int i = stack.getMaxItemUseDuration() - player.getItemInUseCount();
            if (i >= 18)
            {
                location = new ModelResourceLocation(Item.itemRegistry.getNameForObject(item) + "_pulling_2", "inventory");
            }
            else if (i > 13)
            {
                location = new ModelResourceLocation(Item.itemRegistry.getNameForObject(item) + "_pulling_1", "inventory");
            }
            else if (i > 0)
            {
                location = new ModelResourceLocation(Item.itemRegistry.getNameForObject(item) + "_pulling_0", "inventory");
            }
        }
		return location;
	}
	
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
		
		return model.getTexture();
		
	}
	
}