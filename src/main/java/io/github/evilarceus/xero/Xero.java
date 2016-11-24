package io.github.evilarceus.xero;

import io.github.evilarceus.xero.client.render.items.ItemRenderRegister;
import io.github.evilarceus.xero.common.proxy.CommonProxy;
import io.github.evilarceus.xero.common.reference.Reference;
import io.github.evilarceus.xero.init.InitItems;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid= Reference.MODID, name=Reference.NAME, version=Reference.VERSION)
public class Xero {

    @Mod.Instance("Xero")
    public static Xero instance;

    @SidedProxy(clientSide="io.github.evilarceus.xero.common.proxy.ClientProxy",
                serverSide="io.github.evilarceus.xero.common.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        proxy.preInit(e);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        proxy.postInit(e);
    }
}
