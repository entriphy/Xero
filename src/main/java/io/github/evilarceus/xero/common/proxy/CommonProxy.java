package io.github.evilarceus.xero.common.proxy;

import io.github.evilarceus.xero.init.InitItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by evilarceus on 11/24/16.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        InitItems.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
