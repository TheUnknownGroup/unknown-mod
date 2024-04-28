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
    private static final ItemGroup BITCHES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NewTestingMod.MOD_ID, "bitches"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.bitches-mod.bitches"))
                    .icon(() -> new ItemStack(ModItems.BITCHES_ITEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BITCHES_ITEM);
                        entries.add(ModBlocks.BITCHES_BLOCK);
                    }).build());


    // BITCHES = FabricItemGroup.builder()
    //.displayName(Text.translatable("itemGroup.bitches-mod.bitches"))
    //.icon(() -> new ItemStack(ModItems.BITCHES_ITEM))
    //.entries((context, entries) -> {
    //entries.add(ModItems.BITCHES_ITEM);
    //entries.add(ModBlocks.BITCHES_BLOCK);
    //})
    //.build();

    public static void registerModItemGroup () {
        NewTestingMod.LOGGER.info("Registering Mod Item Group for: "+ NewTestingMod.MOD_ID);
    }
    public static void intialize () {
        NewTestingMod.LOGGER.info("Mod Item Group for: "+ NewTestingMod.MOD_ID +" has been initialized.");

        // Registry.register(Registries.ITEM_GROUP, new Identifier("test", "new-testing-group"), BITCHES);
    }
}
