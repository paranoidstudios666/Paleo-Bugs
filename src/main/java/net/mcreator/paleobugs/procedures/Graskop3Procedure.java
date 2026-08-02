package net.mcreator.paleobugs.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.paleobugs.entity.GiantWaterSkipperEntity;

public class Graskop3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof GiantWaterSkipperEntity _datEntI ? _datEntI.getEntityData().get(GiantWaterSkipperEntity.DATA_swi) : 0) == 1) {
			return true;
		}
		return false;
	}
}
