
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paleobugs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.paleobugs.client.renderer.MegarachneRenderer;
import net.mcreator.paleobugs.client.renderer.MeganeuraRenderer;
import net.mcreator.paleobugs.client.renderer.GiantWaterSkipperRenderer;
import net.mcreator.paleobugs.client.renderer.GiantGrasshoperRenderer;
import net.mcreator.paleobugs.client.renderer.BabyMegarachneRenderer;
import net.mcreator.paleobugs.client.renderer.BabyMeganeuraRenderer;
import net.mcreator.paleobugs.client.renderer.BabyGrasshopperRenderer;
import net.mcreator.paleobugs.client.renderer.BabyGiantWaterSkipperRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PaleobugsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PaleobugsModEntities.GIANT_GRASSHOPER.get(), GiantGrasshoperRenderer::new);
		event.registerEntityRenderer(PaleobugsModEntities.MEGANEURA.get(), MeganeuraRenderer::new);
		event.registerEntityRenderer(PaleobugsModEntities.GIANT_WATER_SKIPPER.get(), GiantWaterSkipperRenderer::new);
		event.registerEntityRenderer(PaleobugsModEntities.MEGARACHNE.get(), MegarachneRenderer::new);
		event.registerEntityRenderer(PaleobugsModEntities.BABY_MEGARACHNE.get(), BabyMegarachneRenderer::new);
		event.registerEntityRenderer(PaleobugsModEntities.BABY_GRASSHOPPER.get(), BabyGrasshopperRenderer::new);
		event.registerEntityRenderer(PaleobugsModEntities.BABY_GIANT_WATER_SKIPPER.get(), BabyGiantWaterSkipperRenderer::new);
		event.registerEntityRenderer(PaleobugsModEntities.BABY_MEGANEURA.get(), BabyMeganeuraRenderer::new);
	}
}
