package net.masik.morearmortrims.loot;

import com.mojang.serialization.MapCodec;
import net.masik.morearmortrims.MoreArmorTrims;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class ModLootModifiers {

    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> GLOBAL_LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, MoreArmorTrims.MOD_ID);

    public static final Supplier<MapCodec<AddItemLootModifier>> ADD_ITEM_LOOT_MODIFIER =
            GLOBAL_LOOT_MODIFIER_SERIALIZERS.register("add_item_loot_modifier", () -> AddItemLootModifier.CODEC);
    public static final Supplier<MapCodec<ReplaceItemLootModifier>> REPLACE_ITEM_LOOT_MODIFIER =
            GLOBAL_LOOT_MODIFIER_SERIALIZERS.register("replace_item_loot_modifier", () -> ReplaceItemLootModifier.CODEC);

    public static void registerModifiers(IEventBus bus) {
        GLOBAL_LOOT_MODIFIER_SERIALIZERS.register(bus);
    }
}
