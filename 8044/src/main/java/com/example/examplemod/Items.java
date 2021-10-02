package com.example.examplemod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {
    private static final Properties ITEM_PROPERTIES = new Properties().tab(CreativeModeTab.TAB_MISC);
    static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    static final RegistryObject<ForgeSpawnEggItem> PIG_EGG = ITEMS.register("test_pig_spawn_egg", () -> new ForgeSpawnEggItem(Entities.PIG, 0x0000FF, 0xFF0000, ITEM_PROPERTIES));
    static final RegistryObject<ForgeSpawnEggItem> CREEPER_EGG = ITEMS.register("test_creeper_spawn_egg", () -> new ForgeSpawnEggItem(Entities.CREEPER, 0x0F0000, 0x000FF0, ITEM_PROPERTIES));
    static final RegistryObject<ForgeSpawnEggItem> COW_EGG = ITEMS.register("test_cow_spawn_egg", () -> new ForgeSpawnEggItem(Entities.COW, 0x000066, 0x660000, ITEM_PROPERTIES));
    static final RegistryObject<ForgeSpawnEggItem> POLAR_BEAR_EGG = ITEMS.register("test_polar_bear_spawn_egg", () -> new ForgeSpawnEggItem(Entities.POLAR_BEAR, 0x0660FF, 0xFF0660, ITEM_PROPERTIES));

}