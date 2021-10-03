package com.example.examplemod.datagen;

import com.example.examplemod.ExampleMod;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelGenerator extends ItemModelProvider {

    private static final UncheckedModelFile ITEM_TEMPLATE_SPAWN_EGG = new UncheckedModelFile("item/template_spawn_egg");

    public ItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ExampleMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        getBuilder("test_cow_spawn_egg").parent(ITEM_TEMPLATE_SPAWN_EGG);
        getBuilder("test_creeper_spawn_egg").parent(ITEM_TEMPLATE_SPAWN_EGG);
        getBuilder("test_pig_spawn_egg").parent(ITEM_TEMPLATE_SPAWN_EGG);
        getBuilder("test_polar_bear_spawn_egg").parent(ITEM_TEMPLATE_SPAWN_EGG);
    }

}
