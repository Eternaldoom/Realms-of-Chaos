package com.eternaldoom.realmsofchaos.water.gen;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.BlockPos;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.blocks.TileEntityOceanChest;
import com.eternaldoom.realmsofchaos.items.ROCItems;
import com.google.common.collect.Lists;

public class WorldGenSurfaceDungeon {
	
    public static final List CHESTSTUFF = Lists.newArrayList(new WeightedRandomChestContent[] {new WeightedRandomChestContent(ROCItems.neptunite_ingot, 0, 1, 3, 3), new WeightedRandomChestContent(ROCItems.aquatic_shard, 0, 1, 1, 2)});
	
    private BlockPos helperPos = new BlockPos(0, 0, 0);
    private World helperWorld = null;
    
	public boolean generate(World world, Random rand, BlockPos pos) {
		
		int i = pos.getX(), j = pos.getY(), k = pos.getZ();
    	helperWorld = world;
    	
		setBlock(i + 0, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 0, k + 1, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 0, k + 2, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 0, k + 3, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 0, k + 5, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 0, k + 7, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 0, k + 8, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 0, k + 9, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 1, k + 1, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 1, k + 2, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 1, k + 3, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 1, k + 5, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 1, k + 7, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 1, k + 8, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 1, k + 9, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 2, k + 1, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 2, k + 2, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 2, k + 3, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 2, k + 5, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 2, k + 7, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 2, k + 8, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 2, k + 9, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 0, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 3, k + 1, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 3, k + 2, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 3, k + 3, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 3, k + 7, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 3, k + 8, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 3, k + 9, ROCBlocks.oceanstone_bricks);
		setBlock(i + 0, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 1, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 1, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		setBlock(i + 1, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		setBlock(i + 1, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		setBlock(i + 1, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		setBlock(i + 1, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 1, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		setBlock(i + 1, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		setBlock(i + 1, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		setBlock(i + 1, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		setBlock(i + 1, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 1, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 1, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 1, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 1, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 1, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 1, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 2, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 2, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		setBlock(i + 2, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		setBlock(i + 2, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		setBlock(i + 2, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		setBlock(i + 2, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 2, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		setBlock(i + 2, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		setBlock(i + 2, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		setBlock(i + 2, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		setBlock(i + 2, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 2, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		
		setBlock(i + 2, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 2, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 2, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 2, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 2, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 3, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 3, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		setBlock(i + 3, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		setBlock(i + 3, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		setBlock(i + 3, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		setBlock(i + 3, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 3, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		setBlock(i + 3, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		setBlock(i + 3, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		setBlock(i + 3, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		setBlock(i + 3, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 3, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 3, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 3, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 3, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 3, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 3, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 4, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 4, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		setBlock(i + 4, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		setBlock(i + 4, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		setBlock(i + 4, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		setBlock(i + 4, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 4, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		setBlock(i + 4, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		setBlock(i + 4, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		setBlock(i + 4, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		setBlock(i + 4, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 4, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 4, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 4, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 4, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 4, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 4, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 5, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 5, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		setBlock(i + 5, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		setBlock(i + 5, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		setBlock(i + 5, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		setBlock(i + 5, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 5, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		setBlock(i + 5, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		setBlock(i + 5, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		setBlock(i + 5, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		setBlock(i + 5, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 5, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 5, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 5, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 5, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 5, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 5, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 6, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 6, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		setBlock(i + 6, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		setBlock(i + 6, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		setBlock(i + 6, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		setBlock(i + 6, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 6, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		setBlock(i + 6, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		setBlock(i + 6, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		setBlock(i + 6, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		setBlock(i + 6, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 6, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 6, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 6, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 6, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 6, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 6, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 7, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 7, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		setBlock(i + 7, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		setBlock(i + 7, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		setBlock(i + 7, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		setBlock(i + 7, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 7, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		setBlock(i + 7, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		setBlock(i + 7, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		setBlock(i + 7, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		setBlock(i + 7, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 7, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 7, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 7, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 7, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 7, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 7, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 8, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 8, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		setBlock(i + 8, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		setBlock(i + 8, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		setBlock(i + 8, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		setBlock(i + 8, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 8, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		setBlock(i + 8, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		setBlock(i + 8, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		setBlock(i + 8, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		setBlock(i + 8, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 8, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 8, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 8, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 8, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 8, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 8, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 9, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 9, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		setBlock(i + 9, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		setBlock(i + 9, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		setBlock(i + 9, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		setBlock(i + 9, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 9, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		setBlock(i + 9, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		setBlock(i + 9, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		setBlock(i + 9, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		setBlock(i + 9, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 9, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 9, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 9, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 9, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 9, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 9, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 0, k + 1, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 0, k + 2, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 0, k + 3, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 10, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 0, k + 7, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 0, k + 8, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 0, k + 9, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 1, k + 1, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 1, k + 2, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 1, k + 3, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 1, k + 7, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 1, k + 8, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 1, k + 9, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 2, k + 1, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 2, k + 2, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 2, k + 3, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 2, k + 7, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 2, k + 8, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 2, k + 9, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		setBlock(i + 10, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 3, k + 1, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 3, k + 2, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 3, k + 3, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 3, k + 7, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 3, k + 8, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 3, k + 9, ROCBlocks.oceanstone_bricks);
		setBlock(i + 10, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		setBlock(i + 11, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 11, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 11, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 11, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 11, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 11, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 11, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 11, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 11, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		setBlock(i + 11, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 12, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 12, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 12, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 12, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 12, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 12, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 12, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 12, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 12, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		setBlock(i + 12, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 13, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 13, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 13, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 13, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 13, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 13, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 13, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 13, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 13, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		setBlock(i + 13, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 14, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 14, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 14, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 14, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 14, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 14, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 14, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 14, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 14, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		setBlock(i + 14, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 15, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 15, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 15, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 15, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 15, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 15, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 15, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 15, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 15, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		setBlock(i + 15, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 16, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 16, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 16, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 16, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 16, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 16, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 16, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 16, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 16, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		setBlock(i + 16, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 17, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 17, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		setBlock(i + 17, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 17, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 17, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 17, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		setBlock(i + 17, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		setBlock(i + 17, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 17, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		setBlock(i + 17, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		setBlock(i + 18, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		setBlock(i + 18, j + 0, k + 5, ROCBlocks.oceanstone_bricks);
		setBlock(i + 18, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		
		setBlock(i + 2, j + 1, k + 2, Blocks.mob_spawner, 0, 2);
		setBlock(i + 2, j + 1, k + 8, Blocks.mob_spawner, 0, 2);
		setBlock(i + 5, j + 1, k + 4, Blocks.mob_spawner, 0, 2);
		setBlock(i + 5, j + 1, k + 6, Blocks.mob_spawner, 0, 2);
		
		TileEntityMobSpawner spawner1 = (TileEntityMobSpawner)world.getTileEntity(pos.add(2, 1, 2));
		TileEntityMobSpawner spawner2 = (TileEntityMobSpawner)world.getTileEntity(pos.add(2, 1, 8));
		TileEntityMobSpawner spawner3 = (TileEntityMobSpawner)world.getTileEntity(pos.add(5, 1, 4));
		TileEntityMobSpawner spawner4 = (TileEntityMobSpawner)world.getTileEntity(pos.add(5, 1, 6));

        if (spawner1 != null) spawner1.getSpawnerBaseLogic().setEntityName(this.pickMobSpawner(rand));
        if (spawner2 != null) spawner2.getSpawnerBaseLogic().setEntityName(this.pickMobSpawner(rand));
        if (spawner3 != null) spawner3.getSpawnerBaseLogic().setEntityName(this.pickMobSpawner(rand));
        if (spawner4 != null) spawner4.getSpawnerBaseLogic().setEntityName(this.pickMobSpawner(rand));
        
        setBlock(i + 1, j + 1, k + 4, ROCBlocks.ocean_chest, 5, 2);
		setBlock(i + 1, j + 1, k + 6, ROCBlocks.ocean_chest, 5, 2);
				
		TileEntityOceanChest chest1 = (TileEntityOceanChest)world.getTileEntity(pos.add(1, 1, 4));
		if (chest1 != null) WeightedRandomChestContent.generateChestContents(rand, CHESTSTUFF, chest1, 8);
		TileEntityOceanChest chest2 = (TileEntityOceanChest)world.getTileEntity(pos.add(1, 1, 6));
		if (chest2 != null) WeightedRandomChestContent.generateChestContents(rand, CHESTSTUFF, chest2, 8);
        

		return true;
	}
	
	private void setBlock(int i, int j, int k, Block block){
    	this.helperWorld.setBlockState(this.helperPos.add(i, j, k), block.getDefaultState());
    }
	
	private Block getBlock(int i, int j, int k){
		return this.helperWorld.getBlockState(this.helperPos.add(i, j, k)).getBlock();
	}
    
    private void setBlock(int i, int j, int k, Block block, int meta, int flag){
    	this.helperWorld.setBlockState(this.helperPos.add(i, j, k), block.getStateFromMeta(meta), flag);
    }
	
	private String pickMobSpawner(Random p_76543_1_)
    {
        return "AquaticGolem";
    }

}
