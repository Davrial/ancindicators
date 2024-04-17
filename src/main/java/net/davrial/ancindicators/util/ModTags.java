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
        public static final TagKey<Item> LIGHT_LEVEL_INDICATOR_BLOCK_ITEMS = tag("redstone_indicator_block_items");
        public static final TagKey<Item> INDICATOR_DARKENING_ITEMS = tag("indicator_darkening_items");
        public static final TagKey<Item> INDICATOR_DARKENING_ITEMS_WITH_DYES = tag("indicator_darkening_items_with_dyes");
        public static final TagKey<Item> WRITING_ITEMS = tag("writing_items");
        public static final TagKey<Item> BASE_INDICATOR_CRAFTING_BLOCKS = tag("base_indicator_crafting_blocks");
        public static final TagKey<Item> BETTER_INDICATOR_CRAFTING_BLOCKS = tag("better_indicator_crafting_blocks");
        public static final TagKey<Item> INDICATOR_CRAFTING_ITEMS = tag("indicator_crafting_materials");
        public static final TagKey<Item> MISC_ANCINDICATOR_ITEMS = tag("misc_ancindicator_items");
        public static final TagKey<Item> LETTER_A = tag("letter_a");
        public static final TagKey<Item> LETTER_B = tag("letter_b");
        public static final TagKey<Item> LETTER_C = tag("letter_c");



        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(ANCIndicators.MOD_ID, name));
        }
    }
}