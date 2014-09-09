package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.gen.WorldGenCharwoodTree;
import com.eternaldoom.realmsofchaos.items.ROCItems;

public class BlockCharwoodSapling extends ROCModBlock{

	public BlockCharwoodSapling() {
		super(Material.rock, "realmsofchaos:charwood_sapling", "saplingCharwood", 0.0f, 2.5f, soundTypeCloth);
		float f = 0.4f;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        setTickRandomly(true);
	}
	
	@Override
	public int getRenderType(){
		return 1;
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	public boolean canPlaceBlockAt(World w, int p_149742_2_, int p_149742_3_, int p_149742_4_)
    {
        return super.canPlaceBlockAt(w, p_149742_2_, p_149742_3_, p_149742_4_) && this.canBlockStay(w, p_149742_2_, p_149742_3_, p_149742_4_);
    }
	
	@Override
	public boolean canBlockStay(World w, int i, int j, int k)
    {
        if (w.getBlock(i, j - 1, k) == Blocks.netherrack){
        	return true;
        }
       return false;
    }
	
	protected void checkAndDropBlock(World p_149855_1_, int p_149855_2_, int p_149855_3_, int p_149855_4_)
    {
        if (!this.canBlockStay(p_149855_1_, p_149855_2_, p_149855_3_, p_149855_4_))
        {
            this.dropBlockAsItem(p_149855_1_, p_149855_2_, p_149855_3_, p_149855_4_, p_149855_1_.getBlockMetadata(p_149855_2_, p_149855_3_, p_149855_4_), 0);
            p_149855_1_.setBlock(p_149855_2_, p_149855_3_, p_149855_4_, getBlockById(0), 0, 2);
        }
    }
	
	@Override
	public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        super.onNeighborBlockChange(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, p_149695_5_);
        this.checkAndDropBlock(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_);
    }
	
	@Override
	public boolean onBlockActivated(World w, int i, int j, int k, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_){
		WorldGenCharwoodTree tree = new WorldGenCharwoodTree();
		if (!w.isRemote){
			if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == ROCItems.ash_dust){
				if(!player.capabilities.isCreativeMode) --player.getCurrentEquippedItem().stackSize;
				Random r = new Random(); int growChance = r.nextInt(5);
				if (growChance == 3) return tree.generate(w, r, i - 2, j, k - 2);
			}
		}
		return false;

	}
	
	@Override
	public void updateTick(World world, int i, int j, int k, Random rand){
		WorldGenCharwoodTree tree = new WorldGenCharwoodTree();
		if(rand.nextInt(4) == 0 && !world.isRemote){
			tree.generate(world, rand, i, j, k);
		}
	}
}
