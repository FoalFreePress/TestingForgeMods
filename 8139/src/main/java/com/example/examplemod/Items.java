package com.example.examplemod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {
    private static final Properties ITEM_PROPERTIES = new Properties().tab(CreativeModeTab.TAB_REDSTONE);
    
    static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);
    
  public static final RegistryObject<Item> PINK_BUTTON = ITEMS.register("pink_button", () -> new BlockItem(Blocks.PINK_BUTTON.get(), ITEM_PROPERTIES));
  public static final RegistryObject<Item> GREEN_BUTTON = ITEMS.register("green_button", () -> new BlockItem(Blocks.GREEN_BUTTON.get(), ITEM_PROPERTIES));
  public static final RegistryObject<Item> RED_BUTTON = ITEMS.register("red_button", () -> new BlockItem(Blocks.RED_BUTTON.get(), ITEM_PROPERTIES));
  public static final RegistryObject<Item> YELLOW_BUTTON = ITEMS.register("yellow_button", () -> new BlockItem(Blocks.YELLOW_BUTTON.get(), ITEM_PROPERTIES));

    
}
