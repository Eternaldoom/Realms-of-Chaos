package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.eternaldoom.realmsofchaos.entity.EntityGiantFish;
import com.eternaldoom.realmsofchaos.entity.EntityKelpFish;

public class RenderFish extends RenderLiving {

	private ResourceLocation texture;
	private float scaleX;
	private float scaleY;
	private float scaleZ;

	public RenderFish(String texturename, float scaleX, float scaleY, float scaleZ) {
		super(new ModelGiantFish(), 3f);
		texture = new ResourceLocation("realmsofchaos:textures/entity/" + texturename + ".png");
		this.scaleX = scaleX;
		this.scaleY = scaleY;
		this.scaleZ = scaleZ;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}

	protected void preRenderCallback(EntityLivingBase entity, float p_77041_2_) {
		GL11.glTranslatef(0f, 1f, 0f);
		if (entity.worldObj.getBlock((int) Math.round(entity.posX),
				(int) Math.floor(entity.posY), (int) Math.round(entity.posZ)) == Blocks.air
				|| entity.worldObj.getBlock((int) Math.round(entity.posX),
						(int) Math.floor(entity.posY),
						(int) Math.round(entity.posZ)).getMaterial() == Material.plants){
			GL11.glRotatef(90, 0, 0, 1f);
			if(entity instanceof EntityGiantFish)GL11.glTranslatef(0f, 3.5f, 0f);
			if(entity instanceof EntityKelpFish)GL11.glTranslatef(-1f, 1f, 0f);
		}
		if(entity instanceof EntityKelpFish) GL11.glTranslatef(0f, -1f, 0f);
		GL11.glScalef(scaleX, scaleY, scaleZ);
	}
}
