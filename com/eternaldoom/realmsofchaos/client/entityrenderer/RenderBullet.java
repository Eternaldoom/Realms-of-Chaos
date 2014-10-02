package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.eternaldoom.realmsofchaos.entity.projectile.EntityBullet;

public class RenderBullet extends RenderSnowball{

	private Item theItem;
	private RenderItem itemRenderer;
	
	public RenderBullet() {
		super(Minecraft.getMinecraft().getRenderManager(), Items.snowball, Minecraft.getMinecraft().getRenderItem());
		this.itemRenderer = Minecraft.getMinecraft().getRenderItem();
	}
	
	public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
    {
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)p_76986_2_, (float)p_76986_4_, (float)p_76986_6_);
        GlStateManager.enableRescaleNormal();
        GlStateManager.scale(0.5F, 0.5F, 0.5F);
        GlStateManager.rotate(-this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
        this.bindTexture(TextureMap.locationBlocksTexture);
        this.itemRenderer.func_175043_b(this.getBulletStack((EntityBullet) p_76986_1_));
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        super.doRender(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
    }
	
	public ItemStack getBulletStack(EntityBullet entity)
    {
        return new ItemStack(Item.getItemById(entity.getAmmoId()), 1, 0);
    }

}
