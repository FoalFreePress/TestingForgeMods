package com.example.examplemod;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleMod.MODID)
public class ExampleMod {

    public static final String MODID = "examplemod";
    public static final WoodType CUSTOM_WOOD_TYPE = WoodType.create(new ResourceLocation(MODID, "custom").toString());
    private static final Logger LOGGER = LogManager.getLogger();

    public ExampleMod() {
        LOGGER.info("Loading mod...");
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        LOGGER.info("Completed Loading!");
    }

    public static ResourceLocation of(String name) {
        return new ResourceLocation(MODID, Objects.requireNonNull(name));
    }
}
