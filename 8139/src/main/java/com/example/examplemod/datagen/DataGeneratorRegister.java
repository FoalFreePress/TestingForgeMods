package com.example.examplemod.datagen;

import com.example.examplemod.ExampleMod;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(modid = ExampleMod.MODID, bus = Bus.MOD)
public class DataGeneratorRegister {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        if (event.includeServer()) {
            genServer(generator, existingFileHelper);
        }
        if (event.includeClient()) {
            genClient(generator,existingFileHelper);
        }
        if (event.includeDev()) {
            genDev(generator, existingFileHelper);
        }
        if (event.includeReports()) {
            genReports(generator, existingFileHelper);
        }
    }

    private static void genServer(DataGenerator generator, ExistingFileHelper existingFileHelper) {
    }

    private static void genClient(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        generator.addProvider(new LanguageGenerator(generator));
        generator.addProvider(new BlockModelGenerator(generator, existingFileHelper));
    }

    private static void genDev(DataGenerator generator, ExistingFileHelper existingFileHelper) {

    }

    private static void genReports(DataGenerator generator, ExistingFileHelper existingFileHelper) {

    }
}
