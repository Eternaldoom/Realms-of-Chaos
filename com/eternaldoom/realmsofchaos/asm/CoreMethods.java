package com.eternaldoom.realmsofchaos.asm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderEnd;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.WorldProviderSurface;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.blocks.TileEntityDisplayCase;
import com.eternaldoom.realmsofchaos.iceruins.gen.WorldProviderIceRuins;
import com.eternaldoom.realmsofchaos.items.ItemROCBow;
import com.google.common.collect.Lists;

public class CoreMethods {
	
	public static HashMap<Item, ArrayList<String>> variantNames = new HashMap();
	
	/**Adds a variant name for a metadata Item/ItemBlock, allowing it to load a mesh.*/
	public static void addVariantName(Item item, String... names){
		if (variantNames.containsKey(item)) variantNames.get(item).addAll(Arrays.asList(names));
		else variantNames.put(item, Lists.newArrayList(names));
	}
	
	/**Syncs the data for custom TileEntities to the client.*/
	public static void handleTileEntityPackets(TileEntity tile, S35PacketUpdateTileEntity packet){
		if(tile instanceof TileEntityDisplayCase){
			tile.readFromNBT(packet.getNbtCompound());
		}
	}
	
	/**A modified method to include the added dimensions*/
	public static WorldProvider getProviderForDimension(int dimension)
    {
        return (WorldProvider)(dimension == -1 ? new WorldProviderHell() : (dimension == 0 ? new WorldProviderSurface() : (dimension == 1 ? new WorldProviderEnd() : (dimension == 24 ? new WorldProviderIceRuins() : null))));
    }
	
	/**Inserted into RenderItem to allow for customized textures based on use time.*/
	public static ModelResourceLocation getBowTextures(EntityPlayer player, Item item, ItemStack stack, ModelResourceLocation location){
        location = new ModelResourceLocation(((ResourceLocation) Item.itemRegistry.getNameForObject(item)).toString(), "inventory");

		if (item instanceof ItemROCBow && player.getItemInUse() != null)
        {
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
		
		if(item == Item.getItemFromBlock(ROCBlocks.oceanstone_bricks)){
			if(stack.getItemDamage() == 1)location = new ModelResourceLocation("realmsofchaos:cracked_oceanstone_bricks", "inventory");
			if(stack.getItemDamage() == 2)location = new ModelResourceLocation("realmsofchaos:chiseled_oceanstone_bricks", "inventory");
		}
		
		if(item == Item.getItemFromBlock(ROCBlocks.frozen_stone_bricks)){
			if(stack.getItemDamage() == 1)location = new ModelResourceLocation("realmsofchaos:cracked_frozen_stone_bricks", "inventory");
			if(stack.getItemDamage() == 2)location = new ModelResourceLocation("realmsofchaos:chiseled_frozen_stone_bricks", "inventory");
		}
		return location;
	}
	
}