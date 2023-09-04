package dev.alastairjordan.moogloommod.init;

import dev.alastairjordan.moogloommod.MoogloomMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoogloomMod.MODID);

    public static final RegistryObject<ForgeSpawnEggItem> MOOGLOOM_SPAWN_EGG = ITEMS.register("moogloom_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    EntityInit.MOOGLOOM,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            )
    );
}
