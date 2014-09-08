package com.eternaldoom.realmsofchaos.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSoymilk extends ROCModItem
{
    public ItemSoymilk()
    {
    	super("realmsofchaos:soymilk", "milkSoy");
        this.setMaxStackSize(1);
    }

    public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --stack.stackSize;
        }

        if (!world.isRemote)
        {
            player.curePotionEffects(new ItemStack(Items.milk_bucket));
        }

        return stack.stackSize <= 0 ? new ItemStack(Items.bucket) : stack;
    }

    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 48;
    }

    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.drink;
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
        return stack;
    }
}