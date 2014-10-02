package com.eternaldoom.realmsofchaos.items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

public class ItemSeaweed extends ROCModItem
{
    private Block theblock;

    public ItemSeaweed(Block b)
    {
    	super("seaweed");
        this.theblock = b;
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        Block block = world.getBlockState(pos).getBlock();

        if (block == ROCBlocks.seaweed || block == ROCBlocks.ocean_stone)
        {
            side = EnumFacing.UP;
        }

        if (!player.func_175151_a(pos.offsetUp(), side, stack))
        {
            return false;
        }
        else if (stack.stackSize == 0)
        {
            return false;
        }
        else
        {
        	if((block == ROCBlocks.seaweed || block == ROCBlocks.ocean_stone) && world.getBlockState(pos.offsetUp()).getBlock() == Blocks.water && world.getBlockState(pos.offsetUp(2)).getBlock() != Blocks.air){
                if (world.setBlockState(pos.offsetUp(), this.theblock.getDefaultState(), 2))
                {
                    if (world.getBlockState(pos.offsetUp()).getBlock() == this.theblock)
                    {
                        this.theblock.onBlockPlacedBy(world, pos, this.theblock.getDefaultState(), player, stack);
                    }

                    world.playSoundEffect((double)((float)pos.getX() + 0.5F), (double)((float)pos.getY() + 0.5F), (double)((float)pos.getZ() + 0.5F), this.theblock.stepSound.getPlaceSound(), (this.theblock.stepSound.getVolume() + 1.0F) / 2.0F, this.theblock.stepSound.getFrequency() * 0.8F);
                    --stack.stackSize;
                }
            }
        }

            return true;
        }
}