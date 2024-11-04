package net.masik.morearmortrims.datagen;

import net.masik.morearmortrims.MoreArmorTrims;
import net.masik.morearmortrims.util.TrimHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    // Create recipes for smithing and duplicating trims
    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        for (int i = 0; i < TrimHelper.ARMOR_TRIM_SMITHING_TEMPLATES.size(); i++) {
            DeferredItem<Item> trim = TrimHelper.ARMOR_TRIM_SMITHING_TEMPLATES.get(i);

            trimSmithing(recipeOutput, trim.get(), ResourceLocation.fromNamespaceAndPath(MoreArmorTrims.MOD_ID,
                    trim.getRegisteredName().substring(17) + "_smithing_trim"));
            copySmithingTemplate(recipeOutput, trim.get(), TrimHelper.TRIM_MATERIALS.get(i));
        }

    }
}
