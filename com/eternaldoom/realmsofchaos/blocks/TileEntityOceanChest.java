package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.BlockPos;

public class TileEntityOceanChest extends TileEntityChest{
	
	private int xCoord = this.getPos().getX(), yCoord = this.getPos().getY(), zCoord = this.getPos().getZ();
	
	public TileEntityOceanChest(){
		setCustomName("Ocean Chest");
	}
	
	private int cachedChestType;
	public TileEntityOceanChest adjacentChestZNeg;
    public TileEntityOceanChest adjacentChestXPos;
    public TileEntityOceanChest adjacentChestXNeg;
    public TileEntityOceanChest adjacentChestZPos;
	@Override
	public void closeInventory(EntityPlayer player)
    {
        if (this.getBlockType() instanceof BlockOceanChest)
        {
            --this.numPlayersUsing;
            this.worldObj.addBlockEvent(this.getPos(), this.getBlockType(), 1, this.numPlayersUsing);
            this.worldObj.notifyNeighborsOfStateChange(this.pos, this.getBlockType());
            this.worldObj.notifyNeighborsOfStateChange(this.pos.offsetDown(), this.getBlockType());
        }
    }
	
	@Override
	public int getChestType()
    {
        return 0;
    }
	
	@Override
	public boolean hasCustomName()
    {
        return true;
    }
}
