package com.thegremlinx.block;

import com.thegremlinx.NewTestingMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block UNKNOWN_BLOCK = registerBlock("unknown_block",
        new Block(Block.Settings.copy(Blocks.COAL_BLOCK)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NewTestingMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NewTestingMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void initialize() {
        NewTestingMod.LOGGER.info("Registering Mod Blocks for " + NewTestingMod.MOD_ID);
        NewTestingMod.LOGGER.info("Mod Blocks for: "+NewTestingMod.MOD_ID+" have been registered.");
    }
}
