package com.eternaldoom.realmsofchaos.client.entityrenderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelExtractor extends ModelBase
{
    ModelRenderer base;
    ModelRenderer top;
    ModelRenderer middle;
  
  public ModelExtractor()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      base = new ModelRenderer(this, 0, 0);
      base.addBox(0F, 0F, 0F, 16, 4, 16);
      base.setRotationPoint(-8F, 20F, -8F);
      base.setTextureSize(64, 64);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      top = new ModelRenderer(this, 0, 0);
      top.addBox(0F, 0F, 0F, 16, 4, 16);
      top.setRotationPoint(-8F, 8F, -8F);
      top.setTextureSize(64, 64);
      top.mirror = true;
      setRotation(top, 0F, 0F, 0F);
      middle = new ModelRenderer(this, 0, 44);
      middle.addBox(0F, 0F, 0F, 12, 8, 12);
      middle.setRotationPoint(-6F, 12F, -6F);
      middle.setTextureSize(64, 64);
      middle.mirror = true;
      setRotation(middle, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    base.render(f5);
    top.render(f5);
    middle.render(f5);
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
