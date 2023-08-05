package com.thegremlinx;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewTestingMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("bitches-mod");
	
	//an instance of our new item
	
	@Override
	public void onInitialize() {
		LOGGER.info("The mod: bitches-mod has been initialized.");
		ModItems.initialize();
	}
}