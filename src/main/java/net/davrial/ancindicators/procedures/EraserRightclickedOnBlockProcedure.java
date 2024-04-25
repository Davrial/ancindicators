package net.davrial.ancindicators.procedures;

import net.davrial.ancindicators.block.ModBlocks;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;

public class EraserRightclickedOnBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
        BlockState clickedBlock = Blocks.AIR.defaultBlockState();
        if (itemstack.is(ItemTags.create(new ResourceLocation("ancindicators:erasers")))) {
            if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:erasable_to_blank_blocks")))) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.cartography_table.take_result")), SoundSource.BLOCKS, (float) 0.25, 1);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.cartography_table.take_result")), SoundSource.BLOCKS, (float) 0.25, 1, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLANK_INDICATOR_BLOCK.get().defaultBlockState();
                    BlockState _bso = world.getBlockState(_bp);
                    for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
                        Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                        if (_property != null && _bs.getValue(_property) != null)
                            try {
                                _bs = _bs.setValue(_property, (Comparable) entry.getValue());
                            } catch (Exception e) {
                            }
                    }
                    world.setBlock(_bp, _bs, 3);
                }
                if (itemstack.isDamageableItem()) {
                    {
                        ItemStack _ist = itemstack;
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                } else {
                    itemstack.shrink(1);
                }
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:erasable_to_darkened_blocks")))) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.cartography_table.take_result")), SoundSource.BLOCKS, (float) 0.25, 1);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.cartography_table.take_result")), SoundSource.BLOCKS, (float) 0.25, 1, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.DARKENED_BLANK_INDICATOR_BLOCK.get().defaultBlockState();
                    BlockState _bso = world.getBlockState(_bp);
                    for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
                        Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                        if (_property != null && _bs.getValue(_property) != null)
                            try {
                                _bs = _bs.setValue(_property, (Comparable) entry.getValue());
                            } catch (Exception e) {
                            }
                    }
                    world.setBlock(_bp, _bs, 3);
                }
                if (itemstack.isDamageableItem()) {
                    {
                        ItemStack _ist = itemstack;
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                } else {
                    itemstack.shrink(1);
                }
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:erasable_to_redstone_level_blocks")))) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.cartography_table.take_result")), SoundSource.BLOCKS, (float) 0.25, 1);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.cartography_table.take_result")), SoundSource.BLOCKS, (float) 0.25, 1, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLANK_REDSTONE_INDICATOR_BLOCK.get().defaultBlockState();
                    BlockState _bso = world.getBlockState(_bp);
                    for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
                        Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                        if (_property != null && _bs.getValue(_property) != null)
                            try {
                                _bs = _bs.setValue(_property, (Comparable) entry.getValue());
                            } catch (Exception e) {
                            }
                    }
                    world.setBlock(_bp, _bs, 3);
                }
                if (itemstack.isDamageableItem()) {
                    {
                        ItemStack _ist = itemstack;
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                } else {
                    itemstack.shrink(1);
                }
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:erasable_to_light_level_blocks")))) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.cartography_table.take_result")), SoundSource.BLOCKS, (float) 0.25, 1);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.cartography_table.take_result")), SoundSource.BLOCKS, (float) 0.25, 1, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLANK_LIGHT_LEVEL_INDICATOR_BLOCK.get().defaultBlockState();
                    BlockState _bso = world.getBlockState(_bp);
                    for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
                        Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                        if (_property != null && _bs.getValue(_property) != null)
                            try {
                                _bs = _bs.setValue(_property, (Comparable) entry.getValue());
                            } catch (Exception e) {
                            }
                    }
                    world.setBlock(_bp, _bs, 3);
                }
                if (itemstack.isDamageableItem()) {
                    {
                        ItemStack _ist = itemstack;
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                } else {
                    itemstack.shrink(1);
                }
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:erasable_to_plain_redstone_blocks")))) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.cartography_table.take_result")), SoundSource.BLOCKS, (float) 0.25, 1);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.cartography_table.take_result")), SoundSource.BLOCKS, (float) 0.25, 1, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = Blocks.REDSTONE_BLOCK.defaultBlockState();
                    BlockState _bso = world.getBlockState(_bp);
                    for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
                        Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                        if (_property != null && _bs.getValue(_property) != null)
                            try {
                                _bs = _bs.setValue(_property, (Comparable) entry.getValue());
                            } catch (Exception e) {
                            }
                    }
                    world.setBlock(_bp, _bs, 3);
                }
                if (itemstack.isDamageableItem()) {
                    {
                        ItemStack _ist = itemstack;
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                } else {
                    itemstack.shrink(1);
                }
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:erasable_to_plain_glowstone_blocks")))) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.cartography_table.take_result")), SoundSource.BLOCKS, (float) 0.25, 1);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.cartography_table.take_result")), SoundSource.BLOCKS, (float) 0.25, 1, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = Blocks.GLOWSTONE.defaultBlockState();
                    BlockState _bso = world.getBlockState(_bp);
                    for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
                        Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                        if (_property != null && _bs.getValue(_property) != null)
                            try {
                                _bs = _bs.setValue(_property, (Comparable) entry.getValue());
                            } catch (Exception e) {
                            }
                    }
                    world.setBlock(_bp, _bs, 3);
                }
                if (itemstack.isDamageableItem()) {
                    {
                        ItemStack _ist = itemstack;
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                } else {
                    itemstack.shrink(1);
                }
            }
        }
    }
}
