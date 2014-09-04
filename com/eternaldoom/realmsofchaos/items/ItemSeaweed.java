package com.eternaldoom.realmsofchaos.items;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSeaweed extends ROCModItem
{
    private Block theblock;

    public ItemSeaweed(Block b)
    {
    	super("realmsofchaos:seaweed", "seaweed");
        this.theblock = b;
    }

    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int i, int j, int k, int side, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        Block block = world.getBlock(i, j, k);

        if (block == ROCBlocks.seaweed || block == ROCBlocks.ocean_stone)
        {
            side = 1;
        }

        if (!player.canPlayerEdit(i, j+1, k, side, stack))
        {
            return false;
        }
        else if (stack.stackSize == 0)
        {
            return false;
        }
        else
        {
        	if((block == ROCBlocks.seaweed || block == ROCBlocks.ocean_stone) && world.getBlock(i, j+1, k) == Blocks.water && world.getBlock(i, j+2, k) != Blocks.air){
                if (world.setBlock(i, j+1, k, this.theblock, 0, 2))
                {
                    if (world.getBlock(i, j+1, k) == this.theblock)
                    {
                        this.theblock.onBlockPlacedBy(world, i, j, k, player, stack);
                    }

                    world.playSoundEffect((double)((float)i + 0.5F), (double)((float)j + 0.5F), (double)((float)k + 0.5F), this.theblock.stepSound.func_150496_b(), (this.theblock.stepSound.getVolume() + 1.0F) / 2.0F, this.theblock.stepSound.getPitch() * 0.8F);
                    --stack.stackSize;
                }
            }
        }

            return true;
        }
}