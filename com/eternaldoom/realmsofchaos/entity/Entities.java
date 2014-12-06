package com.eternaldoom.realmsofchaos.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityBullet;
import com.eternaldoom.realmsofchaos.entity.projectile.EntityROCArrow;

public class Entities {
	
	private static int entityID = 0;
	private static int globalEntityID = 1840;
	
	public static void preinit(){
		//Mobs
		registerMob(EntityAquaticGolem.class, "AquaticGolem", 0x7AE8FF, 0x47FFE2);
		registerMob(EntityScorpioid.class, "Scorpioid", 0xFF361C, 0x880007);
		registerMob(EntityVoidCrawler.class, "VoidCrawler", 0x666D68, 0x52E9E9);
		registerMob(EntityGiantFish.class, "GiantFish", 0x66B69C, 0x48B0BE);
		registerMob(EntityKelpFish.class, "KelpFish", 0x54B8DD, 0x34898D);
		registerMob(EntityFrozenWarrior.class, "FrozenWarrior", 0x94D4FF, 0xE0EAFF);
		registerMob(EntityStag.class, "Stag", 0xD8DFD6, 0x808174);

		//Bosses
		registerSpecial(EntityScorpius.class, "Scorpius");

		registerSpecial(EntityROCArrow.class, "ROCArrow");
		registerSpecial(EntityBullet.class, "ROCBullet");
		
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
	
	private static void registerMob(Class<? extends Entity> entity, String name, int foregroundEgg, int backgroundEgg) {
		EntityRegistry.registerModEntity(entity, name, entityID++, RealmsOfChaos.instance, 80, 5, true);
		EntityList.addMapping(entity, name, globalEntityID++, foregroundEgg, backgroundEgg);
	}
	
	private static void registerSpecial(Class<? extends Entity> entity, String name) {
		EntityRegistry.registerModEntity(entity, name, entityID++, RealmsOfChaos.instance, 80, 5, true);
		EntityList.addMapping(entity, name, globalEntityID++);
	}
}