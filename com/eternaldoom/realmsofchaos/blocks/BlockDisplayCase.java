package com.eternaldoom.realmsofchaos.blocks;

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
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockDisplayCase extends BlockContainer{
	
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	public BlockDisplayCase() {
		super(Material.rock);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        setUnlocalizedName("displayCase");
        setHardness(2);
        setResistance(7);
        setStepSound(soundTypeGlass);
        setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public boolean isFullCube(){
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityDisplayCase();
	}
	
	@Override
	public int getRenderType(){
		return 3;
	}
	
	public BlockDisplayCase register(String name){
		GameRegistry.registerBlock(this, name);
		ROCBlocks.blockList.add(name);
		return this;
	}
	
	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state)
    {
		if (!world.isRemote)
        {
            Block block = world.getBlockState(pos.north()).getBlock();
            Block block1 = world.getBlockState(pos.south()).getBlock();
            Block block2 = world.getBlockState(pos.west()).getBlock();
            Block block3 = world.getBlockState(pos.east()).getBlock();
            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

            if (enumfacing == EnumFacing.NORTH && block.isFullBlock() && !block1.isFullBlock())
            {
                enumfacing = EnumFacing.SOUTH;
            }
            else if (enumfacing == EnumFacing.SOUTH && block1.isFullBlock() && !block.isFullBlock())
            {
                enumfacing = EnumFacing.NORTH;
            }
            else if (enumfacing == EnumFacing.WEST && block2.isFullBlock() && !block3.isFullBlock())
            {
                enumfacing = EnumFacing.EAST;
            }
            else if (enumfacing == EnumFacing.EAST && block3.isFullBlock() && !block2.isFullBlock())
            {
                enumfacing = EnumFacing.WEST;
            }

            world.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
        }
    }
	
	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ)
    {
		if(!player.isSneaking() && world.getTileEntity(pos) != null){
			TileEntityDisplayCase tile = (TileEntityDisplayCase) world.getTileEntity(pos);
			ItemStack display = tile.displayItem;
			Item NULL_ITEM = Item.getItemFromBlock(Blocks.air);
			ItemStack itemToAdd = null;
			
			if(display != null && player.getHeldItem() != null && display.getItem() != NULL_ITEM){
				ItemStack newitem = player.getHeldItem();
				newitem.stackSize = 1;
				player.getHeldItem().stackSize--;
				itemToAdd = display;
				tile.displayItem = newitem;
			}else if(display != null && player.getHeldItem() == null && display.getItem() != NULL_ITEM){
				itemToAdd = display;
				tile.displayItem = null;
		    }else if(display == null && player.getHeldItem() == null){
			}else{
				ItemStack newitem = player.getHeldItem();
				newitem.stackSize = 1;
				if(player.getHeldItem() != null)player.getHeldItem().stackSize--;
				tile.displayItem = newitem;
			}
			
			if(itemToAdd != null)player.inventory.addItemStackToInventory(itemToAdd);
			return true;
			
		}
		return false;
    }
	
	@Override
	public IBlockState getStateFromMeta(int meta){
        EnumFacing enumfacing = EnumFacing.getFront(meta);

        if (enumfacing.getAxis() == EnumFacing.Axis.Y)
        {
            enumfacing = EnumFacing.NORTH;
        }

        return this.getDefaultState().withProperty(FACING, enumfacing);
    }

    @Override
    public int getMetaFromState(IBlockState state){
        return ((EnumFacing)state.getValue(FACING)).getIndex();
    }

    @Override
    protected BlockState createBlockState(){
        return new BlockState(this, new IProperty[] {FACING});
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer(){
    	return EnumWorldBlockLayer.CUTOUT;
    }
}
