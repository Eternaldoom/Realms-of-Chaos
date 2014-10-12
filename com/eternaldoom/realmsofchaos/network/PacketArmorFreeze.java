package com.eternaldoom.realmsofchaos.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.items.ROCItems;

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
			
			BlockPos bp = new BlockPos(0, 0, 0);
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
				if(getBlock(w, x, y-1, z, bp) == Blocks.water) setBlock(w, x, y-1, z, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x+1, y-1, z, bp) == Blocks.water) setBlock(w, x+1, y-1, z, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x, y-1, z+1, bp) == Blocks.water) setBlock(w, x, y-1, z+1, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x+1, y-1, z+1, bp) == Blocks.water) setBlock(w, x+1, y-1, z+1, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x-1, y-1, z, bp) == Blocks.water) setBlock(w, x-1, y-1, z, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x, y-1, z-1, bp) == Blocks.water) setBlock(w, x, y-1, z-1, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x-1, y-1, z-1, bp) == Blocks.water) setBlock(w, x-1, y-1, z-1, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x+1, y-1, z-1, bp) == Blocks.water) setBlock(w, x+1, y-1, z-1, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x-1, y-1, z+1, bp) == Blocks.water) setBlock(w, x-1, y-1, z+1, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x, y, z, bp) == Blocks.water) setBlock(w, x, y, z, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x+1, y, z, bp) == Blocks.water) setBlock(w, x+1, y, z, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x, y, z+1, bp) == Blocks.water) setBlock(w, x, y, z+1, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x+1, y, z+1, bp) == Blocks.water) setBlock(w, x+1, y, z+1, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x-1, y, z, bp) == Blocks.water) setBlock(w, x-1, y, z, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x, y, z-1, bp) == Blocks.water) setBlock(w, x, y, z-1, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x-1, y, z-1, bp) == Blocks.water) setBlock(w, x-1, y, z-1, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x+1, y, z-1, bp) == Blocks.water) setBlock(w, x+1, y, z-1, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x-1, y, z+1, bp) == Blocks.water) setBlock(w, x-1, y, z+1, bp, ROCBlocks.fake_ice);
				if(getBlock(w, x, y-1, z, bp) == Blocks.lava) setBlock(w, x, y-1, z, bp, Blocks.stone);
				if(getBlock(w, x+1, y-1, z, bp) == Blocks.lava) setBlock(w, x+1, y-1, z, bp, Blocks.stone);
				if(getBlock(w, x, y-1, z+1, bp) == Blocks.lava) setBlock(w, x, y-1, z+1, bp, Blocks.stone);
				if(getBlock(w, x+1, y-1, z+1, bp) == Blocks.lava) setBlock(w, x+1, y-1, z+1, bp, Blocks.stone);
				if(getBlock(w, x-1, y-1, z, bp) == Blocks.lava) setBlock(w, x-1, y-1, z, bp, Blocks.stone);
				if(getBlock(w, x, y-1, z-1, bp) == Blocks.lava) setBlock(w, x, y-1, z-1, bp, Blocks.stone);
				if(getBlock(w, x-1, y-1, z-1, bp) == Blocks.lava) setBlock(w, x-1, y-1, z-1, bp, Blocks.stone);
				if(getBlock(w, x+1, y-1, z-1, bp) == Blocks.lava) setBlock(w, x+1, y-1, z-1, bp, Blocks.stone);
				if(getBlock(w, x-1, y-1, z+1, bp) == Blocks.lava) setBlock(w, x-1, y-1, z+1, bp, Blocks.stone);
				if(getBlock(w, x, y, z, bp) == Blocks.lava) setBlock(w, x, y, z, bp, Blocks.stone);
				if(getBlock(w, x+1, y, z, bp) == Blocks.lava) setBlock(w, x+1, y, z, bp, Blocks.stone);
				if(getBlock(w, x, y, z+1, bp) == Blocks.lava) setBlock(w, x, y, z+1, bp, Blocks.stone);
				if(getBlock(w, x+1, y, z+1, bp) == Blocks.lava) setBlock(w, x+1, y, z+1, bp, Blocks.stone);
				if(getBlock(w, x-1, y, z, bp) == Blocks.lava) setBlock(w, x-1, y, z, bp, Blocks.stone);
				if(getBlock(w, x, y, z-1, bp) == Blocks.lava) setBlock(w, x, y, z-1, bp, Blocks.stone);
				if(getBlock(w, x-1, y, z-1, bp) == Blocks.lava) setBlock(w, x-1, y, z-1, bp, Blocks.stone);
				if(getBlock(w, x+1, y, z-1, bp) == Blocks.lava) setBlock(w, x+1, y, z-1, bp, Blocks.stone);
				if(getBlock(w, x-1, y, z+1, bp) == Blocks.lava) setBlock(w, x-1, y, z+1, bp, Blocks.stone);
			}
			return null;
		}
		
	}
	
	private static Block getBlock(World w, int x, int y, int z, BlockPos pos){
		return w.getBlockState(pos.add(x-pos.getX(), y-pos.getY(), z-pos.getZ())).getBlock();
	}
	
	private static void setBlock(World w, int x, int y, int z, BlockPos pos, Block b){
		w.setBlockState(pos.add(pos.getX()+x, pos.getY()+y, pos.getX()+z), b.getDefaultState());
	}

}
