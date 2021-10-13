package com.example.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = ExampleMod.MODID, bus = Bus.FORGE)
public class EventListener {
    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void onListen(EntityJoinWorldEvent event) {
        if (!event.getWorld().isClientSide)
            LOGGER.info(event.getEntity().toString() + " has joined the world.");
        event.getEntity().onAddedToWorld();
    }
}
