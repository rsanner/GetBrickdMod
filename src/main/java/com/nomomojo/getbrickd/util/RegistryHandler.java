package com.nomomojo.getbrickd.util;

import com.nomomojo.getbrickd.GetBrickd;
import com.nomomojo.getbrickd.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GetBrickd.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GetBrickd.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Blocks
    public static final RegistryObject<Block> SANDSTONE_BRICK_BLOCK = BLOCKS.register("sandstone_brick", SandstoneBrickBlock::new);
    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_BLOCK = BLOCKS.register("red_sandstone_brick", RedSandstoneBrickBlock::new);
    public static final RegistryObject<Block> COBBLESTONE_BRICK_BLOCK = BLOCKS.register("cobblestone_brick", CobblestoneBrickBlock::new);
    public static final RegistryObject<Block> WHITE_SIDING_BLOCK = BLOCKS.register("white_siding", WhiteSidingBlock::new);
    public static final RegistryObject<Block> RED_SIDING_BLOCK = BLOCKS.register("red_siding", RedSidingBlock::new);
    public static final RegistryObject<Block> ORANGE_SIDING_BLOCK = BLOCKS.register("orange_siding", OrangeSidingBlock::new);
    public static final RegistryObject<Block> YELLOW_SIDING_BLOCK = BLOCKS.register("yellow_siding", YellowSidingBlock::new);
    public static final RegistryObject<Block> GREEN_SIDING_BLOCK = BLOCKS.register("green_siding", GreenSidingBlock::new);
    public static final RegistryObject<Block> BLUE_SIDING_BLOCK = BLOCKS.register("blue_siding", BlueSidingBlock::new);


    //Block Items
    public static final RegistryObject<Item> SANDSTONE_BRICK_BLOCK_ITEM = ITEMS.register("sandstone_brick"
            ,() -> new BlockItemBase(SANDSTONE_BRICK_BLOCK.get()));
    public static final RegistryObject<Item> RED_SANDSTONE_BRICK_BLOCK_ITEM = ITEMS.register("red_sandstone_brick"
            ,() -> new BlockItemBase(RED_SANDSTONE_BRICK_BLOCK.get()));
    public static final RegistryObject<Item> COBBLESTONE_BRICK_BLOCK_ITEM = ITEMS.register("cobblestone_brick"
            ,() -> new BlockItemBase(COBBLESTONE_BRICK_BLOCK.get()));
    public static final RegistryObject<Item> WHITE_SIDING_BLOCK_ITEM = ITEMS.register("white_siding"
            ,() -> new BlockItemBase(WHITE_SIDING_BLOCK.get()));
    public static final RegistryObject<Item> RED_SIDING_BLOCK_ITEM = ITEMS.register("red_siding"
            ,() -> new BlockItemBase(RED_SIDING_BLOCK.get()));
    public static final RegistryObject<Item> ORANGE_SIDING_BLOCK_ITEM = ITEMS.register("orange_siding"
            ,() -> new BlockItemBase(ORANGE_SIDING_BLOCK.get()));
    public static final RegistryObject<Item> YELLOW_SIDING_BLOCK_ITEM = ITEMS.register("yellow_siding"
            ,() -> new BlockItemBase(YELLOW_SIDING_BLOCK.get()));
    public static final RegistryObject<Item> GREEN_SIDING_BLOCK_ITEM = ITEMS.register("green_siding"
            ,() -> new BlockItemBase(GREEN_SIDING_BLOCK.get()));
    public static final RegistryObject<Item> BLUE_SIDING_BLOCK_ITEM = ITEMS.register("blue_siding"
            ,() -> new BlockItemBase(BLUE_SIDING_BLOCK.get()));
}
