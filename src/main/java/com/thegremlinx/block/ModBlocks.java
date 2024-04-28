package com.thegremlinx.block;

import com.thegremlinx.NewTestingMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BITCHES_BLOCK = registerBlock("bitches_block",
        new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NewTestingMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NewTestingMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        NewTestingMod.LOGGER.info("Registering Mod Blocks for "+NewTestingMod.MOD_ID);
    }
    public static void initialize() {
        NewTestingMod.LOGGER.info("Mod Blocks for: "+NewTestingMod.MOD_ID+" have been registered.");
    }
}
