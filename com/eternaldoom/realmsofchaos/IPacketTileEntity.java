package com.eternaldoom.realmsofchaos;

import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

public interface IPacketTileEntity {
	
	public void onPacket(S35PacketUpdateTileEntity packet);

}
