package com.example.examplemod.events;

import com.example.examplemod.BlockEntities;
import com.example.examplemod.ExampleMod;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = ExampleMod.MODID, value = Dist.CLIENT, bus = Bus.MOD)
public class ClientEvents {


    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        BlockEntityRenderers.register(BlockEntities.CUSTOM_SIGN.get(), SignRenderer::new);
        event.enqueueWork(() -> {
            Sheets.addWoodType(ExampleMod.CUSTOM_WOOD_TYPE);
        });
    }
}
