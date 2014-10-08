package com.eternaldoom.realmsofchaos.blocks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.eternaldoom.realmsofchaos.itemblock.ItemBlockModSlab;
import com.eternaldoom.realmsofchaos.itemblock.ItemBlockModStoneBrick;

public class ROCBlocks {
    
    public static List<String> blockNames = new ArrayList<String>();
    
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
    public static ROCModBlock soy_plant;
	
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
	public static BlockNetherChest nether_chest;
    
    //Ocean
    //public static Fluid waterportal;
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
    public static BlockFrozenChest frozen_chest;
    public static ROCModBlock frozen_planks;
    public static BlockROCStairs frozen_wood_stairs;
    public static BlockROCSlab frozen_wood_slab;
    public static BlockROCSlab frozen_wood_slab_double;
    public static ROCModBlock frozen_sapling;
    
    private static String[] modStoneBricksTextures = {null, "cracked", "carved"};

	public static void init(){
		//waterportal = new FluidWaterPortal();
		//FluidRegistry.registerFluid(waterportal);
		
		citronite_ore = new BlockCitroniteOre().register("citronite_ore");
		charwood_leaves = new BlockCharwoodLeaves().register("charwood_leaves");
		charwood_log = new BlockROCLog(Material.rock, "logCharwood", 1.5f, 1000000.0f, ROCModBlock.soundTypePiston).register("charwood");
		charwood_sapling = new BlockCharwoodSapling().register("charwood_sapling");
		netherrack_bricks = new ROCModBlock(Material.rock, "bricksHellrock", 0.4f, 1.0f, ROCModBlock.soundTypePiston).register("netherrack_bricks");
		netherrack_brick_stairs = new BlockROCStairs(netherrack_bricks, netherrack_bricks.getDefaultState(), "stairsHellrockBrick").register("netherrack_brick_stairs");
		netherrack_brick_slab = new BlockROCSlab(Material.rock, "slabHellrockBrick", 0.4f, 1.0f, ROCModBlock.soundTypePiston);
		netherrack_brick_slab_double = new BlockDoubleROCSlab(Material.rock, "slabHellrockBrick", 0.4f, 1.0f, ROCModBlock.soundTypePiston);
		registerSlab("netherrack_brick_slab", "netherrack_brick_slab_double", netherrack_brick_slab, netherrack_brick_slab_double);
        citronite_block = new ROCModBlock(Material.rock, "blockCitronite", 5.0f, 12.0f, ROCModBlock.soundTypeGlass).register("citronite_block");
        charwood_planks = new ROCModBlock(Material.wood, "planksCharwood", 4.0f, 2.5f, ROCModBlock.soundTypeWood).register("charwood_planks");
        charwood_stairs = new BlockROCStairs(charwood_planks, charwood_planks.getDefaultState(), "stairsCharwood").register("charwood_stairs");
        charwood_slab = new BlockROCSlab(Material.wood, "slabCharwood", 0.4f, 1.0f, ROCModBlock.soundTypeWood);
		charwood_slab_double = new BlockDoubleROCSlab(Material.wood, "slabCharwood", 0.4f, 1.0f, ROCModBlock.soundTypeWood);
		registerSlab("charwood_slab", "charwood_slab_double", charwood_slab, charwood_slab_double);
		flamestone_block = new BlockGlowing(Material.rock, "blockFlamestone", 8.5f, 1000000, ROCModBlock.soundTypeGlass, 7).register("flamestone_block");
		nether_chest = new BlockNetherChest().register("nether_chest");
        extractor = new BlockExtractor(false).register("extractor");
        extractor_on = new BlockExtractor(true).register("extractor_on");
        xylite_ore = new BlockXyliteOre().register("xylite_ore");
        xylite_block = new BlockXylite();
        heliotrope_ore = new ROCModBlock(Material.rock, "oreHeliotrope", 5.0f, 14.5f, ROCModBlock.soundTypePiston).register("heliotrope_ore");
        heliotrope_block = new ROCModBlock(Material.rock, "blockHeliotrope", 5.5f, 1000000.0f, ROCModBlock.soundTypePiston).register("heliotrope_block");
        //water_portal = new BlockWaterPortal();
        ocean_stone = new BlockOceanStone();
        oceanstone_stairs = new BlockROCStairs(ocean_stone, ocean_stone.getDefaultState(), "stairsOceanstone").register("oceanstone_stairs");
        oceanstone_slab = new BlockROCSlab(Material.rock, "slabOceanstone", 0.4f, 1.0f, ROCModBlock.soundTypePiston);
		oceanstone_slab_double = new BlockDoubleROCSlab(Material.rock, "slabOceanstone", 0.4f, 1.0f, ROCModBlock.soundTypePiston);
		registerSlab("oceanstone_slab", "oceanstone_slab_double", oceanstone_slab, oceanstone_slab_double);
        ocean_cobblestone = new ROCModBlock(Material.rock, "cobblestoneOcean", 8.5f, 4.5f, ROCModBlock.soundTypePiston).register("ocean_cobblestone");
        ocean_cobblestone_stairs = new BlockROCStairs(ocean_cobblestone, ocean_cobblestone.getDefaultState(), "stairsOceanCobblestone").register("ocean_cobblestone_stairs");
        ocean_cobblestone_slab = new BlockROCSlab(Material.rock, "slabOceanCobblestone", 0.4f, 1.0f, ROCModBlock.soundTypePiston);
		ocean_cobblestone_slab_double = new BlockDoubleROCSlab(Material.rock, "slabOceanCobblestone", 0.4f, 1.0f, ROCModBlock.soundTypePiston);
		registerSlab("ocean_cobblestone_slab", "ocean_cobblestone_slab_double", ocean_cobblestone_slab, ocean_cobblestone_slab_double);
        oceanstone_bricks = new BlockOceanStoneBrick(Material.rock, "bricksOceanstone", 8.5f, 5.5f, ROCModBlock.soundTypePiston).register(ItemBlockModStoneBrick.class, "oceanstone_bricks");
        oceanstone_brick_stairs = new BlockROCStairs(oceanstone_bricks, oceanstone_bricks.getDefaultState(), "stairsOceanstoneBrick").register("oceanstone_brick_stairs");
        oceanstone_brick_slab = new BlockROCSlab(Material.rock, "slabOceanstoneBrick", 0.4f, 1.0f, ROCModBlock.soundTypePiston);
		oceanstone_brick_slab_double = new BlockDoubleROCSlab(Material.rock, "slabOceanstoneBrick", 0.4f, 1.0f, ROCModBlock.soundTypePiston);
		registerSlab("oceanstone_brick_slab", "oceanstone_brick_slab_double", oceanstone_brick_slab, oceanstone_brick_slab_double);
        neptunite_ore = new ROCModBlock(Material.rock, "oreNeptunite", 11f, 1000000f, ROCModBlock.soundTypePiston).register("neptunite_ore");
        neptunite_block = new ROCModBlock(Material.iron, "blockNeptunite", 14f, 14f, ROCModBlock.soundTypeMetal).register("neptunite_block");
        ocean_glass = new BlockOceanGlass().register("ocean_glass");
        ocean_glass_pane = new BlockOceanGlassPane().register("ocean_glass_pane");
        ocean_chest = new BlockOceanChest().register("ocean_chest");
		seaweed = new BlockSeaweed().register("seaweed_block");
        compressed_lava = new BlockCompressedLava().register("compressed_lava");
        aquatic_block = new BlockAquatic().register("aquatic_block");
        fractonite_ore = new ROCModBlock(Material.rock, "oreFractonite", 0f, 0f, ROCModBlock.soundTypeGlass).register("fractonite_ore");
        fractonite_block = new ROCModBlock(Material.rock, "blockFractonite", 19.5f, 1000000f, ROCModBlock.soundTypeGlass).register("fractonite_block");
        ice_portal = new BlockIcePortal().register("ice_ruins_portal");
        frozen_stone = new BlockFrozenStone().register("frozen_stone");
        frozen_stone_stairs = new BlockROCStairs(frozen_stone, frozen_stone.getDefaultState(), "stairsFrozenStone").register("frozen_stone_stairs");
        frozen_stone_slab = new BlockROCSlab(Material.rock, "slabFrozenStone", 0.4f, 1.0f, ROCModBlock.soundTypePiston);
		frozen_stone_slab_double = new BlockDoubleROCSlab(Material.rock, "slabFrozenStone", 0.4f, 1.0f, ROCModBlock.soundTypePiston);
		registerSlab("frozen_stone_slab", "frozen_stone_slab_double", frozen_stone_slab, frozen_stone_slab_double);
        frozen_cobblestone = new ROCModBlock(Material.rock, "cobblestoneFrozen", 18f, 5f, ROCModBlock.soundTypePiston).register("frozen_cobblestone");
        frozen_cobblestone_stairs = new BlockROCStairs(frozen_cobblestone, frozen_cobblestone.getDefaultState(), "stairsFrozenCobblestone").register("frozen_cobblestone_stairs");
        frozen_cobblestone_slab = new BlockROCSlab(Material.rock, "slabFrozenCobblestone", 0.4f, 1.0f, ROCModBlock.soundTypePiston);
		frozen_cobblestone_slab_double = new BlockDoubleROCSlab(Material.rock, "slabFrozenCobblestone", 0.4f, 1.0f, ROCModBlock.soundTypePiston);
		registerSlab("frozen_cobblestone_slab", "frozen_cobblestone_slab_double", frozen_cobblestone_slab, frozen_cobblestone_slab_double);
        frozen_stone_bricks = new BlockFrozenStoneBrick(Material.rock, "stoneBricksFrozen", 18.5f, 7.5f, ROCModBlock.soundTypePiston).register(ItemBlockModStoneBrick.class, "frozen_stone_bricks");
        frozen_stone_brick_stairs = new BlockROCStairs(frozen_stone_bricks, frozen_stone_bricks.getDefaultState(), "stairsFrozenStoneBrick").register("frozen_stone_brick_stairs");
        frozen_stone_brick_slab = new BlockROCSlab(Material.rock, "slabFrozenStoneBrick", 0.4f, 1.0f, ROCModBlock.soundTypePiston);
		frozen_stone_brick_slab_double = new BlockDoubleROCSlab(Material.rock, "slabFrozenStoneBrick", 0.4f, 1.0f, ROCModBlock.soundTypePiston);
		registerSlab("frozen_stone_brick_slab", "frozen_stone_brick_slab_double", frozen_stone_brick_slab, frozen_stone_brick_slab_double);
        osmaralt_ore = new ROCModBlock(Material.rock, "oreOsmaralt", 20f, 1000000f, ROCModBlock.soundTypePiston).register("osmaralt_ore");
        osmaralt_block = new ROCModBlock(Material.rock, "blockOsmaralt", 20f, 1000000f, ROCModBlock.soundTypePiston).register("osmaralt_block");
		frozen_log = new BlockROCLog(Material.wood, "logFrozen", 6f, 10.0f, ROCModBlock.soundTypeGlass).register("frozen_wood");
		frozen_leaves = new BlockFrozenLeaves().register("frozen_leaves");
		fake_ice = new BlockFakeIce().register("fake_ice");
		soy_plant = new BlockSoyPlant().register("soy_plant");
		frozen_chest = new BlockFrozenChest().register("frozen_chest");
		frozen_planks = new ROCModBlock(Material.wood, "planksFrozen", 10, 10, ROCModBlock.soundTypeWood).register("frozen_planks");
		frozen_wood_stairs = new BlockROCStairs(frozen_planks, frozen_planks.getDefaultState(), "stairsFrozenWood").register("frozen_wood_stairs");
		frozen_wood_slab = new BlockROCSlab(Material.wood, "slabFrozenWood", 10f, 10.0f, ROCModBlock.soundTypeWood);
		frozen_wood_slab_double = new BlockDoubleROCSlab(Material.wood, "slabFrozenWood", 10f, 10.0f, ROCModBlock.soundTypeWood);
		registerSlab("frozen_wood_slab", "frozen_wood_slab_double", frozen_wood_slab, frozen_wood_slab_double);
		frozen_sapling = new BlockFrozenSapling().register("frozen_sapling");

        //GameRegistry.GameRegistry.registerBlock(water_portal, "water_portal");
	}
	
	public static void registerSlab(String name, String name2, BlockROCSlab one, BlockROCSlab two){
		registerBlock(two, ItemBlockModSlab.class, name2, new Object[]{one, two});
		registerBlock(one, ItemBlockModSlab.class, name, new Object[]{one, two});
        blockNames.add(name);
	}
	
	public static Block registerBlock(Block block, Class<? extends ItemBlock> itemclass, String name, Object... itemCtorArgs)
    {
        block = GameRegistry.registerBlock(block, itemclass, name, itemCtorArgs);
        Item associatedItem = GameRegistry.findItem("realmsofchaos", name);
        
        Map itemBlockMap = (Map)ObfuscationReflectionHelper.getPrivateValue(Item.class, null, "BLOCK_TO_ITEM");
        
        if (!itemBlockMap.containsKey(block)) itemBlockMap.put(block, associatedItem);
        
        Iterator iterator = block.getBlockState().getValidStates().iterator();
        
        while (iterator.hasNext())
        {
            IBlockState iblockstate = (IBlockState)iterator.next();
            int id = Block.blockRegistry.getIDForObject(block) << 4 | block.getMetaFromState(iblockstate);
            Block.BLOCK_STATE_IDS.put(iblockstate, id);
        }
        return block;
    }
	
	public static Block registerBlock(Block block, Class<? extends ItemBlock> itemclass, String name)
    {
	    return registerBlock(block, itemclass, name, new Object[]{});
    }
	
	public static Block registerBlock(Block block, String name)
    {
        return registerBlock(block, ItemBlock.class, name, new Object[]{});
    }
}
