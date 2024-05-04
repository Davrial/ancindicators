package net.davrial.ancindicators.block;

import net.davrial.ancindicators.ANCIndicators;
import net.davrial.ancindicators.block.custom.*;
import net.davrial.ancindicators.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

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
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> DARKENED_BLANK_INDICATOR_BLOCK  = registerBlock("darkened_blank_indicator_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_TEMPLATE_BLOCK  = registerBlock("alphabetic_indicator_template_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_TEMPLATE_BLOCK  = registerBlock("numeric_indicator_template_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_TEMPLATE_BLOCK  = registerBlock("block_color_indicator_template_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK  = registerBlock("text_color_indicator_template_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK_DARKENED  = registerBlock("text_color_indicator_template_block_darkened",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_TEMPLATE_BLOCK  = registerBlock("redstone_indicator_template_block",
            () -> new RedstoneIndicatorBlock15(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> BLANK_REDSTONE_INDICATOR_BLOCK  = registerBlock("blank_redstone_indicator_block",
            () -> new RedstoneIndicatorBlock15(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_TEMPLATE_BLOCK  = registerBlock("light_level_indicator_template_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 15).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> BLANK_LIGHT_LEVEL_INDICATOR_BLOCK  = registerBlock("blank_light_level_indicator_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 15).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));


    //Alphabetic Blocks
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_A  = registerBlock("alphabetic_indicator_block_a",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_B  = registerBlock("alphabetic_indicator_block_b",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_C  = registerBlock("alphabetic_indicator_block_c",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_D  = registerBlock("alphabetic_indicator_block_d",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_E  = registerBlock("alphabetic_indicator_block_e",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_F  = registerBlock("alphabetic_indicator_block_f",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_G  = registerBlock("alphabetic_indicator_block_g",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_H  = registerBlock("alphabetic_indicator_block_h",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_I  = registerBlock("alphabetic_indicator_block_i",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_J  = registerBlock("alphabetic_indicator_block_j",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_K  = registerBlock("alphabetic_indicator_block_k",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_L  = registerBlock("alphabetic_indicator_block_l",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_M  = registerBlock("alphabetic_indicator_block_m",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_N  = registerBlock("alphabetic_indicator_block_n",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_O  = registerBlock("alphabetic_indicator_block_o",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_P  = registerBlock("alphabetic_indicator_block_p",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_Q  = registerBlock("alphabetic_indicator_block_q",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_R  = registerBlock("alphabetic_indicator_block_r",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_S  = registerBlock("alphabetic_indicator_block_s",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_T  = registerBlock("alphabetic_indicator_block_t",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_U  = registerBlock("alphabetic_indicator_block_u",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_V  = registerBlock("alphabetic_indicator_block_v",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_W  = registerBlock("alphabetic_indicator_block_w",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_X  = registerBlock("alphabetic_indicator_block_x",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_Y  = registerBlock("alphabetic_indicator_block_y",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> ALPHABETIC_INDICATOR_BLOCK_Z  = registerBlock("alphabetic_indicator_block_z",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));

    //Numeric Blocks
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_0  = registerBlock("numeric_indicator_block_0",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_1  = registerBlock("numeric_indicator_block_1",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_2  = registerBlock("numeric_indicator_block_2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_3  = registerBlock("numeric_indicator_block_3",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_4  = registerBlock("numeric_indicator_block_4",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_5  = registerBlock("numeric_indicator_block_5",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_6  = registerBlock("numeric_indicator_block_6",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_7  = registerBlock("numeric_indicator_block_7",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_8  = registerBlock("numeric_indicator_block_8",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_9  = registerBlock("numeric_indicator_block_9",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_10  = registerBlock("numeric_indicator_block_10",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_11  = registerBlock("numeric_indicator_block_11",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_12  = registerBlock("numeric_indicator_block_12",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_13  = registerBlock("numeric_indicator_block_13",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_14  = registerBlock("numeric_indicator_block_14",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_15  = registerBlock("numeric_indicator_block_15",
            () -> new WeakRedstoneIndicatorBlock15(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_16  = registerBlock("numeric_indicator_block_16",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_32  = registerBlock("numeric_indicator_block_32",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_64  = registerBlock("numeric_indicator_block_64",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_1000  = registerBlock("numeric_indicator_block_1000",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_EVEN  = registerBlock("numeric_indicator_block_even",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_ODD  = registerBlock("numeric_indicator_block_odd",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_INFINITY  = registerBlock("numeric_indicator_block_infinity",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_ADD  = registerBlock("numeric_indicator_block_add",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_SUBTRACT  = registerBlock("numeric_indicator_block_subtract",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_MULTIPLY  = registerBlock("numeric_indicator_block_multiply",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_DIVIDE  = registerBlock("numeric_indicator_block_divide",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> NUMERIC_INDICATOR_BLOCK_EQUALS  = registerBlock("numeric_indicator_block_equals",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));

    //Block Color Blocks
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_WHITE  = registerBlock("block_color_indicator_block_white",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_GRAY  = registerBlock("block_color_indicator_block_light_gray",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.LIGHT_GRAY)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_GRAY  = registerBlock("block_color_indicator_block_gray",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.GRAY)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_BLACK  = registerBlock("block_color_indicator_block_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_BROWN  = registerBlock("block_color_indicator_block_brown",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_RED  = registerBlock("block_color_indicator_block_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_ORANGE  = registerBlock("block_color_indicator_block_orange",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.ORANGE)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_YELLOW  = registerBlock("block_color_indicator_block_yellow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_LIME  = registerBlock("block_color_indicator_block_lime",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_GREEN  = registerBlock("block_color_indicator_block_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_CYAN  = registerBlock("block_color_indicator_block_cyan",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.CYAN)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_BLUE  = registerBlock("block_color_indicator_block_light_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_BLUE  = registerBlock("block_color_indicator_block_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_PURPLE  = registerBlock("block_color_indicator_block_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.PURPLE)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_MAGENTA  = registerBlock("block_color_indicator_block_magenta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.MAGENTA)));
    public static final RegistryObject<Block> BLOCK_COLOR_INDICATOR_BLOCK_PINK  = registerBlock("block_color_indicator_block_pink",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(DyeColor.PINK)));


    //Text Color Blocks
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_BLACK  = registerBlock("text_color_indicator_block_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_BLACK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_DARK_BLUE  = registerBlock("text_color_indicator_block_dark_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_DARK_GREEN  = registerBlock("text_color_indicator_block_dark_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_GREEN)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_DARK_AQUA  = registerBlock("text_color_indicator_block_dark_aqua",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_DARK_RED  = registerBlock("text_color_indicator_block_dark_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_DARK_PURPLE  = registerBlock("text_color_indicator_block_dark_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_GOLD  = registerBlock("text_color_indicator_block_gold",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_GRAY  = registerBlock("text_color_indicator_block_gray",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_DARK_GRAY  = registerBlock("text_color_indicator_block_dark_gray",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_GRAY)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_BLUE  = registerBlock("text_color_indicator_block_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_GREEN  = registerBlock("text_color_indicator_block_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_AQUA  = registerBlock("text_color_indicator_block_aqua",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_RED  = registerBlock("text_color_indicator_block_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.CRIMSON_NYLIUM)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_LIGHT_PURPLE  = registerBlock("text_color_indicator_block_light_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_YELLOW  = registerBlock("text_color_indicator_block_yellow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_WHITE  = registerBlock("text_color_indicator_block_white",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MINECOIN_GOLD  = registerBlock("text_color_indicator_block_minecoin_gold",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.GOLD)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_QUARTZ  = registerBlock("text_color_indicator_block_material_quartz",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_IRON  = registerBlock("text_color_indicator_block_material_iron",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.METAL)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_NETHERITE  = registerBlock("text_color_indicator_block_material_netherite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_BLACK)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_REDSTONE  = registerBlock("text_color_indicator_block_material_redstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_COPPER  = registerBlock("text_color_indicator_block_material_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_GOLD  = registerBlock("text_color_indicator_block_material_gold",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.GOLD)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_EMERALD  = registerBlock("text_color_indicator_block_material_emerald",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.EMERALD)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_DIAMOND  = registerBlock("text_color_indicator_block_material_diamond",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.DIAMOND)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_LAPIS  = registerBlock("text_color_indicator_block_material_lapis",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.LAPIS)));
    public static final RegistryObject<Block> TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_AMETHYST  = registerBlock("text_color_indicator_block_material_amethyst",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_PURPLE)));

    //Redstone Signal Blocks
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_0  = registerBlock("redstone_indicator_block_0",
            () -> new RedstoneIndicatorBlock0(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_1  = registerBlock("redstone_indicator_block_1",
            () -> new RedstoneIndicatorBlock1(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_2  = registerBlock("redstone_indicator_block_2",
            () -> new RedstoneIndicatorBlock2(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_3  = registerBlock("redstone_indicator_block_3",
            () -> new RedstoneIndicatorBlock3(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_4  = registerBlock("redstone_indicator_block_4",
            () -> new RedstoneIndicatorBlock4(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_5  = registerBlock("redstone_indicator_block_5",
            () -> new RedstoneIndicatorBlock5(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_6  = registerBlock("redstone_indicator_block_6",
            () -> new RedstoneIndicatorBlock6(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_7  = registerBlock("redstone_indicator_block_7",
            () -> new RedstoneIndicatorBlock7(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_8  = registerBlock("redstone_indicator_block_8",
            () -> new RedstoneIndicatorBlock8(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_9  = registerBlock("redstone_indicator_block_9",
            () -> new RedstoneIndicatorBlock9(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_10  = registerBlock("redstone_indicator_block_10",
            () -> new RedstoneIndicatorBlock10(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_11  = registerBlock("redstone_indicator_block_11",
            () -> new RedstoneIndicatorBlock11(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_12  = registerBlock("redstone_indicator_block_12",
            () -> new RedstoneIndicatorBlock12(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_13  = registerBlock("redstone_indicator_block_13",
            () -> new RedstoneIndicatorBlock13(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_14  = registerBlock("redstone_indicator_block_14",
            () -> new RedstoneIndicatorBlock14(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> REDSTONE_INDICATOR_BLOCK_15  = registerBlock("redstone_indicator_block_15",
            () -> new RedstoneIndicatorBlock15(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true)));

    //Light Level Blocks
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_0  = registerBlock("light_level_indicator_block_0",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 0).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_1  = registerBlock("light_level_indicator_block_1",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 1).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_2  = registerBlock("light_level_indicator_block_2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 2).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_3  = registerBlock("light_level_indicator_block_3",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 3).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_4  = registerBlock("light_level_indicator_block_4",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 4).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_5  = registerBlock("light_level_indicator_block_5",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 5).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_6  = registerBlock("light_level_indicator_block_6",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 6).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_7  = registerBlock("light_level_indicator_block_7",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 7).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_8  = registerBlock("light_level_indicator_block_8",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 8).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_9  = registerBlock("light_level_indicator_block_9",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 9).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_10  = registerBlock("light_level_indicator_block_10",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 10).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_11  = registerBlock("light_level_indicator_block_11",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 11).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_12  = registerBlock("light_level_indicator_block_12",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 12).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_13  = registerBlock("light_level_indicator_block_13",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 13).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_14  = registerBlock("light_level_indicator_block_14",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 14).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));
    public static final RegistryObject<Block> LIGHT_LEVEL_INDICATOR_BLOCK_15  = registerBlock("light_level_indicator_block_15",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).mapColor(MapColor.SAND).lightLevel(s -> 15).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)));


    public static final RegistryObject<Block> DARKNESS_BLOCK  = registerBlock("darkness_block",
            () -> new DarknessBlockBlock());
    public static final RegistryObject<Block> LIGHT_BLOCK  = registerBlock("light_block",
            () -> new LightBlockBlock());

    public static final RegistryObject<Block> INDICATOR_SLAB  = registerBlock("indicator_slab",
            () -> new IndicatorSlabBlock());
    public static final RegistryObject<Block> INDICATOR_STAIRS = registerBlock("indicator_stairs",
            () -> new StairBlock(() -> ModBlocks.BLANK_INDICATOR_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> INDICATOR_DOOR = registerBlock("indicator_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).noOcclusion(), BlockSetType.STONE));
    public static final RegistryObject<Block> INDICATOR_PRESSURE_PLATE = registerBlock("indicator_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> INDICATOR_TRAPDOOR = registerBlock("indicator_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).noOcclusion(), BlockSetType.STONE));

    public static final RegistryObject<Block> DARKENED_INDICATOR_SLAB  = registerBlock("darkened_indicator_slab",
            () -> new DarkenedIndicatorSlabBlock());
    public static final RegistryObject<Block> DARKENED_INDICATOR_STAIRS = registerBlock("darkened_indicator_stairs",
            () -> new StairBlock(() -> ModBlocks.DARKENED_BLANK_INDICATOR_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ)));
    public static final RegistryObject<Block> DARKENED_INDICATOR_DOOR = registerBlock("darkened_indicator_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).noOcclusion(), BlockSetType.STONE));
    public static final RegistryObject<Block> DARKENED_INDICATOR_PRESSURE_PLATE = registerBlock("darkened_indicator_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> DARKENED_INDICATOR_TRAPDOOR = registerBlock("darkened_indicator_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).noOcclusion(), BlockSetType.STONE));





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
