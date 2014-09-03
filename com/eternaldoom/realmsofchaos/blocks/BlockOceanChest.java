package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.ROCTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockOceanChest extends BlockContainer{
	
	protected BlockOceanChest() {
		super(Material.rock);
		setCreativeTab(ROCTabs.Blocks);
		setBlockTextureName("realmsofchaos:ocean_glass");
		setHardness(12.0f);
		setResistance(10.0f);
		setBlockName("chestOcean");
		setStepSound(soundTypeGlass);
		setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
	}
	
	public BlockOceanChest register(String name){
		GameRegistry.registerBlock(this, name);
		return this;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityOceanChest();
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9){
		if(world.isRemote){
			return true;
		}else{
			IInventory inv = getInventory(world, i, j, k);
			if (inv != null) {
				player.displayGUIChest(inv);
			}
			return true;
		}
	}
	
	@Override
	public void breakBlock(World world, int i, int j, int k, Block block, int par6) {
		TileEntityOceanChest items = (TileEntityOceanChest)world.getTileEntity(i, j, k);
		if(items != null) {
			ItemStack itemstack = null;
			for(int i1 = 0; i1 < items.getSizeInventory(); i1++) {
				itemstack = items.getStackInSlot(i1);
				if(itemstack != null) {
					Random rand = new Random();
					float f = rand.nextFloat() * 0.8F + 0.1F;
					float f1 = rand.nextFloat() * 0.8F + 0.1F;
					float f3 = 0.05F;
					EntityItem entityitem;

					for(float f2 = rand.nextFloat() * 0.8F + 0.1F; itemstack.stackSize > 0; world.spawnEntityInWorld(entityitem)) {
						int j1 = rand.nextInt(21) + 10;
						if(j1 > itemstack.stackSize)
							j1 = itemstack.stackSize;

						itemstack.stackSize -= j1;
						entityitem = new EntityItem(world, (double)((float)i + f), (double)((float)i + f1), (double)((float)k + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));
						entityitem.motionX = (double)((float)rand.nextGaussian() * f3);
						entityitem.motionY = (double)((float)rand.nextGaussian() * f3 + 0.2F);
						entityitem.motionZ = (double)((float)rand.nextGaussian() * f3);
					}
				}
			}
			world.func_147453_f(i, j, k, block);
		}
		super.breakBlock(world, i, j, k, block, par6);
	}

	private IInventory getInventory(World world, int i, int j, int k) {
		Object obj = (TileEntityOceanChest)world.getTileEntity(i, j, k);
		return (IInventory)obj;
	}

	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entity, ItemStack stack) {
		int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		int i1 = world.getBlockMetadata(i, j, k);
		++l;
		l %= 4;

		if (l == 0) 
			world.setBlockMetadataWithNotify(i, j, k, 4, 2);

		if (l == 1) 
			world.setBlockMetadataWithNotify(i, j, k, 2, 2);

		if (l == 2) 
			world.setBlockMetadataWithNotify(i, j, k, 5, 2);

		if (l == 3) 
			world.setBlockMetadataWithNotify(i, j, k, 0, 2);
	}

	@Override
	public int getRenderType() {
		return -1;
	}
}
