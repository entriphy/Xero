package io.github.evilarceus.xero.init;

import io.github.evilarceus.xero.common.item.ItemTest;
import io.github.evilarceus.xero.common.item.ItemWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class InitItems {

    public static final ItemWrapper ItemTest = new ItemTest();

    public static void init()
    {
        System.out.println("Registering Test Item...");
        GameRegistry.register(ItemTest.setRegistryName("TestItem"));
    }
}
