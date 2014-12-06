package com.eternaldoom.realmsofchaos.event;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

import com.eternaldoom.realmsofchaos.items.ROCItems;

public class ItemReplaceEvent {
	
	protected static Map<Item, Item> toReplace = new HashMap<Item, Item>();
	
	static{
		toReplace.put(Items.iron_sword, ROCItems.iron_sword);
		toReplace.put(Items.diamond_sword, ROCItems.diamond_sword);
		toReplace.put(Items.iron_axe, ROCItems.iron_axe);
		toReplace.put(Items.diamond_axe, ROCItems.diamond_axe);
		toReplace.put(Items.iron_pickaxe, ROCItems.iron_pickaxe);
		toReplace.put(Items.diamond_pickaxe, ROCItems.diamond_pickaxe);
		toReplace.put(Items.iron_shovel, ROCItems.iron_shovel);
		toReplace.put(Items.diamond_shovel, ROCItems.diamond_shovel);
		toReplace.put(Items.iron_helmet, ROCItems.iron_helmet);
		toReplace.put(Items.iron_chestplate, ROCItems.iron_chestplate);
		toReplace.put(Items.iron_leggings, ROCItems.iron_leggings);
		toReplace.put(Items.iron_boots, ROCItems.iron_boots);
		toReplace.put(Items.diamond_helmet, ROCItems.diamond_helmet);
		toReplace.put(Items.diamond_chestplate, ROCItems.diamond_chestplate);
		toReplace.put(Items.diamond_leggings, ROCItems.diamond_leggings);
		toReplace.put(Items.diamond_boots, ROCItems.diamond_boots);
	}
	
	@SubscribeEvent
	public void onTickEvent(PlayerTickEvent evt){
		for (int i = 0; i < 35; i++){
			if (evt.player.inventory.getStackInSlot(i) != null){
				
				if(toReplace.containsKey(evt.player.inventory.getStackInSlot(i).getItem())){
					Item item = toReplace.get(evt.player.inventory.getStackInSlot(i).getItem());
					ItemStack newStack = evt.player.inventory.getStackInSlot(i).copy();
					newStack.setItem(item);
					evt.player.inventory.setInventorySlotContents(i, newStack);
				}
				
				if(evt.player.inventory.getStackInSlot(i).getItem() == ROCItems.scorpion_stone_active){
					if(!evt.player.capabilities.isCreativeMode) evt.player.inventory.getStackInSlot(i).setItemDamage(evt.player.inventory.getStackInSlot(i).getItemDamage() + 1);
					evt.player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3, true, false));
					evt.player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 3, true, false));
					if(evt.player.inventory.getStackInSlot(i).getItemDamage() > 160) evt.player.inventory.setInventorySlotContents(i, null);
				}
			}	
		}
	}
}
