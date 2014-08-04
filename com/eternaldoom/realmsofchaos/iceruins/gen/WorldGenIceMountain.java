package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenIceMountain extends WorldGenerator{

	@Override
	public boolean generate(World world, Random rand, int i, int j, int k) {
		
		Random random = new Random();
		
		for (int o = 1; o < 20; o++){
			
			world.setBlock(i+2, j+o, k+2, Blocks.ice);
			
			for(int r = 1; r<20;r++){
				world.setBlock(i+2+r, j, k+2, Blocks.ice);
				
				int tri = (int)Math.sqrt((double)(o*o)+(double)(r*r));
				
				world.setBlock(i+22-tri, j+tri, k+2, Blocks.ice);
				
				for(int a = tri+j; a<tri+j+random.nextInt(12); a++){
					world.setBlock(i+22-tri, a, k+2, Blocks.ice);
				}
				
				for(int down = tri+j-1; down>j; down--){
					if(world.getBlock(i-tri+22, down, k+2) == Blocks.air){
						world.setBlock(i-tri+22, down, k+2, Blocks.ice);
					}else if(world.getBlock(i-tri+22, down, k+2) != Blocks.air){
						break;
					}
				}
			}
		}
		
		return true;
	}

}
