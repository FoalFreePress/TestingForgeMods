package com.example.examplemod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.Material.Builder;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModdedBlocks {

    private static final Material WATER_MATERIAL = new Builder(MaterialColor.COLOR_BLUE).liquid().noCollider().nonSolid().replaceable().build();
    private static final Material LAVA_MATERIAL = new Builder(MaterialColor.COLOR_RED).liquid().noCollider().nonSolid().replaceable().build();
    private static final Material GAS_MATERIAL = new Builder(MaterialColor.COLOR_LIGHT_GRAY).liquid().noCollider().nonSolid().replaceable().build();

    private static final Properties SLOW_WATER_PROPERTIES = Properties.of(WATER_MATERIAL).noCollission().strength(1000.0F).noDrops();
    private static final Properties FAST_WATER_PROPERTIES = Properties.of(WATER_MATERIAL).noCollission().strength(100.0F).noDrops();

    private static final Properties SLOW_LAVA_PROPERTIES = Properties.of(LAVA_MATERIAL).noCollission().strength(1000.0F).noDrops();
    private static final Properties FAST_LAVA_PROPERTIES = Properties.of(LAVA_MATERIAL).noCollission().strength(100.0F).noDrops();

    private static final Properties SLOW_GAS_PROPERTIES = Properties.of(GAS_MATERIAL).noCollission().strength(1000.0F).noDrops();
    private static final Properties FAST_GAS_PROPERTIES = Properties.of(GAS_MATERIAL).noCollission().strength(100.0F).noDrops();

    static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);

    public static final RegistryObject<LiquidBlock> SLOW_WATER_BLOCK = BLOCKS.register("slow_water_fluid_block", () -> new LiquidBlock(ModdedFluids.SLOW_WATER, SLOW_WATER_PROPERTIES));
    public static final RegistryObject<LiquidBlock> FAST_WATER_BLOCK = BLOCKS.register("fast_water_fluid_block", () -> new LiquidBlock(ModdedFluids.FAST_WATER, FAST_WATER_PROPERTIES));

    public static final RegistryObject<LiquidBlock> SLOW_LAVA_BLOCK = BLOCKS.register("slow_lava_fluid_block", () -> new LiquidBlock(ModdedFluids.SLOW_LAVA, SLOW_LAVA_PROPERTIES));
    public static final RegistryObject<LiquidBlock> FAST_LAVA_BLOCK = BLOCKS.register("fast_lava_fluid_block", () -> new LiquidBlock(ModdedFluids.FAST_LAVA, FAST_LAVA_PROPERTIES));

    public static final RegistryObject<LiquidBlock> SLOW_GAS_NO_DROWN_BLOCK = BLOCKS.register("slow_gas_no_drown_fluid_block", () -> new LiquidBlock(ModdedFluids.SLOW_GAS_NO_DROWN, SLOW_GAS_PROPERTIES));
    public static final RegistryObject<LiquidBlock> FAST_GAS_NO_DROWN_BLOCK = BLOCKS.register("fast_gas_no_drown_fluid_block", () -> new LiquidBlock(ModdedFluids.FAST_GAS_NO_DROWN, FAST_GAS_PROPERTIES));

    public static final RegistryObject<LiquidBlock> SLOW_GAS_DROWN_BLOCK = BLOCKS.register("slow_gas_drown_fluid_block", () -> new LiquidBlock(ModdedFluids.SLOW_GAS_DROWN, SLOW_GAS_PROPERTIES));
    public static final RegistryObject<LiquidBlock> FAST_GAS_DROWN_BLOCK = BLOCKS.register("fast_gas_drown_fluid_block", () -> new LiquidBlock(ModdedFluids.FAST_GAS_DROWN, FAST_GAS_PROPERTIES));
}
