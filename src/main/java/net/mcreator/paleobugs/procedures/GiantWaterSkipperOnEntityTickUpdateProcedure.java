package net.mcreator.paleobugs.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.paleobugs.entity.GiantWaterSkipperEntity;

public class GiantWaterSkipperOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 300, 1, false, false));
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 300, 1, false, false));
		}
		if (entity.isInWater()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 300, 1, false, false));
		}
		if (entity.isInWater()) {
			if (entity instanceof GiantWaterSkipperEntity _datEntSetI)
				_datEntSetI.getEntityData().set(GiantWaterSkipperEntity.DATA_swi, 1);
		} else {
			if (entity instanceof GiantWaterSkipperEntity _datEntSetI)
				_datEntSetI.getEntityData().set(GiantWaterSkipperEntity.DATA_swi, 0);
		}
	}
}
