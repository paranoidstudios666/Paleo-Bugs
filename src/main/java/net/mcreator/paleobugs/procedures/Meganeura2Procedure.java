package net.mcreator.paleobugs.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.paleobugs.entity.MeganeuraEntity;

public class Meganeura2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof MeganeuraEntity _datEntI ? _datEntI.getEntityData().get(MeganeuraEntity.DATA_groun) : 0) == 1) {
			return false;
		}
		return true;
	}
}
