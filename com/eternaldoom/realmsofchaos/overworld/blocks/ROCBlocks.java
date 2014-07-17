package com.eternaldoom.realmsofchaos.overworld.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ROCBlocks {
	public static OverworldBlock citronite_ore;
    public static OverworldBlock citronite_block;
    public static Block extractor;
    public static Block extractor_on;
	
	public static OverworldBlock charwood_leaves;
	public static OverworldBlock charwood_log;
	public static OverworldBlock charwood_sapling;
	public static OverworldBlock netherrack_bricks;
    public static OverworldBlock charwood_planks;

	public static void init() {
		citronite_ore = new BlockCitroniteOre();
		charwood_leaves = new BlockCharwoodLeaves();
		charwood_log = new BlockCharwoodLog();
		charwood_sapling = new BlockCharwoodSapling();
		netherrack_bricks = new OverworldBlock(Material.rock, "realmsofchaos:netherrack_bricks", "bricksHellrock", 0.4f, 1.0f, OverworldBlock.soundTypePiston);
        citronite_block = new OverworldBlock(Material.glass, "realmsofchaos:citronite_block", "blockCitronite", 5.0f, 12.0f, OverworldBlock.soundTypeGlass);
        charwood_planks = new OverworldBlock(Material.wood, "realmsofchaos:charwood_planks", "planksCharwood", 4.0f, 2.5f, OverworldBlock.soundTypeWood);
        extractor = new BlockExtractor(false);
        extractor_on = new BlockExtractor(true);

		citronite_ore.register("citronite_ore");
		charwood_leaves.register("charwood_leaves");
		charwood_log.register("charwood");
		charwood_sapling.register("charwood_sapling");
		netherrack_bricks.register("netherrack_bricks");
        citronite_block.register("citronite_block");
        charwood_planks.register("charwood_planks");
        
        GameRegistry.registerBlock(extractor, "extractor");
        GameRegistry.registerBlock(extractor_on, "extractor_on");
	}

}
