package net.masik.morearmortrims.event;

import net.masik.morearmortrims.MoreArmorTrims;
import net.masik.morearmortrims.item.ModItems;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.WandererTradesEvent;

import java.util.List;

@EventBusSubscriber(modid = MoreArmorTrims.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void addWanderingTrades(WandererTradesEvent event) {

        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        rareTrades.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 15),
                new ItemStack(ModItems.MYTH_ARMOR_TRIM_SMITHING_TEMPLATE.get(), 1), 1, 10, 0
        ));
    }

}
