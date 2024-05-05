package com.thegremlinx.item;

import com.thegremlinx.NewTestingMod;
import com.thegremlinx.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup {
    private static final ItemGroup UNKNOWN = Registry.register(Registries.ITEM_GROUP,
                new Identifier(NewTestingMod.MOD_ID, "unknown"),
                FabricItemGroup.builder()
                        .displayName(Text.translatable("itemGroup.unknown-mod.unknown"))
                        .icon(() -> new ItemStack(ModItems.UNKNOWN_ITEM)).entries((context, entries) -> {
                            entries.add(ModItems.UNKNOWN_ITEM);
                            entries.add(ModBlocks.UNKNOWN_BLOCK);
                })
                .build());
    public static void intialize() {
        NewTestingMod.LOGGER.info("Registering Mod Item Group for: "+ NewTestingMod.MOD_ID);
        NewTestingMod.LOGGER.info("Mod Item Group for: "+ NewTestingMod.MOD_ID +" has been initialized.");
    }
}
