package com.eternaldoom.realmsofchaos.client;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.blocks.TileEntityNetherChest;
import com.eternaldoom.realmsofchaos.blocks.TileEntityOceanChest;
import com.eternaldoom.realmsofchaos.client.blockrenderers.RenderExtractor;
import com.eternaldoom.realmsofchaos.client.blockrenderers.RenderNetherChest;
import com.eternaldoom.realmsofchaos.client.blockrenderers.RenderOceanChest;
import com.eternaldoom.realmsofchaos.client.blockrenderers.RenderSoyPlant;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderAquaticGolem;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderFish;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderROCArrow;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderScorpioid;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderScorpius;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderVoidCrawler;
import com.eternaldoom.realmsofchaos.client.itemrenderer.ItemRendererCannon;
import com.eternaldoom.realmsofchaos.client.itemrenderer.ItemRendererNetherChest;
import com.eternaldoom.realmsofchaos.client.itemrenderer.ItemRendererOceanChest;
import com.eternaldoom.realmsofchaos.entity.EntityAquaticGolem;
import com.eternaldoom.realmsofchaos.entity.EntityGiantFish;
import com.eternaldoom.realmsofchaos.entity.EntityKelpFish;
import com.eternaldoom.realmsofchaos.entity.EntityScorpioid;
import com.eternaldoom.realmsofchaos.entity.EntityScorpius;
import com.eternaldoom.realmsofchaos.entity.EntityVoidCrawler;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityAquaticArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityAquaticBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityCitroniteArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityCitroniteBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityDiamondArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityDiamondBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityFlamestoneArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityFlamestoneBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityFractoniteArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityFractoniteBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityHeliotropeArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityHeliotropeBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityIronArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityIronBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityNeptuniteArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityNeptuniteBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityOsmaraltArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityOsmaraltBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityXyliteArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityXyliteBullet;
import com.eternaldoom.realmsofchaos.items.ItemCannon;
import com.eternaldoom.realmsofchaos.items.ROCItems;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class Renderers {
	
	private static ItemCannon[] cannons = {ROCItems.iron_cannon, ROCItems.diamond_cannon, ROCItems.heliotrope_cannon, ROCItems.citronite_cannon, ROCItems.xylite_cannon, ROCItems.flamestone_cannon, ROCItems.neptunite_cannon, ROCItems.aquatic_cannon, ROCItems.osmaralt_cannon, ROCItems.fractonite_cannon};
	
	public static void init(){
		
		RenderingRegistry.registerBlockHandler(new RenderExtractor());
		RenderingRegistry.registerBlockHandler(new RenderSoyPlant());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOceanChest.class, new RenderOceanChest());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ROCBlocks.ocean_chest), new ItemRendererOceanChest());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityNetherChest.class, new RenderNetherChest());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ROCBlocks.nether_chest), new ItemRendererNetherChest());
		RenderingRegistry.registerEntityRenderingHandler(EntityAquaticGolem.class, new RenderAquaticGolem());
		RenderingRegistry.registerEntityRenderingHandler(EntityScorpioid.class, new RenderScorpioid());
		RenderingRegistry.registerEntityRenderingHandler(EntityScorpius.class, new RenderScorpius());
		RenderingRegistry.registerEntityRenderingHandler(EntityVoidCrawler.class, new RenderVoidCrawler());
		RenderingRegistry.registerEntityRenderingHandler(EntityGiantFish.class, new RenderFish("giant_fish", 3, 3, 3));
		RenderingRegistry.registerEntityRenderingHandler(EntityKelpFish.class, new RenderFish("kelp_fish", 0.5f, 0.5f, 1));

		RenderingRegistry.registerEntityRenderingHandler(EntityIronArrow.class, new RenderROCArrow("iron"));
		RenderingRegistry.registerEntityRenderingHandler(EntityDiamondArrow.class, new RenderROCArrow("diamond"));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeliotropeArrow.class, new RenderROCArrow("heliotrope"));
		RenderingRegistry.registerEntityRenderingHandler(EntityCitroniteArrow.class, new RenderROCArrow("citronite"));
		RenderingRegistry.registerEntityRenderingHandler(EntityXyliteArrow.class, new RenderROCArrow("xylite"));
		RenderingRegistry.registerEntityRenderingHandler(EntityFlamestoneArrow.class, new RenderROCArrow("flamestone"));
		RenderingRegistry.registerEntityRenderingHandler(EntityNeptuniteArrow.class, new RenderROCArrow("neptunite"));
		RenderingRegistry.registerEntityRenderingHandler(EntityAquaticArrow.class, new RenderROCArrow("aquatic"));
		RenderingRegistry.registerEntityRenderingHandler(EntityOsmaraltArrow.class, new RenderROCArrow("osmaralt"));
		RenderingRegistry.registerEntityRenderingHandler(EntityFractoniteArrow.class, new RenderROCArrow("fractonite"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityIronBullet.class, new RenderSnowball(ROCItems.iron_bullet));
		RenderingRegistry.registerEntityRenderingHandler(EntityDiamondBullet.class, new RenderSnowball(ROCItems.diamond_bullet));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeliotropeBullet.class, new RenderSnowball(ROCItems.heliotrope_bullet));
		RenderingRegistry.registerEntityRenderingHandler(EntityCitroniteBullet.class, new RenderSnowball(ROCItems.citronite_bullet));
		RenderingRegistry.registerEntityRenderingHandler(EntityXyliteBullet.class, new RenderSnowball(ROCItems.xylite_bullet));
		RenderingRegistry.registerEntityRenderingHandler(EntityFlamestoneBullet.class, new RenderSnowball(ROCItems.flamestone_bullet));
		RenderingRegistry.registerEntityRenderingHandler(EntityNeptuniteBullet.class, new RenderSnowball(ROCItems.neptunite_bullet));
		RenderingRegistry.registerEntityRenderingHandler(EntityAquaticBullet.class, new RenderSnowball(ROCItems.aquatic_bullet));
		RenderingRegistry.registerEntityRenderingHandler(EntityOsmaraltBullet.class, new RenderSnowball(ROCItems.osmaralt_bullet));
		RenderingRegistry.registerEntityRenderingHandler(EntityFractoniteBullet.class, new RenderSnowball(ROCItems.fractonite_bullet));

		for (ItemCannon cannon : cannons){
			MinecraftForgeClient.registerItemRenderer(cannon, new ItemRendererCannon());
		}
		
	}
}
