package net.davrial.ancindicators.block;

import net.davrial.ancindicators.ANCIndicators;
import net.davrial.ancindicators.block.custom.SoundBlock;
import net.davrial.ancindicators.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ANCIndicators.MOD_ID);

    //Basic Block Examples
    /*
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RAW_SAPPHIRE_BLOCK = registerBlock("raw_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> NETHER_SAPPHIRE_ORE = registerBlock("nether_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> END_STONE_SAPPHIRE_ORE = registerBlock("end_stone_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block",
            () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> SAPPHIRE_STAIRS = registerBlock("sapphire_stairs",
            () -> new StairBlock(() -> ModBlocks.SAPPHIRE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SAPPHIRE_SLAB = registerBlock("sapphire_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> SAPPHIRE_BUTTON = registerBlock("sapphire_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.AMETHYST),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> SAPPHIRE_PRESSURE_PLATE = registerBlock("sapphire_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST),
                    BlockSetType.IRON));

    public static final RegistryObject<Block> SAPPHIRE_FENCE = registerBlock("sapphire_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SAPPHIRE_FENCE_GATE = registerBlock("sapphire_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
    public static final RegistryObject<Block> SAPPHIRE_WALL = registerBlock("sapphire_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> SAPPHIRE_DOOR = registerBlock("sapphire_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));
    public static final RegistryObject<Block> SAPPHIRE_TRAPDOOR = registerBlock("sapphire_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));
    */


    //FILL IN BLOCKS HERE

    //BLOCK TEMPLATE
    //public static final RegistryObject<Block> BLOCK_NAME_HERE  = registerBlock("block_name_here",
    //            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EXISTING_BLOCK).sound(SoundType.EXISTING_BLOCK)));

    //My Blocks
    //Main Blocks
    public static final RegistryObject<Block> BLANK_INDICATOR_BLOCK  = registerBlock("blank_indicator_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> DARKENED_BLANK_INDICATOR_BLOCK  = registerBlock("darkened_blank_indicator_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_TEMPLATE_BLOCK  = registerBlock("alphabetic_indicator_template_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_TEMPLATE_BLOCK  = registerBlock("numeric_indicator_template_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_TEMPLATE_BLOCK  = registerBlock("block_color_indicator_template_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK  = registerBlock("text_color_indicator_template_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK_DARKENED  = registerBlock("text_color_indicator_template_block_darkened",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));

    //Alphabetic Blocks
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_A  = registerBlock("alphabetic_indicator_block_a",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_B  = registerBlock("alphabetic_indicator_block_b",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_C  = registerBlock("alphabetic_indicator_block_c",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_D  = registerBlock("alphabetic_indicator_block_d",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_E  = registerBlock("alphabetic_indicator_block_e",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_F  = registerBlock("alphabetic_indicator_block_f",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_G  = registerBlock("alphabetic_indicator_block_g",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_H  = registerBlock("alphabetic_indicator_block_h",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_I  = registerBlock("alphabetic_indicator_block_i",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_J  = registerBlock("alphabetic_indicator_block_j",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_K  = registerBlock("alphabetic_indicator_block_k",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_L  = registerBlock("alphabetic_indicator_block_l",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_M  = registerBlock("alphabetic_indicator_block_m",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_N  = registerBlock("alphabetic_indicator_block_n",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_O  = registerBlock("alphabetic_indicator_block_o",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_P  = registerBlock("alphabetic_indicator_block_p",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_Q  = registerBlock("alphabetic_indicator_block_q",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_R  = registerBlock("alphabetic_indicator_block_r",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_S  = registerBlock("alphabetic_indicator_block_s",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_T  = registerBlock("alphabetic_indicator_block_t",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_U  = registerBlock("alphabetic_indicator_block_u",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_V  = registerBlock("alphabetic_indicator_block_v",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_W  = registerBlock("alphabetic_indicator_block_w",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_X  = registerBlock("alphabetic_indicator_block_x",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_Y  = registerBlock("alphabetic_indicator_block_y",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_Z  = registerBlock("alphabetic_indicator_block_z",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));

    //Numeric Blocks
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_0  = registerBlock("numeric_indicator_block_0",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_1  = registerBlock("numeric_indicator_block_1",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_2  = registerBlock("numeric_indicator_block_2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_3  = registerBlock("numeric_indicator_block_3",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_4  = registerBlock("numeric_indicator_block_4",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_5  = registerBlock("numeric_indicator_block_5",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_6  = registerBlock("numeric_indicator_block_6",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_7  = registerBlock("numeric_indicator_block_7",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_8  = registerBlock("numeric_indicator_block_8",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_9  = registerBlock("numeric_indicator_block_9",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_10  = registerBlock("numeric_indicator_block_10",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_11  = registerBlock("numeric_indicator_block_11",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_12  = registerBlock("numeric_indicator_block_12",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_13  = registerBlock("numeric_indicator_block_13",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_14  = registerBlock("numeric_indicator_block_14",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_15  = registerBlock("numeric_indicator_block_15",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_16  = registerBlock("numeric_indicator_block_16",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_32  = registerBlock("numeric_indicator_block_32",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_64  = registerBlock("numeric_indicator_block_64",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_1000  = registerBlock("numeric_indicator_block_1000",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_EVEN  = registerBlock("numeric_indicator_block_even",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_ODD  = registerBlock("numeric_indicator_block_odd",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_INFINITY  = registerBlock("numeric_indicator_block_infinity",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_ADD  = registerBlock("numeric_indicator_block_add",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_SUBTRACT  = registerBlock("numeric_indicator_block_subtract",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_MULTIPLY  = registerBlock("numeric_indicator_block_multiply",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_DIVIDE  = registerBlock("numeric_indicator_block_divide",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_EQUALS  = registerBlock("numeric_indicator_block_equals",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));

    //Block Color Blocks
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_WHITE  = registerBlock("block_color_indicator_block_white",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_GRAY  = registerBlock("block_color_indicator_block_light_gray",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_GRAY  = registerBlock("block_color_indicator_block_gray",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_BLACK  = registerBlock("block_color_indicator_block_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_BROWN  = registerBlock("block_color_indicator_block_brown",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_RED  = registerBlock("block_color_indicator_block_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_ORANGE  = registerBlock("block_color_indicator_block_orange",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_YELLOW  = registerBlock("block_color_indicator_block_yellow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_LIME  = registerBlock("block_color_indicator_block_lime",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_GREEN  = registerBlock("block_color_indicator_block_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_CYAN  = registerBlock("block_color_indicator_block_cyan",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_BLUE  = registerBlock("block_color_indicator_block_light_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_BLUE  = registerBlock("block_color_indicator_block_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_PURPLE  = registerBlock("block_color_indicator_block_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_MAGENTA  = registerBlock("block_color_indicator_block_magenta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_PINK  = registerBlock("block_color_indicator_block_pink",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));


    //Text Color Blocks
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_BLACK  = registerBlock("text_color_indicator_block_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_DARK_BLUE  = registerBlock("text_color_indicator_block_dark_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_DARK_GREEN  = registerBlock("text_color_indicator_block_dark_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_DARK_AQUA  = registerBlock("text_color_indicator_block_dark_aqua",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_DARK_RED  = registerBlock("text_color_indicator_block_dark_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_DARK_PURPLE  = registerBlock("text_color_indicator_block_dark_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_GOLD  = registerBlock("text_color_indicator_block_gold",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_GRAY  = registerBlock("text_color_indicator_block_gray",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_DARK_GRAY  = registerBlock("text_color_indicator_block_dark_gray",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_BLUE  = registerBlock("text_color_indicator_block_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_GREEN  = registerBlock("text_color_indicator_block_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_AQUA  = registerBlock("text_color_indicator_block_aqua",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_RED  = registerBlock("text_color_indicator_block_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_LIGHT_PURPLE  = registerBlock("text_color_indicator_block_light_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_YELLOW  = registerBlock("text_color_indicator_block_yellow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_WHITE  = registerBlock("text_color_indicator_block_white",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MINECOIN_GOLD  = registerBlock("text_color_indicator_block_minecoin_gold",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_QUARTZ  = registerBlock("text_color_indicator_block_material_quartz",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_IRON  = registerBlock("text_color_indicator_block_material_iron",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_NETHERITE  = registerBlock("text_color_indicator_block_material_netherite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_REDSTONE  = registerBlock("text_color_indicator_block_material_redstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_COPPER  = registerBlock("text_color_indicator_block_material_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_GOLD  = registerBlock("text_color_indicator_block_material_gold",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_EMERALD  = registerBlock("text_color_indicator_block_material_emerald",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_DIAMOND  = registerBlock("text_color_indicator_block_material_diamond",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_LAPIS  = registerBlock("text_color_indicator_block_material_lapis",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_AMETHYST  = registerBlock("text_color_indicator_block_material_amethyst",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));








    /*NO CHANGES NEEDED PAST THIS LINE*/





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
