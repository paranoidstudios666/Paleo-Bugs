
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paleobugs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.paleobugs.PaleobugsMod;

public class PaleobugsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PaleobugsMod.MODID);
	public static final RegistryObject<CreativeModeTab> PALEO_ARKANE = REGISTRY.register("paleo_arkane",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.paleobugs.paleo_arkane")).icon(() -> new ItemStack(PaleobugsModItems.SUSPICIOUS_AMBER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PaleobugsModBlocks.PETRIFIED_WOOD.get().asItem());
				tabData.accept(PaleobugsModBlocks.STRIPPED_PETRIFIED_WOOD.get().asItem());
				tabData.accept(PaleobugsModBlocks.STRIPPED_PETRIFIED_WOOD_BRICK.get().asItem());
				tabData.accept(PaleobugsModBlocks.PETRIFIED_WOOD_TILES.get().asItem());
				tabData.accept(PaleobugsModBlocks.CHISELED_PETRIFIED_WOOD.get().asItem());
				tabData.accept(PaleobugsModBlocks.AMBER_BLOCK.get().asItem());
				tabData.accept(PaleobugsModItems.AMBER.get());
				tabData.accept(PaleobugsModBlocks.AMBER_LAMP.get().asItem());
				tabData.accept(PaleobugsModItems.SUSPICIOUS_AMBER.get());
				tabData.accept(PaleobugsModBlocks.DNA_SINTETIZER.get().asItem());
				tabData.accept(PaleobugsModBlocks.DRAGONFLY_EGG.get().asItem());
				tabData.accept(PaleobugsModBlocks.WATER_SKIPPER_EGG.get().asItem());
				tabData.accept(PaleobugsModBlocks.GIANT_GRASSHOPER_EGG.get().asItem());
				tabData.accept(PaleobugsModBlocks.MEGARACHNE_EGG.get().asItem());
				tabData.accept(PaleobugsModItems.GIANT_GRASSHOPER_SPAWN_EGG.get());
				tabData.accept(PaleobugsModItems.MEGANEURA_SPAWN_EGG.get());
				tabData.accept(PaleobugsModItems.GIANT_WATER_SKIPPER_SPAWN_EGG.get());
				tabData.accept(PaleobugsModItems.MEGARACHNE_SPAWN_EGG.get());
			}).build());
}
