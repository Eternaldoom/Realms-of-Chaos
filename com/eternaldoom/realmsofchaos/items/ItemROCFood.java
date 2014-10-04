package com.eternaldoom.realmsofchaos.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.eternaldoom.realmsofchaos.ROCTabs;

public class ItemROCFood extends ItemFood{

	public ItemROCFood(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_, String tex, String name) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        setCreativeTab(ROCTabs.Items);
        setUnlocalizedName(name);
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World world, EntityPlayer player)
    {
        super.onItemUseFinish(stack, world, player);
        if(this == ROCItems.miso_soup) return new ItemStack(Items.bowl);
        return stack;
    }
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack)
    {
		if(this == ROCItems.miso_soup) return EnumAction.DRINK;
        return EnumAction.EAT;
    }
	
	public ItemROCFood register(String name){
		GameRegistry.registerItem(this, name);
		ROCItems.itemNames.add(name);
		return this;
	}
}
