package com.eternaldoom.realmsofchaos.client.blockrenderers;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class RenderExtractor implements ISimpleBlockRenderingHandler{

	public static int renderId;
	private Tessellator t = Tessellator.instance;
	
	public RenderExtractor(){
		renderId = RenderingRegistry.getNextAvailableRenderId();
	}
	
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {
		GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
		t.startDrawingQuads();
		drawModel(block, 0, 0, 0);
		t.draw();
		GL11.glTranslatef(0.5F, 0.5F, 0.5F);
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		t.addTranslation(x, y, z);
		int lightValue = block.getMixedBrightnessForBlock(world, (int)x, (int)y, (int)z);
		t.setBrightness(lightValue);
		t.setColorOpaque_F(1.0F, 1.0F, 1.0F);
		drawModel(block, x, y, z);
		t.addTranslation(-x, -y, -z);
		return true;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return true;
	}

	@Override
	public int getRenderId() {
		return renderId;
	}
	
	private void drawModel(Block block, double x, double y, double z){
		IIcon icon = ROCBlocks.extractor.getIcon(0, 0);
		IIcon charicon = ROCBlocks.charwood_planks.getIcon(0, 0);
		
		double minU = (double)icon.getMinU();
	    double minV = (double)icon.getMinV();
	    double maxU = (double)icon.getMaxU();
	    double maxV = (double)icon.getMaxV();
	    
		drawBase(0, minU, minV, maxU, maxV);
		drawBase(0.75, minU, minV, maxU, maxV);
		
		double cminU = (double)charicon.getMinU();
	    double cminV = (double)charicon.getMinV();
	    double cmaxU = (double)charicon.getMaxU() - (((double)charicon.getMaxU()-cminU)/2);
	    double cmaxV = (double)charicon.getMaxV() - (((double)charicon.getMaxV()-cminV)/2);;
		
	    t.addVertexWithUV(0.875, 0.125, 0.125, cminU, cminV);
		t.addVertexWithUV(0.875, 0.875, 0.125, cmaxU, cminV);
		t.addVertexWithUV(0.875, 0.875, 0.875, cmaxU, cmaxV);
		t.addVertexWithUV(0.875, 0.125, 0.875, cminU, cmaxV);
		
		t.addVertexWithUV(0.125, 0.125, 0.875, cminU, cminV);
		t.addVertexWithUV(0.125, 0.875, 0.875, cmaxU, cminV);
		t.addVertexWithUV(0.125, 0.875, 0.125, cmaxU, cmaxV);
		t.addVertexWithUV(0.125, 0.125, 0.125, cminU, cmaxV);
		
		t.addVertexWithUV(0.125, 0.125, 0.125, cminU, cminV);
		t.addVertexWithUV(0.125, 0.875, 0.125, cmaxU, cminV);
		t.addVertexWithUV(0.875, 0.875, 0.125, cmaxU, cmaxV);
		t.addVertexWithUV(0.875, 0.125, 0.125, cminU, cmaxV);
		
		t.addVertexWithUV(0.875, 0.125, 0.875, cminU, cminV);
		t.addVertexWithUV(0.875, 0.875, 0.875, cmaxU, cminV);
		t.addVertexWithUV(0.125, 0.875, 0.875, cmaxU, cmaxV);
		t.addVertexWithUV(0.125, 0.125, 0.875, cminU, cmaxV);
	}
	
	private void drawBase(double y, double minU, double minV, double maxU, double maxV){
		t.setNormal(0.0F, 1.0F, 0.0F);
		t.addVertexWithUV(0, y+0.25, 1, minU, minV);
		t.addVertexWithUV(1, y+0.25, 1, maxU, minV);
		t.addVertexWithUV(1, y+0.25, 0, maxU, maxV);
		t.addVertexWithUV(0, y+0.25, 0, minU, maxV);
		
		t.setNormal(0.0F, -1.0F, 0.0F);
		t.addVertexWithUV(0, y, 0, minU, minV);
		t.addVertexWithUV(1, y, 0, maxU, minV);
		t.addVertexWithUV(1, y, 1, maxU, maxV);
		t.addVertexWithUV(0, y, 1, minU, maxV);
		
		double iHeight = (maxU-minU)/4;
		
		t.setNormal(1, 0, 0);
		t.addVertexWithUV(1, y, 0, minU, minV);
		t.addVertexWithUV(1, y+0.25, 0, minU+iHeight, minV);
		t.addVertexWithUV(1, y+0.25, 1, minU+iHeight, maxV);
		t.addVertexWithUV(1, y, 1, minU, maxV);
		
		t.setNormal(-1, 0, 0);
		t.addVertexWithUV(0, y, 1, minU, minV);
		t.addVertexWithUV(0, y+0.25, 1, minU+iHeight, minV);
		t.addVertexWithUV(0, y+0.25, 0, minU+iHeight, maxV);
		t.addVertexWithUV(0, y, 0, minU, maxV);
		
		t.setNormal(0, 0, -1);
		t.addVertexWithUV(0, y, 0, minU, minV);
		t.addVertexWithUV(0, y+0.25, 0, minU+iHeight, minV);
		t.addVertexWithUV(1, y+0.25, 0, minU+iHeight, maxV);
		t.addVertexWithUV(1, y, 0, minU, maxV);
		
		t.setNormal(0, 0, 1);
		t.addVertexWithUV(1, y, 1, minU, minV);
		t.addVertexWithUV(1, y+0.25, 1, minU+iHeight, minV);
		t.addVertexWithUV(0, y+0.25, 1, minU+iHeight, maxV);
		t.addVertexWithUV(0, y, 1, minU, maxV);
	}
}
