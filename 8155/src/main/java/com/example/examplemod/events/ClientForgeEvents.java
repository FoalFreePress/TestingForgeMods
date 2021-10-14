package com.example.examplemod.events;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.tooltip.CustomTooltip;
import com.mojang.datafixers.util.Either;

import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderTooltipEvent.Color;
import net.minecraftforge.client.event.RenderTooltipEvent.GatherComponents;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = ExampleMod.MODID, value = Dist.CLIENT, bus = Bus.FORGE)
public class ClientForgeEvents {

    @SubscribeEvent
    public static void gatherTooltips(GatherComponents event) {
        if (event.getStack().getItem() == Items.STICK) {
            event.getTooltipElements().add(Either.right(new CustomTooltip(0xFF0000FF)));
        }
        if (event.getStack().getItem() == Items.CLOCK) {
            event.setMaxWidth(30);
        }
    }

    @SubscribeEvent
    public static void preTooltip(Color event) {
        if (event.getStack().getItem() == Items.APPLE) {
            event.setBackgroundStart(0xFF0000FF);
            event.setBackgroundEnd(0xFFFFFF00);
            event.setBorderStart(0xFFFF0000);
            event.setBorderEnd(0xFFFF0011);
        }
    }
}
