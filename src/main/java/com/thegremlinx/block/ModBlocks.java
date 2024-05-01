package com.thegremlinx.block;

import com.thegremlinx.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import com.thegremlinx.NewTestingMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block UNKNOWN_BLOCK = registerBlock("unknown_block",
            new Block(FabricBlockSettings.of(Material.STONE)), ModItemGroup.UNKNOWN);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(NewTestingMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(NewTestingMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab).maxCount(64)));
    }

    public static void registerModBlocks() {
        NewTestingMod.LOGGER.info("Registering Mod Blocks for " + NewTestingMod.MOD_ID);
    }
    public static void initialize() {
        NewTestingMod.LOGGER.info("Mod Blocks for: "+NewTestingMod.MOD_ID+" have been registered.");
    }
}
