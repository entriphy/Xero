package io.github.evilarceus.xero.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by evila on 11/23/2016.
 */
public class ItemTest extends ItemWrapper {
    public ItemTest()
    {
        super();
        this.setUnlocalizedName("Test");
        this.setCreativeTab(CreativeTabs.MISC);

    }

}
