package com.eternaldoom.realmsofchaos.entity;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;

import net.minecraft.entity.EnumCreatureType;
import cpw.mods.fml.common.registry.EntityRegistry;

public class Entities {
	
	public static void init(){
		EntityRegistry.registerGlobalEntityID(EntityAquaticGolem.class, "AquaticGolem", EntityRegistry.findGlobalUniqueEntityId(), 0x7AE8FF, 0x47FFE2);
	}
}