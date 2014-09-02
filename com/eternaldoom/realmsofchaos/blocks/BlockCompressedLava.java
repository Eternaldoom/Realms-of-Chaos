package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.RealmsOfChaos;

public class BlockCompressedLava extends BlockGlowing{

	public BlockCompressedLava() {
		super(Material.rock, "realmsofchaos:compressed_lava", "lavaCompressed", 2.5f, 5.5f, soundTypePiston, 15);
	}
	
	@Override
    public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity){
		entity.setFire(400);
		entity.attackEntityFrom(RealmsOfChaos.molten, 7.0f);
	}

	
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
        float f = 0.0625F;
        return AxisAlignedBB.getBoundingBox((double)((float)i + f), (double)j, (double)((float)k + f), (double)((float)(i + 1) - f), (double)((float)(j + 1) - f), (double)((float)(k + 1) - f));
    }
}
