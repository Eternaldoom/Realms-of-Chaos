package com.eternaldoom.realmsofchaos.entity;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityROCArrow;

public class Entities {
	
	public static void preinit(){
		//Mobs
		EntityRegistry.registerGlobalEntityID(EntityAquaticGolem.class, "AquaticGolem", EntityRegistry.findGlobalUniqueEntityId(), 0x7AE8FF, 0x47FFE2);
		EntityRegistry.registerGlobalEntityID(EntityScorpioid.class, "Scorpioid", EntityRegistry.findGlobalUniqueEntityId(), 0xFF361C, 0x880007);
		EntityRegistry.registerGlobalEntityID(EntityVoidCrawler.class, "VoidCrawler", EntityRegistry.findGlobalUniqueEntityId(), 0x666D68, 0x52E9E9);
		EntityRegistry.registerGlobalEntityID(EntityGiantFish.class, "GiantFish", EntityRegistry.findGlobalUniqueEntityId(), 0x66B69C, 0x48B0BE);
		EntityRegistry.registerGlobalEntityID(EntityKelpFish.class, "KelpFish", EntityRegistry.findGlobalUniqueEntityId(), 0x54B8DD, 0x34898D);
		
		//Bosses
		EntityRegistry.registerGlobalEntityID(EntityScorpius.class, "Scorpius", EntityRegistry.findGlobalUniqueEntityId());

		EntityRegistry.registerGlobalEntityID(EntityROCArrow.class, "ROCArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityROCArrow.class, "ROCArrow", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		
		EntityRegistry.registerGlobalEntityID(EntityBullet.class, "ROCBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityBullet.class, "ROCBullet", EntityRegistry.findGlobalUniqueEntityId(), RealmsOfChaos.instance, 64, 1, true);
		
		for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++)
	    {
			if (BiomeGenBase.getBiomeGenArray()[i] != null)
	        {
				EntityRegistry.addSpawn(EntityScorpioid.class, 130, 2, 5, EnumCreatureType.MONSTER, BiomeGenBase.getBiomeGenArray()[i]);
				EntityRegistry.addSpawn(EntityVoidCrawler.class, 100, 1, 2, EnumCreatureType.MONSTER, BiomeGenBase.getBiomeGenArray()[i]);
	        }
	    }
	}
	
	public static void init(){
	}
}