package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.ResourceLocation;

public class RenderROCArrow extends RenderArrow{
	
	private String textureName;
	
	public RenderROCArrow(String texture){
		textureName = texture;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityArrow p_110775_1_)
    {
        return new ResourceLocation("realmsofchaos:textures/entity/arrow/" + textureName + ".png");
    }
}
