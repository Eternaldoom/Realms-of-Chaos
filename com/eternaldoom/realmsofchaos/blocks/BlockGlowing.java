package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.material.Material;

public class BlockGlowing extends ROCModBlock{

	public BlockGlowing(Material mat, String name, float hard,
			float resist, SoundType sound, float lightLevel) {
		super(mat, name, hard, resist, sound);
		setLightLevel(lightLevel/15);
	}

}
