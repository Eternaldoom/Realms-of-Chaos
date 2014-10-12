package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.eternaldoom.realmsofchaos.GUIHandler;
import com.eternaldoom.realmsofchaos.RealmsOfChaos;

public class BlockExtractor extends BlockContainer {
    
	private final Random FurnaceRand = new Random();
	private final boolean isActive;
	private static boolean keepFurnaceInventory;

	private String name;

	public BlockExtractor(boolean active) {
		super(Material.rock);
		setLightLevel(1.0F);
		setHardness(20.0F);
		setResistance(6000000.0F);
		//setHarvestLevel("pickaxe", 5);
		setUnlocalizedName("extractor");
		isActive = active;
		if(!active){
			setCreativeTab(CreativeTabs.tabBlock);
		}else if(active){
			setCreativeTab(null);
		}
	}
    
	@Override
	public boolean onBlockActivated(World var1, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float var7, float var8, float var9) {
		if (!player.isSneaking()) {
			player.openGui(RealmsOfChaos.instance, GUIHandler.extractor, var1, pos.getX(), pos.getY(), pos.getZ());
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}

	public static void updateFurnaceBlockState(boolean par0, World par1World, BlockPos pos) {
		TileEntity tileentity = par1World.getTileEntity(pos);
		keepFurnaceInventory = true;

		if (par0)
		{
			par1World.setBlockState(pos, ROCBlocks.extractor_on.getDefaultState());
		}
		else
		{
			par1World.setBlockState(pos, ROCBlocks.extractor.getDefaultState());
		}

		keepFurnaceInventory = false;

		if (tileentity != null)
		{
			tileentity.validate();
			par1World.setTileEntity(pos, tileentity);
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(World par1World, BlockPos pos, IBlockState state, Random par5Random)
	{
		if (this.isActive)
		{
			float f = (float)pos.getX() + 0.5F;
			float f1 = (float)pos.getY() + 0.0F + par5Random.nextFloat() * 6.0F / 16.0F;
			float f2 = (float)pos.getZ() + 0.5F;
			float f3 = 0.52F;
			float f4 = par5Random.nextFloat() * 0.6F - 0.3F;

			par1World.spawnParticle(EnumParticleTypes.LAVA, (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
			par1World.spawnParticle(EnumParticleTypes.LAVA, (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
			par1World.spawnParticle(EnumParticleTypes.LAVA, (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
			par1World.spawnParticle(EnumParticleTypes.LAVA, (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
		}
	}

	@Override
	public void breakBlock(World par1World, BlockPos pos, IBlockState state)
	{
		if (!keepFurnaceInventory)
		{
			TileEntityExtractor tileentityExtractor = (TileEntityExtractor)par1World.getTileEntity(pos);

			if (tileentityExtractor != null)
			{
				for (int j1 = 0; j1 < tileentityExtractor.getSizeInventory(); ++j1)
				{
					ItemStack itemstack = tileentityExtractor.getStackInSlot(j1);

					if (itemstack != null)
					{
						float f = this.FurnaceRand.nextFloat() * 0.8F + 0.1F;
						float f1 = this.FurnaceRand.nextFloat() * 0.8F + 0.1F;
						float f2 = this.FurnaceRand.nextFloat() * 0.8F + 0.1F;

						while (itemstack.stackSize > 0)
						{
							int k1 = this.FurnaceRand.nextInt(21) + 10;

							if (k1 > itemstack.stackSize)
							{
								k1 = itemstack.stackSize;
							}

							itemstack.stackSize -= k1;
							EntityItem entityitem = new EntityItem(par1World, (double)((float)pos.getX() + f), (double)((float)pos.getY() + f1), (double)((float)pos.getZ() + f2), new ItemStack(itemstack.getItem(), k1, itemstack.getItemDamage()));

							if (itemstack.hasTagCompound())
							{
								entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
							}

							float f3 = 0.05F;
							entityitem.motionX = (double)((float)this.FurnaceRand.nextGaussian() * f3);
							entityitem.motionY = (double)((float)this.FurnaceRand.nextGaussian() * f3 + 0.2F);
							entityitem.motionZ = (double)((float)this.FurnaceRand.nextGaussian() * f3);
							par1World.spawnEntityInWorld(entityitem);
						}
					}
				}

				par1World.notifyNeighborsOfStateChange(pos, state.getBlock());
			}
		}

		super.breakBlock(par1World, pos, state);
	}

	@Override
	public boolean hasComparatorInputOverride() {
		return true;
	}

	@Override
	public int getComparatorInputOverride(World par1World, BlockPos pos) {
		return Container.calcRedstoneFromInventory((IInventory)par1World.getTileEntity(pos));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Item getItem(World par1World, BlockPos pos) {
		return Item.getItemFromBlock(ROCBlocks.extractor);
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityExtractor();
	}
    
    public Block register(String name){
    	GameRegistry.registerBlock(this, name);
        ROCBlocks.blockList.add(name);
    	return this;
    }
    
    @Override
    public int getRenderType()
    {
        return 3;
    }
    
    @Override
    public boolean isFullCube(){
        return false;
    }
}