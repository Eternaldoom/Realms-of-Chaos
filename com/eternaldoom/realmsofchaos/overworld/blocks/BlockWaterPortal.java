package com.eternaldoom.realmsofchaos.overworld.blocks;

import net.minecraft.block.BlockPortal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;

public class BlockWaterPortal extends BlockPortal{
	
	@Override
	public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity entity)
    {
		if ((entity.ridingEntity == null) && (entity.riddenByEntity == null) && ((entity instanceof EntityPlayerMP)))
        {
            EntityPlayerMP thePlayer = (EntityPlayerMP)entity;
            if (thePlayer.timeUntilPortal > 0)
            {
                thePlayer.timeUntilPortal = 10;
            }
            else if (thePlayer.dimension == 0 || thePlayer.dimension == 17 || thePlayer.dimension == 15)
            {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 23);
            }
            
            else if (thePlayer.dimension == 23)
            {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0);
            }
        }
    }

}
