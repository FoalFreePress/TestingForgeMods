package com.example.examplemod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    private static final Properties PICKAXE_PROPERTIES = new Properties().tab(CreativeModeTab.TAB_TOOLS).durability(250);

    static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<PickaxeItemWithTooltip> RED_PICKAXE = ITEMS.register("red_pickaxe", () -> new PickaxeItemWithTooltip(Tiers.IRON, PICKAXE_PROPERTIES, 0xff0000));
    public static final RegistryObject<PickaxeItemWithTooltip> RED_SUPERPICKAXE = ITEMS.register("red_superpickaxe", () -> new PickaxeItemWithTooltip(Tiers.NETHERITE, PICKAXE_PROPERTIES, 0xac0000));
}
