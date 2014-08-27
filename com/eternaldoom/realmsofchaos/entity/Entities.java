package com.eternaldoom.realmsofchaos.entity;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityAquaticArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityAquaticBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityCitroniteArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityCitroniteBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityDiamondArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityDiamondBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityFlamestoneArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityFlamestoneBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityFractoniteArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityFractoniteBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityHeliotropeArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityHeliotropeBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityIronArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityIronBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityNeptuniteArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityNeptuniteBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityOsmaraltArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityOsmaraltBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityXyliteArrow;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityXyliteBullet;

import cpw.mods.fml.common.registry.EntityRegistry;

public class Entities {
	
	public static void preinit(){
		//Mobs
		EntityRegistry.registerGlobalEntityID(EntityAquaticGolem.class, "AquaticGolem", EntityRegistry.findGlobalUniqueEntityId(), 0x7AE8FF, 0x47FFE2);
		EntityRegistry.registerGlobalEntityID(EntityScorpioid.class, "Scorpioid", EntityRegistry.findGlobalUniqueEntityId(), 0xFF361C, 0x880007);
		EntityRegistry.registerGlobalEntityID(EntityVoidCrawler.class, "VoidCrawler", EntityRegistry.findGlobalUniqueEntityId(), 0x666D68, 0x52E9E9);
		
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
		
		EntityRegistry.registerGlobalEntityID(EntityIronBullet.class, "IronBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityIronBullet.class, "IronBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityDiamondBullet.class, "DiamondBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityDiamondBullet.class, "DiamondBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityHeliotropeBullet.class, "HeliotropeBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityHeliotropeBullet.class, "HeliotropeBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityCitroniteBullet.class, "CitroniteBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityCitroniteBullet.class, "CitroniteBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityXyliteBullet.class, "XyliteBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityXyliteBullet.class, "XyliteBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityFlamestoneBullet.class, "FlamestoneBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityFlamestoneBullet.class, "FlamestoneBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityNeptuniteBullet.class, "NeptuniteBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityNeptuniteBullet.class, "NeptuniteBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityAquaticBullet.class, "AquaticBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityAquaticBullet.class, "AquaticBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityOsmaraltBullet.class, "OsmaraltBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityOsmaraltBullet.class, "OsmaraltBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		EntityRegistry.registerGlobalEntityID(EntityFractoniteBullet.class, "FractoniteBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityFractoniteBullet.class, "FractoniteBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
	}
	
	public static void init(){
	}
}