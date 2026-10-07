package io.github.tuffaceous.datagen;

import io.github.tuffaceous.Tuffaceous;
import io.github.tuffaceous.block.TuffaceousBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class TuffaceousBlockTagProvider extends BlockTagsProvider {
    public TuffaceousBlockTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, Tuffaceous.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.BASE_STONE_OVERWORLD)
                .add(TuffaceousBlocks.ABYSMARBLE.get())
                .add(TuffaceousBlocks.FARGNEISS.get())
                .add(TuffaceousBlocks.LIMESTONE.get())
                .add(TuffaceousBlocks.RHYOLITE.get());
        tag(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
                .add(TuffaceousBlocks.FARGNEISS.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(TuffaceousBlocks.ABYSMARBLE.get())
                .add(TuffaceousBlocks.COBBLED_LIMESTONE.get())
                .add(TuffaceousBlocks.FARGNEISS.get())
                .add(TuffaceousBlocks.LIMESTONE.get())
                .add(TuffaceousBlocks.POLISHED_RHYOLITE.get())
                .add(TuffaceousBlocks.RHYOLITE.get());
        tag(BlockTags.SLABS)
                .add(TuffaceousBlocks.RHYOLITE_SLAB.get());
        tag(BlockTags.STAIRS)
                .add(TuffaceousBlocks.RHYOLITE_STAIRS.get());
        tag(BlockTags.STONE_ORE_REPLACEABLES)
                .add(TuffaceousBlocks.RHYOLITE.get());
        tag(BlockTags.WALLS)
                .add(TuffaceousBlocks.RHYOLITE_WALL.get());

    }
}
