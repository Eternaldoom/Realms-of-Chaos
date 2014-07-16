package com.eternaldoom.realmsofchaos.overworld.gen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class OverworldGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
				switch (world.provider.dimensionId) {
				case 0:
					generateOverworld(world, random, chunkX * 16, chunkZ * 16);
				case -1:
					generateNether(world, random, chunkX * 16, chunkZ * 16);
		
	}
	}
	
	public void generateOverworld(World world, Random random, int chunkX,
			int chunkZ){
		
	}
	
	public void generateNether(World world, Random random, int chunkX, int chunkZ){
		for(int i = 0; i < 35; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(90);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			(new WorldGenCharwoodTree()).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}	
	}
}
