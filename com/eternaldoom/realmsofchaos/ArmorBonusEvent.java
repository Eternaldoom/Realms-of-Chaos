package com.eternaldoom.realmsofchaos;

import com.eternaldoom.realmsofchaos.overworld.items.ItemROCArmor;
import com.eternaldoom.realmsofchaos.overworld.items.ROCOverworldItems;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class ArmorBonusEvent {
	
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
		
		if (helmet == ROCOverworldItems.flame_helmet && chestplate == ROCOverworldItems.flame_chestplate && leggings == ROCOverworldItems.flame_leggings && boots == ROCOverworldItems.flame_boots){
			evt.player.addPotionEffect(new PotionEffect(12, 20, 0, true));
			if (evt.player.worldObj.getBlock((int)evt.player.posX, (int)evt.player.posY - 1, (int)evt.player.posZ) == Blocks.lava){
				if (evt.player.motionX < 0.2f && evt.player.motionX > -0.2f){
					evt.player.motionX *= 1.5f;
				}
				
				if (evt.player.motionZ < 0.2f && evt.player.motionZ > -0.2f){
					evt.player.motionZ *= 1.5f;
				}
			}
		}
	}

}
