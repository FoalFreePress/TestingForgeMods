package com.example.examplemod.fluids;

import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.FluidAttributes.Builder;

// Because FluidAttributes already exists
public class FluidAttributi {
    // @formatter:off
    public static final Builder SLOW_WATER = FluidAttributes
        .builder(FluidResourceLocations.SLOW_WATER, FluidResourceLocations.SLOW_WATER_FLOWING)
        .overlay(FluidResourceLocations.SLOW_WATER_OVERLAY)
        .color(0xAF1080FF)
        .canBoat(Predicates.CanBoat.ALL)
        .canDrown(Predicates.CanDrown.ALL)
        .canExtinguish(Predicates.CanExtinguish.ALL)
        .canHydrate(Predicates.CanHydrate.ALL)
        .canSwim(Predicates.CanSwim.ALL)
        .density(1000)
        .temperature(30)
        .fallDistanceModifier(Predicates.FallDistanceModifier.DEFAULT)
        .motionScale(Predicates.MotionScale.DEFAULT);

    public static final Builder FAST_WATER = FluidAttributes
        .builder(FluidResourceLocations.FAST_WATER, FluidResourceLocations.FAST_WATER_FLOWING)
        .overlay(FluidResourceLocations.FAST_WATER_OVERLAY)
        .color(0xAF1080FF)
        .canBoat(Predicates.CanBoat.ALL)
        .canDrown(Predicates.CanDrown.ALL)
        .canExtinguish(Predicates.CanExtinguish.ALL)
        .canHydrate(Predicates.CanHydrate.ALL)
        .canSwim(Predicates.CanSwim.ALL)
        .density(100)
        .temperature(30)
        .fallDistanceModifier(Predicates.FallDistanceModifier.DEFAULT)
        .motionScale(Predicates.MotionScale.DOUBLE);

    public static final Builder SLOW_LAVA = FluidAttributes
        .builder(FluidResourceLocations.SLOW_LAVA, FluidResourceLocations.SLOW_LAVA_FLOWING)
        .overlay(FluidResourceLocations.SLOW_LAVA_OVERLAY)
        .color(0xAF1080FF)
        .canBoat(Predicates.CanBoat.ALL)
        .canDrown(Predicates.CanDrown.ALL)
        .canExtinguish(Predicates.CanExtinguish.ALL)
        .canHydrate(Predicates.CanHydrate.ALL)
        .canSwim(Predicates.CanSwim.ALL)
        .density(1000)
        .temperature(30)
        .fallDistanceModifier(Predicates.FallDistanceModifier.DEFAULT)
        .motionScale(Predicates.MotionScale.DEFAULT);

    public static final Builder FAST_LAVA = FluidAttributes
        .builder(FluidResourceLocations.FAST_LAVA, FluidResourceLocations.FAST_LAVA_FLOWING)
        .overlay(FluidResourceLocations.FAST_LAVA_OVERLAY)
        .color(0xAF1080FF)
        .canBoat(Predicates.CanBoat.ALL)
        .canDrown(Predicates.CanDrown.ALL)
        .canExtinguish(Predicates.CanExtinguish.ALL)
        .canHydrate(Predicates.CanHydrate.ALL)
        .canSwim(Predicates.CanSwim.ALL)
        .density(100)
        .temperature(30)
        .fallDistanceModifier(Predicates.FallDistanceModifier.DEFAULT)
        .motionScale(Predicates.MotionScale.DOUBLE);

    public static final Builder SLOW_GAS_NO_DROWN = FluidAttributes
        .builder(FluidResourceLocations.SLOW_GAS_NO_DROWN, FluidResourceLocations.SLOW_GAS_NO_DROWN_FLOWING)
        .overlay(FluidResourceLocations.SLOW_GAS_NO_DROWN_OVERLAY)
        .color(0xAF1080FF)
        .canBoat(Predicates.CanBoat.NONE)
        .canDrown(Predicates.CanDrown.NONE)
        .canExtinguish(Predicates.CanExtinguish.NONE)
        .canHydrate(Predicates.CanHydrate.NONE)
        .canSwim(Predicates.CanSwim.NONE)
        .density(100)
        .temperature(350)
        .fallDistanceModifier(Predicates.FallDistanceModifier.DEFAULT)
        .motionScale(Predicates.MotionScale.DEFAULT);

    public static final Builder FAST_GAS_NO_DROWN = FluidAttributes
        .builder(FluidResourceLocations.FAST_GAS_NO_DROWN, FluidResourceLocations.FAST_GAS_NO_DROWN_FLOWING)
        .overlay(FluidResourceLocations.FAST_GAS_NO_DROWN_OVERLAY)
        .color(0xAF1080FF)
        .canBoat(Predicates.CanBoat.NONE)
        .canDrown(Predicates.CanDrown.NONE)
        .canExtinguish(Predicates.CanExtinguish.NONE)
        .canHydrate(Predicates.CanHydrate.NONE)
        .canSwim(Predicates.CanSwim.NONE)
        .density(10)
        .temperature(350)
        .fallDistanceModifier(Predicates.FallDistanceModifier.DEFAULT)
        .motionScale(Predicates.MotionScale.DOUBLE);

    public static final Builder SLOW_GAS_DROWN = FluidAttributes
        .builder(FluidResourceLocations.SLOW_GAS_DROWN, FluidResourceLocations.SLOW_GAS_DROWN_FLOWING)
        .overlay(FluidResourceLocations.SLOW_GAS_DROWN_OVERLAY)
        .color(0xAF1080FF)
        .canBoat(Predicates.CanBoat.NONE)
        .canDrown(Predicates.CanDrown.NONE)
        .canExtinguish(Predicates.CanExtinguish.NONE)
        .canHydrate(Predicates.CanHydrate.NONE)
        .canSwim(Predicates.CanSwim.NONE)
        .density(100)
        .temperature(350)
        .fallDistanceModifier(Predicates.FallDistanceModifier.DEFAULT)
        .motionScale(Predicates.MotionScale.DEFAULT);

    public static final Builder FAST_GAS_DROWN = FluidAttributes
        .builder(FluidResourceLocations.FAST_GAS_DROWN, FluidResourceLocations.FAST_GAS_DROWN_FLOWING)
        .overlay(FluidResourceLocations.FAST_GAS_DROWN_OVERLAY)
        .color(0xAF1080FF)
        .canBoat(Predicates.CanBoat.NONE)
        .canDrown(Predicates.CanDrown.NONE)
        .canExtinguish(Predicates.CanExtinguish.NONE)
        .canHydrate(Predicates.CanHydrate.NONE)
        .canSwim(Predicates.CanSwim.NONE)
        .density(10)
        .temperature(350)
        .fallDistanceModifier(Predicates.FallDistanceModifier.DEFAULT)
        .motionScale(Predicates.MotionScale.DOUBLE);

    // @formatter:on
}
