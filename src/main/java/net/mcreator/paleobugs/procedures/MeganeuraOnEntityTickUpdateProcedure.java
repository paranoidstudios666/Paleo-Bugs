package net.mcreator.paleobugs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.paleobugs.entity.MeganeuraEntity;

public class MeganeuraOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isVehicle()) {
			if (world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
				entity.push(0, 0.1, 0);
			}
			if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
				entity.push(0, 0.1, 0);
			}
		}
		if (!entity.onGround()) {
			if (entity instanceof MeganeuraEntity _datEntSetI)
				_datEntSetI.getEntityData().set(MeganeuraEntity.DATA_groun, 1);
		} else {
			if (entity instanceof MeganeuraEntity _datEntSetI)
				_datEntSetI.getEntityData().set(MeganeuraEntity.DATA_groun, 0);
		}
		if (entity.isVehicle()) {
			if (Math.random() < 0.1) {
				entity.push(0, (-0.05), 0);
			}
		}
	}
}
