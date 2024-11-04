package net.masik.morearmortrims.trim;

import net.masik.morearmortrims.MoreArmorTrims;
import net.masik.morearmortrims.item.ModItems;
import net.masik.morearmortrims.util.TrimHelper;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.ArrayList;
import java.util.List;

public class ModArmorTrimPatterns {

    public static final ResourceKey<TrimPattern> STORM_ARMOR_TRIM_PATTERN = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "storm"));
    public static final ResourceKey<TrimPattern> RAM_ARMOR_TRIM_PATTERN = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "ram"));
    public static final ResourceKey<TrimPattern> MYTH_ARMOR_TRIM_PATTERN = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "myth"));
    public static final ResourceKey<TrimPattern> GREED_ARMOR_TRIM_PATTERN = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "greed"));
    public static final ResourceKey<TrimPattern> BEAST_ARMOR_TRIM_PATTERN = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "beast"));
    public static final ResourceKey<TrimPattern> FEVER_ARMOR_TRIM_PATTERN = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "fever"));
    public static final ResourceKey<TrimPattern> WRAITH_ARMOR_TRIM_PATTERN = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "wraith"));
    public static final ResourceKey<TrimPattern> NIHILITY_ARMOR_TRIM_PATTERN = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "nihility"));
    public static final ResourceKey<TrimPattern> HORIZON_ARMOR_TRIM_PATTERN = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "horizon"));
    public static final ResourceKey<TrimPattern> ORIGIN_ARMOR_TRIM_PATTERN = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "origin"));

    private static final List<ResourceKey<TrimPattern>> TRIM_PATTERNS = new ArrayList<>() {{
        add(STORM_ARMOR_TRIM_PATTERN);
        add(RAM_ARMOR_TRIM_PATTERN);
        add(MYTH_ARMOR_TRIM_PATTERN);
        add(GREED_ARMOR_TRIM_PATTERN);
        add(BEAST_ARMOR_TRIM_PATTERN);
        add(FEVER_ARMOR_TRIM_PATTERN);
        add(WRAITH_ARMOR_TRIM_PATTERN);
        add(NIHILITY_ARMOR_TRIM_PATTERN);
        add(HORIZON_ARMOR_TRIM_PATTERN);
        add(ORIGIN_ARMOR_TRIM_PATTERN);
    }};

    public static void bootstrap(BootstrapContext<TrimPattern> context) {
        for (int i = 0; i < TrimHelper.ARMOR_TRIM_SMITHING_TEMPLATES.size(); i++) {

            register(context, TrimHelper.ARMOR_TRIM_SMITHING_TEMPLATES.get(i), TRIM_PATTERNS.get(i));

        }
    }

    private static void register(BootstrapContext<TrimPattern> context, DeferredItem<Item> item, ResourceKey<TrimPattern> key) {

        TrimPattern trimPattern = new TrimPattern(key.location(), item.getDelegate(),
                Component.translatable(Util.makeDescriptionId("trim_pattern", key.location())), false);

        context.register(key, trimPattern);

    }

}
