
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paleobugs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.paleobugs.block.WaterSkipperEggBlock;
import net.mcreator.paleobugs.block.StrippedPetrifiedWoodBrickBlock;
import net.mcreator.paleobugs.block.StrippedPetrifiedWoodBlock;
import net.mcreator.paleobugs.block.PetrifiedWoodTilesBlock;
import net.mcreator.paleobugs.block.PetrifiedWoodBlock;
import net.mcreator.paleobugs.block.MegarachneEggBlock;
import net.mcreator.paleobugs.block.GiantGrasshoperEggBlock;
import net.mcreator.paleobugs.block.DragonflyEggBlock;
import net.mcreator.paleobugs.block.DnaSintetizerBlock;
import net.mcreator.paleobugs.block.ChiseledPetrifiedWoodBlock;
import net.mcreator.paleobugs.block.AmberLampBlock;
import net.mcreator.paleobugs.block.AmberBlockBlock;
import net.mcreator.paleobugs.PaleobugsMod;

public class PaleobugsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PaleobugsMod.MODID);
	public static final RegistryObject<Block> PETRIFIED_WOOD = REGISTRY.register("petrified_wood", () -> new PetrifiedWoodBlock());
	public static final RegistryObject<Block> DNA_SINTETIZER = REGISTRY.register("dna_sintetizer", () -> new DnaSintetizerBlock());
	public static final RegistryObject<Block> AMBER_BLOCK = REGISTRY.register("amber_block", () -> new AmberBlockBlock());
	public static final RegistryObject<Block> STRIPPED_PETRIFIED_WOOD = REGISTRY.register("stripped_petrified_wood", () -> new StrippedPetrifiedWoodBlock());
	public static final RegistryObject<Block> PETRIFIED_WOOD_TILES = REGISTRY.register("petrified_wood_tiles", () -> new PetrifiedWoodTilesBlock());
	public static final RegistryObject<Block> STRIPPED_PETRIFIED_WOOD_BRICK = REGISTRY.register("stripped_petrified_wood_brick", () -> new StrippedPetrifiedWoodBrickBlock());
	public static final RegistryObject<Block> CHISELED_PETRIFIED_WOOD = REGISTRY.register("chiseled_petrified_wood", () -> new ChiseledPetrifiedWoodBlock());
	public static final RegistryObject<Block> AMBER_LAMP = REGISTRY.register("amber_lamp", () -> new AmberLampBlock());
	public static final RegistryObject<Block> MEGARACHNE_EGG = REGISTRY.register("megarachne_egg", () -> new MegarachneEggBlock());
	public static final RegistryObject<Block> DRAGONFLY_EGG = REGISTRY.register("dragonfly_egg", () -> new DragonflyEggBlock());
	public static final RegistryObject<Block> WATER_SKIPPER_EGG = REGISTRY.register("water_skipper_egg", () -> new WaterSkipperEggBlock());
	public static final RegistryObject<Block> GIANT_GRASSHOPER_EGG = REGISTRY.register("giant_grasshoper_egg", () -> new GiantGrasshoperEggBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
