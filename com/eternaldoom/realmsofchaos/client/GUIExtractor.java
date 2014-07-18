package com.eternaldoom.realmsofchaos.client;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.eternaldoom.realmsofchaos.overworld.blocks.ContainerExtractor;
import com.eternaldoom.realmsofchaos.overworld.blocks.TileEntityExtractor;

public class GUIExtractor extends GuiContainer {

    private TileEntityExtractor furnaceInventory;

    public GUIExtractor(InventoryPlayer par1InventoryPlayer, TileEntityExtractor par2TileEntityFurnace) {
        super(new ContainerExtractor(par1InventoryPlayer, par2TileEntityFurnace));
        this.furnaceInventory = par2TileEntityFurnace;
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(int arg1, int arg2) {
        String s = "Extractor";
        this.fontRendererObj.drawString(s, 10, 6, 4210752);
        this.fontRendererObj.drawString("Inventory", 8, this.ySize - 96 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(new ResourceLocation("realmsofchaos:textures/gui/extractor.png"));
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        int i1;

        if (this.furnaceInventory.isBurning()) {
            i1 = this.furnaceInventory.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 88, l + 32 + 16 - i1, 176, 12 - i1, 14, i1 + 2);
        }

        i1 = this.furnaceInventory.getCookProgressScaled(24);
        this.drawTexturedModalRect(k + 82, l + 17, 176, 14, i1 + 1, 16);
    }
}
