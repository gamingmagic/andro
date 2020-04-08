package org.apache.commons.net;

import java.net.DatagramSocket;
import java.net.InetAddress;

public abstract class DatagramSocketClient {
    private static final DatagramSocketFactory __DEFAULT_SOCKET_FACTORY = new DefaultDatagramSocketFactory();
    protected boolean _isOpen_ = false;
    protected DatagramSocketFactory _socketFactory_ = __DEFAULT_SOCKET_FACTORY;
    protected DatagramSocket _socket_ = null;
    protected int _timeout_ = 0;

    static {
    }

    public void open() {
        this._socket_ = this._socketFactory_.createDatagramSocket();
        this._socket_.setSoTimeout(this._timeout_);
        this._isOpen_ = true;
    }

    public void open(int i) {
        this._socket_ = this._socketFactory_.createDatagramSocket(i);
        this._socket_.setSoTimeout(this._timeout_);
        this._isOpen_ = true;
    }

    public void open(int i, InetAddress inetAddress) {
        this._socket_ = this._socketFactory_.createDatagramSocket(i, inetAddress);
        this._socket_.setSoTimeout(this._timeout_);
        this._isOpen_ = true;
    }

    public void close() {
        if (this._socket_ != null) {
            this._socket_.close();
        }
        this._socket_ = null;
        this._isOpen_ = false;
    }

    public boolean isOpen() {
        return this._isOpen_;
    }

    public void setDefaultTimeout(int i) {
        this._timeout_ = i;
    }

    public int getDefaultTimeout() {
        return this._timeout_;
    }

    public void setSoTimeout(int i) {
        this._socket_.setSoTimeout(i);
    }

    public int getSoTimeout() {
        return this._socket_.getSoTimeout();
    }

    public int getLocalPort() {
        return this._socket_.getLocalPort();
    }

    public InetAddress getLocalAddress() {
        return this._socket_.getLocalAddress();
    }

    public void setDatagramSocketFactory(DatagramSocketFactory datagramSocketFactory) {
        if (datagramSocketFactory == null) {
            this._socketFactory_ = __DEFAULT_SOCKET_FACTORY;
        } else {
            this._socketFactory_ = datagramSocketFactory;
        }
    }
}
