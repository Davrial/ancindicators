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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;

public class PalettetRightclickedOnBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
        BlockState clickedBlock = Blocks.AIR.defaultBlockState();
        if (itemstack.is(ItemTags.create(new ResourceLocation("ancindicators:block_color_palettes")))) {
            if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_WHITE.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 05, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_GRAY.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_GRAY.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GRAY.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GRAY.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLACK.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLACK.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BROWN.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BROWN.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_RED.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_RED.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_ORANGE.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_ORANGE.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_YELLOW.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_YELLOW.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIME.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIME.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GREEN.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_GREEN.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_CYAN.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_CYAN.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_BLUE.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_LIGHT_BLUE.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLUE.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_BLUE.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PURPLE.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PURPLE.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_MAGENTA.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_MAGENTA.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PINK.get().defaultBlockState();
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
            } else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_PINK.get()) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, (float) 0.5, (float) 0.88, false);
                    }
                }
                {
                    BlockPos _bp = BlockPos.containing(x, y, z);
                    BlockState _bs = ModBlocks.BLOCK_COLOR_INDICATOR_BLOCK_WHITE.get().defaultBlockState();
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
