package com.example.examplemod.datagen;

import com.example.examplemod.Blocks;
import com.example.examplemod.ExampleMod;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile.ExistingModelFile;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockModelGenerator extends BlockStateProvider {
    private static final UncheckedModelFile ITEM_GENERATED = new UncheckedModelFile("item/generated");
    private final ItemModelProvider provider;

    public BlockModelGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ExampleMod.MODID, exFileHelper);
        this.provider = this.itemModels();
    }

    @Override
    protected void registerStatesAndModels() {

        ResourceLocation pink_button = this.blockTexture(Blocks.PINK_BUTTON.get());
        this.buttonBlock(Blocks.PINK_BUTTON.get(), pink_button);
        provider.buttonInventory("pink_button", pink_button);

        ResourceLocation green_button = this.blockTexture(Blocks.GREEN_BUTTON.get());
        this.buttonBlock(Blocks.GREEN_BUTTON.get(), green_button);
        provider.buttonInventory("green_button", green_button);

        ResourceLocation red_button = this.blockTexture(Blocks.RED_BUTTON.get());
        this.buttonBlock(Blocks.RED_BUTTON.get(), red_button);
        provider.buttonInventory("red_button", red_button);

        ResourceLocation yellow_button = this.blockTexture(Blocks.YELLOW_BUTTON.get());
        this.buttonBlock(Blocks.YELLOW_BUTTON.get(), yellow_button);
        provider.buttonInventory("yellow_button", yellow_button);

        ResourceLocation custom_sign = new ResourceLocation(ExampleMod.MODID, "entity/signs/custom");
        // ResourceLocation custom_sign = this.blockTexture(Blocks.TEST_WALL_SIGN.get());
        this.signBlock(Blocks.CUSTOM_STANDING_SIGN.get(), Blocks.CUSTOM_WALL_SIGN.get(), custom_sign);
        provider.getBuilder("custom_sign").parent(ITEM_GENERATED).texture("layer0", modLoc(ModelProvider.ITEM_FOLDER + "/custom_sign"));
        

        ResourceLocation pressure_plate = this.blockTexture(Blocks.CUSTOM_PRESSURE_PLATE.get());
        this.pressurePlateBlock(Blocks.CUSTOM_PRESSURE_PLATE.get(), pressure_plate);
        provider.getBuilder("custom_pressure_plate").parent(new ExistingModelFile(pressure_plate, this.models().existingFileHelper));
    }

}
