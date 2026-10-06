package io.github.tuffaceous.items;

import io.github.tuffaceous.Tuffaceous;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class TuffaceousItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Tuffaceous.MODID);

    public static final DeferredItem<Item> HARD_TACK = ITEMS.register("hard_tack",
            ()-> new Item(new Item.Properties().food(TuffaceousFoodProperties.HARD_TACK)));

    public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
}

