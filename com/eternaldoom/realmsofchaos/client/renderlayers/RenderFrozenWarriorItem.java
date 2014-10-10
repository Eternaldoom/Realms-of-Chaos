package com.eternaldoom.realmsofchaos.client.renderlayers;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import com.eternaldoom.realmsofchaos.client.entityrenderer.ModelFrozenWarrior;

public class RenderFrozenWarriorItem implements LayerRenderer
{
    private final RendererLivingEntity entityRenderer;

    public RenderFrozenWarriorItem(RendererLivingEntity p_i46115_1_)
    {
        this.entityRenderer = p_i46115_1_;
    }

    public void doRenderLayer(EntityLivingBase p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
    {
        ItemStack itemstack = p_177141_1_.getHeldItem();

        if (itemstack != null)
        {
            GlStateManager.pushMatrix();

            ((ModelFrozenWarrior)this.entityRenderer.getMainModel()).postRenderHiddenRightArm(0.0625F);
            GlStateManager.translate(-0.0625F, 0.4375F, 0.0625F);
            GlStateManager.rotate(-22, 1, 0, 0);

            if (p_177141_1_ instanceof EntityPlayer && ((EntityPlayer)p_177141_1_).fishEntity != null)
            {
                itemstack = new ItemStack(Items.fishing_rod, 0);
            }

            Item item = itemstack.getItem();
            Minecraft minecraft = Minecraft.getMinecraft();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item).getRenderType() == 2)
            {
                GlStateManager.translate(0.0F, 0.1875F, -0.3125F);
                GlStateManager.rotate(20.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(45.0F, 0.0F, 1.0F, 0.0F);
                float f8 = 0.375F;
                GlStateManager.scale(-f8, -f8, f8);
            }

            minecraft.getItemRenderer().renderItem(p_177141_1_, itemstack, ItemCameraTransforms.TransformType.THIRD_PERSON);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();

            ((ModelFrozenWarrior)this.entityRenderer.getMainModel()).postRenderHiddenLeftArm(0.0625F);
            GlStateManager.translate(0.0625F, 0.4375F, 0.0625F);
            GlStateManager.rotate(-22, 1, 0, 0);

            if (p_177141_1_ instanceof EntityPlayer && ((EntityPlayer)p_177141_1_).fishEntity != null)
            {
                itemstack = new ItemStack(Items.fishing_rod, 0);
            }

            if (item instanceof ItemBlock && Block.getBlockFromItem(item).getRenderType() == 2)
            {
                GlStateManager.translate(0.0F, 0.1875F, -0.3125F);
                GlStateManager.rotate(20.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(45.0F, 0.0F, 1.0F, 0.0F);
                float f8 = 0.375F;
                GlStateManager.scale(-f8, -f8, f8);
            }

            minecraft.getItemRenderer().renderItem(p_177141_1_, itemstack, ItemCameraTransforms.TransformType.THIRD_PERSON);
            GlStateManager.popMatrix();
        }
    }

    public boolean shouldCombineTextures()
    {
        return false;
    }
}