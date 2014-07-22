package com.eternaldoom.realmsofchaos.overworld.items;

import java.util.List;

import com.eternaldoom.realmsofchaos.ROCTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.ISpecialArmor;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemROCArmor extends ItemArmor implements ISpecialArmor{

	public String texture;
	public boolean vanilla;
	private ArmorMaterial a;
	private double damageReduction;
	
	public ItemROCArmor(ArmorMaterial par1armorMaterial, int piece, String type, String tex, String name, boolean isVanilla) {
		super(par1armorMaterial, 3, piece);
		setTextureName(tex);
		setUnlocalizedName(name);
		if(!isVanilla) setCreativeTab(ROCTabs.Combat); else setCreativeTab(null);
		
		texture = type;
		vanilla = isVanilla;
		a =  par1armorMaterial;
		
		damageReduction = par1armorMaterial.getDamageReductionAmount(this.armorType)/4D;
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(!vanilla){
		    if (slot == 2)
		    {
		      return "realmsofchaos:textures/armor/" + this.texture + "_2.png";
		    }else{

		    return "realmsofchaos:textures/armor/" + this.texture + "_1.png";
		    }
		}else{
			if (slot == 2)
		    {
		      return "minecraft:textures/models/armor/" + this.texture + "_layer_2.png";
		    }else{

		    return "minecraft:textures/models/armor/" + this.texture + "_layer_1.png";
		    }
		}
	}
	
	public ItemROCArmor register(String name){
		GameRegistry.registerItem(this, name);
		return this;
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List infoList, boolean par4) {
		if(a.getDurability(1) == -1) {
			infoList.add(EnumChatFormatting.BLUE + "Infinite Uses");
		}
		else {
			infoList.add(EnumChatFormatting.GREEN + "" + (stack.getMaxDamage() - stack.getItemDamage()) + " Uses Remaining");
		}
		infoList.add(EnumChatFormatting.GOLD + "" + (damageReduction * 4) + "% Damage Reduction");
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase player,
			ItemStack armor, DamageSource source, double damage, int slot) {
		return new ISpecialArmor.ArmorProperties(0, damageReduction/100, 50000);
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		return slot = (int) Math.round((damageReduction*100)/4);
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack,
			DamageSource source, int damage, int slot) {
		if (!source.isFireDamage()) stack.damageItem(1, entity);
	}
}