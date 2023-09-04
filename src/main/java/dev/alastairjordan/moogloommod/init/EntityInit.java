package dev.alastairjordan.moogloommod.init;

import dev.alastairjordan.moogloommod.MoogloomMod;
import dev.alastairjordan.moogloommod.entity.Moogloom;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MoogloomMod.MODID);

    public static final RegistryObject<EntityType<Moogloom>> MOOGLOOM = ENTITIES.register("moogloom",
            () -> EntityType.Builder.<Moogloom>of(Moogloom::new, MobCategory.CREATURE)
            .sized(1.0f, 1.0f)
            .build(new ResourceLocation(MoogloomMod.MODID, "moogloom").toString())
            );
}
