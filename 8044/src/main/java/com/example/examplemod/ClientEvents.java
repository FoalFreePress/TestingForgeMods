package com.example.examplemod;

import net.minecraft.client.renderer.entity.CowRenderer;
import net.minecraft.client.renderer.entity.CreeperRenderer;
import net.minecraft.client.renderer.entity.PigRenderer;
import net.minecraft.client.renderer.entity.PolarBearRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterRenderers;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = ExampleMod.MODID, value = Dist.CLIENT, bus = Bus.MOD)
public class ClientEvents {

    @SubscribeEvent
    public static void onRegisterRenderers(final RegisterRenderers event) {
        event.registerEntityRenderer(Entities.PIG.get(), PigRenderer::new);
        event.registerEntityRenderer(Entities.CREEPER.get(), CreeperRenderer::new);
        event.registerEntityRenderer(Entities.COW.get(), CowRenderer::new);
        event.registerEntityRenderer(Entities.POLAR_BEAR.get(), PolarBearRenderer::new);
    }
}
