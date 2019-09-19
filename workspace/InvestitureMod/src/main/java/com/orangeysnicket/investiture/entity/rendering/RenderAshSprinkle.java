package com.orangeysnicket.investiture.entity.rendering;

import com.orangeysnicket.investiture.Investiture;
import com.orangeysnicket.investiture.entity.EntityAshSprinkle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelManager;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderItemFrame;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class RenderAshSprinkle extends Render<EntityAshSprinkle> {
    public final ResourceLocation model = new ModelResourceLocation(Investiture.MODID,"models/block/ash_sprinkle");
    public static final ResourceLocation ashTexture = new ResourceLocation(Investiture.MODID, "textures/block/ash_layer.png");
    public static final Factory FACTORY = new Factory();
    private final Minecraft mc = Minecraft.getMinecraft();
    private static final Logger logger = Investiture.getLogger();

    public RenderAshSprinkle(RenderManager renderManagerIn) {
        super(renderManagerIn);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityAshSprinkle entity) {
        return ashTexture;
    }

    public static class Factory implements IRenderFactory {

        @Override
        public Render<? super EntityAshSprinkle> createRenderFor(RenderManager manager) {
            Investiture.getLogger().log(Level.WARN, "Creating AshSprinkle renderer!");
            return new RenderAshSprinkle(manager);
        }
    }
}
