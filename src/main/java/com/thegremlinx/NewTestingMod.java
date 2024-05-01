package com.thegremlinx;

import com.thegremlinx.block.ModBlocks;
import com.thegremlinx.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewTestingMod implements ModInitializer {
	public static final String MOD_ID = "unknown-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	
	//an instance of our new item
	
	@Override
	public void onInitialize() {
		LOGGER.info("The mod: "+ MOD_ID +" has been initialized.");
		ModItems.registerModItems();
		ModItems.initialize();
		ModBlocks.registerModBlocks();
		ModBlocks.initialize();
	}
}