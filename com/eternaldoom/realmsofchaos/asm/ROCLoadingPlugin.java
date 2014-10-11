package com.eternaldoom.realmsofchaos.asm;

import java.util.Map;

import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

public class ROCLoadingPlugin implements IFMLLoadingPlugin
{
    @Override
    public String[] getASMTransformerClass()
    {
	    LogManager.getLogger().info("Loading Coremod...");
	    return new String[] { ROCTransformer.class.getName() };
    }

    @Override
    public String getModContainerClass()
    {
	    return null;
    }

    @Override
    public String getSetupClass()
    {
	    return null;
    }

    @Override
    public void injectData(Map<String, Object> data)
    {
    }

    @Override
    public String getAccessTransformerClass()
    {
	    return null;
    }

}