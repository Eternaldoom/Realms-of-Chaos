package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.LongHashMap;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

public class TeleporterIceRuins extends Teleporter {

	private final WorldServer worldServerInstance;
	private final Random random;
	private final LongHashMap destinationCoordinateCache = new LongHashMap();
	private final List destinationCoordinateKeys = new ArrayList();
	private BlockPos helperPos = new BlockPos(0, 0, 0);

	public TeleporterIceRuins(WorldServer par1WorldServer) {
		super(par1WorldServer);
		this.worldServerInstance = par1WorldServer;
		this.random = new Random(par1WorldServer.getSeed());
	}

	@Override
	public void placeInPortal(Entity par1Entity, float par2) {
		if (this.worldServerInstance.provider.getDimensionId() != 1) {
			if (!this.placeInExistingPortal(par1Entity, par2)) {
				this.makePortal(par1Entity);
				this.placeInExistingPortal(par1Entity, par2);
			}
		} else {
			int i = MathHelper.floor_double(par1Entity.posX);
			int j = MathHelper.floor_double(par1Entity.posY) - 1;
			int k = MathHelper.floor_double(par1Entity.posZ);
			byte b0 = 1;
			byte b1 = 0;

			for (int l = -2; l <= 2; ++l) {
				for (int i1 = -2; i1 <= 2; ++i1) {
					for (int j1 = -1; j1 < 3; ++j1) {
						int k1 = i + i1 * b0 + l * b1;
						int l1 = j + j1;
						int i2 = k + i1 * b1 - l * b0;
						boolean flag = j1 < 0;
						setBlock(this.worldServerInstance, i, j - 1, k,
								ROCBlocks.ice_portal);
						setBlock(this.worldServerInstance, i, j, k,
								ROCBlocks.ice_portal);
						setBlock(this.worldServerInstance, i, j - 2, k,
								ROCBlocks.ice_portal);
						setBlock(this.worldServerInstance, i, j - 3, k,
								ROCBlocks.ice_portal);
						setBlock(this.worldServerInstance, i, j - 4, k,
								ROCBlocks.ice_portal);
						setBlock(this.worldServerInstance, i, j - 5, k,
								Blocks.packed_ice);
						setBlock(this.worldServerInstance, i + 1, j, k,
								Blocks.packed_ice);
						setBlock(this.worldServerInstance, i - 1, j, k,
								Blocks.packed_ice);
						setBlock(this.worldServerInstance, i, j, k - 1,
								Blocks.packed_ice);
						setBlock(this.worldServerInstance, i, j, k + 1,
								Blocks.packed_ice);
						setBlock(this.worldServerInstance, i + 1, j - 4, k,
								Blocks.packed_ice);
						setBlock(this.worldServerInstance, i - 1, j - 4, k,
								Blocks.packed_ice);
						setBlock(this.worldServerInstance, i, j - 4, k - 1,
								Blocks.packed_ice);
						setBlock(this.worldServerInstance, i, j - 4, k + 1,
								Blocks.packed_ice);
						setBlock(this.worldServerInstance, i + 1, j - 1, k,
								Blocks.air);
						setBlock(this.worldServerInstance, i + 1, j - 2, k,
								Blocks.air);
						setBlock(this.worldServerInstance, i + 1, j - 3, k,
								Blocks.air);
						setBlock(this.worldServerInstance, i - 1, j - 1, k,
								Blocks.air);
						setBlock(this.worldServerInstance, i - 1, j - 2, k,
								Blocks.air);
						setBlock(this.worldServerInstance, i - 1, j - 3, k,
								Blocks.air);
						setBlock(this.worldServerInstance, i, j - 1, k + 1,
								Blocks.air);
						setBlock(this.worldServerInstance, i, j - 2, k + 1,
								Blocks.air);
						setBlock(this.worldServerInstance, i, j - 3, k + 1,
								Blocks.air);
						setBlock(this.worldServerInstance, i, j - 1, k - 1,
								Blocks.air);
						setBlock(this.worldServerInstance, i, j - 2, k - 1,
								Blocks.air);
						setBlock(this.worldServerInstance, i, j - 3, k - 1,
								Blocks.air);

					}
				}
			}

			par1Entity.setLocationAndAngles((double) i, (double) j, (double) k,
					par1Entity.rotationYaw, 0.0F);
			par1Entity.motionX = par1Entity.motionY = par1Entity.motionZ = 0.0D;
		}
	}

	@Override
	public boolean placeInExistingPortal(Entity par1Entity, float par2) {
		short short1 = 128;
		double d3 = -1.0D;
		int i = 0;
		int j = 0;
		int k = 0;
		int l = MathHelper.floor_double(par1Entity.posX);
		int i1 = MathHelper.floor_double(par1Entity.posZ);
		long j1 = ChunkCoordIntPair.chunkXZ2Int(l, i1);
		boolean flag = true;
		double d7;
		int l3;

		if (this.destinationCoordinateCache.containsItem(j1)) {
			TeleporterIceRuins.PortalPosition portalposition = (TeleporterIceRuins.PortalPosition) this.destinationCoordinateCache
					.getValueByKey(j1);
			d3 = 0.0D;
			i = portalposition.getX();
			j = portalposition.getY();
			k = portalposition.getZ();
			portalposition.lastUpdateTime = this.worldServerInstance
					.getTotalWorldTime();
			flag = false;
		} else {
			for (l3 = l - short1; l3 <= l + short1; ++l3) {
				double d4 = (double) l3 + 0.5D - par1Entity.posX;

				for (int l1 = i1 - short1; l1 <= i1 + short1; ++l1) {
					double d5 = (double) l1 + 0.5D - par1Entity.posZ;

					for (int i2 = this.worldServerInstance.getActualHeight() - 1; i2 >= 0; --i2) {
						if (this.worldServerInstance.getBlockState(new BlockPos(l3, i2, l1)).getBlock() == ROCBlocks.ice_portal) {
							while (this.worldServerInstance.getBlockState(new BlockPos(l3,
									i2 - 1, l1)) == ROCBlocks.ice_portal) {
								--i2;
							}

							d7 = (double) i2 + 0.5D - par1Entity.posY;
							double d8 = d4 * d4 + d7 * d7 + d5 * d5;

							if (d3 < 0.0D || d8 < d3) {
								d3 = d8;
								i = l3;
								j = i2;
								k = l1;
							}
						}
					}
				}
			}
		}

		if (d3 >= 0.0D) {
			if (flag) {
				this.destinationCoordinateCache.add(j1,
						new TeleporterIceRuins.PortalPosition(i, j, k,
								this.worldServerInstance.getTotalWorldTime()));
				this.destinationCoordinateKeys.add(Long.valueOf(j1));
			}

			double d11 = (double) i + 0.5D;
			double d6 = (double) j + 0.5D;
			d7 = (double) k + 0.5D;
			int i4 = -1;

			if (this.getBlock(this.worldServerInstance, i - 1, j, k) == ROCBlocks.ice_portal) {
				i4 = 2;
			}

			if (this.getBlock(this.worldServerInstance, i, j, k) == ROCBlocks.ice_portal) {
				i4 = 0;
			}

			if (this.getBlock(this.worldServerInstance, i, j, k - 1) == ROCBlocks.ice_portal) {
				i4 = 3;
			}

			if (this.getBlock(this.worldServerInstance, i, j, k + 1) == ROCBlocks.ice_portal) {
				i4 = 1;
			}

			par1Entity.setLocationAndAngles(d11, d6, d7,
					par1Entity.rotationYaw, par1Entity.rotationPitch);
			return true;
		} else {
			return false;
		}
	}

	public boolean makePortal(Entity par1Entity) {
		int i = MathHelper.floor_double(par1Entity.posX);
		int j = MathHelper.floor_double(par1Entity.posY);
		int k = MathHelper.floor_double(par1Entity.posZ);

		if (this.getBlock(this.worldServerInstance, i, j, k) != Blocks.air) {
			int yCoord = 0;
			while (yCoord < 256) {
				yCoord++;
				if (this.getBlock(this.worldServerInstance, i, yCoord - 5, k) == Blocks.air && yCoord>40) {
					j = yCoord;
					break;
				}
			}
		}

		if (this.getBlock(this.worldServerInstance, i, j, k) == Blocks.air) {
			int yCoord = 256;
			while (yCoord > 0) {
				yCoord--;
				if (this.getBlock(this.worldServerInstance, i, yCoord - 5, k) != Blocks.air) {
					j = yCoord;
					break;
				}
			}
		}

		System.out.println(j);
		setBlock(this.worldServerInstance, i, j - 1, k, ROCBlocks.ice_portal);
		setBlock(this.worldServerInstance, i, j, k, ROCBlocks.ice_portal);
		setBlock(this.worldServerInstance, i, j - 2, k, ROCBlocks.ice_portal);
		setBlock(this.worldServerInstance, i, j - 3, k, ROCBlocks.ice_portal);
		setBlock(this.worldServerInstance, i, j - 4, k, ROCBlocks.ice_portal);
		setBlock(this.worldServerInstance, i, j - 5, k, Blocks.packed_ice);
		setBlock(this.worldServerInstance, i + 1, j, k, Blocks.packed_ice);
		setBlock(this.worldServerInstance, i - 1, j, k, Blocks.packed_ice);
		setBlock(this.worldServerInstance, i, j, k - 1, Blocks.packed_ice);
		setBlock(this.worldServerInstance, i, j, k + 1, Blocks.packed_ice);
		setBlock(this.worldServerInstance, i + 1, j - 4, k, Blocks.packed_ice);
		setBlock(this.worldServerInstance, i - 1, j - 4, k, Blocks.packed_ice);
		setBlock(this.worldServerInstance, i, j - 4, k - 1, Blocks.packed_ice);
		setBlock(this.worldServerInstance, i, j - 4, k + 1, Blocks.packed_ice);
		setBlock(this.worldServerInstance, i + 1, j - 1, k, Blocks.air);
		setBlock(this.worldServerInstance, i + 1, j - 2, k, Blocks.air);
		setBlock(this.worldServerInstance, i + 1, j - 3, k, Blocks.air);
		setBlock(this.worldServerInstance, i - 1, j - 1, k, Blocks.air);
		setBlock(this.worldServerInstance, i - 1, j - 2, k, Blocks.air);
		setBlock(this.worldServerInstance, i - 1, j - 3, k, Blocks.air);
		setBlock(this.worldServerInstance, i, j - 1, k + 1, Blocks.air);
		setBlock(this.worldServerInstance, i, j - 2, k + 1, Blocks.air);
		setBlock(this.worldServerInstance, i, j - 3, k + 1, Blocks.air);
		setBlock(this.worldServerInstance, i, j - 1, k - 1, Blocks.air);
		setBlock(this.worldServerInstance, i, j - 2, k - 1, Blocks.air);
		setBlock(this.worldServerInstance, i, j - 3, k - 1, Blocks.air);

		return true;

	}

	@Override
	public void removeStalePortalLocations(long par1) {
		if (par1 % 100L == 0L) {
			Iterator iterator = this.destinationCoordinateKeys.iterator();
			long j = par1 - 600L;

			while (iterator.hasNext()) {
				Long olong = (Long) iterator.next();
				TeleporterIceRuins.PortalPosition portalposition = (TeleporterIceRuins.PortalPosition) this.destinationCoordinateCache
						.getValueByKey(olong.longValue());

				if (portalposition == null || portalposition.lastUpdateTime < j) {
					iterator.remove();
					this.destinationCoordinateCache.remove(olong.longValue());
				}
			}
		}
	}

	public class PortalPosition extends BlockPos {
		public long lastUpdateTime;

		public PortalPosition(int par2, int par3, int par4, long par5) {
			super(par2, par3, par4);
			this.lastUpdateTime = par5;
		}
	}
	
	private void setBlock(WorldServer w, int i, int j, int k, Block block){
    	w.setBlockState(this.helperPos.add(i, j, k), block.getDefaultState());
    }
    
    private void setBlock(WorldServer w, int i, int j, int k, Block block, int meta, int flag){
    	w.setBlockState(this.helperPos.add(i, j, k), block.getStateFromMeta(meta), flag);
    }
    
    private Block getBlock(WorldServer w, int i, int j, int k){
		return w.getBlockState(this.helperPos.add(i, j, k)).getBlock();
	}
}