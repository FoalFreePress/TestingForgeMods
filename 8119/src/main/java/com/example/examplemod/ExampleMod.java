package com.example.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BaseSpawnerActivationEvent;
import net.minecraftforge.eventbus.api.Event.Result;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("examplemod")
public class ExampleMod {
     // Directly reference a log4j logger.
     private static final Logger LOGGER = LogManager.getLogger();

     public ExampleMod() {
          // Register ourselves for server and other game events we are interested in
          MinecraftForge.EVENT_BUS.register(this);
     }

     @SubscribeEvent
     public void onBaseSpawnerActivationEvent(BaseSpawnerActivationEvent event) {
          Level level = event.getLevel();
          BlockPos block = event.getPos();
          if (level.isClientSide)
               return;
          if (isNearbyPlayerGlowing(level, block.getX() + 0.5D, block.getY() + 0.5D, block.getZ() + 0.5D, 16)) {
               event.setResult(Result.ALLOW);
               LOGGER.info("Allowing spawn!");
          } else {
               event.setResult(Result.DENY);
               LOGGER.info("Denying spawn!");
          }
     }

     private boolean isNearbyPlayerGlowing(Level level, double x, double y, double z, double range) {
          for (Player player : level.players()) {
            if(player.isCurrentlyGlowing() && (player.distanceToSqr(x, y, z) < range * range))
                return true;
          }
          return false;
     }
}
