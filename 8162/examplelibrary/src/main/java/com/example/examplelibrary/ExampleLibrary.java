package com.example.examplelibrary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import sun.misc.Unsafe;

public class ExampleLibrary {

    private static final Logger LOGGER = LogManager.getLogger();

    public ExampleLibrary() {
    	LOGGER.info("Class name of ExampleLibrary is " + this.getClass().getName());
        LOGGER.info("Class name of Item is " + Item.class.getName());
        LOGGER.info("Class name of MinecraftForge is " + MinecraftForge.class.getName());
        LOGGER.info("Class name of caller is " + StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE).getCallerClass());
        Unsafe.class.arrayType();
    }

}
