package org.apache.commons.net.pop3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandListener;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.p005io.CRLFLineReader;
import org.apache.http.message.TokenParser;

public class POP3 extends SocketClient {
    public static final int AUTHORIZATION_STATE = 0;
    public static final int DEFAULT_PORT = 110;
    public static final int DISCONNECTED_STATE = -1;
    public static final int TRANSACTION_STATE = 1;
    public static final int UPDATE_STATE = 2;
    static final String _DEFAULT_ENCODING = "ISO-8859-1";
    static final String _ERROR = "-ERR";
    static final String _OK = "+OK";
    static final String _OK_INT = "+ ";
    private int __popState = -1;
    protected ProtocolCommandSupport _commandSupport_ = new ProtocolCommandSupport(this);
    String _lastReplyLine;
    BufferedReader _reader = null;
    int _replyCode;
    List<String> _replyLines = new ArrayList();
    BufferedWriter _writer = null;

    public POP3() {
        setDefaultPort(110);
    }

    private void __getReply() {
        this._replyLines.clear();
        String readLine = this._reader.readLine();
        if (readLine == null) {
            throw new EOFException("Connection closed without indication.");
        }
        if (readLine.startsWith(_OK)) {
            this._replyCode = 0;
        } else if (readLine.startsWith(_ERROR)) {
            this._replyCode = 1;
        } else if (readLine.startsWith(_OK_INT)) {
            this._replyCode = 2;
        } else {
            throw new MalformedServerReplyException("Received invalid POP3 protocol response from server." + readLine);
        }
        this._replyLines.add(readLine);
        this._lastReplyLine = readLine;
        fireReplyReceived(this._replyCode, getReplyString());
    }

    /* access modifiers changed from: protected */
    public void _connectAction_() {
        super._connectAction_();
        this._reader = new CRLFLineReader(new InputStreamReader(this._input_, "ISO-8859-1"));
        this._writer = new BufferedWriter(new OutputStreamWriter(this._output_, "ISO-8859-1"));
        __getReply();
        setState(0);
    }

    public void setState(int i) {
        this.__popState = i;
    }

    public int getState() {
        return this.__popState;
    }

    public void getAdditionalReply() {
        String readLine = this._reader.readLine();
        while (readLine != null) {
            this._replyLines.add(readLine);
            if (!readLine.equals(".")) {
                readLine = this._reader.readLine();
            } else {
                return;
            }
        }
    }

    public void disconnect() {
        super.disconnect();
        this._reader = null;
        this._writer = null;
        this._lastReplyLine = null;
        this._replyLines.clear();
        setState(-1);
    }

    public int sendCommand(String str, String str2) {
        if (this._writer == null) {
            throw new IllegalStateException("Socket is not connected");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            sb.append(TokenParser.f9030SP);
            sb.append(str2);
        }
        sb.append(SocketClient.NETASCII_EOL);
        String sb2 = sb.toString();
        this._writer.write(sb2);
        this._writer.flush();
        fireCommandSent(str, sb2);
        __getReply();
        return this._replyCode;
    }

    public int sendCommand(String str) {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(int i, String str) {
        return sendCommand(POP3Command._commands[i], str);
    }

    public int sendCommand(int i) {
        return sendCommand(POP3Command._commands[i], (String) null);
    }

    public String[] getReplyStrings() {
        return (String[]) this._replyLines.toArray(new String[this._replyLines.size()]);
    }

    public String getReplyString() {
        StringBuilder sb = new StringBuilder(256);
        for (String append : this._replyLines) {
            sb.append(append);
            sb.append(SocketClient.NETASCII_EOL);
        }
        return sb.toString();
    }

    public void removeProtocolCommandistener(ProtocolCommandListener protocolCommandListener) {
        removeProtocolCommandListener(protocolCommandListener);
    }

    /* access modifiers changed from: protected */
    public ProtocolCommandSupport getCommandSupport() {
        return this._commandSupport_;
    }
}
