package net.mcreator.paleobugs.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class ReturnlifeProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + ((entity.getVehicle()) instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
	}
}
