package com.eternaldoom.realmsofchaos.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.items.ROCItems;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketArmorFreeze implements IMessage{
	
	private String text;
	
	public PacketArmorFreeze(){}
	
	public PacketArmorFreeze(String text){
		this.text = text;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		text = ByteBufUtils.readUTF8String(buf);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeUTF8String(buf, text);
	}
	
	public static class Handler implements IMessageHandler<PacketArmorFreeze, IMessage>{

		@Override
		public IMessage onMessage(PacketArmorFreeze message, MessageContext ctx) {
			
			World w = ctx.getServerHandler().playerEntity.worldObj;
			int x = (int)Math.round(ctx.getServerHandler().playerEntity.posX);
			int y = MathHelper.floor_double(ctx.getServerHandler().playerEntity.posY);
			int z = (int)Math.round(ctx.getServerHandler().playerEntity.posZ);
			Item helmet = null, chestplate = null, leggings = null, boots = null;
			ItemStack stackBoots = ctx.getServerHandler().playerEntity.inventory.armorItemInSlot(0);
			ItemStack stackLeggings = ctx.getServerHandler().playerEntity.inventory.armorItemInSlot(1);
			ItemStack stackChestplate = ctx.getServerHandler().playerEntity.inventory.armorItemInSlot(2);
			ItemStack stackHelmet = ctx.getServerHandler().playerEntity.inventory.armorItemInSlot(3);
			
			if(stackHelmet != null) helmet = stackHelmet.getItem();
			if(stackChestplate != null) chestplate = stackChestplate.getItem();
			if(stackLeggings != null) leggings = stackLeggings.getItem();
			if(stackBoots != null) boots = stackBoots.getItem();
			
			if (helmet == ROCItems.fractonite_helmet && chestplate == ROCItems.fractonite_chestplate && leggings == ROCItems.fractonite_leggings && boots == ROCItems.fractonite_boots){
				if(w.getBlock(x, y-1, z) == Blocks.water) w.setBlock(x, y-1, z, Blocks.ice);
				if(w.getBlock(x+1, y-1, z) == Blocks.water) w.setBlock(x+1, y-1, z, Blocks.ice);
				if(w.getBlock(x, y-1, z+1) == Blocks.water) w.setBlock(x, y-1, z+1, Blocks.ice);
				if(w.getBlock(x+1, y-1, z+1) == Blocks.water) w.setBlock(x+1, y-1, z+1, Blocks.ice);
				if(w.getBlock(x-1, y-1, z) == Blocks.water) w.setBlock(x-1, y-1, z, Blocks.ice);
				if(w.getBlock(x, y-1, z-1) == Blocks.water) w.setBlock(x, y-1, z-1, Blocks.ice);
				if(w.getBlock(x-1, y-1, z-1) == Blocks.water) w.setBlock(x-1, y-1, z-1, Blocks.ice);
				if(w.getBlock(x+1, y-1, z-1) == Blocks.water) w.setBlock(x+1, y-1, z-1, Blocks.ice);
				if(w.getBlock(x-1, y-1, z+1) == Blocks.water) w.setBlock(x-1, y-1, z+1, Blocks.ice);
			}
			return null;
		}
		
	}

}
