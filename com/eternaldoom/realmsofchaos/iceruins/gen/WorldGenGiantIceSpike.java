package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenGiantIceSpike extends WorldGenerator
{
	private BlockPos helperPos = new BlockPos(0, 0, 0);
    private World helperWorld = null;
    
    public boolean generate(World world, Random rand, BlockPos pos)
    {
    	int i = pos.getX(), j = pos.getY(), k = pos.getZ();
    	helperWorld = world;
    	
        while (world.isAirBlock(pos) && j > 2)
        {
            --j;
        }

        if (world.getBlockState(pos).getBlock() != Blocks.snow)
        {
            return false;
        }
        else
        {
            j += rand.nextInt(4);
            int l = rand.nextInt(4) + 20;
            int yCoordthing = rand.nextInt(20)+50;
            int i1 = l / 4 + rand.nextInt(2);

            if (i1 > 1 && rand.nextInt(60) == 0)
            {
                j += 10 + rand.nextInt(30);
            }

            int j1;
            int k1;
            int l1;

            for (j1 = 0; j1 < l; ++j1)
            {
            	for(int yCoord = 0; yCoord < yCoordthing; ++yCoord){
                float f = (1.0F - (float)j1 / (float)l) * (float)i1;
                k1 = MathHelper.ceiling_float_int(f);

                for (l1 = -k1; l1 <= k1; ++l1)
                {
                    float f1 = (float)MathHelper.abs_int(l1) - 0.25F;

                    for (int i2 = -k1; i2 <= k1; ++i2)
                    {
                        float f2 = (float)MathHelper.abs_int(i2) - 0.25F;

                        if ((l1 == 0 && i2 == 0 || f1 * f1 + f2 * f2 <= f * f) && (l1 != -k1 && l1 != k1 && i2 != -k1 && i2 != k1 || rand.nextFloat() <= 0.75F))
                        {
                            Block block = world.getBlockState(pos.add(l1, yCoord, i2)).getBlock();

                            if (block.getMaterial() == Material.air || block == Blocks.dirt || block == Blocks.snow || block == Blocks.ice)
                            {
                                this.setBlock(i + l1, j + j1, k + i2, Blocks.packed_ice);
                            }

                            if (j1 != 0 && k1 > 1)
                            {
                                block = world.getBlockState(new BlockPos(i + l1, j - yCoord, k + i2)).getBlock();

                                if (block.getMaterial() == Material.air || block == Blocks.dirt || block == Blocks.snow || block == Blocks.ice)
                                {
                                    this.setBlock(i + l1, j - yCoord, k + i2, Blocks.packed_ice);
                                }
                            }
                        }
                    }
                }
            }
        }

            j1 = i1 - 1;

            if (j1 < 0)
            {
                j1 = 0;
            }
            else if (j1 > 1)
            {
                j1 = 1;
            }

            for (int j2 = -j1; j2 <= j1; ++j2)
            {
                k1 = -j1;

                while (k1 <= j1)
                {
                    l1 = j - 1;
                    int k2 = 50;

                    if (Math.abs(j2) == 1 && Math.abs(k1) == 1)
                    {
                        k2 = rand.nextInt(5);
                    }

                    while (true)
                    {
                        if (l1 > 125)
                        {
                            Block block1 = world.getBlockState(new BlockPos(i + j2, l1, k + k1)).getBlock();

                            if (block1.getMaterial() == Material.air || block1 == Blocks.dirt || block1 == Blocks.snow || block1 == Blocks.ice || block1 == Blocks.packed_ice)
                            {
                                this.setBlock(i + j2, l1, k + k1, Blocks.packed_ice);
                                --l1;
                                --k2;

                                if (k2 <= 0)
                                {
                                    l1 -= rand.nextInt(5) + 1;
                                    k2 = rand.nextInt(5);
                                }

                                continue;
                            }
                        }

                        ++k1;
                        break;
                    }
                }
            }

            return true;
        }
    }
    
    private void setBlock(int i, int j, int k, Block block){
    	this.helperWorld.setBlockState(this.helperPos.add(i, j, k), block.getDefaultState());
    }
    
    private void setBlock(int i, int j, int k, Block block, int meta, int flag){
    	this.helperWorld.setBlockState(this.helperPos.add(i, j, k), block.getStateFromMeta(meta), flag);
    }
}