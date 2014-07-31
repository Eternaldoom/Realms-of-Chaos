package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenIceRuins extends BiomeGenBase
{
    public BiomeGenIceRuins(int id)
    {
        super(id);
        this.spawnableWaterCreatureList.clear();
        this.topBlock = Blocks.snow;
        this.fillerBlock = Blocks.snow;
    }

    public BiomeGenBase.TempCategory getTempCategory()
    {
        return BiomeGenBase.TempCategory.COLD;
    }

    @Override
    public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_)
    {
        super.genTerrainBlocks(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
    }
    
    @Override
    public void decorate(World p_76728_1_, Random p_76728_2_, int p_76728_3_, int p_76728_4_){
    	for (int k = 0; k < 3; ++k)
        {
            int l = p_76728_3_ + p_76728_2_.nextInt(16) + 8;
            int i1 = p_76728_4_ + p_76728_2_.nextInt(16) + 8;
            WorldGenGiantIceSpike spikes = new WorldGenGiantIceSpike();
            if(p_76728_2_.nextInt(13) == 9) spikes.generate(p_76728_1_, p_76728_2_, l, p_76728_1_.getHeightValue(l, i1), i1);
        }
    }
}