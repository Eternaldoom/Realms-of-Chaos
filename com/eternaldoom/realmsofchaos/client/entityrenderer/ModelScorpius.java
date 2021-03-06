package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelScorpius extends ModelBase
{
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
    ModelRenderer head;
    ModelRenderer rightside;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer collartop;
    ModelRenderer collarbottom;
    ModelRenderer collarleft;
    ModelRenderer collarright;
    ModelRenderer leftspine1b;
    ModelRenderer leftspine2b;
    ModelRenderer leftspine3b;
    ModelRenderer eyes;
    ModelRenderer xylite;
    ModelRenderer leftside;
    ModelRenderer front;
    ModelRenderer rightside2;
    ModelRenderer leftside2;
    ModelRenderer back;
    ModelRenderer tail2;
    ModelRenderer back2;
    ModelRenderer stinger;
  
  public ModelScorpius()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      leftspine1a = new ModelRenderer(this, 38, 32);
      leftspine1a.addBox(0F, 0F, 0F, 5, 1, 1);
      leftspine1a.setRotationPoint(18F, 17F, -4F);
      leftspine1a.setTextureSize(256, 128);
      leftspine1a.mirror = true;
      setRotation(leftspine1a, 0F, 0F, 0F);
      leftspine2a = new ModelRenderer(this, 38, 32);
      leftspine2a.addBox(0F, 0F, 0F, 5, 1, 1);
      leftspine2a.setRotationPoint(18F, 17F, 0F);
      leftspine2a.setTextureSize(256, 128);
      leftspine2a.mirror = true;
      setRotation(leftspine2a, 0F, 0F, 0F);
      leftspine3a = new ModelRenderer(this, 38, 32);
      leftspine3a.addBox(0F, 0F, 0F, 5, 1, 1);
      leftspine3a.setRotationPoint(18F, 17F, 4F);
      leftspine3a.setTextureSize(256, 128);
      leftspine3a.mirror = true;
      setRotation(leftspine3a, 0F, 0F, 0F);
      rightspine1a = new ModelRenderer(this, 38, 32);
      rightspine1a.addBox(-2F, 0F, 0F, 5, 1, 1);
      rightspine1a.setRotationPoint(-23F, 17F, -4F);
      rightspine1a.setTextureSize(256, 128);
      rightspine1a.mirror = true;
      setRotation(rightspine1a, 0F, 0F, 0F);
      rightspine2a = new ModelRenderer(this, 38, 32);
      rightspine2a.addBox(-2F, 0F, 0F, 5, 1, 1);
      rightspine2a.setRotationPoint(-23F, 17F, 0F);
      rightspine2a.setTextureSize(256, 128);
      rightspine2a.mirror = true;
      setRotation(rightspine2a, 0F, 0F, 0F);
      rightspine3a = new ModelRenderer(this, 38, 32);
      rightspine3a.addBox(-2F, 0F, 0F, 5, 1, 1);
      rightspine3a.setRotationPoint(-23F, 17F, 4F);
      rightspine3a.setTextureSize(256, 128);
      rightspine3a.mirror = true;
      setRotation(rightspine3a, 0F, 0F, 0F);
      rightspine1b = new ModelRenderer(this, 38, 32);
      rightspine1b.addBox(-5F, 0F, 0F, 5, 1, 1);
      rightspine1b.setRotationPoint(-24.5F, 17F, -4.25F);
      rightspine1b.setTextureSize(256, 128);
      rightspine1b.mirror = true;
      setRotation(rightspine1b, 0F, 0.3926991F, 0F);
      rightspine2b = new ModelRenderer(this, 38, 30);
      rightspine2b.addBox(-5F, 0F, 0F, 4, 1, 1);
      rightspine2b.setRotationPoint(-23.5F, 17F, -0.2F);
      rightspine2b.setTextureSize(256, 128);
      rightspine2b.mirror = true;
      setRotation(rightspine2b, 0F, 0.3926991F, 0F);
      rightspine3b = new ModelRenderer(this, 38, 28);
      rightspine3b.addBox(-3F, 0F, 0F, 3, 1, 1);
      rightspine3b.setRotationPoint(-24.5F, 17F, 3.8F);
      rightspine3b.setTextureSize(256, 128);
      rightspine3b.mirror = true;
      setRotation(rightspine3b, 0F, 0.3926991F, 0F);
      tail = new ModelRenderer(this, 55, 0);
      tail.addBox(0F, 0F, 0F, 4, 4, 12);
      tail.setRotationPoint(-3F, 12F, 21F);
      tail.setTextureSize(256, 128);
      tail.mirror = true;
      setRotation(tail, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 16);
      head.addBox(0F, 0F, -2.5F, 11, 3, 4);
      head.setRotationPoint(-6.5F, 13.5F, -17F);
      head.setTextureSize(256, 128);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      rightside = new ModelRenderer(this, 64, 85);
      rightside.addBox(0F, 0F, 0F, 6, 10, 33);
      rightside.setRotationPoint(-17F, 9F, -15F);
      rightside.setTextureSize(256, 128);
      rightside.mirror = true;
      setRotation(rightside, 0F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 23);
      leg1.addBox(0F, 0F, 0F, 1, 5, 1);
      leg1.setRotationPoint(-15F, 19F, 10F);
      leg1.setTextureSize(256, 128);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 23);
      leg2.addBox(0F, 0F, 0F, 1, 5, 1);
      leg2.setRotationPoint(12F, 19F, 10F);
      leg2.setTextureSize(256, 128);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 23);
      leg3.addBox(0F, 0F, 0F, 1, 5, 1);
      leg3.setRotationPoint(-15F, 19F, -4F);
      leg3.setTextureSize(256, 128);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 23);
      leg4.addBox(0F, 0F, 0F, 1, 5, 1);
      leg4.setRotationPoint(11F, 19F, -4F);
      leg4.setTextureSize(256, 128);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      collartop = new ModelRenderer(this, 0, 6);
      collartop.addBox(0F, 0F, 0F, 10, 1, 2);
      collartop.setRotationPoint(-6F, 13F, -17F);
      collartop.setTextureSize(256, 128);
      collartop.mirror = true;
      setRotation(collartop, 0F, 0F, 0F);
      collarbottom = new ModelRenderer(this, 0, 6);
      collarbottom.addBox(0F, 0F, 0F, 10, 1, 2);
      collarbottom.setRotationPoint(-6F, 16F, -17F);
      collarbottom.setTextureSize(256, 128);
      collarbottom.mirror = true;
      setRotation(collarbottom, 0F, 0F, 0F);
      collarleft = new ModelRenderer(this, 0, 9);
      collarleft.addBox(0F, 0F, 0F, 1, 3, 2);
      collarleft.setRotationPoint(4F, 13.5F, -17F);
      collarleft.setTextureSize(256, 128);
      collarleft.mirror = true;
      setRotation(collarleft, 0F, 0F, 0F);
      collarright = new ModelRenderer(this, 0, 9);
      collarright.addBox(0F, 0F, 0F, 1, 3, 2);
      collarright.setRotationPoint(-7F, 13.5F, -17F);
      collarright.setTextureSize(256, 128);
      collarright.mirror = true;
      setRotation(collarright, 0F, 0F, 0F);
      leftspine1b = new ModelRenderer(this, 38, 32);
      leftspine1b.addBox(0F, 0F, 0F, 5, 1, 1);
      leftspine1b.setRotationPoint(22.5F, 17F, -4.3F);
      leftspine1b.setTextureSize(256, 128);
      leftspine1b.mirror = true;
      setRotation(leftspine1b, 0F, -0.3926991F, 0F);
      leftspine2b = new ModelRenderer(this, 38, 30);
      leftspine2b.addBox(0F, 0F, 0F, 4, 1, 1);
      leftspine2b.setRotationPoint(22.5F, 17F, -0.2F);
      leftspine2b.setTextureSize(256, 128);
      leftspine2b.mirror = true;
      setRotation(leftspine2b, 0F, -0.3926991F, 0F);
      leftspine3b = new ModelRenderer(this, 38, 28);
      leftspine3b.addBox(0F, 0F, 0F, 3, 1, 1);
      leftspine3b.setRotationPoint(22.5F, 17F, 3.8F);
      leftspine3b.setTextureSize(256, 128);
      leftspine3b.mirror = true;
      setRotation(leftspine3b, 0F, -0.3926991F, 0F);
      eyes = new ModelRenderer(this, 0, 29);
      eyes.addBox(0F, 0F, 0F, 4, 2, 1);
      eyes.setRotationPoint(-3F, 14F, -20F);
      eyes.setTextureSize(256, 128);
      eyes.mirror = true;
      setRotation(eyes, 0F, 0F, 0F);
      xylite = new ModelRenderer(this, 0, 96);
      xylite.addBox(-8F, -8F, 0F, 16, 16, 16);
      xylite.setRotationPoint(-1F, 10F, -7F);
      xylite.setTextureSize(256, 128);
      xylite.mirror = true;
      setRotation(xylite, 0F, 0F, 0F);
      leftside = new ModelRenderer(this, 64, 85);
      leftside.addBox(0F, 0F, 0F, 6, 10, 33);
      leftside.setRotationPoint(9F, 9F, -15F);
      leftside.setTextureSize(256, 128);
      leftside.mirror = true;
      setRotation(leftside, 0F, 0F, 0F);
      front = new ModelRenderer(this, 0, 58);
      front.addBox(0F, 0F, 0F, 20, 10, 6);
      front.setRotationPoint(-11F, 9F, -15F);
      front.setTextureSize(256, 128);
      front.mirror = true;
      setRotation(front, 0F, 0F, 0F);
      rightside2 = new ModelRenderer(this, 151, 0);
      rightside2.addBox(0F, 0F, 0F, 3, 8, 29);
      rightside2.setRotationPoint(-20F, 10F, -13F);
      rightside2.setTextureSize(256, 128);
      rightside2.mirror = true;
      setRotation(rightside2, 0F, 0F, 0F);
      leftside2 = new ModelRenderer(this, 151, 0);
      leftside2.addBox(0F, 0F, 0F, 3, 8, 29);
      leftside2.setRotationPoint(15F, 10F, -13F);
      leftside2.setTextureSize(256, 128);
      leftside2.mirror = true;
      setRotation(leftside2, 0F, 0F, 0F);
      back = new ModelRenderer(this, 0, 58);
      back.addBox(0F, 0F, 0F, 20, 10, 6);
      back.setRotationPoint(-11F, 9F, 12F);
      back.setTextureSize(256, 128);
      back.mirror = true;
      setRotation(back, 0F, 0F, 0F);
      tail2 = new ModelRenderer(this, 90, 0);
      tail2.addBox(0F, 0F, 0F, 2, 2, 12);
      tail2.setRotationPoint(-2F, 13F, 33F);
      tail2.setTextureSize(256, 128);
      tail2.mirror = true;
      setRotation(tail2, 0F, 0F, 0F);
      back2 = new ModelRenderer(this, 52, 58);
      back2.addBox(0F, 0F, 0F, 28, 8, 3);
      back2.setRotationPoint(-15F, 10F, 18F);
      back2.setTextureSize(256, 128);
      back2.mirror = true;
      setRotation(back2, 0F, 0F, 0F);
      stinger = new ModelRenderer(this, 0, 0);
      stinger.addBox(0F, 0F, 0F, 2, 2, 3);
      stinger.setRotationPoint(-2F, 13F, 44F);
      stinger.setTextureSize(256, 128);
      stinger.mirror = true;
      setRotation(stinger, 0.3839724F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
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
    head.render(f5);
    rightside.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    collartop.render(f5);
    collarbottom.render(f5);
    collarleft.render(f5);
    collarright.render(f5);
    leftspine1b.render(f5);
    leftspine2b.render(f5);
    leftspine3b.render(f5);
    eyes.render(f5);
    xylite.render(f5);
    leftside.render(f5);
    front.render(f5);
    rightside2.render(f5);
    leftside2.render(f5);
    back.render(f5);
    tail2.render(f5);
    back2.render(f5);
    stinger.render(f5);
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
    
    float spinerotate = 0.3f;
    
    xylite.rotateAngleZ = (f2/(180f/(float)Math.PI)*2)*0.8f;
    leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    leftspine1b.rotateAngleY = (MathHelper.cos(f * 0.6662F) * 1.4F * f1)+spinerotate;
    leftspine2b.rotateAngleY = (MathHelper.cos(f * 0.6662F) * 1.4F * f1)+spinerotate;
    leftspine3b.rotateAngleY = (MathHelper.cos(f * 0.6662F) * 1.4F * f1)+spinerotate;
    rightspine1b.rotateAngleY = (MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1)-spinerotate;
    rightspine2b.rotateAngleY = (MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1)-spinerotate;
    rightspine3b.rotateAngleY = (MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1)-spinerotate;
  }

}
