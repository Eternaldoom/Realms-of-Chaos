package com.eternaldoom.realmsofchaos.client.blockrenderers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class DisplayCaseItemRenderer extends TileEntitySpecialRenderer{
	
    private RenderEntityItem renderItem;

	@Override
	public void renderTileEntityAt(TileEntity tile, double p_180535_2_, double p_180535_4_, double p_180535_6_, float p_180535_8_, int p_180535_9_) {
        renderItem = new RenderEntityItem(Minecraft.getMinecraft().getRenderManager(), Minecraft.getMinecraft().getRenderItem());
        
        GlStateManager.translate(tile.getPos().getX(), tile.getPos().getY(), tile.getPos().getZ());
        EntityItem customitem = new EntityItem(this.getWorld());
        customitem.hoverStart = 0f;
        GlStateManager.pushMatrix();
        customitem.setEntityItemStack(new ItemStack(Items.diamond));
        renderItem.doRender(customitem, 0, 0, 0, 0, 0);
        GlStateManager.popMatrix();
	}

}