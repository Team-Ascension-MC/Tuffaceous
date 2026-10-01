package io.github.tuffaceous.datagen;

import io.github.tuffaceous.block.TuffaceousBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class TuffaceousRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public TuffaceousRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput){

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TuffaceousBlocks.POLISHED_RHYOLITE.get())
                .pattern("XX")
                .pattern("XX")
                .define('X', TuffaceousBlocks.RHYOLITE.get())
                .unlockedBy("has_rhyolite", has(TuffaceousBlocks.RHYOLITE)).save(recipeOutput);
    }
}
