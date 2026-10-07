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
        dropSelf(TuffaceousBlocks.COBBLED_LIMESTONE.get());
        dropSelf(TuffaceousBlocks.FARGNEISS.get());
        dropSelf(TuffaceousBlocks.POLISHED_RHYOLITE.get());
        dropSelf(TuffaceousBlocks.RHYOLITE.get());
            dropSelf(TuffaceousBlocks.RHYOLITE_STAIRS.get());
            add(TuffaceousBlocks.RHYOLITE_SLAB.get(),
                    block -> createSlabItemTable(TuffaceousBlocks.RHYOLITE_SLAB.get()));
            dropSelf(TuffaceousBlocks.RHYOLITE_WALL.get());

        dropOther(TuffaceousBlocks.LIMESTONE.get(),
                TuffaceousBlocks.COBBLED_LIMESTONE.get());
        // dropSelf(TuffaceousBlocks.EXAMPLE_BLOCK.get());
        // dropOther(TuffaceousBlocks.SOURCE_BLOCK.get(),
        //      Class.RESULT_ITEM.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return TuffaceousBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
