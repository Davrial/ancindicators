package net.davrial.ancindicators.datagen;

import net.davrial.ancindicators.ANCIndicators;
import net.davrial.ancindicators.block.ModBlocks;
import net.davrial.ancindicators.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ANCIndicators.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        //FILL IN BLOCKS HERE
        //FILL IN TAGS HERE

        //this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                //.add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES)
        ;

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                /*.add(ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                        ModBlocks.END_STONE_SAPPHIRE_ORE.get(),
                        ModBlocks.SOUND_BLOCK.get()
                )*/
                .addTag(ModTags.Blocks.ALL_INDICATOR_BLOCKS)
        ;


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                //.add(ModBlocks.SAPPHIRE_BLOCK.get())
        ;

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                //.add(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
        ;

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                //.add(ModBlocks.NETHER_SAPPHIRE_ORE.get())
        ;

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                //.add(ModBlocks.END_STONE_SAPPHIRE_ORE.get())
        ;

        /*
        this.tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
                .add(ModBlocks.SOUND_BLOCK.get())
        ;
        */

        this.tag(BlockTags.FENCES)
                //.add(ModBlocks.SAPPHIRE_FENCE.get())
        ;
        this.tag(BlockTags.FENCE_GATES)
                //.add(ModBlocks.SAPPHIRE_FENCE_GATE.get())
        ;
        this.tag(BlockTags.WALLS)
                //.add(ModBlocks.SAPPHIRE_WALL.get())
        ;



        this.tag(ModTags.Blocks.ALL_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.BLANK_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.NON_BLANK_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.ADVANCED_INDICATOR_BLOCKS)
        ;

        this.tag(ModTags.Blocks.BLANK_INDICATOR_BLOCKS)
                .add(ModBlocks.BLANK_INDICATOR_BLOCK.get(),
                        ModBlocks.DARKENED_BLANK_INDICATOR_BLOCK.get(),
                        ModBlocks.BLANK_REDSTONE_INDICATOR_BLOCK.get(),
                        ModBlocks.BLANK_LIGHT_LEVEL_INDICATOR_BLOCK.get()
                )
        ;

        this.tag(ModTags.Blocks.NON_BLANK_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.ALPHABETIC_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.NUMERIC_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.BLOCK_COLOR_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.TEXT_COLOR_INDICATOR_BLOCKS)
        ;

        this.tag(ModTags.Blocks.ADVANCED_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.REDSTONE_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.LIGHT_LEVEL_INDICATOR_BLOCKS)
        ;


        this.tag(ModTags.Blocks.COLOR_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.BLOCK_COLOR_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.TEXT_COLOR_INDICATOR_BLOCKS)
        ;

        this.tag(ModTags.Blocks.ALPHABETIC_INDICATOR_BLOCKS)
                .add(ModBlocks.ALPHABETIC_INDICATOR_TEMPLATE_BLOCK.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_A.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_B.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_C.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_D.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_E.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_F.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_G.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_H.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_I.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_J.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_K.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_L.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_M.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_N.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_O.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_P.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Q.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_R.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_S.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_T.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_U.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_V.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_W.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_X.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Y.get(),
                    ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Z.get()
                    )
        ;

        this.tag(ModTags.Blocks.NUMERIC_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.MISC_NUMERIC_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.EVEN_NUMERIC_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.ODD_NUMERIC_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.MATH_NUMERIC_INDICATOR_BLOCKS)
        ;

        this.tag(ModTags.Blocks.MISC_NUMERIC_INDICATOR_BLOCKS)
                .add(ModBlocks.NUMERIC_INDICATOR_TEMPLATE_BLOCK.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_0.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_INFINITY.get()
                )
        ;

        this.tag(ModTags.Blocks.EVEN_NUMERIC_INDICATOR_BLOCKS)
                .add(ModBlocks.NUMERIC_INDICATOR_BLOCK_2.get(),
                    ModBlocks.NUMERIC_INDICATOR_BLOCK_4.get(),
                    ModBlocks.NUMERIC_INDICATOR_BLOCK_6.get(),
                    ModBlocks.NUMERIC_INDICATOR_BLOCK_8.get(),
                    ModBlocks.NUMERIC_INDICATOR_BLOCK_10.get(),
                    ModBlocks.NUMERIC_INDICATOR_BLOCK_12.get(),
                    ModBlocks.NUMERIC_INDICATOR_BLOCK_14.get(),
                    ModBlocks.NUMERIC_INDICATOR_BLOCK_16.get(),
                    ModBlocks.NUMERIC_INDICATOR_BLOCK_32.get(),
                    ModBlocks.NUMERIC_INDICATOR_BLOCK_64.get(),
                    ModBlocks.NUMERIC_INDICATOR_BLOCK_1000.get(),
                    ModBlocks.NUMERIC_INDICATOR_BLOCK_EVEN.get()
                )
        ;

        this.tag(ModTags.Blocks.ODD_NUMERIC_INDICATOR_BLOCKS)
            .add(ModBlocks.NUMERIC_INDICATOR_BLOCK_1.get(),
                ModBlocks.NUMERIC_INDICATOR_BLOCK_3.get(),
                ModBlocks.NUMERIC_INDICATOR_BLOCK_5.get(),
                ModBlocks.NUMERIC_INDICATOR_BLOCK_7.get(),
                ModBlocks.NUMERIC_INDICATOR_BLOCK_11.get(),
                ModBlocks.NUMERIC_INDICATOR_BLOCK_13.get(),
                ModBlocks.NUMERIC_INDICATOR_BLOCK_15.get(),
                ModBlocks.NUMERIC_INDICATOR_BLOCK_ODD.get()
            )
        ;

        this.tag(ModTags.Blocks.MATH_NUMERIC_INDICATOR_BLOCKS)
                .add(ModBlocks.NUMERIC_INDICATOR_BLOCK_ADD.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_SUBTRACT.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_MULTIPLY.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_DIVIDE.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_EQUALS.get()
                )
        ;

        this.tag(ModTags.Blocks.BLOCK_COLOR_INDICATOR_BLOCKS)
                .add(ModBlocks.BLOCK_COLOR_INDICATOR_TEMPLATE_BLOCK.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_WHITE.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_GRAY.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GRAY.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLACK.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BROWN.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_RED.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_ORANGE.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_YELLOW.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIME.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GREEN.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_CYAN.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_BLUE.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLUE.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PURPLE.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_MAGENTA.get(),
                    ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PINK.get()
                )
        ;

        this.tag(ModTags.Blocks.TEXT_COLOR_INDICATOR_BLOCKS)
                .add(ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_BLACK.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_BLUE.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_GREEN.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_AQUA.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_RED.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_PURPLE.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GOLD.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GRAY.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_GRAY.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_BLUE.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GREEN.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_AQUA.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_RED.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_LIGHT_PURPLE.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_YELLOW.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_WHITE.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MINECOIN_GOLD.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_QUARTZ.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_IRON.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_NETHERITE.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_REDSTONE.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_COPPER.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_GOLD.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_EMERALD.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_DIAMOND.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_LAPIS.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_AMETHYST.get(),
                    ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK_DARKENED.get()
                )
        ;

        this.tag(ModTags.Blocks.TEXT_COLOR_INDICATOR_BLOCKS_DARK)
                .add(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_BLACK.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_BLUE.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_GREEN.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_AQUA.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_RED.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_PURPLE.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GOLD.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GRAY.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_GRAY.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_BLUE.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GREEN.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_AQUA.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_RED.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_LIGHT_PURPLE.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_YELLOW.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_WHITE.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MINECOIN_GOLD.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_QUARTZ.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_IRON.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_NETHERITE.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_REDSTONE.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_COPPER.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_GOLD.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_EMERALD.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_DIAMOND.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_LAPIS.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_AMETHYST.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK_DARKENED.get()
                )
        ;

        this.tag(ModTags.Blocks.REDSTONE_INDICATOR_BLOCKS)
                .add(ModBlocks.REDSTONE_INDICATOR_BLOCK_0.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_1.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_2.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_3.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_4.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_5.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_6.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_7.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_8.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_9.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_10.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_11.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_12.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_13.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_14.get(),
                    ModBlocks.REDSTONE_INDICATOR_BLOCK_15.get(),
                    ModBlocks.REDSTONE_INDICATOR_TEMPLATE_BLOCK.get(),
                    ModBlocks.BLANK_REDSTONE_INDICATOR_BLOCK.get()
                )
        ;

        this.tag(ModTags.Blocks.LIGHT_LEVEL_INDICATOR_BLOCKS)
                .add(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_0.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_1.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_2.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_3.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_4.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_5.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_6.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_7.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_8.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_9.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_10.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_11.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_12.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_13.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_14.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_15.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_TEMPLATE_BLOCK.get(),
                        ModBlocks.BLANK_LIGHT_LEVEL_INDICATOR_BLOCK.get()
                )
        ;



        //All Erasable Block Tags
        this.tag(ModTags.Blocks.ERASABLE_TO_BLANK_BLOCKS)
                .add(
                        ModBlocks.ALPHABETIC_INDICATOR_TEMPLATE_BLOCK.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_A.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_B.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_C.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_D.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_E.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_F.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_G.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_H.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_I.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_J.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_K.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_L.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_M.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_N.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_O.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_P.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Q.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_R.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_S.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_T.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_U.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_V.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_W.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_X.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Y.get(),
                        ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Z.get(),
                        ModBlocks.NUMERIC_INDICATOR_TEMPLATE_BLOCK.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_0.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_INFINITY.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_2.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_4.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_6.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_8.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_10.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_12.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_14.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_16.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_32.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_64.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_1000.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_EVEN.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_1.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_3.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_5.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_7.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_11.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_13.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_15.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_ODD.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_ADD.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_SUBTRACT.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_MULTIPLY.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_DIVIDE.get(),
                        ModBlocks.NUMERIC_INDICATOR_BLOCK_EQUALS.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_TEMPLATE_BLOCK.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_WHITE.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_GRAY.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GRAY.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLACK.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BROWN.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_RED.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_ORANGE.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_YELLOW.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIME.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GREEN.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_CYAN.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_BLUE.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLUE.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PURPLE.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_MAGENTA.get(),
                        ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PINK.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK.get(),
                        ModBlocks.DARKENED_BLANK_INDICATOR_BLOCK.get()
                )
        ;

        this.tag(ModTags.Blocks.ERASABLE_TO_DARKENED_BLOCKS)
                .add(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_BLACK.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_BLUE.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_GREEN.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_AQUA.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_RED.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_PURPLE.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GOLD.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GRAY.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_GRAY.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_BLUE.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GREEN.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_AQUA.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_RED.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_LIGHT_PURPLE.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_YELLOW.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_WHITE.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MINECOIN_GOLD.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_QUARTZ.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_IRON.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_NETHERITE.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_REDSTONE.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_COPPER.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_GOLD.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_EMERALD.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_DIAMOND.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_LAPIS.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_AMETHYST.get(),
                        ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK_DARKENED.get()
                )
        ;

        this.tag(ModTags.Blocks.ERASABLE_TO_REDSTONE_LEVEL_BLOCKS)
                .add(ModBlocks.REDSTONE_INDICATOR_BLOCK_0.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_1.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_2.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_3.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_4.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_5.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_6.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_7.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_8.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_9.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_10.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_11.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_12.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_13.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_14.get(),
                        ModBlocks.REDSTONE_INDICATOR_BLOCK_15.get(),
                        ModBlocks.REDSTONE_INDICATOR_TEMPLATE_BLOCK.get()
                )
        ;
        this.tag(ModTags.Blocks.ERASABLE_TO_PLAIN_REDSTONE_BLOCKS).add(ModBlocks.BLANK_REDSTONE_INDICATOR_BLOCK.get());

        this.tag(ModTags.Blocks.ERASABLE_TO_LIGHT_LEVEL_BLOCKS)
                .add(ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_0.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_1.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_2.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_3.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_4.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_5.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_6.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_7.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_8.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_9.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_10.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_11.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_12.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_13.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_14.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_BLOCK_15.get(),
                        ModBlocks.LIGHT_LEVEL_INDICATOR_TEMPLATE_BLOCK.get()
                )
        ;
        this.tag(ModTags.Blocks.ERASABLE_TO_PLAIN_GLOWSTONE_BLOCKS).add(ModBlocks.BLANK_LIGHT_LEVEL_INDICATOR_BLOCK.get());

        this.tag(ModTags.Blocks.ALL_ERASABLE_BLOCKS)
                .addTag(ModTags.Blocks.ERASABLE_TO_BLANK_BLOCKS)
                .addTag(ModTags.Blocks.ERASABLE_TO_DARKENED_BLOCKS)
                .addTag(ModTags.Blocks.ERASABLE_TO_REDSTONE_LEVEL_BLOCKS)
                .addTag(ModTags.Blocks.ERASABLE_TO_LIGHT_LEVEL_BLOCKS)
                .addTag(ModTags.Blocks.ERASABLE_TO_PLAIN_REDSTONE_BLOCKS)
                .addTag(ModTags.Blocks.ERASABLE_TO_PLAIN_GLOWSTONE_BLOCKS)

        ;



        //Paintable Tags
        this.tag(ModTags.Blocks.ALL_PAINTABLE_BLOCKS)
                .addTag(ModTags.Blocks.PAINTABLE_VANILLA_BLOCKS)
                .addTag(ModTags.Blocks.COLOR_INDICATOR_BLOCKS)
        ;

        this.tag(ModTags.Blocks.PAINTABLE_VANILLA_BLOCKS)
                .addTag(ModTags.Blocks.PAINTABLES_WOOL)
                .addTag(ModTags.Blocks.PAINTABLES_CARPETS)
                .addTag(ModTags.Blocks.PAINTABLES_BEDS)
                .addTag(ModTags.Blocks.PAINTABLES_TERRACOTTA)
                .addTag(ModTags.Blocks.PAINTABLES_CONCRETE)
                .addTag(ModTags.Blocks.PAINTABLES_CONCRETE_POWDER)
                .addTag(ModTags.Blocks.PAINTABLES_SHULKER_BOXES)
        ;

        this.tag(ModTags.Blocks.PAINTABLES_WOOL)
                .add(Blocks.WHITE_WOOL)
                .add(Blocks.LIGHT_GRAY_WOOL)
                .add(Blocks.GRAY_WOOL)
                .add(Blocks.BLACK_WOOL)
                .add(Blocks.BROWN_WOOL)
                .add(Blocks.RED_WOOL)
                .add(Blocks.ORANGE_WOOL)
                .add(Blocks.YELLOW_WOOL)
                .add(Blocks.LIME_WOOL)
                .add(Blocks.GREEN_WOOL)
                .add(Blocks.CYAN_WOOL)
                .add(Blocks.LIGHT_BLUE_WOOL)
                .add(Blocks.BLUE_WOOL)
                .add(Blocks.PURPLE_WOOL)
                .add(Blocks.MAGENTA_WOOL)
                .add(Blocks.PINK_WOOL)
        ;

        this.tag(ModTags.Blocks.PAINTABLES_CARPETS)
                .add(Blocks.WHITE_CARPET)
                .add(Blocks.LIGHT_GRAY_CARPET)
                .add(Blocks.GRAY_CARPET)
                .add(Blocks.BLACK_CARPET)
                .add(Blocks.BROWN_CARPET)
                .add(Blocks.RED_CARPET)
                .add(Blocks.ORANGE_CARPET)
                .add(Blocks.YELLOW_CARPET)
                .add(Blocks.LIME_CARPET)
                .add(Blocks.GREEN_CARPET)
                .add(Blocks.CYAN_CARPET)
                .add(Blocks.LIGHT_BLUE_CARPET)
                .add(Blocks.BLUE_CARPET)
                .add(Blocks.PURPLE_CARPET)
                .add(Blocks.MAGENTA_CARPET)
                .add(Blocks.PINK_CARPET)
        ;

        this.tag(ModTags.Blocks.PAINTABLES_BEDS)
                .add(Blocks.WHITE_BED)
                .add(Blocks.LIGHT_GRAY_BED)
                .add(Blocks.GRAY_BED)
                .add(Blocks.BLACK_BED)
                .add(Blocks.BROWN_BED)
                .add(Blocks.RED_BED)
                .add(Blocks.ORANGE_BED)
                .add(Blocks.YELLOW_BED)
                .add(Blocks.LIME_BED)
                .add(Blocks.GREEN_BED)
                .add(Blocks.CYAN_BED)
                .add(Blocks.LIGHT_BLUE_BED)
                .add(Blocks.BLUE_BED)
                .add(Blocks.PURPLE_BED)
                .add(Blocks.MAGENTA_BED)
                .add(Blocks.PINK_BED)
        ;

        this.tag(ModTags.Blocks.PAINTABLES_TERRACOTTA)
                .add(Blocks.TERRACOTTA)
                .add(Blocks.WHITE_TERRACOTTA)
                .add(Blocks.LIGHT_GRAY_TERRACOTTA)
                .add(Blocks.GRAY_TERRACOTTA)
                .add(Blocks.BLACK_TERRACOTTA)
                .add(Blocks.BROWN_TERRACOTTA)
                .add(Blocks.RED_TERRACOTTA)
                .add(Blocks.ORANGE_TERRACOTTA)
                .add(Blocks.YELLOW_TERRACOTTA)
                .add(Blocks.LIME_TERRACOTTA)
                .add(Blocks.GREEN_TERRACOTTA)
                .add(Blocks.CYAN_TERRACOTTA)
                .add(Blocks.LIGHT_BLUE_TERRACOTTA)
                .add(Blocks.BLUE_TERRACOTTA)
                .add(Blocks.PURPLE_TERRACOTTA)
                .add(Blocks.MAGENTA_TERRACOTTA)
                .add(Blocks.PINK_TERRACOTTA)
        ;

        this.tag(ModTags.Blocks.PAINTABLES_CONCRETE)
                .add(Blocks.WHITE_CONCRETE)
                .add(Blocks.LIGHT_GRAY_CONCRETE)
                .add(Blocks.GRAY_CONCRETE)
                .add(Blocks.BLACK_CONCRETE)
                .add(Blocks.BROWN_CONCRETE)
                .add(Blocks.RED_CONCRETE)
                .add(Blocks.ORANGE_CONCRETE)
                .add(Blocks.YELLOW_CONCRETE)
                .add(Blocks.LIME_CONCRETE)
                .add(Blocks.GREEN_CONCRETE)
                .add(Blocks.CYAN_CONCRETE)
                .add(Blocks.LIGHT_BLUE_CONCRETE)
                .add(Blocks.BLUE_CONCRETE)
                .add(Blocks.PURPLE_CONCRETE)
                .add(Blocks.MAGENTA_CONCRETE)
                .add(Blocks.PINK_CONCRETE)
        ;

        this.tag(ModTags.Blocks.PAINTABLES_CONCRETE_POWDER)
                .add(Blocks.WHITE_CONCRETE_POWDER)
                .add(Blocks.LIGHT_GRAY_CONCRETE_POWDER)
                .add(Blocks.GRAY_CONCRETE_POWDER)
                .add(Blocks.BLACK_CONCRETE_POWDER)
                .add(Blocks.BROWN_CONCRETE_POWDER)
                .add(Blocks.RED_CONCRETE_POWDER)
                .add(Blocks.ORANGE_CONCRETE_POWDER)
                .add(Blocks.YELLOW_CONCRETE_POWDER)
                .add(Blocks.LIME_CONCRETE_POWDER)
                .add(Blocks.GREEN_CONCRETE_POWDER)
                .add(Blocks.CYAN_CONCRETE_POWDER)
                .add(Blocks.LIGHT_BLUE_CONCRETE_POWDER)
                .add(Blocks.BLUE_CONCRETE_POWDER)
                .add(Blocks.PURPLE_CONCRETE_POWDER)
                .add(Blocks.MAGENTA_CONCRETE_POWDER)
                .add(Blocks.PINK_CONCRETE_POWDER)
        ;

        this.tag(ModTags.Blocks.PAINTABLES_SHULKER_BOXES)
                .add(Blocks.SHULKER_BOX)
                .add(Blocks.WHITE_SHULKER_BOX)
                .add(Blocks.LIGHT_GRAY_SHULKER_BOX)
                .add(Blocks.GRAY_SHULKER_BOX)
                .add(Blocks.BLACK_SHULKER_BOX)
                .add(Blocks.BROWN_SHULKER_BOX)
                .add(Blocks.RED_SHULKER_BOX)
                .add(Blocks.ORANGE_SHULKER_BOX)
                .add(Blocks.YELLOW_SHULKER_BOX)
                .add(Blocks.LIME_SHULKER_BOX)
                .add(Blocks.GREEN_SHULKER_BOX)
                .add(Blocks.CYAN_SHULKER_BOX)
                .add(Blocks.LIGHT_BLUE_SHULKER_BOX)
                .add(Blocks.BLUE_SHULKER_BOX)
                .add(Blocks.PURPLE_SHULKER_BOX)
                .add(Blocks.MAGENTA_SHULKER_BOX)
                .add(Blocks.PINK_SHULKER_BOX)
        ;

        this.tag(ModTags.Blocks.PAINTABLES_BANNERS)
                .add(Blocks.WHITE_BANNER)
                .add(Blocks.WHITE_WALL_BANNER)
                .add(Blocks.LIGHT_GRAY_BANNER)
                .add(Blocks.LIGHT_GRAY_WALL_BANNER)
                .add(Blocks.GRAY_BANNER)
                .add(Blocks.GRAY_WALL_BANNER)
                .add(Blocks.BLACK_BANNER)
                .add(Blocks.BLACK_WALL_BANNER)
                .add(Blocks.BROWN_BANNER)
                .add(Blocks.BROWN_WALL_BANNER)
                .add(Blocks.RED_BANNER)
                .add(Blocks.RED_WALL_BANNER)
                .add(Blocks.ORANGE_BANNER)
                .add(Blocks.ORANGE_WALL_BANNER)
                .add(Blocks.YELLOW_BANNER)
                .add(Blocks.YELLOW_WALL_BANNER)
                .add(Blocks.LIME_BANNER)
                .add(Blocks.LIME_WALL_BANNER)
                .add(Blocks.GREEN_BANNER)
                .add(Blocks.GREEN_WALL_BANNER)
                .add(Blocks.CYAN_BANNER)
                .add(Blocks.CYAN_WALL_BANNER)
                .add(Blocks.LIGHT_BLUE_BANNER)
                .add(Blocks.LIGHT_BLUE_WALL_BANNER)
                .add(Blocks.BLUE_BANNER)
                .add(Blocks.BLUE_WALL_BANNER)
                .add(Blocks.PURPLE_BANNER)
                .add(Blocks.PURPLE_WALL_BANNER)
                .add(Blocks.MAGENTA_BANNER)
                .add(Blocks.MAGENTA_WALL_BANNER)
                .add(Blocks.PINK_BANNER)
                .add(Blocks.PINK_WALL_BANNER)
        ;

        this.tag(ModTags.Blocks.PAINTABLES_CANDLES)
                .add(Blocks.WHITE_CANDLE)
                .add(Blocks.LIGHT_GRAY_CANDLE)
                .add(Blocks.GRAY_CANDLE)
                .add(Blocks.BLACK_CANDLE)
                .add(Blocks.BROWN_CANDLE)
                .add(Blocks.RED_CANDLE)
                .add(Blocks.ORANGE_CANDLE)
                .add(Blocks.YELLOW_CANDLE)
                .add(Blocks.LIME_CANDLE)
                .add(Blocks.GREEN_CANDLE)
                .add(Blocks.CYAN_CANDLE)
                .add(Blocks.LIGHT_BLUE_CANDLE)
                .add(Blocks.BLUE_CANDLE)
                .add(Blocks.PURPLE_CANDLE)
                .add(Blocks.MAGENTA_CANDLE)
                .add(Blocks.PINK_CANDLE)
        ;

    }
}