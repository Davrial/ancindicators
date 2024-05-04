package net.davrial.ancindicators.datagen;

import net.davrial.ancindicators.ANCIndicators;
import net.davrial.ancindicators.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ANCIndicators.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        /*
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.RAW_SAPPHIRE_BLOCK);

        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.END_STONE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.NETHER_SAPPHIRE_ORE);

        blockWithItem(ModBlocks.SOUND_BLOCK);

        stairsBlock(((StairBlock) ModBlocks.SAPPHIRE_STAIRS.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.SAPPHIRE_SLAB.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));

        buttonBlock(((ButtonBlock) ModBlocks.SAPPHIRE_BUTTON.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.SAPPHIRE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));

        fenceBlock(((FenceBlock) ModBlocks.SAPPHIRE_FENCE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.SAPPHIRE_FENCE_GATE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.SAPPHIRE_WALL.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.SAPPHIRE_DOOR.get()), modLoc("block/sapphire_door_bottom"), modLoc("block/sapphire_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.SAPPHIRE_TRAPDOOR.get()), modLoc("block/sapphire_trapdoor"), true, "cutout");
        */


        //FILL IN BLOCKS HERE
        //Main Blocks
        blockWithItem(ModBlocks.BLANK_INDICATOR_BLOCK);
        blockWithItem(ModBlocks.DARKENED_BLANK_INDICATOR_BLOCK);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_TEMPLATE_BLOCK);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_TEMPLATE_BLOCK);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_TEMPLATE_BLOCK);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK_DARKENED);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_TEMPLATE_BLOCK);
        blockWithItem(ModBlocks.BLANK_REDSTONE_INDICATOR_BLOCK);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_TEMPLATE_BLOCK);
        blockWithItem(ModBlocks.BLANK_LIGHT_LEVEL_INDICATOR_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.INDICATOR_STAIRS.get()), blockTexture(ModBlocks.BLANK_INDICATOR_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.INDICATOR_PRESSURE_PLATE.get()), blockTexture(ModBlocks.BLANK_INDICATOR_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.INDICATOR_DOOR.get()), modLoc("block/indicator_door_bottom"), modLoc("block/indicator_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.INDICATOR_TRAPDOOR.get()), modLoc("block/indicator_trapdoor"), true, "cutout");

        stairsBlock(((StairBlock) ModBlocks.DARKENED_INDICATOR_STAIRS.get()), blockTexture(ModBlocks.DARKENED_BLANK_INDICATOR_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.DARKENED_INDICATOR_PRESSURE_PLATE.get()), blockTexture(ModBlocks.DARKENED_BLANK_INDICATOR_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.DARKENED_INDICATOR_DOOR.get()), modLoc("block/darkened_indicator_door_bottom"), modLoc("block/darkened_indicator_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.DARKENED_INDICATOR_TRAPDOOR.get()), modLoc("block/darkened_indicator_trapdoor"), true, "cutout");




        //Alphabetic Blocks
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_A);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_B);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_C);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_D);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_E);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_F);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_G);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_H);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_I);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_J);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_K);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_L);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_M);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_N);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_O);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_P);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Q);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_R);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_S);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_T);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_U);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_V);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_W);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_X);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Y);
        blockWithItem(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Z);

        //Numeric Blocks
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_0);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_1);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_2);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_3);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_4);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_5);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_6);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_7);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_8);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_9);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_10);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_11);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_12);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_13);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_14);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_15);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_16);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_32);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_64);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_1000);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_EVEN);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_ODD);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_INFINITY);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_ADD);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_SUBTRACT);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_MULTIPLY);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_DIVIDE);
        blockWithItem(ModBlocks.NUMERIC_INDICATOR_BLOCK_EQUALS);

        //Block Color Blocks
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_WHITE);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_GRAY);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GRAY);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLACK);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BROWN);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_RED);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_ORANGE);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_YELLOW);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIME);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GREEN);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_CYAN);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_BLUE);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLUE);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PURPLE);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_MAGENTA);
        blockWithItem(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PINK);


        //Text Color Blocks
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_BLACK);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_BLUE);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_GREEN);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_AQUA);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_RED);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_PURPLE);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GOLD);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GRAY);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_GRAY);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_BLUE);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GREEN);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_AQUA);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_RED);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_LIGHT_PURPLE);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_YELLOW);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_WHITE);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MINECOIN_GOLD);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_QUARTZ);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_IRON);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_NETHERITE);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_REDSTONE);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_COPPER);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_GOLD);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_EMERALD);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_DIAMOND);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_LAPIS);
        blockWithItem(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_AMETHYST);

        //Redstone Blocks
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_0);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_1);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_2);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_3);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_4);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_5);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_6);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_7);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_8);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_9);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_10);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_11);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_12);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_13);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_14);
        blockWithItem(ModBlocks.REDSTONE_INDICATOR_BLOCK_15);

        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_0);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_1);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_2);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_3);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_4);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_5);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_6);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_7);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_8);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_9);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_10);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_11);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_12);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_13);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_14);
        blockWithItem(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_15);



    }





    /*NO CHANGES NEEDED PAST THIS LINE*/





    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}