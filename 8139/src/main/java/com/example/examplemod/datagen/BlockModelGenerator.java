package com.example.examplemod.datagen;

import com.example.examplemod.Blocks;
import com.example.examplemod.ExampleMod;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockModelGenerator extends BlockStateProvider {

    public BlockModelGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ExampleMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        
        ResourceLocation pink_button = this.blockTexture(Blocks.PINK_BUTTON.get());
        this.buttonBlock(Blocks.PINK_BUTTON.get(), pink_button);
        this.itemModels().buttonInventory("pink_button", pink_button);
        
        ResourceLocation green_button = this.blockTexture(Blocks.GREEN_BUTTON.get());
        this.buttonBlock(Blocks.GREEN_BUTTON.get(), green_button);
        this.itemModels().buttonInventory("green_button", green_button);
        
        ResourceLocation red_button = this.blockTexture(Blocks.RED_BUTTON.get());
        this.buttonBlock(Blocks.RED_BUTTON.get(), red_button);
        this.itemModels().buttonInventory("red_button", red_button);
        
        ResourceLocation yellow_button = this.blockTexture(Blocks.YELLOW_BUTTON.get());
        this.buttonBlock(Blocks.YELLOW_BUTTON.get(), yellow_button);
        this.itemModels().buttonInventory("yellow_button", yellow_button);
    }

}
