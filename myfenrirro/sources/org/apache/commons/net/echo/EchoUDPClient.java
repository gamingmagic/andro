package org.apache.commons.net.echo;

import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.discard.DiscardUDPClient;

public final class EchoUDPClient extends DiscardUDPClient {
    public static final int DEFAULT_PORT = 7;
    private final DatagramPacket __receivePacket = new DatagramPacket(new byte[0], 0);

    public final void send(byte[] bArr, int i, InetAddress inetAddress) {
        send(bArr, i, inetAddress, 7);
    }

    public final void send(byte[] bArr, InetAddress inetAddress) {
        send(bArr, bArr.length, inetAddress, 7);
    }

    public final int receive(byte[] bArr, int i) {
        this.__receivePacket.setData(bArr);
        this.__receivePacket.setLength(i);
        this._socket_.receive(this.__receivePacket);
        return this.__receivePacket.getLength();
    }

    public final int receive(byte[] bArr) {
        return receive(bArr, bArr.length);
    }
}
