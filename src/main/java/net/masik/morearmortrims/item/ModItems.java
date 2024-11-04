package net.masik.morearmortrims.item;

import net.masik.morearmortrims.MoreArmorTrims;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreArmorTrims.MOD_ID);

    public static final DeferredItem<Item> STORM_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("storm_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "storm")));
    public static final DeferredItem<Item> RAM_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("ram_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "ram")));
    public static final DeferredItem<Item> MYTH_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("myth_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "myth")));
    public static final DeferredItem<Item> GREED_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("greed_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "greed")));
    public static final DeferredItem<Item> BEAST_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("beast_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "beast")));
    public static final DeferredItem<Item> FEVER_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("fever_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "fever")));
    public static final DeferredItem<Item> WRAITH_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("wraith_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "wraith")));
    public static final DeferredItem<Item> NIHILITY_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("nihility_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "nihility")));
    public static final DeferredItem<Item> HORIZON_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("horizon_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "horizon")));
    public static final DeferredItem<Item> ORIGIN_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("origin_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID, "origin")));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}
