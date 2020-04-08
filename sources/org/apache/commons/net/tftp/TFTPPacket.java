package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;

public abstract class TFTPPacket {
    public static final int ACKNOWLEDGEMENT = 4;
    public static final int DATA = 3;
    public static final int ERROR = 5;
    static final int MIN_PACKET_SIZE = 4;
    public static final int READ_REQUEST = 1;
    public static final int SEGMENT_SIZE = 512;
    public static final int WRITE_REQUEST = 2;
    InetAddress _address;
    int _port;
    int _type;

    /* access modifiers changed from: 0000 */
    public abstract DatagramPacket _newDatagram(DatagramPacket datagramPacket, byte[] bArr);

    public abstract DatagramPacket newDatagram();

    public static final TFTPPacket newTFTPPacket(DatagramPacket datagramPacket) {
        if (datagramPacket.getLength() < 4) {
            throw new TFTPPacketException("Bad packet. Datagram data length is too short.");
        }
        switch (datagramPacket.getData()[1]) {
            case 1:
                return new TFTPReadRequestPacket(datagramPacket);
            case 2:
                return new TFTPWriteRequestPacket(datagramPacket);
            case 3:
                return new TFTPDataPacket(datagramPacket);
            case 4:
                return new TFTPAckPacket(datagramPacket);
            case 5:
                return new TFTPErrorPacket(datagramPacket);
            default:
                throw new TFTPPacketException("Bad packet.  Invalid TFTP operator code.");
        }
    }

    TFTPPacket(int i, InetAddress inetAddress, int i2) {
        this._type = i;
        this._address = inetAddress;
        this._port = i2;
    }

    public final int getType() {
        return this._type;
    }

    public final InetAddress getAddress() {
        return this._address;
    }

    public final int getPort() {
        return this._port;
    }

    public final void setPort(int i) {
        this._port = i;
    }

    public final void setAddress(InetAddress inetAddress) {
        this._address = inetAddress;
    }
}
