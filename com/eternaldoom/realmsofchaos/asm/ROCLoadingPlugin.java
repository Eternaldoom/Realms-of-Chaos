package com.eternaldoom.realmsofchaos.asm;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

public class ROCLoadingPlugin implements IFMLLoadingPlugin
{
    @Override
    public String[] getASMTransformerClass()
    {
	    System.out.println("HELLO THERE!");
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