package com.eternaldoom.realmsofchaos.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.eternaldoom.realmsofchaos.ROCTabs;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityROCArrow;

public class ItemROCBow extends ROCModItem
{
    private Item ammo;
    public float damage;
    
    public ItemROCBow(String name, Item parAmmo, int durability, float damage)
    {
    	super(name);
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setMaxDamage(durability);
        this.ammo = parAmmo;
        this.damage = damage;
    }

    @Override
    public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int time)
    {
    	int maxItemUse = getMaxItemUseDuration(stack) - time;
        //ArrowLooseEvent event = new ArrowLooseEvent(player, stack, maxItemUse);
        //MinecraftForge.EVENT_BUS.post(event);
        //if (event.isCanceled()) return;
        //maxItemUse = event.charge;
        boolean infiniteAmmo = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;
        if (infiniteAmmo || player.inventory.hasItem(ammo)) {
            float scaledItemUse = (float) maxItemUse / 20.0F;
            scaledItemUse = (scaledItemUse * scaledItemUse + scaledItemUse * 2) / 3;
            if ((double) scaledItemUse < 0.1) return;
            if (scaledItemUse > 1) scaledItemUse = 1;
            EntityROCArrow entityarrow = new EntityROCArrow(world, player, scaledItemUse*2, damage, ammo.getUnlocalizedName().replace("item.arrow", ""));
            entityarrow.setAmmoItem(ammo);
            if (scaledItemUse == 1) entityarrow.setIsCritical(true);
            int powerLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);
            if (powerLevel > 0) entityarrow.setDamage(entityarrow.getDamage() + (double) powerLevel * 0.5 + 0.5);
            int punchLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);
            if (punchLevel > 0) entityarrow.setKnockbackStrength(punchLevel);
            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0) entityarrow.setFire(100);
            stack.damageItem(1, player);
            world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + scaledItemUse * 0.5F);
            if (infiniteAmmo) entityarrow.canBePickedUp = 2;
            else player.inventory.consumeInventoryItem(ammo);
            if (!world.isRemote) world.spawnEntityInWorld(entityarrow);
        }
    }

    @Override
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 72000;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return EnumAction.BOW;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
    	//ArrowNockEvent event = new ArrowNockEvent(player, stack);
        //MinecraftForge.EVENT_BUS.post(event);
       // if (event.isCanceled())
       // {
        //    return event.result;
        //}

        if (player.capabilities.isCreativeMode || player.inventory.hasItem(ammo))
        {
            player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
        }

        return stack;
    }
    
    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
        return stack;
    }
    
    @Override
    public int getItemEnchantability()
    {
        return 1;
    }
    
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
    	if(this.getMaxDamage() == -1) list.add(EnumChatFormatting.BLUE + "Infinite Uses");
    	else list.add(EnumChatFormatting.GREEN + "" + (stack.getMaxDamage() - stack.getItemDamage()) + " Uses Remaining");
    	list.add(EnumChatFormatting.RED + "" + damage + " Minimum Ranged Damage");
    }
}