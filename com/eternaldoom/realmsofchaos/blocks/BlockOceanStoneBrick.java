package com.eternaldoom.realmsofchaos.blocks;

import java.util.List;

import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOceanStoneBrick extends ROCModBlock
{
	public static final PropertyEnum VARIANT_PROP = PropertyEnum.create("variant", BlockOceanStoneBrick.EnumType.class);
    public static final int DEFAULT_META = BlockOceanStoneBrick.EnumType.DEFAULT.getMetaFromState();
    public static final int CRACKED_META = BlockOceanStoneBrick.EnumType.CRACKED.getMetaFromState();
    public static final int CHISELED_META = BlockOceanStoneBrick.EnumType.CHISELED.getMetaFromState();
	
    public BlockOceanStoneBrick(Material mat, String name, float hard, float resist, SoundType sound)
    {
        super(mat, name, hard, resist, sound);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT_PROP, BlockOceanStoneBrick.EnumType.DEFAULT));
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return ((BlockOceanStoneBrick.EnumType)state.getValue(VARIANT_PROP)).getMetaFromState();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list)
    {
        BlockOceanStoneBrick.EnumType[] aenumtype = BlockOceanStoneBrick.EnumType.values();
        int i = aenumtype.length;

        for (int j = 0; j < i; ++j)
        {
            BlockOceanStoneBrick.EnumType enumtype = aenumtype[j];
            list.add(new ItemStack(item, 1, enumtype.getMetaFromState()));
        }
    }
    
    public BlockOceanStoneBrick register(Class<? extends ItemBlock> ib, String name){
    	ROCBlocks.registerBlock(this, ib, name);
    	return this;
    }
    
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(VARIANT_PROP, BlockOceanStoneBrick.EnumType.getStateFromMeta(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((BlockOceanStoneBrick.EnumType)state.getValue(VARIANT_PROP)).getMetaFromState();
    }
    
    @Override
    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {VARIANT_PROP});
    }
    
    public static enum EnumType implements IStringSerializable
    {
        DEFAULT(0, "oceanstone_bricks", "default"),
        CRACKED(1, "cracked_oceanstone_bricks", "cracked"),
        CHISELED(2, "chiseled_oceanstone_bricks", "chiseled");
        private static final BlockOceanStoneBrick.EnumType[] TYPES_ARRAY = new BlockOceanStoneBrick.EnumType[values().length];
        private final int meta;
        private final String textureName;
        private final String variantName;

        private EnumType(int p_i45679_3_, String p_i45679_4_, String p_i45679_5_)
        {
            this.meta = p_i45679_3_;
            this.textureName = p_i45679_4_;
            this.variantName = p_i45679_5_;
        }

        public int getMetaFromState()
        {
            return this.meta;
        }

        public String toString()
        {
            return this.textureName;
        }

        public static BlockOceanStoneBrick.EnumType getStateFromMeta(int p_176613_0_)
        {
            if (p_176613_0_ < 0 || p_176613_0_ >= TYPES_ARRAY.length)
            {
                p_176613_0_ = 0;
            }

            return TYPES_ARRAY[p_176613_0_];
        }

        public String getName()
        {
            return this.textureName;
        }

        public String getVariantName()
        {
            return this.variantName;
        }

        static
        {
            BlockOceanStoneBrick.EnumType[] var0 = values();
            int var1 = var0.length;

            for (int var2 = 0; var2 < var1; ++var2)
            {
                BlockOceanStoneBrick.EnumType var3 = var0[var2];
                TYPES_ARRAY[var3.getMetaFromState()] = var3;
            }
        }
    }
}