package io.github.evilarceus.xero.creativeTab;

import io.github.evilarceus.xero.common.reference.Reference;
import io.github.evilarceus.xero.init.InitBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class CreativeTab {

    public static final CreativeTabs XERO = new CreativeTabs(Reference.MODID) {

        @Override
        public Item getTabIconItem() {
            // TODO Uncomment after reimplemented
//            return ModItems.stonePhilosophers;
            return Item.getItemFromBlock(InitBlocks.BlockLime);
        }
    };
}
