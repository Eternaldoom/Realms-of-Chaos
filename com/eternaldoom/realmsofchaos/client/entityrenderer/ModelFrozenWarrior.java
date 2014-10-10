package com.eternaldoom.realmsofchaos.client.entityrenderer;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelFrozenWarrior extends ModelBase
{
    ModelRenderer neck;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer head;
    ModelRenderer spike1;
    ModelRenderer spike2;
    ModelRenderer spike3;
    ModelRenderer spike4;
    ModelRenderer spike5;
    ModelRenderer spike6;
    ModelRenderer spike7;
    ModelRenderer spike8;
    ModelRenderer spike9;
    ModelRenderer spike10;
    ModelRenderer spike11;
    ModelRenderer eye1;
    ModelRenderer eye2;
  
  public ModelFrozenWarrior()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      neck = new ModelRenderer(this, 11, 0);
      neck.addBox(-1F, -5F, -1F, 2, 5, 2);
      neck.setRotationPoint(0F, 0F, 0F);
      neck.setTextureSize(64, 32);
      neck.mirror = true;
      setRotation(neck, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(64, 32);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(64, 32);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(64, 32);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(64, 32);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      head = new ModelRenderer(this, 25, 0);
      head.addBox(0F, 0F, 0F, 4, 4, 2);
      head.setRotationPoint(-2F, -9F, -1F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      spike1 = new ModelRenderer(this, 0, 0);
      spike1.addBox(0F, -6F, 0F, 1, 6, 2);
      spike1.setRotationPoint(0F, -9F, -1F);
      spike1.setTextureSize(64, 32);
      spike1.mirror = true;
      setRotation(spike1, 0F, 0F, 0.2007129F);
      spike2 = new ModelRenderer(this, 0, 0);
      spike2.addBox(-1F, -6F, 0F, 1, 6, 2);
      spike2.setRotationPoint(0F, -9F, -1F);
      spike2.setTextureSize(64, 32);
      spike2.mirror = true;
      setRotation(spike2, 0F, 0F, -0.2007129F);
      spike3 = new ModelRenderer(this, 0, 0);
      spike3.addBox(-1F, -6F, 0F, 1, 6, 2);
      spike3.setRotationPoint(-1F, -9F, -1F);
      spike3.setTextureSize(64, 32);
      spike3.mirror = true;
      setRotation(spike3, 0F, 0F, -0.5759587F);
      spike4 = new ModelRenderer(this, 0, 0);
      spike4.addBox(0F, -6F, 0F, 1, 6, 2);
      spike4.setRotationPoint(1F, -9F, -1F);
      spike4.setTextureSize(64, 32);
      spike4.mirror = true;
      setRotation(spike4, 0F, 0F, 0.5759587F);
      spike5 = new ModelRenderer(this, 0, 0);
      spike5.addBox(-1F, -6F, 0F, 1, 6, 2);
      spike5.setRotationPoint(-1F, -8F, -1F);
      spike5.setTextureSize(64, 32);
      spike5.mirror = true;
      setRotation(spike5, 0F, 0F, -0.9599311F);
      spike6 = new ModelRenderer(this, 0, 0);
      spike6.addBox(0F, -6F, 0F, 1, 6, 2);
      spike6.setRotationPoint(1F, -8F, -1F);
      spike6.setTextureSize(64, 32);
      spike6.mirror = true;
      setRotation(spike6, 0F, 0F, 0.9599311F);
      spike7 = new ModelRenderer(this, 0, 0);
      spike7.addBox(0F, -6F, 0F, 1, 6, 2);
      spike7.setRotationPoint(-0.5F, -9F, -1F);
      spike7.setTextureSize(64, 32);
      spike7.mirror = true;
      setRotation(spike7, -0.3926991F, 0F, 0F);
      spike8 = new ModelRenderer(this, 0, 0);
      spike8.addBox(-1F, -6F, 0F, 1, 6, 2);
      spike8.setRotationPoint(-0.5F, -9F, -1F);
      spike8.setTextureSize(64, 32);
      spike8.mirror = true;
      setRotation(spike8, -0.3926991F, 0F, -0.3926991F);
      spike9 = new ModelRenderer(this, 0, 0);
      spike9.addBox(0F, -6F, 0F, 1, 6, 2);
      spike9.setRotationPoint(0.5F, -9F, -1F);
      spike9.setTextureSize(64, 32);
      spike9.mirror = true;
      setRotation(spike9, -0.3926991F, 0F, 0.3926991F);
      spike10 = new ModelRenderer(this, 0, 0);
      spike10.addBox(-1F, -6F, 0F, 1, 6, 2);
      spike10.setRotationPoint(-1.5F, -9F, -1F);
      spike10.setTextureSize(64, 32);
      spike10.mirror = true;
      setRotation(spike10, -0.5846853F, 0F, -0.5759587F);
      spike11 = new ModelRenderer(this, 0, 0);
      spike11.addBox(0F, -6F, 0F, 1, 6, 2);
      spike11.setRotationPoint(1.5F, -9F, -1F);
      spike11.setTextureSize(64, 32);
      spike11.mirror = true;
      setRotation(spike11, -0.5846853F, 0F, 0.5759587F);
      eye1 = new ModelRenderer(this, 0, 40);
      eye1.addBox(0F, 0F, 0F, 2, 2, 1);
      eye1.setRotationPoint(1F, -10F, -2F);
      eye1.setTextureSize(128, 64);
      eye1.mirror = true;
      setRotation(eye1, 0F, 0F, 0F);
      eye2 = new ModelRenderer(this, 0, 40);
      eye2.addBox(0F, 0F, 0F, 2, 2, 1);
      eye2.setRotationPoint(-3F, -10F, -2F);
      eye2.setTextureSize(128, 64);
      eye2.mirror = true;
      setRotation(eye2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    GlStateManager.enableBlend();
	GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
    neck.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    head.render(f5);
    spike1.render(f5);
    spike2.render(f5);
    spike3.render(f5);
    spike4.render(f5);
    spike5.render(f5);
    spike6.render(f5);
    spike7.render(f5);
    spike8.render(f5);
    spike9.render(f5);
    spike10.render(f5);
    spike11.render(f5);
    eye1.render(f5);
    eye2.render(f5);
    GlStateManager.disableBlend();
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  @Override
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
    this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    
    this.spike1.rotateAngleX = MathHelper.sin((f2/(180f/(float)Math.PI)*2))*0.3f;
    this.spike2.rotateAngleX = MathHelper.sin((f2/(180f/(float)Math.PI)*2))*0.3f;
    this.spike3.rotateAngleX = MathHelper.sin((f2/(180f/(float)Math.PI)*2))*0.3f;
    this.spike4.rotateAngleX = MathHelper.sin((f2/(180f/(float)Math.PI)*2))*0.3f;
    this.spike5.rotateAngleX = MathHelper.sin((f2/(180f/(float)Math.PI)*2))*0.3f;
    this.spike6.rotateAngleX = MathHelper.sin((f2/(180f/(float)Math.PI)*2))*0.3f;
    this.spike7.rotateAngleX = -0.3926991F+MathHelper.sin((f2/(180f/(float)Math.PI)*2))*0.3f;
    this.spike8.rotateAngleX = -0.3926991F+MathHelper.sin((f2/(180f/(float)Math.PI)*2))*0.3f;
    this.spike9.rotateAngleX = -0.3926991F+MathHelper.sin((f2/(180f/(float)Math.PI)*2))*0.3f;
    this.spike10.rotateAngleX = -0.5846853F+MathHelper.sin((f2/(180f/(float)Math.PI)*2))*0.3f;
    this.spike11.rotateAngleX = -0.5846853F+MathHelper.sin((f2/(180f/(float)Math.PI)*2))*0.3f;
  }

  public void postRenderHiddenRightArm(float f) {
	  this.rightarm.postRender(f);
  }
  
  public void postRenderHiddenLeftArm(float f) {
	  this.leftarm.postRender(f);
  }

}
