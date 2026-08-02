
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paleobugs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.paleobugs.item.SuspiciousAmberItem;
import net.mcreator.paleobugs.item.ReactivationDustItem;
import net.mcreator.paleobugs.item.AmberItem;
import net.mcreator.paleobugs.PaleobugsMod;

public class PaleobugsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PaleobugsMod.MODID);
	public static final RegistryObject<Item> SUSPICIOUS_AMBER = REGISTRY.register("suspicious_amber", () -> new SuspiciousAmberItem());
	public static final RegistryObject<Item> REACTIVATION_DUST = REGISTRY.register("reactivation_dust", () -> new ReactivationDustItem());
	public static final RegistryObject<Item> GIANT_GRASSHOPER_SPAWN_EGG = REGISTRY.register("giant_grasshoper_spawn_egg", () -> new ForgeSpawnEggItem(PaleobugsModEntities.GIANT_GRASSHOPER, -16764160, -10040320, new Item.Properties()));
	public static final RegistryObject<Item> PETRIFIED_WOOD = block(PaleobugsModBlocks.PETRIFIED_WOOD);
	public static final RegistryObject<Item> MEGANEURA_SPAWN_EGG = REGISTRY.register("meganeura_spawn_egg", () -> new ForgeSpawnEggItem(PaleobugsModEntities.MEGANEURA, -16764058, -16737895, new Item.Properties()));
	public static final RegistryObject<Item> GIANT_WATER_SKIPPER_SPAWN_EGG = REGISTRY.register("giant_water_skipper_spawn_egg", () -> new ForgeSpawnEggItem(PaleobugsModEntities.GIANT_WATER_SKIPPER, -10079488, -6724096, new Item.Properties()));
	public static final RegistryObject<Item> DNA_SINTETIZER = block(PaleobugsModBlocks.DNA_SINTETIZER);
	public static final RegistryObject<Item> AMBER = REGISTRY.register("amber", () -> new AmberItem());
	public static final RegistryObject<Item> AMBER_BLOCK = block(PaleobugsModBlocks.AMBER_BLOCK);
	public static final RegistryObject<Item> MEGARACHNE_SPAWN_EGG = REGISTRY.register("megarachne_spawn_egg", () -> new ForgeSpawnEggItem(PaleobugsModEntities.MEGARACHNE, -10079488, -3355648, new Item.Properties()));
	public static final RegistryObject<Item> STRIPPED_PETRIFIED_WOOD = block(PaleobugsModBlocks.STRIPPED_PETRIFIED_WOOD);
	public static final RegistryObject<Item> PETRIFIED_WOOD_TILES = block(PaleobugsModBlocks.PETRIFIED_WOOD_TILES);
	public static final RegistryObject<Item> STRIPPED_PETRIFIED_WOOD_BRICK = block(PaleobugsModBlocks.STRIPPED_PETRIFIED_WOOD_BRICK);
	public static final RegistryObject<Item> CHISELED_PETRIFIED_WOOD = block(PaleobugsModBlocks.CHISELED_PETRIFIED_WOOD);
	public static final RegistryObject<Item> AMBER_LAMP = block(PaleobugsModBlocks.AMBER_LAMP);
	public static final RegistryObject<Item> MEGARACHNE_EGG = block(PaleobugsModBlocks.MEGARACHNE_EGG);
	public static final RegistryObject<Item> DRAGONFLY_EGG = block(PaleobugsModBlocks.DRAGONFLY_EGG);
	public static final RegistryObject<Item> WATER_SKIPPER_EGG = block(PaleobugsModBlocks.WATER_SKIPPER_EGG);
	public static final RegistryObject<Item> GIANT_GRASSHOPER_EGG = block(PaleobugsModBlocks.GIANT_GRASSHOPER_EGG);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
