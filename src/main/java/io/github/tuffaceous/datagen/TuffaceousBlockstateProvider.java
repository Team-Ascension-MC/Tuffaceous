package io.github.tuffaceous.datagen;

import io.github.tuffaceous.Tuffaceous;
import io.github.tuffaceous.block.TuffaceousBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class TuffaceousBlockstateProvider extends BlockStateProvider {
    public TuffaceousBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Tuffaceous.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(TuffaceousBlocks.ABYSMARBLE);
        blockWithItem(TuffaceousBlocks.COBBLED_LIMESTONE);
        blockWithItem(TuffaceousBlocks.FARGNEISS);
        blockWithItem(TuffaceousBlocks.LIMESTONE);
        blockWithItem(TuffaceousBlocks.POLISHED_RHYOLITE);
        blockWithItem(TuffaceousBlocks.RHYOLITE);

        stairsBlock(TuffaceousBlocks.RHYOLITE_STAIRS.get(), blockTexture(TuffaceousBlocks.RHYOLITE.get()));
        slabBlock(TuffaceousBlocks.RHYOLITE_SLAB.get(), blockTexture(TuffaceousBlocks.RHYOLITE.get()), blockTexture(TuffaceousBlocks.RHYOLITE.get()));
        wallBlock(TuffaceousBlocks.RHYOLITE_WALL.get(), blockTexture(TuffaceousBlocks.RHYOLITE.get()));


        blockItem(TuffaceousBlocks.RHYOLITE_SLAB);
        blockItem(TuffaceousBlocks.RHYOLITE_STAIRS);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("tuffaceous:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("tuffaceous:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
