package com.eternaldoom.realmsofchaos.items;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.eternaldoom.realmsofchaos.ROCTabs;

public class ItemROCArmor extends ItemArmor/* implements ISpecialArmor */{

	public String texture;
	public boolean vanilla;
	private ArmorMaterial a;
	private double damageReduction;

	public ItemROCArmor(ArmorMaterial par1armorMaterial, int piece,
			String type, String name, double fullReduction) {
		super(par1armorMaterial, 3, piece);
		setUnlocalizedName(name);
		if (par1armorMaterial == ROCItems.IRONa || par1armorMaterial == ROCItems.DIAMONDa){
			setCreativeTab(null);
			vanilla = true;
		}else{setCreativeTab(null); vanilla = false;}

		texture = type;
		a = par1armorMaterial;

		damageReduction = fullReduction / 4;
	}

	/*@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (!vanilla) {
			if (slot == 2) {
				return "realmsofchaos:textures/armor/" + this.texture
						+ "_2.png";
			} else {
				return "realmsofchaos:textures/armor/" + this.texture
						+ "_1.png";
			}
		} else {
			if (slot == 2) {
				return "minecraft:textures/models/armor/" + this.texture
						+ "_layer_2.png";
			} else {

				return "minecraft:textures/models/armor/" + this.texture
						+ "_layer_1.png";
			}
		}
	}*/

	public ItemROCArmor register(String name) {
		GameRegistry.registerItem(this, name);
		ROCItems.itemList.add(name);
		return this;
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player,
			List infoList, boolean par4) {
		if (stack.getMaxDamage() == 0) {
			infoList.add(EnumChatFormatting.BLUE + "Infinite Uses");
		} else {
			infoList.add(EnumChatFormatting.GREEN + ""
					+ (stack.getMaxDamage() - stack.getItemDamage())
					+ " Uses Remaining");
		}
		infoList.add(EnumChatFormatting.GOLD + "" + damageReduction
				+ "% Damage Reduction");
	}

	/*@Override
	public ArmorProperties getProperties(EntityLivingBase player,
			ItemStack armor, DamageSource source, double damage, int slot) {
		return new ISpecialArmor.ArmorProperties(0, damageReduction / 100,
				50000);
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		return slot = (int) Math.round((damageReduction * 100) / 4);
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack,
			DamageSource source, int damage, int slot) {
		if (!source.isFireDamage() && !source.isMagicDamage())
			stack.damageItem(1, entity);
	}*/
}