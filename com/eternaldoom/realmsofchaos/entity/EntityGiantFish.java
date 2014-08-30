package com.eternaldoom.realmsofchaos.entity;

import java.util.Calendar;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityGiantFish extends EntityAmbientCreature
{
    public ChunkCoordinates spawnPosition;

    public EntityGiantFish(World world)
    {
        super(world);
        this.setSize(5F, 3F);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }

    @Override
    public boolean canBePushed()
    {
        return true;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
    }

    protected boolean isAIEnabled()
    {
        return true;
    }

   @Override
    public void onUpdate()
    {
        super.onUpdate();
        if(this.worldObj.getBlock((int)this.posX, MathHelper.floor_double(this.posY), (int)this.posZ) == Blocks.air)this.motionY *= 1.0000000238418579D;
        if(this.worldObj.getBlock((int)this.posX, MathHelper.floor_double(this.posY)-1, (int)this.posZ) != Blocks.air && this.worldObj.getBlock((int)this.posX, MathHelper.floor_double(this.posY)-1, (int)this.posZ) != Blocks.water && this.worldObj.getBlock((int)this.posX, MathHelper.floor_double(this.posY), (int)this.posZ) == Blocks.air)this.motionY = 1.7;
    }

    @Override
    protected void updateAITasks()
    {
        super.updateAITasks();

            if (this.spawnPosition != null && (this.worldObj.getBlock(this.spawnPosition.posX, this.spawnPosition.posY, this.spawnPosition.posZ) != Blocks.water || this.spawnPosition.posY < 1))
            {
                this.spawnPosition = null;
            }

            if (this.spawnPosition == null || this.spawnPosition.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 6.0F)
            {
            	if(this.worldObj.getBlock((int)this.posX, MathHelper.floor_double(this.posY) - 5, (int)this.posZ) != Blocks.water && this.worldObj.getBlock((int)this.posX, MathHelper.floor_double(this.posY) + 9, (int)this.posZ) == Blocks.water){
            		switch (this.rand.nextInt(2)){
            		case 0: this.spawnPosition = new ChunkCoordinates((int)this.posX + this.rand.nextInt(36)+this.rand.nextInt(6), (int)this.posY + this.rand.nextInt(10) + 3, (int)this.posZ + this.rand.nextInt(36)+this.rand.nextInt(6));
            		case 1: this.spawnPosition = new ChunkCoordinates((int)this.posX + this.rand.nextInt(36)-this.rand.nextInt(18), (int)this.posY + this.rand.nextInt(10) + 3, (int)this.posZ + this.rand.nextInt(36)-this.rand.nextInt(18));
            		}            	}
            	else if(this.worldObj.getBlock((int)this.posX, MathHelper.floor_double(this.posY) - 5, (int)this.posZ) == Blocks.water && this.worldObj.getBlock((int)this.posX, MathHelper.floor_double(this.posY) + 9, (int)this.posZ) != Blocks.water){
            		switch (this.rand.nextInt(2)){
            		case 0: this.spawnPosition = new ChunkCoordinates((int)this.posX + this.rand.nextInt(36)+this.rand.nextInt(6), (int)this.posY - this.rand.nextInt(10) - 4, (int)this.posZ + this.rand.nextInt(36)+this.rand.nextInt(6));
            		case 1: this.spawnPosition = new ChunkCoordinates((int)this.posX + this.rand.nextInt(36)-this.rand.nextInt(18), (int)this.posY - this.rand.nextInt(10) - 4, (int)this.posZ + this.rand.nextInt(36)-this.rand.nextInt(18));
            		}
            	}else{
            		switch (this.rand.nextInt(2)){
            		case 0: this.spawnPosition = new ChunkCoordinates((int)this.posX + this.rand.nextInt(12)+5 - this.rand.nextInt(12)-5, (int)this.posY + this.rand.nextInt(10) + 3, (int)this.posZ + this.rand.nextInt(12)+5 - this.rand.nextInt(12)-5);break;
            		case 1: this.spawnPosition = new ChunkCoordinates((int)this.posX + this.rand.nextInt(12)+5 - this.rand.nextInt(12)-5, -((int)this.posY + this.rand.nextInt(10) + 3), (int)this.posZ + this.rand.nextInt(12)+5 - this.rand.nextInt(12)-5);
            		}
            	}
            }
            
            if(this.worldObj.getBlock(this.spawnPosition.posX, this.spawnPosition.posY, this.spawnPosition.posZ) == Blocks.air){
            	this.spawnPosition.posY -= 5;
            }

            if(this.worldObj.getBlock((int)this.posX, MathHelper.floor_double(this.posY), (int)this.posZ) == Blocks.water){
           	double i = (double)this.spawnPosition.posX - this.posX;
           	double j = (double)this.spawnPosition.posY - this.posY;
           	double k = (double)this.spawnPosition.posZ - this.posZ;
           	this.motionX += (Math.signum(i) * 0.5D - this.motionX) * 0.10000000149011612D;
           	this.motionY += (Math.signum(j) * 0.699999988079071D - this.motionY) * 0.10000000149011612D;
           	this.motionZ += (Math.signum(k) * 0.5D - this.motionZ) * 0.10000000149011612D;
           	float f = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
           	float f1 = MathHelper.wrapAngleTo180_float(f - this.rotationYaw);
            this.rotationYaw += f1;
            this.moveForward = 5F;
            }
    }

    @Override
    public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_)
    {
        if (this.isEntityInvulnerable())
        {
            return false;
        }
        else
        {
            return super.attackEntityFrom(p_70097_1_, p_70097_2_);
        }
    }
    
    @Override
    public boolean canBreatheUnderwater()
    {
        return true;
    }

    @Override
    public boolean getCanSpawnHere()
    {
        int i = MathHelper.floor_double(this.boundingBox.minY);

        if (i >= 120)
        {
            return false;
        }
        else
        {
            int j = MathHelper.floor_double(this.posX);
            int k = MathHelper.floor_double(this.posZ);
            byte b0 = 4;
            Calendar calendar = this.worldObj.getCurrentDate();

            return this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty();
        }
    }
    
    @Override
    public void onEntityUpdate()
    {
        int i = this.getAir();
        super.onEntityUpdate();

        if (this.isEntityAlive() && !this.isInWater())
        {
            --i;
            this.setAir(i);

            if (this.getAir() == -20)
            {
                this.setAir(0);
                this.attackEntityFrom(DamageSource.drown, 2.0F);
            }
        }
        else
        {
            this.setAir(300);
        }
    }
}