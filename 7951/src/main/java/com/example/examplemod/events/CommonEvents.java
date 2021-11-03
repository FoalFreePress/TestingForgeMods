package com.example.examplemod.events;

import com.example.examplemod.ExampleMod;

import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class CommonEvents {

    private static ConfiguredFeature<?, ?> COAL_ORE_FEATURE;

    @EventBusSubscriber(modid = ExampleMod.MODID, bus = Bus.FORGE)
    public class ForgeEvents {

        @SubscribeEvent
        public static void onBiomeLoading(BiomeLoadingEvent event) {
            event.getGeneration().getFeatures(Decoration.UNDERGROUND_ORES).add(() -> COAL_ORE_FEATURE);

        }
    }

    @EventBusSubscriber(modid = ExampleMod.MODID, bus = Bus.MOD)
    public class ModEvents {

        @SubscribeEvent
        public static void onFMLCommonEvent(FMLCommonSetupEvent event) {
            event.enqueueWork(() -> {
                COAL_ORE_FEATURE = Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, Blocks.COAL_ORE.defaultBlockState(), 17)).count(128).squared().count(20);
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ExampleMod.of("coal_ore"), COAL_ORE_FEATURE);
            });
        }
    }
}
