package com.example.examplemod.datagen;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.ModItems;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LanguageGenerator extends LanguageProvider {

    public LanguageGenerator(DataGenerator gen) {
        super(gen, ExampleMod.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.RED_PICKAXE.get(), "Red Pickaxe");
        add(ModItems.RED_SUPERPICKAXE.get(), "Red Superpickaxe");
    }

}
