package com.eternaldoom.realmsofchaos.client.blockrenderers;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class RenderSoyPlant implements ISimpleBlockRenderingHandler{

	public static int renderId;
	private Tessellator t = Tessellator.instance;
	
	public RenderSoyPlant(){
		renderId = RenderingRegistry.getNextAvailableRenderId();
	}
	
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {}
	
	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		
		IIcon icon = block.getIcon(0, world.getBlockMetadata(x, y, z));
		
		double u = icon.getMinU();
		double v = icon.getMinV();
		double U = icon.getMaxU();
		double V = icon.getMaxV();
		
		t.addTranslation(x, y, z);
		int lightValue = block.getMixedBrightnessForBlock(world, (int)x, (int)y, (int)z);
		t.setBrightness(lightValue);
		t.setColorOpaque_F(1.0F, 1.0F, 1.0F);		
		renderModel(u, v, U, V);
		t.addTranslation(-x, -y, -z);
				
		return true;
	}
	
	private void renderModel(double u, double v, double U, double V){
		t.addVertexWithUV(0.5, 1, 1, u, v);
		t.addVertexWithUV(0.5, 1, 0, U, v);
		t.addVertexWithUV(0.5, 0, 0, U, V);
		t.addVertexWithUV(0.5, 0, 1, u, V);
		t.addVertexWithUV(0.5, 1, 0, U, v);
		t.addVertexWithUV(0.5, 1, 1, u, v);
		t.addVertexWithUV(0.5, 0, 1, u, V);
		t.addVertexWithUV(0.5, 0, 0, U, V);
		
		t.addVertexWithUV(1, 1, 0.5, u, v);
		t.addVertexWithUV(0, 1, 0.5, U, v);
		t.addVertexWithUV(0, 0, 0.5, U, V);
		t.addVertexWithUV(1, 0, 0.5, u, V);
		t.addVertexWithUV(0, 1, 0.5, U, v);
		t.addVertexWithUV(1, 1, 0.5, u, v);
		t.addVertexWithUV(1, 0, 0.5, u, V);
		t.addVertexWithUV(0, 0, 0.5, U, V);
		
		t.addVertexWithUV(0.825, 1, 0.825, u, v);
		t.addVertexWithUV(0.125, 1, 0.125, U, v);
		t.addVertexWithUV(0.125, 0, 0.125, U, V);
		t.addVertexWithUV(0.825, 0, 0.825, u, V);
		t.addVertexWithUV(0.125, 1, 0.125, U, v);
		t.addVertexWithUV(0.825, 1, 0.825, u, v);
		t.addVertexWithUV(0.825, 0, 0.825, u, V);
		t.addVertexWithUV(0.125, 0, 0.125, U, V);
		
		t.addVertexWithUV(0.825, 1, 0.125, u, v);
		t.addVertexWithUV(0.125, 1, 0.825, U, v);
		t.addVertexWithUV(0.125, 0, 0.825, U, V);
		t.addVertexWithUV(0.825, 0, 0.125, u, V);
		t.addVertexWithUV(0.125, 1, 0.825, U, v);
		t.addVertexWithUV(0.825, 1, 0.125, u, v);
		t.addVertexWithUV(0.825, 0, 0.125, u, V);
		t.addVertexWithUV(0.125, 0, 0.825, U, V);
	}
	
	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return false;
	}
	@Override
	public int getRenderId() {
		return renderId;
	}
}