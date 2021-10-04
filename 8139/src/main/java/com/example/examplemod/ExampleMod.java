package com.example.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleMod.MODID)
public class ExampleMod {
    
    public static final String MODID = "examplemod";
    private static final Logger LOGGER = LogManager.getLogger();

    public ExampleMod() {
        LOGGER.info("Loading mod...");
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Items.ITEMS.register(bus);
        Blocks.BLOCKS.register(bus);
        LOGGER.info("Completed Loading!");
    }

}
