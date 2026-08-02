package net.mcreator.paleobugs.procedures;

import net.minecraft.world.entity.Entity;

public class Mega3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.isInWater()) {
			return false;
		}
		return true;
	}
}
