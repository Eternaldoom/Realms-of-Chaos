package com.eternaldoom.realmsofchaos.gen;

import java.util.Random;

import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

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
import com.eternaldoom.realmsofchaos.water.gen.WorldGenWaterPlants;

public class OverworldGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
				switch (world.provider.getDimensionId()) {
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
		for (int i = 0; i < 4; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenBigRuins().generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
		for (int i = 0; i < 4; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenRuinsStatue().generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
		
		for (int i = 0; i < 4; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenRuinsTower().generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
		
		for (int i = 0; i < 2; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenRuinsHouse().generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
		
		for (int i = 0; i < 4; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenRuinsWell().generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
		
		for (int i = 0; i < 2; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			if(random.nextInt(300) == 150) new WorldGenGiantIceSpike().generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
		
		for (int i = 0; i < 80; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenIceTree1().generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
		
		for (int i = 0; i < 1; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			if(random.nextInt(5) == 1) new WorldGenIceMountain().generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
		
		for (int i = 0; i < 2; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(12);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenMinable(ROCBlocks.osmaralt_ore.getDefaultState(), 4, BlockHelper.forBlock(ROCBlocks.frozen_stone)).generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
	}

	public void generateOverworld(World world, Random random, int chunkX, int chunkZ){
		for (int i = 0; i < 2; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(16);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenMinable(ROCBlocks.heliotrope_ore.getDefaultState(), 7).generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
		
		for (int i = 0; i < 2; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(16);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenMinable(ROCBlocks.citronite_ore.getDefaultState(), 5).generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
		
		for (int i = 0; i < 3; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(16);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenMinable(ROCBlocks.xylite_ore.getDefaultState(), 3).generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
	}
	
	public void generateNether(World world, Random random, int chunkX, int chunkZ){
		for(int i = 0; i < 35; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(90);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenCharwoodTree().generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
		
		for(int i = 0; i < 2; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(60);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			if(random.nextInt(20) == 0) new WorldGenNetherDungeon().generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
	}
	
	public void generateWater(World world, Random random, int chunkX, int chunkZ){
		for (int i = 0; i < 4; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(40);
			int Zcoord1 = chunkZ + random.nextInt(16);
			
			new WorldGenMinable(ROCBlocks.neptunite_ore.getDefaultState(), 5, BlockHelper.forBlock(ROCBlocks.ocean_stone)).generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
		
		for (int i = 0; i < 2; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = 127;
			int Zcoord1 = chunkZ + random.nextInt(16);
			if(random.nextInt(500) == 50) new WorldGenSurfaceDungeon().generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
		
		for (int i = 0; i < 3; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Zcoord1 = chunkZ + random.nextInt(16);
			int Ycoord1 = random.nextInt(120);
			
			if (world.getBlockState(new BlockPos(Xcoord1, Ycoord1, Zcoord1)).getBlock() == Blocks.water){
				for(int down = Ycoord1; down > 0; down--){
					Ycoord1 = down;
					if (world.getBlockState(new BlockPos(Xcoord1, Ycoord1-1, Zcoord1)).getBlock() != Blocks.water)break;
				}
			}
			if (world.getBlockState(new BlockPos(Xcoord1, Ycoord1, Zcoord1)).getBlock() != Blocks.water){
				for(int down = Ycoord1; down < 120; down++){
					Ycoord1 = down;
					if (world.getBlockState(new BlockPos(Xcoord1, Ycoord1-1, Zcoord1)).getBlock() != Blocks.water)break;
				}
			}
			
			if(random.nextInt(5) == 3)new WorldGenWaterPlants(ROCBlocks.seaweed, 0).generate(world, random, new BlockPos(Xcoord1, Ycoord1, Zcoord1));
		}
	}
}
