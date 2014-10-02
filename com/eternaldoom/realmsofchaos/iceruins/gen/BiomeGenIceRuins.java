package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.ChunkPrimer;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.water.gen.BiomeGenWater;

public class BiomeGenIceRuins extends BiomeGenBase
{
    public BiomeGenIceRuins(int id)
    {
        super(id);
        this.spawnableWaterCreatureList.clear();
        this.topBlock = Blocks.snow.getDefaultState();
        this.fillerBlock = Blocks.snow.getDefaultState();
    }

    public BiomeGenBase.TempCategory getTempCategory()
    {
        return BiomeGenBase.TempCategory.COLD;
    }

    @Override
    public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, ChunkPrimer p_150573_3_, int p_150573_5_, int p_150573_6_, double p_150573_7_)
    {
        this.generateTerrainForBiome(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_5_, p_150573_6_, p_150573_7_);
    }
    
    public final void generateTerrainForBiome(World worldIn, Random p_180628_2_, ChunkPrimer p_180628_3_, int p_180628_4_, int p_180628_5_, double p_180628_6_)
    {
        boolean flag = true;
        IBlockState iblockstate = this.topBlock;
        IBlockState iblockstate1 = this.fillerBlock;
        int k = -1;
        int l = (int)(p_180628_6_ / 3.0D + 3.0D + p_180628_2_.nextDouble() * 0.25D);
        int i1 = p_180628_4_ & 15;
        int j1 = p_180628_5_ & 15;

        for (int k1 = 255; k1 >= 0; --k1)
        {
            if (k1 <= p_180628_2_.nextInt(5))
            {
                p_180628_3_.setBlockState(j1, k1, i1, Blocks.bedrock.getDefaultState());
            }
            else
            {
                IBlockState iblockstate2 = p_180628_3_.getBlockState(j1, k1, i1);

                if (iblockstate2.getBlock().getMaterial() == Material.air)
                {
                    k = -1;
                }
                else if (iblockstate2.getBlock() == ROCBlocks.frozen_stone)
                {
                    if (k == -1)
                    {
                        if (l <= 0)
                        {
                            iblockstate = null;
                            iblockstate1 = ROCBlocks.frozen_stone.getDefaultState();
                        }
                        else if (k1 >= 59 && k1 <= 64)
                        {
                            iblockstate = this.topBlock;
                            iblockstate1 = this.fillerBlock;
                        }

                        if (k1 < 63 && (iblockstate == null || iblockstate.getBlock().getMaterial() == Material.air))
                        {
                            if (this.func_180626_a(new BlockPos(p_180628_4_, k1, p_180628_5_)) < 0.15F)
                            {
                                iblockstate = Blocks.ice.getDefaultState();
                            }
                            else
                            {
                                iblockstate = Blocks.ice.getDefaultState();
                            }
                        }

                        k = l;

                        if (k1 >= 62)
                        {
                            p_180628_3_.setBlockState(j1, k1, i1, iblockstate);
                        }
                        else if (k1 < 56 - l)
                        {
                            iblockstate = null;
                            iblockstate1 = ROCBlocks.frozen_stone.getDefaultState();
                            p_180628_3_.setBlockState(j1, k1, i1, Blocks.gravel.getDefaultState());
                        }
                        else
                        {
                            p_180628_3_.setBlockState(j1, k1, i1, iblockstate1);
                        }
                    }
                    else if (k > 0)
                    {
                        --k;
                        p_180628_3_.setBlockState(j1, k1, i1, iblockstate1);

                        if (k == 0 && iblockstate1.getBlock() == Blocks.sand)
                        {
                            k = p_180628_2_.nextInt(4) + Math.max(0, k1 - 63);
                            iblockstate1 = iblockstate1.getValue(BlockSand.VARIANT_PROP) == BlockSand.EnumType.RED_SAND ? Blocks.red_sandstone.getDefaultState() : Blocks.sandstone.getDefaultState();
                        }
                    }
                }
            }
        }
    }
    
    public BiomeGenIceRuins setColor(int color){
		return (BiomeGenIceRuins) super.setColor(color);
    }
    
    public BiomeGenIceRuins setBiomeName(String name){
    	return (BiomeGenIceRuins) super.setBiomeName(name);
    }
    
    public BiomeGenIceRuins setTheHeight(BiomeGenBase.Height h){
    	return (BiomeGenIceRuins) super.setHeight(h);
    }
    
    public BiomeGenIceRuins setEnableSnow(){
    	return (BiomeGenIceRuins) super.setEnableSnow();
    }
    
    public BiomeGenIceRuins setTemperatureRainfall(float f1, float f2){
    	return (BiomeGenIceRuins) super.setTemperatureRainfall(f1, f2);
    }
}