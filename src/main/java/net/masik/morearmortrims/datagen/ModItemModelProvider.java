package net.masik.morearmortrims.datagen;

import net.masik.morearmortrims.MoreArmorTrims;
import net.masik.morearmortrims.item.ModItems;
import net.masik.morearmortrims.util.TrimHelper;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreArmorTrims.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        // Generate item models
        for (DeferredItem<Item> item : TrimHelper.ARMOR_TRIM_SMITHING_TEMPLATES) {
            basicItem(item.get());
        }

    }
}
