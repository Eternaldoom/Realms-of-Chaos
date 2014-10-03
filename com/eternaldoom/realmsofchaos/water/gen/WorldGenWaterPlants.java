package com.eternaldoom.realmsofchaos.water.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

public class WorldGenWaterPlants extends WorldGenerator
{
    private Block plant;
    private int meta;

    public WorldGenWaterPlants(Block b, int m)
    {
        this.plant = b;
        this.meta = m;
    }

    public boolean generate(World world, Random rand, BlockPos pos)
    {
    	int i = pos.getX(), j = pos.getY(), k = pos.getZ();
    	
        for (int l = 0; l < 144; l++)
        {
        	BlockPos randPos = new BlockPos(i + rand.nextInt(12) - rand.nextInt(12), j + rand.nextInt(12) - rand.nextInt(12), k + rand.nextInt(12) - rand.nextInt(12));

            if (world.getBlockState(randPos).getBlock() == Blocks.water && randPos.getY() < 100 && world.getBlockState(randPos.offsetDown()).getBlock() == ROCBlocks.ocean_stone)
            {
                world.setBlockState(pos, plant.getStateFromMeta(meta), 2);
            }
        }

        return true;
    }
}