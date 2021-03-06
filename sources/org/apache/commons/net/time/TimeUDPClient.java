package org.apache.commons.net.time;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Date;
import org.apache.commons.net.DatagramSocketClient;

public final class TimeUDPClient extends DatagramSocketClient {
    public static final int DEFAULT_PORT = 37;
    public static final long SECONDS_1900_TO_1970 = 2208988800L;
    private final byte[] __dummyData = new byte[1];
    private final byte[] __timeData = new byte[4];

    public final long getTime(InetAddress inetAddress, int i) {
        DatagramPacket datagramPacket = new DatagramPacket(this.__dummyData, this.__dummyData.length, inetAddress, i);
        DatagramPacket datagramPacket2 = new DatagramPacket(this.__timeData, this.__timeData.length);
        this._socket_.send(datagramPacket);
        this._socket_.receive(datagramPacket2);
        return (((long) ((this.__timeData[0] & 255) << 24)) & 4294967295L) | 0 | (((long) ((this.__timeData[1] & 255) << 16)) & 4294967295L) | (((long) ((this.__timeData[2] & 255) << 8)) & 4294967295L) | (((long) (this.__timeData[3] & 255)) & 4294967295L);
    }

    public final long getTime(InetAddress inetAddress) {
        return getTime(inetAddress, 37);
    }

    public final Date getDate(InetAddress inetAddress, int i) {
        return new Date((getTime(inetAddress, i) - 2208988800L) * 1000);
    }

    public final Date getDate(InetAddress inetAddress) {
        return new Date((getTime(inetAddress, 37) - 2208988800L) * 1000);
    }
}
