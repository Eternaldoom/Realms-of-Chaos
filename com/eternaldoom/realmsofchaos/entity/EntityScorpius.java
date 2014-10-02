package com.eternaldoom.realmsofchaos.entity;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.items.ROCItems;

public class EntityScorpius extends EntityROCBoss{

	public EntityScorpius(World w) {
		super(w);
		setSize(2.2f, 0.7f);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.experienceValue = 3000;
	}
	
	
	@Override
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(500);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4);
    }
	
	@Override
	public void onUpdate(){
		super.onUpdate();
		EntityPlayer player = this.worldObj.getClosestPlayerToEntity(this, 16.0D);
		double playerDistance = Math.sqrt(((this.posX-player.posX) * (this.posX-player.posX)) + ((this.posZ-player.posZ) * (this.posZ-player.posZ)));
		double distanceX = player.posX-this.posX;
		double distanceZ = player.posZ-this.posZ;
		
		if(playerDistance < 11 && !player.capabilities.isCreativeMode && this.rand.nextInt(25) == 0){
			this.motionY += 0.75;
		}
		
		if(this.worldObj.getBlockState(new BlockPos((int)this.posX, MathHelper.floor_double(this.posY)-2, (int)this.posZ)).getBlock() == Blocks.air){
			if(distanceX > 3 || distanceX < -3)this.motionX = Math.signum(distanceX)*0.35;
			if(distanceZ > 3 || distanceZ < -3)this.motionZ = Math.signum(distanceZ)*0.35;
			System.out.println(Math.signum(distanceZ)*0.5);
		}
		
		if(playerDistance < 3 && this.worldObj.getBlockState(new BlockPos((int)this.posX, MathHelper.floor_double(this.posY)-2, (int)this.posZ)).getBlock() == Blocks.air && (this.motionX >0.2 || this.motionX < -0.2 || this.motionZ >0.2 || this.motionZ < -0.2)){
			this.motionX = 0;
			this.motionZ = 0;
		}
	}
	
	@Override
	protected String getLivingSound()
    {
        return "realmsofchaos:mob.scorpioid.say";
    }

    @Override
    protected String getHurtSound()
    {
        return "realmsofchaos:mob.scorpioid.hurt";
    }

    @Override
    protected String getDeathSound()
    {
        return "realmsofchaos:mob.scorpioid.hurt";
    }
    
    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.ARTHROPOD;
    }
    
    @Override
    public void dropFewItems(boolean par1, int par2){
    	this.dropItem(Item.getItemFromBlock(ROCBlocks.xylite_block), 1);
    	this.dropItem(Item.getItemFromBlock(Blocks.gold_block), 16);
    	this.dropItem(isBurning() ? ROCItems.cooked_scorpion : ROCItems.raw_scorpion, 32);
    	this.dropItem(ROCItems.citronite_gem, 20);
    	this.dropItem(ROCItems.mystic_gem, 1);
    }
}
