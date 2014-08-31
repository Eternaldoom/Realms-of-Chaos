package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderGiantFish extends RenderLiving{

	private static final ResourceLocation texture = new ResourceLocation("realmsofchaos:textures/entity/giant_fish.png");
	
	public RenderGiantFish() {
		super(new ModelGiantFish(), 0.75f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
	
	protected void preRenderCallback(EntityLivingBase p_77041_1_, float p_77041_2_)
    {
		float scale = 3.0f;
		GL11.glTranslatef(0f, 1f, 0f);
        GL11.glScalef(scale, scale, scale);
    }
}
