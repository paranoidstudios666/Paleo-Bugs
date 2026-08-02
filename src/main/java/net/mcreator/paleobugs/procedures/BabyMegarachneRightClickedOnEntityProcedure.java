package net.mcreator.paleobugs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.paleobugs.entity.BabyMegarachneEntity;
import net.mcreator.paleobugs.entity.BabyMeganeuraEntity;
import net.mcreator.paleobugs.entity.BabyGrasshopperEntity;
import net.mcreator.paleobugs.entity.BabyGiantWaterSkipperEntity;

public class BabyMegarachneRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof BabyGrasshopperEntity || entity instanceof BabyMeganeuraEntity || entity instanceof BabyGiantWaterSkipperEntity) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("paleobugs:fruta")))
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("paleobugs:fruta")))
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("paleo_bugs:fruta")))) {
				if (!(entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(MobEffects.UNLUCK))) {
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 300, 0, false, false));
					entity.getPersistentData().putDouble("age", (entity.getPersistentData().getDouble("age") + 1));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 3, 0.3, 0.3, 0.3, 0.2);
				}
			}
		}
		if (entity instanceof BabyMegarachneEntity) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("paleobugs:carne")))
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("paleobugs:carne")))
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("paleo_bugs:carne")))) {
				if (!(entity instanceof LivingEntity _livEnt23 && _livEnt23.hasEffect(MobEffects.UNLUCK))) {
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 300, 0, false, false));
					entity.getPersistentData().putDouble("age", (entity.getPersistentData().getDouble("age") + 1));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 3, 0.3, 0.3, 0.3, 0.2);
				}
			}
		}
	}
}
