package net.mcreator.paleobugs.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.paleobugs.entity.MegarachneEntity;
import net.mcreator.paleobugs.entity.MeganeuraEntity;
import net.mcreator.paleobugs.entity.GiantWaterSkipperEntity;
import net.mcreator.paleobugs.entity.GiantGrasshoperEntity;

public class MountDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof MegarachneEntity) {
				return true;
			}
			if ((entity.getVehicle()) instanceof MeganeuraEntity) {
				return true;
			}
			if ((entity.getVehicle()) instanceof GiantWaterSkipperEntity) {
				return true;
			}
			if ((entity.getVehicle()) instanceof GiantGrasshoperEntity) {
				return true;
			}
		}
		return false;
	}
}
