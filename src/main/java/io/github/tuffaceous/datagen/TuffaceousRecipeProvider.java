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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, TuffaceousBlocks.POLISHED_RHYOLITE.get())
                .pattern("XX")
                .pattern("XX")
                .define('X', TuffaceousBlocks.RHYOLITE.get())
                .unlockedBy("has_rhyolite", has(TuffaceousBlocks.RHYOLITE)).save(recipeOutput);
        stairBuilder(TuffaceousBlocks.RHYOLITE_STAIRS.get(), Ingredient.of(TuffaceousBlocks.RHYOLITE)).group("rhyolite")
                        .unlockedBy("has_rhyolite", has(TuffaceousBlocks.RHYOLITE)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, TuffaceousBlocks.RHYOLITE_SLAB.get(), TuffaceousBlocks.RHYOLITE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, TuffaceousItems.HARD_TACK.get(), 16)
                .pattern("WWW")
                .pattern("WBW")
                .pattern("WWW")
                .define('W', Items.WHEAT)
                .define('B', Items.WATER_BUCKET)
                .unlockedBy("has_wheat", has(Items.WHEAT)).save(recipeOutput);
    }
}
