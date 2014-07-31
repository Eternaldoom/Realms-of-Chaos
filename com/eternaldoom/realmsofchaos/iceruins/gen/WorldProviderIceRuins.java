package com.eternaldoom.realmsofchaos.iceruins.gen;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WorldProviderIceRuins extends WorldProvider{

	@Override
	public void registerWorldChunkManager(){
		this.worldChunkMgr = new WorldChunkManagerHell(RealmsOfChaos.iceBiome, 0.8f);
		this.dimensionId = RealmsOfChaos.iceDimID;
	}
	
	public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderIceRuins(worldObj, worldObj.getSeed(), true);
    }
	
	@SideOnly(Side.CLIENT)
    public float getCloudHeight()
    {
        return 100;
    }
	
	@Override
	public String getDimensionName() {
		return "Ice Ruins";
	}
	
	@Override
	public boolean canRespawnHere(){
		return false;
	}
}
