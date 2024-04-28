package net.davrial.ancindicators.procedures;

import net.davrial.ancindicators.ANCIndicators;
import net.davrial.ancindicators.block.ModBlocks;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.davrial.ancindicators.procedures.*;

import java.util.Map;

public class AutomaticUniversalRecoloringProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {



        //All Variables
        BlockState clickedBlock = world.getBlockState(BlockPos.containing(x, y, z));
        boolean GetColoredBlockBool = false;
        String GetNBTTagsFromOriginalBlock = "";
        String GetTargetedBlock = "";
        String GetTargetedBlockRegistryName = "";
        String GetColoredBlockColorString = "";
        final String GetTextInitial =
                ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
        String GetText =
                ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
        int GetNumber =
                GetText.length();
        final int GetNumberInitial =
                GetTextInitial.length();
        final String ClickedBlockBlockDataInitial =
                clickedBlock.toString();
        String ClickedBlockBlockDataWorker =
                clickedBlock.toString();
        String ClickedBlockBlockDataStarterToInvert =
                "";
        String ClickedBlockBlockDataFinal =
                "";
        final int GetNumberClickedBlockBlockDataInitial =
                ClickedBlockBlockDataInitial.length();
        int GetNumberClickedBlockBlockDataWorker =
                ClickedBlockBlockDataWorker.length();
        boolean LoopFlag1 =
                true;
        boolean LoopFlag2 =
                true;
        String GetTextColon =
                "";





        if (itemstack.is(ItemTags.create(new ResourceLocation("ancindicators:coloring_tools")))) {
            GetTargetedBlockRegistryName = ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
            if (GetTargetedBlockRegistryName.contains("white_") || GetTargetedBlockRegistryName.contains("light_gray_")) {
                GetColoredBlockBool = true;
            }
            if (GetColoredBlockBool == true) {
                GetNBTTagsFromOriginalBlock = new Object() {
                    public String getValue(LevelAccessor world, BlockPos pos, String tag) {
                        BlockEntity blockEntity = world.getBlockEntity(pos);
                        if (blockEntity != null)
                            return blockEntity.getPersistentData().getString(tag);
                        return "";
                    }
                }.getValue(world, BlockPos.containing(x, y, z), "Items");
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.REDSTONE_INDICATOR_TEMPLATE_BLOCK.get().defaultBlockState();
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
                }
                if (!world.isClientSide()) {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockEntity _blockEntity = world.getBlockEntity(_bp);
                    BlockState _bs = world.getBlockState(_bp);
                    if (_blockEntity != null)
                        _blockEntity.getPersistentData().putString("Items", GetNBTTagsFromOriginalBlock);
                    if (world instanceof Level _level)
                        _level.sendBlockUpdated(_bp, _bs, _bs, 3);
                }
            }
        }
    }
}
