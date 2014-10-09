package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.eternaldoom.realmsofchaos.ROCTabs;
public class ROCModBlock extends Block{

	public String blockName;
	
	public ROCModBlock(Material mat, String name, float hard, float resist, SoundType sound) {
		super(mat);
		this.setUnlocalizedName(name);
		this.setHardness(hard);
		this.setResistance(resist);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(sound);
		
		blockName = name;
	}
	
	public ROCModBlock register(String name){
		GameRegistry.registerBlock(this, name);
        ROCBlocks.blockNames.add(name);
		return this;
	}
}
