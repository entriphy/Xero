package io.github.evilarceus.xero.init;

import io.github.evilarceus.xero.common.item.ItemTest;
import io.github.evilarceus.xero.common.item.ItemWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by evila on 11/23/2016.
 */
public class InitItems {
    public static final ItemWrapper ItemTest = new ItemTest();

    public static void init()
    {
        GameRegistry.register(ItemTest.setRegistryName("Test"));
    }
}
