package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;
import com.eternaldoom.realmsofchaos.water.gen.TeleporterWater;


public class BlockWaterPortal extends BlockFluidClassic {
	
	public BlockWaterPortal() {
		super(ROCBlocks.waterportal, Material.water);
		setUnlocalizedName("portalWater");
		setBlockUnbreakable();
	}

	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity)
    {
		if ((entity.ridingEntity == null) && (entity.riddenByEntity == null) && ((entity instanceof EntityPlayerMP)))
        {
            EntityPlayerMP thePlayer = (EntityPlayerMP)entity;
            if (thePlayer.timeUntilPortal > 0)
            {
                thePlayer.timeUntilPortal = 10;
            }
            else if (thePlayer.dimension != RealmsOfChaos.waterDimID)
            {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, RealmsOfChaos.waterDimID, new TeleporterWater(thePlayer.mcServer.worldServerForDimension(RealmsOfChaos.waterDimID)));
            }
            
            else if (thePlayer.dimension == RealmsOfChaos.waterDimID)
            {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TeleporterWater(thePlayer.mcServer.worldServerForDimension(0)));
            }
        }
    }

}
