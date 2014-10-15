package com.eternaldoom.realmsofchaos.water.gen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.LongHashMap;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;

public class TeleporterWater extends Teleporter
{

    private final WorldServer worldServerInstance;
    private final Random random;
    private final LongHashMap destinationCoordinateCache = new LongHashMap();
    private final List destinationCoordinateKeys = new ArrayList();
    private BlockPos helperPos;

    public TeleporterWater(WorldServer par1WorldServer) {
    	super(par1WorldServer);
        this.worldServerInstance = par1WorldServer;
        this.random = new Random(par1WorldServer.getSeed());
    }

    @Override
    public void placeInPortal(Entity par1Entity, float par2)
    {
        if (this.worldServerInstance.provider.getDimensionId() != 1)
        {
            if (!this.placeInExistingPortal(par1Entity, par2))
            {
                this.makePortal(par1Entity);
                this.placeInExistingPortal(par1Entity, par2);
            }
        }
        else
        {
            int i = MathHelper.floor_double(par1Entity.posX);
            int j = MathHelper.floor_double(par1Entity.posY) - 1;
            int k = MathHelper.floor_double(par1Entity.posZ);
            byte b0 = 1;
            byte b1 = 0;

            for (int l = -2; l <= 2; ++l)
            {
                for (int i1 = -2; i1 <= 2; ++i1)
                {
                    for (int j1 = -1; j1 < 3; ++j1)
                    {
                        int k1 = i + i1 * b0 + l * b1;
                        int l1 = j + j1;
                        int i2 = k + i1 * b1 - l * b0;
                        boolean flag = j1 < 0;
                        setBlock(this.worldServerInstance, i, j+100, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i, j+101, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+1, j+100, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+100, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+1, j+101, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+101, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+101, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+100, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+100, k-1, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+101, k-1, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+100, k-2, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+101, k-2, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+100, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+101, k-3, ROCBlocks.oceanstone_bricks);
                        
                        setBlock(this.worldServerInstance, i-1, j+100, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+101, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i, j+100, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i, j+101, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+1, j+100, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+1, j+101, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+100, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+101, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+1, j+101, k-1, ROCBlocks.water_portal);
                        setBlock(this.worldServerInstance, i+1, j+101, k-2, ROCBlocks.water_portal);
                        setBlock(this.worldServerInstance, i, j+101, k-1, ROCBlocks.water_portal);
                        setBlock(this.worldServerInstance, i, j+101, k-2, ROCBlocks.water_portal);
                        setBlock(this.worldServerInstance, i+2, j+101, k-1, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+100, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+101, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+101, k-1, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+100, k-1, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+101, k-2, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+100, k-2, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+1, j+99, k-1, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+1, j+99, k-2, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i, j+99, k-1, ROCBlocks.ocean_cobblestone);
                        setBlock(this.worldServerInstance, i, j+99, k-2, ROCBlocks.oceanstone_bricks);

                    }
                }
            }

            par1Entity.setLocationAndAngles((double)i, (double)j, (double)k, par1Entity.rotationYaw, 0.0F);
            par1Entity.motionX = par1Entity.motionY = par1Entity.motionZ = 0.0D;
        }
    }

    @Override
    public boolean placeInExistingPortal(Entity par1Entity, float par2)
    {
        short short1 = 128;
        double d3 = -1.0D;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = MathHelper.floor_double(par1Entity.posX);
        int i1 = MathHelper.floor_double(par1Entity.posZ);
        long j1 = ChunkCoordIntPair.chunkXZ2Int(l, i1);
        boolean flag = true;
        double d7;
        int l3;

        if (this.destinationCoordinateCache.containsItem(j1))
        {
            TeleporterWater.PortalPosition portalposition = (TeleporterWater.PortalPosition)this.destinationCoordinateCache.getValueByKey(j1);
            d3 = 0.0D;
            i = portalposition.getX();
            j = portalposition.getY();
            k = portalposition.getZ();
            portalposition.lastUpdateTime = this.worldServerInstance.getTotalWorldTime();
            flag = false;
        }
        else
        {
            for (l3 = l - short1; l3 <= l + short1; ++l3)
            {
                double d4 = (double)l3 + 0.5D - par1Entity.posX;

                for (int l1 = i1 - short1; l1 <= i1 + short1; ++l1)
                {
                    double d5 = (double)l1 + 0.5D - par1Entity.posZ;

                    for (int i2 = this.worldServerInstance.getActualHeight() - 1; i2 >= 0; --i2)
                    {
                        if (getBlock(this.worldServerInstance, l3, i2, l1) == ROCBlocks.water_portal)
                        {
                            while (getBlock(this.worldServerInstance, l3, i2 - 1, l1) == ROCBlocks.water_portal)
                            {
                                --i2;
                            }

                            d7 = (double)i2 + 0.5D - par1Entity.posY;
                            double d8 = d4 * d4 + d7 * d7 + d5 * d5;

                            if (d3 < 0.0D || d8 < d3)
                            {
                                d3 = d8;
                                i = l3;
                                j = i2;
                                k = l1;
                            }
                        }
                    }
                }
            }
        }

        if (d3 >= 0.0D)
        {
            if (flag)
            {
                this.destinationCoordinateCache.add(j1, new TeleporterWater.PortalPosition(i, j, k, this.worldServerInstance.getTotalWorldTime()));
                this.destinationCoordinateKeys.add(Long.valueOf(j1));
            }

            double d11 = (double)i + 0.5D;
            double d6 = (double)j + 0.5D;
            d7 = (double)k + 0.5D;
            int i4 = -1;

            if (getBlock(this.worldServerInstance, i - 1, j, k) == ROCBlocks.water_portal)
            {
                i4 = 2;
            }

            if (getBlock(this.worldServerInstance, i, j, k) == ROCBlocks.water_portal)
            {
                i4 = 0;
            }

            if (getBlock(this.worldServerInstance, i, j, k - 1) == ROCBlocks.water_portal)
            {
                i4 = 3;
            }

            if (getBlock(this.worldServerInstance, i, j, k + 1) == ROCBlocks.water_portal)
            {
                i4 = 1;
            }

            int j2 = par1Entity.getTeleportDirection();

            
            par1Entity.motionX = par1Entity.motionY = par1Entity.motionZ = 0.0D;

            par1Entity.setLocationAndAngles(d11, d6, d7, par1Entity.rotationYaw, par1Entity.rotationPitch);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean makePortal(Entity par1Entity)
    {
        byte b0 = 16;
        double d0 = -1.0D;
        int i = MathHelper.floor_double(par1Entity.posX);
        int j = 25;
        int k = MathHelper.floor_double(par1Entity.posZ);
        int l = i;
        int i1 = j;
        int j1 = k;
        int k1 = 0;
        int l1 = this.random.nextInt(4);
        int i2;
        double d1;
        double d2;
        int k2;
        int i3;
        int k3;
        int j3;
        int i4;
        int l3;
        int k4;
        int j4;
        int i5;
        int l4;
        double d3;
        double d4;

        for (i2 = i - b0; i2 <= i + b0; ++i2)
        {
            d1 = (double)i2 + 0.5D - par1Entity.posX;

            for (k2 = k - b0; k2 <= k + b0; ++k2)
            {
                d2 = (double)k2 + 0.5D - par1Entity.posZ;
                label274:

                for (i3 = this.worldServerInstance.getActualHeight() - 1; i3 >= 0; --i3)
                {
                    if (this.worldServerInstance.isAirBlock(new BlockPos(i2, i3, k2)))
                    {
                        while (i3 > 0 && this.worldServerInstance.isAirBlock(new BlockPos(i2, i3 - 1, k2)))
                        {
                            --i3;
                        }

                        for (j3 = l1; j3 < l1 + 4; ++j3)
                        {
                            k3 = j3 % 2;
                            l3 = 1 - k3;

                            if (j3 % 4 >= 2)
                            {
                                k3 = -k3;
                                l3 = -l3;
                            }

                            for (i4 = 0; i4 < 3; ++i4)
                            {
                                for (j4 = 0; j4 < 4; ++j4)
                                {
                                    for (k4 = -1; k4 < 4; ++k4)
                                    {
                                        l4 = i2 + (j4 - 1) * k3 + i4 * l3;
                                        i5 = i3 + k4;
                                        int j5 = k2 + (j4 - 1) * l3 - i4 * k3;

                                        if (k4 < 0 && !getBlock(this.worldServerInstance, l4, i5, j5).getMaterial().isSolid() || k4 >= 0 && !this.worldServerInstance.isAirBlock(new BlockPos(l4, i5, j5)))
                                        {
                                            continue label274;
                                        }
                                    }
                                }
                            }

                            d4 = (double)i3 + 0.5D - par1Entity.posY;
                            d3 = d1 * d1 + d4 * d4 + d2 * d2;

                            if (d0 < 0.0D || d3 < d0)
                            {
                                d0 = d3;
                                l = i2;
                                i1 = i3;
                                j1 = k2;
                                k1 = j3 % 4;
                            }
                        }
                    }
                }
            }
        }

        if (d0 < 0.0D)
        {
            for (i2 = i - b0; i2 <= i + b0; ++i2)
            {
                d1 = (double)i2 + 0.5D - par1Entity.posX;

                for (k2 = k - b0; k2 <= k + b0; ++k2)
                {
                    d2 = (double)k2 + 0.5D - par1Entity.posZ;
                    label222:

                    for (i3 = this.worldServerInstance.getActualHeight() - 1; i3 >= 0; --i3)
                    {
                        if (this.worldServerInstance.isAirBlock(new BlockPos(i2, i3, k2)))
                        {
                            while (i3 > 0 && this.worldServerInstance.isAirBlock(new BlockPos(i2, i3 - 1, k2)))
                            {
                                --i3;
                            }

                            for (j3 = l1; j3 < l1 + 2; ++j3)
                            {
                                k3 = j3 % 2;
                                l3 = 1 - k3;

                                for (i4 = 0; i4 < 4; ++i4)
                                {
                                    for (j4 = -1; j4 < 4; ++j4)
                                    {
                                        k4 = i2 + (i4 - 1) * k3;
                                        l4 = i3 + j4;
                                        i5 = k2 + (i4 - 1) * l3;

                                        if (j4 < 0 && !getBlock(this.worldServerInstance, k4, l4, i5).getMaterial().isSolid() || j4 >= 0 && !this.worldServerInstance.isAirBlock(new BlockPos(k4, l4, i5)))
                                        {
                                            continue label222;
                                        }
                                    }
                                }

                                d4 = (double)i3 + 0.5D - par1Entity.posY;
                                d3 = d1 * d1 + d4 * d4 + d2 * d2;

                                if (d0 < 0.0D || d3 < d0)
                                {
                                    d0 = d3;
                                    l = i2;
                                    i1 = i3;
                                    j1 = k2;
                                    k1 = j3 % 2;
                                }
                            }
                        }
                    }
                }
            }
        }

        int k5 = l;
        int j2 = i1;
        k2 = j1;
        int l5 = k1 % 2;
        int l2 = 1 - l5;

        if (k1 % 4 >= 2)
        {
            l5 = -l5;
            l2 = -l2;
        }

        boolean flag;

        if (d0 < 0.0D)
        {
            if (i1 < 70)
            {
                i1 = 70;
            }

            if (i1 > this.worldServerInstance.getActualHeight() - 10)
            {
                i1 = this.worldServerInstance.getActualHeight() - 10;
            }

            j2 = i1;

            for (i3 = -1; i3 <= 1; ++i3)
            {
                for (j3 = 1; j3 < 3; ++j3)
                {
                    for (k3 = -1; k3 < 3; ++k3)
                    {
                        l3 = k5 + (j3 - 1) * l5 + i3 * l2;
                        i4 = j2 + k3;
                        j4 = k2 + (j3 - 1) * l2 - i3 * l5;
                        flag = k3 < 0;
                        setBlock(this.worldServerInstance, i, j+100, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i, j+101, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+1, j+100, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+100, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+1, j+101, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+101, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+101, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+100, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+100, k-1, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+101, k-1, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+100, k-2, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+101, k-2, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+100, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+101, k-3, ROCBlocks.oceanstone_bricks);
                        
                        setBlock(this.worldServerInstance, i-1, j+100, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i-1, j+101, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i, j+100, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i, j+101, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+1, j+100, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+1, j+101, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+100, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+101, k-3, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+1, j+101, k-1, ROCBlocks.water_portal);
                        setBlock(this.worldServerInstance, i+1, j+101, k-2, ROCBlocks.water_portal);
                        setBlock(this.worldServerInstance, i, j+101, k-1, ROCBlocks.water_portal);
                        setBlock(this.worldServerInstance, i, j+101, k-2, ROCBlocks.water_portal);
                        setBlock(this.worldServerInstance, i+2, j+101, k-1, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+100, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+101, k, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+101, k-1, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+100, k-1, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+101, k-2, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+2, j+100, k-2, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+1, j+99, k-1, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i+1, j+99, k-2, ROCBlocks.oceanstone_bricks);
                        setBlock(this.worldServerInstance, i, j+99, k-1, ROCBlocks.ocean_cobblestone);
                        setBlock(this.worldServerInstance, i, j+99, k-2, ROCBlocks.oceanstone_bricks);
                }
            }
        }

        for (i3 = 0; i3 < 4; ++i3)
        {
            for (j3 = 0; j3 < 4; ++j3)
            {
                for (k3 = -1; k3 < 4; ++k3)
                {
                    l3 = k5 + (j3 - 1) * l5;
                    i4 = j2 + k3;
                    j4 = k2 + (j3 - 1) * l2;
                    flag = j3 == 0 || j3 == 3 || k3 == -1 || k3 == 3;
                    setBlock(this.worldServerInstance, i, j+100, k, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i, j+101, k, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+1, j+100, k, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+2, j+100, k, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+1, j+101, k, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+2, j+101, k, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i-1, j+101, k, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i-1, j+100, k, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i-1, j+100, k-1, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i-1, j+101, k-1, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i-1, j+100, k-2, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i-1, j+101, k-2, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i-1, j+100, k-3, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i-1, j+101, k-3, ROCBlocks.oceanstone_bricks);
                    
                    setBlock(this.worldServerInstance, i-1, j+100, k-3, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i-1, j+101, k-3, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i, j+100, k-3, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i, j+101, k-3, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+1, j+100, k-3, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+1, j+101, k-3, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+2, j+100, k-3, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+2, j+101, k-3, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+1, j+101, k-1, ROCBlocks.water_portal);
                    setBlock(this.worldServerInstance, i+1, j+101, k-2, ROCBlocks.water_portal);
                    setBlock(this.worldServerInstance, i, j+101, k-1, ROCBlocks.water_portal);
                    setBlock(this.worldServerInstance, i, j+101, k-2, ROCBlocks.water_portal);
                    setBlock(this.worldServerInstance, i+2, j+101, k-1, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+2, j+100, k, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+2, j+101, k, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+2, j+101, k-1, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+2, j+100, k-1, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+2, j+101, k-2, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+2, j+100, k-2, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+1, j+99, k-1, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i+1, j+99, k-2, ROCBlocks.oceanstone_bricks);
                    setBlock(this.worldServerInstance, i, j+99, k-1, ROCBlocks.ocean_cobblestone);
                    setBlock(this.worldServerInstance, i, j+99, k-2, ROCBlocks.oceanstone_bricks);
                }
            }
        }
        }
        return true;
        
    }

    public void removeStalePortalLocations(long par1)
    {
        if (par1 % 100L == 0L)
        {
            Iterator iterator = this.destinationCoordinateKeys.iterator();
            long j = par1 - 600L;

            while (iterator.hasNext())
            {
                Long olong = (Long)iterator.next();
                TeleporterWater.PortalPosition portalposition = (TeleporterWater.PortalPosition)this.destinationCoordinateCache.getValueByKey(olong.longValue());

                if (portalposition == null || portalposition.lastUpdateTime < j)
                {
                    iterator.remove();
                    this.destinationCoordinateCache.remove(olong.longValue());
                }
            }
        }
    }

    public class PortalPosition extends BlockPos {
        public long lastUpdateTime;

        public PortalPosition(int par2, int par3, int par4, long par5)
        {
            super(par2, par3, par4);
            this.lastUpdateTime = par5;
        }
    }
    
    private void setBlock(WorldServer w, int i, int j, int k, Block block){
    	w.setBlockState(this.helperPos.add(i, j, k), block.getDefaultState());
    }
    
    private void setBlock(WorldServer w, int i, int j, int k, Block block, int meta, int flag){
    	w.setBlockState(this.helperPos.add(i, j, k), block.getStateFromMeta(meta), flag);
    }
    
    private Block getBlock(WorldServer w, int i, int j, int k){
		return w.getBlockState(this.helperPos.add(i, j, k)).getBlock();
	}
}