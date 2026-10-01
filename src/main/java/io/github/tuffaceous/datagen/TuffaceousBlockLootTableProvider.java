package io.github.tuffaceous.datagen;

import io.github.tuffaceous.block.TuffaceousBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class TuffaceousBlockLootTableProvider extends BlockLootSubProvider {
    protected TuffaceousBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(TuffaceousBlocks.ABYSMARBLE.get());
        dropSelf(TuffaceousBlocks.FARGNEISS.get());
        dropSelf(TuffaceousBlocks.POLISHED_RHYOLITE.get());
        dropSelf(TuffaceousBlocks.RHYOLITE.get());
        // dropSelf(TuffaceousBlocks.MAGIC_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return TuffaceousBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
