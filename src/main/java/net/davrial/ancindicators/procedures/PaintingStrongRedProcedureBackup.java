package net.davrial.ancindicators.procedures;

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

import java.util.Map;

public class PaintingStrongRedProcedureBackup {
    public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
        BlockState clickedBlock = Blocks.AIR.defaultBlockState();
        if (itemstack.getItem() == ModItems.VIAL_OF_PAINT_STRONG_RED.get() && (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:all_paintable_blocks")))) {
            if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:paintables_wool")))) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")),
                                SoundSource.BLOCKS, 1, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")),
                                SoundSource.BLOCKS, 1, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = Blocks.RED_WOOL.defaultBlockState();
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
                itemstack.shrink(1);
            }





            //BEDS
            if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:beds")))) {
                final String GetTextInitial = ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
                String GetText = ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
                int GetNumber = GetText.length();
                final int GetNumberInitial = GetTextInitial.length();
                boolean LoopFlag = true;
                String GetTextColon = "";
                while (LoopFlag == true) {
                    for (int index1 = 1; index1 <= (int) GetNumberInitial; index1++) {
                        GetNumber = GetNumber - 1;
                        GetText = (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).substring(0, (int) GetNumber);
                        if (GetText.endsWith(":") == true){
                        GetTextColon = GetText;
                        };
                        if (GetTextColon.endsWith(":") == true) {
                            LoopFlag = false;
                        }
                    }
                }
                final String GetTextFinal = GetTextColon;
                int GetNumberColon = GetTextColon.length();
                final int GetNumberFinal = GetNumberColon;

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


                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, 1, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, 1, (float) 0.88, false);
                    }
                }
                if ((new Object() {
                    public Direction getDirection(BlockState _bs) {
                        Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                        if (_prop instanceof DirectionProperty _dp)
                            return _bs.getValue(_dp);
                        _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                        return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
                                ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
                                : Direction.NORTH;
                    }
                }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.EAST && ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("part") instanceof EnumProperty _getep34
                        ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep34).toString()
                        : "").equals("foot") || (new Object() {
                    public Direction getDirection(BlockState _bs) {
                        Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                        if (_prop instanceof DirectionProperty _dp)
                            return _bs.getValue(_dp);
                        _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                        return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
                                ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
                                : Direction.NORTH;
                    }
                }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.WEST
                        && ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("part") instanceof EnumProperty _getep39
                        ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep39).toString()
                        : "").equals("head")) {
                    {
                        BlockPos _bp = BlockPos.containing(x + 1, y, z);
                        BlockState _bs = Blocks.RED_BED.defaultBlockState();
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
                }
                if ((new Object() {
                    public Direction getDirection(BlockState _bs) {
                        Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                        if (_prop instanceof DirectionProperty _dp)
                            return _bs.getValue(_dp);
                        _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                        return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
                                ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
                                : Direction.NORTH;
                    }
                }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.WEST && ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("part") instanceof EnumProperty _getep45
                        ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep45).toString()
                        : "").equals("foot") || (new Object() {
                    public Direction getDirection(BlockState _bs) {
                        Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                        if (_prop instanceof DirectionProperty _dp)
                            return _bs.getValue(_dp);
                        _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                        return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
                                ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
                                : Direction.NORTH;
                    }
                }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.EAST
                        && ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("part") instanceof EnumProperty _getep50
                        ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep50).toString()
                        : "").equals("head")) {
                    {
                        BlockPos _bp = BlockPos.containing(x - 1, y, z);
                        BlockState _bs = Blocks.RED_BED.defaultBlockState();
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
                }
                if ((new Object() {
                    public Direction getDirection(BlockState _bs) {
                        Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                        if (_prop instanceof DirectionProperty _dp)
                            return _bs.getValue(_dp);
                        _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                        return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
                                ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
                                : Direction.NORTH;
                    }
                }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.SOUTH && ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("part") instanceof EnumProperty _getep56
                        ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep56).toString()
                        : "").equals("foot") || (new Object() {
                    public Direction getDirection(BlockState _bs) {
                        Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                        if (_prop instanceof DirectionProperty _dp)
                            return _bs.getValue(_dp);
                        _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                        return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
                                ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
                                : Direction.NORTH;
                    }
                }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.NORTH
                        && ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("part") instanceof EnumProperty _getep61
                        ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep61).toString()
                        : "").equals("head")) {
                    {
                        BlockPos _bp = BlockPos.containing(x, y, z + 1);
                        BlockState _bs = Blocks.RED_BED.defaultBlockState();
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
                }
                if ((new Object() {
                    public Direction getDirection(BlockState _bs) {
                        Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                        if (_prop instanceof DirectionProperty _dp)
                            return _bs.getValue(_dp);
                        _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                        return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
                                ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
                                : Direction.NORTH;
                    }
                }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.NORTH && ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("part") instanceof EnumProperty _getep67
                        ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep67).toString()
                        : "").equals("foot") || (new Object() {
                    public Direction getDirection(BlockState _bs) {
                        Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                        if (_prop instanceof DirectionProperty _dp)
                            return _bs.getValue(_dp);
                        _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                        return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
                                ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
                                : Direction.NORTH;
                    }
                }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.SOUTH
                        && ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("part") instanceof EnumProperty _getep72
                        ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep72).toString()
                        : "").equals("head")) {
                    {
                        BlockPos _bp = BlockPos.containing(x, y, z - 1);
                        BlockState _bs = Blocks.RED_BED.defaultBlockState();
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
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = Blocks.RED_BED.defaultBlockState();
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
                itemstack.shrink(1);
            }








            //BEDS END





            //CARPETS START
            if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:paintables_carpets")))) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")),
                                SoundSource.BLOCKS, 1, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")),
                                SoundSource.BLOCKS, 1, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = Blocks.RED_CARPET.defaultBlockState();
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
                itemstack.shrink(1);
            }
            if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:paintables_concrete_powder")))) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")),
                                SoundSource.BLOCKS, 1, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")),
                                SoundSource.BLOCKS, 1, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = Blocks.RED_CONCRETE_POWDER.defaultBlockState();
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
                itemstack.shrink(1);
            }
            if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:paintables_shulker_boxes")))) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")),
                                SoundSource.BLOCKS, 1, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")),
                                SoundSource.BLOCKS, 1, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = Blocks.RED_SHULKER_BOX.defaultBlockState();
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
                itemstack.shrink(1);
            }
            if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:paintables_terracotta")))) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")),
                                SoundSource.BLOCKS, 1, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")),
                                SoundSource.BLOCKS, 1, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = Blocks.RED_TERRACOTTA.defaultBlockState();
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
                itemstack.shrink(1);
            }
            if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:paintables_concrete")))) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")),
                                SoundSource.BLOCKS, 1, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")),
                                SoundSource.BLOCKS, 1, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = Blocks.RED_CONCRETE.defaultBlockState();
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
                itemstack.shrink(1);
            }
        }
    }
}
