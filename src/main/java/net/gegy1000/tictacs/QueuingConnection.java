package net.gegy1000.tictacs;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.gegy1000.tictacs.mixin.packet_queue.ServerPlayNetworkHandlerMixin;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.ServerPlayNetHandler;

import javax.annotation.Nullable;

public interface QueuingConnection {
    static void enqueueSend(ServerPlayNetHandler network, IPacket<?> packet) {
        ((QueuingConnection) network).enqueueSend(packet);
    }

    static void enqueueSend(ServerPlayNetHandler network, IPacket<?> packet, @Nullable GenericFutureListener<? extends Future<? super Void>> callback) {
        ((QueuingConnection) network).enqueueSend(packet, callback);
    }

    default void enqueueSend(IPacket<?> packet) {
        this.enqueueSend(packet, null);
    }

    void enqueueSend(IPacket<?> packet, @Nullable GenericFutureListener<? extends Future<? super Void>> callback);
}
