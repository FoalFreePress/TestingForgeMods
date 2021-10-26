package com.example.examplemod.events;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.ModItems;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ItemPropertyFunction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = ExampleMod.MODID, value = Dist.CLIENT, bus = Bus.MOD)
public class ClientEvents {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> ItemProperties.register(ModItems.CUSTOM_FISHING_ROD.get(), ExampleMod.of("cast"), new FishItemProperty()));
    }

    private static class FishItemProperty implements ItemPropertyFunction {
        @Override
        public float call(ItemStack stack, ClientLevel level, LivingEntity entity, int i) {
            if (entity != null) {
                boolean holdingRodInMain = entity.getMainHandItem() == stack;
                boolean holdingRodInOff = entity.getOffhandItem() == stack;
                if (entity.getMainHandItem().getItem() instanceof FishingRodItem) {
                    holdingRodInOff = false;
                }
                if (entity instanceof Player) {
                    Player player = (Player) entity;
                    if (player.fishing != null && (holdingRodInMain || holdingRodInOff)) {
                        return 1.0F; // cast
                    }
                }
            }
            return 0.0F;
        }

    }
}
