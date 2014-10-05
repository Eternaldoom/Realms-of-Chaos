package com.eternaldoom.realmsofchaos.client;


import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.eternaldoom.realmsofchaos.blocks.BlockFrozenStoneBrick;
import com.eternaldoom.realmsofchaos.blocks.BlockOceanStoneBrick;
import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.itemblock.ItemBlockModStoneBrick;
import com.eternaldoom.realmsofchaos.items.ROCItems;

@SideOnly(Side.CLIENT)
public class ClientProxy {
	
	public static void init(){
		System.out.println("[Realms of Chaos] Registering Renderers");
		ROCKeyBindings.init();
		Renderers.init();
		
		for(String name : ROCItems.itemList){
		    registerItem(GameRegistry.findItem("realmsofchaos", name), "realmsofchaos:"+name);
		}
		
		for(String name : ROCBlocks.blockNames){
			Item i = GameRegistry.findItem("realmsofchaos", name);
			registerItem(i, "realmsofchaos:"+name);
        }
		
		Item oceanstone_bricks = GameRegistry.findItem("realmsofchaos", "oceanstone_bricks");
		Item frozen_stone_bricks = GameRegistry.findItem("realmsofchaos", "frozen_stone_bricks");
				
		registerItem(oceanstone_bricks, 0, "realmsofchaos:oceanstone_bricks");
		registerItem(oceanstone_bricks, 1, "realmsofchaos:cracked_oceanstone_bricks");
		registerItem(oceanstone_bricks, 2, "realmsofchaos:chiseled_oceanstone_bricks");
		registerItem(frozen_stone_bricks, 0, "realmsofchaos:frozen_stone_bricks");
		registerItem(frozen_stone_bricks, 1, "realmsofchaos:cracked_frozen_stone_bricks");
		registerItem(frozen_stone_bricks, 2, "realmsofchaos:chiseled_frozen_stone_bricks");

	}
	
	public static void preInit(){
		/*try{
			InputStream is = DevCapes.getInstance().getStreamForURL(new URL("https://dl.dropboxusercontent.com/s/b1dc1vykv0hfseg/capes.json"));
			CapeConfig config = CapeConfigManager.INSTANCE.parseFromStream(is);
			CapeConfigManager.INSTANCE.addConfig(CapeConfigManager.getUniqueId(), config);
		}catch (MalformedURLException e){
			e.printStackTrace();
		}*/
	}
	
	public static void registerItem(Item item, int metadata, String itemName)
    {
        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
        mesher.register(item, metadata, new ModelResourceLocation(itemName, "inventory"));
    }

    public static void registerBlock(Block block, int metadata, String blockName)
    {
        registerItem(Item.getItemFromBlock(block), metadata, blockName);
    }

    public static void registerBlock(Block block, String blockName)
    {
        registerBlock(block, 0, blockName);
    }

    public static void registerItem(Item item, String itemName)
    {
        registerItem(item, 0, itemName);
    }
}
