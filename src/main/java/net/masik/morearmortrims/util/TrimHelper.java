package net.masik.morearmortrims.util;

import net.masik.morearmortrims.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.ArrayList;
import java.util.List;

public class TrimHelper {

    public static final List<DeferredItem<Item>> ARMOR_TRIM_SMITHING_TEMPLATES = new ArrayList<>() {{
        add(ModItems.STORM_ARMOR_TRIM_SMITHING_TEMPLATE);
        add(ModItems.RAM_ARMOR_TRIM_SMITHING_TEMPLATE);
        add(ModItems.MYTH_ARMOR_TRIM_SMITHING_TEMPLATE);
        add(ModItems.GREED_ARMOR_TRIM_SMITHING_TEMPLATE);
        add(ModItems.BEAST_ARMOR_TRIM_SMITHING_TEMPLATE);
        add(ModItems.FEVER_ARMOR_TRIM_SMITHING_TEMPLATE);
        add(ModItems.WRAITH_ARMOR_TRIM_SMITHING_TEMPLATE);
        add(ModItems.NIHILITY_ARMOR_TRIM_SMITHING_TEMPLATE);
        add(ModItems.HORIZON_ARMOR_TRIM_SMITHING_TEMPLATE);
        add(ModItems.ORIGIN_ARMOR_TRIM_SMITHING_TEMPLATE);
    }};

    public static final List<ItemLike> TRIM_MATERIALS = new ArrayList<>() {{
        add(Items.SANDSTONE);
        add(Items.COBBLESTONE);
        add(Items.MOSSY_COBBLESTONE);
        add(Items.RED_SANDSTONE);
        add(Items.MOSSY_COBBLESTONE);
        add(Items.NETHERRACK);
        add(Items.SOUL_SOIL);
        add(Items.COBBLED_DEEPSLATE);
        add(Items.COBBLESTONE);
        add(Items.MOSS_BLOCK);
    }};

}
