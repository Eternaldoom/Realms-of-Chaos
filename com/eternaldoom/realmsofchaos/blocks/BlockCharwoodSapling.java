package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.gen.WorldGenCharwoodTree;
import com.eternaldoom.realmsofchaos.items.ROCItems;

public class BlockCharwoodSapling extends ROCModBlock{

	public BlockCharwoodSapling() {
		super(Material.rock, "saplingCharwood", 0.0f, 2.5f, soundTypeCloth);
		float f = 0.4f;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        setTickRandomly(true);
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(World p_149668_1_, BlockPos pos, IBlockState state)
    {
        return null;
    }

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public boolean isVisuallyOpaque(){
		return false;
	}
	
	@Override
	public boolean canPlaceBlockAt(World w, BlockPos pos)
    {
        return super.canPlaceBlockAt(w, pos) && this.canBlockStay(w, pos);
    }
	
	public boolean canBlockStay(World w, BlockPos pos)
    {
        if (w.getBlockState(pos.offset(EnumFacing.DOWN)).getBlock() == Blocks.netherrack){
        	return true;
        }
       return false;
    }
	
	protected void checkAndDropBlock(World world, BlockPos pos)
    {
        if (!this.canBlockStay(world, pos))
        {
            this.dropBlockAsItem(world, pos, world.getBlockState(pos), 0);
            world.setBlockState(pos, Blocks.air.getDefaultState(), 2);
        }
    }
	
	@Override
	public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block neighborBlock)
    {
        super.onNeighborBlockChange(world, pos, state, neighborBlock);
        this.checkAndDropBlock(world, pos);
    }
	
	@Override
	public boolean onBlockActivated(World w, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float p_149727_7_, float p_149727_8_, float p_149727_9_){
		WorldGenCharwoodTree tree = new WorldGenCharwoodTree();
		if (!w.isRemote){
			if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == ROCItems.ash_dust){
				if(!player.capabilities.isCreativeMode) --player.getCurrentEquippedItem().stackSize;
				Random r = new Random(); int growChance = r.nextInt(5);
				if (growChance == 3) return tree.generate(w, r, pos.offset(EnumFacing.WEST, 2).offset(EnumFacing.NORTH, 2));
			}
		}
		return false;

	}
	
	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand){
		this.checkAndDropBlock(world, pos);
		WorldGenCharwoodTree tree = new WorldGenCharwoodTree();
		if(rand.nextInt(2) == 0 && !world.isRemote){
			tree.generate(world, rand, pos.offset(EnumFacing.WEST, 2).offset(EnumFacing.NORTH, 2));
		}
	}
}
