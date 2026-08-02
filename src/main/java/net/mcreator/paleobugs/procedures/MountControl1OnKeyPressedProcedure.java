package net.mcreator.paleobugs.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.paleobugs.entity.MegarachneEntity;
import net.mcreator.paleobugs.entity.MeganeuraEntity;
import net.mcreator.paleobugs.entity.GiantGrasshoperEntity;
import net.mcreator.paleobugs.PaleobugsMod;

public class MountControl1OnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof GiantGrasshoperEntity) {
				if ((entity.getVehicle()).getPersistentData().getDouble("fod") >= 1) {
					if ((entity.getVehicle()).onGround()) {
						if (Math.random() < 0.1) {
							if (Math.random() < 0.5) {
								(entity.getVehicle()).getPersistentData().putDouble("fod", ((entity.getVehicle()).getPersistentData().getDouble("fod") - 1));
							}
						}
						PaleobugsMod.queueServerWork(6, () -> {
							(entity.getVehicle()).setDeltaMovement(new Vec3((entity.getLookAngle().x * 3), 2.5, (entity.getLookAngle().z * 3)));
						});
					}
				}
			}
		}
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof MegarachneEntity) {
				if ((entity.getVehicle()).getPersistentData().getDouble("fod") >= 1) {
					if ((entity.getVehicle()).getPersistentData().getBoolean("clin") == true) {
						(entity.getVehicle()).push(0, 0.4, 0);
						if ((entity.getVehicle()) instanceof MegarachneEntity _datEntSetI)
							_datEntSetI.getEntityData().set(MegarachneEntity.DATA_rac, 1);
						if (Math.random() < 0.1) {
							if (Math.random() < 0.2) {
								(entity.getVehicle()).getPersistentData().putDouble("fod", ((entity.getVehicle()).getPersistentData().getDouble("fod") - 1));
							}
						}
					}
				}
			}
		}
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof MeganeuraEntity) {
				if ((entity.getVehicle()).getPersistentData().getDouble("fod") >= 1) {
					(entity.getVehicle()).push(0, 0.15, 0);
					(entity.getVehicle()).push((entity.getLookAngle().x / 2), 0, (entity.getLookAngle().z / 2));
					if (Math.random() < 0.1) {
						if (Math.random() < 0.5) {
							(entity.getVehicle()).getPersistentData().putDouble("fod", ((entity.getVehicle()).getPersistentData().getDouble("fod") - 1));
						}
					}
				}
			}
		}
	}
}
