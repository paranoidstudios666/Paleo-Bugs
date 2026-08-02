
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paleobugs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.paleobugs.client.model.Modelskiper;
import net.mcreator.paleobugs.client.model.Modelninga;
import net.mcreator.paleobugs.client.model.Modelgrillitooo;
import net.mcreator.paleobugs.client.model.Modelgrajoper;
import net.mcreator.paleobugs.client.model.Modeldragonfly;
import net.mcreator.paleobugs.client.model.Modelarana;
import net.mcreator.paleobugs.client.model.Modelacuatico;
import net.mcreator.paleobugs.client.model.ModelRadicte;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PaleobugsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelgrajoper.LAYER_LOCATION, Modelgrajoper::createBodyLayer);
		event.registerLayerDefinition(Modelacuatico.LAYER_LOCATION, Modelacuatico::createBodyLayer);
		event.registerLayerDefinition(Modelarana.LAYER_LOCATION, Modelarana::createBodyLayer);
		event.registerLayerDefinition(Modelgrillitooo.LAYER_LOCATION, Modelgrillitooo::createBodyLayer);
		event.registerLayerDefinition(Modelninga.LAYER_LOCATION, Modelninga::createBodyLayer);
		event.registerLayerDefinition(Modelskiper.LAYER_LOCATION, Modelskiper::createBodyLayer);
		event.registerLayerDefinition(ModelRadicte.LAYER_LOCATION, ModelRadicte::createBodyLayer);
		event.registerLayerDefinition(Modeldragonfly.LAYER_LOCATION, Modeldragonfly::createBodyLayer);
	}
}
