package xyz.theunknowngroup.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import xyz.theunknowngroup.UnknownMod;

public class ModItemGroup {
    public static String MOD_ID = UnknownMod.MOD_ID;
    public static final ItemGroup UNKNOWN = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "unknown"), () -> new ItemStack(ModItems.UNKNOWN_ITEM));
}
