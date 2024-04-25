package net.davrial.ancindicators.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;

public class PaintingStrongLightGrayProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
        BlockState clickedBlock = Blocks.AIR.defaultBlockState();
        if (itemstack.getItem() == Items.LIGHT_GRAY_DYE && (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:all_paintable_blocks")))) {
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
                    BlockState _bs = Blocks.LIGHT_GRAY_WOOL.defaultBlockState();
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
            if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:paintables_beds")))) {
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
                    BlockState _bs = Blocks.LIGHT_GRAY_BED.defaultBlockState();
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
                    BlockState _bs = Blocks.LIGHT_GRAY_CARPET.defaultBlockState();
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
                    BlockState _bs = Blocks.LIGHT_GRAY_CONCRETE_POWDER.defaultBlockState();
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
                    BlockState _bs = Blocks.LIGHT_GRAY_SHULKER_BOX.defaultBlockState();
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
                    BlockState _bs = Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState();
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
                    BlockState _bs = Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState();
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
