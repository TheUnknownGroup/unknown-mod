package xyz.theunknowngroup.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import xyz.theunknowngroup.UnknownMod;

import java.util.function.Function;

public class ModBlocks {
    public static String MOD_ID = UnknownMod.MOD_ID;
    public static String MOD_NAME = UnknownMod.MOD_NAME;

    public static final Block UNKNOWN_BLOCK = registerBlock("unknown_block",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE));

    private static <T extends Block> T registerBlock(String name, Function<BlockBehaviour.Properties, T> fac, BlockBehaviour.Properties block) {
        // If you need to make a non-itemized block register, go back to the fabric docs
        ResourceKey<Block> key1 = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name));
        ResourceKey<Item> key2 = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name));

        T blocks = fac.apply(block.setId(key1));
        BlockItem blockItem = new BlockItem(blocks, new Item.Properties().setId(key2).useBlockDescriptionPrefix().stacksTo(64));

        Registry.register(BuiltInRegistries.ITEM, key2, blockItem);
        return Registry.register(BuiltInRegistries.BLOCK, key1, blocks);
    }
    public static void registerModBlocks() {
        UnknownMod.LOGGER.info("[{}] Registering mod blocks for {}", MOD_NAME, MOD_ID);
    }
    public static void initialize() {
        UnknownMod.LOGGER.info("[{}] Mod blocks for: {} have been initialized and registered.", MOD_NAME, MOD_ID);
    }
}
