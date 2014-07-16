package com.eternaldoom.realmsofchaos.overworld.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ROCBlocks {
	public static OverworldBlock citronite_ore;

	public static void init() {
		citronite_ore = new BlockCitroniteOre();

		citronite_ore.register("citronite_ore");
	}

}
