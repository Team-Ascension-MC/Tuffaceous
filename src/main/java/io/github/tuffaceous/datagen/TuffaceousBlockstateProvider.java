package io.github.tuffaceous.datagen;

import io.github.tuffaceous.Tuffaceous;
import io.github.tuffaceous.block.TuffaceousBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class TuffaceousBlockstateProvider extends BlockStateProvider {
    public TuffaceousBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Tuffaceous.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(TuffaceousBlocks.ABYSMARBLE);
        blockWithItem(TuffaceousBlocks.FARGNEISS);
        blockWithItem(TuffaceousBlocks.POLISHED_RHYOLITE);
        blockWithItem(TuffaceousBlocks.RHYOLITE);


    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
