package com.eternaldoom.realmsofchaos.blocks;

import java.util.Iterator;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.ILockableContainer;
import net.minecraft.world.World;

public class BlockNetherChest extends BlockContainer
{
    public static final PropertyDirection FACING_PROP = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    private final Random rand = new Random();

    protected BlockNetherChest()
    {
        super(Material.wood);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING_PROP, EnumFacing.NORTH));
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean isFullCube()
    {
        return false;
    }

    public int getRenderType()
    {
        return 2;
    }

    public void setBlockBoundsBasedOnState(IBlockAccess access, BlockPos pos)
    {
        if (access.getBlockState(pos.offsetNorth()).getBlock() == this)
        {
            this.setBlockBounds(0.0625F, 0.0F, 0.0F, 0.9375F, 0.875F, 0.9375F);
        }
        else if (access.getBlockState(pos.offsetSouth()).getBlock() == this)
        {
            this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 1.0F);
        }
        else if (access.getBlockState(pos.offsetWest()).getBlock() == this)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
        }
        else if (access.getBlockState(pos.offsetEast()).getBlock() == this)
        {
            this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 1.0F, 0.875F, 0.9375F);
        }
        else
        {
            this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
        }
    }

    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        this.checkForSurroundingChests(worldIn, pos, state);
        Iterator iterator = EnumFacing.Plane.HORIZONTAL.iterator();

        while (iterator.hasNext())
        {
            EnumFacing enumfacing = (EnumFacing)iterator.next();
            BlockPos blockpos1 = pos.offset(enumfacing);
            IBlockState iblockstate1 = worldIn.getBlockState(blockpos1);

            if (iblockstate1.getBlock() == this)
            {
                this.checkForSurroundingChests(worldIn, blockpos1, iblockstate1);
            }
        }
    }

    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING_PROP, placer.func_174811_aO());
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {
        EnumFacing enumfacing = EnumFacing.getHorizontal(MathHelper.floor_double((double)(placer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3).getOpposite();
        state = state.withProperty(FACING_PROP, enumfacing);
        BlockPos blockpos1 = pos.offsetNorth();
        BlockPos blockpos2 = pos.offsetSouth();
        BlockPos blockpos3 = pos.offsetWest();
        BlockPos blockpos4 = pos.offsetEast();
        boolean flag = this == worldIn.getBlockState(blockpos1).getBlock();
        boolean flag1 = this == worldIn.getBlockState(blockpos2).getBlock();
        boolean flag2 = this == worldIn.getBlockState(blockpos3).getBlock();
        boolean flag3 = this == worldIn.getBlockState(blockpos4).getBlock();

        if (!flag && !flag1 && !flag2 && !flag3)
        {
            worldIn.setBlockState(pos, state, 3);
        }
        else if (enumfacing.getAxis() == EnumFacing.Axis.X && (flag || flag1))
        {
            if (flag)
            {
                worldIn.setBlockState(blockpos1, state, 3);
            }
            else
            {
                worldIn.setBlockState(blockpos2, state, 3);
            }

            worldIn.setBlockState(pos, state, 3);
        }
        else if (enumfacing.getAxis() == EnumFacing.Axis.Z && (flag2 || flag3))
        {
            if (flag2)
            {
                worldIn.setBlockState(blockpos3, state, 3);
            }
            else
            {
                worldIn.setBlockState(blockpos4, state, 3);
            }

            worldIn.setBlockState(pos, state, 3);
        }

        if (stack.hasDisplayName())
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof TileEntityNetherChest)
            {
                ((TileEntityNetherChest)tileentity).setCustomName(stack.getDisplayName());
            }
        }
    }

    public IBlockState checkForSurroundingChests(World worldIn, BlockPos p_176455_2_, IBlockState p_176455_3_)
    {
        if (worldIn.isRemote)
        {
            return p_176455_3_;
        }
        else
        {
            IBlockState iblockstate1 = worldIn.getBlockState(p_176455_2_.offsetNorth());
            IBlockState iblockstate2 = worldIn.getBlockState(p_176455_2_.offsetSouth());
            IBlockState iblockstate3 = worldIn.getBlockState(p_176455_2_.offsetWest());
            IBlockState iblockstate4 = worldIn.getBlockState(p_176455_2_.offsetEast());
            EnumFacing enumfacing = (EnumFacing)p_176455_3_.getValue(FACING_PROP);
            Block block = iblockstate1.getBlock();
            Block block1 = iblockstate2.getBlock();
            Block block2 = iblockstate3.getBlock();
            Block block3 = iblockstate4.getBlock();

            if (block != this && block1 != this)
            {
                boolean flag = block.isFullBlock();
                boolean flag1 = block1.isFullBlock();

                if (block2 == this || block3 == this)
                {
                    BlockPos blockpos2 = block2 == this ? p_176455_2_.offsetWest() : p_176455_2_.offsetEast();
                    IBlockState iblockstate7 = worldIn.getBlockState(blockpos2.offsetNorth());
                    IBlockState iblockstate8 = worldIn.getBlockState(blockpos2.offsetSouth());
                    enumfacing = EnumFacing.SOUTH;
                    EnumFacing enumfacing2;

                    if (block2 == this)
                    {
                        enumfacing2 = (EnumFacing)iblockstate3.getValue(FACING_PROP);
                    }
                    else
                    {
                        enumfacing2 = (EnumFacing)iblockstate4.getValue(FACING_PROP);
                    }

                    if (enumfacing2 == EnumFacing.NORTH)
                    {
                        enumfacing = EnumFacing.NORTH;
                    }

                    Block block6 = iblockstate7.getBlock();
                    Block block7 = iblockstate8.getBlock();

                    if ((flag || block6.isFullBlock()) && !flag1 && !block7.isFullBlock())
                    {
                        enumfacing = EnumFacing.SOUTH;
                    }

                    if ((flag1 || block7.isFullBlock()) && !flag && !block6.isFullBlock())
                    {
                        enumfacing = EnumFacing.NORTH;
                    }
                }
            }
            else
            {
                BlockPos blockpos1 = block == this ? p_176455_2_.offsetNorth() : p_176455_2_.offsetSouth();
                IBlockState iblockstate5 = worldIn.getBlockState(blockpos1.offsetWest());
                IBlockState iblockstate6 = worldIn.getBlockState(blockpos1.offsetEast());
                enumfacing = EnumFacing.EAST;
                EnumFacing enumfacing1;

                if (block == this)
                {
                    enumfacing1 = (EnumFacing)iblockstate1.getValue(FACING_PROP);
                }
                else
                {
                    enumfacing1 = (EnumFacing)iblockstate2.getValue(FACING_PROP);
                }

                if (enumfacing1 == EnumFacing.WEST)
                {
                    enumfacing = EnumFacing.WEST;
                }

                Block block4 = iblockstate5.getBlock();
                Block block5 = iblockstate6.getBlock();

                if ((block2.isFullBlock() || block4.isFullBlock()) && !block3.isFullBlock() && !block5.isFullBlock())
                {
                    enumfacing = EnumFacing.EAST;
                }

                if ((block3.isFullBlock() || block5.isFullBlock()) && !block2.isFullBlock() && !block4.isFullBlock())
                {
                    enumfacing = EnumFacing.WEST;
                }
            }

            p_176455_3_ = p_176455_3_.withProperty(FACING_PROP, enumfacing);
            worldIn.setBlockState(p_176455_2_, p_176455_3_, 3);
            return p_176455_3_;
        }
    }

    public IBlockState func_176458_f(World worldIn, BlockPos p_176458_2_, IBlockState p_176458_3_)
    {
        EnumFacing enumfacing = null;
        Iterator iterator = EnumFacing.Plane.HORIZONTAL.iterator();

        while (iterator.hasNext())
        {
            EnumFacing enumfacing1 = (EnumFacing)iterator.next();
            IBlockState iblockstate1 = worldIn.getBlockState(p_176458_2_.offset(enumfacing1));

            if (iblockstate1.getBlock() == this)
            {
                return p_176458_3_;
            }

            if (iblockstate1.getBlock().isFullBlock())
            {
                if (enumfacing != null)
                {
                    enumfacing = null;
                    break;
                }

                enumfacing = enumfacing1;
            }
        }

        if (enumfacing != null)
        {
            return p_176458_3_.withProperty(FACING_PROP, enumfacing.getOpposite());
        }
        else
        {
            EnumFacing enumfacing2 = (EnumFacing)p_176458_3_.getValue(FACING_PROP);

            if (worldIn.getBlockState(p_176458_2_.offset(enumfacing2)).getBlock().isFullBlock())
            {
                enumfacing2 = enumfacing2.getOpposite();
            }

            if (worldIn.getBlockState(p_176458_2_.offset(enumfacing2)).getBlock().isFullBlock())
            {
                enumfacing2 = enumfacing2.rotateY();
            }

            if (worldIn.getBlockState(p_176458_2_.offset(enumfacing2)).getBlock().isFullBlock())
            {
                enumfacing2 = enumfacing2.getOpposite();
            }

            return p_176458_3_.withProperty(FACING_PROP, enumfacing2);
        }
    }

    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        int i = 0;
        BlockPos blockpos1 = pos.offsetWest();
        BlockPos blockpos2 = pos.offsetEast();
        BlockPos blockpos3 = pos.offsetNorth();
        BlockPos blockpos4 = pos.offsetSouth();

        if (worldIn.getBlockState(blockpos1).getBlock() == this)
        {
            if (this.isSurroundingBlockChest(worldIn, blockpos1))
            {
                return false;
            }

            ++i;
        }

        if (worldIn.getBlockState(blockpos2).getBlock() == this)
        {
            if (this.isSurroundingBlockChest(worldIn, blockpos2))
            {
                return false;
            }

            ++i;
        }

        if (worldIn.getBlockState(blockpos3).getBlock() == this)
        {
            if (this.isSurroundingBlockChest(worldIn, blockpos3))
            {
                return false;
            }

            ++i;
        }

        if (worldIn.getBlockState(blockpos4).getBlock() == this)
        {
            if (this.isSurroundingBlockChest(worldIn, blockpos4))
            {
                return false;
            }

            ++i;
        }

        return i <= 1;
    }

    private boolean isSurroundingBlockChest(World worldIn, BlockPos p_176454_2_)
    {
        if (worldIn.getBlockState(p_176454_2_).getBlock() != this)
        {
            return false;
        }
        else
        {
            Iterator iterator = EnumFacing.Plane.HORIZONTAL.iterator();
            EnumFacing enumfacing;

            do
            {
                if (!iterator.hasNext())
                {
                    return false;
                }

                enumfacing = (EnumFacing)iterator.next();
            }
            while (worldIn.getBlockState(p_176454_2_.offset(enumfacing)).getBlock() != this);

            return true;
        }
    }

    public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock)
    {
        super.onNeighborBlockChange(worldIn, pos, state, neighborBlock);
        TileEntity tileentity = worldIn.getTileEntity(pos);

        if (tileentity instanceof TileEntityNetherChest)
        {
            tileentity.updateContainingBlockInfo();
        }
    }

    public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
    {
        TileEntity tileentity = worldIn.getTileEntity(pos);

        if (tileentity instanceof IInventory)
        {
            InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory)tileentity);
            worldIn.updateComparatorOutputLevel(pos, this);
        }

        super.breakBlock(worldIn, pos, state);
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            ILockableContainer ilockablecontainer = this.getLockableContainer(worldIn, pos);

            if (ilockablecontainer != null)
            {
                playerIn.displayGUIChest(ilockablecontainer);
            }

            return true;
        }
    }

    public ILockableContainer getLockableContainer(World worldIn, BlockPos p_180676_2_)
    {
        TileEntity tileentity = worldIn.getTileEntity(p_180676_2_);

        if (!(tileentity instanceof TileEntityNetherChest))
        {
            return null;
        }
        else
        {
            Object object = (TileEntityNetherChest)tileentity;

            if (this.cannotOpenChest(worldIn, p_180676_2_))
            {
                return null;
            }
            else
            {
                Iterator iterator = EnumFacing.Plane.HORIZONTAL.iterator();

                while (iterator.hasNext())
                {
                    EnumFacing enumfacing = (EnumFacing)iterator.next();
                    BlockPos blockpos1 = p_180676_2_.offset(enumfacing);
                    Block block = worldIn.getBlockState(blockpos1).getBlock();

                    if (block == this)
                    {
                        if (this.cannotOpenChest(worldIn, blockpos1))
                        {
                            return null;
                        }

                        TileEntity tileentity1 = worldIn.getTileEntity(blockpos1);

                        if (tileentity1 instanceof TileEntityNetherChest)
                        {
                            if (enumfacing != EnumFacing.WEST && enumfacing != EnumFacing.NORTH)
                            {
                                object = new InventoryLargeChest("container.chestDouble", (ILockableContainer)object, (TileEntityNetherChest)tileentity1);
                            }
                            else
                            {
                                object = new InventoryLargeChest("container.chestDouble", (TileEntityNetherChest)tileentity1, (ILockableContainer)object);
                            }
                        }
                    }
                }

                return (ILockableContainer)object;
            }
        }
    }

    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
        return new TileEntityNetherChest();
    }

    public boolean canProvidePower()
    {
        return false;
    }

    public int isProvidingWeakPower(IBlockAccess worldIn, BlockPos pos, IBlockState state, EnumFacing side)
    {
       return 0;
    }

    public int isProvidingStrongPower(IBlockAccess worldIn, BlockPos pos, IBlockState state, EnumFacing side)
    {
        return side == EnumFacing.UP ? this.isProvidingWeakPower(worldIn, pos, state, side) : 0;
    }

    private boolean cannotOpenChest(World worldIn, BlockPos p_176457_2_)
    {
        return this.isBelowSolidBlock(worldIn, p_176457_2_);
    }

    private boolean isBelowSolidBlock(World worldIn, BlockPos p_176456_2_)
    {
        return worldIn.getBlockState(p_176456_2_.offsetUp()).getBlock().isNormalCube();
    }

    public boolean hasComparatorInputOverride()
    {
        return true;
    }

    public int getComparatorInputOverride(World worldIn, BlockPos pos)
    {
        return Container.calcRedstoneFromInventory(this.getLockableContainer(worldIn, pos));
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        EnumFacing enumfacing = EnumFacing.getFront(meta);

        if (enumfacing.getAxis() == EnumFacing.Axis.Y)
        {
            enumfacing = EnumFacing.NORTH;
        }

        return this.getDefaultState().withProperty(FACING_PROP, enumfacing);
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing)state.getValue(FACING_PROP)).getIndex();
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {FACING_PROP});
    }
}