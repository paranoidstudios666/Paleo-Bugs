
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paleobugs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.paleobugs.world.inventory.ReactivationTableGuiMenu;
import net.mcreator.paleobugs.world.inventory.DnaSintetizerGuiMenu;
import net.mcreator.paleobugs.PaleobugsMod;

public class PaleobugsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PaleobugsMod.MODID);
	public static final RegistryObject<MenuType<ReactivationTableGuiMenu>> REACTIVATION_TABLE_GUI = REGISTRY.register("reactivation_table_gui", () -> IForgeMenuType.create(ReactivationTableGuiMenu::new));
	public static final RegistryObject<MenuType<DnaSintetizerGuiMenu>> DNA_SINTETIZER_GUI = REGISTRY.register("dna_sintetizer_gui", () -> IForgeMenuType.create(DnaSintetizerGuiMenu::new));
}
