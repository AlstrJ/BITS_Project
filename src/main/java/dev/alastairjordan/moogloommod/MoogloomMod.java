package dev.alastairjordan.moogloommod;

import dev.alastairjordan.moogloommod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoogloomMod.MODID)
public class MoogloomMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "moogloommod";

    public MoogloomMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
    }
}
