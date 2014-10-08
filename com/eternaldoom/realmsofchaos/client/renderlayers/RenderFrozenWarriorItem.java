package com.eternaldoom.realmsofchaos.client.renderlayers;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
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

public class RenderFrozenWarriorItem implements LayerRenderer
{
    private final RendererLivingEntity entityRenderer;

    public RenderFrozenWarriorItem(RendererLivingEntity p_i46115_1_)
    {
        this.entityRenderer = p_i46115_1_;
    }

    @Override
    public void doRenderLayer(EntityLivingBase entity, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
    {
        ItemStack itemstack = entity.getHeldItem();

        if (itemstack != null)
        {
            GlStateManager.pushMatrix();

            ((ModelBiped)this.entityRenderer.getMainModel()).postRenderHiddenArm(0.0625F);//TODO: change the model
            GlStateManager.translate(-0.0625F, 0.4375F, 0.0625F);

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

            minecraft.getItemRenderer().renderItem(entity, itemstack, ItemCameraTransforms.TransformType.THIRD_PERSON);
            GlStateManager.popMatrix();
        }
    }

    public boolean shouldCombineTextures()
    {
        return false;
    }
}