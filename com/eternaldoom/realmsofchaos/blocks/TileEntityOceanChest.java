package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.BlockChest;
import net.minecraft.tileentity.TileEntityChest;

public class TileEntityOceanChest extends TileEntityChest{
	private int cachedChestType;
	@Override
	public void closeInventory()
    {
        if (this.getBlockType() instanceof BlockOceanChest)
        {
            --this.numPlayersUsing;
            this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, this.getBlockType(), 1, this.numPlayersUsing);
            this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord, this.zCoord, this.getBlockType());
            this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord - 1, this.zCoord, this.getBlockType());
        }
    }
	
	@Override
	public int func_145980_j()
    {
        return 0;
    }

}
