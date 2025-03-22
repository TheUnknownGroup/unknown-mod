package xyz.theunknowngroup.block;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import xyz.theunknowngroup.UnknownMod;
import xyz.theunknowngroup.item.UnknownGroup;

import static xyz.theunknowngroup.UnknownMod.MOD_ID;

public class UnknownBlock {
	public static final Block UNKNOWN_BLOCK = registerBlock("unknown_block",
		new Block(QuiltBlockSettings.of(Material.STONE)), UnknownGroup.UNKNOWN_GROUP);

	private static Block registerBlock(String name, Block block, ItemGroup tab) {
		registerBlockItem(name, block, tab);
		return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), UNKNOWN_BLOCK);
	}

	private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
		return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
			new BlockItem(block,
				new QuiltItemSettings().group(tab).maxCount(64)));
	}

	public static void registerModBlocks() {
		UnknownMod.LOGGER.info("Registering mod blocks for {}.", MOD_ID);
	}

	public static void initialize() {
		UnknownMod.LOGGER.info("Mod blocks for: {} have been initialized and registered.", MOD_ID);
	}
}
