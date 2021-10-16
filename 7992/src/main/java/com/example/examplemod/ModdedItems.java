package com.example.examplemod;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.Items;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModdedItems {
    private static final Properties BUCKET_PROPERTIES = new Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(CreativeModeTab.TAB_MISC);

    static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<BucketItem> SLOW_WATER_BUCKET = ITEMS.register("slow_water_bucket", () -> new BucketItem(ModdedFluids.SLOW_WATER, BUCKET_PROPERTIES));
    public static final RegistryObject<BucketItem> FAST_WATER_BUCKET = ITEMS.register("fast_water_bucket", () -> new BucketItem(ModdedFluids.FAST_WATER, BUCKET_PROPERTIES));

    public static final RegistryObject<BucketItem> SLOW_LAVA_BUCKET = ITEMS.register("slow_lava_bucket", () -> new BucketItem(ModdedFluids.SLOW_LAVA, BUCKET_PROPERTIES));
    public static final RegistryObject<BucketItem> FAST_LAVA_BUCKET = ITEMS.register("fast_lava_bucket", () -> new BucketItem(ModdedFluids.FAST_LAVA, BUCKET_PROPERTIES));

    public static final RegistryObject<BucketItem> SLOW_GAS_NO_DROWN_BUCKET = ITEMS.register("slow_gas_no_drown_bucket", () -> new BucketItem(ModdedFluids.SLOW_GAS_NO_DROWN, BUCKET_PROPERTIES));
    public static final RegistryObject<BucketItem> FAST_GAS_NO_DROWN_BUCKET = ITEMS.register("fast_gas_no_drown_bucket", () -> new BucketItem(ModdedFluids.FAST_GAS_NO_DROWN, BUCKET_PROPERTIES));

    public static final RegistryObject<BucketItem> SLOW_GAS_DROWN_BUCKET = ITEMS.register("slow_gas_drown_bucket", () -> new BucketItem(ModdedFluids.SLOW_GAS_DROWN, BUCKET_PROPERTIES));
    public static final RegistryObject<BucketItem> FAST_GAS_DROWN_BUCKET = ITEMS.register("fast_gas_drown_bucket", () -> new BucketItem(ModdedFluids.FAST_GAS_DROWN, BUCKET_PROPERTIES));
}
