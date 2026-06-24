package xyz.theunknowngroup.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import xyz.theunknowngroup.UnknownMod;

import java.util.function.Function;

public class ModItems {
    public static String MOD_ID = UnknownMod.MOD_ID;
    public static String MOD_NAME = UnknownMod.MOD_NAME;
    public static final Item UNKNOWN_ITEM = registerItem("unknown_item",
            Item::new, new Item.Properties().stacksTo(1));
    public static <T extends Item> T registerItem(String name, Function<Item.Properties, T> fac, Item.Properties item) {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name));
        T items = fac.apply(item.setId(key));
        Registry.register(BuiltInRegistries.ITEM, key, items);
        return items;
    }
    public static void registerModItems() {
        UnknownMod.LOGGER.info("[{}] Registering mod items for {}", MOD_NAME, MOD_ID);
    }
    public static void initialize() {
        UnknownMod.LOGGER.info("[{}] Mod items for: {} have been initialized and registered.", MOD_NAME, MOD_ID);
    }
}
