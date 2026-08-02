package net.mcreator.paleobugs.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.paleobugs.init.PaleobugsModEntities;
import net.mcreator.paleobugs.entity.MegarachneEntity;
import net.mcreator.paleobugs.entity.MeganeuraEntity;
import net.mcreator.paleobugs.entity.GiantWaterSkipperEntity;
import net.mcreator.paleobugs.entity.GiantGrasshoperEntity;
import net.mcreator.paleobugs.entity.BabyMegarachneEntity;
import net.mcreator.paleobugs.entity.BabyMeganeuraEntity;
import net.mcreator.paleobugs.entity.BabyGrasshopperEntity;
import net.mcreator.paleobugs.entity.BabyGiantWaterSkipperEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AgeProcedure {
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
			if (entity.getPersistentData().getDouble("fod") == 0) {
				if (Math.random() < 0.2) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, x, y, z, 1, 0.1, 0.3, 0.1, 0.3);
				}
			}
		}
		if (entity instanceof BabyMegarachneEntity || entity instanceof BabyGiantWaterSkipperEntity || entity instanceof BabyMeganeuraEntity || entity instanceof BabyGrasshopperEntity) {
			if (!(entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(MobEffects.UNLUCK))) {
				if (Math.random() < 0.1) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, x, y, z, 1, 0.1, 0.3, 0.1, 0.3);
				}
			}
			if (entity.getPersistentData().getDouble("age") >= 5) {
				if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 0.2, 0.3, 0.2, 0.3);
					if (Math.random() < 0.1) {
						if (Math.random() < 0.5) {
							if (!entity.level().isClientSide())
								entity.discard();
							if (entity instanceof BabyMegarachneEntity) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = PaleobugsModEntities.MEGARACHNE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
							}
							if (entity instanceof BabyMeganeuraEntity) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = PaleobugsModEntities.MEGANEURA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
							}
							if (entity instanceof BabyGrasshopperEntity) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = PaleobugsModEntities.GIANT_GRASSHOPER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
							}
							if (entity instanceof BabyGiantWaterSkipperEntity) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = PaleobugsModEntities.GIANT_WATER_SKIPPER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
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
