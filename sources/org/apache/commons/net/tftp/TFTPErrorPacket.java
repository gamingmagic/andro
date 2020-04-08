package org.apache.commons.net.tftp;

import android.support.p000v4.internal.view.SupportMenu;
import java.net.DatagramPacket;
import java.net.InetAddress;

public final class TFTPErrorPacket extends TFTPPacket {
    public static final int ACCESS_VIOLATION = 2;
    public static final int FILE_EXISTS = 6;
    public static final int FILE_NOT_FOUND = 1;
    public static final int ILLEGAL_OPERATION = 4;
    public static final int NO_SUCH_USER = 7;
    public static final int OUT_OF_SPACE = 3;
    public static final int UNDEFINED = 0;
    public static final int UNKNOWN_TID = 5;
    int _error;
    String _message;

    public TFTPErrorPacket(InetAddress inetAddress, int i, int i2, String str) {
        super(5, inetAddress, i);
        this._error = i2;
        this._message = str;
    }

    TFTPErrorPacket(DatagramPacket datagramPacket) {
        super(5, datagramPacket.getAddress(), datagramPacket.getPort());
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        if (getType() != data[1]) {
            throw new TFTPPacketException("TFTP operator code does not match type.");
        }
        this._error = ((data[2] & 255) << 8) | (data[3] & 255);
        if (length < 5) {
            throw new TFTPPacketException("Bad error packet. No message.");
        }
        int i = 4;
        StringBuilder sb = new StringBuilder();
        while (i < length && data[i] != 0) {
            sb.append((char) data[i]);
            i++;
        }
        this._message = sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final DatagramPacket _newDatagram(DatagramPacket datagramPacket, byte[] bArr) {
        int length = this._message.length();
        bArr[0] = 0;
        bArr[1] = (byte) this._type;
        bArr[2] = (byte) ((this._error & SupportMenu.USER_MASK) >> 8);
        bArr[3] = (byte) (this._error & 255);
        System.arraycopy(this._message.getBytes(), 0, bArr, 4, length);
        bArr[length + 4] = 0;
        datagramPacket.setAddress(this._address);
        datagramPacket.setPort(this._port);
        datagramPacket.setData(bArr);
        datagramPacket.setLength(length + 4);
        return datagramPacket;
    }

    public final DatagramPacket newDatagram() {
        int length = this._message.length();
        byte[] bArr = new byte[(length + 5)];
        bArr[0] = 0;
        bArr[1] = (byte) this._type;
        bArr[2] = (byte) ((this._error & SupportMenu.USER_MASK) >> 8);
        bArr[3] = (byte) (this._error & 255);
        System.arraycopy(this._message.getBytes(), 0, bArr, 4, length);
        bArr[length + 4] = 0;
        return new DatagramPacket(bArr, bArr.length, this._address, this._port);
    }

    public final int getError() {
        return this._error;
    }

    public final String getMessage() {
        return this._message;
    }
}
