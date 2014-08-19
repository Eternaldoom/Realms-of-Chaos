package com.eternaldoom.realmsofchaos.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.ROCTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemCannon extends ROCModItem {

	private Class<? extends EntityThrowable> ammoEntity;
	private Item ammoItem;

	public ItemCannon(String tex, String name, int uses, Item ammo,
			Class<? extends EntityThrowable> ammoEntity) {
		super(tex, name);
		this.maxStackSize = 1;
		this.setMaxDamage(uses);
		this.ammoEntity = ammoEntity;
		this.ammoItem = ammo;
		setCreativeTab(ROCTabs.Combat);
	}

	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		// world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F /
		// (itemRand.nextFloat() * 0.4F + 0.8F));

		stack.damageItem(1, player);

		if (!world.isRemote) {
			if(player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(ammoItem))
		    {
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
}