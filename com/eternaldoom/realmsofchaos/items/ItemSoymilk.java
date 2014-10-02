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
    	super("milkSoy");
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
            player.clearActivePotions();
        }

        return stack.stackSize <= 0 ? new ItemStack(Items.bucket) : stack;
    }

    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 48;
    }

    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
        return stack;
    }
}