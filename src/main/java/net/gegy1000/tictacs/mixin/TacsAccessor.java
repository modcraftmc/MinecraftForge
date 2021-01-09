package net.gegy1000.tictacs.mixin;

import it.unimi.dsi.fastutil.longs.LongSet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ChunkManager.class)
public interface TacsAccessor {
    @Accessor
    LongSet getLoadedChunks();

    @Accessor("unloadedChunks")
    LongSet getQueuedUnloads();

    @Accessor("chunksToUnload")
    Long2ObjectLinkedOpenHashMap<ChunkHolder> getUnloadingChunks();

    @Accessor
    ChunkTaskPrioritySystem getChunkTaskPrioritySystem();
}
