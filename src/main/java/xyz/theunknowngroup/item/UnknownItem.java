package xyz.theunknowngroup.item;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import xyz.theunknowngroup.UnknownMod;

import static xyz.theunknowngroup.item.UnknownGroup.MOD_ID;
import static xyz.theunknowngroup.item.UnknownGroup.UNKNOWN_GROUP;

public class UnknownItem {
	public static final Item UNKNOWN_ITEM = new Item(new QuiltItemSettings().maxCount(1).group(UNKNOWN_GROUP));

	public static void register() {
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "unknown_item"), UNKNOWN_ITEM);
	}

	public static void registerItems() {
		UnknownMod.LOGGER.info("Registering mod items for {}", MOD_ID);
	}
	public static void initialize() {
		UnknownMod.LOGGER.info("Mod items for: {} have been initialized and registered.", MOD_ID);
	}
}
