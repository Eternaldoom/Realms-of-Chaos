package com.eternaldoom.realmsofchaos.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.eternaldoom.realmsofchaos.ROCTabs;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class ItemROCSword extends ItemSword{
	private ROCItems.ToolMaterial t;
	private float attackDamage;
	
    public ItemROCSword(ROCItems.ToolMaterial tool, String name, boolean isVanilla) {
		super(Item.ToolMaterial.WOOD);
		setUnlocalizedName(name);
		if (!isVanilla) setCreativeTab(CreativeTabs.tabBlock); else setCreativeTab(null);
		t = tool;
		this.setMaxDamage(tool.getMaxUses());
		this.attackDamage = 4.0F + tool.getAttackDamage();
	}

	@Override
	public boolean isItemTool(ItemStack par1ItemStack) {
		return true;
	}

	@Override
	public void addInformation(ItemStack item, EntityPlayer player, List infoList, boolean par4) {
		if(item.getMaxDamage() == -1) {
			infoList.add(EnumChatFormatting.BLUE + "Infinite Uses");
		}
		else {
			infoList.add(EnumChatFormatting.GREEN + "" + (item.getMaxDamage() - item.getItemDamage()) + " Uses Remaining");
		}
		
		infoList.add(EnumChatFormatting.DARK_RED + "" + (t.getAttackDamage() + 4.0f) + " Attack Damage");
	}
	
	public ItemROCSword register(String name){
		GameRegistry.registerItem(this, name);
		ROCItems.itemList.add(name);
		return this;
	}
	
	@Override
	public float func_150931_i()
    {
        return this.t.getAttackDamage();
    }
	
	@Override
	public int getItemEnchantability()
    {
        return this.t.getEnchantability();
    }
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return this.t.getItemForRepair() == repair.getItem() ? true : false;
    }
	
	@Override
	public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = HashMultimap.create();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", (double)this.attackDamage, 0));
        return multimap;
    }
}