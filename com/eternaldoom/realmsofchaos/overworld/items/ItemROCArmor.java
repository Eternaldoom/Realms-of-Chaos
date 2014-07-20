package com.eternaldoom.realmsofchaos.overworld.items;

import java.util.List;

import com.eternaldoom.realmsofchaos.ROCTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemROCArmor extends ItemArmor{

	public String texture;
	public boolean vanilla;
	private ArmorMaterial a;
	
	public ItemROCArmor(ArmorMaterial par1armorMaterial, int piece, String type, String tex, String name, boolean isVanilla) {
		super(par1armorMaterial, 3, piece);
		setTextureName(tex);
		setUnlocalizedName(name);
		if(!isVanilla) setCreativeTab(ROCTabs.Combat); else setCreativeTab(null);
		
		texture = type;
		vanilla = isVanilla;
		a =  par1armorMaterial;
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
			infoList.add("Infinite Uses");
		}
		else {
			infoList.add(stack.getMaxDamage() - stack.getItemDamage() + " Uses Remaining");
		}
	}
}