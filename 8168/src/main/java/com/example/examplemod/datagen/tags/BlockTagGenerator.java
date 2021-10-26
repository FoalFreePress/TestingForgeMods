package com.example.examplemod.datagen.tags;

import com.example.examplemod.ExampleMod;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagGenerator extends BlockTagsProvider {

    public BlockTagGenerator(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, ExampleMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
    }
}
