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
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(TuffaceousBlocks.ABYSMARBLE.get())
                .add(TuffaceousBlocks.FARGNEISS.get())
                .add(TuffaceousBlocks.POLISHED_RHYOLITE.get())
                .add(TuffaceousBlocks.RHYOLITE.get());

    }
}
