package com.eternaldoom.realmsofchaos.client.itemrenderer;


public class ItemRendererFrozenChest/* implements IItemRenderer*/{
	
	/*private ModelTransparentChest model = new ModelTransparentChest();
	private ResourceLocation texture = new ResourceLocation("realmsofchaos:textures/tileentity/chest/frozen.png");

	public ItemRendererFrozenChest(){
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		GL11.glPushMatrix();
		
		switch(type) {
		case INVENTORY:
			GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
			GL11.glTranslatef(-1F, -1F, 0F);
			break;
		case EQUIPPED:
			GL11.glRotatef(180F, 0.0F, 0.0F, 0.1F);
			GL11.glTranslatef(-1.0F, -1.0F, -0.0F);
			break;
		case ENTITY:
			GL11.glRotatef(180f, 1, 0, 0);
			GL11.glTranslatef(0, -1, 0);
			break;
		}
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		model.renderAll();
		GL11.glPopMatrix();
	}*/

}