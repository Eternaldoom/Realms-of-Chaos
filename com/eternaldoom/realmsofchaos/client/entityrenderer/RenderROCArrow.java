package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.eternaldoom.realmsofchaos.entity.projectile.EntityROCArrow;

public class RenderROCArrow extends RenderArrow{
	
	private String textureName;
	
	public RenderROCArrow(String texture){
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
    {
        return new ResourceLocation("realmsofchaos:textures/entity/arrow/" + ((EntityROCArrow)entity).getTextureName() + ".png");
    }
}
