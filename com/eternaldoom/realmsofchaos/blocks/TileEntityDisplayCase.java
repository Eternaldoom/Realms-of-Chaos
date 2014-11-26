package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityDisplayCase extends TileEntity{
	
	public ItemStack displayItem;
	
	
	@Override
	public void writeToNBT(NBTTagCompound tag){
		super.writeToNBT(tag);
		tag.setTag("DisplayItem", this.displayItem != null ? this.displayItem.writeToNBT(new NBTTagCompound()) : new ItemStack(Blocks.air).writeToNBT(new NBTTagCompound()));
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag){
		super.readFromNBT(tag);
		NBTTagCompound itemTag = tag.getCompoundTag("DisplayItem");
		if(itemTag != null && !itemTag.hasNoTags()){
			this.displayItem = ItemStack.loadItemStackFromNBT(itemTag);
			if(this.displayItem != null)this.displayItem.stackSize = 1;
		}

	}
	
	@Override
	public Packet getDescriptionPacket(){
		NBTTagCompound tag = new NBTTagCompound();
		this.writeToNBT(tag);
		return new S35PacketUpdateTileEntity(this.getPos(), 3, tag);
	}
	
	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet) {
		this.readFromNBT(packet.getNbtCompound());
    }
}
