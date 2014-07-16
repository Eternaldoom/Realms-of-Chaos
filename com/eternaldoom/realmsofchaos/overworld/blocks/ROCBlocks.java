package com.eternaldoom.realmsofchaos.overworld.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ROCBlocks {
	public static OverworldBlock citronite_ore;
	
	public static OverworldBlock charwood_leaves;
	public static BlockCharwoodLog charwood_log;
	public static OverworldBlock charwood_sapling;

	public static void init() {
		citronite_ore = new BlockCitroniteOre();
		charwood_leaves = new BlockCharwoodLeaves();
		charwood_log = new BlockCharwoodLog();
		charwood_sapling = new BlockCharwoodSapling();

		citronite_ore.register("citronite_ore");
		charwood_leaves.register("charwood_leaves");
		charwood_log.register("charwood");
		charwood_sapling.register("charwood_sapling");
	}

}
