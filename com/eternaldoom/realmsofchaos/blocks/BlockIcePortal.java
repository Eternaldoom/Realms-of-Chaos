package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;

public class BlockIcePortal extends ROCModBlock{
	
	public BlockIcePortal() {
		super(Material.ice, "portalIceRuins", 0f, 0f, soundTypeGlass);
		setCreativeTab(null);
		setBlockUnbreakable();
	}

	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, Entity entity)
    {
		if ((entity.ridingEntity == null) && (entity.riddenByEntity == null) && ((entity instanceof EntityPlayerMP)))
        {
            EntityPlayerMP thePlayer = (EntityPlayerMP)entity;
            if (thePlayer.timeUntilPortal > 0)
            {
                thePlayer.timeUntilPortal = 10;
            }
            else if (thePlayer.dimension != RealmsOfChaos.iceDimID)
            {
                thePlayer.timeUntilPortal = 10;
                //thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, RealmsOfChaos.iceDimID, new TeleporterIceRuins(thePlayer.mcServer.worldServerForDimension(RealmsOfChaos.iceDimID)));
            }
            
            else if (thePlayer.dimension == RealmsOfChaos.iceDimID)
            {
                thePlayer.timeUntilPortal = 10;
                //thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TeleporterIceRuins(thePlayer.mcServer.worldServerForDimension(0)));
            }
        }
    }

	@Override
	public AxisAlignedBB getCollisionBoundingBox(World world, BlockPos pos, IBlockState state)
    {
		return null;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.TRANSLUCENT;
    }
	
	@Override
	public boolean isVisuallyOpaque(){
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess world, BlockPos pos, EnumFacing side)
    {
        IBlockState block = world.getBlockState(pos);

        return block == this.getDefaultState() ? false : super.shouldSideBeRendered(world, pos, side);
    }
}
