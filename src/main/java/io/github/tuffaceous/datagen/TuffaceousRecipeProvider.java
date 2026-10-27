package io.github.tuffaceous.datagen;

import io.github.tuffaceous.block.TuffaceousBlocks;
import io.github.tuffaceous.items.TuffaceousItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class TuffaceousRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public TuffaceousRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput){
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TuffaceousBlocks.POLISHED_FARGNEISS.get(), 4)
                .pattern("FF")
                .pattern("FF")
                .define('F', TuffaceousBlocks.FARGNEISS.get())
                .unlockedBy("has_fargneiss", has(TuffaceousBlocks.FARGNEISS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TuffaceousBlocks.POLISHED_RHYOLITE.get(), 4)
                .pattern("XX")
                .pattern("XX")
                .define('X', TuffaceousBlocks.RHYOLITE.get())
                .unlockedBy("has_rhyolite", has(TuffaceousBlocks.RHYOLITE)).save(recipeOutput);
        stairBuilder(TuffaceousBlocks.COBBLED_LIMESTONE_STAIRS.get(), Ingredient.of(TuffaceousBlocks.COBBLED_LIMESTONE)).group("limestone")
                        .unlockedBy("has_cobbled_limestone", has(TuffaceousBlocks.COBBLED_LIMESTONE)).save(recipeOutput);
        stairBuilder(TuffaceousBlocks.LIMESTONE_STAIRS.get(), Ingredient.of(TuffaceousBlocks.LIMESTONE)).group("limestone")
                        .unlockedBy("has_limestone", has(TuffaceousBlocks.LIMESTONE)).save(recipeOutput);
        stairBuilder(TuffaceousBlocks.POLISHED_FARGNEISS_STAIRS.get(), Ingredient.of(TuffaceousBlocks.POLISHED_FARGNEISS)).group("fargneiss")
                        .unlockedBy("has_fargneiss", has(TuffaceousBlocks.FARGNEISS)).save(recipeOutput);
        stairBuilder(TuffaceousBlocks.POLISHED_RHYOLITE_STAIRS.get(), Ingredient.of(TuffaceousBlocks.POLISHED_RHYOLITE)).group("rhyolite")
                        .unlockedBy("has_rhyolite", has(TuffaceousBlocks.RHYOLITE)).save(recipeOutput);
        stairBuilder(TuffaceousBlocks.RHYOLITE_STAIRS.get(), Ingredient.of(TuffaceousBlocks.RHYOLITE)).group("rhyolite")
                        .unlockedBy("has_rhyolite", has(TuffaceousBlocks.RHYOLITE)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, TuffaceousBlocks.COBBLED_LIMESTONE_SLAB.get(), TuffaceousBlocks.COBBLED_LIMESTONE.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, TuffaceousBlocks.LIMESTONE_SLAB.get(), TuffaceousBlocks.LIMESTONE.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, TuffaceousBlocks.POLISHED_FARGNEISS_SLAB.get(), TuffaceousBlocks.POLISHED_FARGNEISS.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, TuffaceousBlocks.POLISHED_RHYOLITE_SLAB.get(), TuffaceousBlocks.POLISHED_RHYOLITE.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, TuffaceousBlocks.RHYOLITE_SLAB.get(), TuffaceousBlocks.RHYOLITE.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, TuffaceousBlocks.COBBLED_LIMESTONE_WALL.get(), TuffaceousBlocks.COBBLED_LIMESTONE.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, TuffaceousBlocks.RHYOLITE_WALL.get(), TuffaceousBlocks.RHYOLITE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, TuffaceousItems.HARD_TACK.get(), 16)
                .pattern("WWW")
                .pattern("WBW")
                .pattern("WWW")
                .define('W', Items.WHEAT)
                .define('B', Items.WATER_BUCKET)
                .unlockedBy("has_wheat", has(Items.WHEAT)).save(recipeOutput);
    }
}
