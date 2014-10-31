package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.eternaldoom.realmsofchaos.entity.EntityStag;

public class RenderStag extends RenderLiving{
	
	public RenderStag() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelStag(), 0.5f);
	}

	private static ResourceLocation whiteTexture = new ResourceLocation("realmsofchaos:textures/entity/stag/white.png");
	private static ResourceLocation brownTexture = new ResourceLocation("realmsofchaos:textures/entity/stag/brown.png");
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
    {
        return ((EntityStag)entity).getStagType() == 0 ? whiteTexture : brownTexture;
    }

}
