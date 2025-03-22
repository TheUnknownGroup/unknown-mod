package xyz.theunknowngroup.item;

import xyz.theunknowngroup.UnknownMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.quiltmc.qsl.item.group.api.QuiltItemGroup;

public class UnknownGroup {
	public static final String MOD_ID = UnknownMod.MOD_ID;
	public static final ItemGroup UNKNOWN_GROUP = QuiltItemGroup.builder(
		new Identifier(MOD_ID, "unknown_group"))
		.icon(() -> new ItemStack(UnknownItem.UNKNOWN_ITEM))
		.appendItems(stacks ->
			Registry.ITEM.stream()
					.map(ItemStack::new)
					.forEach(stacks::add)
		).build();
}
