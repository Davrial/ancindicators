package net.davrial.ancindicators.item;

import net.davrial.ancindicators.ANCIndicators;
import net.davrial.ancindicators.item.custom.*;
//import net.davrial.ancindicators.item.custom.MetalDetectorItem;
import net.davrial.ancindicators.procedures.ModNameAndBlockNameExtracterGetterProcedure;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ANCIndicators.MOD_ID);

    /*
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));


    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));
    */



    //FILL IN ITEMS HERE
    //Main Items
    public static final RegistryObject<Item> BLANK_INDICATOR_ITEM = ITEMS.register("blank_indicator_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARKENED_BLANK_INDICATOR_ITEM = ITEMS.register("darkened_blank_indicator_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_TEMPLATE_ITEM = ITEMS.register("alphabetic_indicator_template_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_TEMPLATE_ITEM = ITEMS.register("numeric_indicator_template_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_TEMPLATE_ITEM = ITEMS.register("block_color_indicator_template_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_TEMPLATE_ITEM = ITEMS.register("text_color_indicator_template_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_TEMPLATE_ITEM_DARKENED = ITEMS.register("text_color_indicator_template_item_darkened",
            () -> new Item(new Item.Properties()));

    //Misc Items
    public static final RegistryObject<Item> ERASER = ITEMS.register("eraser",
            () -> new Eraser1Item());
    public static final RegistryObject<Item> MAGIC_ERASER = ITEMS.register("magic_eraser",
            () -> new Eraser2Item());
    public static final RegistryObject<Item> PALETTE = ITEMS.register("palette",
            () -> new Palette1Item());
    public static final RegistryObject<Item> PALETTE_BLOCKS = ITEMS.register("palette_blocks",
            () -> new Palette1Item());
    public static final RegistryObject<Item> PALETTE_TEXT = ITEMS.register("palette_text",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GETTER_STICK = ITEMS.register("getter_stick",
            () -> new GetterStickItem());

    //Bottles
    public static final RegistryObject<Item> VIAL_OF_DARKENING_SOLUTION = ITEMS.register("vial_of_darkening_solution",
            () -> new Palette1Item());
    public static final RegistryObject<Item> VIAL_OF_CLEANING_SOLUTION = ITEMS.register("vial_of_cleaning_solution",
            () -> new Palette1Item());
    public static final RegistryObject<Item> FLASK_OF_ETERNAL_DARKNESS = ITEMS.register("flask_of_eternal_darkness",
            () -> new FlaskOfEternalDarknessItem());
    public static final RegistryObject<Item> VESSEL_OF_INFINITE_LIGHT = ITEMS.register("vessel_of_infinite_light",
            () -> new VesselOfInfiniteLightItem());

    //Paints

    public static final RegistryObject<Item> VIAL_OF_PAINT_STRONG_BROWN = ITEMS.register("vial_of_paint_strong_brown",
            () -> new AutomaticUniversalRecoloringItem());
    public static final RegistryObject<Item> VIAL_OF_PAINT_STRONG_RED = ITEMS.register("vial_of_paint_strong_red",
            () -> new AutomaticUniversalRecoloringItem());
    public static final RegistryObject<Item> VIAL_OF_PAINT_STRONG_ORANGE = ITEMS.register("vial_of_paint_strong_orange",
            () -> new AutomaticUniversalRecoloringItem());
    public static final RegistryObject<Item> VIAL_OF_PAINT_STRONG_YELLOW = ITEMS.register("vial_of_paint_strong_yellow",
            () -> new AutomaticUniversalRecoloringItem());
    public static final RegistryObject<Item> VIAL_OF_PAINT_STRONG_LIME = ITEMS.register("vial_of_paint_strong_lime",
            () -> new AutomaticUniversalRecoloringItem());
    public static final RegistryObject<Item> VIAL_OF_PAINT_STRONG_GREEN = ITEMS.register("vial_of_paint_strong_green",
            () -> new AutomaticUniversalRecoloringItem());
    public static final RegistryObject<Item> VIAL_OF_PAINT_STRONG_CYAN = ITEMS.register("vial_of_paint_strong_cyan",
            () -> new AutomaticUniversalRecoloringItem());
    public static final RegistryObject<Item> VIAL_OF_PAINT_STRONG_LIGHT_BLUE = ITEMS.register("vial_of_paint_strong_light_blue",
            () -> new AutomaticUniversalRecoloringItem());
    public static final RegistryObject<Item> VIAL_OF_PAINT_STRONG_BLUE = ITEMS.register("vial_of_paint_strong_blue",
            () -> new AutomaticUniversalRecoloringItem());
    public static final RegistryObject<Item> VIAL_OF_PAINT_STRONG_PURPLE = ITEMS.register("vial_of_paint_strong_purple",
            () -> new AutomaticUniversalRecoloringItem());
    public static final RegistryObject<Item> VIAL_OF_PAINT_STRONG_MAGENTA = ITEMS.register("vial_of_paint_strong_magenta",
            () -> new AutomaticUniversalRecoloringItem());
    public static final RegistryObject<Item> VIAL_OF_PAINT_STRONG_PINK = ITEMS.register("vial_of_paint_strong_pink",
            () -> new AutomaticUniversalRecoloringItem());


    //Alphabetic Items
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_A = ITEMS.register("alphabetic_indicator_item_a",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_B = ITEMS.register("alphabetic_indicator_item_b",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_C = ITEMS.register("alphabetic_indicator_item_c",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_D = ITEMS.register("alphabetic_indicator_item_d",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_E = ITEMS.register("alphabetic_indicator_item_e",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_F = ITEMS.register("alphabetic_indicator_item_f",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_G = ITEMS.register("alphabetic_indicator_item_g",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_H = ITEMS.register("alphabetic_indicator_item_h",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_I = ITEMS.register("alphabetic_indicator_item_i",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_J = ITEMS.register("alphabetic_indicator_item_j",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_K = ITEMS.register("alphabetic_indicator_item_k",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_L = ITEMS.register("alphabetic_indicator_item_l",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_M = ITEMS.register("alphabetic_indicator_item_m",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_N = ITEMS.register("alphabetic_indicator_item_n",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_O = ITEMS.register("alphabetic_indicator_item_o",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_P = ITEMS.register("alphabetic_indicator_item_p",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_Q = ITEMS.register("alphabetic_indicator_item_q",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_R = ITEMS.register("alphabetic_indicator_item_r",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_S = ITEMS.register("alphabetic_indicator_item_s",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_T = ITEMS.register("alphabetic_indicator_item_t",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_U = ITEMS.register("alphabetic_indicator_item_u",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_V = ITEMS.register("alphabetic_indicator_item_v",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_W = ITEMS.register("alphabetic_indicator_item_w",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_X = ITEMS.register("alphabetic_indicator_item_x",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_Y = ITEMS.register("alphabetic_indicator_item_y",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALPHABETIC_INDICATOR_ITEM_Z = ITEMS.register("alphabetic_indicator_item_z",
            () -> new Item(new Item.Properties()));

    //Numeric Items
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_0 = ITEMS.register("numeric_indicator_item_0",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_1 = ITEMS.register("numeric_indicator_item_1",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_2 = ITEMS.register("numeric_indicator_item_2",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_3 = ITEMS.register("numeric_indicator_item_3",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_4 = ITEMS.register("numeric_indicator_item_4",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_5 = ITEMS.register("numeric_indicator_item_5",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_6 = ITEMS.register("numeric_indicator_item_6",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_7 = ITEMS.register("numeric_indicator_item_7",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_8 = ITEMS.register("numeric_indicator_item_8",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_9 = ITEMS.register("numeric_indicator_item_9",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_10 = ITEMS.register("numeric_indicator_item_10",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_11 = ITEMS.register("numeric_indicator_item_11",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_12 = ITEMS.register("numeric_indicator_item_12",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_13 = ITEMS.register("numeric_indicator_item_13",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_14 = ITEMS.register("numeric_indicator_item_14",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_15 = ITEMS.register("numeric_indicator_item_15",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_16 = ITEMS.register("numeric_indicator_item_16",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_32 = ITEMS.register("numeric_indicator_item_32",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_64 = ITEMS.register("numeric_indicator_item_64",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_1000 = ITEMS.register("numeric_indicator_item_1000",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_EVEN = ITEMS.register("numeric_indicator_item_even",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_ODD = ITEMS.register("numeric_indicator_item_odd",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_INFINITY = ITEMS.register("numeric_indicator_item_infinity",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_ADD = ITEMS.register("numeric_indicator_item_add",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_SUBTRACT = ITEMS.register("numeric_indicator_item_subtract",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_MULTIPLY = ITEMS.register("numeric_indicator_item_multiply",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_DIVIDE = ITEMS.register("numeric_indicator_item_divide",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUMERIC_INDICATOR_ITEM_EQUALS = ITEMS.register("numeric_indicator_item_equals",
            () -> new Item(new Item.Properties()));


    //Block Color Items
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_WHITE = ITEMS.register("block_color_indicator_item_white",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_LIGHT_GRAY = ITEMS.register("block_color_indicator_item_light_gray",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_GRAY = ITEMS.register("block_color_indicator_item_gray",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_BLACK = ITEMS.register("block_color_indicator_item_black",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_BROWN = ITEMS.register("block_color_indicator_item_brown",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_RED = ITEMS.register("block_color_indicator_item_red",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_ORANGE = ITEMS.register("block_color_indicator_item_orange",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_YELLOW = ITEMS.register("block_color_indicator_item_yellow",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_LIME = ITEMS.register("block_color_indicator_item_lime",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_GREEN = ITEMS.register("block_color_indicator_item_green",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_CYAN = ITEMS.register("block_color_indicator_item_cyan",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_LIGHT_BLUE = ITEMS.register("block_color_indicator_item_light_blue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_BLUE = ITEMS.register("block_color_indicator_item_blue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_PURPLE = ITEMS.register("block_color_indicator_item_purple",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_MAGENTA = ITEMS.register("block_color_indicator_item_magenta",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCK_COLOR_INDICATOR_ITEM_PINK = ITEMS.register("block_color_indicator_item_pink",
            () -> new Item(new Item.Properties()));

    //Text Color Items
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_BLACK = ITEMS.register("text_color_indicator_item_black",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_DARK_BLUE = ITEMS.register("text_color_indicator_item_dark_blue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_DARK_GREEN = ITEMS.register("text_color_indicator_item_dark_green",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_DARK_AQUA = ITEMS.register("text_color_indicator_item_dark_aqua",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_DARK_RED = ITEMS.register("text_color_indicator_item_dark_red",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_DARK_PURPLE = ITEMS.register("text_color_indicator_item_dark_purple",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_GOLD = ITEMS.register("text_color_indicator_item_gold",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_GRAY = ITEMS.register("text_color_indicator_item_gray",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_DARK_GRAY = ITEMS.register("text_color_indicator_item_dark_gray",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_BLUE = ITEMS.register("text_color_indicator_item_blue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_GREEN = ITEMS.register("text_color_indicator_item_green",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_AQUA = ITEMS.register("text_color_indicator_item_aqua",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_RED = ITEMS.register("text_color_indicator_item_red",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_LIGHT_PURPLE = ITEMS.register("text_color_indicator_item_light_purple",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_YELLOW = ITEMS.register("text_color_indicator_item_yellow",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_WHITE = ITEMS.register("text_color_indicator_item_white",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_MINECOIN_GOLD = ITEMS.register("text_color_indicator_item_minecoin_gold",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_MATERIAL_QUARTZ = ITEMS.register("text_color_indicator_item_material_quartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_MATERIAL_IRON = ITEMS.register("text_color_indicator_item_material_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_MATERIAL_NETHERITE = ITEMS.register("text_color_indicator_item_material_netherite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_MATERIAL_REDSTONE = ITEMS.register("text_color_indicator_item_material_redstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_MATERIAL_COPPER = ITEMS.register("text_color_indicator_item_material_copper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_MATERIAL_GOLD = ITEMS.register("text_color_indicator_item_material_gold",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_MATERIAL_EMERALD = ITEMS.register("text_color_indicator_item_material_emerald",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_MATERIAL_DIAMOND = ITEMS.register("text_color_indicator_item_material_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_MATERIAL_LAPIS = ITEMS.register("text_color_indicator_item_material_lapis",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEXT_COLOR_INDICATOR_ITEM_MATERIAL_AMETHYST = ITEMS.register("text_color_indicator_item_material_amethyst",
            () -> new Item(new Item.Properties()));

    //Redstone Items
    public static final RegistryObject<Item> REDSTONE_INDICATOR_TEMPLATE_ITEM = ITEMS.register("redstone_indicator_template_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_REDSTONE_INDICATOR_ITEM = ITEMS.register("blank_redstone_indicator_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_0 = ITEMS.register("redstone_indicator_item_0",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_1 = ITEMS.register("redstone_indicator_item_1",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_2 = ITEMS.register("redstone_indicator_item_2",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_3 = ITEMS.register("redstone_indicator_item_3",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_4 = ITEMS.register("redstone_indicator_item_4",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_5 = ITEMS.register("redstone_indicator_item_5",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_6 = ITEMS.register("redstone_indicator_item_6",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_7 = ITEMS.register("redstone_indicator_item_7",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_8 = ITEMS.register("redstone_indicator_item_8",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_9 = ITEMS.register("redstone_indicator_item_9",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_10 = ITEMS.register("redstone_indicator_item_10",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_11 = ITEMS.register("redstone_indicator_item_11",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_12 = ITEMS.register("redstone_indicator_item_12",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_13 = ITEMS.register("redstone_indicator_item_13",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_14 = ITEMS.register("redstone_indicator_item_14",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INDICATOR_ITEM_15 = ITEMS.register("redstone_indicator_item_15",
            () -> new Item(new Item.Properties()));

    //Light Level Items

    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_TEMPLATE_ITEM = ITEMS.register("light_level_indicator_template_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_LIGHT_LEVEL_INDICATOR_ITEM = ITEMS.register("blank_light_level_indicator_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_0 = ITEMS.register("light_level_indicator_item_0",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_1 = ITEMS.register("light_level_indicator_item_1",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_2 = ITEMS.register("light_level_indicator_item_2",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_3 = ITEMS.register("light_level_indicator_item_3",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_4 = ITEMS.register("light_level_indicator_item_4",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_5 = ITEMS.register("light_level_indicator_item_5",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_6 = ITEMS.register("light_level_indicator_item_6",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_7 = ITEMS.register("light_level_indicator_item_7",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_8 = ITEMS.register("light_level_indicator_item_8",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_9 = ITEMS.register("light_level_indicator_item_9",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_10 = ITEMS.register("light_level_indicator_item_10",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_11 = ITEMS.register("light_level_indicator_item_11",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_12 = ITEMS.register("light_level_indicator_item_12",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_13 = ITEMS.register("light_level_indicator_item_13",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_14 = ITEMS.register("light_level_indicator_item_14",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_LEVEL_INDICATOR_ITEM_15 = ITEMS.register("light_level_indicator_item_15",
            () -> new Item(new Item.Properties()));





    /*NO CHANGES NEEDED PAST THIS LINE*/





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
