package com.eternaldoom.realmsofchaos.client.blockrenderers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.blocks.TileEntityOceanChest;

public class RenderOceanChest extends TileEntitySpecialRenderer{

	private static final ResourceLocation texture = new ResourceLocation("realmsofchaos:textures/tileentity/chest/ocean.png");
	private ModelChest model = new ModelChest();
	private RenderEntityItem itemRenderer = new RenderEntityItem(Minecraft.getMinecraft().getRenderManager(), Minecraft.getMinecraft().getRenderItem());
		
	public void render(TileEntityOceanChest tileentity, double x, double y, double z, float f) {

		int i;
		
		if (!tileentity.hasWorldObj()) {
			i = 0;
		}
		else {
			i = tileentity.getBlockMetadata();
		}

		if (tileentity.adjacentChestZNeg == null && tileentity.adjacentChestXNeg == null) {
			if (tileentity.adjacentChestXPos == null && tileentity.adjacentChestZPos == null) {
				this.bindTexture(texture);
			}
		}

		GL11.glPushMatrix();
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glTranslatef((float)x, (float)y + 1.0F, (float)z + 1.0F);
		GL11.glScalef(1.0F, -1.0F, -1.0F);
		GL11.glTranslatef(0.5F, 0.5F, 0.5F);
		short rotation = 0;

		if (i == 2) {
			rotation = 180;
		}

		if (i == 3) {
			rotation = 0;
		}

		if (i == 4) {
			rotation = 90;
		}

		if (i == 5) {
			rotation = -90;
		}

		if (i == 2 && tileentity.adjacentChestXPos != null) {
			GL11.glTranslatef(1.0F, 0.0F, 0.0F);
		}

		if (i == 5 && tileentity.adjacentChestZPos != null) {
			GL11.glTranslatef(0.0F, 0.0F, -1.0F);
		}

		GL11.glRotatef((float)rotation, 0.0F, 1.0F, 0.0F);
		GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
		float f1 = tileentity.prevLidAngle + (tileentity.lidAngle - tileentity.prevLidAngle) * f;
		float f2;

		if (tileentity.adjacentChestZNeg != null) {
			f2 = tileentity.adjacentChestZNeg.prevLidAngle + (tileentity.adjacentChestZNeg.lidAngle - tileentity.adjacentChestZNeg.prevLidAngle) * f;

			if (f2 > f1) {
				f1 = f2;
			}
		}

		if (tileentity.adjacentChestXNeg != null) {
			f2 = tileentity.adjacentChestXNeg.prevLidAngle + (tileentity.adjacentChestXNeg.lidAngle - tileentity.adjacentChestXNeg.prevLidAngle) * f;

			if (f2 > f1) {
				f1 = f2;
			}
		}

		f1 = 1.0F - f1;
		f1 = 1.0F - f1 * f1 * f1;
		model.chestLid.rotateAngleX = -(f1 * (float)Math.PI / 2.0F);
		model.renderAll();
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double i, double j, double k, float f, int idk) {
		render((TileEntityOceanChest)tileentity, i, j, k, f);
	}

}
