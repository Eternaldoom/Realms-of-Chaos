package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockROCLog extends ROCModBlock{

	public BlockROCLog(Material mat, String name, float hard, float resist, SoundType sound) {
		super(mat, name, hard, resist, sound);
		setTickRandomly(true);
	}
}
