package com.orangeysnicket.investiture.proxy;

import com.orangeysnicket.investiture.Investiture;
import com.orangeysnicket.investiture.init.ModEntities;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        Investiture.getLogger().debug("ClientProxy preInit!");
        ModEntities.initModels();
    }


}
