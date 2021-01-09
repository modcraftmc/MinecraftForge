package net.gegy1000.tictacs;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public interface NonBlockingWorldAccess extends IWorldReader {
    default BlockState getBlockStateIfLoaded(BlockPos pos) {
        if (this.isBlockLoaded(pos)) {
            return this.getBlockState(pos);
        }
        return Blocks.AIR.getDefaultState();
    }

    default FluidState getFluidStateIfLoaded(BlockPos pos) {
        if (this.isBlockLoaded(pos)) {
            return this.getFluidState(pos);
        }
        return Fluids.EMPTY.getDefaultState();
    }
}