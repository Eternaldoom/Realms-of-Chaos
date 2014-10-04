package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.eternaldoom.realmsofchaos.items.ROCItems;

public class BlockSoyPlant extends ROCModBlock implements IGrowable{
	
	public static final PropertyInteger GROWTHSTAGE = PropertyInteger.create("stage", 0, 3);
	
	public BlockSoyPlant() {
		super(Material.plants, "plantSoy", 0, 0, soundTypeGrass);
		setTickRandomly(true);
		float f = 0.5F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        setCreativeTab(null);
		disableStats();
	}
	
	protected boolean canPlaceBlockOn(Block b)
    {
        return b == Blocks.farmland;
    }
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(World p_149668_1_, BlockPos pos, IBlockState state)
    {
        return null;
    }
	
	public boolean canBlockStay(World world, BlockPos pos)
    {
		return world.getBlockState(pos.offsetDown()).getBlock() == Blocks.farmland && world.getLight(pos) > 7;
    }
	
	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand){
		this.checkAndDropBlock(world, pos, state, rand);
		if(rand.nextInt(12) == 0) this.grow(world, rand, pos, state);
	}
	
	@Override
	public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block b)
    {
		this.checkAndDropBlock(world, pos, state, new Random());
    }
	
	private void growPlant(World world, BlockPos pos, IBlockState state){
		int stage = ((Integer)state.getValue(GROWTHSTAGE)).intValue()+1;
		if(stage > 3) stage = 3;
		if(stage < 4 && ((Integer)world.getBlockState(pos.offsetDown()).getValue(BlockFarmland.field_176531_a)).intValue() > 0) world.setBlockState(pos, state.withProperty(GROWTHSTAGE, stage));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World world, BlockPos pos){
		return ROCItems.soybean;
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
    public boolean isFullBlock(){
        return false;
    }
	
	@Override
	public EnumWorldBlockLayer getBlockLayer(){
	    return EnumWorldBlockLayer.CUTOUT;
	}
	
	@Override
	public void dropBlockAsItemWithChance(World world, BlockPos pos, IBlockState state, float chance, int fortune)
    {
		if(this.getMetaFromState(state) >= 3) spawnAsEntity(world, pos, new ItemStack(ROCItems.soybean, new Random().nextInt(2)+3));
		else spawnAsEntity(world, pos, new ItemStack(ROCItems.soybean, 1));
    }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3){
		return ROCItems.soybean;
	}
	
	public void checkAndDropBlock(World world, BlockPos pos, IBlockState state, Random rand){
		if (!this.canBlockStay(world, pos)){
			int meta = ((Integer)state.getValue(GROWTHSTAGE)).intValue();
			world.setBlockState(pos, Blocks.air.getDefaultState());
			if(meta >= 3) spawnAsEntity(world, pos, new ItemStack(ROCItems.soybean, rand.nextInt(2)+3));
			else spawnAsEntity(world, pos, new ItemStack(ROCItems.soybean, 1));
		}
	}

	@Override
	public boolean isStillGrowing(World world, BlockPos pos, IBlockState state, boolean p_149851_5_) {
		return ((Integer)state.getValue(GROWTHSTAGE)).intValue() < 3;
	}

	@Override
	public boolean canUseBonemeal(World world, Random rand, BlockPos pos, IBlockState state) {
		return true;
	}

	@Override
	public void grow(World world, Random rand, BlockPos pos, IBlockState state) {
		growPlant(world, pos, state);
	}
	
	public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(GROWTHSTAGE, Integer.valueOf(meta));
    }

    public int getMetaFromState(IBlockState state)
    {
        return ((Integer)state.getValue(GROWTHSTAGE)).intValue();
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {GROWTHSTAGE});
    }
}
