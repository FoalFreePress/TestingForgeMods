package com.example.examplemod.fluids;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.ToDoubleBiFunction;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.ConcretePowderBlock;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.common.util.TriPredicate;

public class Predicates {

    public enum CanBoat implements BiPredicate<FluidState, Boat> {
        ALL {
            @Override
            public boolean test(FluidState t, Boat u) {
                return true;
            }
        },
        NONE {
            @Override
            public boolean test(FluidState t, Boat u) {
                return false;
            }
        },

        IF_FIRE_IMMUNE {
            @Override
            public boolean test(FluidState t, Boat u) {
                return u.fireImmune();
            }
        }
    }

    public enum CanDrown implements BiPredicate<FluidState, LivingEntity> {
        ALL {
            @Override
            public boolean test(FluidState t, LivingEntity u) {
                return true;
            }
        },
        NONE {
            @Override
            public boolean test(FluidState t, LivingEntity u) {
                return false;
            }

        },
        PLAYERS_ONLY {
            @Override
            public boolean test(FluidState t, LivingEntity u) {
                return u instanceof Player;
            }

        },

        ALL_EXCEPT_PLAYER {
            @Override
            public boolean test(FluidState t, LivingEntity u) {
                return !(u instanceof Player);
            }
        },
        UNDEAD_ONLY {
            @Override
            public boolean test(FluidState t, LivingEntity u) {
                return u.getMobType() == MobType.UNDEAD;
            }
        }
    }

    public enum CanExtinguish implements BiPredicate<FluidState, Entity> {
        ALL {
            @Override
            public boolean test(FluidState t, Entity u) {
                return true;
            }
        },
        NONE {
            @Override
            public boolean test(FluidState t, Entity u) {
                return false;
            }

        },
        PLAYERS_ONLY {
            @Override
            public boolean test(FluidState t, Entity u) {
                return u instanceof Player;
            }

        },

        ALL_EXCEPT_PLAYER {
            @Override
            public boolean test(FluidState t, Entity u) {
                return !(u instanceof Player);
            }
        },
        UNDEAD_ONLY {
            @Override
            public boolean test(FluidState t, Entity u) {
                // Eclipse hates the improved instanceof.
                // return u instanceof LivingEntity le && le.getMobType() == MobType.UNDEAD;
                if (u instanceof LivingEntity)
                    return ((LivingEntity) u).getMobType() == MobType.UNDEAD;
                return false;
            }
        }
    }

    public enum CanHydrate implements BiPredicate<FluidState, BlockState> {
        ALL {
            @Override
            public boolean test(FluidState t, BlockState u) {
                return true;
            }
        },
        NONE {

            @Override
            public boolean test(FluidState t, BlockState u) {
                return false;
            }
        },
        CONCRETE {

            @Override
            public boolean test(FluidState t, BlockState u) {
                return u.getBlock() instanceof ConcretePowderBlock;
            }
        },
        FARMLAND {
            @Override
            public boolean test(FluidState t, BlockState u) {
                return u.getBlock() instanceof FarmBlock;
            }
        }
    }

    public enum CanSwim implements Predicate<FluidState> {
        ALL {
            @Override
            public boolean test(FluidState t) {
                return true;
            }
        },
        NONE {

            @Override
            public boolean test(FluidState t) {
                // TODO Auto-generated method stub
                return false;
            }

        }
    }

    public enum FallDistanceModifier implements ToDoubleBiFunction<FluidState, Entity> {
        DEFAULT {
            @Override
            public double applyAsDouble(FluidState t, Entity u) {
                return 0;
            }

        }
    }

    public enum MotionScale implements ToDoubleBiFunction<FluidState, Entity> {
        DEFAULT {
            @Override
            public double applyAsDouble(FluidState t, Entity u) {
                return 0;
            }
        },
        DOUBLE {
            @Override
            public double applyAsDouble(FluidState t, Entity u) {
                return 2;
            }
        }
    }

    public enum CanMultiply implements TriPredicate<FluidState, LevelReader, BlockPos> {
        NEVER {
            @Override
            public boolean test(FluidState t, LevelReader u, BlockPos v) {
                return false;
            }
        },
        ALWAYS {
            @Override
            public boolean test(FluidState t, LevelReader u, BlockPos v) {
                return true;
            }
        }
    }
}
