
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.paleobugs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PaleobugsModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(Items.EMERALD, 20), new ItemStack(PaleobugsModItems.SUSPICIOUS_AMBER.get()), 1, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(Items.EMERALD), new ItemStack(PaleobugsModItems.SUSPICIOUS_AMBER.get()), 1, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20),

					new ItemStack(PaleobugsModItems.SUSPICIOUS_AMBER.get()), 1, 5, 0.05f));
		}
	}
}
