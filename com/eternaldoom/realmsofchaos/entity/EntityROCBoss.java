package com.eternaldoom.realmsofchaos.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityROCBoss extends EntityMob implements IBossDisplayData{
	
	public EntityROCBoss(World w) {
		super(w);
	}

	@Override
	protected float getSoundVolume()
    {
        return 10.0F;
    }
}
