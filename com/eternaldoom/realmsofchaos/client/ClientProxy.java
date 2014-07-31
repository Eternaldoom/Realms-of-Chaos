package com.eternaldoom.realmsofchaos.client;

import com.jadarstudios.developercapes.DevCapes;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy {
	
	public static void init(){
		System.out.println("[Realms of Chaos] Registering Renderers");
		ROCKeyBindings.init();
		Renderers.init();
		DevCapes.getInstance().registerConfig("", identifier)
	}

}
