package com.example.examplemod.tooltip;

import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.TextureManager;

public record CustomClientToolTip(CustomTooltip tooltip) implements ClientTooltipComponent {

    @Override
    public int getHeight() {
        return 10;
    }

    @Override
    public int getWidth(Font font) {
        return 10;
    }

    @Override
    public void renderImage(Font font, int x, int y, PoseStack poseStack, ItemRenderer itemRenderer_, int zIndex, TextureManager textureManager) {
        GuiComponent.fill(poseStack, x, y, x + 10, y + 10, tooltip.color());
    }
}
