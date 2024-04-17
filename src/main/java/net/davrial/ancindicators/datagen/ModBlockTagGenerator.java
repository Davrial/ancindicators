package net.davrial.ancindicators.datagen;

import net.davrial.ancindicators.ANCIndicators;
import net.davrial.ancindicators.block.ModBlocks;
import net.davrial.ancindicators.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
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

        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
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

        this.tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
                //.add(ModBlocks.SOUND_BLOCK.get())
        ;

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
        ;

        this.tag(ModTags.Blocks.BLANK_INDICATOR_BLOCKS)
                .add(ModBlocks.BLANK_INDICATOR_BLOCK.get(),
                        ModBlocks.DARKENED_BLANK_INDICATOR_BLOCK.get()
                )
        ;

        this.tag(ModTags.Blocks.NON_BLANK_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.ALPHABETIC_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.NUMERIC_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.BLOCK_COLOR_INDICATOR_BLOCKS)
                .addTag(ModTags.Blocks.TEXT_COLOR_INDICATOR_BLOCKS)
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

    }
}