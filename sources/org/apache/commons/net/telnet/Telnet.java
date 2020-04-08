package org.apache.commons.net.telnet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.net.SocketClient;

class Telnet extends SocketClient {
    static final int DEFAULT_PORT = 23;
    protected static final int TERMINAL_TYPE = 24;
    protected static final int TERMINAL_TYPE_IS = 0;
    protected static final int TERMINAL_TYPE_SEND = 1;
    static final byte[] _COMMAND_AYT = {-1, -10};
    static final byte[] _COMMAND_DO = {-1, -3};
    static final byte[] _COMMAND_DONT = {-1, -2};
    static final byte[] _COMMAND_IS = {24, 0};
    static final byte[] _COMMAND_SB = {-1, -6};
    static final byte[] _COMMAND_SE = {-1, -16};
    static final byte[] _COMMAND_WILL = {-1, -5};
    static final byte[] _COMMAND_WONT = {-1, -4};
    static final int _DO_MASK = 2;
    static final int _REQUESTED_DO_MASK = 8;
    static final int _REQUESTED_WILL_MASK = 4;
    static final int _WILL_MASK = 1;
    static final boolean debug = false;
    static final boolean debugoptions = false;
    private TelnetNotificationHandler __notifhand = null;
    int[] _doResponse;
    int[] _options;
    int[] _willResponse;
    private volatile boolean aytFlag = true;
    private Object aytMonitor = new Object();
    private TelnetOptionHandler[] optionHandlers;
    private volatile OutputStream spyStream = null;
    private String terminalType = null;

    static {
    }

    Telnet() {
        setDefaultPort(23);
        this._doResponse = new int[256];
        this._willResponse = new int[256];
        this._options = new int[256];
        this.optionHandlers = new TelnetOptionHandler[256];
    }

    Telnet(String str) {
        setDefaultPort(23);
        this._doResponse = new int[256];
        this._willResponse = new int[256];
        this._options = new int[256];
        this.terminalType = str;
        this.optionHandlers = new TelnetOptionHandler[256];
    }

    /* access modifiers changed from: 0000 */
    public boolean _stateIsWill(int i) {
        return (this._options[i] & 1) != 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean _stateIsWont(int i) {
        return !_stateIsWill(i);
    }

    /* access modifiers changed from: 0000 */
    public boolean _stateIsDo(int i) {
        return (this._options[i] & 2) != 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean _stateIsDont(int i) {
        return !_stateIsDo(i);
    }

    /* access modifiers changed from: 0000 */
    public boolean _requestedWill(int i) {
        return (this._options[i] & 4) != 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean _requestedWont(int i) {
        return !_requestedWill(i);
    }

    /* access modifiers changed from: 0000 */
    public boolean _requestedDo(int i) {
        return (this._options[i] & 8) != 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean _requestedDont(int i) {
        return !_requestedDo(i);
    }

    /* access modifiers changed from: 0000 */
    public void _setWill(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] | 1;
        if (_requestedWill(i) && this.optionHandlers[i] != null) {
            this.optionHandlers[i].setWill(true);
            int[] startSubnegotiationLocal = this.optionHandlers[i].startSubnegotiationLocal();
            if (startSubnegotiationLocal != null) {
                _sendSubnegotiation(startSubnegotiationLocal);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void _setDo(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] | 2;
        if (_requestedDo(i) && this.optionHandlers[i] != null) {
            this.optionHandlers[i].setDo(true);
            int[] startSubnegotiationRemote = this.optionHandlers[i].startSubnegotiationRemote();
            if (startSubnegotiationRemote != null) {
                _sendSubnegotiation(startSubnegotiationRemote);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void _setWantWill(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] | 4;
    }

    /* access modifiers changed from: 0000 */
    public void _setWantDo(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] | 8;
    }

    /* access modifiers changed from: 0000 */
    public void _setWont(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] & -2;
        if (this.optionHandlers[i] != null) {
            this.optionHandlers[i].setWill(false);
        }
    }

    /* access modifiers changed from: 0000 */
    public void _setDont(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] & -3;
        if (this.optionHandlers[i] != null) {
            this.optionHandlers[i].setDo(false);
        }
    }

    /* access modifiers changed from: 0000 */
    public void _setWantWont(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] & -5;
    }

    /* access modifiers changed from: 0000 */
    public void _setWantDont(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] & -9;
    }

    /* access modifiers changed from: 0000 */
    public void _processCommand(int i) {
        if (this.__notifhand != null) {
            this.__notifhand.receivedNegotiation(5, i);
        }
    }

    /* access modifiers changed from: 0000 */
    public void _processDo(int i) {
        if (this.__notifhand != null) {
            this.__notifhand.receivedNegotiation(1, i);
        }
        boolean z = false;
        if (this.optionHandlers[i] != null) {
            z = this.optionHandlers[i].getAcceptLocal();
        } else if (i == 24 && this.terminalType != null && this.terminalType.length() > 0) {
            z = true;
        }
        if (this._willResponse[i] > 0) {
            int[] iArr = this._willResponse;
            iArr[i] = iArr[i] - 1;
            if (this._willResponse[i] > 0 && _stateIsWill(i)) {
                int[] iArr2 = this._willResponse;
                iArr2[i] = iArr2[i] - 1;
            }
        }
        if (this._willResponse[i] == 0 && _requestedWont(i)) {
            if (z) {
                _setWantWill(i);
                _sendWill(i);
            } else {
                int[] iArr3 = this._willResponse;
                iArr3[i] = iArr3[i] + 1;
                _sendWont(i);
            }
        }
        _setWill(i);
    }

    /* access modifiers changed from: 0000 */
    public void _processDont(int i) {
        if (this.__notifhand != null) {
            this.__notifhand.receivedNegotiation(2, i);
        }
        if (this._willResponse[i] > 0) {
            int[] iArr = this._willResponse;
            iArr[i] = iArr[i] - 1;
            if (this._willResponse[i] > 0 && _stateIsWont(i)) {
                int[] iArr2 = this._willResponse;
                iArr2[i] = iArr2[i] - 1;
            }
        }
        if (this._willResponse[i] == 0 && _requestedWill(i)) {
            if (_stateIsWill(i) || _requestedWill(i)) {
                _sendWont(i);
            }
            _setWantWont(i);
        }
        _setWont(i);
    }

    /* access modifiers changed from: 0000 */
    public void _processWill(int i) {
        if (this.__notifhand != null) {
            this.__notifhand.receivedNegotiation(3, i);
        }
        boolean z = false;
        if (this.optionHandlers[i] != null) {
            z = this.optionHandlers[i].getAcceptRemote();
        }
        if (this._doResponse[i] > 0) {
            int[] iArr = this._doResponse;
            iArr[i] = iArr[i] - 1;
            if (this._doResponse[i] > 0 && _stateIsDo(i)) {
                int[] iArr2 = this._doResponse;
                iArr2[i] = iArr2[i] - 1;
            }
        }
        if (this._doResponse[i] == 0 && _requestedDont(i)) {
            if (z) {
                _setWantDo(i);
                _sendDo(i);
            } else {
                int[] iArr3 = this._doResponse;
                iArr3[i] = iArr3[i] + 1;
                _sendDont(i);
            }
        }
        _setDo(i);
    }

    /* access modifiers changed from: 0000 */
    public void _processWont(int i) {
        if (this.__notifhand != null) {
            this.__notifhand.receivedNegotiation(4, i);
        }
        if (this._doResponse[i] > 0) {
            int[] iArr = this._doResponse;
            iArr[i] = iArr[i] - 1;
            if (this._doResponse[i] > 0 && _stateIsDont(i)) {
                int[] iArr2 = this._doResponse;
                iArr2[i] = iArr2[i] - 1;
            }
        }
        if (this._doResponse[i] == 0 && _requestedDo(i)) {
            if (_stateIsDo(i) || _requestedDo(i)) {
                _sendDont(i);
            }
            _setWantDont(i);
        }
        _setDont(i);
    }

    /* access modifiers changed from: 0000 */
    public void _processSuboption(int[] iArr, int i) {
        if (i > 0) {
            if (this.optionHandlers[iArr[0]] != null) {
                _sendSubnegotiation(this.optionHandlers[iArr[0]].answerSubnegotiation(iArr, i));
            } else if (i > 1 && iArr[0] == 24 && iArr[1] == 1) {
                _sendTerminalType();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void _sendTerminalType() {
        if (this.terminalType != null) {
            this._output_.write(_COMMAND_SB);
            this._output_.write(_COMMAND_IS);
            this._output_.write(this.terminalType.getBytes());
            this._output_.write(_COMMAND_SE);
            this._output_.flush();
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void _sendSubnegotiation(int[] iArr) {
        if (iArr != null) {
            this._output_.write(_COMMAND_SB);
            for (int i : iArr) {
                byte b = (byte) i;
                if (b == -1) {
                    this._output_.write(b);
                }
                this._output_.write(b);
            }
            this._output_.write(_COMMAND_SE);
            this._output_.flush();
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void _sendCommand(byte b) {
        this._output_.write(255);
        this._output_.write(b);
        this._output_.flush();
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void _processAYTResponse() {
        if (!this.aytFlag) {
            synchronized (this.aytMonitor) {
                this.aytFlag = true;
                this.aytMonitor.notifyAll();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _connectAction_() {
        for (int i = 0; i < 256; i++) {
            this._doResponse[i] = 0;
            this._willResponse[i] = 0;
            this._options[i] = 0;
            if (this.optionHandlers[i] != null) {
                this.optionHandlers[i].setDo(false);
                this.optionHandlers[i].setWill(false);
            }
        }
        super._connectAction_();
        this._input_ = new BufferedInputStream(this._input_);
        this._output_ = new BufferedOutputStream(this._output_);
        for (int i2 = 0; i2 < 256; i2++) {
            if (this.optionHandlers[i2] != null) {
                if (this.optionHandlers[i2].getInitLocal()) {
                    _requestWill(this.optionHandlers[i2].getOptionCode());
                }
                if (this.optionHandlers[i2].getInitRemote()) {
                    _requestDo(this.optionHandlers[i2].getOptionCode());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void _sendDo(int i) {
        this._output_.write(_COMMAND_DO);
        this._output_.write(i);
        this._output_.flush();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void _requestDo(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int[] r0 = r3._doResponse     // Catch:{ all -> 0x0025 }
            r0 = r0[r4]     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x000d
            boolean r0 = r3._stateIsDo(r4)     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0013
        L_0x000d:
            boolean r0 = r3._requestedDo(r4)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0015
        L_0x0013:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return
        L_0x0015:
            r3._setWantDo(r4)     // Catch:{ all -> 0x0025 }
            int[] r0 = r3._doResponse     // Catch:{ all -> 0x0025 }
            r1 = r0[r4]     // Catch:{ all -> 0x0025 }
            int r1 = r1 + 1
            r0[r4] = r1     // Catch:{ all -> 0x0025 }
            r3._sendDo(r4)     // Catch:{ all -> 0x0025 }
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.telnet.Telnet._requestDo(int):void");
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void _sendDont(int i) {
        this._output_.write(_COMMAND_DONT);
        this._output_.write(i);
        this._output_.flush();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void _requestDont(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int[] r0 = r3._doResponse     // Catch:{ all -> 0x0025 }
            r0 = r0[r4]     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x000d
            boolean r0 = r3._stateIsDont(r4)     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0013
        L_0x000d:
            boolean r0 = r3._requestedDont(r4)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0015
        L_0x0013:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return
        L_0x0015:
            r3._setWantDont(r4)     // Catch:{ all -> 0x0025 }
            int[] r0 = r3._doResponse     // Catch:{ all -> 0x0025 }
            r1 = r0[r4]     // Catch:{ all -> 0x0025 }
            int r1 = r1 + 1
            r0[r4] = r1     // Catch:{ all -> 0x0025 }
            r3._sendDont(r4)     // Catch:{ all -> 0x0025 }
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.telnet.Telnet._requestDont(int):void");
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void _sendWill(int i) {
        this._output_.write(_COMMAND_WILL);
        this._output_.write(i);
        this._output_.flush();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void _requestWill(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int[] r0 = r3._willResponse     // Catch:{ all -> 0x0025 }
            r0 = r0[r4]     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x000d
            boolean r0 = r3._stateIsWill(r4)     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0013
        L_0x000d:
            boolean r0 = r3._requestedWill(r4)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0015
        L_0x0013:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return
        L_0x0015:
            r3._setWantWill(r4)     // Catch:{ all -> 0x0025 }
            int[] r0 = r3._doResponse     // Catch:{ all -> 0x0025 }
            r1 = r0[r4]     // Catch:{ all -> 0x0025 }
            int r1 = r1 + 1
            r0[r4] = r1     // Catch:{ all -> 0x0025 }
            r3._sendWill(r4)     // Catch:{ all -> 0x0025 }
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.telnet.Telnet._requestWill(int):void");
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void _sendWont(int i) {
        this._output_.write(_COMMAND_WONT);
        this._output_.write(i);
        this._output_.flush();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void _requestWont(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int[] r0 = r3._willResponse     // Catch:{ all -> 0x0025 }
            r0 = r0[r4]     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x000d
            boolean r0 = r3._stateIsWont(r4)     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0013
        L_0x000d:
            boolean r0 = r3._requestedWont(r4)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0015
        L_0x0013:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return
        L_0x0015:
            r3._setWantWont(r4)     // Catch:{ all -> 0x0025 }
            int[] r0 = r3._doResponse     // Catch:{ all -> 0x0025 }
            r1 = r0[r4]     // Catch:{ all -> 0x0025 }
            int r1 = r1 + 1
            r0[r4] = r1     // Catch:{ all -> 0x0025 }
            r3._sendWont(r4)     // Catch:{ all -> 0x0025 }
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.telnet.Telnet._requestWont(int):void");
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void _sendByte(int i) {
        this._output_.write(i);
        _spyWrite(i);
    }

    /* access modifiers changed from: 0000 */
    public final boolean _sendAYT(long j) {
        boolean z;
        synchronized (this.aytMonitor) {
            synchronized (this) {
                this.aytFlag = false;
                this._output_.write(_COMMAND_AYT);
                this._output_.flush();
                this.aytMonitor.wait(j);
                if (!this.aytFlag) {
                    z = false;
                    this.aytFlag = true;
                } else {
                    z = true;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public void addOptionHandler(TelnetOptionHandler telnetOptionHandler) {
        int optionCode = telnetOptionHandler.getOptionCode();
        if (!TelnetOption.isValidOption(optionCode)) {
            throw new InvalidTelnetOptionException("Invalid Option Code", optionCode);
        } else if (this.optionHandlers[optionCode] == null) {
            this.optionHandlers[optionCode] = telnetOptionHandler;
            if (isConnected()) {
                if (telnetOptionHandler.getInitLocal()) {
                    _requestWill(optionCode);
                }
                if (telnetOptionHandler.getInitRemote()) {
                    _requestDo(optionCode);
                }
            }
        } else {
            throw new InvalidTelnetOptionException("Already registered option", optionCode);
        }
    }

    /* access modifiers changed from: 0000 */
    public void deleteOptionHandler(int i) {
        if (!TelnetOption.isValidOption(i)) {
            throw new InvalidTelnetOptionException("Invalid Option Code", i);
        } else if (this.optionHandlers[i] == null) {
            throw new InvalidTelnetOptionException("Unregistered option", i);
        } else {
            TelnetOptionHandler telnetOptionHandler = this.optionHandlers[i];
            this.optionHandlers[i] = null;
            if (telnetOptionHandler.getWill()) {
                _requestWont(i);
            }
            if (telnetOptionHandler.getDo()) {
                _requestDont(i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void _registerSpyStream(OutputStream outputStream) {
        this.spyStream = outputStream;
    }

    /* access modifiers changed from: 0000 */
    public void _stopSpyStream() {
        this.spyStream = null;
    }

    /* access modifiers changed from: 0000 */
    public void _spyRead(int i) {
        OutputStream outputStream = this.spyStream;
        if (!(outputStream == null || i == 13)) {
            try {
                outputStream.write(i);
                if (i == 10) {
                    outputStream.write(13);
                }
                outputStream.flush();
            } catch (IOException unused) {
                this.spyStream = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void _spyWrite(int i) {
        if (!_stateIsDo(1) || !_requestedDo(1)) {
            OutputStream outputStream = this.spyStream;
            if (outputStream != null) {
                try {
                    outputStream.write(i);
                    outputStream.flush();
                } catch (IOException unused) {
                    this.spyStream = null;
                }
            }
        }
    }

    public void registerNotifHandler(TelnetNotificationHandler telnetNotificationHandler) {
        this.__notifhand = telnetNotificationHandler;
    }

    public void unregisterNotifHandler() {
        this.__notifhand = null;
    }
}
