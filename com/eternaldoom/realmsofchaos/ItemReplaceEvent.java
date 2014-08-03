package com.eternaldoom.realmsofchaos;

import com.eternaldoom.realmsofchaos.overworld.items.ROCItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class ItemReplaceEvent {
	
	@SubscribeEvent
	public void onTickEvent(PlayerTickEvent evt){
		for (int i = 0; i < 35; i++){
			if (evt.player.inventory.getStackInSlot(i) != null){
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.diamond_sword){
					evt.player.inventory.consumeInventoryItem(Items.diamond_sword);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.diamond_sword));
				}
					
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.iron_sword){
					evt.player.inventory.consumeInventoryItem(Items.iron_sword);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.iron_sword));
				}
				
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.diamond_axe){
					evt.player.inventory.consumeInventoryItem(Items.diamond_axe);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.diamond_axe));
				}
					
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.iron_axe){
					evt.player.inventory.consumeInventoryItem(Items.iron_axe);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.iron_axe));
				}
				
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.diamond_pickaxe){
					evt.player.inventory.consumeInventoryItem(Items.diamond_pickaxe);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.diamond_pickaxe));
				}
					
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.iron_pickaxe){
					evt.player.inventory.consumeInventoryItem(Items.iron_pickaxe);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.iron_pickaxe));
				}
				
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.diamond_shovel){
					evt.player.inventory.consumeInventoryItem(Items.diamond_shovel);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.diamond_shovel));
				}
					
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.iron_shovel){
					evt.player.inventory.consumeInventoryItem(Items.iron_shovel);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.iron_shovel));
				}
				
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.iron_helmet){
					evt.player.inventory.consumeInventoryItem(Items.iron_helmet);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.iron_helmet));
				}
				
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.iron_chestplate){
					evt.player.inventory.consumeInventoryItem(Items.iron_chestplate);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.iron_chestplate));
				}
				
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.iron_leggings){
					evt.player.inventory.consumeInventoryItem(Items.iron_leggings);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.iron_leggings));
				}
				
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.iron_boots){
					evt.player.inventory.consumeInventoryItem(Items.iron_boots);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.iron_boots));
				}
				
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.diamond_helmet){
					evt.player.inventory.consumeInventoryItem(Items.diamond_helmet);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.diamond_helmet));
				}
				
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.diamond_chestplate){
					evt.player.inventory.consumeInventoryItem(Items.diamond_chestplate);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.diamond_chestplate));
				}
				
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.diamond_leggings){
					evt.player.inventory.consumeInventoryItem(Items.diamond_leggings);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.diamond_leggings));
				}
				
				if(evt.player.inventory.getStackInSlot(i).getItem() == Items.diamond_boots){
					evt.player.inventory.consumeInventoryItem(Items.diamond_boots);
					evt.player.inventory.setInventorySlotContents(i, new ItemStack(ROCItems.diamond_boots));
				}
				
				if(evt.player.inventory.getStackInSlot(i).getItem() == ROCItems.scorpion_stone_active){
					if(!evt.player.capabilities.isCreativeMode) evt.player.inventory.getStackInSlot(i).setItemDamage(evt.player.inventory.getStackInSlot(i).getItemDamage() + 1);
					evt.player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3, true));
					evt.player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 3, true));
					if(evt.player.inventory.getStackInSlot(i).getItemDamage() > 160) evt.player.inventory.setInventorySlotContents(i, null);
				}
			}	
		}
	}
}
