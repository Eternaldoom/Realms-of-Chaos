package com.eternaldoom.realmsofchaos.items;

import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.ROCTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemCannon extends ROCModItem {

	private Class<? extends EntityThrowable> ammoEntity;
	private Item ammoItem;
	public float damage;

	public ItemCannon(String tex, String name, int uses, Item ammo,
			Class<? extends EntityThrowable> ammoEntity, float damage) {
		super(tex, name);
		this.maxStackSize = 1;
		this.setMaxDamage(uses);
		this.ammoEntity = ammoEntity;
		this.ammoItem = ammo;
		this.damage = damage;
		setCreativeTab(ROCTabs.Combat);
	}

	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		// world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F /
		// (itemRand.nextFloat() * 0.4F + 0.8F));

		if (!world.isRemote) {
			if(player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(ammoItem))
		    {
				stack.damageItem(1, player);
				
				try {
					world.spawnEntityInWorld(ammoEntity.getConstructor(World.class,
						EntityLivingBase.class).newInstance(world, player));
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
		}

			return stack;
	}
	
	public ItemCannon register(String name){
		GameRegistry.registerItem(this, name);
		return this;
	}
	
	@Override
	public boolean isFull3D(){
		return true;
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4){
		if(this.getMaxDamage() == -1) list.add(EnumChatFormatting.BLUE + "Infinite Uses");
		else list.add(EnumChatFormatting.GREEN + "" + (stack.getMaxDamage() - stack.getItemDamage()) + " Uses Remaining");
		list.add(EnumChatFormatting.RED + "" + this.damage + " Ranged Damage");
	}
}