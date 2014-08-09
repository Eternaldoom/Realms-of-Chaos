package com.eternaldoom.realmsofchaos.client;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;
import com.jadarstudios.developercapes.DevCapes;
import com.jadarstudios.developercapes.cape.CapeConfig;
import com.jadarstudios.developercapes.cape.CapeConfigManager;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy {
	
	public static void init(){
		System.out.println("[Realms of Chaos] Registering Renderers");
		ROCKeyBindings.init();
		Renderers.init();
		
		try{
			InputStream is = DevCapes.getInstance().getStreamForURL(new URL("https://dl.dropboxusercontent.com/s/b1dc1vykv0hfseg/capes.json"));
			CapeConfig config = CapeConfigManager.INSTANCE.parseFromStream(is);
			CapeConfigManager.INSTANCE.addConfig(CapeConfigManager.getUniqueId(), config);
		}catch (MalformedURLException e){
			e.printStackTrace();
		}
	}
}
