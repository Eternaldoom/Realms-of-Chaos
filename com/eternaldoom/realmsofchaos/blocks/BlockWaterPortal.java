package com.eternaldoom.realmsofchaos.blocks;


public class BlockWaterPortal /*extends BlockFluidClassic*/{
	
	/*public BlockWaterPortal() {
		super(ROCBlocks.waterportal, Material.water);
		setBlockName("portalWater");
		setBlockTextureName("realmsofchaos:water_portal");
		setBlockUnbreakable();
	}

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
    }*/

}
