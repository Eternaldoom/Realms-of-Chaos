package com.eternaldoom.realmsofchaos.event;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;
import com.eternaldoom.realmsofchaos.items.ROCItems;
import com.eternaldoom.realmsofchaos.network.PacketArmorFreeze;

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
			evt.player.addPotionEffect(new PotionEffect(12, 20, 0, true, false));
			if(evt.player.worldObj.getBlockState(new BlockPos((int)Math.round(evt.player.posX), MathHelper.floor_double(evt.player.posY), (int)Math.round(evt.player.posZ))).getBlock().getMaterial() == Material.lava){
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
				evt.player.addPotionEffect(new PotionEffect(13, 1, 0, true, false));
			}else{
				if(!evt.player.capabilities.isCreativeMode){
					evt.player.capabilities.isFlying = false;
				}
			}
		}else{
			hasAquatic = false;
		}
		
		if (helmet == ROCItems.fractonite_helmet && chestplate == ROCItems.fractonite_chestplate && leggings == ROCItems.fractonite_leggings && boots == ROCItems.fractonite_boots && KeyPress.getFreeze()){
			RealmsOfChaos.network.sendToServer(new PacketArmorFreeze("LOLZ"));
		}
	}
	
	public static boolean getAquatic(){
		return hasAquatic;
	}
	
	public static boolean getFlamestone(){
		return hasFlamestone;
	}
}
