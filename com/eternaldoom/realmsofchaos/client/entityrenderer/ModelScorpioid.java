package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelScorpioid extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer collartop;
    ModelRenderer collarbottom;
    ModelRenderer collarleft;
    ModelRenderer collarright;
    ModelRenderer back;
    ModelRenderer leftspine1b;
    ModelRenderer leftspine2b;
    ModelRenderer leftspine3b;
    ModelRenderer eyes;
    ModelRenderer leftspine1a;
    ModelRenderer leftspine2a;
    ModelRenderer leftspine3a;
    ModelRenderer rightspine1a;
    ModelRenderer rightspine2a;
    ModelRenderer rightspine3a;
    ModelRenderer rightspine1b;
    ModelRenderer rightspine2b;
    ModelRenderer rightspine3b;
    ModelRenderer tail;
  
  public ModelScorpioid()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 16);
      head.addBox(0F, 0F, -2.5F, 3, 3, 4);
      head.setRotationPoint(-2.5F, 16.5F, -9F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 14, 0);
      body.addBox(-5F, -10F, -7F, 6, 17, 6);
      body.setRotationPoint(1F, 14F, 3F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 1.570796F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 23);
      leg1.addBox(0F, 0F, 0F, 1, 3, 1);
      leg1.setRotationPoint(-3F, 21F, 5F);
      leg1.setTextureSize(128, 64);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 23);
      leg2.addBox(0F, 0F, 0F, 1, 3, 1);
      leg2.setRotationPoint(0F, 21F, 5F);
      leg2.setTextureSize(128, 64);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 23);
      leg3.addBox(0F, 0F, 0F, 1, 3, 1);
      leg3.setRotationPoint(-3F, 21F, -4F);
      leg3.setTextureSize(128, 64);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 23);
      leg4.addBox(0F, 0F, 0F, 1, 3, 1);
      leg4.setRotationPoint(0F, 21F, -4F);
      leg4.setTextureSize(128, 64);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      collartop = new ModelRenderer(this, 0, 6);
      collartop.addBox(0F, 0F, 0F, 4, 1, 2);
      collartop.setRotationPoint(-3F, 16F, -9F);
      collartop.setTextureSize(128, 64);
      collartop.mirror = true;
      setRotation(collartop, 0F, 0F, 0F);
      collarbottom = new ModelRenderer(this, 0, 6);
      collarbottom.addBox(0F, 0F, 0F, 4, 1, 2);
      collarbottom.setRotationPoint(-3F, 19F, -9F);
      collarbottom.setTextureSize(128, 64);
      collarbottom.mirror = true;
      setRotation(collarbottom, 0F, 0F, 0F);
      collarleft = new ModelRenderer(this, 0, 9);
      collarleft.addBox(0F, 0F, 0F, 1, 3, 2);
      collarleft.setRotationPoint(0F, 16.5F, -9F);
      collarleft.setTextureSize(128, 64);
      collarleft.mirror = true;
      setRotation(collarleft, 0F, 0F, 0F);
      collarright = new ModelRenderer(this, 0, 9);
      collarright.addBox(0F, 0F, 0F, 1, 3, 2);
      collarright.setRotationPoint(-3F, 16.5F, -9F);
      collarright.setTextureSize(128, 64);
      collarright.mirror = true;
      setRotation(collarright, 0F, 0F, 0F);
      back = new ModelRenderer(this, 44, 0);
      back.addBox(0F, 0F, 0F, 4, 1, 15);
      back.setRotationPoint(-3F, 14F, -6F);
      back.setTextureSize(128, 64);
      back.mirror = true;
      setRotation(back, 0F, 0F, 0F);
      leftspine1b = new ModelRenderer(this, 38, 2);
      leftspine1b.addBox(-2F, 0F, 0F, 2, 1, 1);
      leftspine1b.setRotationPoint(5.5F, 17F, -3.3F);
      leftspine1b.setTextureSize(128, 64);
      leftspine1b.mirror = true;
      setRotation(leftspine1b, 0F, -0.3926991F, 0F);
      leftspine2b = new ModelRenderer(this, 38, 2);
      leftspine2b.addBox(-2F, 0F, 0F, 2, 1, 1);
      leftspine2b.setRotationPoint(5.5F, 17F, 0.8F);
      leftspine2b.setTextureSize(128, 64);
      leftspine2b.mirror = true;
      setRotation(leftspine2b, 0F, -0.3926991F, 0F);
      leftspine3b = new ModelRenderer(this, 38, 2);
      leftspine3b.addBox(-2F, 0F, 0F, 2, 1, 1);
      leftspine3b.setRotationPoint(5.5F, 17F, 4.8F);
      leftspine3b.setTextureSize(128, 64);
      leftspine3b.mirror = true;
      setRotation(leftspine3b, 0F, -0.3926991F, 0F);
      eyes = new ModelRenderer(this, 0, 14);
      eyes.addBox(0F, 0F, 0F, 2, 1, 1);
      eyes.setRotationPoint(-2F, 17F, -12F);
      eyes.setTextureSize(128, 64);
      eyes.mirror = true;
      setRotation(eyes, 0F, 0F, 0F);
      leftspine1a = new ModelRenderer(this, 38, 0);
      leftspine1a.addBox(0F, 0F, 0F, 2, 1, 1);
      leftspine1a.setRotationPoint(2F, 17F, -4F);
      leftspine1a.setTextureSize(128, 64);
      leftspine1a.mirror = true;
      setRotation(leftspine1a, 0F, 0F, 0F);
      leftspine2a = new ModelRenderer(this, 38, 0);
      leftspine2a.addBox(0F, 0F, 0F, 2, 1, 1);
      leftspine2a.setRotationPoint(2F, 17F, 0F);
      leftspine2a.setTextureSize(128, 64);
      leftspine2a.mirror = true;
      setRotation(leftspine2a, 0F, 0F, 0F);
      leftspine3a = new ModelRenderer(this, 38, 0);
      leftspine3a.addBox(0F, 0F, 0F, 2, 1, 1);
      leftspine3a.setRotationPoint(2F, 17F, 4F);
      leftspine3a.setTextureSize(128, 64);
      leftspine3a.mirror = true;
      setRotation(leftspine3a, 0F, 0F, 0F);
      rightspine1a = new ModelRenderer(this, 38, 0);
      rightspine1a.addBox(-2F, 0F, 0F, 2, 1, 1);
      rightspine1a.setRotationPoint(-4F, 17F, -4F);
      rightspine1a.setTextureSize(128, 64);
      rightspine1a.mirror = true;
      setRotation(rightspine1a, 0F, 0F, 0F);
      rightspine2a = new ModelRenderer(this, 38, 0);
      rightspine2a.addBox(-2F, 0F, 0F, 2, 1, 1);
      rightspine2a.setRotationPoint(-4F, 17F, 0F);
      rightspine2a.setTextureSize(128, 64);
      rightspine2a.mirror = true;
      setRotation(rightspine2a, 0F, 0F, 0F);
      rightspine3a = new ModelRenderer(this, 38, 0);
      rightspine3a.addBox(-2F, 0F, 0F, 2, 1, 1);
      rightspine3a.setRotationPoint(-4F, 17F, 4F);
      rightspine3a.setTextureSize(128, 64);
      rightspine3a.mirror = true;
      setRotation(rightspine3a, 0F, 0F, 0F);
      rightspine1b = new ModelRenderer(this, 38, 2);
      rightspine1b.addBox(0F, 0F, 0F, 2, 1, 1);
      rightspine1b.setRotationPoint(-7.5F, 17F, -3.25F);
      rightspine1b.setTextureSize(128, 64);
      rightspine1b.mirror = true;
      setRotation(rightspine1b, 0F, 0.3926991F, 0F);
      rightspine2b = new ModelRenderer(this, 38, 2);
      rightspine2b.addBox(0F, 0F, 0F, 2, 1, 1);
      rightspine2b.setRotationPoint(-7.5F, 17F, 0.8F);
      rightspine2b.setTextureSize(128, 64);
      rightspine2b.mirror = true;
      setRotation(rightspine2b, 0F, 0.3926991F, 0F);
      rightspine3b = new ModelRenderer(this, 38, 2);
      rightspine3b.addBox(0F, 0F, 0F, 2, 1, 1);
      rightspine3b.setRotationPoint(-7.5F, 17F, 4.8F);
      rightspine3b.setTextureSize(128, 64);
      rightspine3b.mirror = true;
      setRotation(rightspine3b, 0F, 0.3926991F, 0F);
      tail = new ModelRenderer(this, 0, 0);
      tail.addBox(0F, 0F, 0F, 2, 2, 8);
      tail.setRotationPoint(-2F, 17F, 10F);
      tail.setTextureSize(128, 64);
      tail.mirror = true;
      setRotation(tail, 0F, 0F, 0F);
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
    collartop.render(f5);
    collarbottom.render(f5);
    collarleft.render(f5);
    collarright.render(f5);
    back.render(f5);
    leftspine1b.render(f5);
    leftspine2b.render(f5);
    leftspine3b.render(f5);
    eyes.render(f5);
    leftspine1a.render(f5);
    leftspine2a.render(f5);
    leftspine3a.render(f5);
    rightspine1a.render(f5);
    rightspine2a.render(f5);
    rightspine3a.render(f5);
    rightspine1b.render(f5);
    rightspine2b.render(f5);
    rightspine3b.render(f5);
    tail.render(f5);
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
    
    leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  }

}
