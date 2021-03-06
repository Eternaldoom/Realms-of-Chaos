package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelVoidCrawler extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer leg5;
    ModelRenderer leg6;
    ModelRenderer leg7;
    ModelRenderer leg8;
    ModelRenderer leg9;
    ModelRenderer leg10;
    ModelRenderer leg11;
    ModelRenderer leg12;
    ModelRenderer legframe1;
    ModelRenderer legframe2;
    ModelRenderer legbase2;
    ModelRenderer legbase2top;
    ModelRenderer legbase1;
    ModelRenderer legbase3;
    ModelRenderer legbase3top;
    ModelRenderer legbase4;
    ModelRenderer legbase4top;
    ModelRenderer legbase5;
    ModelRenderer legbase5top;
    ModelRenderer legbase6;
    ModelRenderer legbase6top;
    ModelRenderer legbase1top;
  
  public ModelVoidCrawler()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-1F, 0F, -4F, 2, 2, 4);
      head.setRotationPoint(0F, 20F, -7F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 12, 0);
      body.addBox(0F, 0F, 0F, 4, 4, 15);
      body.setRotationPoint(-2F, 19F, -7F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 6);
      leg1.addBox(0F, 0F, 0F, 2, 1, 1);
      leg1.setRotationPoint(2F, 20F, -5F);
      leg1.setTextureSize(128, 64);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 6);
      leg2.addBox(0F, 0F, 0F, 2, 1, 1);
      leg2.setRotationPoint(2F, 20F, -3F);
      leg2.setTextureSize(128, 64);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 6);
      leg3.addBox(0F, 0F, 0F, 2, 1, 1);
      leg3.setRotationPoint(2F, 20F, -1F);
      leg3.setTextureSize(128, 64);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 6);
      leg4.addBox(0F, 0F, 0F, 2, 1, 1);
      leg4.setRotationPoint(2F, 20F, 1F);
      leg4.setTextureSize(128, 64);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      leg5 = new ModelRenderer(this, 0, 6);
      leg5.addBox(0F, 0F, 0F, 2, 1, 1);
      leg5.setRotationPoint(2F, 20F, 3F);
      leg5.setTextureSize(128, 64);
      leg5.mirror = true;
      setRotation(leg5, 0F, 0F, 0F);
      leg6 = new ModelRenderer(this, 0, 6);
      leg6.addBox(0F, 0F, 0F, 2, 1, 1);
      leg6.setRotationPoint(2F, 20F, 5F);
      leg6.setTextureSize(128, 64);
      leg6.mirror = true;
      setRotation(leg6, 0F, 0F, 0F);
      leg7 = new ModelRenderer(this, 0, 6);
      leg7.addBox(-2F, 0F, 0F, 2, 1, 1);
      leg7.setRotationPoint(-2F, 20F, 5F);
      leg7.setTextureSize(128, 64);
      leg7.mirror = true;
      setRotation(leg7, 0F, 0F, 0F);
      leg8 = new ModelRenderer(this, 0, 6);
      leg8.addBox(-2F, 0F, 0F, 2, 1, 1);
      leg8.setRotationPoint(-2F, 20F, 3F);
      leg8.setTextureSize(128, 64);
      leg8.mirror = true;
      setRotation(leg8, 0F, 0F, 0F);
      leg9 = new ModelRenderer(this, 0, 6);
      leg9.addBox(-2F, 0F, 0F, 2, 1, 1);
      leg9.setRotationPoint(-2F, 20F, 1F);
      leg9.setTextureSize(128, 64);
      leg9.mirror = true;
      setRotation(leg9, 0F, 0F, 0F);
      leg10 = new ModelRenderer(this, 0, 6);
      leg10.addBox(-2F, 0F, 0F, 2, 1, 1);
      leg10.setRotationPoint(-2F, 20F, -1F);
      leg10.setTextureSize(128, 64);
      leg10.mirror = true;
      setRotation(leg10, 0F, 0F, 0F);
      leg11 = new ModelRenderer(this, 0, 6);
      leg11.addBox(-2F, 0F, 0F, 2, 1, 1);
      leg11.setRotationPoint(-2F, 20F, -3F);
      leg11.setTextureSize(128, 64);
      leg11.mirror = true;
      setRotation(leg11, 0F, 0F, 0F);
      leg12 = new ModelRenderer(this, 0, 6);
      leg12.addBox(-2F, 0F, 0F, 2, 1, 1);
      leg12.setRotationPoint(-2F, 20F, -5F);
      leg12.setTextureSize(128, 64);
      leg12.mirror = true;
      setRotation(leg12, 0F, 0F, 0F);
      legframe1 = new ModelRenderer(this, 50, 0);
      legframe1.addBox(0F, 0F, 0F, 1, 1, 11);
      legframe1.setRotationPoint(4F, 20F, -5F);
      legframe1.setTextureSize(128, 64);
      legframe1.mirror = true;
      setRotation(legframe1, 0F, 0F, 0F);
      legframe2 = new ModelRenderer(this, 50, 0);
      legframe2.addBox(0F, 0F, 0F, 1, 1, 11);
      legframe2.setRotationPoint(-5F, 20F, -5F);
      legframe2.setTextureSize(128, 64);
      legframe2.mirror = true;
      setRotation(legframe2, 0F, 0F, 0F);
      legbase2 = new ModelRenderer(this, 0, 8);
      legbase2.addBox(0F, 0F, 0F, 1, 3, 1);
      legbase2.setRotationPoint(4.25F, 21F, 0F);
      legbase2.setTextureSize(128, 64);
      legbase2.mirror = true;
      setRotation(legbase2, 0F, 0F, 0.7853982F);
      legbase2top = new ModelRenderer(this, 0, 12);
      legbase2top.addBox(0F, 0F, 0F, 1, 1, 1);
      legbase2top.setRotationPoint(4F, 21F, 0F);
      legbase2top.setTextureSize(128, 64);
      legbase2top.mirror = true;
      setRotation(legbase2top, 0F, 0F, 0F);
      legbase1 = new ModelRenderer(this, 0, 8);
      legbase1.addBox(0F, 0F, 0F, 1, 3, 1);
      legbase1.setRotationPoint(4.3F, 21F, -5F);
      legbase1.setTextureSize(128, 64);
      legbase1.mirror = true;
      setRotation(legbase1, 0F, 0F, 0.7853982F);
      legbase3 = new ModelRenderer(this, 0, 8);
      legbase3.addBox(0F, 0F, 0F, 1, 3, 1);
      legbase3.setRotationPoint(4.3F, 21F, 5F);
      legbase3.setTextureSize(128, 64);
      legbase3.mirror = true;
      setRotation(legbase3, 0F, 0F, 0.7853982F);
      legbase3top = new ModelRenderer(this, 0, 12);
      legbase3top.addBox(0F, 0F, 0F, 1, 1, 1);
      legbase3top.setRotationPoint(4F, 21F, 5F);
      legbase3top.setTextureSize(128, 64);
      legbase3top.mirror = true;
      setRotation(legbase3top, 0F, 0F, 0F);
      legbase4 = new ModelRenderer(this, 0, 8);
      legbase4.addBox(-1F, 0F, 0F, 1, 3, 1);
      legbase4.setRotationPoint(-4.3F, 21F, -5F);
      legbase4.setTextureSize(128, 64);
      legbase4.mirror = true;
      setRotation(legbase4, 0F, 0F, -0.7853982F);
      legbase4top = new ModelRenderer(this, 0, 12);
      legbase4top.addBox(0F, 0F, 0F, 1, 1, 1);
      legbase4top.setRotationPoint(-5F, 21F, -5F);
      legbase4top.setTextureSize(128, 64);
      legbase4top.mirror = true;
      setRotation(legbase4top, 0F, 0F, 0F);
      legbase5 = new ModelRenderer(this, 0, 8);
      legbase5.addBox(-1F, 0F, 0F, 1, 3, 1);
      legbase5.setRotationPoint(-4.3F, 21F, 0F);
      legbase5.setTextureSize(128, 64);
      legbase5.mirror = true;
      setRotation(legbase5, 0F, 0F, -0.7853982F);
      legbase5top = new ModelRenderer(this, 0, 12);
      legbase5top.addBox(0F, 0F, 0F, 1, 1, 1);
      legbase5top.setRotationPoint(-5F, 21F, 0F);
      legbase5top.setTextureSize(128, 64);
      legbase5top.mirror = true;
      setRotation(legbase5top, 0F, 0F, 0F);
      legbase6 = new ModelRenderer(this, 0, 8);
      legbase6.addBox(-1F, 0F, 0F, 1, 3, 1);
      legbase6.setRotationPoint(-4.3F, 21F, 5F);
      legbase6.setTextureSize(128, 64);
      legbase6.mirror = true;
      setRotation(legbase6, 0F, 0F, -0.7853982F);
      legbase6top = new ModelRenderer(this, 0, 12);
      legbase6top.addBox(0F, 0F, 0F, 1, 1, 1);
      legbase6top.setRotationPoint(-5F, 21F, 5F);
      legbase6top.setTextureSize(128, 64);
      legbase6top.mirror = true;
      setRotation(legbase6top, 0F, 0F, 0F);
      legbase1top = new ModelRenderer(this, 0, 12);
      legbase1top.addBox(0F, 0F, 0F, 1, 1, 1);
      legbase1top.setRotationPoint(4F, 21F, -5F);
      legbase1top.setTextureSize(128, 64);
      legbase1top.mirror = true;
      setRotation(legbase1top, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    leg5.render(f5);
    leg6.render(f5);
    leg7.render(f5);
    leg8.render(f5);
    leg9.render(f5);
    leg10.render(f5);
    leg11.render(f5);
    leg12.render(f5);
    legframe1.render(f5);
    legframe2.render(f5);
    legbase2.render(f5);
    legbase2top.render(f5);
    legbase1.render(f5);
    legbase3.render(f5);
    legbase3top.render(f5);
    legbase4.render(f5);
    legbase4top.render(f5);
    legbase5.render(f5);
    legbase5top.render(f5);
    legbase6.render(f5);
    legbase6top.render(f5);
    legbase1top.render(f5);
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
    
    legbase1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    legbase2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    legbase3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    legbase4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    legbase5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    legbase6.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    head.rotateAngleY = MathHelper.sin((f2/(180f/(float)Math.PI)*2))*0.3f;
  }

}
