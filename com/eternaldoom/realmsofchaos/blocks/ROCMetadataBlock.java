package com.eternaldoom.realmsofchaos.blocks;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ROCMetadataBlock extends ROCModBlock
{
	private String[] textureNames;
    @SideOnly(Side.CLIENT)
    private IIcon[] theIcon;
    public int metaCount;

    public ROCMetadataBlock(int blockCount, String[] textureExtensions, Material mat, String name, float hard, float resist, SoundType sound)
    {
        super(mat, name, hard, resist, sound);
        
        this.metaCount = blockCount;
        this.textureNames = textureExtensions;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
        if (par2 < 0 || par2 >= textureNames.length)
        {
            par2 = 0;
        }
        
        return this.theIcon[par2];
    }

    public int damageDropped(int par1)
    {
        return par1;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list)
    {
        for (int i = 0; i < metaCount; ++i)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icons)
    {
        this.theIcon = new IIcon[textureNames.length];

        for (int i = 0; i < this.textureNames.length; ++i)
        {
            String s = this.getTextureName();

            if (textureNames[i] != null)
            {
                s = s + "_" + textureNames[i];
            }

            this.theIcon[i] = icons.registerIcon(s);
        }
    }
    
    public ROCMetadataBlock register(Class<? extends ItemBlock> ib, String name){
    	GameRegistry.registerBlock(this, ib, name);
    	return this;
    }
}