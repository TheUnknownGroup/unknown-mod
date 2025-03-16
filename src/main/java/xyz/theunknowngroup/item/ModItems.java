package xyz.theunknowngroup.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.theunknowngroup.UnknownMod;

public class ModItems {
    public static String MOD_ID = UnknownMod.MOD_ID;

    public static final Item UNKNOWN_ITEM = registerItem("unknown_item",
            new Item(new FabricItemSettings().group(ModItemGroup.UNKNOWN).maxCount(1)));

    private static Item registerItem( String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems() {
        UnknownMod.LOGGER.info("Registering mod items for {}", MOD_ID);
    }
    public static void initialize() {
        UnknownMod.LOGGER.info("Mod items for: {} have been initialized and registered.", MOD_ID);
    }
}
