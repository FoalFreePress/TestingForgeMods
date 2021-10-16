package com.example.examplemod.datagen;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.ModdedItems;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LanguageGenerator extends LanguageProvider {

    public LanguageGenerator(DataGenerator gen) {
        super(gen, ExampleMod.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ModdedItems.SLOW_WATER_BUCKET.get(), "Slow Water Bucket");
        add(ModdedItems.FAST_WATER_BUCKET.get(), "Fast Water Bucket");
        add(ModdedItems.SLOW_LAVA_BUCKET.get(), "Slow Lava Bucket");
        add(ModdedItems.FAST_LAVA_BUCKET.get(), "Fast Lava Bucket");
        add(ModdedItems.SLOW_GAS_NO_DROWN_BUCKET.get(), "Slow Gas No Drowning Bucket");
        add(ModdedItems.FAST_GAS_NO_DROWN_BUCKET.get(), "Fast Gas No Drowning Bucket");
        add(ModdedItems.SLOW_GAS_DROWN_BUCKET.get(), "Slow Gas Drowning Bucket");
        add(ModdedItems.FAST_GAS_DROWN_BUCKET.get(), "Fast Gas Drowning Bucket");
    }

}
