package io.github.tuffaceous.effect;

import io.github.tuffaceous.Tuffaceous;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.w3c.dom.Attr;

public class TuffaceousEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, Tuffaceous.MODID);

    public static final Holder<MobEffect> SLUGGISH = MOB_EFFECTS.register("sluggish",
            () -> new SluggishEffect(MobEffectCategory.HARMFUL, 8808495)
                    .addAttributeModifier(Attributes.ATTACK_SPEED,
                            ResourceLocation.fromNamespaceAndPath(Tuffaceous.MODID, "sluggish"),-0.25F,
                            AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(Attributes.BLOCK_BREAK_SPEED,
                            ResourceLocation.fromNamespaceAndPath(Tuffaceous.MODID, "sluggish"),-0.25F,
                            AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
