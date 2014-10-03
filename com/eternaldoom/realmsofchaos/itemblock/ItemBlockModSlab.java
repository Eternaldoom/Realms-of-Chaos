package com.eternaldoom.realmsofchaos.itemblock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.eternaldoom.realmsofchaos.blocks.BlockDoubleROCSlab;
import com.eternaldoom.realmsofchaos.blocks.BlockROCSlab;

public class ItemBlockModSlab extends ItemBlock
{
    private final BlockSlab field_150949_c;
    private final BlockSlab field_179226_c;
    private static final String __OBFID = "CL_00000071";

    public ItemBlockModSlab(Block p_i45782_1_, BlockROCSlab p_i45782_2_, BlockDoubleROCSlab p_i45782_3_)
    {
        super(p_i45782_1_);
        this.field_150949_c = p_i45782_2_;
        this.field_179226_c = p_i45782_3_;
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    /**
     * Converts the given ItemStack damage value into a metadata value to be placed in the world when this Item is
     * placed as a Block (mostly used with ItemBlocks).
     */
    public int getMetadata(int damage)
    {
        return damage;
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack stack)
    {
        return this.field_150949_c.getFullSlabName(stack.getMetadata());
    }

    /**
     * Called when a Block is right-clicked with this Item
     *  
     * @param pos The block being right-clicked
     * @param side The side being right-clicked
     */
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (stack.stackSize == 0)
        {
            return false;
        }
        else if (!playerIn.func_175151_a(pos.offset(side), side, stack))
        {
            return false;
        }
        else
        {
            Object object = this.field_150949_c.func_176553_a(stack);
            IBlockState iblockstate = worldIn.getBlockState(pos);

            if (iblockstate.getBlock() == this.field_150949_c)
            {
                IProperty iproperty = this.field_150949_c.func_176551_l();
                Comparable comparable = iblockstate.getValue(iproperty);
                BlockSlab.EnumBlockHalf enumblockhalf = (BlockSlab.EnumBlockHalf)iblockstate.getValue(BlockSlab.HALF_PROP);

                if ((side == EnumFacing.UP && enumblockhalf == BlockSlab.EnumBlockHalf.BOTTOM || side == EnumFacing.DOWN && enumblockhalf == BlockSlab.EnumBlockHalf.TOP) && comparable == object)
                {
                    IBlockState iblockstate1 = this.field_179226_c.getDefaultState().withProperty(iproperty, comparable);

                    if (worldIn.checkNoEntityCollision(this.field_179226_c.getCollisionBoundingBox(worldIn, pos, iblockstate1)) && worldIn.setBlockState(pos, iblockstate1, 3))
                    {
                        worldIn.playSoundEffect((double)((float)pos.getX() + 0.5F), (double)((float)pos.getY() + 0.5F), (double)((float)pos.getZ() + 0.5F), this.field_179226_c.stepSound.getPlaceSound(), (this.field_179226_c.stepSound.getVolume() + 1.0F) / 2.0F, this.field_179226_c.stepSound.getFrequency() * 0.8F);
                        --stack.stackSize;
                    }

                    return true;
                }
            }

            return this.func_180615_a(stack, worldIn, pos.offset(side), object) ? true : super.onItemUse(stack, playerIn, worldIn, pos, side, hitX, hitY, hitZ);
        }
    }

    @SideOnly(Side.CLIENT)
    public boolean canPlaceBlockOnSide(World worldIn, BlockPos p_179222_2_, EnumFacing p_179222_3_, EntityPlayer p_179222_4_, ItemStack p_179222_5_)
    {
        BlockPos blockpos1 = p_179222_2_;
        IProperty iproperty = this.field_150949_c.func_176551_l();
        Object object = this.field_150949_c.func_176553_a(p_179222_5_);
        IBlockState iblockstate = worldIn.getBlockState(p_179222_2_);

        if (iblockstate.getBlock() == this.field_150949_c)
        {
            boolean flag = iblockstate.getValue(BlockSlab.HALF_PROP) == BlockSlab.EnumBlockHalf.TOP;

            if ((p_179222_3_ == EnumFacing.UP && !flag || p_179222_3_ == EnumFacing.DOWN && flag) && object == iblockstate.getValue(iproperty))
            {
                return true;
            }
        }

        p_179222_2_ = p_179222_2_.offset(p_179222_3_);
        IBlockState iblockstate1 = worldIn.getBlockState(p_179222_2_);
        return iblockstate1.getBlock() == this.field_150949_c && object == iblockstate1.getValue(iproperty) ? true : super.canPlaceBlockOnSide(worldIn, blockpos1, p_179222_3_, p_179222_4_, p_179222_5_);
    }

    private boolean func_180615_a(ItemStack p_180615_1_, World worldIn, BlockPos p_180615_3_, Object p_180615_4_)
    {
        IBlockState iblockstate = worldIn.getBlockState(p_180615_3_);

        if (iblockstate.getBlock() == this.field_150949_c)
        {
            Comparable comparable = iblockstate.getValue(this.field_150949_c.func_176551_l());

            if (comparable == p_180615_4_)
            {
                IBlockState iblockstate1 = this.field_179226_c.getDefaultState().withProperty(this.field_150949_c.func_176551_l(), comparable);

                if (worldIn.checkNoEntityCollision(this.field_179226_c.getCollisionBoundingBox(worldIn, p_180615_3_, iblockstate1)) && worldIn.setBlockState(p_180615_3_, iblockstate1, 3))
                {
                    worldIn.playSoundEffect((double)((float)p_180615_3_.getX() + 0.5F), (double)((float)p_180615_3_.getY() + 0.5F), (double)((float)p_180615_3_.getZ() + 0.5F), this.field_179226_c.stepSound.getPlaceSound(), (this.field_179226_c.stepSound.getVolume() + 1.0F) / 2.0F, this.field_179226_c.stepSound.getFrequency() * 0.8F);
                    --p_180615_1_.stackSize;
                }

                return true;
            }
        }

        return false;
    }
}