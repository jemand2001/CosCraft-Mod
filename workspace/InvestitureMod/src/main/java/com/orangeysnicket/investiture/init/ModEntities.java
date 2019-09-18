package com.orangeysnicket.investiture.init;

import com.orangeysnicket.investiture.Investiture;
import com.orangeysnicket.investiture.entity.MistWraith;
import com.orangeysnicket.investiture.entity.rendering.RenderMistWraith;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {
    public static void init() {
        int id = 0;
        EntityRegistry.registerModEntity(new ResourceLocation(Investiture.MODID, "mistwraith"), MistWraith.class, "mistwraith", id++, Investiture.INSTANCE, 64, 3, true, 0x996600, 0x00ff00);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(MistWraith.class, RenderMistWraith.FACTORY);
    }
}
