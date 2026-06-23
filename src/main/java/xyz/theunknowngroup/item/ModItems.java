package xyz.theunknowngroup.item;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import xyz.theunknowngroup.UnknownMod;

import java.util.function.Function;

public class ModItems {
    public static String MOD_ID = UnknownMod.MOD_ID;
    public static String MOD_NAME = UnknownMod.MOD_NAME;
    public static final Item UNKNOWN_ITEM = registerItem("unknown_item",
            Item::new, new Item.Settings().maxCount(1));

    public static Item registerItem(String name, Function<Item.Settings, Item> fac, Item.Settings item) {
        final RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, name));
        return Items.register(key, fac, item);
    }

    public static void registerModItems() {
        UnknownMod.LOGGER.info("[{}] Registering mod items for {}", MOD_NAME, MOD_ID);
    }
    public static void initialize() {
        UnknownMod.LOGGER.info("[{}] Mod items for: {} have been initialized and registered.", MOD_NAME, MOD_ID);
    }
}
