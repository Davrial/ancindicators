package net.davrial.ancindicators.procedures;

import com.mojang.brigadier.StringReader;
import net.davrial.ancindicators.ANCIndicators;
import net.davrial.ancindicators.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;

import javax.json.Json;
import javax.json.JsonObject;
import javax.management.StringValueExp;
import javax.swing.text.StringContent;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.util.Map;
import java.util.StringJoiner;

public class ModNameAndBlockNameExtracterGetterProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
        BlockState clickedBlock = world.getBlockState(BlockPos.containing(x, y, z));
        if (itemstack.getItem() == ModItems.GETTER_STICK.get()) {
            //Mod Name and Item Name Getter
            //if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:beds")))) {
                ANCIndicators.LOGGER.info(ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString());
                ANCIndicators.LOGGER.info(String.valueOf(world.getBlockState(BlockPos.containing(x, y, z))));
                ANCIndicators.LOGGER.info((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _getep16
                        ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep16).toString()
                        : "");
                ANCIndicators.LOGGER.info((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("part") instanceof EnumProperty _getep18
                        ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep18).toString()
                        : "");
                final String GetTextInitial = ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
                String GetText = ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
                ANCIndicators.LOGGER.info("Get Text Start: " + GetText);
                int GetNumber = GetText.length();
                final int GetNumberInitial = GetTextInitial.length();
                ANCIndicators.LOGGER.info("Get Number Start: " + GetNumber);
                boolean LoopFlag = true;
                String GetTextColon = "";
                while (LoopFlag == true) {
                    for (int index1 = 1; index1 <= (int) GetNumberInitial; index1++) {
                        GetNumber = GetNumber - 1;
                        GetText = (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).substring(0, (int) GetNumber);
                        //ANCIndicators.LOGGER.info("Get Text Looping: " + GetText);
                        //ANCIndicators.LOGGER.info("Get Number Looping: " + GetNumber);
                        if (GetText.endsWith(":") == true){
                        GetTextColon = GetText;
                        //ANCIndicators.LOGGER.info("Get Text Colon Looping: " + GetTextColon);
                        };
                        if (GetTextColon.endsWith(":") == true) {
                            LoopFlag = false;
                        }
                    }
                }
                final String GetTextFinal = GetTextColon;
                ANCIndicators.LOGGER.info("Get Text Initial End: " + GetTextInitial);
                ANCIndicators.LOGGER.info("Get Text End: " + GetText);
                ANCIndicators.LOGGER.info("Get Text Colon End: " + GetTextColon);
                ANCIndicators.LOGGER.info("Get Text Final End: " + GetTextFinal);
                ANCIndicators.LOGGER.info("Get Number Initial End: " + GetNumberInitial);
                ANCIndicators.LOGGER.info("Get Number End: " + GetNumber);
                int GetNumberColon = GetTextColon.length();
                final int GetNumberFinal = GetNumberColon;
                ANCIndicators.LOGGER.info("Get Number Colon End: " + GetNumberColon);
                ANCIndicators.LOGGER.info("Get Number Final End: " + GetNumberFinal);
                //Block Name Getter
                ANCIndicators.LOGGER.info((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).substring((int) (0 + GetNumberFinal),
                        (int) ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).length())));
                //Block Name Getter Simpler
                final String GetBlockName = (GetTextInitial.substring((int) (0 + GetNumberFinal)));
                ANCIndicators.LOGGER.info("Get Block Name Simple End: " + GetBlockName);
                final String GetModNamePlusColon = GetTextFinal;
                final String GetModName = (GetModNamePlusColon.substring((int) 0, (GetNumberFinal - 1)));
                ANCIndicators.LOGGER.info("Get Mod Name Plus Colon End: " + GetModNamePlusColon);
                ANCIndicators.LOGGER.info("Get Mod Name End: " + GetModName);
                ANCIndicators.LOGGER.info("Recompile Block Name " + GetTextFinal + GetBlockName);



                //Block Color Getter
                double ColoredBlockChecking = 0;
                boolean ColoredBlock = false;
                boolean ColoredBlockPrefixColor = false;
                boolean ColoredBlockAffixColor = false;
                boolean ColoredBlockPrefixColorBool = false;
                boolean ColoredBlockAffixColorBool = false;
                String ColoredBlockPrefixColorString = "";
                String ColoredBlockAffixColorString = "";
                String ColoredBlockColorType = "";
                String GetReplacementBlock = "";
                BlockState ReplacementBlock = clickedBlock;
                    ColoredBlockChecking = 0;
                    ColoredBlock = false;
                    //Color Checking
                    while (ColoredBlockChecking == 0) {
                        if (GetTextInitial.contains("white" + "_")) {
                            ColoredBlock = true;
                            ColoredBlockPrefixColorBool = true;
                            ColoredBlockColorType = "white";
                            ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                            ColoredBlockChecking = 1;
                        }
                        if (GetTextInitial.contains("_" + "white")) {
                            ColoredBlock = true;
                            ColoredBlockAffixColorBool = true;
                            ColoredBlockColorType = "white";
                            ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                            ColoredBlockChecking = 1;
                        }
                        //Grays
                        if (GetTextInitial.contains("gray" + "_")) {
                            if (GetTextInitial.contains("gray" + "_") && !GetTextColon.contains("light_gray" + "_")) {
                                ColoredBlock = true;
                                ColoredBlockPrefixColorBool = true;
                                ColoredBlockColorType = "gray";
                                ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                                ColoredBlockChecking = 3;
                            }
                            if (GetTextInitial.contains("light_gray" + "_")) {
                                ColoredBlock = true;
                                ColoredBlockPrefixColorBool = true;
                                ColoredBlockColorType = "light_gray";
                                ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                                ColoredBlockChecking = 2;
                            }
                        } else if (GetTextInitial.contains("_" + "gray")){
                            if (GetTextInitial.contains("_" + "gray") && !GetTextColon.contains("_" + "light_gray") && !GetTextColon.contains("light_blue" + "_")) {
                                ColoredBlock = true;
                                ColoredBlockAffixColorBool = true;
                                ColoredBlockColorType = "gray";
                                ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                                ColoredBlockChecking = 3;
                            }
                            if (GetTextInitial.contains("_" + "light_gray") && !GetTextColon.contains("light_gray" + "_")) {
                                ColoredBlock = true;
                                ColoredBlockAffixColorBool = true;
                                ColoredBlockColorType = "light_gray";
                                ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                                ColoredBlockChecking = 2;
                            }
                        }
                        if (GetTextInitial.contains("black" + "_")) {
                            ColoredBlock = true;
                            ColoredBlockPrefixColorBool = true;
                            ColoredBlockColorType = "black";
                            ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                            ColoredBlockChecking = 4;
                        }
                        if (GetTextInitial.contains("_" + "black")) {
                            ColoredBlock = true;
                            ColoredBlockAffixColorBool = true;
                            ColoredBlockColorType = "black";
                            ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                            ColoredBlockChecking = 4;
                        }
                        if (GetTextInitial.contains("brown" + "_")) {
                            ColoredBlock = true;
                            ColoredBlockPrefixColorBool = true;
                            ColoredBlockColorType = "brown";
                            ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                            ColoredBlockChecking = 5;
                        }
                        if (GetTextInitial.contains("_" + "brown")) {
                            ColoredBlock = true;
                            ColoredBlockAffixColorBool = true;
                            ColoredBlockColorType = "brown";
                            ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                            ColoredBlockChecking = 5;
                        }
                        if (GetTextInitial.contains("red" + "_")) {
                            ColoredBlock = true;
                            ColoredBlockPrefixColorBool = true;
                            ColoredBlockColorType = "red";
                            ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                            ColoredBlockChecking = 6;
                        }
                        if (GetTextInitial.contains("_" + "red")) {
                            ColoredBlock = true;
                            ColoredBlockAffixColorBool = true;
                            ColoredBlockColorType = "red";
                            ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                            ColoredBlockChecking = 6;
                        }
                        if (GetTextInitial.contains("orange" + "_")) {
                            ColoredBlock = true;
                            ColoredBlockPrefixColorBool = true;
                            ColoredBlockColorType = "orange";
                            ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                            ColoredBlockChecking = 7;
                        }
                        if (GetTextInitial.contains("_" + "orange")) {
                            ColoredBlock = true;
                            ColoredBlockAffixColorBool = true;
                            ColoredBlockColorType = "orange";
                            ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                            ColoredBlockChecking = 7;
                        }
                        if (GetTextInitial.contains("yellow" + "_")) {
                            ColoredBlock = true;
                            ColoredBlockPrefixColorBool = true;
                            ColoredBlockColorType = "yellow";
                            ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                            ColoredBlockChecking = 8;
                        }
                        if (GetTextInitial.contains("_" + "yellow")) {
                            ColoredBlock = true;
                            ColoredBlockAffixColorBool = true;
                            ColoredBlockColorType = "yellow";
                            ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                            ColoredBlockChecking = 8;
                        }
                        if (GetTextInitial.contains("lime" + "_")) {
                            ColoredBlock = true;
                            ColoredBlockPrefixColorBool = true;
                            ColoredBlockColorType = "lime";
                            ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                            ColoredBlockChecking = 9;
                        }
                        if (GetTextInitial.contains("_" + "lime")) {
                            ColoredBlock = true;
                            ColoredBlockAffixColorBool = true;
                            ColoredBlockColorType = "lime";
                            ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                            ColoredBlockChecking = 9;
                        }
                        if (GetTextInitial.contains("green" + "_")) {
                            ColoredBlock = true;
                            ColoredBlockPrefixColorBool = true;
                            ColoredBlockColorType = "green";
                            ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                            ColoredBlockChecking = 10;
                        }
                        if (GetTextInitial.contains("_" + "green")) {
                            ColoredBlock = true;
                            ColoredBlockAffixColorBool = true;
                            ColoredBlockColorType = "green";
                            ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                            ColoredBlockChecking = 10;
                        }
                        if (GetTextInitial.contains("cyan" + "_")) {
                            ColoredBlock = true;
                            ColoredBlockPrefixColorBool = true;
                            ColoredBlockColorType = "cyan";
                            ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                            ColoredBlockChecking = 11;
                        }
                        if (GetTextInitial.contains("_" + "cyan")) {
                            ColoredBlock = true;
                            ColoredBlockAffixColorBool = true;
                            ColoredBlockColorType = "cyan";
                            ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                            ColoredBlockChecking = 11;
                        }
                        //Blues
                        if (GetTextInitial.contains("blue" + "_")) {
                            if (GetTextInitial.contains("blue" + "_") && !GetTextColon.contains("light_blue" + "_")) {
                                ColoredBlock = true;
                                ColoredBlockPrefixColorBool = true;
                                ColoredBlockColorType = "blue";
                                ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                                ColoredBlockChecking = 13;
                            }
                            if (GetTextInitial.contains("light_blue" + "_")) {
                                ColoredBlock = true;
                                ColoredBlockPrefixColorBool = true;
                                ColoredBlockColorType = "light_blue";
                                ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                                ColoredBlockChecking = 12;
                            }
                        } else if (GetTextInitial.contains("_" + "blue")){
                            if (GetTextInitial.contains("_" + "blue") && !GetTextColon.contains("_" + "light_blue") && !GetTextColon.contains("light_blue" + "_")) {
                                ColoredBlock = true;
                                ColoredBlockAffixColorBool = true;
                                ColoredBlockColorType = "blue";
                                ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                                ColoredBlockChecking = 13;
                            }
                            if (GetTextInitial.contains("_" + "light_blue") && !GetTextColon.contains("light_blue" + "_")) {
                                ColoredBlock = true;
                                ColoredBlockAffixColorBool = true;
                                ColoredBlockColorType = "light_blue";
                                ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                                ColoredBlockChecking = 12;
                            }
                        }
                        if (GetTextInitial.contains("purple" + "_")) {
                            ColoredBlock = true;
                            ColoredBlockPrefixColorBool = true;
                            ColoredBlockColorType = "purple";
                            ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                            ColoredBlockChecking = 14;
                        }
                        if (GetTextInitial.contains("_" + "purple")) {
                            ColoredBlock = true;
                            ColoredBlockAffixColorBool = true;
                            ColoredBlockColorType = "purple";
                            ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                            ColoredBlockChecking = 14;
                        }
                        if (GetTextInitial.contains("magenta" + "_")) {
                            ColoredBlock = true;
                            ColoredBlockPrefixColorBool = true;
                            ColoredBlockColorType = "magenta";
                            ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                            ColoredBlockChecking = 15;
                        }
                        if (GetTextInitial.contains("_" + "magenta")) {
                            ColoredBlock = true;
                            ColoredBlockAffixColorBool = true;
                            ColoredBlockColorType = "magenta";
                            ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                            ColoredBlockChecking = 15;
                        }
                        if (GetTextInitial.contains("pink" + "_")) {
                            ColoredBlock = true;
                            ColoredBlockPrefixColorBool = true;
                            ColoredBlockColorType = "pink";
                            ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                            ColoredBlockChecking = 16;
                        }
                        if (GetTextInitial.contains("_" + "pink")) {
                            ColoredBlock = true;
                            ColoredBlockAffixColorBool = true;
                            ColoredBlockColorType = "pink";
                            ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                            ColoredBlockChecking = 16;
                        } else {
                            ColoredBlockChecking = -1;
                        }
                    }
                ANCIndicators.LOGGER.info("Is Block Colored? From Color Getter: " + ColoredBlock);
                ANCIndicators.LOGGER.info("Prefix? from Color Getter: " + ColoredBlockPrefixColorBool);
                ANCIndicators.LOGGER.info("Affix? from Color Getter: " + ColoredBlockAffixColorBool);
                ANCIndicators.LOGGER.info("Get Color from Color Getter: " + ColoredBlockColorType);


                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, 1, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, 1, (float) 0.88, false);
                    }
                }
            {
                {
                    //Attempting to do string to code
                    /*
                    String comparableClassName = GetModNamePlusColon; // the class name of the objects you wish to compare
                    String comparatorClassName = GetBlockName; // something random to avoid class name conflicts
                    String expression = null;
                    String source = "BlockState " + GetModNamePlusColon +
                            " implements Comparable<" + comparableClassName + 
                            "> {" +
                            "    public int compare(" + comparableClassName + 
                            " a, " + comparableClassName + 
                            " b) {" +
                            "        return " + expression + ";" +
                            "    }" +
                            "}";

                    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
                    */


                }

                /*
                //Replacement Tester
                //BlockPos _bp = BlockPos.containing(x, y, z);
                String _bsa = (("Blocks." + (GetModNamePlusColon + GetBlockName).toUpperCase() + ".defaultBlockState();").toString());

                BlockState _bs = ReplacementBlock;
                
                //BlockState _bsa = ("Blocks." + (GetModNamePlusColon + GetBlockName).toUpperCase() + ".defaultBlockState();").toString();
                /*
                BlockState _bs = ("Blocks." + (GetModNamePlusColon + GetBlockName).toUpperCase() + ".defaultBlockState();").toString().;
                JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
                //BlockState _bs = Blocks.BLUE_WOOL.defaultBlockState();
                BlockState _bso = world.getBlockState(_bp);
                for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
                    Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                    if (_property != null && _bs.getValue(_property) != null)
                        try {
                            _bs = _bs.setValue(_property, (Comparable) entry.getValue());
                        } catch (Exception e) {
                        }
                }
                BlockEntity _be = world.getBlockEntity(_bp);
                CompoundTag _bnbt = null;
                if (_be != null) {
                    _bnbt = _be.saveWithFullMetadata();
                    _be.setRemoved();
                }
                world.setBlock(_bp, _bs, 3);
                if (_bnbt != null) {
                    _be = world.getBlockEntity(_bp);
                    if (_be != null) {
                        try {
                            _be.load(_bnbt);
                        } catch (Exception ignored) {
                        }
                    }
                }
                */
            }
            }
        }
        
    //}
}

