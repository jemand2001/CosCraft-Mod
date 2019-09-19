package com.orangeysnicket.investiture.proxy;

import com.orangeysnicket.investiture.Investiture;
import com.orangeysnicket.investiture.init.ModEntities;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.fml.relauncher.Side;
import org.apache.logging.log4j.Level;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        Investiture.getLogger().log(Level.INFO, "ClientProxy preInit!");
    }

    public void init(FMLInitializationEvent e) {
        super.init(e);
        ModEntities.initModels();
    }

}
