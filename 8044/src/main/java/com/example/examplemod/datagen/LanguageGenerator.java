package com.example.examplemod.datagen;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.Items;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LanguageGenerator extends LanguageProvider {

    public LanguageGenerator(DataGenerator gen) {
        super(gen, ExampleMod.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(Items.COW_EGG.get(), "Modded Cow Spawn Egg");
        add(Items.CREEPER_EGG.get(), "Modded Creper Spawn Egg");
        add(Items.PIG_EGG.get(), "Modded Pig Spawn Egg");
        add(Items.POLAR_BEAR_EGG.get(), "Modded Polar Bear Spawn Egg");
    }



}
