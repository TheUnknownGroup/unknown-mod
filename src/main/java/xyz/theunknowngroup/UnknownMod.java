package xyz.theunknowngroup;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.theunknowngroup.block.UnknownBlock;
import xyz.theunknowngroup.item.UnknownItem;

public class UnknownMod implements ModInitializer {
	public static final String MOD_ID = "unknown-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("The mod: {} has been initialized.", MOD_ID);
		UnknownItem.registerItems();
		UnknownItem.initialize();
		UnknownBlock.registerModBlocks();
		UnknownBlock.initialize();
    }
}
