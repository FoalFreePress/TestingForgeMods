package com.example.examplemod.events;

import static com.example.examplemod.ModdedFluids.FAST_GAS_DROWN;
import static com.example.examplemod.ModdedFluids.FAST_GAS_DROWN_FLOWING;
import static com.example.examplemod.ModdedFluids.FAST_GAS_NO_DROWN;
import static com.example.examplemod.ModdedFluids.FAST_GAS_NO_DROWN_FLOWING;
import static com.example.examplemod.ModdedFluids.FAST_LAVA;
import static com.example.examplemod.ModdedFluids.FAST_LAVA_FLOWING;
import static com.example.examplemod.ModdedFluids.FAST_WATER;
import static com.example.examplemod.ModdedFluids.FAST_WATER_FLOWING;
import static com.example.examplemod.ModdedFluids.SLOW_GAS_DROWN;
import static com.example.examplemod.ModdedFluids.SLOW_GAS_DROWN_FLOWING;
import static com.example.examplemod.ModdedFluids.SLOW_GAS_NO_DROWN;
import static com.example.examplemod.ModdedFluids.SLOW_LAVA;
import static com.example.examplemod.ModdedFluids.SLOW_LAVA_FLOWING;
import static com.example.examplemod.ModdedFluids.SLOW_WATER;
import static com.example.examplemod.ModdedFluids.SLOW_WATER_FLOWING;

import java.util.stream.Stream;

import com.example.examplemod.ExampleMod;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = ExampleMod.MODID, value = Dist.CLIENT, bus = Bus.MOD)
public class ClientModEvents {

    @SubscribeEvent
    public void clientSetup(FMLClientSetupEvent event) {
        Stream.of(SLOW_WATER, SLOW_WATER_FLOWING, FAST_WATER, FAST_WATER_FLOWING, SLOW_LAVA, SLOW_LAVA_FLOWING, FAST_LAVA, FAST_LAVA_FLOWING, SLOW_GAS_NO_DROWN, SLOW_GAS_NO_DROWN, FAST_GAS_NO_DROWN, FAST_GAS_NO_DROWN_FLOWING, SLOW_GAS_DROWN, SLOW_GAS_DROWN_FLOWING, FAST_GAS_DROWN, FAST_GAS_DROWN_FLOWING).forEach(f -> ItemBlockRenderTypes.setRenderLayer(f.get(), RenderType.translucent()));
    }
}
