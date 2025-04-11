package xyz.theunknowngroup.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import xyz.theunknowngroup.UnknownMod;
import xyz.theunknowngroup.block.ModBlocks;

import static xyz.theunknowngroup.UnknownMod.LOGGER;

public class ModItemGroup {
    public static String MOD_ID = UnknownMod.MOD_ID;
    public static String MOD_NAME = UnknownMod.MOD_NAME;
    public static final ItemGroup UNKNOWN = register("unknown");
    private static ItemGroup register(String path) {
        return FabricItemGroup.builder(new Identifier(MOD_ID, path))
                .icon(() -> new ItemStack(ModItems.UNKNOWN_ITEM))
                .entries((enabledFeatures, entries) -> {
                    entries.add(ModItems.UNKNOWN_ITEM);
                    entries.add(ModBlocks.UNKNOWN_BLOCK);
                })
                .build();
    }
    public static void initialize() {
        LOGGER.info("[{}] Registering item group for {}", MOD_NAME, MOD_ID);
        LOGGER.info("[{}] Item group for mod: {} has been registered & initialized.", MOD_NAME, MOD_ID);
    }
}
