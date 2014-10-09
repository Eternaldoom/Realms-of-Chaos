package com.eternaldoom.realmsofchaos.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import com.eternaldoom.realmsofchaos.blocks.TileEntityDisplayCase;

public class PacketDisplayCaseItem implements IMessage{
	
	private String itemName;
	private int itemDamage;
	private int xPos, yPos, zPos;
		
	public PacketDisplayCaseItem(String text, int damage, BlockPos pos){
		this.itemName = text;
		this.itemDamage = damage;
		this.xPos = pos.getX();
		this.yPos = pos.getY();
		this.zPos = pos.getZ();
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.itemName = ByteBufUtils.readUTF8String(buf);
		this.itemDamage = buf.getInt(0);
		this.xPos = buf.getInt(1);
		this.yPos = buf.getInt(2);
		this.zPos = buf.getInt(3);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeUTF8String(buf, this.itemName);
		buf.setInt(0, itemDamage);
		buf.setInt(1, xPos);
		buf.setInt(3, yPos);
		buf.setInt(2, zPos);
	}
	
	public static class Handler implements IMessageHandler<PacketDisplayCaseItem, IMessage>{

		@Override
		public IMessage onMessage(PacketDisplayCaseItem message, MessageContext ctx) {
			System.out.println("HELLO");
			TileEntityDisplayCase tile = (TileEntityDisplayCase)Minecraft.getMinecraft().theWorld.getTileEntity(new BlockPos(message.xPos, message.yPos, message.zPos));
			if(tile != null){
				tile.displayDamage = message.itemDamage;
				tile.displayItem = Item.getByNameOrId(message.itemName);
			}
			return null;
		}
		
	}
}