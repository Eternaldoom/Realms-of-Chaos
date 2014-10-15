package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.iceruins.gen.WorldGenIceTree1;

public class BlockFrozenSapling extends ROCModBlock{

	public BlockFrozenSapling() {
		super(Material.rock, "saplingFrozen", 0.0f, 2.5f, soundTypeGrass);
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
	public boolean isNormalCube(){
		return false;
	}
	
	@Override
	public EnumWorldBlockLayer getBlockLayer(){
		return EnumWorldBlockLayer.CUTOUT;
	}
	
	@Override
	public boolean canPlaceBlockAt(World w, BlockPos pos)
    {
        return super.canPlaceBlockAt(w, pos) && this.canBlockStay(w, pos);
    }
	
	public boolean canBlockStay(World w, BlockPos pos)
    {
        if (w.getBlockState(pos.down()).getBlock() == Blocks.snow){
        	return true;
        }
       return false;
    }
	
	protected void checkAndDropBlock(World p_149855_1_, BlockPos pos)
    {
        if (!this.canBlockStay(p_149855_1_, pos))
        {
            this.dropBlockAsItem(p_149855_1_, pos, this.getDefaultState(), 0);
            p_149855_1_.setBlockState(pos, Blocks.air.getDefaultState(), 2);
        }
    }
	
	@Override
	public void onNeighborBlockChange(World p_149695_1_, BlockPos pos, IBlockState state, Block neighborBlock)
    {
        super.onNeighborBlockChange(p_149695_1_, pos, state, neighborBlock);
        this.checkAndDropBlock(p_149695_1_, pos);
    }
	
	@Override
	public boolean onBlockActivated(World w, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float p_149727_7_, float p_149727_8_, float p_149727_9_){
		WorldGenIceTree1 tree = new WorldGenIceTree1();
		if (!w.isRemote){
			if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == Items.dye && player.getCurrentEquippedItem().getItemDamage() == 15){
				if(!player.capabilities.isCreativeMode) --player.getCurrentEquippedItem().stackSize;
				Random r = new Random(); int growChance = r.nextInt(5);
				if (growChance == 3) return tree.generate(w, r, pos.offset(EnumFacing.WEST, 3).offset(EnumFacing.NORTH, 3));
			}
		}
		return false;
	}
	
	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand){
		WorldGenIceTree1 tree = new WorldGenIceTree1();
		if(rand.nextInt(2) == 0 && !world.isRemote){
			tree.generate(world, rand, pos.offset(EnumFacing.WEST, 3).offset(EnumFacing.NORTH, 3));
		}
	}
}
