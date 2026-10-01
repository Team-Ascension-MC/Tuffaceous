package io.github.tuffaceous.datagen;

import io.github.tuffaceous.Tuffaceous;
import io.github.tuffaceous.block.TuffaceousBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class TuffaceousItemModelProvider extends ItemModelProvider {
    public TuffaceousItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Tuffaceous.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleBlockItem(TuffaceousBlocks.ABYSMARBLE.get());
        simpleBlockItem(TuffaceousBlocks.FARGNEISS.get());
        simpleBlockItem(TuffaceousBlocks.POLISHED_RHYOLITE.get());
        simpleBlockItem(TuffaceousBlocks.RHYOLITE.get());
        //basicItem(TuffaceousItems.MAGIC_ITEM.get());
    }
}
