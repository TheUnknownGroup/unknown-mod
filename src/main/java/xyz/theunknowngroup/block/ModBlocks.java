package xyz.theunknowngroup.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.theunknowngroup.UnknownMod;
import xyz.theunknowngroup.item.ModItemGroup;

public class ModBlocks {
    public static String MOD_ID = UnknownMod.MOD_ID;
    public static final Block UNKNOWN_BLOCK = registerBlock("unknown_block",
            new Block(FabricBlockSettings.of(Material.STONE)), ModItemGroup.UNKNOWN);
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab).maxCount(64)));
    }

    public static void registerModBlocks() {
        UnknownMod.LOGGER.info("Registering mod blocks for {}", MOD_ID);
    }
    public static void initialize() {
        UnknownMod.LOGGER.info("Mod blocks for: {} have been initialized and registered.", MOD_ID);
    }
}
