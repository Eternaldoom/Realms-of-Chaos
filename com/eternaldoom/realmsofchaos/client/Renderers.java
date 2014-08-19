package com.eternaldoom.realmsofchaos.client;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.blocks.TileEntityOceanChest;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderAquaticGolem;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderROCArrow;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderScorpioid;
import com.eternaldoom.realmsofchaos.entity.EntityAquaticGolem;
import com.eternaldoom.realmsofchaos.entity.EntityScorpioid;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityAquaticArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityCitroniteArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityDiamondArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityDiamondBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityFlamestoneArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityFractoniteArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityHeliotropeArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityIronArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityIronBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityNeptuniteArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityOsmaraltArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityXyliteArrow;
import com.eternaldoom.realmsofchaos.items.ROCItems;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class Renderers {
	
	public static void init(){
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOceanChest.class, new RenderOceanChest());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ROCBlocks.ocean_chest), new ItemRendererOceanChest());
		RenderingRegistry.registerEntityRenderingHandler(EntityAquaticGolem.class, new RenderAquaticGolem());
		RenderingRegistry.registerEntityRenderingHandler(EntityScorpioid.class, new RenderScorpioid());
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

	}
}
