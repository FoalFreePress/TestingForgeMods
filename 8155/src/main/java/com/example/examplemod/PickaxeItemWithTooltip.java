package com.example.examplemod;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import java.util.List;
import java.util.Optional;

import com.example.examplemod.tooltip.CustomTooltip;

public class PickaxeItemWithTooltip extends PickaxeItem {

    private int color;

    public PickaxeItemWithTooltip(Tier tier, Properties props, int color) {
        super(tier, 1, 1.0F, props);
        this.color = color;

    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> components, TooltipFlag flag) {
        super.appendHoverText(stack, level, components, flag);
        components.add(new TextComponent("This is a very very very very very very long hover text that should really really be split across multiple lines.").withStyle(ChatFormatting.YELLOW));
    }

    @Override
    public Optional<TooltipComponent> getTooltipImage(ItemStack stack) {
        return Optional.of(new CustomTooltip(color));
    }
}
