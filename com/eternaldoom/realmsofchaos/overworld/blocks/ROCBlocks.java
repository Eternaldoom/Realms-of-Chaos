package com.eternaldoom.realmsofchaos.overworld.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ROCBlocks {
	//Overworld
	public static OverworldBlock citronite_ore;
    public static OverworldBlock citronite_block;
    public static Block extractor;
    public static Block extractor_on;
    public static OverworldBlock xylite_ore;
    public static OverworldBlock xylite_block;
    public static OverworldBlock heliotrope_ore;
    public static OverworldBlock heliotrope_block;
    public static Block water_portal;
	
    //Nether
	public static OverworldBlock charwood_leaves;
	public static OverworldBlock charwood_log;
	public static OverworldBlock charwood_sapling;
	public static OverworldBlock netherrack_bricks;
    public static OverworldBlock charwood_planks;
    
    //Ocean
    public static Fluid waterportal;
    public static OverworldBlock ocean_stone;
    public static OverworldBlock ocean_cobblestone;
    public static OverworldBlock oceanstone_bricks;
    public static OverworldBlock neptunite_ore;
    public static OverworldBlock neptunite_block;
    public static OverworldBlock ocean_glass;
    public static BlockOceanGlassPane ocean_glass_pane;
    public static BlockOceanChest ocean_chest;

	public static void init() {
		waterportal = new FluidWaterPortal();
		FluidRegistry.registerFluid(waterportal);
		
		citronite_ore = new BlockCitroniteOre().register("citronite_ore");
		charwood_leaves = new BlockCharwoodLeaves().register("charwood_leaves");
		charwood_log = new BlockCharwoodLog().register("charwood");
		charwood_sapling = new BlockCharwoodSapling().register("charwood_sapling");
		netherrack_bricks = new OverworldBlock(Material.rock, "realmsofchaos:netherrack_bricks", "bricksHellrock", 0.4f, 1.0f, OverworldBlock.soundTypePiston).register("netherrack_bricks");
        citronite_block = new OverworldBlock(Material.glass, "realmsofchaos:citronite_block", "blockCitronite", 5.0f, 12.0f, OverworldBlock.soundTypeGlass).register("citronite_block");
        charwood_planks = new OverworldBlock(Material.wood, "realmsofchaos:charwood_planks", "planksCharwood", 4.0f, 2.5f, OverworldBlock.soundTypeWood).register("charwood_planks");
        extractor = new BlockExtractor(false).register("extractor");
        extractor_on = new BlockExtractor(true).register("extractor_on");
        xylite_ore = new BlockXyliteOre().register("xylite_ore");
        xylite_block = new BlockXylite();
        heliotrope_ore = new OverworldBlock(Material.rock, "realmsofchaos:heliotrope_ore", "oreHeliotrope", 5.0f, 14.5f, OverworldBlock.soundTypePiston).register("heliotrope_ore");
        heliotrope_block = new OverworldBlock(Material.rock, "realmsofchaos:heliotrope_block", "blockHeliotrope", 5.5f, 1000000.0f, OverworldBlock.soundTypePiston).register("heliotrope_block");
        water_portal = new BlockWaterPortal();
        ocean_stone = new BlockOceanStone();
        ocean_cobblestone = new OverworldBlock(Material.rock, "realmsofchaos:ocean_cobblestone", "cobblestoneOcean", 8.5f, 4.5f, OverworldBlock.soundTypePiston).register("ocean_cobblestone");
        oceanstone_bricks = new OverworldBlock(Material.rock, "realmsofchaos:oceanstone_bricks", "bricksOceanstone", 8.5f, 5.5f, OverworldBlock.soundTypePiston).register("oceanstone_bricks");
        neptunite_ore = new OverworldBlock(Material.rock, "realmsofchaos:neptunite_ore", "oreNeptunite", 11f, 1000000f, OverworldBlock.soundTypePiston).register("neptunite_ore");
        neptunite_block = new OverworldBlock(Material.iron, "realmsofchaos:neptunite_block", "blockNeptunite", 14f, 14f, OverworldBlock.soundTypeMetal).register("neptunite_block");
        ocean_glass = new BlockOceanGlass().register("ocean_glass");
        ocean_glass_pane = new BlockOceanGlassPane().register("ocean_glass_pane");
        ocean_chest = new BlockOceanChest().register("ocean_chest");
        
        GameRegistry.registerBlock(water_portal, "water_portal");
	}

}
