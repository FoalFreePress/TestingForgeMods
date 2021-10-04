package com.example.examplemod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks {

    
    private static final Properties BUTTON_PROPERTIES = Properties.of(Material.DECORATION).noCollission().strength(0.5F);
    
    static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);
    
    public static final RegistryObject<ModButtonBlock> PINK_BUTTON = BLOCKS.register("pink_button", () -> new ModButtonBlock(BUTTON_PROPERTIES));
    public static final RegistryObject<ModButtonBlock> GREEN_BUTTON = BLOCKS.register("green_button", () -> new ModButtonBlock(BUTTON_PROPERTIES));
    public static final RegistryObject<ModButtonBlock> RED_BUTTON = BLOCKS.register("red_button", () -> new ModButtonBlock(BUTTON_PROPERTIES));
    public static final RegistryObject<ModButtonBlock> YELLOW_BUTTON = BLOCKS.register("yellow_button", () -> new ModButtonBlock(BUTTON_PROPERTIES));

}
