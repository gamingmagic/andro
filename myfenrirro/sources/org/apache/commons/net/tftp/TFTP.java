package org.apache.commons.net.tftp;

import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.SocketException;
import org.apache.commons.net.DatagramSocketClient;

public class TFTP extends DatagramSocketClient {
    public static final int ASCII_MODE = 0;
    public static final int BINARY_MODE = 1;
    public static final int DEFAULT_PORT = 69;
    public static final int DEFAULT_TIMEOUT = 5000;
    public static final int IMAGE_MODE = 1;
    public static final int NETASCII_MODE = 0;
    public static final int OCTET_MODE = 1;
    static final int PACKET_SIZE = 516;
    private byte[] __receiveBuffer = null;
    private DatagramPacket __receiveDatagram = null;
    private DatagramPacket __sendDatagram;
    byte[] _sendBuffer;

    public static final String getModeName(int i) {
        return TFTPRequestPacket._modeStrings[i];
    }

    public TFTP() {
        setDefaultTimeout(DEFAULT_TIMEOUT);
    }

    public final void discardPackets() {
        DatagramPacket datagramPacket = new DatagramPacket(new byte[PACKET_SIZE], PACKET_SIZE);
        int soTimeout = getSoTimeout();
        setSoTimeout(1);
        while (true) {
            try {
                this._socket_.receive(datagramPacket);
            } catch (SocketException unused) {
                setSoTimeout(soTimeout);
                return;
            } catch (InterruptedIOException unused2) {
                setSoTimeout(soTimeout);
                return;
            }
        }
    }

    public final TFTPPacket bufferedReceive() {
        this.__receiveDatagram.setData(this.__receiveBuffer);
        this.__receiveDatagram.setLength(this.__receiveBuffer.length);
        this._socket_.receive(this.__receiveDatagram);
        return TFTPPacket.newTFTPPacket(this.__receiveDatagram);
    }

    public final void bufferedSend(TFTPPacket tFTPPacket) {
        this._socket_.send(tFTPPacket._newDatagram(this.__sendDatagram, this._sendBuffer));
    }

    public final void beginBufferedOps() {
        this.__receiveBuffer = new byte[PACKET_SIZE];
        this.__receiveDatagram = new DatagramPacket(this.__receiveBuffer, this.__receiveBuffer.length);
        this._sendBuffer = new byte[PACKET_SIZE];
        this.__sendDatagram = new DatagramPacket(this._sendBuffer, this._sendBuffer.length);
    }

    public final void endBufferedOps() {
        this.__receiveBuffer = null;
        this.__receiveDatagram = null;
        this._sendBuffer = null;
        this.__sendDatagram = null;
    }

    public final void send(TFTPPacket tFTPPacket) {
        this._socket_.send(tFTPPacket.newDatagram());
    }

    public final TFTPPacket receive() {
        DatagramPacket datagramPacket = new DatagramPacket(new byte[PACKET_SIZE], PACKET_SIZE);
        this._socket_.receive(datagramPacket);
        return TFTPPacket.newTFTPPacket(datagramPacket);
    }
}
