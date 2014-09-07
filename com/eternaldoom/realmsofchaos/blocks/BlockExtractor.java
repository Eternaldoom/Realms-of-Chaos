package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.GUIHandler;
import com.eternaldoom.realmsofchaos.ROCTabs;
import com.eternaldoom.realmsofchaos.RealmsOfChaos;
import com.eternaldoom.realmsofchaos.client.blockrenderers.RenderExtractor;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockExtractor extends BlockContainer {

	@SideOnly(Side.CLIENT)
    private IIcon iconTop;
    @SideOnly(Side.CLIENT)
    private IIcon iconSide;
    
	private final Random FurnaceRand = new Random();
	private final boolean isActive;
	private static boolean keepFurnaceInventory;

	private String name;

	public BlockExtractor(boolean active) {
		super(Material.rock);
		setLightLevel(1.0F);
		setHardness(20.0F);
		setResistance(6000000.0F);
		setHarvestLevel("pickaxe", 5);
		setBlockName("extractor");
		setBlockTextureName("realmsofchaos:extractor");
		isActive = active;
		if(!active){
			setCreativeTab(ROCTabs.Blocks);
		}else if(active){
			setCreativeTab(null);
		}
	}
    
	@Override
	public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9) {
		if (!player.isSneaking()) {
			player.openGui(RealmsOfChaos.instance, GUIHandler.extractor, var1, var2, var3, var4);
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}

	public void onBlockAdded(World par1World, int par2, int par3, int par4)
	{
		super.onBlockAdded(par1World, par2, par3, par4);
		this.setDefaultDirection(par1World, par2, par3, par4);
	}

	private void setDefaultDirection(World par1World, int par2, int par3, int par4)
	{
		if (!par1World.isRemote)
		{
			Block l = par1World.getBlock(par2, par3, par4 - 1);
			Block i1 = par1World.getBlock(par2, par3, par4 + 1);
			Block j1 = par1World.getBlock(par2 - 1, par3, par4);
			Block k1 = par1World.getBlock(par2 + 1, par3, par4);
			byte b0 = 3;

			if (l.func_149730_j() && !i1.func_149730_j())
			{
				b0 = 3;
			}

			if (i1.func_149730_j() && !l.func_149730_j())
			{
				b0 = 2;
			}

			if (j1.func_149730_j() && !k1.func_149730_j())
			{
				b0 = 5;
			}

			if (k1.func_149730_j() && !j1.func_149730_j())
			{
				b0 = 4;
			}

			par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 2);
		}
	}

	public static void updateFurnaceBlockState(boolean par0, World par1World, int par2, int par3, int par4) {
		int l = par1World.getBlockMetadata(par2, par3, par4);
		TileEntity tileentity = par1World.getTileEntity(par2, par3, par4);
		keepFurnaceInventory = true;

		if (par0)
		{
			par1World.setBlock(par2, par3, par4, ROCBlocks.extractor_on);
		}
		else
		{
			par1World.setBlock(par2, par3, par4, ROCBlocks.extractor);
		}

		keepFurnaceInventory = false;
		par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);

		if (tileentity != null)
		{
			tileentity.validate();
			par1World.setTileEntity(par2, par3, par4, tileentity);
		}
	}

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack item)
    {
        int l = MathHelper.floor_double((double)(living.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (l == 1)
        {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }

        if (l == 2)
        {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        if (l == 3)
        {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

        if (item.hasDisplayName())
        {
            ((TileEntityExtractor)world.getTileEntity(x, y, z)).func_145951_a(item.getDisplayName());
        }
    }

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		if (this.isActive)
		{
			int l = par1World.getBlockMetadata(par2, par3, par4);
			float f = (float)par2 + 0.5F;
			float f1 = (float)par3 + 0.0F + par5Random.nextFloat() * 6.0F / 16.0F;
			float f2 = (float)par4 + 0.5F;
			float f3 = 0.52F;
			float f4 = par5Random.nextFloat() * 0.6F - 0.3F;

			if (l == 4)
			{
				par1World.spawnParticle("lava", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
			}
			else if (l == 5)
			{
				par1World.spawnParticle("lava", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
			}
			else if (l == 2)
			{
				par1World.spawnParticle("lava", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
			}
			else if (l == 3)
			{
				par1World.spawnParticle("lava", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
			}
		}
	}

	@Override
	public void breakBlock(World par1World, int par2, int par3, int par4, Block par5, int par6)
	{
		if (!keepFurnaceInventory)
		{
			TileEntityExtractor tileentityExtractor = (TileEntityExtractor)par1World.getTileEntity(par2, par3, par4);

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
							EntityItem entityitem = new EntityItem(par1World, (double)((float)par2 + f), (double)((float)par3 + f1), (double)((float)par4 + f2), new ItemStack(itemstack.getItem(), k1, itemstack.getItemDamage()));

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

				par1World.func_147453_f(par2, par3, par4, par5);
			}
		}

		super.breakBlock(par1World, par2, par3, par4, par5, par6);
	}

	@Override
	public boolean hasComparatorInputOverride() {
		return true;
	}

	public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5) {
		return Container.calcRedstoneFromInventory((IInventory)par1World.getTileEntity(par2, par3, par4));
	}

	@SideOnly(Side.CLIENT)
	public Item func_149694_d(World par1World, int par2, int par3, int par4) {
		return Item.getItemFromBlock(ROCBlocks.extractor);
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityExtractor();
	}

	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? this.iconTop : (p_149691_1_ == 0 ? this.iconTop : this.blockIcon);
    }


    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_)
    {
        if (p_149673_5_ == 1)
        {
            return this.iconTop;
        }
        else if (p_149673_5_ == 0)
        {
            return this.iconTop;
        }
        else
        {
            return this.blockIcon;
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
        this.iconTop = p_149651_1_.registerIcon(this.getTextureName() + "_top");
    }
    
    public Block register(String name){
    	GameRegistry.registerBlock(this, name);
    	return this;
    }
    
    @Override
    public int getRenderType(){
    	return RenderExtractor.renderId;
    }
}