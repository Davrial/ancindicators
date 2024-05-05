package net.davrial.ancindicators.item;

import net.davrial.ancindicators.ANCIndicators;
import net.davrial.ancindicators.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ANCIndicators.MOD_ID);


    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_MISC_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_misc_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PALETTE.get()))
                    .title(Component.translatable("creativetab.ancindicators_misc_items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Misc Items
                        pOutput.accept(ModItems.ERASER.get());
                        pOutput.accept(ModItems.MAGIC_ERASER.get());
                        pOutput.accept(ModItems.PALETTE.get());
                        pOutput.accept(ModItems.PALETTE_BLOCKS.get());
                        pOutput.accept(ModItems.PALETTE_TEXT.get());
                        pOutput.accept(ModItems.FLASK_OF_ETERNAL_DARKNESS.get());
                        pOutput.accept(ModItems.VESSEL_OF_INFINITE_LIGHT.get());
                        pOutput.accept(ModItems.VIAL_OF_DARKENING_SOLUTION_BLACK.get());
                        pOutput.accept(ModItems.VIAL_OF_CLEANING_SOLUTION_WHITE.get());
                        pOutput.accept(ModItems.GETTER_STICK.get());
                        pOutput.accept(ModItems.BOTTLE_OF_PAINT_BASE.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_PAINTS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_paints_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BOTTLE_OF_PAINT_BASE.get()))
                    .title(Component.translatable("creativetab.ancindicators_misc_items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Misc Items
                        pOutput.accept(ModItems.BOTTLE_OF_PAINT_BASE.get());
                        pOutput.accept(ModItems.VESSEL_OF_INFINITE_LIGHT.get());
                        pOutput.accept(ModItems.FLASK_OF_ETERNAL_DARKNESS.get());
                        pOutput.accept(ModItems.VIAL_OF_CLEANING_SOLUTION_WHITE.get());
                        pOutput.accept(ModItems.VIAL_OF_DARKENING_SOLUTION_BLACK.get());
                        pOutput.accept(ModItems.VIAL_OF_PAINT_STRONG_BROWN.get());
                        pOutput.accept(ModItems.VIAL_OF_PAINT_STRONG_RED.get());
                        pOutput.accept(ModItems.VIAL_OF_PAINT_STRONG_ORANGE.get());
                        pOutput.accept(ModItems.VIAL_OF_PAINT_STRONG_YELLOW.get());
                        pOutput.accept(ModItems.VIAL_OF_PAINT_STRONG_LIME.get());
                        pOutput.accept(ModItems.VIAL_OF_PAINT_STRONG_GREEN.get());
                        pOutput.accept(ModItems.VIAL_OF_PAINT_STRONG_CYAN.get());
                        pOutput.accept(ModItems.VIAL_OF_PAINT_STRONG_LIGHT_BLUE.get());
                        pOutput.accept(ModItems.VIAL_OF_PAINT_STRONG_BLUE.get());
                        pOutput.accept(ModItems.VIAL_OF_PAINT_STRONG_PURPLE.get());
                        pOutput.accept(ModItems.VIAL_OF_PAINT_STRONG_MAGENTA.get());
                        pOutput.accept(ModItems.VIAL_OF_PAINT_STRONG_PINK.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_DECORATIVE_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_decorative_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.INDICATOR_STAIRS.get()))
                    .title(Component.translatable("creativetab.ancindicators_decorative_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Misc Items
                        pOutput.accept(ModBlocks.BLANK_INDICATOR_BLOCK.get());
                        pOutput.accept(ModBlocks.INDICATOR_SLAB.get());
                        pOutput.accept(ModBlocks.INDICATOR_STAIRS.get());
                        pOutput.accept(ModBlocks.INDICATOR_DOOR.get());
                        pOutput.accept(ModBlocks.INDICATOR_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.INDICATOR_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.DARKENED_INDICATOR_SLAB.get());
                        pOutput.accept(ModBlocks.DARKENED_BLANK_INDICATOR_BLOCK.get());
                        pOutput.accept(ModBlocks.DARKENED_INDICATOR_STAIRS.get());
                        pOutput.accept(ModBlocks.DARKENED_INDICATOR_DOOR.get());
                        pOutput.accept(ModBlocks.DARKENED_INDICATOR_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.DARKENED_INDICATOR_PRESSURE_PLATE.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_ALL_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_all_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLANK_INDICATOR_BLOCK.get()))
                    .title(Component.translatable("creativetab.ancindicators_all_blocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Main Blocks
                        pOutput.accept(ModBlocks.BLANK_INDICATOR_BLOCK.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK_DARKENED.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.BLANK_REDSTONE_INDICATOR_BLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.BLANK_LIGHT_LEVEL_INDICATOR_BLOCK.get());

                        //Alphabetic Blocks
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_A.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_B.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_C.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_D.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_E.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_F.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_G.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_H.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_I.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_J.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_K.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_L.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_M.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_N.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_O.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_P.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Q.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_R.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_S.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_T.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_U.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_V.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_W.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_X.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Y.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Z.get());


                        //Numeric Blocks
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_0.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_1.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_2.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_3.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_4.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_5.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_6.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_7.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_8.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_9.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_10.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_11.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_12.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_13.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_14.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_15.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_16.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_32.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_64.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_1000.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_EVEN.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_ODD.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_INFINITY.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_ADD.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_SUBTRACT.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_MULTIPLY.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_DIVIDE.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_EQUALS.get());

                        //Block Color Blocks
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_WHITE.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_GRAY.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GRAY.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLACK.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BROWN.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_RED.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_ORANGE.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_YELLOW.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIME.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GREEN.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_CYAN.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_BLUE.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLUE.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PURPLE.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_MAGENTA.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PINK.get());

                        //Text Color Blocks
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_BLACK.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_BLUE.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_GREEN.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_AQUA.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_RED.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_PURPLE.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GOLD.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GRAY.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_GRAY.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_BLUE.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GREEN.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_AQUA.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_RED.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_LIGHT_PURPLE.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_YELLOW.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_WHITE.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MINECOIN_GOLD.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_QUARTZ.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_IRON.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_NETHERITE.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_REDSTONE.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_COPPER.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_GOLD.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_EMERALD.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_DIAMOND.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_LAPIS.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_AMETHYST.get());

                        //Redstone Blocks
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_0.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_1.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_2.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_3.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_4.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_5.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_6.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_7.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_8.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_9.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_10.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_11.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_12.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_13.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_14.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_15.get());

                        //Light Level Blocks
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.BLANK_LIGHT_LEVEL_INDICATOR_BLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_0.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_1.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_2.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_3.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_4.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_5.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_6.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_7.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_8.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_9.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_10.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_11.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_12.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_13.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_14.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_15.get());

                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_BASE_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_base_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLANK_INDICATOR_BLOCK.get()))
                    .title(Component.translatable("creativetab.ancindicators_base_blocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Main Blocks
                        pOutput.accept(ModBlocks.BLANK_INDICATOR_BLOCK.get());
                        pOutput.accept(ModBlocks.DARKENED_BLANK_INDICATOR_BLOCK.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK_DARKENED.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.BLANK_REDSTONE_INDICATOR_BLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.BLANK_LIGHT_LEVEL_INDICATOR_BLOCK.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_ALPHABETIC_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_alphabetic_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALPHABETIC_INDICATOR_TEMPLATE_BLOCK.get()))
                    .title(Component.translatable("creativetab.ancindicators_alphabetic_blocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Alphabetic Blocks
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_A.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_B.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_C.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_D.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_E.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_F.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_G.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_H.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_I.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_J.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_K.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_L.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_M.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_N.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_O.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_P.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Q.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_R.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_S.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_T.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_U.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_V.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_W.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_X.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Y.get());
                        pOutput.accept(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Z.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_NUMERIC_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_numeric_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.NUMERIC_INDICATOR_TEMPLATE_BLOCK.get()))
                    .title(Component.translatable("creativetab.ancindicators_numeric_blocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Numeric Blocks
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_0.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_1.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_2.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_3.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_4.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_5.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_6.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_7.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_8.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_9.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_10.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_11.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_12.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_13.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_14.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_15.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_16.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_32.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_64.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_1000.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_EVEN.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_ODD.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_INFINITY.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_ADD.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_SUBTRACT.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_MULTIPLY.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_DIVIDE.get());
                        pOutput.accept(ModBlocks.NUMERIC_INDICATOR_BLOCK_EQUALS.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_BLOCK_COLOR_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_block_color_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLOCK_COLOR_INDICATOR_TEMPLATE_BLOCK.get()))
                    .title(Component.translatable("creativetab.ancindicators_block_color_blocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Block Color Blocks
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_WHITE.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_GRAY.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GRAY.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLACK.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BROWN.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_RED.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_ORANGE.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_YELLOW.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIME.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GREEN.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_CYAN.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_BLUE.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLUE.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PURPLE.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_MAGENTA.get());
                        pOutput.accept(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PINK.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_TEXT_COLOR_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_text_color_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK.get()))
                    .title(Component.translatable("creativetab.ancindicators_text_color_blocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Text Color Blocks
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK_DARKENED.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_BLACK.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_BLUE.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_GREEN.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_AQUA.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_RED.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_PURPLE.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GOLD.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GRAY.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_GRAY.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_BLUE.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GREEN.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_AQUA.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_RED.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_LIGHT_PURPLE.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_YELLOW.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_WHITE.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MINECOIN_GOLD.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_QUARTZ.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_IRON.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_NETHERITE.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_REDSTONE.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_COPPER.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_GOLD.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_EMERALD.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_DIAMOND.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_LAPIS.get());
                        pOutput.accept(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_AMETHYST.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_REDSTONE_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_redstone_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.REDSTONE_INDICATOR_TEMPLATE_BLOCK.get()))
                    .title(Component.translatable("creativetab.ancindicators_redstone_blocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Redstone Blocks
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.BLANK_REDSTONE_INDICATOR_BLOCK.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_0.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_1.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_2.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_3.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_4.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_5.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_6.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_7.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_8.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_9.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_10.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_11.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_12.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_13.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_14.get());
                        pOutput.accept(ModBlocks.REDSTONE_INDICATOR_BLOCK_15.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_LIGHT_LEVEL_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_light_level_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.LIGHT_LEVEL_INDICATOR_TEMPLATE_BLOCK.get()))
                    .title(Component.translatable("creativetab.ancindicators_light_level_blocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Light Level Blocks
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_TEMPLATE_BLOCK.get());
                        pOutput.accept(ModBlocks.BLANK_LIGHT_LEVEL_INDICATOR_BLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_0.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_1.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_2.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_3.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_4.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_5.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_6.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_7.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_8.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_9.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_10.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_11.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_12.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_13.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_14.get());
                        pOutput.accept(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_15.get());
                    })
                    .build()
    );

    //ITEM TABS
    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_ALL_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_all_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLANK_INDICATOR_ITEM.get()))
                    .title(Component.translatable("creativetab.ancindicators_all_items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Main Blocks
                        pOutput.accept(ModItems.BLANK_INDICATOR_ITEM.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_TEMPLATE_ITEM.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_TEMPLATE_ITEM.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_TEMPLATE_ITEM.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM_DARKENED.get());

                        //Alphabetic Blocks
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_A.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_B.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_C.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_D.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_E.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_F.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_G.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_H.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_I.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_J.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_K.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_L.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_M.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_N.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_O.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_P.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_Q.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_R.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_S.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_T.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_U.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_V.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_W.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_X.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_Y.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_Z.get());


                        //Numeric Blocks
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_0.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_1.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_2.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_3.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_4.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_5.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_6.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_7.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_8.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_9.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_10.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_11.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_12.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_13.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_14.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_15.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_16.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_32.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_64.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_1000.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_EVEN.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_ODD.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_INFINITY.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_ADD.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_SUBTRACT.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_MULTIPLY.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_DIVIDE.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_EQUALS.get());

                        //Block Color Blocks
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_WHITE.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_LIGHT_GRAY.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_GRAY.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_BLACK.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_BROWN.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_RED.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_ORANGE.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_YELLOW.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_LIME.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_GREEN.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_CYAN.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_LIGHT_BLUE.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_BLUE.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_PURPLE.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_MAGENTA.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_PINK.get());

                        //Text Color Blocks
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_BLACK.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_BLUE.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_GREEN.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_AQUA.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_RED.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_PURPLE.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_GOLD.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_GRAY.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_GRAY.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_BLUE.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_GREEN.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_AQUA.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_RED.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_LIGHT_PURPLE.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_YELLOW.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_WHITE.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MINECOIN_GOLD.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_QUARTZ.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_IRON.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_NETHERITE.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_REDSTONE.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_COPPER.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_GOLD.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_EMERALD.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_DIAMOND.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_LAPIS.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_AMETHYST.get());

                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_BASE_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_base_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLANK_INDICATOR_ITEM.get()))
                    .title(Component.translatable("creativetab.ancindicators_base_items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Main Blocks
                        pOutput.accept(ModItems.BLANK_INDICATOR_ITEM.get());
                        pOutput.accept(ModItems.DARKENED_BLANK_INDICATOR_ITEM.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_TEMPLATE_ITEM.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_TEMPLATE_ITEM.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_TEMPLATE_ITEM.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM_DARKENED.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_ALPHABETIC_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_alphabetic_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALPHABETIC_INDICATOR_TEMPLATE_ITEM.get()))
                    .title(Component.translatable("creativetab.ancindicators_alphabetic_items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Alphabetic Items
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_TEMPLATE_ITEM.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_A.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_B.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_C.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_D.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_E.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_F.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_G.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_H.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_I.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_J.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_K.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_L.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_M.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_N.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_O.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_P.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_Q.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_R.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_S.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_T.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_U.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_V.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_W.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_X.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_Y.get());
                        pOutput.accept(ModItems.ALPHABETIC_INDICATOR_ITEM_Z.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_NUMERIC_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_numeric_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NUMERIC_INDICATOR_TEMPLATE_ITEM.get()))
                    .title(Component.translatable("creativetab.ancindicators_numeric_items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Numeric Items
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_TEMPLATE_ITEM.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_0.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_1.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_2.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_3.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_4.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_5.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_6.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_7.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_8.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_9.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_10.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_11.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_12.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_13.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_14.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_15.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_16.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_32.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_64.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_1000.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_EVEN.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_ODD.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_INFINITY.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_ADD.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_SUBTRACT.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_MULTIPLY.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_DIVIDE.get());
                        pOutput.accept(ModItems.NUMERIC_INDICATOR_ITEM_EQUALS.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_ITEM_COLOR_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_block_color_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLOCK_COLOR_INDICATOR_TEMPLATE_ITEM.get()))
                    .title(Component.translatable("creativetab.ancindicators_block_color_items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Block Color Items
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_TEMPLATE_ITEM.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_WHITE.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_LIGHT_GRAY.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_GRAY.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_BLACK.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_BROWN.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_RED.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_ORANGE.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_YELLOW.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_LIME.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_GREEN.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_CYAN.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_LIGHT_BLUE.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_BLUE.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_PURPLE.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_MAGENTA.get());
                        pOutput.accept(ModItems.BLOCK_COLOR_INDICATOR_ITEM_PINK.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ANCINDICATORS_TEXT_COLOR_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("ancindicators_text_color_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM.get()))
                    .title(Component.translatable("creativetab.ancindicators_text_color_items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Text Color Items
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM_DARKENED.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_BLACK.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_BLUE.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_GREEN.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_AQUA.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_RED.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_PURPLE.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_GOLD.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_GRAY.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_GRAY.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_BLUE.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_GREEN.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_AQUA.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_RED.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_LIGHT_PURPLE.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_YELLOW.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_WHITE.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MINECOIN_GOLD.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_QUARTZ.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_IRON.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_NETHERITE.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_REDSTONE.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_COPPER.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_GOLD.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_EMERALD.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_DIAMOND.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_LAPIS.get());
                        pOutput.accept(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_AMETHYST.get());
                    })
                    .build()
    );









    /*NO CHANGES NEEDED PAST THIS LINE*/










    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
