package com.witherschat.extendedcrafting.client.screen;

import com.blakebr0.cucumber.client.screen.BaseContainerScreen;
import com.witherschat.extendedcrafting.ExtendedCrafting;
import com.witherschat.extendedcrafting.container.EpicTableContainer;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class EpicTableScreen extends BaseContainerScreen<EpicTableContainer> {
	public static final ResourceLocation BACKGROUND = new ResourceLocation(ExtendedCrafting.MOD_ID, "textures/gui/epic_table.png");

	public EpicTableScreen(EpicTableContainer container, Inventory inventory, Component title) {
		super(container, inventory, title, BACKGROUND, 270, 314, 512, 512);
	}
	
	@Override
	protected void renderLabels(GuiGraphics gfx, int mouseX, int mouseY) {
		var title = this.getTitle().getString();

		gfx.drawString(this.font, title, 8, 6, 4210752, false);
		gfx.drawString(this.font, this.playerInventoryTitle, 56, this.imageHeight - 94, 4210752, false);
	}

	@Override
	protected void renderBg(GuiGraphics gfx, float partialTicks, int mouseX, int mouseY) {
		this.renderDefaultBg(gfx, partialTicks, mouseX, mouseY);
	}
}