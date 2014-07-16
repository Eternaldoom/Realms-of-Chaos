package com.eternaldoom.realmsofchaos.overworld.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import com.eternaldoom.realmsofchaos.overworld.blocks.ROCBlocks;

public class OverworldCrafting {
	
	public static void initRecipes(){
		//TODO: add recipes 
		GameRegistry.addRecipe(new ItemStack(ROCBlocks.netherrack_bricks, 4), new Object[]{"XX", "XX", 'X', Blocks.netherrack});
	}

}
