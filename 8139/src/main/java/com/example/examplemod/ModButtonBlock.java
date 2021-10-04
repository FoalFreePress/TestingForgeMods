package com.example.examplemod;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.ButtonBlock;

public class ModButtonBlock extends ButtonBlock {

    protected ModButtonBlock(Properties properties) {
        super(false, properties);
    }

    @Override
    protected SoundEvent getSound(boolean on) {
        return on ? SoundEvents.STONE_BUTTON_CLICK_ON : SoundEvents.STONE_BUTTON_CLICK_OFF;
    }

}
