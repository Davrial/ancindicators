package net.davrial.ancindicators.datagen;

import net.davrial.ancindicators.ANCIndicators;
import net.davrial.ancindicators.block.ModBlocks;
import net.davrial.ancindicators.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ANCIndicators.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        /*
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.RAW_SAPPHIRE);

        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.PINE_CONE);
        simpleItem(ModItems.STRAWBERRY);

        simpleBlockItem(ModBlocks.SAPPHIRE_DOOR);

        fenceItem(ModBlocks.SAPPHIRE_FENCE, ModBlocks.SAPPHIRE_BLOCK);
        buttonItem(ModBlocks.SAPPHIRE_BUTTON, ModBlocks.SAPPHIRE_BLOCK);
        wallItem(ModBlocks.SAPPHIRE_WALL, ModBlocks.SAPPHIRE_BLOCK);

        evenSimplerBlockItem(ModBlocks.SAPPHIRE_STAIRS);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_SLAB);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_FENCE_GATE);

        trapdoorItem(ModBlocks.SAPPHIRE_TRAPDOOR);

        handheldItem(ModItems.SAPPHIRE_SWORD);
        handheldItem(ModItems.SAPPHIRE_PICKAXE);
        handheldItem(ModItems.SAPPHIRE_AXE);
        handheldItem(ModItems.SAPPHIRE_SHOVEL);
        handheldItem(ModItems.SAPPHIRE_HOE);

        trimmedArmorItem(ModItems.SAPPHIRE_HELMET);
        trimmedArmorItem(ModItems.SAPPHIRE_CHESTPLATE);
        trimmedArmorItem(ModItems.SAPPHIRE_LEGGINGS);
        trimmedArmorItem(ModItems.SAPPHIRE_BOOTS);

         */



        //FILL IN ITEMS HERE

        //Main Items
        simpleItem(ModItems.BLANK_INDICATOR_ITEM);
        simpleItem(ModItems.DARKENED_BLANK_INDICATOR_ITEM);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_TEMPLATE_ITEM);
        simpleItem(ModItems.NUMERIC_INDICATOR_TEMPLATE_ITEM);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_TEMPLATE_ITEM);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM_DARKENED);
        simpleItem(ModItems.REDSTONE_INDICATOR_TEMPLATE_ITEM);
        simpleItem(ModItems.BLANK_REDSTONE_INDICATOR_ITEM);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_TEMPLATE_ITEM);
        simpleItem(ModItems.BLANK_LIGHT_LEVEL_INDICATOR_ITEM);
        evenSimplerBlockItem(ModBlocks.INDICATOR_STAIRS);
        evenSimplerBlockItem(ModBlocks.INDICATOR_PRESSURE_PLATE);
        simpleBlockItem(ModBlocks.INDICATOR_DOOR);
        trapdoorItem(ModBlocks.INDICATOR_TRAPDOOR);
        evenSimplerBlockItem(ModBlocks.DARKENED_INDICATOR_STAIRS);
        evenSimplerBlockItem(ModBlocks.DARKENED_INDICATOR_PRESSURE_PLATE);
        simpleBlockItem(ModBlocks.DARKENED_INDICATOR_DOOR);
        trapdoorItem(ModBlocks.DARKENED_INDICATOR_TRAPDOOR);




        //Misc Items
        handheldItem(ModItems.ERASER);
        handheldItem(ModItems.MAGIC_ERASER);
        handheldItem(ModItems.PALETTE);
        handheldItem(ModItems.PALETTE_BLOCKS);
        handheldItem(ModItems.PALETTE_TEXT);
        handheldItem(ModItems.GETTER_STICK);


        //Bottles
        handheldItem(ModItems.BOTTLE_OF_PAINT_BASE);
        handheldItem(ModItems.VIAL_OF_DARKENING_SOLUTION_BLACK);
        handheldItem(ModItems.VIAL_OF_CLEANING_SOLUTION_WHITE);
        handheldItem(ModItems.FLASK_OF_ETERNAL_DARKNESS);
        handheldItem(ModItems.VESSEL_OF_INFINITE_LIGHT);
        //Paints
        handheldItem(ModItems.VIAL_OF_PAINT_STRONG_BROWN);
        handheldItem(ModItems.VIAL_OF_PAINT_STRONG_RED);
        handheldItem(ModItems.VIAL_OF_PAINT_STRONG_ORANGE);
        handheldItem(ModItems.VIAL_OF_PAINT_STRONG_YELLOW);
        handheldItem(ModItems.VIAL_OF_PAINT_STRONG_LIME);
        handheldItem(ModItems.VIAL_OF_PAINT_STRONG_GREEN);
        handheldItem(ModItems.VIAL_OF_PAINT_STRONG_CYAN);
        handheldItem(ModItems.VIAL_OF_PAINT_STRONG_LIGHT_BLUE);
        handheldItem(ModItems.VIAL_OF_PAINT_STRONG_BLUE);
        handheldItem(ModItems.VIAL_OF_PAINT_STRONG_PURPLE);
        handheldItem(ModItems.VIAL_OF_PAINT_STRONG_MAGENTA);
        handheldItem(ModItems.VIAL_OF_PAINT_STRONG_PINK);

        //Alphabetic Items
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_A);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_B);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_C);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_D);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_E);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_F);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_G);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_H);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_I);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_J);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_K);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_L);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_M);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_N);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_O);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_P);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_Q);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_R);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_S);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_T);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_U);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_V);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_W);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_X);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_Y);
        simpleItem(ModItems.ALPHABETIC_INDICATOR_ITEM_Z);

        //Numeric Items
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_0);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_1);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_2);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_3);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_4);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_5);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_6);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_7);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_8);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_9);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_10);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_11);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_12);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_13);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_14);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_15);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_16);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_32);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_64);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_1000);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_EVEN);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_ODD);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_INFINITY);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_ADD);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_SUBTRACT);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_MULTIPLY);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_DIVIDE);
        simpleItem(ModItems.NUMERIC_INDICATOR_ITEM_EQUALS);

        //Block Color Items
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_WHITE);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_LIGHT_GRAY);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_GRAY);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_BLACK);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_BROWN);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_RED);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_ORANGE);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_YELLOW);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_LIME);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_GREEN);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_CYAN);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_LIGHT_BLUE);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_BLUE);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_PURPLE);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_MAGENTA);
        simpleItem(ModItems.BLOCK_COLOR_INDICATOR_ITEM_PINK);

        //Text Color Items
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_BLACK);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_BLUE);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_GREEN);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_AQUA);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_RED);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_PURPLE);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_GOLD);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_GRAY);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_GRAY);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_BLUE);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_GREEN);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_AQUA);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_RED);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_LIGHT_PURPLE);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_YELLOW);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_WHITE);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_MINECOIN_GOLD);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_QUARTZ);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_IRON);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_NETHERITE);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_REDSTONE);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_COPPER);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_GOLD);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_EMERALD);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_DIAMOND);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_LAPIS);
        simpleItem(ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_AMETHYST);

        //Redstone Items
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_0);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_1);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_2);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_3);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_4);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_5);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_6);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_7);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_8);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_9);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_10);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_11);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_12);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_13);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_14);
        simpleItem(ModItems.REDSTONE_INDICATOR_ITEM_15);

        //Light Level Items
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_0);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_1);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_2);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_3);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_4);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_5);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_6);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_7);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_8);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_9);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_10);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_11);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_12);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_13);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_14);
        simpleItem(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_15);

    }






    /*NO CHANGES NEEDED PAST THIS LINE*/





    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = ANCIndicators.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ANCIndicators.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(ANCIndicators.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(ANCIndicators.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(ANCIndicators.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(ANCIndicators.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ANCIndicators.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ANCIndicators.MOD_ID,"item/" + item.getId().getPath()));
    }
}