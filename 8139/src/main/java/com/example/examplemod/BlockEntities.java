package com.example.examplemod;

import com.example.examplemod.blocks.sign.CustomSignBlockEntity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockEntities {

    static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ExampleMod.MODID);

    public static final RegistryObject<BlockEntityType<CustomSignBlockEntity>> CUSTOM_SIGN = BLOCK_ENTITIES.register("custom_sign", () -> BlockEntityType.Builder.of(CustomSignBlockEntity::new, Blocks.CUSTOM_WALL_SIGN.get(), Blocks.CUSTOM_STANDING_SIGN.get()).build(null));
}
