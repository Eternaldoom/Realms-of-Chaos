package com.eternaldoom.realmsofchaos.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.entity.EntityScorpius;

public class ItemScorpiusCrystal extends ROCModItem{

	public ItemScorpiusCrystal() {
		super("realmsofchaos:scorpius_crystal", "crystalScorpius");
		setMaxStackSize(1);
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int i, int j, int k, int side, float par8, float par9, float par10){
		if(!world.isRemote && player.canPlayerEdit(i, j, k, side, stack) && side == 1){
			EntityScorpius boss = new EntityScorpius(world);
			boss.setPosition(i, j+1, k);
			world.spawnEntityInWorld(boss);
			--stack.stackSize;
			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentTranslation(EnumChatFormatting.AQUA + player.getDisplayName() + " has spawned Scorpius"));
			return true;
		}
		return false;
	}

}
