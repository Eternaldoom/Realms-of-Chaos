package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.eternaldoom.realmsofchaos.client.renderlayers.RenderFrozenWarriorItem;

public class RenderFrozenWarrior extends RenderLiving{
	
private static final ResourceLocation texture = new ResourceLocation("realmsofchaos:textures/entity/frozen_warrior.png");
	
	public RenderFrozenWarrior() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelFrozenWarrior(), 0.75f);
		this.addLayer(new RenderFrozenWarriorItem(this));
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
}