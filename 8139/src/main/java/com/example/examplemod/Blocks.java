package com.example.examplemod;

import com.example.examplemod.blocks.CustomButtonBlock;
import com.example.examplemod.blocks.CustomPressurePlateBlock;
import com.example.examplemod.blocks.sign.CustomStandingSignBlock;
import com.example.examplemod.blocks.sign.CustomWallSignBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PressurePlateBlock.Sensitivity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks {

    private static final Properties BUTTON_PROPERTIES = Properties.of(Material.DECORATION).noCollission().strength(0.5F);
    private static final Properties SIGN_PROPERTIES = Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD);
    private static final Properties PRESSURE_PLATE_PROPERTIES = Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE).noCollission().strength(0.5F).sound(SoundType.WOOD);

    static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);

    public static final RegistryObject<CustomButtonBlock> PINK_BUTTON = BLOCKS.register("pink_button", () -> new CustomButtonBlock(BUTTON_PROPERTIES));
    public static final RegistryObject<CustomButtonBlock> GREEN_BUTTON = BLOCKS.register("green_button", () -> new CustomButtonBlock(BUTTON_PROPERTIES));
    public static final RegistryObject<CustomButtonBlock> RED_BUTTON = BLOCKS.register("red_button", () -> new CustomButtonBlock(BUTTON_PROPERTIES));
    public static final RegistryObject<CustomButtonBlock> YELLOW_BUTTON = BLOCKS.register("yellow_button", () -> new CustomButtonBlock(BUTTON_PROPERTIES));

    public static final RegistryObject<CustomStandingSignBlock> CUSTOM_STANDING_SIGN = BLOCKS.register("custom_sign", () -> new CustomStandingSignBlock(SIGN_PROPERTIES, ExampleMod.CUSTOM_WOOD_TYPE));
    public static final RegistryObject<CustomWallSignBlock> CUSTOM_WALL_SIGN = BLOCKS.register("custom_wall_sign", () -> new CustomWallSignBlock(SIGN_PROPERTIES, ExampleMod.CUSTOM_WOOD_TYPE));

    public static final RegistryObject<CustomPressurePlateBlock> CUSTOM_PRESSURE_PLATE = BLOCKS.register("custom_pressure_plate", () -> new CustomPressurePlateBlock(Sensitivity.EVERYTHING, PRESSURE_PLATE_PROPERTIES));
}
