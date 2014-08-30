package com.eternaldoom.realmsofchaos.client.itemrenderer;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class ItemRendererExtractor implements IItemRenderer {
	TileEntitySpecialRenderer render;
	private TileEntity tile;

	public ItemRendererExtractor(TileEntitySpecialRenderer render, TileEntity tile) {
	    this.render = render;
	    this.tile = tile;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		if (type == IItemRenderer.ItemRenderType.ENTITY) GL11.glTranslatef(-0.5F, 0F, -0.5F);
		else if (type == IItemRenderer.ItemRenderType.INVENTORY) GL11.glTranslatef(0f, -0.1f, 0f);
		this.render.renderTileEntityAt(this.tile, 0.0D, 0.0D, 0.0D, 0.0F);
	}
}