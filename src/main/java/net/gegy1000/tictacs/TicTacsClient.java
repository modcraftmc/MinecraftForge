package net.gegy1000.tictacs;


/*
@Environment(EnvType.CLIENT)
public class TicTacsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientSidePacketRegistry.INSTANCE.register(TicTacs.DEBUG_CHUNK_TICKETS, (packetContext, data) -> {
            long chunkPos = data.readLong();
            int toLevel = data.readInt();

            packetContext.getTaskQueue().execute(() -> {
                TicTacsDebugLevelTracker.INSTANCE.setLevel(chunkPos, toLevel);
            });
        });
    }
}

 */
