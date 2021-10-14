package com.example.examplemod.datagen;

import java.util.function.Consumer;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.ModItems;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
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
        ShapedRecipeBuilder.shaped(ModItems.RED_PICKAXE.get())
        .define('T', Items.RED_TERRACOTTA)
        .define('S', Tags.Items.RODS_WOODEN)
        .pattern("TTT")
        .pattern(" S ")
        .pattern(" S ")
        .unlockedBy("has_item", has(Items.RED_TERRACOTTA))
        .save(consumer, ExampleMod.of("red_pickaxe"));

        ShapedRecipeBuilder.shaped(ModItems.RED_SUPERPICKAXE.get())
        .define('T', Items.RED_TERRACOTTA)
        .define('P', ModItems.RED_PICKAXE.get())
        .pattern("TTT")
        .pattern("TPT")
        .pattern("TTT")
        .unlockedBy("has_item", has(ModItems.RED_PICKAXE.get()))
        .save(consumer, ExampleMod.of("red_superpickaxe"));
        // @formatter:on
    }
}
