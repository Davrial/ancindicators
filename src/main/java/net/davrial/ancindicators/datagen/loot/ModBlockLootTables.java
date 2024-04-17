package net.davrial.ancindicators.datagen.loot;

import net.davrial.ancindicators.block.ModBlocks;
import net.davrial.ancindicators.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        /*
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());

        this.add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.END_STONE_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));

        this.dropSelf(ModBlocks.SAPPHIRE_STAIRS.get());
        this.dropSelf(ModBlocks.SAPPHIRE_BUTTON.get());
        this.dropSelf(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.SAPPHIRE_FENCE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_WALL.get());

        this.add(ModBlocks.SAPPHIRE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SAPPHIRE_SLAB.get()));
        this.add(ModBlocks.SAPPHIRE_DOOR.get(),
                block -> createDoorTable(ModBlocks.SAPPHIRE_DOOR.get()));
        */

        //FILL IN BLOCKS HERE
        //Main Blocks
        this.dropSelf(ModBlocks.BLANK_INDICATOR_BLOCK.get());
        this.dropSelf(ModBlocks.DARKENED_BLANK_INDICATOR_BLOCK.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_TEMPLATE_BLOCK.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_TEMPLATE_BLOCK.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_TEMPLATE_BLOCK.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_TEMPLATE_BLOCK_DARKENED.get());

        //Alphabetic Blocks
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_A.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_B.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_C.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_D.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_E.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_F.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_G.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_H.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_I.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_J.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_K.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_L.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_M.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_N.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_O.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_P.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Q.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_R.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_S.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_T.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_U.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_V.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_W.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_X.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Y.get());
        this.dropSelf(ModBlocks.ALPHABETIC_INDICATOR_BLOCK_Z.get());

        //Numeric Blocks
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_0.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_1.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_2.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_3.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_4.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_5.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_6.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_7.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_8.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_9.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_10.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_11.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_12.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_13.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_14.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_15.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_16.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_32.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_64.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_1000.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_EVEN.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_ODD.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_INFINITY.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_ADD.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_SUBTRACT.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_MULTIPLY.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_DIVIDE.get());
        this.dropSelf(ModBlocks.NUMERIC_INDICATOR_BLOCK_EQUALS.get());

        //Block Color Blocks
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_WHITE.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_GRAY.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GRAY.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLACK.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BROWN.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_RED.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_ORANGE.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_YELLOW.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIME.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GREEN.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_CYAN.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_BLUE.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLUE.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PURPLE.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_MAGENTA.get());
        this.dropSelf(ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PINK.get());

        //Text Color Blocks
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_BLACK.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_BLUE.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_GREEN.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_AQUA.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_RED.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_PURPLE.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GOLD.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GRAY.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_DARK_GRAY.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_BLUE.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_GREEN.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_AQUA.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_RED.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_LIGHT_PURPLE.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_YELLOW.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_WHITE.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MINECOIN_GOLD.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_QUARTZ.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_IRON.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_NETHERITE.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_REDSTONE.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_COPPER.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_GOLD.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_EMERALD.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_DIAMOND.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_LAPIS.get());
        this.dropSelf(ModBlocks.TEXT_COLOR_INDICATOR_BLOCK_MATERIAL_AMETHYST.get());


    }





    /*NO CHANGES NEEDED PAST THIS LINE*/





    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}