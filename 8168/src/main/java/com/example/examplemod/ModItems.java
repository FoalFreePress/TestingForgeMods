package com.example.examplemod;

import com.example.examplemod.items.CustomFishingRod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    private static final Properties FISHING_ROD_PROPERTIES = new Properties().tab(CreativeModeTab.TAB_TOOLS).durability(300);

    static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<CustomFishingRod> CUSTOM_FISHING_ROD = ITEMS.register("custom_fishing_rod", () -> new CustomFishingRod(FISHING_ROD_PROPERTIES));
}
