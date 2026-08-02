package net.mcreator.paleobugs.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.paleobugs.entity.MegarachneEntity;

public class MegarachintegerProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof MegarachneEntity _datEntI ? _datEntI.getEntityData().get(MegarachneEntity.DATA_rac) : 0) == 1 && entity.isVehicle()) {
			return true;
		}
		return false;
	}
}
