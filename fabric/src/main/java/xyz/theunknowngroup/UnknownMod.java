package xyz.theunknowngroup;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnknownMod implements ModInitializer {
	public static final String MOD_ID = "unknown-mod";
	public static final String MOD_NAME = "Unknown Mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("[{}] {} has been initialized.", MOD_NAME, MOD_NAME);
        Initial.initializeClasses();
    }
}