package com.eternaldoom.realmsofchaos.overworld.items;

import com.eternaldoom.realmsofchaos.ROCTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemROCArmor extends ItemArmor{

	public String texture;
	public boolean vanilla;
	
	public ItemROCArmor(ArmorMaterial par1armorMaterial, int piece, String type, String tex, String name, boolean isVanilla) {
		super(par1armorMaterial, 3, piece);
		setTextureName(tex);
		setUnlocalizedName(name);
		if(!isVanilla) setCreativeTab(ROCTabs.Combat); else setCreativeTab(null);
		
		texture = type;
		vanilla = isVanilla;
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
}