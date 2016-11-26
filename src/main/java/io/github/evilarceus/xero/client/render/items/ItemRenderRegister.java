package io.github.evilarceus.xero.client.render.items;

import io.github.evilarceus.xero.init.InitBlocks;
import io.github.evilarceus.xero.init.InitItems;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {

    public static void registerItemRenderer() {
        reg(InitItems.ItemTest);
    }

    public static void reg(Item item) {
        // Test Item
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
                new ModelResourceLocation(item.getUnlocalizedName().substring(5), "inventory"));
    }

}
