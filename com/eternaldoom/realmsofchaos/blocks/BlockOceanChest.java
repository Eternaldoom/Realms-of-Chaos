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
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockOceanChest extends BlockContainer
{
    public static final PropertyDirection FACING_PROP = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    private final Random rand = new Random();

    protected BlockOceanChest()
    {
        super(Material.rock);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING_PROP, EnumFacing.NORTH));
        this.setCreativeTab(CreativeTabs.tabDecorations);
        setUnlocalizedName("chestOcean");
        this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean isFullCube()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return 2;
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess access, BlockPos pos)
    {
    	this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
    }
    
    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING_PROP, placer.func_174811_aO());
    }

    @Override
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

            if (tileentity instanceof TileEntityOceanChest)
            {
                ((TileEntityOceanChest)tileentity).setCustomName(stack.getDisplayName());
            }
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

    @Override
    public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock)
    {
        super.onNeighborBlockChange(worldIn, pos, state, neighborBlock);
        TileEntity tileentity = worldIn.getTileEntity(pos);

        if (tileentity instanceof TileEntityOceanChest)
        {
            tileentity.updateContainingBlockInfo();
        }
    }

    @Override
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

    @Override
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

        if (!(tileentity instanceof TileEntityOceanChest))
        {
            return null;
        }
        else
        {
            Object object = (TileEntityOceanChest)tileentity;

            if (this.cannotOpenChest(worldIn, p_180676_2_))
            {
                return null;
            }
            return (ILockableContainer)object;
        }
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
        return new TileEntityOceanChest();
    }

    @Override
    public boolean canProvidePower()
    {
        return false;
    }

    @Override
    public int isProvidingWeakPower(IBlockAccess worldIn, BlockPos pos, IBlockState state, EnumFacing side)
    {
       return 0;
    }

    @Override
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

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        EnumFacing enumfacing = EnumFacing.getFront(meta);

        if (enumfacing.getAxis() == EnumFacing.Axis.Y)
        {
            enumfacing = EnumFacing.NORTH;
        }

        return this.getDefaultState().withProperty(FACING_PROP, enumfacing);
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing)state.getValue(FACING_PROP)).getIndex();
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {FACING_PROP});
    }

	public BlockOceanChest register(String name) {
		GameRegistry.registerBlock(this, name);
        ROCBlocks.blockList.add(name);
		return this;
	}
}