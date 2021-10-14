package com.example.examplemod.events;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.tooltip.CustomClientToolTip;
import com.example.examplemod.tooltip.CustomTooltip;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = ExampleMod.MODID, value = Dist.CLIENT, bus = Bus.MOD)
public class ClientModEvents {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        MinecraftForgeClient.registerTooltipComponentFactory(CustomTooltip.class, CustomClientToolTip::new);
    }
}
