package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.items.ROCItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockROCLeaves extends ROCModBlock {

	public BlockROCLeaves(Material mat, String tex, String name, float hard, float resist, SoundType sound) {
		super(mat, tex, name, hard, resist, sound);
		setLightOpacity(1);
		setTickRandomly(true);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess par1IBA, int par2,
			int par3, int par4, int par5) {
		return true;
	}

	@Override
	public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_,
			int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
		byte b0 = 1;
		int i1 = b0 + 1;

		if (p_149749_1_.checkChunksExist(p_149749_2_ - i1, p_149749_3_ - i1,
				p_149749_4_ - i1, p_149749_2_ + i1, p_149749_3_ + i1,
				p_149749_4_ + i1)) {
			for (int j1 = -b0; j1 <= b0; ++j1) {
				for (int k1 = -b0; k1 <= b0; ++k1) {
					for (int l1 = -b0; l1 <= b0; ++l1) {
						Block block = p_149749_1_.getBlock(p_149749_2_ + j1,
								p_149749_3_ + k1, p_149749_4_ + l1);
						if (block.isLeaves(p_149749_1_, p_149749_2_ + j1,
								p_149749_3_ + k1, p_149749_4_ + l1)) {
							block.beginLeavesDecay(p_149749_1_, p_149749_2_
									+ j1, p_149749_3_ + k1, p_149749_4_ + l1);
						}
					}
				}
			}
		}
	}

	@Override
	public boolean isLeaves(IBlockAccess world, int x, int y, int z) {
		return true;
	}
	
	@Override
	public int quantityDropped(Random rand){
		int dropCount = rand.nextInt(4) + 1;
		return dropCount;
	}

}
