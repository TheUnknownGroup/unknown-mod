package xyz.theunknowngroup.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import xyz.theunknowngroup.UnknownMod;
import xyz.theunknowngroup.block.ModBlocks;

import static xyz.theunknowngroup.UnknownMod.LOGGER;

public class ModItemGroup {
    public static String MOD_ID = UnknownMod.MOD_ID;
    public static String MOD_NAME = UnknownMod.MOD_NAME;

    public static final CreativeModeTab UNKNOWN = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.UNKNOWN_ITEM))
            .title(Component.translatable("itemGroup.unknown-mod.unknown"))
            .displayItems((par, out) -> {
                out.accept(ModItems.UNKNOWN_ITEM);
                out.accept(ModBlocks.UNKNOWN_BLOCK);
            })
            .build();
    public static final ResourceKey<CreativeModeTab> tabKey = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(MOD_ID, "unknown")
    );

    public static void registerModTab() {
        LOGGER.info("[{}] Registering item group for {}", MOD_NAME, MOD_ID);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, tabKey, UNKNOWN);
    }
    public static void initialize() {
        LOGGER.info("[{}] Item group for mod: {} has been registered & initialized.", MOD_NAME, MOD_ID);
    }
}
