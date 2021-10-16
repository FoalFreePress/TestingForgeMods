package com.example.examplemod;

import com.example.examplemod.fluids.FluidProperties;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.ForgeFlowingFluid.Flowing;
import net.minecraftforge.fluids.ForgeFlowingFluid.Source;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModdedFluids {
    static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, ExampleMod.MODID);

    public static final RegistryObject<? extends FlowingFluid> SLOW_WATER = FLUIDS.register("slow_water", () -> new Source(FluidProperties.SLOW_WATER));
    public static final RegistryObject<? extends FlowingFluid> SLOW_WATER_FLOWING = FLUIDS.register("slow_water_flowing", () -> new Flowing(FluidProperties.SLOW_WATER));

    public static final RegistryObject<? extends FlowingFluid> FAST_WATER = FLUIDS.register("fast_water", () -> new Source(FluidProperties.FAST_WATER));
    public static final RegistryObject<? extends FlowingFluid> FAST_WATER_FLOWING = FLUIDS.register("fast_water_flowing", () -> new Flowing(FluidProperties.FAST_WATER));

    public static final RegistryObject<? extends FlowingFluid> SLOW_LAVA = FLUIDS.register("slow_lava", () -> new Source(FluidProperties.SLOW_LAVA));
    public static final RegistryObject<? extends FlowingFluid> SLOW_LAVA_FLOWING = FLUIDS.register("slow_lava_flowing", () -> new Flowing(FluidProperties.SLOW_LAVA));

    public static final RegistryObject<? extends FlowingFluid> FAST_LAVA = FLUIDS.register("fast_lava", () -> new Source(FluidProperties.FAST_LAVA));
    public static final RegistryObject<? extends FlowingFluid> FAST_LAVA_FLOWING = FLUIDS.register("fast_lava_flowing", () -> new Flowing(FluidProperties.FAST_LAVA));

    public static final RegistryObject<? extends FlowingFluid> SLOW_GAS_NO_DROWN = FLUIDS.register("slow_gas_no_drown", () -> new Source(FluidProperties.SLOW_GAS_NO_DROWN));
    public static final RegistryObject<? extends FlowingFluid> SLOW_GAS_NO_DROWN_FLOWING = FLUIDS.register("slow_gas_no_drown_flowing", () -> new Flowing(FluidProperties.SLOW_GAS_NO_DROWN));

    public static final RegistryObject<? extends FlowingFluid> FAST_GAS_NO_DROWN = FLUIDS.register("fast_gas_no_drown", () -> new Source(FluidProperties.FAST_GAS_NO_DROWN));
    public static final RegistryObject<? extends FlowingFluid> FAST_GAS_NO_DROWN_FLOWING = FLUIDS.register("fast_gas_no_flowing", () -> new Flowing(FluidProperties.FAST_GAS_NO_DROWN));

    public static final RegistryObject<? extends FlowingFluid> SLOW_GAS_DROWN = FLUIDS.register("slow_gas_drown", () -> new Source(FluidProperties.SLOW_GAS_DROWN));
    public static final RegistryObject<? extends FlowingFluid> SLOW_GAS_DROWN_FLOWING = FLUIDS.register("slow_gas_drown_flowing", () -> new Flowing(FluidProperties.SLOW_GAS_DROWN));

    public static final RegistryObject<? extends FlowingFluid> FAST_GAS_DROWN = FLUIDS.register("fast_gas_drown", () -> new Source(FluidProperties.FAST_GAS_DROWN));
    public static final RegistryObject<? extends FlowingFluid> FAST_GAS_DROWN_FLOWING = FLUIDS.register("fast_gas_drown_flowing", () -> new Flowing(FluidProperties.FAST_GAS_DROWN));

}
