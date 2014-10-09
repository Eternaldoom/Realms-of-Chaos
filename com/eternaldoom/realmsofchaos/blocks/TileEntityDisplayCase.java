package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityDisplayCase extends TileEntity{
	
	public Item displayItem;
	public int displayDamage;
	
	
	@Override
	public void writeToNBT(NBTTagCompound tag){
		super.writeToNBT(tag);
		tag.setString("DisplayItem", this.displayItem != null ? ((ResourceLocation)Item.itemRegistry.getNameForObject(this.displayItem)).toString(): "");
		tag.setInteger("DisplayDamage", this.displayDamage);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag){
		super.readFromNBT(tag);
		String itemName = tag.getString("DisplayItem");
		this.displayItem = itemName != "" ? Item.getByNameOrId(itemName) : null;
		System.out.println(this.displayItem.getUnlocalizedName());
		this.displayDamage = tag.getInteger("DisplayDamage");
	}

}
