package net.meteor.client.gui;

import java.util.ArrayList;
import java.util.List;

import net.meteor.common.EnumMeteor;
import net.meteor.common.MeteorItems;
import net.meteor.common.MeteorsMod;
import net.meteor.common.block.container.ContainerMeteorShield;
import net.meteor.common.tileentity.TileEntityMeteorShield;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class GuiMeteorShield extends GuiContainer {
	
	private static final ResourceLocation shieldGuiTexture = new ResourceLocation(MeteorsMod.MOD_ID + ":textures/gui/container/meteor_shield.png");
	
	private TileEntityMeteorShield shield;

	public GuiMeteorShield(InventoryPlayer inventoryPlayer, TileEntityMeteorShield mShield) {
		super(new ContainerMeteorShield(inventoryPlayer, mShield));
		this.shield = mShield;
	}
	
	@Override
	public void initGui() {
		super.initGui();
		// id, xpos, ypos, width, height, string
		String status = shield.getPreventComets() ? TextFormatting.GREEN + I18n.translateToLocal("options.on") : TextFormatting.RED + I18n.translateToLocal("options.off");
		this.buttonList.add(new GuiButton(0, guiLeft + 2, guiTop - 22, xSize - 4, 20, I18n.translateToLocalFormatted("gui.toggleCometButton", status)));
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(shieldGuiTexture);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, this.xSize, this.ySize);
        if (shield.getPowerLevel() > 0) {
        	this.drawTexturedModalRect(guiLeft + 47, guiTop + 60, 0, 166, 16, 16);
        }

        GlStateManager.enableRescaleNormal();
        GlStateManager.enableColorMaterial();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.6F);
		//itemRender.renderWithColor = false;//TODO 1.12.2
        GlStateManager.enableLighting();
        GlStateManager.enableCull();
        
        if (shield.getPowerLevel() == 0) {
			itemRender.renderItemAndEffectIntoGUI(new ItemStack(MeteorItems.itemMeteorChips), guiLeft + 47, guiTop + 60);
        }
        
        for (int i = 0; i < 4; ++i) {
			itemRender.renderItemAndEffectIntoGUI(new ItemStack(MeteorItems.itemRedMeteorGem), guiLeft + 67 + i * 29, guiTop + 60);
        }
        
        GlStateManager.disableLighting();
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_) {
		List<String> displayInfo = shield.getDisplayInfo();
		float f = 0.65F;
		GL11.glScalef(f, f, 1.0F);
		for (int i = 0; i < 3; i++) {
			this.fontRenderer.drawString(displayInfo.get(i), 74, 4 + (i * fontRenderer.FONT_HEIGHT + 8), -1);
		}
		if (displayInfo.size() > 3) {
			this.fontRenderer.drawString(displayInfo.get(3), 74, 50, -1);
		}
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		if (displayInfo.size() > 4) {
			
			this.fontRenderer.drawString(displayInfo.get(4), 80, 67, -1);
			
			// Comet prevention may be enabled so should double-check list size
			if (displayInfo.size() > 5) {
				this.fontRenderer.drawString(displayInfo.get(5), 150, 67, -1);
		        float f2 = 1F / f;
		        GL11.glScalef(f2, f2, 1.0F);

				itemRender.renderItemAndEffectIntoGUI(shield.getCometType().getRepresentingItem(), 148, 37);
		        
		        if (isPointInRegion(148, 37, 16, 16, p_146979_1_, p_146979_2_)) {
		        	int k1 = this.guiLeft;
		            int l1 = this.guiTop;
		            p_146979_1_ -= k1;
		            p_146979_2_ -= l1;
		            EnumMeteor type = shield.getCometType();
		            ArrayList info = new ArrayList();
		            info.add(I18n.translateToLocal("info.meteorShield.cometType"));
		            info.add(type.getChatColor() + EnumMeteor.getLocalName(type));
		        	this.drawHoveringText(info, p_146979_1_, p_146979_2_);
		        }
			}
	        
		} else {
			float f2 = 1F / f;
	        GL11.glScalef(f2, f2, 1.0F);
		}
	}
	
	@Override
	protected void actionPerformed(GuiButton button) {
		shield.pressButton(button.id);
		
		if (button.id == 0) {
			String status = !shield.getPreventComets() ? TextFormatting.GREEN + I18n.translateToLocal("options.on") : TextFormatting.RED + I18n.translateToLocal("options.off");
			button.displayString = I18n.translateToLocalFormatted("gui.toggleCometButton", status);
		}
	}

}
