package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.eternaldoom.realmsofchaos.ROCTabs;

public class BlockOceanGlassPane extends BlockPane{

	protected BlockOceanGlassPane() {
		super(Material.glass, false);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(3.5f);
		setResistance(0.0f);
		setUnlocalizedName("paneOcean");
	}

	@Override
	public EnumWorldBlockLayer getBlockLayer(){
		return EnumWorldBlockLayer.TRANSLUCENT;
	}
	
	public BlockOceanGlassPane register(String name){
		GameRegistry.registerBlock(this, name);
        ROCBlocks.blockNames.add(name);
		return this;
	}
}
