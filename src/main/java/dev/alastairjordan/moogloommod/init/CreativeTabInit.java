package dev.alastairjordan.moogloommod.init;

import dev.alastairjordan.moogloommod.MoogloomMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = MoogloomMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoogloomMod.MODID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = TABS.register("mod_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.mod_tab"))
                    .icon(ItemInit.MOOGLOOM_SPAWN_EGG.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                            output.accept(ItemInit.MOOGLOOM_SPAWN_EGG.get());
                    })
                    .build()
            );

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ItemInit.MOOGLOOM_SPAWN_EGG);
        }
    }
}
