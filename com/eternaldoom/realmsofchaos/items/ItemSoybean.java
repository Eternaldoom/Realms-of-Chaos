package com.eternaldoom.realmsofchaos.items;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

public class ItemSoybean extends ROCModItem implements IPlantable {

	public ItemSoybean() {
		super("soybean");
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Crop;
	}

	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		return ROCBlocks.soy_plant.getDefaultState();
	}
	
	@Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float par8, float par9, float par10)
    {
        if (side != EnumFacing.UP) return false;
        
        else if (player.func_175151_a(pos.offsetUp(), side, stack)) {
            if (world.getBlockState(pos).getBlock().canSustainPlant(world, pos, EnumFacing.UP, this) && world.isAirBlock(pos.offsetUp())) {
                world.setBlockState(pos.offsetUp(), ROCBlocks.soy_plant.getDefaultState());
                --stack.stackSize;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
