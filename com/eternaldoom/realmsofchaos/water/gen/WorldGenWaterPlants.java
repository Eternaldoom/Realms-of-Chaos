package com.eternaldoom.realmsofchaos.water.gen;

import java.util.Random;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenWaterPlants extends WorldGenerator
{
    private Block plant;
    private int meta;

    public WorldGenWaterPlants(Block b, int m)
    {
        this.plant = b;
        this.meta = m;
    }

    public boolean generate(World world, Random rand, int i, int j, int k)
    {
        for (int l = 0; l < 144; l++)
        {
            int i1 = i + rand.nextInt(12) - rand.nextInt(12);
            int j1 = j + rand.nextInt(12) - rand.nextInt(12);
            int k1 = k + rand.nextInt(12) - rand.nextInt(12);

            if (world.getBlock(i1, j1, k1) == Blocks.water && j1 < 100 && world.getBlock(i1, j1-1, k1) == ROCBlocks.ocean_stone)
            {
                world.setBlock(i1, j1, k1, plant, meta, 2);
            }
        }

        return true;
    }
}