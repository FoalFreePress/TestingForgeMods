package com.example.examplemod.datagen;

import java.util.function.Consumer;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.ModItems;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.Tags;

public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(DataGenerator generator) {
        super(generator);
    }

    @Override
    public String getName() {
        return "ExampleMod Recipe Generator";
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        // @formatter:off
        ShapedRecipeBuilder.shaped(ModItems.CUSTOM_FISHING_ROD.get())
        .define('G', Tags.Items.INGOTS_GOLD)
        .define('S', Tags.Items.STRING)
        .pattern("  G")
        .pattern(" GS")
        .pattern("G S")
        .unlockedBy("has_item", has(Tags.Items.INGOTS_GOLD))
        .save(consumer, ExampleMod.of("custom_fishing_rod"));

        // @formatter:on
    }
}
