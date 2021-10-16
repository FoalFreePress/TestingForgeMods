package com.example.examplemod.fluids;

import com.example.examplemod.ModdedBlocks;
import com.example.examplemod.ModdedFluids;
import com.example.examplemod.ModdedItems;

import net.minecraftforge.fluids.ForgeFlowingFluid.Properties;

public class FluidProperties {

    public static final Properties SLOW_WATER = new Properties(ModdedFluids.SLOW_WATER, ModdedFluids.SLOW_WATER_FLOWING, FluidAttributi.SLOW_WATER).bucket(ModdedItems.SLOW_WATER_BUCKET).block(ModdedBlocks.SLOW_WATER_BLOCK).canMultiply(Predicates.CanMultiply.NEVER);
    public static final Properties FAST_WATER = new Properties(ModdedFluids.FAST_WATER, ModdedFluids.FAST_WATER_FLOWING, FluidAttributi.FAST_WATER).bucket(ModdedItems.FAST_WATER_BUCKET).block(ModdedBlocks.FAST_WATER_BLOCK).canMultiply(Predicates.CanMultiply.NEVER);

    public static final Properties SLOW_LAVA = new Properties(ModdedFluids.SLOW_LAVA, ModdedFluids.SLOW_LAVA_FLOWING, FluidAttributi.SLOW_LAVA).bucket(ModdedItems.SLOW_LAVA_BUCKET).block(ModdedBlocks.SLOW_LAVA_BLOCK).canMultiply(Predicates.CanMultiply.NEVER);
    public static final Properties FAST_LAVA = new Properties(ModdedFluids.FAST_LAVA, ModdedFluids.FAST_LAVA_FLOWING, FluidAttributi.FAST_LAVA).bucket(ModdedItems.FAST_LAVA_BUCKET).block(ModdedBlocks.FAST_LAVA_BLOCK).canMultiply(Predicates.CanMultiply.NEVER);

    public static final Properties SLOW_GAS_NO_DROWN = new Properties(ModdedFluids.SLOW_GAS_NO_DROWN, ModdedFluids.SLOW_GAS_NO_DROWN_FLOWING, FluidAttributi.SLOW_GAS_NO_DROWN).bucket(ModdedItems.SLOW_GAS_NO_DROWN_BUCKET).block(ModdedBlocks.SLOW_GAS_NO_DROWN_BLOCK).canMultiply(Predicates.CanMultiply.NEVER);
    public static final Properties FAST_GAS_NO_DROWN = new Properties(ModdedFluids.FAST_GAS_NO_DROWN, ModdedFluids.FAST_GAS_NO_DROWN_FLOWING, FluidAttributi.FAST_GAS_NO_DROWN).bucket(ModdedItems.FAST_GAS_NO_DROWN_BUCKET).block(ModdedBlocks.FAST_GAS_NO_DROWN_BLOCK).canMultiply(Predicates.CanMultiply.NEVER);

    public static final Properties SLOW_GAS_DROWN = new Properties(ModdedFluids.SLOW_GAS_DROWN, ModdedFluids.SLOW_GAS_DROWN_FLOWING, FluidAttributi.SLOW_GAS_DROWN).bucket(ModdedItems.SLOW_GAS_DROWN_BUCKET).block(ModdedBlocks.SLOW_GAS_DROWN_BLOCK).canMultiply(Predicates.CanMultiply.NEVER);
    public static final Properties FAST_GAS_DROWN = new Properties(ModdedFluids.SLOW_GAS_DROWN, ModdedFluids.SLOW_GAS_DROWN_FLOWING, FluidAttributi.SLOW_GAS_DROWN).bucket(ModdedItems.SLOW_GAS_DROWN_BUCKET).block(ModdedBlocks.FAST_GAS_DROWN_BLOCK).canMultiply(Predicates.CanMultiply.NEVER);

}
