package com.eternaldoom.realmsofchaos.entity;

import java.util.Calendar;
import java.util.Random;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderHell;

import com.eternaldoom.realmsofchaos.items.ROCItems;

public class EntityFrozenWarrior extends EntityMob{

	public EntityFrozenWarrior(World w) {
		super(w);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        setSize(0.6F, 1.8F);
	}

	@Override
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(80.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(12D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(80.0D);
    }
	
	@Override
	public boolean attackEntityAsMob(Entity entity){
		float damage = (float)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
		boolean success = entity.attackEntityFrom(DamageSource.causeMobDamage(this), damage);
    	if(success && entity instanceof EntityLivingBase) ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 3, true, false));
		if (success)
        {
			entity.addVelocity((double)(-MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F) * 0.5F), 0.1D, (double)(MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F) * 0.5F));
            this.motionX *= 0.6D;
            this.motionZ *= 0.6D;

            int j = EnchantmentHelper.getFireAspectModifier(this);

            if (j > 0)
            {
                entity.setFire(j * 4);
            }
        }

        return success;
	}
	
	@Override
	public IEntityLivingData func_180482_a(DifficultyInstance p_180482_1_, IEntityLivingData p_180482_2_)
    {
        p_180482_2_ = super.func_180482_a(p_180482_1_, p_180482_2_);

        this.setCurrentItemOrArmor(0, new ItemStack(ROCItems.osmaralt_sword));

        return p_180482_2_;
    }
	
	@Override
	protected void entityInit()
    {
        super.entityInit();
        this.getDataWatcher().addObject(12, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(13, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(14, Byte.valueOf((byte)0));
    }
	
	@Override
	protected String getLivingSound()
    {
        return "realmsofchaos:mob.aquaticgolem.growl";
    }

    @Override
    protected String getHurtSound()
    {
        return "realmsofchaos:mob.aquaticgolem.death"; //TODO: get sounds for this mob.
    }

    @Override
    protected String getDeathSound()
    {
        return "realmsofchaos:mob.aquaticgolem.death";
    }
    
    @Override
    protected void dropFewItems(boolean par1, int par2)
    {
        if(this.rand.nextInt(40) == 0)this.dropItem(ROCItems.fractonite_stone, 1);
        if(this.rand.nextInt(7) == 0)this.dropItem(ROCItems.fractonite_shard, this.rand.nextInt(3)+1);
        if(this.rand.nextInt(3) == 0)this.dropItem(Item.getItemFromBlock(Blocks.ice), 1);
        this.dropItem(Items.snowball, this.rand.nextInt(3)+1);
    }
    
    //TODO: new items for drops probably
    
    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
    
    @Override
    protected boolean isValidLightLevel(){
    	return true;
    }
    
    @Override
    public boolean getCanSpawnHere()
    {
        return this.worldObj.getDifficulty() != EnumDifficulty.PEACEFUL && !this.worldObj.isAnyLiquid(this.getBoundingBox());
    }
}
