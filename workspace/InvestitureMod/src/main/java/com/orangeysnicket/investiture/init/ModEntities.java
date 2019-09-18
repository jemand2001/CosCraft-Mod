package com.orangeysnicket.investiture.init;

import com.orangeysnicket.investiture.Investiture;
import com.orangeysnicket.investiture.entity.EntityAshSprinkle;
import com.orangeysnicket.investiture.entity.MistWraith;
import com.orangeysnicket.investiture.entity.rendering.RenderAshSprinkle;
import com.orangeysnicket.investiture.entity.rendering.RenderMistWraith;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Level;

public class ModEntities {
    public static void init() {
        //FIXME: Use the EntityEntry builder and move this to a RegistryEvent.Register<EntityEntry> (according to MMD discord)
        int id = 0;
        EntityRegistry.registerModEntity(new ResourceLocation(Investiture.MODID, "mistwraith"), MistWraith.class, "mistwraith", id++, Investiture.INSTANCE, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Investiture.MODID, "ash_sprinkle"), EntityAshSprinkle.class, "ash_sprinkle", id++, Investiture.INSTANCE, 100, 3, false);
        Investiture.getLogger().log(Level.valueOf("info"),"Registered {} entities", id);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(MistWraith.class, RenderMistWraith.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityAshSprinkle.class, RenderAshSprinkle.FACTORY);
    }
}
