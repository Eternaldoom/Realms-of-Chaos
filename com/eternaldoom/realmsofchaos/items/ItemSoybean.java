package com.eternaldoom.realmsofchaos.items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

public class ItemSoybean extends ROCModItem implements IPlantable{

	public ItemSoybean() {
		super("realmsofchaos:soybean", "soybean");
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
		return EnumPlantType.Crop;
	}

	@Override
	public Block getPlant(IBlockAccess world, int x, int y, int z) {
		return ROCBlocks.soy_plant;
	}

	@Override
	public int getPlantMetadata(IBlockAccess world, int x, int y, int z) {
		return 0;
	}
	
	@Override
    public boolean onItemUse(ItemStack parItemStack, EntityPlayer parPlayer, World parWorld, int parX, int parY, int parZ, int par7, float par8, float par9, float par10)
    {
        if (par7 != 1)
        {
            return false;
        }
        else if (parPlayer.canPlayerEdit(parX, parY+1, parZ, par7, parItemStack))
        {
            if (parWorld.getBlock(parX, parY, parZ).canSustainPlant(parWorld, parX, parY, parZ, ForgeDirection.UP, this) && parWorld.isAirBlock(parX, parY+1, parZ))
            {
                parWorld.setBlock(parX, parY+1, parZ, ROCBlocks.soy_plant);
                --parItemStack.stackSize;
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

}
