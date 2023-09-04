package dev.alastairjordan.moogloommod.entity;

import dev.alastairjordan.moogloommod.init.EntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.MushroomCow;
import net.minecraft.world.level.Level;

public class Moogloom extends MushroomCow {
    public Moogloom(EntityType<Moogloom> type, Level level) {
        super(type, level);
    }

    public Moogloom(Level level, double x, double y, double z) {
        this(EntityInit.MOOGLOOM.get(), level);
        setPos(x, y, z);
    }

    public Moogloom(Level level, BlockPos position) {
        this(level, position.getX(), position.getY(), position.getZ());
    }
}
