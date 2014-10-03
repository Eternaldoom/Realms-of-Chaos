package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;

public class BlockDoubleROCSlab extends BlockROCSlab{

	public BlockDoubleROCSlab(Material mat, String name, float hardness, float resistance, SoundType stepSound) {
		super(mat, name, hardness, resistance, stepSound);
        setCreativeTab(null);
	}

	@Override
	public boolean isDouble(){
		return true;
	}
}
