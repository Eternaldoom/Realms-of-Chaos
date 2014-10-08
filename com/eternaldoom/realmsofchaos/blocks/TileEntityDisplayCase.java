package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityDisplayCase extends TileEntity{
	
	public Item displayItem = Item.getItemFromBlock(Blocks.air);
	public int displayDamage = 0;
	
	
	@Override
	public void writeToNBT(NBTTagCompound tag){
		super.writeToNBT(tag);
		tag.setString("DisplayItem", ((ResourceLocation)Item.itemRegistry.getNameForObject(this.displayItem)).toString());
		tag.setInteger("DisplayDamage", this.displayDamage);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag){
		super.readFromNBT(tag);
		String itemName = tag.getString("DisplayItem");
		this.displayItem = Item.getByNameOrId(itemName);
		this.displayDamage = tag.getInteger("DisplayDamage");
	}

}
