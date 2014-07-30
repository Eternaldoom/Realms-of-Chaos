package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderAquaticGolem extends RenderLiving{

	private static final ResourceLocation texture = new ResourceLocation("realmsofchaos:textures/entity/aquatic_golem.png");
	
	public RenderAquaticGolem() {
		super(new ModelAquaticGolem(), 0.75f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
	
	protected void preRenderCallback(EntityLivingBase p_77041_1_, float p_77041_2_)
    {
		float scale = 1.2f;
        GL11.glScalef(scale, scale, scale);
    }
}
