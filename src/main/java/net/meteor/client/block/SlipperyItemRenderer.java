package net.meteor.client.block;

import net.meteor.common.item.ItemBlockSlippery;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.ItemStack;

import org.lwjgl.opengl.GL11;

public class SlipperyItemRenderer { // implements IItemRenderer {
	//TODO 1.12.2

	/*
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch (type) {
		case EQUIPPED:
		case EQUIPPED_FIRST_PERSON:
		case INVENTORY:
		case ENTITY:
			return true;
		default:
			return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		GlStateManager.pushMatrix();
		Minecraft.getMinecraft().renderEngine.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
		RenderBlocks renderBlocks = (RenderBlocks) data[0];
		Block facadeBlock = ItemBlockSlippery.getStoredBlock(item);
		if (type == ItemRenderType.EQUIPPED || type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
			GlStateManager.translate(0.5, 0.5, 0.5);
		}
        renderBlocks.renderBlockAsItem(facadeBlock, item.getItemDamage(), 1.0F);
		GlStateManager.popMatrix();
	}*/

}
