package io.github.evilarceus.xero.common.block;

import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by evilarceus on 11/26/16.
 */
public class BlockTest extends BlockWrapper {

    public BlockTest()
    {
        super();
        this.setUnlocalizedName("TestBlock");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
