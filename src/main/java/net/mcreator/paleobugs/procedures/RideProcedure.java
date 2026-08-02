package net.mcreator.paleobugs.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.paleobugs.entity.MegarachneEntity;
import net.mcreator.paleobugs.entity.MeganeuraEntity;
import net.mcreator.paleobugs.entity.GiantWaterSkipperEntity;
import net.mcreator.paleobugs.entity.GiantGrasshoperEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RideProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof MeganeuraEntity || (entity.getVehicle()) instanceof MegarachneEntity || (entity.getVehicle()) instanceof GiantGrasshoperEntity || (entity.getVehicle()) instanceof GiantWaterSkipperEntity) {
				if ((entity.getVehicle()).getPersistentData().getDouble("fod") == 0) {
					if (Math.random() < 0.1) {
						entity.stopRiding();
					}
				}
			}
		}
	}
}
