package com.eternaldoom.realmsofchaos.water.gen;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;
import com.eternaldoom.realmsofchaos.iceruins.gen.ChunkProviderIceRuins;

public class WorldProviderWater extends WorldProvider{

	@Override
	public void registerWorldChunkManager(){
		this.worldChunkMgr = new WorldChunkManagerHell(RealmsOfChaos.waterBiome, 0.8f);
		this.dimensionId = RealmsOfChaos.waterDimID;
	}
	
	public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderWater(worldObj, worldObj.getSeed(), worldObj.getWorldInfo().isMapFeaturesEnabled(), worldObj.getWorldInfo().getGeneratorOptions());
    }
	
	@SideOnly(Side.CLIENT)
    public float getCloudHeight()
    {
        return 225;
    }
	
	@Override
	public String getDimensionName() {
		return "Water"; //TODO: find a decent name for the dimension
	}
	
	@Override
	public boolean canRespawnHere(){
		return false;
	}

	@Override
	public String getInternalNameSuffix() {
		return "water";
	}
}
