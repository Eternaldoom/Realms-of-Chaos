package com.eternaldoom.realmsofchaos.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.client.blockrenderers.RenderSoyPlant;
import com.eternaldoom.realmsofchaos.items.ROCItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSoyPlant extends ROCModBlock implements IGrowable{

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	public BlockSoyPlant() {
		super(Material.plants, "realmsofchaos:soy_plant", "plantSoy", 0, 0, soundTypeGrass);
		disableStats();
		setTickRandomly(true);
		float f = 0.5F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        setCreativeTab(null);
	}
	
	protected boolean canPlaceBlockOn(Block b)
    {
        return b == Blocks.farmland;
    }
	
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }
	
	@Override
	public boolean canBlockStay(World world, int i, int j, int k)
    {
		return world.getBlock(i, j-1, k) == Blocks.farmland && world.getBlockLightValue(i, j, k) > 7;
    }
	
	@Override
	public void updateTick(World world, int i, int j, int k, Random rand){
		if (!this.canBlockStay(world, i, j, k)){
			int meta = world.getBlockMetadata(i, j, k);
			world.setBlock(i, j, k, Blocks.air);
			this.dropBlockAsItem(world, i, j, k, new ItemStack(ROCItems.soybean, this.quantityDropped(meta, 0, rand)));
		}
	}
	
	@Override
	public void onNeighborBlockChange(World world, int i, int j, int k, Block b)
    {
		world.scheduleBlockUpdate(i, j, k, this, 1);
    }
	
	private void grow(World world, int i, int j, int k){
		int stage = world.getBlockMetadata(i, j, k)+1;
		if(stage > 3) stage = 3;
		if(stage < 4 && world.getBlock(i, j-1, k).isFertile(world, i, j-1, k)) world.setBlockMetadataWithNotify(i, j, k, stage, 2);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World world, int i, int j, int k){
		return ROCItems.soybean;
	}
	
	@Override
	public int getRenderType(){
		return RenderSoyPlant.renderId;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		return icons[meta];
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister r)
    {
		icons = new IIcon[4];
		for(int i = 0; i<4; i++){
			icons[i] = r.registerIcon(this.getTextureName() + "_" + i);
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
	
	@Override
	public int quantityDropped(int meta, int fortune, Random rand){
		if(meta == 3) return rand.nextInt(2)+3;
		return 1;
	}
	
	@Override
	public Item getItemDropped(int par1, Random rand, int par3){
		return ROCItems.soybean;
	}

	@Override
	//Can use bonemeal
	public boolean func_149851_a(World world, int i, int j, int k, boolean p_149851_5_) {
		return world.getBlockMetadata(i, j, k) < 4;
	}

	@Override
	//Something about bonemeal
	public boolean func_149852_a(World world, Random rand, int i, int j, int k) {
		return true;
	}

	@Override
	//Growth logic
	public void func_149853_b(World world, Random rand, int i, int j, int k) {
		grow(world, i, j, k);
	}
}
