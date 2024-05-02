package com.thegremlinx.item;

import com.thegremlinx.NewTestingMod;
import com.thegremlinx.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup {
    private static final ItemGroup UNKNOWN = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NewTestingMod.MOD_ID, "unknown"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.unknown-mod.unknown"))
                    .icon(() -> new ItemStack(ModItems.UNKNOWN_ITEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.UNKNOWN_ITEM);
                        entries.add(ModBlocks.UNKNOWN_BLOCK);
                    }).build());
    private static final ItemGroup UNKNOWN2 = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NewTestingMod.MOD_ID, "unknown2"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.unknown-mod.unknown2"))
                    .icon(() -> new ItemStack(ModItems.UNKNOWN_ITEM)).entries((displayContext, entries) -> {
                        entries.add(Items.NETHERITE_BLOCK);
                    }).build());
    public static void registerModItemGroup () {
        NewTestingMod.LOGGER.info("Registering Mod Item Group 1 for: "+ NewTestingMod.MOD_ID);
    }
    public static void intialize () {
        NewTestingMod.LOGGER.info("Mod Item Group for: "+ NewTestingMod.MOD_ID +" has been initialized.");
    }
}
