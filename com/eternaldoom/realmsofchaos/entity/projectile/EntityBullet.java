package com.eternaldoom.realmsofchaos.entity.projectile;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.items.ROCItems;

public class EntityBullet extends EntityThrowable
{
	private float damage;
	private short field_145788_c;
	private short field_145786_d;
	private short field_145787_e;
	private Block field_145785_f;
	private String throwerName;
	private EntityLivingBase thrower;
    public EntityBullet(World world)
    {
        super(world);
    }

    public EntityBullet(World world, EntityLivingBase entity, float damage, Item ammo)
    {
        super(world, entity);
        this.damage = damage;
        this.dataWatcher.updateObject(17, Item.getIdFromItem(ammo));
    }

    public EntityBullet(World p_i1775_1_, double p_i1775_2_, double p_i1775_4_, double p_i1775_6_)
    {
        super(p_i1775_1_, p_i1775_2_, p_i1775_4_, p_i1775_6_);
    }
    
    @Override
    protected void entityInit(){
    	this.dataWatcher.addObject(17, 0);
    }
    
    public int getBulletId(){
    	return this.dataWatcher.getWatchableObjectInt(17);
    }
    
    @Override
    protected void onImpact(MovingObjectPosition position)
    {
        if (position.entityHit != null)
        {
            position.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), damage);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
    
    @Override
    public void writeEntityToNBT(NBTTagCompound tag)
    {
        tag.setShort("xTile", (short)this.field_145788_c);
        tag.setShort("yTile", (short)this.field_145786_d);
        tag.setShort("zTile", (short)this.field_145787_e);
        tag.setByte("inTile", (byte)Block.getIdFromBlock(this.field_145785_f));
        tag.setByte("shake", (byte)this.throwableShake);
        tag.setInteger("ammoid", this.dataWatcher.getWatchableObjectInt(17));
        

        if ((this.throwerName == null || this.throwerName.length() == 0) && this.thrower != null && this.thrower instanceof EntityPlayer)
        {
            this.throwerName = this.thrower.getCommandSenderEntity().getName();
        }

        tag.setString("ownerName", this.throwerName == null ? "" : this.throwerName);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tag)
    {
        this.field_145788_c = tag.getShort("xTile");
        this.field_145786_d = tag.getShort("yTile");
        this.field_145787_e = tag.getShort("zTile");
        this.field_145785_f = Block.getBlockById(tag.getByte("inTile") & 255);
        this.throwableShake = tag.getByte("shake") & 255;
        this.throwerName = tag.getString("ownerName");
        this.dataWatcher.updateObject(17, tag.getInteger("ammoid"));

        if (this.throwerName != null && this.throwerName.length() == 0)
        {
            this.throwerName = null;
        }
    }
    
    public int getAmmoId(){
    	return this.dataWatcher.getWatchableObjectInt(17);
    }
}