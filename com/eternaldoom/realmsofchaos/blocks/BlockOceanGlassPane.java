package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;

import com.eternaldoom.realmsofchaos.ROCTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockOceanGlassPane extends BlockPane{

	protected BlockOceanGlassPane() {
		super("realmsofchaos:ocean_glass", "realmsofchaos:ocean_glass", Material.glass, false);
		setCreativeTab(ROCTabs.OverworldBlocks);
		setHardness(3.5f);
		setResistance(0.0f);
		setBlockName("paneOcean");
	}

	public int getRenderBlockPass(){
		return 1;
	}
	
	public BlockOceanGlassPane register(String name){
		GameRegistry.registerBlock(this, name);
		return this;
	}
}
