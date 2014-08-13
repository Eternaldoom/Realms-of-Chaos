package com.eternaldoom.realmsofchaos.entity;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityDiamondArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityDiamondBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityIronArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityIronBullet;

import cpw.mods.fml.common.registry.EntityRegistry;

public class Entities {
	
	public static void preinit(){
		//Mobs
		EntityRegistry.registerGlobalEntityID(EntityAquaticGolem.class, "AquaticGolem", EntityRegistry.findGlobalUniqueEntityId(), 0x7AE8FF, 0x47FFE2);
		EntityRegistry.registerGlobalEntityID(EntityScorpioid.class, "Scorpioid", EntityRegistry.findGlobalUniqueEntityId(), 0xFF361C, 0x880007);
		
		//Arrows
		EntityRegistry.registerGlobalEntityID(EntityIronArrow.class, "IronArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityIronArrow.class, "IronArrow", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityDiamondArrow.class, "DiamondArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityDiamondArrow.class, "DiamondArrow", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		
		//Cannons
		EntityRegistry.registerGlobalEntityID(EntityIronBullet.class, "IronBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityIronBullet.class, "IronBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityDiamondBullet.class, "DiamondBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityDiamondBullet.class, "DiamondBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
	}
	
	public static void init(){
	}
}