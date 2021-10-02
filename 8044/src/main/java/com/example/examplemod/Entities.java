package com.example.examplemod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.animal.PolarBear;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@EventBusSubscriber(modid = ExampleMod.MODID, bus = Bus.MOD)
public class Entities {
    static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, ExampleMod.MODID);

    static final RegistryObject<EntityType<Pig>> PIG = ENTITIES.register("test_pig", () -> EntityType.Builder.of(Pig::new, MobCategory.CREATURE).sized(1, 1).build("test_pig"));
    static final RegistryObject<EntityType<Creeper>> CREEPER = ENTITIES.register("test_creeper", () -> EntityType.Builder.of(Creeper::new, MobCategory.MONSTER).sized(1, 1).build("test_creeper"));
    static final RegistryObject<EntityType<Cow>> COW = ENTITIES.register("test_cow", () -> EntityType.Builder.of(Cow::new, MobCategory.CREATURE).sized(1, 1).build("test_cow"));
    static final RegistryObject<EntityType<PolarBear>> POLAR_BEAR = ENTITIES.register("test_polar_bear", () -> EntityType.Builder.of(PolarBear::new, MobCategory.CREATURE).sized(1, 1).build("test_polar_bear"));

    @SubscribeEvent
    public static void onRegisterAttributes(final EntityAttributeCreationEvent event) {
        event.put(PIG.get(), Pig.createAttributes().build());
        event.put(CREEPER.get(), Creeper.createAttributes().build());
        event.put(COW.get(), Cow.createAttributes().build());
        event.put(POLAR_BEAR.get(), PolarBear.createAttributes().build());
    }
}
