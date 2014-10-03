package com.eternaldoom.realmsofchaos.water.gen;

import net.minecraft.util.BlockPos;

public class PortalPositionWater extends BlockPos {
	public long field_85087_d;
	final TeleporterWater field_85088_e;

	public PortalPositionWater(TeleporterWater tp, int par2,
			int par3, int par4, long par5) {
		super(par2, par3, par4);
		this.field_85088_e = tp;
		this.field_85087_d = par5;
	}
}