package xyz.theunknowngroup.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import xyz.theunknowngroup.UnknownMod;

public class ModItems {
    public static String MOD_ID = UnknownMod.MOD_ID;
    public static String MOD_NAME = UnknownMod.MOD_NAME;
    public static final Item UNKNOWN_ITEM = registerItem("unknown_item",
            new Item(new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems() {
        UnknownMod.LOGGER.info("[{}] Registering mod items for {}", MOD_NAME, MOD_ID);
    }
    public static void initialize() {
        UnknownMod.LOGGER.info("[{}] Mod items for: {} have been initialized and registered.", MOD_NAME, MOD_ID);
    }
}
