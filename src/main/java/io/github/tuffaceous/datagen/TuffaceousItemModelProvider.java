package io.github.tuffaceous.datagen;

import io.github.tuffaceous.Tuffaceous;
import io.github.tuffaceous.block.TuffaceousBlocks;
import io.github.tuffaceous.items.TuffaceousItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class TuffaceousItemModelProvider extends ItemModelProvider {
    public TuffaceousItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Tuffaceous.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleBlockItem(TuffaceousBlocks.ABYSMARBLE.get());
        simpleBlockItem(TuffaceousBlocks.COBBLED_LIMESTONE.get());
        simpleBlockItem(TuffaceousBlocks.FARGNEISS.get());
        simpleBlockItem(TuffaceousBlocks.LIMESTONE.get());
        simpleBlockItem(TuffaceousBlocks.POLISHED_RHYOLITE.get());
        simpleBlockItem(TuffaceousBlocks.RHYOLITE.get());
            wallItem(TuffaceousBlocks.RHYOLITE_WALL, TuffaceousBlocks.RHYOLITE);

        basicItem(TuffaceousItems.HARD_TACK.get());
        //basicItem(TuffaceousItems.MAGIC_ITEM.get());
    }
    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(Tuffaceous.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
