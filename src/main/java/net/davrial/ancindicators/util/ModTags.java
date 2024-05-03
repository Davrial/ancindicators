package net.davrial.ancindicators.util;

import net.davrial.ancindicators.ANCIndicators;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        //public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");
        //public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = tag("needs_sapphire_tool");



        //FILL IN TAGS HERE
        public static final TagKey<Block> ALL_INDICATOR_BLOCKS = tag("all_indicator_blocks");
        public static final TagKey<Block> BLANK_INDICATOR_BLOCKS = tag("blank_indicator_blocks");
        public static final TagKey<Block> NON_BLANK_INDICATOR_BLOCKS = tag("non_blank_indicator_blocks");
        public static final TagKey<Block> ALPHABETIC_INDICATOR_BLOCKS = tag("alphabetic_indicator_blocks");
        public static final TagKey<Block> NUMERIC_INDICATOR_BLOCKS = tag("numeric_indicator_blocks");
        public static final TagKey<Block> MISC_NUMERIC_INDICATOR_BLOCKS = tag("misc_numeric_indicator_blocks");
        public static final TagKey<Block> EVEN_NUMERIC_INDICATOR_BLOCKS = tag("even_numeric_indicator_blocks");
        public static final TagKey<Block> ODD_NUMERIC_INDICATOR_BLOCKS = tag("odd_numeric_indicator_blocks");
        public static final TagKey<Block> MATH_NUMERIC_INDICATOR_BLOCKS = tag("math_numeric_indicator_blocks");
        public static final TagKey<Block> COLOR_INDICATOR_BLOCKS = tag("color_indicator_blocks");
        public static final TagKey<Block> BLOCK_COLOR_INDICATOR_BLOCKS = tag("block_color_indicator_blocks");
        public static final TagKey<Block> TEXT_COLOR_INDICATOR_BLOCKS = tag("text_color_indicator_blocks");
        public static final TagKey<Block> TEXT_COLOR_INDICATOR_BLOCKS_DARK = tag("text_color_indicator_blocks_dark");
        public static final TagKey<Block> REDSTONE_INDICATOR_BLOCKS = tag("redstone_indicator_blocks");
        public static final TagKey<Block> LIGHT_LEVEL_INDICATOR_BLOCKS = tag("light_level_indicator_blocks");
        public static final TagKey<Block> ADVANCED_INDICATOR_BLOCKS = tag("advanced_indicator_blocks");

        //Erasable Block Tags
        public static final TagKey<Block> ALL_ERASABLE_BLOCKS = tag("all_erasable_blocks");
        public static final TagKey<Block> ERASABLE_TO_BLANK_BLOCKS = tag("erasable_to_blank_blocks");
        public static final TagKey<Block> ERASABLE_TO_DARKENED_BLOCKS = tag("erasable_to_darkened_blocks");
        public static final TagKey<Block> ERASABLE_TO_REDSTONE_LEVEL_BLOCKS = tag("erasable_to_redstone_level_blocks");
        public static final TagKey<Block> ERASABLE_TO_LIGHT_LEVEL_BLOCKS = tag("erasable_to_light_level_blocks");
        public static final TagKey<Block> ERASABLE_TO_PLAIN_REDSTONE_BLOCKS = tag("erasable_to_plain_redstone_blocks");
        public static final TagKey<Block> ERASABLE_TO_PLAIN_GLOWSTONE_BLOCKS = tag("erasable_to_plain_glowstone_blocks");

        //Tags for coloring vanilla items
        public static final TagKey<Block> ALL_PAINTABLE_BLOCKS = tag("all_paintable_blocks");
        public static final TagKey<Block> PAINTABLE_VANILLA_BLOCKS = tag("paintable_vanilla_blocks");
        public static final TagKey<Block> PAINTABLES_WOOL = tag("paintables_wool");
        public static final TagKey<Block> PAINTABLES_CARPETS = tag("paintables_carpets");
        public static final TagKey<Block> PAINTABLES_BEDS = tag("paintables_beds");
        public static final TagKey<Block> PAINTABLES_TERRACOTTA = tag("paintables_terracotta");
        public static final TagKey<Block> PAINTABLES_CONCRETE = tag("paintables_concrete");
        public static final TagKey<Block> PAINTABLES_CONCRETE_POWDER = tag("paintables_concrete_powder");
        public static final TagKey<Block> PAINTABLES_SHULKER_BOXES = tag("paintables_shulker_boxes");
        public static final TagKey<Block> PAINTABLES_CANDLES = tag("paintables_candles");
        public static final TagKey<Block> PAINTABLES_BANNERS = tag("paintables_banners");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ANCIndicators.MOD_ID, name));
        }

    }

    public static class Items {
        public static final TagKey<Item> ANY_INDICATOR = tag("any_indicator");
        public static final TagKey<Item> ALL_INDICATOR_ITEMS = tag("all_indicator_items");
        public static final TagKey<Item> NON_BLANK_INDICATOR_ITEMS = tag("non_blank_indicator_items");
        public static final TagKey<Item> ALPHABETIC_INDICATOR_ITEMS = tag("alphabetic_indicator_items");
        public static final TagKey<Item> NUMERIC_INDICATOR_ITEMS = tag("numeric_indicator_items");
        public static final TagKey<Item> EVEN_NUMERIC_INDICATOR_ITEMS = tag("even_numeric_indicator_items");
        public static final TagKey<Item> ODD_NUMERIC_INDICATOR_ITEMS = tag("odd_numeric_indicator_items");
        public static final TagKey<Item> MATH_NUMERIC_INDICATOR_ITEMS = tag("math_numeric_indicator_items");
        public static final TagKey<Item> COLOR_INDICATOR_ITEMS = tag("color_indicator_items");
        public static final TagKey<Item> BLOCK_COLOR_INDICATOR_ITEMS = tag("block_color_indicator_items");
        public static final TagKey<Item> TEXT_COLOR_INDICATOR_ITEMS = tag("text_color_indicator_items");
        public static final TagKey<Item> REDSTONE_INDICATOR_ITEMS = tag("redstone_indicator_items");
        public static final TagKey<Item> LIGHT_LEVEL_INDICATOR_ITEMS = tag("light_level_indicator_items");
        public static final TagKey<Item> ALL_INDICATOR_BLOCK_ITEMS = tag("all_indicator_block_items");
        public static final TagKey<Item> BLANK_INDICATOR_BLOCK_ITEMS = tag("blank_indicator_block_items");
        public static final TagKey<Item> NON_BLANK_INDICATOR_BLOCK_ITEMS = tag("non_blank_indicator_block_items");
        public static final TagKey<Item> ALPHABETIC_INDICATOR_BLOCK_ITEMS = tag("alphabetic_indicator_block_items");
        public static final TagKey<Item> NUMERIC_INDICATOR_BLOCK_ITEMS = tag("numeric_indicator_block_items");
        public static final TagKey<Item> MISC_NUMERIC_INDICATOR_BLOCK_ITEMS = tag("misc_numeric_indicator_block_items");
        public static final TagKey<Item> EVEN_NUMERIC_INDICATOR_BLOCK_ITEMS = tag("even_numeric_indicator_block_items");
        public static final TagKey<Item> ODD_NUMERIC_INDICATOR_BLOCK_ITEMS = tag("odd_numeric_indicator_block_items");
        public static final TagKey<Item> MATH_NUMERIC_INDICATOR_BLOCK_ITEMS = tag("math_numeric_indicator_block_items");
        public static final TagKey<Item> COLOR_INDICATOR_BLOCK_ITEMS = tag("color_indicator_block_items");
        public static final TagKey<Item> BLOCK_COLOR_INDICATOR_BLOCK_ITEMS = tag("block_color_indicator_block_items");
        public static final TagKey<Item> TEXT_COLOR_INDICATOR_BLOCK_ITEMS = tag("text_color_indicator_block_items");
        public static final TagKey<Item> TEXT_COLOR_INDICATOR_BLOCK_ITEMS_DARK = tag("text_color_indicator_block_items_dark");
        public static final TagKey<Item> REDSTONE_INDICATOR_BLOCK_ITEMS = tag("redstone_indicator_block_items");
        public static final TagKey<Item> LIGHT_LEVEL_INDICATOR_BLOCK_ITEMS = tag("light_level_indicator_block_items");
        public static final TagKey<Item> ADVANCED_INDICATOR_BLOCK_ITEMS = tag("advanced_indicator_block_items");
        public static final TagKey<Item> INDICATOR_DARKENING_ITEMS = tag("indicator_darkening_items");
        public static final TagKey<Item> INDICATOR_DARKENING_ITEMS_WITH_DYES = tag("indicator_darkening_items_with_dyes");

        //Erasable Block Item Tags
        public static final TagKey<Item> ALL_ERASABLE_BLOCK_ITEMS = tag("all_erasable_block_items");
        public static final TagKey<Item> ERASABLE_TO_BLANK_BLOCK_ITEMS = tag("erasable_to_blank_block_items");
        public static final TagKey<Item> ERASABLE_TO_DARKENED_BLOCK_ITEMS = tag("erasable_to_darkened_block_items");
        public static final TagKey<Item> ERASABLE_TO_REDSTONE_LEVEL_BLOCK_ITEMS = tag("erasable_to_redstone_level_block_items");
        public static final TagKey<Item> ERASABLE_TO_LIGHT_LEVEL_BLOCK_ITEMS = tag("erasable_to_light_level_block_items");
        public static final TagKey<Item> ERASABLE_TO_PLAIN_REDSTONE_BLOCK_ITEMS = tag("erasable_to_plain_redstone_block_items");
        public static final TagKey<Item> ERASABLE_TO_PLAIN_GLOWSTONE_BLOCK_ITEMS = tag("erasable_to_plain_glowstone_block_items");

        //Erasable Item Tags
        public static final TagKey<Item> ALL_ERASABLE_ITEMS = tag("all_erasable_items");
        public static final TagKey<Item> ERASABLE_TO_BLANK_ITEMS = tag("erasable_to_blank_items");
        public static final TagKey<Item> ERASABLE_TO_DARKENED_ITEMS = tag("erasable_to_darkened_items");
        public static final TagKey<Item> ERASABLE_TO_REDSTONE_LEVEL_ITEMS = tag("erasable_to_redstone_level_items");
        public static final TagKey<Item> ERASABLE_TO_LIGHT_LEVEL_ITEMS = tag("erasable_to_light_level_items");
        public static final TagKey<Item> ERASABLE_TO_PLAIN_REDSTONE_ITEMS = tag("erasable_to_plain_redstone_items");
        public static final TagKey<Item> ERASABLE_TO_PLAIN_GLOWSTONE_ITEMS = tag("erasable_to_plain_glowstone_items");

        //Block Item + Item Supertags
        public static final TagKey<Item> ALL_INDICATORS = tag("all_indicators");
        public static final TagKey<Item> ALL_ERASABLES = tag("all_erasables");



        //Misc Item Tags
        public static final TagKey<Item> WRITING_ITEMS = tag("writing_items");
        public static final TagKey<Item> BASE_INDICATOR_CRAFTING_BLOCKS = tag("base_indicator_crafting_blocks");
        public static final TagKey<Item> BETTER_INDICATOR_CRAFTING_BLOCKS = tag("better_indicator_crafting_blocks");
        public static final TagKey<Item> INDICATOR_CRAFTING_ITEMS = tag("indicator_crafting_materials");
        public static final TagKey<Item> MISC_ANCINDICATOR_ITEMS = tag("misc_ancindicator_items");
        public static final TagKey<Item> ERASERS = tag("erasers");
        public static final TagKey<Item> ALL_COLOR_PALETTES = tag("all_color_palettes");
        public static final TagKey<Item> BLOCK_COLOR_PALETTES = tag("block_color_palettes");
        public static final TagKey<Item> TEXT_COLOR_PALETTES = tag("text_color_palettes");
        public static final TagKey<Item> ALL_PAINTS = tag("all_paints");
        public static final TagKey<Item> STRONG_PAINTS = tag("strong_paints");
        public static final TagKey<Item> WEAK_PAINTS = tag("strong_paints");
        public static final TagKey<Item> SPECIAL_PAINTS = tag("special_paints");
        public static final TagKey<Item> COLORING_TOOLS = tag("coloring_tools");


        //Letters
        public static final TagKey<Item> LETTER_A = tag("letter_a");
        public static final TagKey<Item> LETTER_B = tag("letter_b");
        public static final TagKey<Item> LETTER_C = tag("letter_c");



        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(ANCIndicators.MOD_ID, name));
        }
    }
}