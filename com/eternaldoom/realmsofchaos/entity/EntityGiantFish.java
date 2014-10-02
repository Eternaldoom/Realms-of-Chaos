package com.eternaldoom.realmsofchaos.entity;

import java.util.UUID;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.items.ROCItems;

public class EntityGiantFish extends EntityMob
{
    public BlockPos spawnPosition;
    public boolean angry;
    public boolean tame;
	private EntityLivingBase entityToAttack;

    public EntityGiantFish(World world)
    {
        super(world);
        this.setSize(3F, 2F);
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
        this.dataWatcher.addObject(17, "");
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
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0D);
    }

    protected boolean isAIEnabled()
    {
        return true;
    }

   @Override
    public void onUpdate()
    {
        super.onUpdate();
        if(this.worldObj.getBlockState(new BlockPos((int)this.posX, MathHelper.floor_double(this.posY), (int)this.posZ)).getBlock() == Blocks.air)this.motionY *= 1.0000000238418579D;
        
        if((this.worldObj.getBlockState(new BlockPos((int)Math.round(this.posX), MathHelper.floor_double(this.posY) - 1, (int)this.posZ)).getBlock() != Blocks.air && this.worldObj.getBlockState(new BlockPos((int)this.posX, MathHelper.floor_double(this.posY)-1, (int)this.posZ)).getBlock() != Blocks.water && (this.worldObj.getBlockState(new BlockPos((int)this.posX, MathHelper.floor_double(this.posY), (int)this.posZ)).getBlock() == Blocks.air || this.worldObj.getBlockState(new BlockPos((int)this.posX, MathHelper.floor_double(this.posY), (int)this.posZ)).getBlock().getMaterial() == Material.plants)) || this.worldObj.getBlockState(new BlockPos((int)Math.round(this.posX), MathHelper.floor_double(this.posY) - 2, (int)this.posZ)).getBlock() != Blocks.air && this.worldObj.getBlockState(new BlockPos((int)this.posX, MathHelper.floor_double(this.posY)-2, (int)this.posZ)).getBlock() != Blocks.water && (this.worldObj.getBlockState(new BlockPos((int)this.posX, MathHelper.floor_double(this.posY), (int)this.posZ)).getBlock() == Blocks.air || this.worldObj.getBlockState(new BlockPos((int)this.posX, MathHelper.floor_double(this.posY), (int)this.posZ)).getBlock().getMaterial() == Material.plants)){
        	this.motionY = 0.4;
        	switch(this.rand.nextInt(4)){
        		case 0: this.motionX = 0.25;this.motionZ=0.25;break;
        		case 1: this.motionX = 0.25;this.motionZ=-0.25;break;
        		case 2: this.motionX = -0.25;this.motionZ=-0.25;break;
        		case 3: this.motionX = -0.25;this.motionZ=0.25;
        	}
        }
    }

    @Override
    protected void updateAITasks()
    {
        super.updateAITasks();
        	this.entityToAttack = getOwner();

            if (this.spawnPosition != null && (this.worldObj.getBlockState(new BlockPos(this.spawnPosition.getX(), this.spawnPosition.getY(), this.spawnPosition.getZ())).getBlock() != Blocks.water || this.spawnPosition.getY() < 1))
            {
                this.spawnPosition = null;
            }

            if (this.spawnPosition == null || this.spawnPosition.distanceSq((int)this.posX, (int)this.posY, (int)this.posZ) < 6.0F)
            {
            	if(this.worldObj.getBlockState(new BlockPos((int)this.posX, MathHelper.floor_double(this.posY) - 5, (int)this.posZ)).getBlock() != Blocks.water && this.worldObj.getBlockState(new BlockPos((int)this.posX, MathHelper.floor_double(this.posY) + 9, (int)this.posZ)).getBlock() == Blocks.water){
            		switch (this.rand.nextInt(2)){
            		case 0: this.spawnPosition = new BlockPos((int)this.posX + this.rand.nextInt(36)+this.rand.nextInt(6), (int)this.posY + this.rand.nextInt(10) + 3, (int)this.posZ + this.rand.nextInt(36)+this.rand.nextInt(6));
            		case 1: this.spawnPosition = new BlockPos((int)this.posX + this.rand.nextInt(36)-this.rand.nextInt(18), (int)this.posY + this.rand.nextInt(10) + 3, (int)this.posZ + this.rand.nextInt(36)-this.rand.nextInt(18));
            		}            	}
            	else if(this.worldObj.getBlockState(new BlockPos((int)this.posX, MathHelper.floor_double(this.posY) - 5, (int)this.posZ)).getBlock() == Blocks.water && this.worldObj.getBlockState(new BlockPos((int)this.posX, MathHelper.floor_double(this.posY) + 9, (int)this.posZ)).getBlock() != Blocks.water){
            		switch (this.rand.nextInt(2)){
            		case 0: this.spawnPosition = new BlockPos((int)this.posX + this.rand.nextInt(36)+this.rand.nextInt(6), (int)this.posY - this.rand.nextInt(10) - 4, (int)this.posZ + this.rand.nextInt(36)+this.rand.nextInt(6));
            		case 1: this.spawnPosition = new BlockPos((int)this.posX + this.rand.nextInt(36)-this.rand.nextInt(18), (int)this.posY - this.rand.nextInt(10) - 4, (int)this.posZ + this.rand.nextInt(36)-this.rand.nextInt(18));
            		}
            	}else{
            		switch (this.rand.nextInt(2)){
            		case 0: this.spawnPosition = new BlockPos((int)this.posX + this.rand.nextInt(12)+5 - this.rand.nextInt(12)-5, (int)this.posY + this.rand.nextInt(10) + 3, (int)this.posZ + this.rand.nextInt(12)+5 - this.rand.nextInt(12)-5);break;
            		case 1: this.spawnPosition = new BlockPos((int)this.posX + this.rand.nextInt(12)+5 - this.rand.nextInt(12)-5, -((int)this.posY + this.rand.nextInt(10) + 3), (int)this.posZ + this.rand.nextInt(12)+5 - this.rand.nextInt(12)-5);
            		}
            	}
            }
            
            if(this.worldObj.getBlockState(new BlockPos(this.spawnPosition.getX(), this.spawnPosition.getY(), this.spawnPosition.getZ())).getBlock() == Blocks.air){
            	this.spawnPosition.offsetDown(5);
            }
            
            if(this.angry && this.entityToAttack != null){
            	this.spawnPosition = new BlockPos((int)Math.round(this.entityToAttack.posX), (int)Math.round(this.entityToAttack.posY), (int)Math.round(this.entityToAttack.posZ));
            }else if(this.tame && this.entityToAttack != null){
            	if(((EntityPlayer)this.entityToAttack).getHeldItem() != null && ((EntityPlayer)this.entityToAttack).getHeldItem().getItem() == ROCItems.seaweed){
                	this.spawnPosition = new BlockPos((int)Math.round(this.entityToAttack.posX) + this.rand.nextInt(4)-this.rand.nextInt(4), (int)Math.round(this.entityToAttack.posY) + this.rand.nextInt(4)-this.rand.nextInt(4), (int)Math.round(this.entityToAttack.posZ) + this.rand.nextInt(4)-this.rand.nextInt(4));
            	}
            }

            if(this.worldObj.getBlockState(new BlockPos((int)this.posX, MathHelper.floor_double(this.posY), (int)this.posZ)).getBlock() == Blocks.water){
           	double i = (double)this.spawnPosition.getX() - this.posX;
           	double j = (double)this.spawnPosition.getY() - this.posY;
           	double k = (double)this.spawnPosition.getZ() - this.posZ;
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
    public boolean attackEntityFrom(DamageSource source, float p_70097_2_)
    {
        if (this.func_180431_b(source))
        {
            return false;
        }
        else
        {
        	Entity entity = source.getEntity();

            if (entity instanceof EntityPlayer)
            {
                if (!this.tame) this.angry = true;
                this.entityToAttack = (EntityLivingBase) entity;
                this.setOwner(((EntityPlayer)entity).getUniqueID().toString());
            }
            
            return super.attackEntityFrom(source, p_70097_2_);
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
        int i = MathHelper.floor_double(this.getBoundingBox().minY);

        if (i >= 120) return false;
        if(this.rand.nextInt(70000) != 2)return false;
        else
        {
            int j = MathHelper.floor_double(this.posX);
            int k = MathHelper.floor_double(this.posZ);
            
            return this.worldObj.checkNoEntityCollision(this.getBoundingBox()) && this.worldObj.getCollidingBoundingBoxes(this, this.getBoundingBox()).isEmpty();
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
    
    @Override
    public void writeEntityToNBT(NBTTagCompound tag)
    {
        super.writeEntityToNBT(tag);
        tag.setBoolean("Angry", this.angry);
        tag.setBoolean("Tame", this.tame);
        tag.setString("Target", this.dataWatcher.getWatchableObjectString(17));
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tag)
    {
        super.readEntityFromNBT(tag);
        this.angry = tag.getBoolean("Anger");
        this.tame = tag.getBoolean("Tame");
        setOwner(tag.getString("Target"));
    }
    
    protected Entity findPlayerToAttack()
    {
        return !this.angry ? null : this.worldObj.getClosestPlayerToEntity(this, 16.0D);
    }
    
    @Override
    public boolean attackEntityAsMob(Entity p_70652_1_){
    	if(angry){
    		super.attackEntityAsMob(p_70652_1_);
    		return true;
    	}
    	return false;
    }
    
    @Override
    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_){
    	this.dropItem(ROCItems.fish_scale, this.rand.nextInt(3)+1);
    	if(this.rand.nextInt(3) == 0) this.dropItem(Items.fish, 2);
    	if(this.rand.nextInt(40)==0) this.dropItem(ROCItems.aquatic_orb, 3);
    }
    
    @Override
    public boolean interact(EntityPlayer player)
    {
    	if(player.getHeldItem() != null && player.getHeldItem().getItem() == ROCItems.seaweed && !this.angry && !this.tame){
    		
    		if(!player.capabilities.isCreativeMode) player.getHeldItem().stackSize--;
    		
    		if(this.rand.nextInt(6) == 0){
    			for (int j = 0; j < 15; j++)
                {
                    float f1 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width * 0.5F;
                    float f2 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width * 0.5F;
                    this.worldObj.spawnParticle(EnumParticleTypes.HEART, this.posX + (double)f1, (double)(this.getBoundingBox().minY + 0.8F), this.posZ + (double)f2, this.motionX, this.motionY, this.motionZ);
                }
    			this.tame = true;
    			this.entityToAttack = player;
    			setOwner(player.getUniqueID().toString());
    			return true;
    		}
    		for (int j = 0; j < 15; j++)
            {
                float f1 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width * 0.5F;
                float f2 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width * 0.5F;
                this.worldObj.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.posX + (double)f1, (double)(this.getBoundingBox().minY + 0.8F), this.posZ + (double)f2, this.motionX, this.motionY, this.motionZ);
            }
    		return false;
    	}
    	return false;
    }
    
    public EntityLivingBase getOwner()
    {
        try
        {
            UUID uuid = UUID.fromString(this.dataWatcher.getWatchableObjectString(17));
            return uuid == null ? null : this.worldObj.getPlayerEntityByUUID(uuid);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return null;
        }
    }
    
    public void setOwner(String uuid)
    {
        this.dataWatcher.updateObject(17, uuid);
    }
}