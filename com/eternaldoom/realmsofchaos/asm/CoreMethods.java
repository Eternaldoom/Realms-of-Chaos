package com.eternaldoom.realmsofchaos.asm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;

import com.eternaldoom.realmsofchaos.blocks.TileEntityDisplayCase;
import com.eternaldoom.realmsofchaos.items.ItemROCBow;
import com.google.common.collect.Lists;

public class CoreMethods {
	
	public static HashMap<Item, ArrayList<String>> variantNames = new HashMap();
	
	/**Syncs the data for custom TileEntities to the client.*/
	public static void handleTileEntityPackets(TileEntity tile, S35PacketUpdateTileEntity packet){
		if(tile instanceof TileEntityDisplayCase){
			tile.readFromNBT(packet.getNbtCompound());
		}
	}
	
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
	
}