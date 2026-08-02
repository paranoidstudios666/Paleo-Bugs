
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paleobugs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.paleobugs.PaleobugsMod;

public class PaleobugsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PaleobugsMod.MODID);
	public static final RegistryObject<SoundEvent> FLY1 = REGISTRY.register("fly1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("paleobugs", "fly1")));
	public static final RegistryObject<SoundEvent> FKY = REGISTRY.register("fky", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("paleobugs", "fky")));
	public static final RegistryObject<SoundEvent> FLY = REGISTRY.register("fly", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("paleobugs", "fly")));
	public static final RegistryObject<SoundEvent> GRASS1 = REGISTRY.register("grass1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("paleobugs", "grass1")));
	public static final RegistryObject<SoundEvent> GRAS2 = REGISTRY.register("gras2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("paleobugs", "gras2")));
	public static final RegistryObject<SoundEvent> BOING = REGISTRY.register("boing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("paleobugs", "boing")));
	public static final RegistryObject<SoundEvent> ARANA1 = REGISTRY.register("arana1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("paleobugs", "arana1")));
	public static final RegistryObject<SoundEvent> ARANATAK = REGISTRY.register("aranatak", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("paleobugs", "aranatak")));
	public static final RegistryObject<SoundEvent> SKIPERSS = REGISTRY.register("skiperss", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("paleobugs", "skiperss")));
}
