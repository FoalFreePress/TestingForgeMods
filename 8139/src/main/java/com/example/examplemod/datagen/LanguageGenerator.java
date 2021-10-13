package com.example.examplemod.datagen;

import com.example.examplemod.Blocks;
import com.example.examplemod.ExampleMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LanguageGenerator extends LanguageProvider {

    public LanguageGenerator(DataGenerator gen) {
        super(gen, ExampleMod.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(Blocks.PINK_BUTTON.get(), "Pink Button");
        add(Blocks.GREEN_BUTTON.get(), "Green Button");
        add(Blocks.RED_BUTTON.get(), "Red Button");
        add(Blocks.YELLOW_BUTTON.get(), "Yellow Button");
        add(Blocks.CUSTOM_PRESSURE_PLATE.get(), "Custom Pressure Plate");
        add(Blocks.CUSTOM_STANDING_SIGN.get(), "Custom Sign");
    }

}
