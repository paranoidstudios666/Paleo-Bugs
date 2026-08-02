package net.mcreator.paleobugs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.paleobugs.entity.MegarachneEntity;

public class EeeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world
				.getBlockState(
						new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()))
				.canOcclude()) {
			entity.getPersistentData().putBoolean("clin", true);
			if (!entity.onGround()) {
				if (entity instanceof MegarachneEntity _datEntSetI)
					_datEntSetI.getEntityData().set(MegarachneEntity.DATA_rac, 1);
			}
		} else {
			entity.getPersistentData().putBoolean("clin", false);
			if (entity instanceof MegarachneEntity _datEntSetI)
				_datEntSetI.getEntityData().set(MegarachneEntity.DATA_rac, 0);
		}
	}
}
