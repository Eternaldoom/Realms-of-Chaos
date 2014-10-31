package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelStag extends ModelBase
{
    ModelRenderer Neck_1;
    ModelRenderer Neck_2;
    ModelRenderer Head;
    ModelRenderer Nose_1;
    ModelRenderer Nose_2;
    ModelRenderer Ear_1;
    ModelRenderer Ear_2;
    ModelRenderer Antler_piece_1;
    ModelRenderer Antler_piece_2;
    ModelRenderer Antler_piece_3;
    ModelRenderer Antler_piece_4;
    ModelRenderer Antler_piece_5;
    ModelRenderer Antler_piece_6;
    ModelRenderer Antler_piece_7;
    ModelRenderer Antler_piece_8;
    ModelRenderer Antler_piece_9;
    ModelRenderer Antler_piece_10;
    ModelRenderer Antler_piece_11;
    ModelRenderer Antler_piece_12;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
  
  public ModelStag()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Neck_1 = new ModelRenderer(this, 0, 50);
      Neck_1.addBox(0F, 0F, 0F, 8, 10, 6);
      Neck_1.setRotationPoint(-4F, 0F, -11F);
      Neck_1.setTextureSize(128, 128);
      Neck_1.mirror = true;
      setRotation(Neck_1, 0F, 0F, 0F);
      Neck_2 = new ModelRenderer(this, 0, 38);
      Neck_2.addBox(0F, 0F, 0F, 6, 7, 4);
      Neck_2.setRotationPoint(-3F, -1F, -13F);
      Neck_2.setTextureSize(128, 128);
      Neck_2.mirror = true;
      setRotation(Neck_2, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 33, 50);
      Head.addBox(-3F, 0F, 0F, 6, 7, 6);
      Head.setRotationPoint(0F, -4F, -16F);
      Head.setTextureSize(128, 128);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Nose_1 = new ModelRenderer(this, 24, 39);
      Nose_1.addBox(-3F, 3F, -5F, 6, 4, 5);
      Nose_1.setTextureSize(128, 128);
      Nose_1.mirror = true;
      setRotation(Nose_1, 0F, 0F, 0F);
      Nose_2 = new ModelRenderer(this, 0, 73);
      Nose_2.addBox(-2F, 4F, -7F, 4, 3, 3);
      Nose_2.setTextureSize(128, 128);
      Nose_2.mirror = true;
      setRotation(Nose_2, 0F, 0F, 0F);
      Ear_1 = new ModelRenderer(this, 55, 0);
      Ear_1.addBox(0F, 0F, 0F, 2, 4, 1);
      Ear_1.setRotationPoint(3F, -6F, -15F);
      Ear_1.setTextureSize(128, 128);
      Ear_1.mirror = true;
      setRotation(Ear_1, -0.1396263F, 0F, 0.3141593F);
      Ear_2 = new ModelRenderer(this, 55, 0);
      Ear_2.addBox(0F, 0F, 0F, 2, 4, 1);
      Ear_2.setRotationPoint(-5F, -5.5F, -15F);
      Ear_2.setTextureSize(128, 128);
      Ear_2.mirror = true;
      setRotation(Ear_2, -0.1396263F, 0F, -0.3141593F);
      Antler_piece_1 = new ModelRenderer(this, 0, 32);
      Antler_piece_1.addBox(0F, 0F, 0F, 1, 2, 1);
      //Antler_piece_1.setRotationPoint(2F, -6F, -13F);
      Antler_piece_1.setTextureSize(128, 128);
      Antler_piece_1.mirror = true;
      setRotation(Antler_piece_1, 0F, 0F, 0F);
      Antler_piece_2 = new ModelRenderer(this, 11, 32);
      Antler_piece_2.addBox(0F, 0F, 0F, 1, 2, 1);
      //Antler_piece_2.setRotationPoint(-3F, -6F, -13F);
      Antler_piece_2.setTextureSize(128, 128);
      Antler_piece_2.mirror = true;
      setRotation(Antler_piece_2, 0F, 0F, 0F);
      Antler_piece_3 = new ModelRenderer(this, 0, 32);
      Antler_piece_3.addBox(0F, 0F, 0F, 1, 2, 1);
      //Antler_piece_3.setRotationPoint(3F, -7.5F, -13F);
      Antler_piece_3.setTextureSize(128, 128);
      Antler_piece_3.mirror = true;
      setRotation(Antler_piece_3, 0F, 0F, 0F);
      Antler_piece_4 = new ModelRenderer(this, 11, 32);
      Antler_piece_4.addBox(0F, 0F, 0F, 1, 2, 1);
      //Antler_piece_4.setRotationPoint(-4F, -7.5F, -13F);
      Antler_piece_4.setTextureSize(128, 128);
      Antler_piece_4.mirror = true;
      setRotation(Antler_piece_4, 0F, 0F, 0F);
      Antler_piece_5 = new ModelRenderer(this, 0, 32);
      Antler_piece_5.addBox(0F, 0F, 0F, 1, 2, 1);
      //Antler_piece_5.setRotationPoint(2F, -8.5F, -14F);
      Antler_piece_5.setTextureSize(128, 128);
      Antler_piece_5.mirror = true;
      setRotation(Antler_piece_5, 0F, 0F, 0F);
      Antler_piece_6 = new ModelRenderer(this, 0, 32);
      Antler_piece_6.addBox(0F, 0F, 0F, 1, 3, 1);
      //Antler_piece_6.setRotationPoint(3F, -9.5F, -12F);
      Antler_piece_6.setTextureSize(128, 128);
      Antler_piece_6.mirror = true;
      setRotation(Antler_piece_6, 0F, 0F, 0F);
      Antler_piece_7 = new ModelRenderer(this, 11, 32);
      Antler_piece_7.addBox(0F, 0F, 0F, 1, 3, 1);
      //Antler_piece_7.setRotationPoint(-4F, -9.5F, -12F);
      Antler_piece_7.setTextureSize(128, 128);
      Antler_piece_7.mirror = true;
      setRotation(Antler_piece_7, 0F, 0F, 0F);
      Antler_piece_8 = new ModelRenderer(this, 0, 32);
      Antler_piece_8.addBox(0F, 0F, 0F, 1, 4, 1);
      //Antler_piece_8.setRotationPoint(4F, -12.5F, -11F);
      Antler_piece_8.setTextureSize(128, 128);
      Antler_piece_8.mirror = true;
      setRotation(Antler_piece_8, 0F, 0F, 0F);
      Antler_piece_9 = new ModelRenderer(this, 0, 32);
      Antler_piece_9.addBox(0F, 0F, 0F, 1, 3, 1);
      //Antler_piece_9.setRotationPoint(2F, -11.5F, -11F);
      Antler_piece_9.setTextureSize(128, 128);
      Antler_piece_9.mirror = true;
      setRotation(Antler_piece_9, 0F, 0F, 0F);
      Antler_piece_10 = new ModelRenderer(this, 11, 32);
      Antler_piece_10.addBox(0F, 0F, 0F, 1, 4, 1);
      //Antler_piece_10.setRotationPoint(-5F, -12.5F, -11F);
      Antler_piece_10.setTextureSize(128, 128);
      Antler_piece_10.mirror = true;
      setRotation(Antler_piece_10, 0F, 0F, 0F);
      Antler_piece_11 = new ModelRenderer(this, 11, 32);
      Antler_piece_11.addBox(0F, 0F, 0F, 1, 3, 1);
      //Antler_piece_11.setRotationPoint(-3F, -11.5F, -11F);
      Antler_piece_11.setTextureSize(128, 128);
      Antler_piece_11.mirror = true;
      setRotation(Antler_piece_11, 0F, 0F, 0F);
      Antler_piece_12 = new ModelRenderer(this, 11, 32);
      Antler_piece_12.addBox(0F, 0F, 0F, 1, 2, 1);
      //Antler_piece_12.setRotationPoint(-3F, -8.5F, -14F);
      Antler_piece_12.setTextureSize(128, 128);
      Antler_piece_12.mirror = true;
      setRotation(Antler_piece_12, 0F, 0F, 0F);
      body = new ModelRenderer(this, 63, 37);
      body.addBox(-6F, -10F, -7F, 8, 24, 10);
      body.setRotationPoint(2F, 5F, 1F);
      body.setTextureSize(128, 128);
      body.mirror = true;
      setRotation(body, 1.570796F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 16);
      leg1.addBox(-3F, 0F, -2F, 2, 12, 2);
      leg1.setRotationPoint(-1F, 12F, 15F);
      leg1.setTextureSize(128, 128);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 16);
      leg2.addBox(-1F, 0F, -2F, 2, 12, 2);
      leg2.setRotationPoint(3F, 12F, 15F);
      leg2.setTextureSize(128, 128);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-3F, 0F, -3F, 2, 12, 2);
      leg3.setRotationPoint(-1F, 12F, -5F);
      leg3.setTextureSize(128, 128);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(-1F, 0F, -3F, 2, 12, 2);
      leg4.setRotationPoint(3F, 12F, -5F);
      leg4.setTextureSize(128, 128);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      this.Head.addChild(Antler_piece_1);
      this.Head.addChild(Antler_piece_2);
      this.Head.addChild(Antler_piece_3);
      this.Head.addChild(Antler_piece_4);
      this.Head.addChild(Antler_piece_5);
      this.Head.addChild(Antler_piece_6);
      this.Head.addChild(Antler_piece_7);
      this.Head.addChild(Antler_piece_8);
      this.Head.addChild(Antler_piece_9);
      this.Head.addChild(Antler_piece_10);
      this.Head.addChild(Antler_piece_11);
      this.Head.addChild(Antler_piece_12);
      this.Head.addChild(Nose_1);
      this.Head.addChild(Nose_2);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (this.isChild){
        float f6 = 2.0F;
        GlStateManager.pushMatrix();
        GlStateManager.translate(0.0F, 8 * f5, 6 * f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.scale(1.0F / f6, 1.0F / f6, 1.0F / f6);
        GlStateManager.translate(0.0F, 24.0F * f5, 0.0F);
    }
    Neck_1.render(f5);
    Neck_2.render(f5);
    Head.render(f5);
    Ear_1.render(f5);
    Ear_2.render(f5);
    body.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    
    if(this.isChild){
    	GlStateManager.popMatrix();
    }
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float time, float walkSpeed, float smooth, float rotationYaw, float rotationPitch, float scale, Entity entity)
  {
    super.setRotationAngles(time, walkSpeed, smooth, rotationYaw, rotationPitch, scale, entity);
    
    float deg_per_rad = (180F / (float)Math.PI);
    this.Head.rotateAngleX = rotationPitch / (180F / (float)Math.PI);
    this.Head.rotateAngleY = rotationYaw / (180F / (float)Math.PI);
    this.body.rotateAngleX = ((float)Math.PI / 2F);
    this.leg1.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * walkSpeed;
    this.leg2.rotateAngleX = MathHelper.cos(time * 0.6662F + (float)Math.PI) * 1.4F * walkSpeed;
    this.leg3.rotateAngleX = MathHelper.cos(time * 0.6662F + (float)Math.PI) * 1.4F * walkSpeed;
    this.leg4.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * walkSpeed;
    
  }

}
