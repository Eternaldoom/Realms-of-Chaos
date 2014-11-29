package com.eternaldoom.realmsofchaos.entity;

import net.minecraft.block.material.Material;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.items.ROCItems;

public class EntityKelpFish extends EntityAmbientCreature {
	public BlockPos spawnPosition;
	public boolean angry;

	public EntityKelpFish(World world) {
		super(world);
		this.setSize(0.5F, 0.5F);
		}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataWatcher.addObject(16, new Byte((byte) 0));
	}

	@Override
	public boolean canBePushed() {
		return true;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(15.0D);
	}

	protected boolean isAIEnabled() {
		return true;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (this.worldObj.getBlockState(new BlockPos((int) this.posX,
				MathHelper.floor_double(this.posY), (int) this.posZ)).getBlock() == Blocks.air)
			this.motionY *= 1.0000000238418579D;

		if ((this.worldObj.getBlockState(new BlockPos((int) Math.round(this.posX),
				MathHelper.floor_double(this.posY) - 1, (int) this.posZ)).getBlock() != Blocks.air
				&& this.worldObj
						.getBlockState(new BlockPos((int) this.posX,
								MathHelper.floor_double(this.posY) - 1,
								(int) this.posZ)).getBlock() != Blocks.water && (this.worldObj
				.getBlockState(new BlockPos((int) this.posX, MathHelper.floor_double(this.posY),
						(int) this.posZ)).getBlock() == Blocks.air || this.worldObj
				.getBlockState(new BlockPos((int) this.posX, MathHelper.floor_double(this.posY),
						(int) this.posZ)).getBlock().getMaterial() == Material.plants))
				|| this.worldObj
						.getBlockState(new BlockPos((int) this.posX,
								MathHelper.floor_double(this.posY),
								(int) this.posZ)).getBlock().getMaterial() == Material.plants) {
			this.motionY = 0.4;
			switch (this.rand.nextInt(4)) {
			case 0:
				this.motionX = 0.25;
				this.motionZ = 0.25;
				break;
			case 1:
				this.motionX = 0.25;
				this.motionZ = -0.25;
				break;
			case 2:
				this.motionX = -0.25;
				this.motionZ = -0.25;
				break;
			case 3:
				this.motionX = -0.25;
				this.motionZ = 0.25;
			}
		}
	}

	@Override
	protected void updateAITasks() {
		super.updateAITasks();
		if (this.spawnPosition != null
				&& ((this.worldObj.getBlockState(new BlockPos(this.spawnPosition.getX(),
						this.spawnPosition.getY(), this.spawnPosition.getZ())).getBlock() != Blocks.water && this.worldObj.getBlockState(new BlockPos(this.spawnPosition.getX(),
								this.spawnPosition.getY(), this.spawnPosition.getZ())).getBlock() != ROCBlocks.seaweed)|| this.spawnPosition.getY() < 1)) {
			this.spawnPosition = null;
		}

		if (this.spawnPosition == null
				|| this.spawnPosition.distanceSq((int) this.posX,
						(int) this.posY, (int) this.posZ) < 6.0F) {
			if ((this.worldObj.getBlockState(new BlockPos((int) this.posX,
					MathHelper.floor_double(this.posY) - 5, (int) this.posZ)).getBlock() != Blocks.water && this.worldObj.getBlockState(new BlockPos((int) this.posX,
							MathHelper.floor_double(this.posY) - 5, (int) this.posZ)).getBlock() != ROCBlocks.seaweed)
					&& (this.worldObj.getBlockState(new BlockPos((int) this.posX,
							MathHelper.floor_double(this.posY) + 9,
							(int) this.posZ)).getBlock() == Blocks.water || this.worldObj.getBlockState(new BlockPos((int) this.posX,
									MathHelper.floor_double(this.posY) + 9,
									(int) this.posZ)).getBlock() == ROCBlocks.seaweed) || this.rand.nextInt(30) == 0) {
				switch (this.rand.nextInt(2)) {
				case 0:
					this.spawnPosition = new BlockPos((int) this.posX
							+ this.rand.nextInt(36) + this.rand.nextInt(6),
							(int) this.posY + this.rand.nextInt(10) + 3,
							(int) this.posZ + this.rand.nextInt(36)
									+ this.rand.nextInt(6));
				case 1:
					this.spawnPosition = new BlockPos((int) this.posX
							+ this.rand.nextInt(36) - this.rand.nextInt(18),
							(int) this.posY + this.rand.nextInt(10) + 3,
							(int) this.posZ + this.rand.nextInt(36)
									- this.rand.nextInt(18));
				}
			} else if ((this.worldObj.getBlockState(new BlockPos((int) this.posX,
					MathHelper.floor_double(this.posY) - 5, (int) this.posZ)).getBlock() == Blocks.water || this.worldObj.getBlockState(new BlockPos((int) this.posX,
							MathHelper.floor_double(this.posY) - 5, (int) this.posZ)).getBlock() == ROCBlocks.seaweed)
					&& (this.worldObj.getBlockState(new BlockPos((int) this.posX,
							MathHelper.floor_double(this.posY) + 9,
							(int) this.posZ)).getBlock() != Blocks.water && this.worldObj.getBlockState(new BlockPos((int) this.posX,
									MathHelper.floor_double(this.posY) + 9,
									(int) this.posZ)).getBlock() != ROCBlocks.seaweed)) {
				switch (this.rand.nextInt(2)) {
				case 0:
					this.spawnPosition = new BlockPos((int) this.posX
							+ this.rand.nextInt(36) + this.rand.nextInt(6),
							(int) this.posY - this.rand.nextInt(10) - 4,
							(int) this.posZ + this.rand.nextInt(36)
									+ this.rand.nextInt(6));
				case 1:
					this.spawnPosition = new BlockPos((int) this.posX
							+ this.rand.nextInt(36) - this.rand.nextInt(18),
							(int) this.posY - this.rand.nextInt(10) - 4,
							(int) this.posZ + this.rand.nextInt(36)
									- this.rand.nextInt(18));
				}
			} else {
					this.spawnPosition = new BlockPos((int) this.posX
							+ this.rand.nextInt(12) + 5 - this.rand.nextInt(12)
							- 5,
							(int) this.posY - this.rand.nextInt(6) - 3,
							(int) this.posZ + this.rand.nextInt(12) + 5
									- this.rand.nextInt(12) - 5);
			}
		}

		if (this.worldObj.getBlockState(new BlockPos(this.spawnPosition.getX(),
				this.spawnPosition.getY(), this.spawnPosition.getZ())).getBlock() == Blocks.air) {
			this.spawnPosition.offsetDown(5);
		}

		if (this.worldObj.getBlockState(new BlockPos((int) this.posX,
				MathHelper.floor_double(this.posY), (int) this.posZ)).getBlock() == Blocks.water || this.worldObj.getBlockState(new BlockPos((int) this.posX,
						MathHelper.floor_double(this.posY), (int) this.posZ)).getBlock() == ROCBlocks.seaweed) {
			double i = (double) this.spawnPosition.getX() - this.posX;
			double j = (double) this.spawnPosition.getY() - this.posY;
			double k = (double) this.spawnPosition.getZ() - this.posZ;
			this.motionX += (Math.signum(i) * 0.5D - this.motionX) * 0.10000000149011612D;
			this.motionY += (Math.signum(j) * 0.699999988079071D - this.motionY) * 0.10000000149011612D;
			this.motionZ += (Math.signum(k) * 0.5D - this.motionZ) * 0.10000000149011612D;
			float f = (float) (Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
			float f1 = MathHelper.wrapAngleTo180_float(f - this.rotationYaw);
			this.rotationYaw += f1;
			this.moveForward = 5F;
		}
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean getCanSpawnHere() {
		int i = MathHelper.floor_double(this.posX);
		int j = MathHelper.floor_double(this.posY);
		int k = MathHelper.floor_double(this.posZ);

			return this.worldObj.checkNoEntityCollision(this.getEntityBoundingBox())
					&& this.worldObj.getBlockState(new BlockPos(i, j, k)) == ROCBlocks.seaweed;
	}

	@Override
	public void onEntityUpdate() {
		int i = this.getAir();
		super.onEntityUpdate();

		if (this.isEntityAlive() && !this.isInWater()) {
			--i;
			this.setAir(i);

			if (this.getAir() == -20) {
				this.setAir(0);
				this.attackEntityFrom(DamageSource.drown, 2.0F);
			}
		} else {
			this.setAir(300);
		}
	}

	@Override
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		this.dropItem(Items.fish, 1);
		if (this.rand.nextInt(5) == 0)
			this.entityDropItem(new ItemStack(Items.fish, 1, 3), 0);
		if (this.rand.nextInt(10) == 5)
			this.dropItem(ROCItems.neptunite_ingot, 1);
	}
}