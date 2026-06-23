package xyz.theunknowngroup.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import xyz.theunknowngroup.UnknownMod;

import java.util.function.Function;

public class ModBlocks {
    public static String MOD_ID = UnknownMod.MOD_ID;
    public static String MOD_NAME = UnknownMod.MOD_NAME;
    public static final Block UNKNOWN_BLOCK = registerBlock("unknown_block",
            Block::new, Block.Settings.copy(Blocks.STONE));
    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> fac, AbstractBlock.Settings block) {
        final Identifier id = Identifier.of(MOD_ID, name);
        final RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);
        final Block blocks = Blocks.register(key, fac, block);
        Items.register(blocks);
        return blocks;
    }
    public static void registerModBlocks() {
        UnknownMod.LOGGER.info("[{}] Registering mod blocks for {}", MOD_NAME, MOD_ID);
    }
    public static void initialize() {
        UnknownMod.LOGGER.info("[{}] Mod blocks for: {} have been initialized and registered.", MOD_NAME, MOD_ID);
    }
}
