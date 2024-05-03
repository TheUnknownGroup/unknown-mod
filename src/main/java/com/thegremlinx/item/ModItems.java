package com.thegremlinx.item;

import com.thegremlinx.NewTestingMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    public static final Item UNKNOWN_ITEM = registerItem("unknown_item",
            new Item(new FabricItemSettings().group(ModItemGroup.UNKNOWN).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(NewTestingMod.MOD_ID, name), item);
    }
    public static void initialize() {
        NewTestingMod.LOGGER.info("Mod Items for: "+NewTestingMod.MOD_ID+" have been registered.");
        NewTestingMod.LOGGER.info("Registering mod items for " + NewTestingMod.MOD_ID);
    }


}
