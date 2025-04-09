package xyz.theunknowngroup;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnknownMod implements ModInitializer {
	public static final String MOD_ID = "unknown-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("The mod: {} has been initialized.", MOD_ID);
		Initial.initializeClasses();
	}
}