package com.eternaldoom.realmsofchaos.overworld.gen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.iceruins.gen.WorldGenBigRuins;
import com.eternaldoom.realmsofchaos.iceruins.gen.WorldGenGiantIceSpike;
import com.eternaldoom.realmsofchaos.iceruins.gen.WorldGenIceMountain;
import com.eternaldoom.realmsofchaos.iceruins.gen.WorldGenIceTree1;
import com.eternaldoom.realmsofchaos.iceruins.gen.WorldGenRuinsHouse;
import com.eternaldoom.realmsofchaos.iceruins.gen.WorldGenRuinsStatue;
import com.eternaldoom.realmsofchaos.iceruins.gen.WorldGenRuinsTower;
import com.eternaldoom.realmsofchaos.iceruins.gen.WorldGenRuinsWell;
import com.eternaldoom.realmsofchaos.water.gen.WorldGenSurfaceDungeon;

import cpw.mods.fml.common.IWorldGenerator;

public class OverworldGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
				switch (world.provider.dimensionId) {
				case 0:
					generateOverworld(world, random, chunkX * 16, chunkZ * 16);
					break;
				case -1:
					generateNether(world, random, chunkX * 16, chunkZ * 16);
					break;
				case 23:
					generateWater(world, random, chunkX * 16, chunkZ * 16);
					break;
				case 24:
					generateIceRuins(world, random, chunkX * 16, chunkZ * 16);
		
	}
	}
	
	private void generateIceRuins(World world, Random random, int chunkX, int chunkZ) {
		for (int i = 0; i < 2; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenBigRuins().generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
		for (int i = 0; i < 4; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenRuinsStatue().generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
		
		for (int i = 0; i < 4; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenRuinsTower().generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
		
		for (int i = 0; i < 2; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenRuinsHouse().generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
		
		for (int i = 0; i < 4; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenRuinsWell().generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
		
		for (int i = 0; i < 2; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			if(random.nextInt(300) == 150) new WorldGenGiantIceSpike().generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
		
		for (int i = 0; i < 80; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenIceTree1().generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
		
		for (int i = 0; i < 1; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			if(random.nextInt(3) == 1) new WorldGenIceMountain().generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
	}

	public void generateOverworld(World world, Random random, int chunkX, int chunkZ){
		for (int i = 0; i < 2; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(16);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenMinable(ROCBlocks.heliotrope_ore, 7).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
		
		for (int i = 0; i < 2; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(16);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenMinable(ROCBlocks.citronite_ore, 5).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
		
		for (int i = 0; i < 3; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(16);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenMinable(ROCBlocks.xylite_ore, 3).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
	}
	
	public void generateNether(World world, Random random, int chunkX, int chunkZ){
		for(int i = 0; i < 35; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(90);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenCharwoodTree().generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}	
	}
	
	public void generateWater(World world, Random random, int chunkX, int chunkZ){
		for (int i = 0; i < 4; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(40);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenMinable(ROCBlocks.neptunite_ore, 5, ROCBlocks.ocean_stone).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
		
		for (int i = 0; i < 2; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = 127;
			int Zcoord1 = chunkZ + random.nextInt(16);
			if(random.nextInt(500) == 50) new WorldGenSurfaceDungeon().generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
	}
}
