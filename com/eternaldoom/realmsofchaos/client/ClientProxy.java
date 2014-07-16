package com.eternaldoom.realmsofchaos.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy {
	
	public void init(){
		System.out.println("[Realms of Chaos] Registering Renderers");
	}

}
