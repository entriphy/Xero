package io.github.evilarceus.xero.common.item;

import io.github.evilarceus.xero.Xero;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by evila on 11/23/2016.
 */
public class ItemTest extends ItemWrapper {
    public ItemTest()
    {
        super();
        this.setUnlocalizedName("TestItem");
        this.setCreativeTab(CreativeTabs.MISC);

    }

}
