package com.eternaldoom.realmsofchaos.client.blockrenderers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureCompass;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSkull;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.MapData;

import com.eternaldoom.realmsofchaos.blocks.BlockDisplayCase;
import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.blocks.TileEntityDisplayCase;

public class DisplayCaseItemRenderer extends TileEntitySpecialRenderer
{
    private static final ResourceLocation mapBackgroundTextures = new ResourceLocation("textures/map/map_background.png");
    private final Minecraft mc = Minecraft.getMinecraft();
    private RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    private ModelDisplayCaseGlass glass = new ModelDisplayCaseGlass();

    @Override
    public void renderTileEntityAt(TileEntity tile, double par2, double par3, double par4, float p_180535_8_, int p_180535_9_){
        GlStateManager.pushMatrix();
        BlockPos pos = tile.getPos();
        double d3 = par2;
        double d4 = par3;
        double d5 = par4;
        GlStateManager.translate(d3 + 0.5D, d4 + 0.5D, d5 + 0.5D);
        GlStateManager.rotate(90.0F, 1F, 0.0F, 0.0F);
        Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(TextureMap.locationBlocksTexture);
        BlockRendererDispatcher blockrendererdispatcher = this.mc.getBlockRendererDispatcher();
        ModelManager modelmanager = blockrendererdispatcher.func_175023_a().func_178126_b();

        GlStateManager.pushMatrix();
        GlStateManager.translate(-0.5F, -0.5F, -0.5F);
        GlStateManager.popMatrix();
        GlStateManager.translate(0.0F, 0.0F, 0.4375F);
        this.renderItem((TileEntityDisplayCase)tile);
        GlStateManager.popMatrix();
        //Now do the glass
        GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.translate((float)par2, (float)par3 + 1.0F, (float)par4 + 1.0F);
        this.bindTexture(new ResourceLocation("realmsofchaos:textures/blocks/display_case_glass.png"));
        GlStateManager.translate(0.5, 0.5, -0.5);
        if(tile.getWorld().getBlockState(pos).getBlock() == ROCBlocks.display_case){
        if(tile.getWorld().getBlockState(pos).getValue(BlockDisplayCase.FACING) == EnumFacing.SOUTH){
        	GlStateManager.rotate(11.25f, 1, 0, 0);
        	GlStateManager.translate(0, -0.1, 0.1);
        }
        if(tile.getWorld().getBlockState(pos).getValue(BlockDisplayCase.FACING) == EnumFacing.WEST){
        	GlStateManager.rotate(11.25f, 0, 0, 1);
        	GlStateManager.translate(-0.1, -0.1, 0);
        }
        if(tile.getWorld().getBlockState(pos).getValue(BlockDisplayCase.FACING) == EnumFacing.EAST){
        	GlStateManager.rotate(-11.25f, 0, 0, 1);
        	GlStateManager.translate(0.1, -0.1, 0);
        }
        if(tile.getWorld().getBlockState(pos).getValue(BlockDisplayCase.FACING) == EnumFacing.NORTH){
        	GlStateManager.rotate(-11.25f, 1, 0, 0);
        	GlStateManager.translate(0, -0.1, -0.1);
        }
        }
        
        GlStateManager.translate(-0.5, -0.5, 0.5);

        glass.render();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
    }

    private void renderItem(TileEntityDisplayCase tile)
    {
    	BlockPos pos = tile.getPos();
        ItemStack itemstack = new ItemStack(tile.displayItem, 1, tile.displayDamage);

        if (itemstack != null)
        {
            EntityItem entityitem = new EntityItem(tile.getWorld(), 0.0D, 0.0D, 0.0D, itemstack);
            Item item = entityitem.getEntityItem().getItem();
            entityitem.getEntityItem().stackSize = 1;
            entityitem.hoverStart = 0.0F;
            GlStateManager.pushMatrix();
            GlStateManager.disableLighting();

            GlStateManager.rotate(360.0F / 8.0F, 0.0F, 0.0F, 1.0F);

            if (item == Items.filled_map)
            {
                Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(mapBackgroundTextures);
                GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
                float f = 0.0078125F;
                GlStateManager.scale(f, f, f);
                GlStateManager.translate(-64.0F, -64.0F, 0.0F);
                MapData mapdata = Items.filled_map.getMapData(entityitem.getEntityItem(), tile.getWorld());
                GlStateManager.translate(0.0F, 0.0F, -1.0F);

                if (mapdata != null)
                {
                    this.mc.entityRenderer.getMapItemRenderer().func_148250_a(mapdata, true);
                }
            }
            else
            {
                TextureAtlasSprite textureatlassprite = null;

                if (item == Items.compass)
                {
                    textureatlassprite = this.mc.getTextureMapBlocks().getAtlasSprite(TextureCompass.field_176608_l);
                    this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);

                    if (textureatlassprite instanceof TextureCompass)
                    {
                        TextureCompass texturecompass = (TextureCompass)textureatlassprite;
                        double d0 = texturecompass.currentAngle;
                        double d1 = texturecompass.angleDelta;
                        texturecompass.currentAngle = 0.0D;
                        texturecompass.angleDelta = 0.0D;
                        texturecompass.updateCompass(tile.getWorld(), tile.getPos().getX(), tile.getPos().getZ(), (double)MathHelper.wrapAngleTo180_float((float)(180 + 90)), false, true);
                        texturecompass.currentAngle = d0;
                        texturecompass.angleDelta = d1;
                    }
                    else
                    {
                        textureatlassprite = null;
                    }
                }

                GlStateManager.scale(0.5F, 0.5F, 0.5F);

                if (!this.renderItem.func_175050_a(entityitem.getEntityItem()) || item instanceof ItemSkull)
                {
                    GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
                }

                GlStateManager.pushAttrib();
                RenderHelper.enableStandardItemLighting();
                GlStateManager.translate(0, 0, 1.28);
                GlStateManager.rotate(-45f, 0f, 0f, 1f);
                if(tile.getWorld().getBlockState(pos).getBlock() == ROCBlocks.display_case){
                	if(tile.getWorld().getBlockState(pos).getValue(BlockDisplayCase.FACING) == EnumFacing.SOUTH){
                		GlStateManager.rotate(270f, 0, 0, 1);
                	}
                	if(tile.getWorld().getBlockState(pos).getValue(BlockDisplayCase.FACING) == EnumFacing.WEST){
                		GlStateManager.rotate(180f, 0, 0, 1);
                	}
                	if(tile.getWorld().getBlockState(pos).getValue(BlockDisplayCase.FACING) == EnumFacing.NORTH){
                		GlStateManager.rotate(90f, 0, 0, 1);
                	}
                }
                if(tile.displayItem instanceof ItemBlock){
                	GlStateManager.translate(0, 0, -2.5);
                	GlStateManager.rotate(270, 1, 0, 0);
                }
                if(tile.displayItem != null)this.renderItem.func_175043_b(entityitem.getEntityItem());
                RenderHelper.disableStandardItemLighting();
                GlStateManager.popAttrib();

                if (textureatlassprite != null && textureatlassprite.getFrameCount() > 0)
                {
                    textureatlassprite.updateAnimation();
                }
            }

            GlStateManager.enableLighting();
            GlStateManager.popMatrix();
        }
    }
}