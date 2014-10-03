package com.eternaldoom.realmsofchaos.iceruins.gen;

import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;

public class WorldProviderIceRuins extends WorldProvider{

	@Override
	public void registerWorldChunkManager(){
		this.worldChunkMgr = new WorldChunkManagerHell(RealmsOfChaos.iceBiome, 0.8f);
		this.dimensionId = RealmsOfChaos.iceDimID;
	}
	
	public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderIceRuins(worldObj, worldObj.getSeed(), worldObj.getWorldInfo().isMapFeaturesEnabled(), worldObj.getWorldInfo().getGeneratorOptions());
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

	@Override
	public String getInternalNameSuffix() {
		return "iceruins";
	}
}
