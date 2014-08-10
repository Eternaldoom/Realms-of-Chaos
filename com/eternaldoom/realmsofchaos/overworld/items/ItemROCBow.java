package com.eternaldoom.realmsofchaos.overworld.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.ROCTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemROCBow extends OverworldItem
{
    public static final String[] bowPullIconNames = new String[] {"pulling_0", "pulling_1", "pulling_2"};
    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;
    private Item ammo;
    private Class<? extends EntityArrow> arrowClass;
    private int damage;

    public ItemROCBow(String tex, String name, Item ammo, Class<? extends EntityArrow> arrow, int durability, int damage)
    {
    	super(tex, name);
        this.maxStackSize = 1;
        this.setMaxDamage(384);
        this.setCreativeTab(ROCTabs.Combat);
        this.setMaxDamage(durability);
        this.ammo = ammo;
        this.arrowClass = arrow;
        this.damage = damage;
    }

    public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int time)
    {
        int j = this.getMaxItemUseDuration(stack) - time;

        boolean infinite = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

        if (infinite || player.inventory.hasItem(ammo))
        {
            float f = (float)j / 20.0F;
            f = (f * f + f * 2.0F) / 3.0F;

            if ((double)f < 0.1D)
            {
                return;
            }

            if (f > 1.0F)
            {
                f = 1.0F;
            }

            EntityArrow entityarrow = null;
            
            try{
            entityarrow = arrowClass.getConstructor(World.class, EntityLivingBase.class, float.class).newInstance(world, (EntityLivingBase)player, f * 2.0F);
            }catch(Exception e){
            	e.printStackTrace();
            }
            
            entityarrow.setDamage(damage);

            if (f == 1.0F)
            {
                entityarrow.setIsCritical(true);
            }

            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

            if (k > 0)
            {
                entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
            }

            int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

            if (l > 0)
            {
                entityarrow.setKnockbackStrength(l);
            }

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
            {
                entityarrow.setFire(100);
            }

            stack.damageItem(1, player);
            world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

            if (infinite)
            {
                entityarrow.canBePickedUp = 2;
            }
            else
            {
                player.inventory.consumeInventoryItem(ammo);
            }

            if (!world.isRemote)
            {
                world.spawnEntityInWorld(entityarrow);
            }
        }
    }

    @Override
    public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_)
    {
        return p_77654_1_;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 72000;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return EnumAction.bow;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {

        if (player.capabilities.isCreativeMode || player.inventory.hasItem(ammo))
        {
            player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
        }

        return stack;
    }
    
    @Override
    public int getItemEnchantability()
    {
        return 1;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister icons)
    {
        this.itemIcon = icons.registerIcon(this.getIconString() + "_standby");
        this.iconArray = new IIcon[bowPullIconNames.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = icons.registerIcon(this.getIconString() + "_" + bowPullIconNames[i]);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getItemIconForUseDuration(int par1)
    {
        return this.iconArray[par1];
    }
    
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
    	list.add(EnumChatFormatting.GREEN + "" + (stack.getMaxDamage() - stack.getItemDamage()) + "Uses Remaining");
    	list.add(EnumChatFormatting.RED + "" + damage + "Ranged Damage");
    }
    
    @Override
    public boolean isFull3D(){
    	return true;
    }
}