package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.eternaldoom.realmsofchaos.entity.EntityScorpius;

public class RenderScorpius extends RenderLiving{

	private static final ResourceLocation texture = new ResourceLocation("realmsofchaos:textures/entity/scorpius.png");
	
	public RenderScorpius() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelScorpius(), 1f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
	
	@Override
	protected void preRenderCallback(EntityLivingBase p_77041_1_, float p_77041_2_)
    {
		float scale = 1.0f;
        GL11.glScalef(scale, scale, scale);
    }
	
	public void doRender(EntityLiving entity, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
    {
		super.doRender(entity, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
		BossStatus.setBossStatus((EntityScorpius)entity, true);
    }
}
