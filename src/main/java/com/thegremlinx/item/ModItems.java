package com.thegremlinx.item;

import com.thegremlinx.NewTestingMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BITCHES_ITEM = registerItem("bitches_item", 
            new Item(new FabricItemSettings().maxCount(1)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NewTestingMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        NewTestingMod.LOGGER.info("Registering mod items for " + NewTestingMod.MOD_ID);
    }
    public static void initialize() {
        NewTestingMod.LOGGER.info("Mod Items for: "+NewTestingMod.MOD_ID+" have been registered.");
    }
}
