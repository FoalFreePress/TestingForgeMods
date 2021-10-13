package com.example.examplemod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {
    private static final Properties BUTTON_PROPERTIES = new Properties().tab(CreativeModeTab.TAB_REDSTONE);
    private static final Properties SIGN_PROPERTIES = new Properties().tab(CreativeModeTab.TAB_DECORATIONS);

    static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<BlockItem> PINK_BUTTON = ITEMS.register("pink_button", () -> new BlockItem(Blocks.PINK_BUTTON.get(), BUTTON_PROPERTIES));
    public static final RegistryObject<BlockItem> GREEN_BUTTON = ITEMS.register("green_button", () -> new BlockItem(Blocks.GREEN_BUTTON.get(), BUTTON_PROPERTIES));
    public static final RegistryObject<BlockItem> RED_BUTTON = ITEMS.register("red_button", () -> new BlockItem(Blocks.RED_BUTTON.get(), BUTTON_PROPERTIES));
    public static final RegistryObject<BlockItem> YELLOW_BUTTON = ITEMS.register("yellow_button", () -> new BlockItem(Blocks.YELLOW_BUTTON.get(), BUTTON_PROPERTIES));

    
    public static final RegistryObject<SignItem> CUSTOM_SIGN = ITEMS.register("custom_sign", () -> new SignItem(SIGN_PROPERTIES, Blocks.CUSTOM_STANDING_SIGN.get(), Blocks.CUSTOM_WALL_SIGN.get()));
    public static final RegistryObject<BlockItem> CUSTOM_PRESSURE_PLATE = ITEMS.register("custom_pressure_plate", () -> new BlockItem(Blocks.CUSTOM_PRESSURE_PLATE.get(), BUTTON_PROPERTIES));
}
