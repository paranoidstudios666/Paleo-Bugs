package net.mcreator.paleobugs.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.paleobugs.world.inventory.DnaSintetizerGuiMenu;
import net.mcreator.paleobugs.procedures.ReturflechaProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DnaSintetizerGuiScreen extends AbstractContainerScreen<DnaSintetizerGuiMenu> {
	private final static HashMap<String, Object> guistate = DnaSintetizerGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public DnaSintetizerGuiScreen(DnaSintetizerGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 197;
	}

	private static final ResourceLocation texture = new ResourceLocation("paleobugs:textures/screens/dna_sintetizer_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("paleobugs:textures/screens/caldero.png"), this.leftPos + 0, this.topPos + -2, 0, 0, 256, 256, 256, 256);

		guiGraphics.blit(new ResourceLocation("paleobugs:textures/screens/flecha.png"), this.leftPos + 83, this.topPos + 45, 0, Mth.clamp((int) ReturflechaProcedure.execute(world, x, y, z) * 16, 0, 48), 16, 16, 16, 64);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
	}
}
