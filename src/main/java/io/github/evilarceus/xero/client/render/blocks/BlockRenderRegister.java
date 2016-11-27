package io.github.evilarceus.xero.client.render.blocks;

import io.github.evilarceus.xero.init.InitBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {

    public static void registerBlockRenderer()
    {
        reg(InitBlocks.BlockTest);

        reg(InitBlocks.BlockWhite);
        reg(InitBlocks.BlockOrange);
        reg(InitBlocks.BlockMagenta);
        reg(InitBlocks.BlockLightBlue);
        reg(InitBlocks.BlockYellow);
        reg(InitBlocks.BlockLime);
        reg(InitBlocks.BlockPink);
        reg(InitBlocks.BlockGray);
        reg(InitBlocks.BlockLightGray);
        reg(InitBlocks.BlockCyan);
        reg(InitBlocks.BlockPurple);
        reg(InitBlocks.BlockBlue);
        reg(InitBlocks.BlockBrown);
        reg(InitBlocks.BlockGreen);
        reg(InitBlocks.BlockRed);
        reg(InitBlocks.BlockBlack);
    }

    public static void reg(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation(block.getUnlocalizedName().substring(5), "inventory"));
    }
}
