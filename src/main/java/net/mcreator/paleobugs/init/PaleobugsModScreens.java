
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paleobugs.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.paleobugs.client.gui.ReactivationTableGuiScreen;
import net.mcreator.paleobugs.client.gui.DnaSintetizerGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PaleobugsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PaleobugsModMenus.REACTIVATION_TABLE_GUI.get(), ReactivationTableGuiScreen::new);
			MenuScreens.register(PaleobugsModMenus.DNA_SINTETIZER_GUI.get(), DnaSintetizerGuiScreen::new);
		});
	}
}
