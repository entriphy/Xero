package io.github.evilarceus.xero.init;

import io.github.evilarceus.xero.common.block.*;
import io.github.evilarceus.xero.common.block.BlockWrapper;
import io.github.evilarceus.xero.common.block.colors.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class InitBlocks {
    
    public static final BlockWrapper BlockTest = new BlockTest();

    public static final BlockWrapper BlockWhite = new BlockWhite();
    public static final BlockWrapper BlockOrange = new BlockOrange();
    public static final BlockWrapper BlockMagenta = new BlockMagenta();
    public static final BlockWrapper BlockLightBlue = new BlockLightBlue();
    public static final BlockWrapper BlockYellow = new BlockYellow();
    public static final BlockWrapper BlockLime = new BlockLime();
    public static final BlockWrapper BlockPink = new BlockPink();
    public static final BlockWrapper BlockGray = new BlockGray();
    public static final BlockWrapper BlockLightGray = new BlockLightGray();
    public static final BlockWrapper BlockCyan = new BlockCyan();
    public static final BlockWrapper BlockPurple = new BlockPurple();
    public static final BlockWrapper BlockBlue = new BlockBlue();
    public static final BlockWrapper BlockBrown = new BlockBrown();
    public static final BlockWrapper BlockGreen = new BlockGreen();
    public static final BlockWrapper BlockRed = new BlockRed();
    public static final BlockWrapper BlockBlack = new BlockBlack();


    public static void init()
    {
        GameRegistry.registerBlock(BlockTest.setRegistryName("TestBlock"));

        GameRegistry.registerBlock(BlockWhite.setRegistryName("WhiteBlock"));
        GameRegistry.registerBlock(BlockOrange.setRegistryName("OrangeBlock"));
        GameRegistry.registerBlock(BlockMagenta.setRegistryName("MagentaBlock"));
        GameRegistry.registerBlock(BlockLightBlue.setRegistryName("LightBlueBlock"));
        GameRegistry.registerBlock(BlockYellow.setRegistryName("YellowBlock"));
        GameRegistry.registerBlock(BlockLime.setRegistryName("LimeBlock"));
        GameRegistry.registerBlock(BlockPink.setRegistryName("PinkBlock"));
        GameRegistry.registerBlock(BlockGray.setRegistryName("GrayBlock"));
        GameRegistry.registerBlock(BlockLightGray.setRegistryName("LightGrayBlock"));
        GameRegistry.registerBlock(BlockCyan.setRegistryName("CyanBlock"));
        GameRegistry.registerBlock(BlockPurple.setRegistryName("PurpleBlock"));
        GameRegistry.registerBlock(BlockBlue.setRegistryName("BlueBlock"));
        GameRegistry.registerBlock(BlockBrown.setRegistryName("BrownBlock"));
        GameRegistry.registerBlock(BlockGreen.setRegistryName("GreenBlock"));
        GameRegistry.registerBlock(BlockRed.setRegistryName("RedBlock"));
        GameRegistry.registerBlock(BlockBlack.setRegistryName("BlackBlock"));
    }
}
