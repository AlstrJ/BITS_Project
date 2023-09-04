package dev.alastairjordan.moogloommod.client.renderer;

import dev.alastairjordan.moogloommod.MoogloomMod;
import dev.alastairjordan.moogloommod.client.model.MoogloomModel;
import dev.alastairjordan.moogloommod.entity.Moogloom;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MoogloomRenderer extends MobRenderer<Moogloom, MoogloomModel<Moogloom>> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(MoogloomMod.MODID, "textures/entity/moogloom.png");
    public MoogloomRenderer(EntityRendererProvider.Context context) {
        super(context, new MoogloomModel<>(context.bakeLayer(MoogloomModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(Moogloom entity) {
        return TEXTURE;
    }
}
