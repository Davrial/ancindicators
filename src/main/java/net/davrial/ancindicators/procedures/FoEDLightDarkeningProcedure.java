package net.davrial.ancindicators.procedures;

import net.davrial.ancindicators.item.ModItems;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.davrial.ancindicators.block.ModBlocks;
import net.minecraftforge.fml.common.Mod;

public class FoEDLightDarkeningProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
        if (itemstack.getItem() == ModItems.FLASK_OF_ETERNAL_DARKNESS.get()) {
            if (world.getBlockState(BlockPos.containing(x, y, z)).getLightEmission(world, BlockPos.containing(x, y, z)) != 0) {
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 1, y + 1, z + 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 1, y + 1, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y + 1, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y + 1, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 1, y + 1, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 2, y + 1, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 2, y + 1, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 2, y + 1, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 2, y + 1, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 1, y + 2, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y + 2, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y + 2, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 1, y + 2, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 1, y + 1, z - 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y + 1, z - 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y + 1, z - 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 1, y + 1, z - 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 1, y , z + 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y , z + 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y , z + 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 1, y , z + 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 2, y , z + 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 2, y , z + 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 2, y , z + 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 2, y , z + 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 1, y , z + 2))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y , z + 2))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y , z + 2))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 1, y , z + 2), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 1, y , z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y , z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y , z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 1, y , z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 2, y , z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 2, y , z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 2, y , z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 2, y , z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 1, y , z - 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y , z - 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y , z - 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 1, y , z - 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 1, y , z - 2))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y , z - 2))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y , z - 2))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 1, y , z - 2), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 2, y , z - 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 2, y , z - 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 2, y , z - 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 2, y , z - 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 1, y - 1, z + 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 1, y - 1, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y - 1, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y - 1, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 1, y - 1, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 2, y - 1, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 2, y - 1, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 2, y - 1, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 2, y - 1, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 1, y - 2, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y - 2, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y - 2, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 1, y - 2, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x + 1, y - 1, z - 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y - 1, z - 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x + 1, y - 1, z - 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x + 1, y - 1, z - 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y + 1, z + 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 1, z + 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 1, z + 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y + 1, z + 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y + 2, z + 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 2, z + 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 2, z + 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y + 2, z + 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y + 1, z + 2))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 1, z + 2))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 1, z + 2))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y + 1, z + 2), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y + 1, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 1, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 1, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y + 1, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y + 2, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 2, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 2, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y + 2, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y + 1, z - 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 1, z - 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 1, z - 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y + 1, z - 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y + 2, z - 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 2, z - 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 2, z - 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y + 2, z - 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y + 1, z - 2))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 1, z - 2))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y + 1, z - 2))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y + 1, z - 2), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y , z + 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y , z + 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y , z + 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y , z + 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y , z + 2))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y , z + 2))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y , z + 2))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y , z + 2), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                /* Center Block
                if ((world
                        /*.....getBlockState(BlockPos.containing(x , y , z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y , z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y , z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*........world.setBlock(BlockPos.containing(x , y , z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                */
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y , z - 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y , z - 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y , z - 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y , z - 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y , z - 2))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y , z - 2))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y , z - 2))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y , z - 2), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y - 1, z + 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 1, z + 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 1, z + 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y - 1, z + 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y - 2, z + 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 2, z + 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 2, z + 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y - 2, z + 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y - 1, z + 2))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 1, z + 2))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 1, z + 2))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y - 1, z + 2), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y - 1, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 1, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 1, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y - 1, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y - 2, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 2, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 2, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y - 2, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y - 1, z - 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 1, z - 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 1, z - 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y - 1, z - 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y - 2, z - 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 2, z - 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 2, z - 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y - 2, z - 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x , y - 1, z - 2))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 1, z - 2))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x , y - 1, z - 2))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x , y - 1, z - 2), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 1, y + 1, z + 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y + 1, z + 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y + 1, z + 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 1, y + 1, z + 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 1, y + 1, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y + 1, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y + 1, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 1, y + 1, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 2, y + 1, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 2, y + 1, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 2, y + 1, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 2, y + 1, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 1, y + 2, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y + 2, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y + 2, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 1, y + 2, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 1, y + 1, z - 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y + 1, z - 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y + 1, z - 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 1, y + 1, z - 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 1, y , z + 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y , z + 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y , z + 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 1, y , z + 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 2, y , z + 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 2, y , z + 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 2, y , z + 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 2, y , z + 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 1, y , z + 2))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y , z + 2))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y , z + 2))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 1, y , z + 2), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 1, y , z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y , z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y , z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 1, y , z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 2, y , z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 2, y , z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 2, y , z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 2, y , z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 1, y , z - 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y , z - 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y , z - 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 1, y , z - 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 2, y , z - 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 2, y , z - 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 2, y , z - 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 2, y , z - 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 1, y , z - 2))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y , z - 2))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y , z - 2))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 1, y , z - 2), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 1, y - 1, z + 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 1, y - 1, z + 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 1, y - 1, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y - 1, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y - 1, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 1, y - 1, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 2, y - 1, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 2, y - 1, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 2, y - 1, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 2, y - 1, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 1, y - 2, z ))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y - 2, z ))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y - 2, z ))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 1, y - 2, z ), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
                if ((world
                        /*..*/.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1))).getBlock() == Blocks.AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1))).getBlock() == Blocks.VOID_AIR ||
                        (world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1))).getBlock() == Blocks.CAVE_AIR) {
                    /*......*/world.setBlock(BlockPos.containing(x - 1, y - 1, z - 1), ModBlocks.DARKNESS_BLOCK.get().defaultBlockState(), 3);
                }
            }
        }
    }
}
