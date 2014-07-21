package com.eternaldoom.realmsofchaos;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.item.ItemEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;

import com.eternaldoom.realmsofchaos.overworld.blocks.ROCBlocks;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PortalLightEvent {

	@SubscribeEvent
	public void checkForAndLightPortal(ItemEvent evt) {
		if (evt.entityItem.getEntityItem().getItem() == Item
				.getItemFromBlock(ROCBlocks.xylite_block)) {
			int x = (int) evt.entityItem.posX;
			int y = (int) evt.entityItem.posY;
			int z = (int) evt.entityItem.posZ;
			System.out.println(x + ", " + y + ", " + z);
			World w = evt.entityItem.worldObj;
			if (w.getBlock(x, y, z) == Blocks.water
					&& w.getBlock(x, y + 1, z) == Blocks.water
					&& w.getBlock(x + 1, y, z) == Blocks.water
					&& w.getBlock(x + 1, y + 1, z) == Blocks.water
					&& w.getBlock(x, y, z + 1) == Blocks.water
					&& w.getBlock(x, y + 1, z + 1) == Blocks.water
					&& w.getBlock(x + 1, y, z + 1) == Blocks.water
					&& w.getBlock(x + 1, y + 1, z + 1) == Blocks.water) {
				w.setBlock(x, y, z, ROCBlocks.water_portal);
				w.setBlock(x, y+1, z, ROCBlocks.water_portal);
				w.setBlock(x+1, y, z, ROCBlocks.water_portal);
				w.setBlock(x+1, y+1, z, ROCBlocks.water_portal);
				w.setBlock(x, y, z+1, ROCBlocks.water_portal);
				w.setBlock(x, y+1, z+1, ROCBlocks.water_portal);
				w.setBlock(x+1, y, z+1, ROCBlocks.water_portal);
				w.setBlock(x+1, y+1, z+1, ROCBlocks.water_portal);
			}
		}
	}

}
