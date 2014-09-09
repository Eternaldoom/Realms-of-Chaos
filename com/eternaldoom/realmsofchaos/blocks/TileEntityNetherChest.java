package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.tileentity.TileEntityChest;

public class TileEntityNetherChest extends TileEntityChest{
	
	public TileEntityNetherChest(){
		func_145976_a("Nether Chest");
	}
	
	private int cachedChestType;
	public TileEntityNetherChest adjacentChestZNeg;
    public TileEntityNetherChest adjacentChestXPos;
    public TileEntityNetherChest adjacentChestXNeg;
    public TileEntityNetherChest adjacentChestZPos;
	@Override
	public void closeInventory()
    {
        if (this.getBlockType() instanceof BlockNetherChest)
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
	
	@Override
	public boolean hasCustomInventoryName()
    {
        return true;
    }
	
	private void checkforte(TileEntityNetherChest tile, int par2)
    {
        if (tile.isInvalid())
        {
            this.adjacentChestChecked = false;
        }
        else if (this.adjacentChestChecked)
        {
            switch (par2)
            {
                case 0:
                    if (this.adjacentChestZPos != tile)
                    {
                        this.adjacentChestChecked = false;
                    }

                    break;
                case 1:
                    if (this.adjacentChestXNeg != tile)
                    {
                        this.adjacentChestChecked = false;
                    }

                    break;
                case 2:
                    if (this.adjacentChestZNeg != tile)
                    {
                        this.adjacentChestChecked = false;
                    }

                    break;
                case 3:
                    if (this.adjacentChestXPos != tile)
                    {
                        this.adjacentChestChecked = false;
                    }
            }
        }
    }

	@Override
    public void checkForAdjacentChests()
    {
        if (!this.adjacentChestChecked)
        {
            this.adjacentChestChecked = true;
            this.adjacentChestZNeg = null;
            this.adjacentChestXPos = null;
            this.adjacentChestXNeg = null;
            this.adjacentChestZPos = null;

            if (this.checkforblock(this.xCoord - 1, this.yCoord, this.zCoord))
            {
                this.adjacentChestXNeg = (TileEntityNetherChest)this.worldObj.getTileEntity(this.xCoord - 1, this.yCoord, this.zCoord);
            }

            if (this.checkforblock(this.xCoord + 1, this.yCoord, this.zCoord))
            {
                this.adjacentChestXPos = (TileEntityNetherChest)this.worldObj.getTileEntity(this.xCoord + 1, this.yCoord, this.zCoord);
            }

            if (this.checkforblock(this.xCoord, this.yCoord, this.zCoord - 1))
            {
                this.adjacentChestZNeg = (TileEntityNetherChest)this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord - 1);
            }

            if (this.checkforblock(this.xCoord, this.yCoord, this.zCoord + 1))
            {
                this.adjacentChestZPos = (TileEntityNetherChest)this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord + 1);
            }

            if (this.adjacentChestZNeg != null)
            {
                this.adjacentChestZNeg.checkforte(this, 0);
            }

            if (this.adjacentChestZPos != null)
            {
                this.adjacentChestZPos.checkforte(this, 2);
            }

            if (this.adjacentChestXPos != null)
            {
                this.adjacentChestXPos.checkforte(this, 1);
            }

            if (this.adjacentChestXNeg != null)
            {
                this.adjacentChestXNeg.checkforte(this, 3);
            }
        }
    }
	
	private boolean checkforblock(int p_145977_1_, int p_145977_2_, int p_145977_3_)
    {
        if (this.worldObj == null)
        {
            return false;
        }
        else
        {
            Block block = this.worldObj.getBlock(p_145977_1_, p_145977_2_, p_145977_3_);
            return block instanceof BlockNetherChest;
        }
    }

}
