package org.apache.commons.net.telnet;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TelnetClient extends Telnet {
    private InputStream __input = null;
    private OutputStream __output = null;
    private TelnetInputListener inputListener;
    protected boolean readerThread = true;

    public TelnetClient() {
        super("VT100");
    }

    public TelnetClient(String str) {
        super(str);
    }

    /* access modifiers changed from: 0000 */
    public void _flushOutputStream() {
        this._output_.flush();
    }

    /* access modifiers changed from: 0000 */
    public void _closeOutputStream() {
        this._output_.close();
    }

    /* access modifiers changed from: protected */
    public void _connectAction_() {
        super._connectAction_();
        TelnetInputStream telnetInputStream = new TelnetInputStream(this._input_, this, this.readerThread);
        if (this.readerThread) {
            telnetInputStream._start();
        }
        this.__input = new BufferedInputStream(telnetInputStream);
        this.__output = new TelnetOutputStream(this);
    }

    public void disconnect() {
        if (this.__input != null) {
            this.__input.close();
        }
        if (this.__output != null) {
            this.__output.close();
        }
        super.disconnect();
    }

    public OutputStream getOutputStream() {
        return this.__output;
    }

    public InputStream getInputStream() {
        return this.__input;
    }

    public boolean getLocalOptionState(int i) {
        return _stateIsWill(i) && _requestedWill(i);
    }

    public boolean getRemoteOptionState(int i) {
        return _stateIsDo(i) && _requestedDo(i);
    }

    public boolean sendAYT(long j) {
        return _sendAYT(j);
    }

    public void sendSubnegotiation(int[] iArr) {
        if (iArr.length <= 0) {
            throw new IllegalArgumentException("zero length message");
        }
        _sendSubnegotiation(iArr);
    }

    public void sendCommand(byte b) {
        _sendCommand(b);
    }

    public void addOptionHandler(TelnetOptionHandler telnetOptionHandler) {
        super.addOptionHandler(telnetOptionHandler);
    }

    public void deleteOptionHandler(int i) {
        super.deleteOptionHandler(i);
    }

    public void registerSpyStream(OutputStream outputStream) {
        super._registerSpyStream(outputStream);
    }

    public void stopSpyStream() {
        super._stopSpyStream();
    }

    public void registerNotifHandler(TelnetNotificationHandler telnetNotificationHandler) {
        super.registerNotifHandler(telnetNotificationHandler);
    }

    public void unregisterNotifHandler() {
        super.unregisterNotifHandler();
    }

    public void setReaderThread(boolean z) {
        this.readerThread = z;
    }

    public boolean getReaderThread() {
        return this.readerThread;
    }

    public synchronized void registerInputListener(TelnetInputListener telnetInputListener) {
        this.inputListener = telnetInputListener;
    }

    public synchronized void unregisterInputListener() {
        this.inputListener = null;
    }

    /* access modifiers changed from: 0000 */
    public void notifyInputListener() {
        synchronized (this) {
            TelnetInputListener telnetInputListener = this.inputListener;
            if (telnetInputListener != null) {
                telnetInputListener.telnetInputAvailable();
            }
        }
    }
}
