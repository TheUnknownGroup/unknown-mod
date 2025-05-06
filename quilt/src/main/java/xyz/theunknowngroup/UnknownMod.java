package xyz.theunknowngroup;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnknownMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("unknown mod");

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Hello Quilt world from {}! Stay fresh!", mod.metadata().name());
    }
}