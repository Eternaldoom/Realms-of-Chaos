package com.eternaldoom.realmsofchaos.event;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.items.ROCItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class ArmorBonusEvent {
	public static boolean hasAquatic;
	public static boolean hasFlamestone;
	@SubscribeEvent
	public void tickEvent(PlayerTickEvent evt){
		Item helmet = null, chestplate = null, leggings = null, boots = null;
		ItemStack stackBoots = evt.player.inventory.armorItemInSlot(0);
		ItemStack stackLeggings = evt.player.inventory.armorItemInSlot(1);
		ItemStack stackChestplate = evt.player.inventory.armorItemInSlot(2);
		ItemStack stackHelmet = evt.player.inventory.armorItemInSlot(3);
		
		if(stackHelmet != null) helmet = stackHelmet.getItem();
		if(stackChestplate != null) chestplate = stackChestplate.getItem();
		if(stackLeggings != null) leggings = stackLeggings.getItem();
		if(stackBoots != null) boots = stackBoots.getItem();

		if (helmet == ROCItems.flame_helmet && chestplate == ROCItems.flame_chestplate && leggings == ROCItems.flame_leggings && boots == ROCItems.flame_boots){
			evt.player.addPotionEffect(new PotionEffect(12, 20, 0, true));
			if(evt.player.worldObj.getBlock((int)Math.round(evt.player.posX), MathHelper.floor_double(evt.player.posY), (int)Math.round(evt.player.posZ)).getMaterial() == Material.lava){
				evt.player.capabilities.isFlying = true;
				hasFlamestone = true;
			}else{
				if(!evt.player.capabilities.isCreativeMode){
					evt.player.capabilities.isFlying = false;
					hasFlamestone = false;
				}
			}
	}
		
		if (helmet == ROCItems.aquatic_helmet && chestplate == ROCItems.aquatic_chestplate && leggings == ROCItems.aquatic_leggings && boots == ROCItems.aquatic_boots){
			hasAquatic = true;
			if(evt.player.isInWater()){
				evt.player.capabilities.isFlying = true;
				evt.player.addPotionEffect(new PotionEffect(13, 1, 0, true));
			}else{
				if(!evt.player.capabilities.isCreativeMode){
					evt.player.capabilities.isFlying = false;
				}
			}
		}else{
			hasAquatic = false;
		}
		
		if (helmet == ROCItems.fractonite_helmet && chestplate == ROCItems.fractonite_chestplate && leggings == ROCItems.fractonite_leggings && boots == ROCItems.fractonite_boots && KeyPress.getFreeze()){
			World w = evt.player.worldObj;
			int x = (int)Math.round(evt.player.posX);
			int y = MathHelper.floor_double(evt.player.posY);
			int z = (int)Math.round(evt.player.posZ);
			
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
	}
	
	public static boolean getAquatic(){
		return hasAquatic;
	}
	
	public static boolean getFlamestone(){
		return hasFlamestone;
	}
}
