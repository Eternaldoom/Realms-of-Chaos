package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockDoubleROCSlab extends BlockROCSlab{

	public BlockDoubleROCSlab(Material mat, String name, float hardness, float resistance, SoundType stepSound) {
		super(mat, name, hardness, resistance, stepSound);
		setCreativeTab(null);
	}

	@Override
	public boolean isDouble(){
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Item getItem(World world, BlockPos pos){
		Block b = this == ROCBlocks.netherrack_brick_slab_double ? ROCBlocks.netherrack_brick_slab : (this == ROCBlocks.charwood_slab_double ? ROCBlocks.charwood_slab : (this == ROCBlocks.oceanstone_slab_double ? ROCBlocks.oceanstone_slab : (this == ROCBlocks.ocean_cobblestone_slab_double ? ROCBlocks.ocean_cobblestone_slab : (this == ROCBlocks.oceanstone_brick_slab_double ? ROCBlocks.oceanstone_brick_slab : (this == ROCBlocks.frozen_wood_slab_double ? ROCBlocks.frozen_wood_slab : (this == ROCBlocks.frozen_stone_slab_double ? ROCBlocks.frozen_stone_slab : (this == ROCBlocks.frozen_cobblestone_slab_double ? ROCBlocks.frozen_cobblestone_slab : (this == ROCBlocks.frozen_stone_brick_slab_double ? ROCBlocks.frozen_stone_brick_slab : Blocks.air))))))));
		return Item.getItemFromBlock(b);
	}
}
