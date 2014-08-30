package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGiantFish extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer topfin;
    ModelRenderer body3;
    ModelRenderer backfin;
    ModelRenderer rightfin;
    ModelRenderer leftfin;
  
  public ModelGiantFish()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 16);
      head.addBox(0F, 0F, 0F, 5, 8, 3);
      head.setRotationPoint(-4.5F, 5F, -14F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body1 = new ModelRenderer(this, 0, 27);
      body1.addBox(0F, 0F, 0F, 6, 13, 8);
      body1.setRotationPoint(-5F, 2.5F, -11F);
      body1.setTextureSize(128, 64);
      body1.mirror = true;
      setRotation(body1, 0F, 0F, 0F);
      body2 = new ModelRenderer(this, 28, 0);
      body2.addBox(0F, 0F, 0F, 7, 16, 16);
      body2.setRotationPoint(-5.5F, 1F, -3F);
      body2.setTextureSize(128, 64);
      body2.mirror = true;
      setRotation(body2, 0F, 0F, 0F);
      topfin = new ModelRenderer(this, 0, 0);
      topfin.addBox(0F, -8F, 0F, 0, 8, 8);
      topfin.setRotationPoint(-2F, 1F, 1F);
      topfin.setTextureSize(128, 64);
      topfin.mirror = true;
      setRotation(topfin, 0F, 0F, 0F);
      body3 = new ModelRenderer(this, 0, 27);
      body3.addBox(0F, 0F, 0F, 6, 13, 8);
      body3.setRotationPoint(-5F, 2.5F, 13F);
      body3.setTextureSize(128, 64);
      body3.mirror = true;
      setRotation(body3, 0F, 0F, 0F);
      backfin = new ModelRenderer(this, 74, 0);
      backfin.addBox(0F, 0F, 0F, 0, 8, 8);
      backfin.setRotationPoint(-2F, 5F, 21F);
      backfin.setTextureSize(128, 64);
      backfin.mirror = true;
      setRotation(backfin, 0F, 0F, 0F);
      rightfin = new ModelRenderer(this, 90, 0);
      rightfin.addBox(0F, 0F, 0F, 0, 12, 8);
      rightfin.setRotationPoint(-5F, 12F, 0F);
      rightfin.setTextureSize(128, 64);
      rightfin.mirror = true;
      setRotation(rightfin, 0F, 0F, 0.3839724F);
      leftfin = new ModelRenderer(this, 90, 0);
      leftfin.addBox(0F, 0F, 0F, 0, 12, 8);
      leftfin.setRotationPoint(1F, 12F, 0F);
      leftfin.setTextureSize(128, 64);
      leftfin.mirror = true;
      setRotation(leftfin, 0F, 0F, -0.3839724F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body1.render(f5);
    body2.render(f5);
    topfin.render(f5);
    body3.render(f5);
    backfin.render(f5);
    rightfin.render(f5);
    leftfin.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}