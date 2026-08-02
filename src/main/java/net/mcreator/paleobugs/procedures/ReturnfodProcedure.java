package net.mcreator.paleobugs.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnfodProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + (entity.getVehicle()).getPersistentData().getDouble("fod");
	}
}
