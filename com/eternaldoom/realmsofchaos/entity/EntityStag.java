package com.eternaldoom.realmsofchaos.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EntityStag extends EntityAnimal
{
    public EntityStag(World worldIn)
    {
        super(worldIn);
        this.setSize(1.2F, 1.4F);
        ((PathNavigateGround)this.getNavigator()).func_179690_a(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
    }
    
    @Override
    protected void entityInit(){
    	super.entityInit();
    	this.dataWatcher.addObject(19, this.rand.nextInt(2));
    }
    
    @Override
    public void writeToNBT(NBTTagCompound tag){
    	super.writeToNBT(tag);
    	tag.setInteger("Type", this.dataWatcher.getWatchableObjectInt(19));
    }
    
    @Override
    public void readFromNBT(NBTTagCompound tag){
    	super.readFromNBT(tag);
    	this.dataWatcher.updateObject(19, tag.getInteger("Type"));
    }
    
    public int getStagType(){
    	return this.dataWatcher.getWatchableObjectInt(19);
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25000000298023224D);
    }

    @Override
    protected String getLivingSound()
    {
        return "mob.cow.say";
    }

    @Override
    protected String getHurtSound()
    {
        return "mob.cow.hurt";
    }

    @Override
    protected String getDeathSound()
    {
        return "mob.cow.hurt";
    }

    @Override
    protected void playStepSound(BlockPos p_180429_1_, Block p_180429_2_)
    {
        this.playSound("mob.cow.step", 0.15F, 1.0F);
    }

    @Override
    protected float getSoundVolume()
    {
        return 0.2F;
    }

    @Override
    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
    	this.dropItem(Items.leather, this.rand.nextInt(3)+1);
    	this.dropItem(this.isBurning() ? Items.cooked_mutton : Items.mutton, this.rand.nextInt(4)+1);
    }

    @Override
    public EntityStag createChild(EntityAgeable entity)
    {
        return new EntityStag(this.worldObj);
    }

    @Override
    public float getEyeHeight()
    {
        return this.height;
    }
}