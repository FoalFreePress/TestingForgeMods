package com.example.examplemod.blocks.sign;

import com.example.examplemod.BlockEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CustomSignBlockEntity extends SignBlockEntity {

    public CustomSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<CustomSignBlockEntity> getType() {
        return BlockEntities.CUSTOM_SIGN.get();
    }

}
