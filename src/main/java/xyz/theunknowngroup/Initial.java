package xyz.theunknowngroup;

import xyz.theunknowngroup.block.ModBlocks;
//import xyz.theunknowngroup.command.AddBlocksCommand;
import xyz.theunknowngroup.item.ModItemGroup;
import xyz.theunknowngroup.item.ModItems;

public class Initial {
    public static void initializeClasses(){
        ModItems.registerModItems();
        ModItems.initialize();
        ModBlocks.registerModBlocks();
        ModBlocks.initialize();
//        AddBlocksCommand.register();
//        AddBlocksCommand.initialize();
        ModItemGroup.initialize();
    }
}
