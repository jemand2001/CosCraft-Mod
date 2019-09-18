package com.orangeysnicket.investiture.entity.rendering;

import com.orangeysnicket.investiture.Investiture;
import com.orangeysnicket.investiture.entity.MistWraith;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import java.util.Random;


public class RenderMistWraith extends RenderLiving<MistWraith> {

    public static ResourceLocation mistwraithTexture = new ResourceLocation(Investiture.MODID, "textures/entity/mistwraith.png");

    public static final Factory FACTORY = new Factory();

    private static final Random choice = new Random();

    @Override
    protected ResourceLocation getEntityTexture(MistWraith entity) {
        return mistwraithTexture;
    }

    public RenderMistWraith(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelCow(), .5f);
        Investiture.getLogger().debug("Mistwraith Texture at: " + mistwraithTexture.getPath());
    }

    protected static ModelBase getRandomModel() {
        ModelBase[] models = {
                new ModelCow(),
                new ModelZombie(),
                new ModelPlayer(2, true),
                new ModelPlayer(2, false),
                new ModelCreeper()
        };

        ModelBase model = models[choice.nextInt() % models.length];
        return model;
    }

    public static class Factory implements IRenderFactory {

        @Override
        public Render<? super MistWraith> createRenderFor(RenderManager manager) {
            return new RenderMistWraith(manager);
        }
    }
}
