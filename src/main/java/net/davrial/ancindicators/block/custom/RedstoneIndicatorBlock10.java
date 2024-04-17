package net.davrial.ancindicators.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;


public class RedstoneIndicatorBlock10 extends Block {

	public RedstoneIndicatorBlock10(Properties pProperties) {
		super(pProperties);
	}

	/*public RedstoneIndicatorTemplateBlock() {
		super(BlockBehaviour.Properties.of()
		.instrument(NoteBlockInstrument.BASEDRUM)
		.mapColor(MapColor.FIRE).sound(SoundType.STONE)
		.strength(1f, 10f).hasPostProcess((bs, br, bp) -> true)
		.emissiveRendering((bs, br, bp) -> true));
	}*/

	/*
	//How much light is blocked
	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
	 */


	//Does it emit redstone signal?
	@Override
	public boolean isSignalSource(BlockState state) {
		return true;
	}

	//What redstone signal strength?
	@Override
	public int getSignal(BlockState blockstate, BlockGetter blockAccess, BlockPos pos, Direction direction) {
		return 10;
	}


	//Does redstone always connect?
	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
		return true;
	}
}