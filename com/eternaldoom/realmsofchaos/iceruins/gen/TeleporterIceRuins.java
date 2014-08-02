package com.eternaldoom.realmsofchaos.iceruins.gen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.eternaldoom.realmsofchaos.overworld.blocks.ROCBlocks;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.Direction;
import net.minecraft.util.LongHashMap;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class TeleporterIceRuins extends Teleporter {

	private final WorldServer worldServerInstance;
	private final Random random;
	private final LongHashMap destinationCoordinateCache = new LongHashMap();
	private final List destinationCoordinateKeys = new ArrayList();

	public TeleporterIceRuins(WorldServer par1WorldServer) {
		super(par1WorldServer);
		this.worldServerInstance = par1WorldServer;
		this.random = new Random(par1WorldServer.getSeed());
	}

	public void placeInPortal(Entity par1Entity, double par2, double par4,
			double par6, float par8) {
		if (this.worldServerInstance.provider.dimensionId != 1) {
			if (!this.placeInExistingPortal(par1Entity, par2, par4, par6, par8)) {
				this.makePortal(par1Entity);
				this.placeInExistingPortal(par1Entity, par2, par4, par6, par8);
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
						this.worldServerInstance.setBlock(i, j - 1, k,
								ROCBlocks.ice_portal);
						this.worldServerInstance.setBlock(i, j, k,
								ROCBlocks.ice_portal);
						this.worldServerInstance.setBlock(i, j - 2, k,
								ROCBlocks.ice_portal);
						this.worldServerInstance.setBlock(i, j - 3, k,
								ROCBlocks.ice_portal);
						this.worldServerInstance.setBlock(i, j - 4, k,
								ROCBlocks.ice_portal);
						this.worldServerInstance.setBlock(i, j - 5, k,
								Blocks.packed_ice);
						this.worldServerInstance.setBlock(i + 1, j, k,
								Blocks.packed_ice);
						this.worldServerInstance.setBlock(i - 1, j, k,
								Blocks.packed_ice);
						this.worldServerInstance.setBlock(i, j, k - 1,
								Blocks.packed_ice);
						this.worldServerInstance.setBlock(i, j, k + 1,
								Blocks.packed_ice);
						this.worldServerInstance.setBlock(i + 1, j - 4, k,
								Blocks.packed_ice);
						this.worldServerInstance.setBlock(i - 1, j - 4, k,
								Blocks.packed_ice);
						this.worldServerInstance.setBlock(i, j - 4, k - 1,
								Blocks.packed_ice);
						this.worldServerInstance.setBlock(i, j - 4, k + 1,
								Blocks.packed_ice);
						this.worldServerInstance.setBlock(i + 1, j - 1, k,
								Blocks.air);
						this.worldServerInstance.setBlock(i + 1, j - 2, k,
								Blocks.air);
						this.worldServerInstance.setBlock(i + 1, j - 3, k,
								Blocks.air);
						this.worldServerInstance.setBlock(i - 1, j - 1, k,
								Blocks.air);
						this.worldServerInstance.setBlock(i - 1, j - 2, k,
								Blocks.air);
						this.worldServerInstance.setBlock(i - 1, j - 3, k,
								Blocks.air);
						this.worldServerInstance.setBlock(i, j - 1, k + 1,
								Blocks.air);
						this.worldServerInstance.setBlock(i, j - 2, k + 1,
								Blocks.air);
						this.worldServerInstance.setBlock(i, j - 3, k + 1,
								Blocks.air);
						this.worldServerInstance.setBlock(i, j - 1, k - 1,
								Blocks.air);
						this.worldServerInstance.setBlock(i, j - 2, k - 1,
								Blocks.air);
						this.worldServerInstance.setBlock(i, j - 3, k - 1,
								Blocks.air);

					}
				}
			}

			par1Entity.setLocationAndAngles((double) i, (double) j, (double) k,
					par1Entity.rotationYaw, 0.0F);
			par1Entity.motionX = par1Entity.motionY = par1Entity.motionZ = 0.0D;
		}
	}

	public boolean placeInExistingPortal(Entity par1Entity, double par2,
			double par4, double par6, float par8) {
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
			i = portalposition.posX;
			j = portalposition.posY;
			k = portalposition.posZ;
			portalposition.lastUpdateTime = this.worldServerInstance
					.getTotalWorldTime();
			flag = false;
		} else {
			for (l3 = l - short1; l3 <= l + short1; ++l3) {
				double d4 = (double) l3 + 0.5D - par1Entity.posX;

				for (int l1 = i1 - short1; l1 <= i1 + short1; ++l1) {
					double d5 = (double) l1 + 0.5D - par1Entity.posZ;

					for (int i2 = this.worldServerInstance.getActualHeight() - 1; i2 >= 0; --i2) {
						if (this.worldServerInstance.getBlock(l3, i2, l1) == ROCBlocks.ice_portal) {
							while (this.worldServerInstance.getBlock(l3,
									i2 - 1, l1) == ROCBlocks.ice_portal) {
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

			if (this.worldServerInstance.getBlock(i - 1, j, k) == ROCBlocks.ice_portal) {
				i4 = 2;
			}

			if (this.worldServerInstance.getBlock(i, j, k) == ROCBlocks.ice_portal) {
				i4 = 0;
			}

			if (this.worldServerInstance.getBlock(i, j, k - 1) == ROCBlocks.ice_portal) {
				i4 = 3;
			}

			if (this.worldServerInstance.getBlock(i, j, k + 1) == ROCBlocks.ice_portal) {
				i4 = 1;
			}

			int j2 = par1Entity.getTeleportDirection();

			if (i4 > -1) {
				int k2 = Direction.rotateLeft[i4];
				int l2 = Direction.offsetX[i4];
				int i3 = Direction.offsetZ[i4];
				int j3 = Direction.offsetX[k2];
				int k3 = Direction.offsetZ[k2];
				boolean flag1 = !this.worldServerInstance.isAirBlock(i + l2
						+ j3, j, k + i3 + k3)
						|| !this.worldServerInstance.isAirBlock(i + l2 + j3,
								j + 1, k + i3 + k3);
				boolean flag2 = !this.worldServerInstance.isAirBlock(i + l2, j,
						k + i3)
						|| !this.worldServerInstance.isAirBlock(i + l2, j + 1,
								k + i3);

				if (flag1 && flag2) {
					i4 = Direction.rotateOpposite[i4];
					k2 = Direction.rotateOpposite[k2];
					l2 = Direction.offsetX[i4];
					i3 = Direction.offsetZ[i4];
					j3 = Direction.offsetX[k2];
					k3 = Direction.offsetZ[k2];
					l3 = i - j3;
					d11 -= (double) j3;
					int k1 = k - k3;
					d7 -= (double) k3;
					flag1 = !this.worldServerInstance.isAirBlock(l3 + l2 + j3,
							j, k1 + i3 + k3)
							|| !this.worldServerInstance.isAirBlock(l3 + l2
									+ j3, j + 1, k1 + i3 + k3);
					flag2 = !this.worldServerInstance.isAirBlock(l3 + l2, j, k1
							+ i3)
							|| !this.worldServerInstance.isAirBlock(l3 + l2,
									j + 1, k1 + i3);
				}

				float f1 = 0.5F;
				float f2 = 0.5F;

				if (!flag1 && flag2) {
					f1 = 1.0F;
				} else if (flag1 && !flag2) {
					f1 = 0.0F;
				} else if (flag1 && flag2) {
					f2 = 0.0F;
				}

				d11 += (double) ((float) j3 * f1 + f2 * (float) l2);
				d7 += (double) ((float) k3 * f1 + f2 * (float) i3);
				float f3 = 0.0F;
				float f4 = 0.0F;
				float f5 = 0.0F;
				float f6 = 0.0F;

				if (i4 == j2) {
					f3 = 1.0F;
					f4 = 1.0F;
				} else if (i4 == Direction.rotateOpposite[j2]) {
					f3 = -1.0F;
					f4 = -1.0F;
				} else if (i4 == Direction.rotateRight[j2]) {
					f5 = 1.0F;
					f6 = -1.0F;
				} else {
					f5 = -1.0F;
					f6 = 1.0F;
				}

				double d9 = par1Entity.motionX;
				double d10 = par1Entity.motionZ;
				par1Entity.motionX = d9 * (double) f3 + d10 * (double) f6;
				par1Entity.motionZ = d9 * (double) f5 + d10 * (double) f4;
				par1Entity.rotationYaw = par8 - (float) (j2 * 90)
						+ (float) (i4 * 90);
			} else {
				par1Entity.motionX = par1Entity.motionY = par1Entity.motionZ = 0.0D;
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

		if (this.worldServerInstance.getBlock(i, j, k) != Blocks.air) {
			int yCoord = 0;
			while (yCoord < 256) {
				yCoord++;
				if (this.worldServerInstance.getBlock(i, yCoord - 5, k) == Blocks.air && yCoord>40) {
					j = yCoord;
					break;
				}
			}
		}

		if (this.worldServerInstance.getBlock(i, j, k) == Blocks.air) {
			int yCoord = 256;
			while (yCoord > 0) {
				yCoord--;
				if (this.worldServerInstance.getBlock(i, yCoord - 5, k) != Blocks.air) {
					j = yCoord;
					break;
				}
			}
		}

		System.out.println(j);
		this.worldServerInstance.setBlock(i, j - 1, k, ROCBlocks.ice_portal);
		this.worldServerInstance.setBlock(i, j, k, ROCBlocks.ice_portal);
		this.worldServerInstance.setBlock(i, j - 2, k, ROCBlocks.ice_portal);
		this.worldServerInstance.setBlock(i, j - 3, k, ROCBlocks.ice_portal);
		this.worldServerInstance.setBlock(i, j - 4, k, ROCBlocks.ice_portal);
		this.worldServerInstance.setBlock(i, j - 5, k, Blocks.packed_ice);
		this.worldServerInstance.setBlock(i + 1, j, k, Blocks.packed_ice);
		this.worldServerInstance.setBlock(i - 1, j, k, Blocks.packed_ice);
		this.worldServerInstance.setBlock(i, j, k - 1, Blocks.packed_ice);
		this.worldServerInstance.setBlock(i, j, k + 1, Blocks.packed_ice);
		this.worldServerInstance.setBlock(i + 1, j - 4, k, Blocks.packed_ice);
		this.worldServerInstance.setBlock(i - 1, j - 4, k, Blocks.packed_ice);
		this.worldServerInstance.setBlock(i, j - 4, k - 1, Blocks.packed_ice);
		this.worldServerInstance.setBlock(i, j - 4, k + 1, Blocks.packed_ice);
		this.worldServerInstance.setBlock(i + 1, j - 1, k, Blocks.air);
		this.worldServerInstance.setBlock(i + 1, j - 2, k, Blocks.air);
		this.worldServerInstance.setBlock(i + 1, j - 3, k, Blocks.air);
		this.worldServerInstance.setBlock(i - 1, j - 1, k, Blocks.air);
		this.worldServerInstance.setBlock(i - 1, j - 2, k, Blocks.air);
		this.worldServerInstance.setBlock(i - 1, j - 3, k, Blocks.air);
		this.worldServerInstance.setBlock(i, j - 1, k + 1, Blocks.air);
		this.worldServerInstance.setBlock(i, j - 2, k + 1, Blocks.air);
		this.worldServerInstance.setBlock(i, j - 3, k + 1, Blocks.air);
		this.worldServerInstance.setBlock(i, j - 1, k - 1, Blocks.air);
		this.worldServerInstance.setBlock(i, j - 2, k - 1, Blocks.air);
		this.worldServerInstance.setBlock(i, j - 3, k - 1, Blocks.air);

		return true;

	}

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

	public class PortalPosition extends ChunkCoordinates {
		public long lastUpdateTime;
		private static final String __OBFID = "CL_00000154";

		public PortalPosition(int par2, int par3, int par4, long par5) {
			super(par2, par3, par4);
			this.lastUpdateTime = par5;
		}
	}
}