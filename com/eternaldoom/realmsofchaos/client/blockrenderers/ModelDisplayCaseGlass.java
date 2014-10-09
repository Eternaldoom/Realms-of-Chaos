package com.eternaldoom.realmsofchaos.client.blockrenderers;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;

public class ModelDisplayCaseGlass extends ModelBase{
	
	public ModelRenderer glass = new ModelRenderer(this, 0, 0);
	
	public ModelDisplayCaseGlass(){
		this.textureWidth = 32;
		this.textureHeight = 32;
		
		this.glass.addBox(2, 11, 2, 12, 4, 12, 0);
	}
	
	public void render()
    {
    	GlStateManager.enableBlend();
    	GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        this.glass.render(0.0625f);
        GlStateManager.disableBlend();
    }

}
