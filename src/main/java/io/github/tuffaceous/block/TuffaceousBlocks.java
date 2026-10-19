package io.github.tuffaceous.block;

import io.github.tuffaceous.Tuffaceous;
import io.github.tuffaceous.items.TuffaceousItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class TuffaceousBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Tuffaceous.MODID);

    public static final DeferredBlock<Block> ABYSMARBLE = registerBlock("abysmarble",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .strength(3f)
            ));
    public static final DeferredBlock<Block> COBBLED_LIMESTONE = registerBlock("cobbled_limestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .strength(2f)
            ));
    public static final DeferredBlock<StairBlock> COBBLED_LIMESTONE_STAIRS = registerBlock("cobbled_limestone_stairs",
            () -> new StairBlock(TuffaceousBlocks.COBBLED_LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).strength(2f)));
    public static final DeferredBlock<SlabBlock> COBBLED_LIMESTONE_SLAB = registerBlock("cobbled_limestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).strength(2f)));
    public static final DeferredBlock<WallBlock> COBBLED_LIMESTONE_WALL = registerBlock("cobbled_limestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).strength(2f)));

    public static final DeferredBlock<Block> FARGNEISS = registerBlock("fargneiss",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)
                    .strength(3f)
            ));
    public static final DeferredBlock<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .strength(1.5f)
            ));
    public static final DeferredBlock<StairBlock> LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            () -> new StairBlock(TuffaceousBlocks.LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK).strength(1.5f)));
    public static final DeferredBlock<SlabBlock> LIMESTONE_SLAB = registerBlock("limestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).strength(1.5f)));


    public static final DeferredBlock<Block> POLISHED_FARGNEISS = registerBlock("polished_fargneiss",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.POLISHED_DEEPSLATE)
                    .strength(3.5f)
            ));
    public static final DeferredBlock<Block> POLISHED_RHYOLITE = registerBlock("polished_rhyolite",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .strength(1.5f)
            ));
    public static final DeferredBlock<StairBlock> POLISHED_RHYOLITE_STAIRS = registerBlock("polished_rhyolite_stairs",
            () -> new StairBlock(TuffaceousBlocks.POLISHED_RHYOLITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).strength(1.5f)));
    public static final DeferredBlock<SlabBlock> POLISHED_RHYOLITE_SLAB = registerBlock("polished_rhyolite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).strength(1.5f)));

    public static final DeferredBlock<Block> RHYOLITE = registerBlock("rhyolite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .strength(1.5f)
            ));
    public static final DeferredBlock<StairBlock> RHYOLITE_STAIRS = registerBlock("rhyolite_stairs",
            () -> new StairBlock(TuffaceousBlocks.RHYOLITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).strength(1.5f)));
    public static final DeferredBlock<SlabBlock> RHYOLITE_SLAB = registerBlock("rhyolite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).strength(1.5f)));
    public static final DeferredBlock<WallBlock> RHYOLITE_WALL = registerBlock("rhyolite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).strength(1.5f)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toreturn = BLOCKS.register(name, block);
        registerBlockItem(name, toreturn);
        return toreturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        TuffaceousItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
