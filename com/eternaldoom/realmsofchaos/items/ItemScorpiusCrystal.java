package com.eternaldoom.realmsofchaos.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.entity.EntityScorpius;

public class ItemScorpiusCrystal extends ROCModItem{

	public ItemScorpiusCrystal() {
		super("crystalScorpius");
		setMaxStackSize(1);
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float par8, float par9, float par10){
		if(!world.isRemote && player.func_175151_a(pos, side, stack) && side == EnumFacing.UP){
			EntityScorpius boss = new EntityScorpius(world);
			boss.setPosition(pos.getX(), pos.getY()+1, pos.getZ());
			world.spawnEntityInWorld(boss);
			--stack.stackSize;
			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentTranslation("spawnmsg.scorpius", new Object[]{player.getDisplayName()}));
			return true;
		}
		return false;
	}

}
