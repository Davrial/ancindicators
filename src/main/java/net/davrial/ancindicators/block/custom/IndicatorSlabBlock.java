package net.davrial.ancindicators.block.custom;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.material.MapColor;

public class IndicatorSlabBlock extends SlabBlock {
	public IndicatorSlabBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ).dynamicShape());
	}

}
