package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockCompressedLava extends BlockGlowing{

	public BlockCompressedLava() {
		super(Material.rock, "lavaCompressed", 2.5f, 5.5f, soundTypePiston, 15);
	}
	
	@Override
    public void onEntityCollidedWithBlock(World world, BlockPos pos, Entity entity){
		entity.setFire(400);
		entity.attackEntityFrom(/*RealmsOfChaos.molten*/DamageSource.cactus, 7.0f);
	}

	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(World world, BlockPos pos, IBlockState state)
    {
        float f = 0.0625F;
        return new AxisAlignedBB((double)((float)pos.getX() + f), (double)pos.getY(), (double)((float)pos.getZ() + f), (double)((float)(pos.getX() + 1) - f), (double)((float)(pos.getY() + 1) - f), (double)((float)(pos.getZ() + 1) - f));
    }
	
	@Override
	public boolean isFullCube()
    {
        return false;
    }
}
