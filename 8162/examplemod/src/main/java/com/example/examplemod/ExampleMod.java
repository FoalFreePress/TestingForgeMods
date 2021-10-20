package com.example.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.examplelibrary.ExampleLibrary;

import net.minecraftforge.fml.common.Mod;

@Mod(ExampleMod.MODID)
public class ExampleMod {

    public static final String MODID = "examplemod";
    private static final Logger LOGGER = LogManager.getLogger();
    private ExampleLibrary library;

    public ExampleMod() {
        LOGGER.info("Loading mod...");
        library = new ExampleLibrary();
        LOGGER.info("Class of ExampleLibrary " + library.getClass().getName());
        LOGGER.info("Completed Loading!");
    }

}
