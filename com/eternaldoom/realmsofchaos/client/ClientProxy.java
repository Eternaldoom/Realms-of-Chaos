package com.eternaldoom.realmsofchaos.client;


import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.apache.logging.log4j.LogManager;

import com.eternaldoom.realmsofchaos.asm.CoreMethods;
import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.items.ROCItems;

@SideOnly(Side.CLIENT)
public class ClientProxy {
	
	public static void init(){
		System.out.println("[Realms of Chaos] Registering Renderers");
		ROCKeyBindings.init();
		Renderers.init();
		
		for(String name : ROCItems.itemList){
		    registerItem(GameRegistry.findItem("realmsofchaos", name), "realmsofchaos:"+name);
		    LogManager.getLogger().info(name);
		}
		
		for(String name : ROCBlocks.blockList){
			Item i = GameRegistry.findItem("realmsofchaos", name);
			registerItem(i, "realmsofchaos:"+name);
        }
		
		for(String name : ROCItems.bowList){
			Item bow = GameRegistry.findItem("realmsofchaos", name);
			registerItem(bow, 1, "realmsofchaos:" + name + "pulling_0");
			registerItem(bow, 2, "realmsofchaos:" + name + "pulling_1");
			registerItem(bow, 3, "realmsofchaos:" + name + "pulling_2");
		}
				
		registerItem(ROCItems.iron_bow, 1, "realmsofchaos:iron_bow_pulling_0");
		registerItem(ROCItems.iron_bow, 2, "realmsofchaos:iron_bow_pulling_1");
		registerItem(ROCItems.iron_bow, 3, "realmsofchaos:iron_bow_pulling_2");
				
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
		
		CoreMethods.addVariantName(Item.getItemFromBlock(ROCBlocks.oceanstone_bricks), new String[]{"realmsofchaos:oceanstone_bricks", "realmsofchaos:cracked_oceanstone_bricks", "realmsofchaos:chiseled_oceanstone_bricks"});
        CoreMethods.addVariantName(Item.getItemFromBlock(ROCBlocks.frozen_stone_bricks), new String[]{"realmsofchaos:frozen_stone_bricks", "realmsofchaos:cracked_frozen_stone_bricks", "realmsofchaos:chiseled_frozen_stone_bricks"});
        
        for(String name : ROCItems.bowList){
        	CoreMethods.addVariantName(GameRegistry.findItem("realmsofchaos", name), new String[] {"realmsofchaos:" + name, "realmsofchaos:" + name + "_pulling_0", "realmsofchaos:" + name + "_pulling_1", "realmsofchaos:" + name + "_pulling_2"});
        }
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
