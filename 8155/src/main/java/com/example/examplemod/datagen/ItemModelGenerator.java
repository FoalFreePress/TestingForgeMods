package com.example.examplemod.datagen;

import com.example.examplemod.ExampleMod;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelGenerator extends ItemModelProvider {

    private static final UncheckedModelFile ITEM_GENERATED = new UncheckedModelFile("item/generated");

    public ItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ExampleMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        getBuilder("red_pickaxe").parent(ITEM_GENERATED).texture("layer0", modLoc(ITEM_FOLDER + "/red_pickaxe"));
        getBuilder("red_superpickaxe").parent(ITEM_GENERATED).texture("layer0", modLoc(ITEM_FOLDER + "/red_superpickaxe"));

    }

}
