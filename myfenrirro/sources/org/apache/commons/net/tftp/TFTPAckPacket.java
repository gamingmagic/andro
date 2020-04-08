package org.apache.commons.net.tftp;

import android.support.p000v4.internal.view.SupportMenu;
import java.net.DatagramPacket;
import java.net.InetAddress;

public final class TFTPAckPacket extends TFTPPacket {
    int _blockNumber;

    public TFTPAckPacket(InetAddress inetAddress, int i, int i2) {
        super(4, inetAddress, i);
        this._blockNumber = i2;
    }

    TFTPAckPacket(DatagramPacket datagramPacket) {
        super(4, datagramPacket.getAddress(), datagramPacket.getPort());
        byte[] data = datagramPacket.getData();
        if (getType() != data[1]) {
            throw new TFTPPacketException("TFTP operator code does not match type.");
        }
        this._blockNumber = ((data[2] & 255) << 8) | (data[3] & 255);
    }

    /* access modifiers changed from: 0000 */
    public final DatagramPacket _newDatagram(DatagramPacket datagramPacket, byte[] bArr) {
        bArr[0] = 0;
        bArr[1] = (byte) this._type;
        bArr[2] = (byte) ((this._blockNumber & SupportMenu.USER_MASK) >> 8);
        bArr[3] = (byte) (this._blockNumber & 255);
        datagramPacket.setAddress(this._address);
        datagramPacket.setPort(this._port);
        datagramPacket.setData(bArr);
        datagramPacket.setLength(4);
        return datagramPacket;
    }

    public final DatagramPacket newDatagram() {
        byte[] bArr = {0, (byte) this._type, (byte) ((this._blockNumber & SupportMenu.USER_MASK) >> 8), (byte) (this._blockNumber & 255)};
        return new DatagramPacket(bArr, bArr.length, this._address, this._port);
    }

    public final int getBlockNumber() {
        return this._blockNumber;
    }

    public final void setBlockNumber(int i) {
        this._blockNumber = i;
    }
}
