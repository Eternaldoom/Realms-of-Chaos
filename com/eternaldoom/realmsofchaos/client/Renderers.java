package com.eternaldoom.realmsofchaos.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import com.eternaldoom.realmsofchaos.blocks.TileEntityFrozenChest;
import com.eternaldoom.realmsofchaos.blocks.TileEntityNetherChest;
import com.eternaldoom.realmsofchaos.blocks.TileEntityOceanChest;
import com.eternaldoom.realmsofchaos.client.blockrenderers.RenderFrozenChest;
import com.eternaldoom.realmsofchaos.client.blockrenderers.RenderNetherChest;
import com.eternaldoom.realmsofchaos.client.blockrenderers.RenderOceanChest;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderAquaticGolem;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderBullet;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderFish;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderROCArrow;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderScorpioid;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderScorpius;
import com.eternaldoom.realmsofchaos.client.entityrenderer.RenderVoidCrawler;
import com.eternaldoom.realmsofchaos.entity.EntityAquaticGolem;
import com.eternaldoom.realmsofchaos.entity.EntityGiantFish;
import com.eternaldoom.realmsofchaos.entity.EntityKelpFish;
import com.eternaldoom.realmsofchaos.entity.EntityScorpioid;
import com.eternaldoom.realmsofchaos.entity.EntityScorpius;
import com.eternaldoom.realmsofchaos.entity.EntityVoidCrawler;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityROCArrow;
import com.eternaldoom.realmsofchaos.items.ItemCannon;
import com.eternaldoom.realmsofchaos.items.ROCItems;

public class Renderers {
		
	public static void init(){
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOceanChest.class, new RenderOceanChest());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityNetherChest.class, new RenderNetherChest());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFrozenChest.class, new RenderFrozenChest());
		
		RenderManager manager = Minecraft.getMinecraft().getRenderManager();
		
		manager.entityRenderMap.put(EntityAquaticGolem.class, new RenderAquaticGolem());
		manager.entityRenderMap.put(EntityScorpioid.class, new RenderScorpioid());
		manager.entityRenderMap.put(EntityScorpius.class, new RenderScorpius());
		manager.entityRenderMap.put(EntityVoidCrawler.class, new RenderVoidCrawler());
		manager.entityRenderMap.put(EntityGiantFish.class, new RenderFish("giant_fish", 3, 3, 3));
		manager.entityRenderMap.put(EntityKelpFish.class, new RenderFish("kelp_fish", 0.5f, 0.5f, 1));

		manager.entityRenderMap.put(EntityROCArrow.class, new RenderROCArrow());
		manager.entityRenderMap.put(EntityBullet.class, new RenderBullet());
	}
}
