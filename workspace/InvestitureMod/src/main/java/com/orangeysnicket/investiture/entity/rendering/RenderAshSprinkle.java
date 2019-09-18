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

    public void doRender(EntityAshSprinkle entity, double x, double y, double z, float entityYaw, float partialTicks) {
        logger.log(Level.WARN, "RENDERING ASH SPRINKLE ENTITY");
        GlStateManager.pushMatrix();
        BlockPos blockpos = entity.getHangingPosition();
        double d0 = (double)blockpos.getX() - entity.posX + x;
        double d1 = (double)blockpos.getY() - entity.posY + y;
        double d2 = (double)blockpos.getZ() - entity.posZ + z;
        GlStateManager.translate(d0 + 0.5D, d1 + 0.5D, d2 + 0.5D);
        GlStateManager.rotate(180.0F - entity.rotationYaw, 0.0F, 1.0F, 0.0F);
        this.renderManager.renderEngine.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
        BlockRendererDispatcher blockrendererdispatcher = this.mc.getBlockRendererDispatcher();
        ModelManager modelmanager = blockrendererdispatcher.getBlockModelShapes().getModelManager();
        IBakedModel ibakedmodel = modelmanager.getModel((ModelResourceLocation) this.model);

        GlStateManager.pushMatrix();
        GlStateManager.translate(-0.5F, -0.5F, -0.5F);

        if (this.renderOutlines)
        {
            GlStateManager.enableColorMaterial();
            GlStateManager.enableOutlineMode(this.getTeamColor(entity));
        }

        blockrendererdispatcher.getBlockModelRenderer().renderModelBrightnessColor(ibakedmodel, 1.0F, 1.0F, 1.0F, 1.0F);

        if (this.renderOutlines)
        {
            GlStateManager.disableOutlineMode();
            GlStateManager.disableColorMaterial();
        }

        GlStateManager.popMatrix();
        GlStateManager.translate(0.0F, 0.0F, 0.4375F);
        GlStateManager.popMatrix();
        this.renderName(entity, x + (double)((float)entity.facingDirection.getXOffset() * 0.3F), y - 0.25D, z + (double)((float)entity.facingDirection.getZOffset() * 0.3F));
    }
}
