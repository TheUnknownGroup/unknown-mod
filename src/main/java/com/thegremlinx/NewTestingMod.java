package com.thegremlinx;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewTestingMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("new-javamod");
	
	//an instance of our new item
	public static final Item Bitches = Registry.register(Registry.ITEM, new Identifier("test",
					"bitches"), new Item(new FabricItemSettings().maxCount(1)));

	public static final Block Bitches_Block = new Block(Block.Settings.of(Material.STONE).strength(1.5f, 6.0f));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution
		Registry.register(Registry.BLOCK, new Identifier("test", "bitches_block"), Bitches_Block);
		Registry.register(Registry.ITEM, new Identifier("test", "bitches_block"),
			new BlockItem(Bitches_Block, new FabricItemSettings().maxCount(64)));
		LOGGER.info("The mod: bitches-mod has been initialized.");
	}

}
