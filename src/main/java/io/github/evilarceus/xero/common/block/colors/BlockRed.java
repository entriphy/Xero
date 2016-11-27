package io.github.evilarceus.xero.common.block.colors;

import io.github.evilarceus.xero.common.block.BlockWrapper;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by evilarceus on 11/26/16.
 */
public class BlockRed extends BlockWrapper {
    public BlockRed() {
        super();
        this.setUnlocalizedName("RedBlock");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
