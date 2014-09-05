package com.eternaldoom.realmsofchaos.blocks;

import com.eternaldoom.realmsofchaos.client.RenderExtractor;

import net.minecraft.block.material.Material;

public class BlockFrozenLeaves extends BlockROCLeaves{

	public BlockFrozenLeaves() {
		super(Material.plants, "realmsofchaos:frozen_leaves", "leavesFrozen", 0.2f, 0f, soundTypeGrass);
	}
}
