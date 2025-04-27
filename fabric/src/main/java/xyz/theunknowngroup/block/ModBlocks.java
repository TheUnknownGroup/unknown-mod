package xyz.theunknowngroup.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import xyz.theunknowngroup.UnknownMod;

public class ModBlocks {
    public static String MOD_ID = UnknownMod.MOD_ID;
    public static String MOD_NAME = UnknownMod.MOD_NAME;
    public static final Block UNKNOWN_BLOCK = registerBlock("unknown_block",
            new Block(Block.Settings.copy(Blocks.STONE)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new Item.Settings().maxCount(64)));
    }

    public static void registerModBlocks() {
        UnknownMod.LOGGER.info("[{}] Registering mod blocks for {}", MOD_NAME, MOD_ID);
    }
    public static void initialize() {
        UnknownMod.LOGGER.info("[{}] Mod blocks for: {} have been initialized and registered.", MOD_NAME, MOD_ID);
    }
}
