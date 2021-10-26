package com.example.examplemod.datagen;

import com.example.examplemod.ExampleMod;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelGenerator extends ItemModelProvider {

    public ItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ExampleMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        getBuilder("custom_fishing_rod").
        parent(new UncheckedModelFile("item/handheld_rod"))
        .texture("layer0", modLoc(ITEM_FOLDER + "/custom_fishing_rod"))
        .override()
            .predicate(modLoc("cast"), 1)
            .model(new UncheckedModelFile(modLoc(ITEM_FOLDER + "/custom_fishing_rod_cast")))
            .end();

        getBuilder("custom_fishing_rod_cast")
        .parent(new UncheckedModelFile(modLoc(ITEM_FOLDER + "/custom_fishing_rod")))
        .texture("layer0", modLoc(ITEM_FOLDER + "/custom_fishing_rod_cast"));
    }

}
