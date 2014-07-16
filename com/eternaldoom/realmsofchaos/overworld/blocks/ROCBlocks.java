package com.eternaldoom.realmsofchaos.overworld.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ROCBlocks {
	public static OverworldBlock citronite_ore;
	
	public static OverworldBlock charwood_leaves;
	public static OverworldBlock charwood_log;
	public static OverworldBlock charwood_sapling;
	public static OverworldBlock netherrack_bricks;

	public static void init() {
		citronite_ore = new BlockCitroniteOre();
		charwood_leaves = new BlockCharwoodLeaves();
		charwood_log = new BlockCharwoodLog();
		charwood_sapling = new BlockCharwoodSapling();
		netherrack_bricks = (OverworldBlock) new OverworldBlock(Material.rock, "realmsofchaos:netherrack_bricks", "bricksHellrock", 0.4f, 1.0f).setStepSound(Block.soundTypePiston);

		citronite_ore.register("citronite_ore");
		charwood_leaves.register("charwood_leaves");
		charwood_log.register("charwood");
		charwood_sapling.register("charwood_sapling");
		netherrack_bricks.register("netherrack_bricks");
	}

}
