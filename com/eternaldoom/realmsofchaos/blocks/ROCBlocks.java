package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import com.eternaldoom.realmsofchaos.itemblock.ItemBlockModStoneBrick;

import cpw.mods.fml.common.registry.GameRegistry;

public class ROCBlocks {
	//Overworld
	public static ROCModBlock citronite_ore;
    public static ROCModBlock citronite_block;
    public static Block extractor;
    public static Block extractor_on;
    public static ROCModBlock xylite_ore;
    public static ROCModBlock xylite_block;
    public static ROCModBlock heliotrope_ore;
    public static ROCModBlock heliotrope_block;
    public static Block water_portal;
    public static ROCModBlock compressed_lava;
    public static ROCModBlock aquatic_block;
    public static ROCModBlock osmaralt_ore;
    public static ROCModBlock osmaralt_block;
	
    //Nether
	public static ROCModBlock charwood_leaves;
	public static ROCModBlock charwood_log;
	public static ROCModBlock charwood_sapling;
	public static ROCModBlock netherrack_bricks;
    public static ROCModBlock charwood_planks;
    
    //Ocean
    public static Fluid waterportal;
    public static ROCModBlock ocean_stone;
    public static ROCModBlock ocean_cobblestone;
    public static ROCModBlock oceanstone_bricks;
    public static ROCModBlock neptunite_ore;
    public static ROCModBlock neptunite_block;
    public static ROCModBlock ocean_glass;
    public static BlockOceanGlassPane ocean_glass_pane;
    public static BlockOceanChest ocean_chest;
    
    //Ice Ruins
    public static ROCModBlock ice_portal;
    public static ROCModBlock fractonite_ore;
    public static ROCModBlock fractonite_block;
    public static ROCModBlock frozen_stone;
    public static ROCModBlock frozen_cobblestone;
    public static ROCModBlock frozen_stone_bricks;
    
    private static String[] modStoneBricksTextures = {null, "cracked", "carved"};

	public static void init() {
		waterportal = new FluidWaterPortal();
		FluidRegistry.registerFluid(waterportal);
		
		citronite_ore = new BlockCitroniteOre().register("citronite_ore");
		charwood_leaves = new BlockCharwoodLeaves().register("charwood_leaves");
		charwood_log = new BlockCharwoodLog().register("charwood");
		charwood_sapling = new BlockCharwoodSapling().register("charwood_sapling");
		netherrack_bricks = new ROCModBlock(Material.rock, "realmsofchaos:netherrack_bricks", "bricksHellrock", 0.4f, 1.0f, ROCModBlock.soundTypePiston).register("netherrack_bricks");
        citronite_block = new ROCModBlock(Material.glass, "realmsofchaos:citronite_block", "blockCitronite", 5.0f, 12.0f, ROCModBlock.soundTypeGlass).register("citronite_block");
        charwood_planks = new ROCModBlock(Material.wood, "realmsofchaos:charwood_planks", "planksCharwood", 4.0f, 2.5f, ROCModBlock.soundTypeWood).register("charwood_planks");
        extractor = new BlockExtractor(false).register("extractor");
        extractor_on = new BlockExtractor(true).register("extractor_on");
        xylite_ore = new BlockXyliteOre().register("xylite_ore");
        xylite_block = new BlockXylite();
        heliotrope_ore = new ROCModBlock(Material.rock, "realmsofchaos:heliotrope_ore", "oreHeliotrope", 5.0f, 14.5f, ROCModBlock.soundTypePiston).register("heliotrope_ore");
        heliotrope_block = new ROCModBlock(Material.rock, "realmsofchaos:heliotrope_block", "blockHeliotrope", 5.5f, 1000000.0f, ROCModBlock.soundTypePiston).register("heliotrope_block");
        water_portal = new BlockWaterPortal();
        ocean_stone = new BlockOceanStone();
        ocean_cobblestone = new ROCModBlock(Material.rock, "realmsofchaos:ocean_cobblestone", "cobblestoneOcean", 8.5f, 4.5f, ROCModBlock.soundTypePiston).register("ocean_cobblestone");
        oceanstone_bricks = new ROCMetadataBlock(3, modStoneBricksTextures, Material.rock, "realmsofchaos:oceanstone_bricks", "bricksOceanstone", 8.5f, 5.5f, ROCModBlock.soundTypePiston).register(ItemBlockModStoneBrick.class, "oceanstone_bricks");
        neptunite_ore = new ROCModBlock(Material.rock, "realmsofchaos:neptunite_ore", "oreNeptunite", 11f, 1000000f, ROCModBlock.soundTypePiston).register("neptunite_ore");
        neptunite_block = new ROCModBlock(Material.iron, "realmsofchaos:neptunite_block", "blockNeptunite", 14f, 14f, ROCModBlock.soundTypeMetal).register("neptunite_block");
        ocean_glass = new BlockOceanGlass().register("ocean_glass");
        ocean_glass_pane = new BlockOceanGlassPane().register("ocean_glass_pane");
        ocean_chest = new BlockOceanChest().register("ocean_chest");
        compressed_lava = new BlockCompressedLava().register("compressed_lava");
        aquatic_block = new BlockAquatic().register("aquatic_block");
        fractonite_ore = new ROCModBlock(Material.rock, "realmsofchaos:fractonite_ore", "oreFractonite", 0f, 0f, ROCModBlock.soundTypeGlass).register("fractonite_ore");
        fractonite_block = new ROCModBlock(Material.ice, "realmsofchaos:fractonite_block", "blockFractonite", 19.5f, 1000000f, ROCModBlock.soundTypePiston).register("fractonite_block");
        ice_portal = new BlockIcePortal().register("ice_ruins_portal");
        frozen_stone = new BlockFrozenStone().register("frozen_stone");
        frozen_cobblestone = new ROCModBlock(Material.rock, "realmsofchaos:frozen_cobblestone", "cobblestoneFrozen", 18f, 5f, ROCModBlock.soundTypePiston).register("frozen_cobblestone");
        frozen_stone_bricks = new ROCMetadataBlock(3, modStoneBricksTextures, Material.rock, "realmsofchaos:frozen_stone_bricks", "stoneBricksFrozen", 18.5f, 7.5f, ROCModBlock.soundTypePiston).register(ItemBlockModStoneBrick.class, "frozen_stone_bricks");
        osmaralt_ore = new ROCModBlock(Material.rock, "realmsofchaos:osmaralt_ore", "oreOsmaralt", 20f, 1000000f, ROCModBlock.soundTypePiston).register("osmaralt_ore");
        osmaralt_block = new ROCModBlock(Material.rock, "realmsofchaos:osmaralt_block", "blockOsmaralt", 20f, 1000000f, ROCModBlock.soundTypePiston).register("osmaralt_blocks");

        GameRegistry.registerBlock(water_portal, "water_portal");
	}
}