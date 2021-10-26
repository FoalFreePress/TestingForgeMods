package com.example.examplemod.datagen.tags;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.ModItems;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTagGenerator extends ItemTagsProvider {

    public ItemTagGenerator(DataGenerator gen, BlockTagsProvider blockTagsProvider, ExistingFileHelper existingFileHelper) {
        super(gen, blockTagsProvider, ExampleMod.MODID, existingFileHelper);
    }
    
    @Override
    protected void addTags() {
        tag(Tags.Items.FISHING_ROD).add(ModItems.CUSTOM_FISHING_ROD.get());
    }
}
