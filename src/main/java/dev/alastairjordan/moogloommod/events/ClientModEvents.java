package dev.alastairjordan.moogloommod.events;

import dev.alastairjordan.moogloommod.MoogloomMod;
import dev.alastairjordan.moogloommod.client.model.MoogloomModel;
import dev.alastairjordan.moogloommod.client.renderer.MoogloomRenderer;
import dev.alastairjordan.moogloommod.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoogloomMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.MOOGLOOM.get(), MoogloomRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(MoogloomModel.LAYER_LOCATION, MoogloomModel::createBodyLayer);
    }
}
