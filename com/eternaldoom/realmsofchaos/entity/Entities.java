package com.eternaldoom.realmsofchaos.entity;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityAquaticArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityCitroniteArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityDiamondArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityDiamondBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityFlamestoneArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityFractoniteArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityHeliotropeArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityIronArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityIronBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityNeptuniteArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityOsmaraltArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityXyliteArrow;

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
		EntityRegistry.registerGlobalEntityID(EntityHeliotropeArrow.class, "HeliotropeArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityHeliotropeArrow.class, "HeliotropeArrow", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityCitroniteArrow.class, "CitroniteArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityCitroniteArrow.class, "CitroniteArrow", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityXyliteArrow.class, "XyliteArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityXyliteArrow.class, "XyliteArrow", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityFlamestoneArrow.class, "FlamestoneArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityFlamestoneArrow.class, "FlamestoneArrow", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityNeptuniteArrow.class, "NeptuniteArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityNeptuniteArrow.class, "NeptuniteArrow", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityAquaticArrow.class, "AquaticArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityAquaticArrow.class, "AquaticArrow", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityOsmaraltArrow.class, "OsmaraltArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityOsmaraltArrow.class, "OsmaraltArrow", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityFractoniteArrow.class, "FractoniteArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityFractoniteArrow.class, "FractoniteArrow", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		
		//Cannons
		EntityRegistry.registerGlobalEntityID(EntityIronBullet.class, "IronBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityIronBullet.class, "IronBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityDiamondBullet.class, "DiamondBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityDiamondBullet.class, "DiamondBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
	}
	
	public static void init(){
	}
}