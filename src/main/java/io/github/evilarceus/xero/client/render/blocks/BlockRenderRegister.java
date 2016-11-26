package io.github.evilarceus.xero.client.render.blocks;

import io.github.evilarceus.xero.common.reference.Reference;
import io.github.evilarceus.xero.init.InitBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {

    public static void registerBlockRenderer()
    {
        reg(InitBlocks.BlockTest);
    }

    public static void reg(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation(block.getUnlocalizedName().substring(5), "inventory"));
    }
}
