package com.eternaldoom.realmsofchaos.client.itemrenderer;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.IItemRenderer;

public class ItemRendererCannon implements IItemRenderer{

	public static RenderItem renderitem = new RenderItem();
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch (type) {
		case EQUIPPED:
			return false;
		case EQUIPPED_FIRST_PERSON:
			return false;
		case ENTITY:
			return false;
		case INVENTORY:
			return true;
		default:
			return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch(type){
		case EQUIPPED:
			break;
		case EQUIPPED_FIRST_PERSON:
			break;
		case ENTITY:
			break;
		case INVENTORY:
			Draw2D(item);
			break;
		default:
			break;
		}
		
	}
	
	public void Draw2D(ItemStack item){
	    IIcon icon = item.getItem().getIcon(item, 0);
		
		Tessellator tessellator = Tessellator.instance;		
	    tessellator.startDrawingQuads();
	    
	    double minU1 = (double)icon.getMinU();
	    double minV1 = (double)icon.getMinV();
	    double maxU1 = (double)icon.getMaxU();
	    double maxV1 = (double)icon.getMaxV();

	    tessellator.addVertexWithUV(16.0, 16.0, 0.0, minU1, maxV1);
	    tessellator.addVertexWithUV(16.0,  0.0, 0.0, maxU1, maxV1);
	    tessellator.addVertexWithUV( 0.0,  0.0, 0.0, maxU1, minV1);
	    tessellator.addVertexWithUV( 0.0, 16.0, 0.0, minU1, minV1);
	    	    
	    tessellator.draw();
	}

}
