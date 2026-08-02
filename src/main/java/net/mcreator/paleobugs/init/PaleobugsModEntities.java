
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paleobugs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.paleobugs.entity.MegarachneEntity;
import net.mcreator.paleobugs.entity.MeganeuraEntity;
import net.mcreator.paleobugs.entity.GiantWaterSkipperEntity;
import net.mcreator.paleobugs.entity.GiantGrasshoperEntity;
import net.mcreator.paleobugs.entity.BabyMegarachneEntity;
import net.mcreator.paleobugs.entity.BabyMeganeuraEntity;
import net.mcreator.paleobugs.entity.BabyGrasshopperEntity;
import net.mcreator.paleobugs.entity.BabyGiantWaterSkipperEntity;
import net.mcreator.paleobugs.PaleobugsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PaleobugsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PaleobugsMod.MODID);
	public static final RegistryObject<EntityType<GiantGrasshoperEntity>> GIANT_GRASSHOPER = register("giant_grasshoper",
			EntityType.Builder.<GiantGrasshoperEntity>of(GiantGrasshoperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GiantGrasshoperEntity::new)

					.sized(1f, 0.7f));
	public static final RegistryObject<EntityType<MeganeuraEntity>> MEGANEURA = register("meganeura",
			EntityType.Builder.<MeganeuraEntity>of(MeganeuraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MeganeuraEntity::new)

					.sized(0.9f, 0.8f));
	public static final RegistryObject<EntityType<GiantWaterSkipperEntity>> GIANT_WATER_SKIPPER = register("giant_water_skipper",
			EntityType.Builder.<GiantWaterSkipperEntity>of(GiantWaterSkipperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GiantWaterSkipperEntity::new)

					.sized(1.5f, 0.6f));
	public static final RegistryObject<EntityType<MegarachneEntity>> MEGARACHNE = register("megarachne",
			EntityType.Builder.<MegarachneEntity>of(MegarachneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MegarachneEntity::new)

					.sized(1.9f, 1.3f));
	public static final RegistryObject<EntityType<BabyMegarachneEntity>> BABY_MEGARACHNE = register("baby_megarachne",
			EntityType.Builder.<BabyMegarachneEntity>of(BabyMegarachneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyMegarachneEntity::new)

					.sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<BabyGrasshopperEntity>> BABY_GRASSHOPPER = register("baby_grasshopper",
			EntityType.Builder.<BabyGrasshopperEntity>of(BabyGrasshopperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyGrasshopperEntity::new)

					.sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<BabyGiantWaterSkipperEntity>> BABY_GIANT_WATER_SKIPPER = register("baby_giant_water_skipper",
			EntityType.Builder.<BabyGiantWaterSkipperEntity>of(BabyGiantWaterSkipperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BabyGiantWaterSkipperEntity::new)

					.sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<BabyMeganeuraEntity>> BABY_MEGANEURA = register("baby_meganeura",
			EntityType.Builder.<BabyMeganeuraEntity>of(BabyMeganeuraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyMeganeuraEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GiantGrasshoperEntity.init();
			MeganeuraEntity.init();
			GiantWaterSkipperEntity.init();
			MegarachneEntity.init();
			BabyMegarachneEntity.init();
			BabyGrasshopperEntity.init();
			BabyGiantWaterSkipperEntity.init();
			BabyMeganeuraEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GIANT_GRASSHOPER.get(), GiantGrasshoperEntity.createAttributes().build());
		event.put(MEGANEURA.get(), MeganeuraEntity.createAttributes().build());
		event.put(GIANT_WATER_SKIPPER.get(), GiantWaterSkipperEntity.createAttributes().build());
		event.put(MEGARACHNE.get(), MegarachneEntity.createAttributes().build());
		event.put(BABY_MEGARACHNE.get(), BabyMegarachneEntity.createAttributes().build());
		event.put(BABY_GRASSHOPPER.get(), BabyGrasshopperEntity.createAttributes().build());
		event.put(BABY_GIANT_WATER_SKIPPER.get(), BabyGiantWaterSkipperEntity.createAttributes().build());
		event.put(BABY_MEGANEURA.get(), BabyMeganeuraEntity.createAttributes().build());
	}
}
