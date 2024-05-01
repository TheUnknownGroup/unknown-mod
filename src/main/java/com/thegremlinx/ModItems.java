package com.thegremlinx;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.util.registry.Registry.ITEM;

public class ModItems {
    public static final Logger LOGGER = LoggerFactory.getLogger("unknown-mod");

    public static final <T extends Item> T register(T item, String ID) {

        Identifier itemID = new Identifier("unknown-mod", ID);

        T registeredItem = Registry.register(ITEM, itemID, item);

        return registeredItem;
    }
    public static final Item Unknown = Registry.register(ITEM, new Identifier("test",
            "unknown"), new Item(new FabricItemSettings().maxCount(1).group(ItemGroup.MISC)));
    public static final Block Unknown_Block = new Block(Block.Settings.of(Material.STONE));

    public static void initialize() {
        Registry.register(Registry.BLOCK, new Identifier("test", "unknown_block"), Unknown_Block);
		Registry.register(Registry.ITEM, new Identifier("test", "unknown_block"),
				new BlockItem(Unknown_Block, new Item.Settings().maxCount(64).group(ItemGroup.MISC)));
        LOGGER.info("Mod items for: " + NewTestingMod.MOD_ID +" have been initialized.");
    }


}
