package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import com.eternaldoom.realmsofchaos.itemblock.ItemBlockModSlab;
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
    public static ROCModBlock fake_ice;
	
    //Nether
	public static ROCModBlock charwood_leaves;
	public static ROCModBlock charwood_log;
	public static ROCModBlock charwood_sapling;
	public static ROCModBlock netherrack_bricks;
	public static BlockROCStairs netherrack_brick_stairs;
	public static BlockROCSlab netherrack_brick_slab;
	public static BlockROCSlab netherrack_brick_slab_double;
    public static ROCModBlock charwood_planks;
    public static Block charwood_stairs;
    public static BlockROCSlab charwood_slab;
	public static BlockROCSlab charwood_slab_double;
	public static ROCModBlock flamestone_block;
    
    //Ocean
    public static Fluid waterportal;
    public static ROCModBlock ocean_stone;
    public static BlockROCStairs oceanstone_stairs;
    public static BlockROCSlab oceanstone_slab;
    public static BlockROCSlab oceanstone_slab_double;
    public static ROCModBlock ocean_cobblestone;
    public static BlockROCStairs ocean_cobblestone_stairs;
    public static BlockROCSlab ocean_cobblestone_slab;
    public static BlockROCSlab ocean_cobblestone_slab_double;
    public static ROCModBlock oceanstone_bricks;
    public static BlockROCStairs oceanstone_brick_stairs;
    public static BlockROCSlab oceanstone_brick_slab;
    public static BlockROCSlab oceanstone_brick_slab_double;
    public static ROCModBlock neptunite_ore;
    public static ROCModBlock neptunite_block;
    public static ROCModBlock ocean_glass;
    public static BlockOceanGlassPane ocean_glass_pane;
    public static BlockOceanChest ocean_chest;
    public static ROCModBlock seaweed;
    
    //Ice Ruins
    public static ROCModBlock ice_portal;
    public static ROCModBlock fractonite_ore;
    public static ROCModBlock fractonite_block;
    public static ROCModBlock frozen_stone;
    public static BlockROCStairs frozen_stone_stairs;
    public static BlockROCSlab frozen_stone_slab;
    public static BlockROCSlab frozen_stone_slab_double;
    public static ROCModBlock frozen_cobblestone;
    public static BlockROCStairs frozen_cobblestone_stairs;
    public static BlockROCSlab frozen_cobblestone_slab;
    public static BlockROCSlab frozen_cobblestone_slab_double;
    public static ROCModBlock frozen_stone_bricks;
    public static BlockROCStairs frozen_stone_brick_stairs;
    public static BlockROCSlab frozen_stone_brick_slab;
    public static BlockROCSlab frozen_stone_brick_slab_double;
    public static ROCModBlock frozen_log;
    public static ROCModBlock frozen_leaves;
    
    private static String[] modStoneBricksTextures = {null, "cracked", "carved"};

	public static void init() {
		waterportal = new FluidWaterPortal();
		FluidRegistry.registerFluid(waterportal);
		
		citronite_ore = new BlockCitroniteOre().register("citronite_ore");
		charwood_leaves = new BlockCharwoodLeaves().register("charwood_leaves");
		charwood_log = new BlockROCLog(Material.rock, "realmsofchaos:charwood_log", "logCharwood", 1.5f, 1000000.0f, ROCModBlock.soundTypePiston).register("charwood");
		charwood_sapling = new BlockCharwoodSapling().register("charwood_sapling");
		netherrack_bricks = new ROCModBlock(Material.rock, "realmsofchaos:netherrack_bricks", "bricksHellrock", 0.4f, 1.0f, ROCModBlock.soundTypePiston).register("netherrack_bricks");
		netherrack_brick_stairs = new BlockROCStairs(netherrack_bricks, 0, "stairsHellrockBrick").register("netherrack_brick_stairs");
		netherrack_brick_slab = new BlockROCSlab(false, netherrack_bricks, 0.4f, 1.0f, "slabHellrockBrick");
		netherrack_brick_slab_double = new BlockROCSlab(true, netherrack_bricks, 0.4f, 1.0f, "slabHellrockBrick", netherrack_brick_slab);
		registerSlab("netherrack_brick_slab", "netherrack_brick_slab_double", netherrack_brick_slab, netherrack_brick_slab_double);
        citronite_block = new ROCModBlock(Material.rock, "realmsofchaos:citronite_block", "blockCitronite", 5.0f, 12.0f, ROCModBlock.soundTypeGlass).register("citronite_block");
        charwood_planks = new ROCModBlock(Material.wood, "realmsofchaos:charwood_planks", "planksCharwood", 4.0f, 2.5f, ROCModBlock.soundTypeWood).register("charwood_planks");
        charwood_stairs = new BlockROCStairs(charwood_planks, 0, "stairsCharwood").register("charwood_stairs");
        charwood_slab = new BlockROCSlab(false, charwood_planks, 0.4f, 1.0f, "slabCharwood");
		charwood_slab_double = new BlockROCSlab(true, charwood_planks, 0.4f, 1.0f, "slabCharwood", charwood_slab);
		registerSlab("charwood_slab", "charwood_slab_double", charwood_slab, charwood_slab_double);
		flamestone_block = new BlockGlowing(Material.rock, "realmsofchaos:flamestone_block", "blockFlamestone", 8.5f, 1000000, ROCModBlock.soundTypeGlass, 7).register("flamestone_block");
        extractor = new BlockExtractor(false).register("extractor");
        extractor_on = new BlockExtractor(true).register("extractor_on");
        xylite_ore = new BlockXyliteOre().register("xylite_ore");
        xylite_block = new BlockXylite();
        heliotrope_ore = new ROCModBlock(Material.rock, "realmsofchaos:heliotrope_ore", "oreHeliotrope", 5.0f, 14.5f, ROCModBlock.soundTypePiston).register("heliotrope_ore");
        heliotrope_block = new ROCModBlock(Material.rock, "realmsofchaos:heliotrope_block", "blockHeliotrope", 5.5f, 1000000.0f, ROCModBlock.soundTypePiston).register("heliotrope_block");
        water_portal = new BlockWaterPortal();
        ocean_stone = new BlockOceanStone();
        oceanstone_stairs = new BlockROCStairs(ocean_stone, 0, "stairsOceanstone").register("oceanstone_stairs");
        oceanstone_slab = new BlockROCSlab(false, ocean_stone, 0.4f, 1.0f, "slabOceanstone");
		oceanstone_slab_double = new BlockROCSlab(true, ocean_stone, 0.4f, 1.0f, "slabOceanstone", oceanstone_slab);
		registerSlab("oceanstone_slab", "oceanstone_slab_double", oceanstone_slab, oceanstone_slab_double);
        ocean_cobblestone = new ROCModBlock(Material.rock, "realmsofchaos:ocean_cobblestone", "cobblestoneOcean", 8.5f, 4.5f, ROCModBlock.soundTypePiston).register("ocean_cobblestone");
        ocean_cobblestone_stairs = new BlockROCStairs(ocean_cobblestone, 0, "stairsOceanCobblestone").register("ocean_cobblestone_stairs");
        ocean_cobblestone_slab = new BlockROCSlab(false, ocean_cobblestone, 0.4f, 1.0f, "slabOceanCobblestone");
		ocean_cobblestone_slab_double = new BlockROCSlab(true, ocean_cobblestone, 0.4f, 1.0f, "slabOceanCobblestone", ocean_cobblestone_slab);
		registerSlab("ocean_cobblestone_slab", "ocean_cobblestone_slab_double", ocean_cobblestone_slab, ocean_cobblestone_slab_double);
        oceanstone_bricks = new ROCMetadataBlock(3, modStoneBricksTextures, Material.rock, "realmsofchaos:oceanstone_bricks", "bricksOceanstone", 8.5f, 5.5f, ROCModBlock.soundTypePiston).register(ItemBlockModStoneBrick.class, "oceanstone_bricks");
        oceanstone_brick_stairs = new BlockROCStairs(oceanstone_bricks, 0, "stairsOceanstoneBrick").register("oceanstone_brick_stairs");
        oceanstone_brick_slab = new BlockROCSlab(false, oceanstone_bricks, 0.4f, 1.0f, "slabOceanstoneBrick");
		oceanstone_brick_slab_double = new BlockROCSlab(true, oceanstone_bricks, 0.4f, 1.0f, "slabOceanstoneBrick", oceanstone_brick_slab);
		registerSlab("oceanstone_brick_slab", "oceanstone_brick_slab_double", oceanstone_brick_slab, oceanstone_brick_slab_double);
        neptunite_ore = new ROCModBlock(Material.rock, "realmsofchaos:neptunite_ore", "oreNeptunite", 11f, 1000000f, ROCModBlock.soundTypePiston).register("neptunite_ore");
        neptunite_block = new ROCModBlock(Material.iron, "realmsofchaos:neptunite_block", "blockNeptunite", 14f, 14f, ROCModBlock.soundTypeMetal).register("neptunite_block");
        ocean_glass = new BlockOceanGlass().register("ocean_glass");
        ocean_glass_pane = new BlockOceanGlassPane().register("ocean_glass_pane");
        ocean_chest = new BlockOceanChest().register("ocean_chest");
        seaweed = new BlockSeaweed().register("seaweed");
        compressed_lava = new BlockCompressedLava().register("compressed_lava");
        aquatic_block = new BlockAquatic().register("aquatic_block");
        fractonite_ore = new ROCModBlock(Material.rock, "realmsofchaos:fractonite_ore", "oreFractonite", 0f, 0f, ROCModBlock.soundTypeGlass).register("fractonite_ore");
        fractonite_block = new ROCModBlock(Material.rock, "realmsofchaos:fractonite_block", "blockFractonite", 19.5f, 1000000f, ROCModBlock.soundTypeGlass).register("fractonite_block");
        ice_portal = new BlockIcePortal().register("ice_ruins_portal");
        frozen_stone = new BlockFrozenStone().register("frozen_stone");
        frozen_stone_stairs = new BlockROCStairs(frozen_stone, 0, "stairsFrozenStone").register("frozen_stone_stairs");
        frozen_stone_slab = new BlockROCSlab(false, frozen_stone, 0.4f, 1.0f, "slabFrozenStone");
		frozen_stone_slab_double = new BlockROCSlab(true, frozen_stone, 0.4f, 1.0f, "slabFrozenStone", frozen_stone_slab);
		registerSlab("frozen_stone_slab", "frozen_stone_slab_double", frozen_stone_slab, frozen_stone_slab_double);
        frozen_cobblestone = new ROCModBlock(Material.rock, "realmsofchaos:frozen_cobblestone", "cobblestoneFrozen", 18f, 5f, ROCModBlock.soundTypePiston).register("frozen_cobblestone");
        frozen_cobblestone_stairs = new BlockROCStairs(frozen_cobblestone, 0, "stairsFrozenCobblestone").register("frozen_cobblestone_stairs");
        frozen_cobblestone_slab = new BlockROCSlab(false, frozen_cobblestone, 0.4f, 1.0f, "slabFrozenCobblestone");
		frozen_cobblestone_slab_double = new BlockROCSlab(true, frozen_cobblestone, 0.4f, 1.0f, "slabFrozenCobblestone", frozen_cobblestone_slab);
		registerSlab("frozen_cobblestone_slab", "frozen_cobblestone_slab_double", frozen_cobblestone_slab, frozen_cobblestone_slab_double);
        frozen_stone_bricks = new ROCMetadataBlock(3, modStoneBricksTextures, Material.rock, "realmsofchaos:frozen_stone_bricks", "stoneBricksFrozen", 18.5f, 7.5f, ROCModBlock.soundTypePiston).register(ItemBlockModStoneBrick.class, "frozen_stone_bricks");
        frozen_stone_brick_stairs = new BlockROCStairs(frozen_stone_bricks, 0, "stairsFrozenStoneBrick").register("frozen_stone_brick_stairs");
        frozen_stone_brick_slab = new BlockROCSlab(false, frozen_stone_bricks, 0.4f, 1.0f, "slabFrozenStoneBrick");
		frozen_stone_brick_slab_double = new BlockROCSlab(true, frozen_stone_bricks, 0.4f, 1.0f, "slabFrozenStoneBrick", frozen_stone_brick_slab);
		registerSlab("frozen_stone_brick_slab", "frozen_stone_brick_slab_double", frozen_stone_brick_slab, frozen_stone_brick_slab_double);
        osmaralt_ore = new ROCModBlock(Material.rock, "realmsofchaos:osmaralt_ore", "oreOsmaralt", 20f, 1000000f, ROCModBlock.soundTypePiston).register("osmaralt_ore");
        osmaralt_block = new ROCModBlock(Material.rock, "realmsofchaos:osmaralt_block", "blockOsmaralt", 20f, 1000000f, ROCModBlock.soundTypePiston).register("osmaralt_blocks");
		frozen_log = new BlockROCLog(Material.wood, "realmsofchaos:frozen_log", "logFrozen", 6f, 10.0f, ROCModBlock.soundTypeGlass).register("frozen_wood");
		frozen_leaves = new BlockFrozenLeaves().register("frozen_leaves");
		fake_ice = new BlockFakeIce().register("fake_ice");

        GameRegistry.registerBlock(water_portal, "water_portal");
	}
	
	public static void registerSlab(String name, String name2, BlockROCSlab one, BlockROCSlab two){
		GameRegistry.registerBlock(two, ItemBlockModSlab.class, name2, new Object[]{one, two, true});
		GameRegistry.registerBlock(one, ItemBlockModSlab.class, name, new Object[]{one, two, false});
	}
}