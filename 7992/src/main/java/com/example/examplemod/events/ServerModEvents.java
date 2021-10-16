package com.example.examplemod.events;

import static com.example.examplemod.ModdedItems.FAST_GAS_DROWN_BUCKET;
import static com.example.examplemod.ModdedItems.FAST_GAS_NO_DROWN_BUCKET;
import static com.example.examplemod.ModdedItems.FAST_LAVA_BUCKET;
import static com.example.examplemod.ModdedItems.FAST_WATER_BUCKET;
import static com.example.examplemod.ModdedItems.SLOW_GAS_DROWN_BUCKET;
import static com.example.examplemod.ModdedItems.SLOW_GAS_NO_DROWN_BUCKET;
import static com.example.examplemod.ModdedItems.SLOW_LAVA_BUCKET;
import static com.example.examplemod.ModdedItems.SLOW_WATER_BUCKET;

import java.util.stream.Stream;

import com.example.examplemod.ExampleMod;

import net.minecraft.world.level.block.DispenserBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fluids.DispenseFluidContainer;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

@EventBusSubscriber(modid = ExampleMod.MODID, value = Dist.DEDICATED_SERVER, bus = Bus.MOD)
public class ServerModEvents {

    @SubscribeEvent
    public void loadComplete(FMLLoadCompleteEvent event) {

        event.enqueueWork(() -> {
            Stream.of(SLOW_WATER_BUCKET, FAST_WATER_BUCKET, SLOW_LAVA_BUCKET, FAST_LAVA_BUCKET, SLOW_GAS_NO_DROWN_BUCKET, FAST_GAS_NO_DROWN_BUCKET, SLOW_GAS_DROWN_BUCKET, FAST_GAS_DROWN_BUCKET).forEach(f -> DispenserBlock.registerBehavior(f.get(), DispenseFluidContainer.getInstance()));
        });
    }
}
