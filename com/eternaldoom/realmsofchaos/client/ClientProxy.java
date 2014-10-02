package com.eternaldoom.realmsofchaos.client;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.jadarstudios.developercapes.DevCapes;
import com.jadarstudios.developercapes.cape.CapeConfig;
import com.jadarstudios.developercapes.cape.CapeConfigManager;

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
