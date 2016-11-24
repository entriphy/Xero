package io.github.evilarceus.xero.client.render.items;

import io.github.evilarceus.xero.common.item.ItemTest;
import io.github.evilarceus.xero.common.item.ItemWrapper;
import io.github.evilarceus.xero.common.reference.Reference;
import io.github.evilarceus.xero.init.InitItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by evila on 11/23/2016.
 */
public class ItemRenderRegister {

    public static void registerItemRenderer() {
        reg(InitItems.ItemTest);
    }


    public static void reg(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(InitItems.ItemTest, 0,
                new ModelResourceLocation(item.getUnlocalizedName().substring(5), "inventory"));
        System.out.println(Reference.MODID + ":" + item.getUnlocalizedName().substring(5));
    }
}
