package net.mcreator.paleobugs.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.paleobugs.entity.MegarachneEntity;
import net.mcreator.paleobugs.entity.MeganeuraEntity;
import net.mcreator.paleobugs.entity.GiantWaterSkipperEntity;
import net.mcreator.paleobugs.entity.GiantGrasshoperEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TiredProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof MeganeuraEntity || entity instanceof MegarachneEntity || entity instanceof GiantGrasshoperEntity || entity instanceof GiantWaterSkipperEntity) {
			if (!(entity.getPersistentData().getDouble("fod") == 0)) {
				if (entity.isVehicle()) {
					if (Math.random() < 0.1) {
						if (Math.random() < 0.1) {
							if (Math.random() < 0.1) {
								if (Math.random() < 0.1) {
									entity.getPersistentData().putDouble("fod", (entity.getPersistentData().getDouble("fod") - 1));
								}
							}
						}
					}
				}
			}
		}
		if (Math.random() < 0.5) {
			if (entity instanceof GiantGrasshoperEntity) {
				if (entity.onGround()) {
					if (Math.random() < 0.1) {
						if (Math.random() < 0.1) {
							if (Math.random() < 0.5) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("paleobugs:grass1")), SoundSource.VOICE, (float) 0.5, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("paleobugs:grass1")), SoundSource.VOICE, (float) 0.5, 1, false);
									}
								}
							} else {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("paleobugs:gras2")), SoundSource.VOICE, (float) 0.5, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("paleobugs:gras2")), SoundSource.VOICE, (float) 0.5, 1, false);
									}
								}
							}
						}
					}
				}
			}
			if (entity instanceof MegarachneEntity) {
				if (Math.random() < 0.1) {
					if (Math.random() < 0.1) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("paleobugs:arana1")), SoundSource.VOICE, (float) 0.8, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("paleobugs:arana1")), SoundSource.VOICE, (float) 0.8, 1, false);
							}
						}
					}
				}
			}
			if (entity instanceof GiantWaterSkipperEntity) {
				if (Math.random() < 0.1) {
					if (Math.random() < 0.1) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("paleobugs:skiperss")), SoundSource.VOICE, (float) 0.7, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("paleobugs:skiperss")), SoundSource.VOICE, (float) 0.7, 1, false);
							}
						}
					}
				}
			}
			if (entity instanceof MeganeuraEntity) {
				if (!entity.onGround()) {
					if (Math.random() < 0.1) {
						if (Math.random() < 0.1) {
							if (Math.random() < 0.5) {
								if (Math.random() < 0.5) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("paleobugs:fky")), SoundSource.VOICE, (float) 0.3, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("paleobugs:fky")), SoundSource.VOICE, (float) 0.3, 1, false);
										}
									}
								} else {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("paleobugs:fly")), SoundSource.VOICE, (float) 0.3, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("paleobugs:fly")), SoundSource.VOICE, (float) 0.3, 1, false);
										}
									}
								}
							} else {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("paleobugs:fly1")), SoundSource.VOICE, (float) 0.3, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("paleobugs:fly1")), SoundSource.VOICE, (float) 0.3, 1, false);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
