package io.github.evilarceus.xero.init;

import io.github.evilarceus.xero.common.block.BlockTest;
import io.github.evilarceus.xero.common.block.BlockWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class InitBlocks {

    public static final BlockWrapper BlockTest = new BlockTest();

    public static void init()
    {
        System.out.println("Registering Test Block...");
        GameRegistry.registerBlock(BlockTest.setRegistryName("TestBlock"));
    }
}
