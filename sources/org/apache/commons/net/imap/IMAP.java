package org.apache.commons.net.imap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.p005io.CRLFLineReader;
import org.apache.http.message.TokenParser;

public class IMAP extends SocketClient {
    public static final int DEFAULT_PORT = 143;
    protected static final String __DEFAULT_ENCODING = "ISO-8859-1";
    private IMAPState __state;
    protected BufferedWriter __writer;
    private char[] _initialID = {'A', 'A', 'A', 'A'};
    protected BufferedReader _reader;
    private int _replyCode;
    private List<String> _replyLines;

    public enum IMAPState {
        DISCONNECTED_STATE,
        NOT_AUTH_STATE,
        AUTH_STATE,
        LOGOUT_STATE
    }

    public IMAP() {
        setDefaultPort(DEFAULT_PORT);
        this.__state = IMAPState.DISCONNECTED_STATE;
        this._reader = null;
        this.__writer = null;
        this._replyLines = new ArrayList();
        createCommandSupport();
    }

    private void __getReply() {
        __getReply(true);
    }

    private void __getReply(boolean z) {
        this._replyLines.clear();
        String readLine = this._reader.readLine();
        if (readLine == null) {
            throw new EOFException("Connection closed without indication.");
        }
        this._replyLines.add(readLine);
        if (z) {
            while (IMAPReply.isUntagged(readLine)) {
                int literalCount = IMAPReply.literalCount(readLine);
                while (literalCount >= 0) {
                    String readLine2 = this._reader.readLine();
                    if (readLine2 == null) {
                        throw new EOFException("Connection closed without indication.");
                    }
                    this._replyLines.add(readLine2);
                    literalCount -= readLine2.length() + 2;
                }
                readLine = this._reader.readLine();
                if (readLine == null) {
                    throw new EOFException("Connection closed without indication.");
                }
                this._replyLines.add(readLine);
            }
            this._replyCode = IMAPReply.getReplyCode(readLine);
        } else {
            this._replyCode = IMAPReply.getUntaggedReplyCode(readLine);
        }
        fireReplyReceived(this._replyCode, getReplyString());
    }

    /* access modifiers changed from: protected */
    public void _connectAction_() {
        super._connectAction_();
        this._reader = new CRLFLineReader(new InputStreamReader(this._input_, "ISO-8859-1"));
        this.__writer = new BufferedWriter(new OutputStreamWriter(this._output_, "ISO-8859-1"));
        int soTimeout = getSoTimeout();
        if (soTimeout <= 0) {
            setSoTimeout(this.connectTimeout);
        }
        __getReply(false);
        if (soTimeout <= 0) {
            setSoTimeout(soTimeout);
        }
        setState(IMAPState.NOT_AUTH_STATE);
    }

    /* access modifiers changed from: protected */
    public void setState(IMAPState iMAPState) {
        this.__state = iMAPState;
    }

    public IMAPState getState() {
        return this.__state;
    }

    public void disconnect() {
        super.disconnect();
        this._reader = null;
        this.__writer = null;
        this._replyLines.clear();
        setState(IMAPState.DISCONNECTED_STATE);
    }

    private int sendCommandWithID(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
            sb.append(TokenParser.f9030SP);
        }
        sb.append(str2);
        if (str3 != null) {
            sb.append(TokenParser.f9030SP);
            sb.append(str3);
        }
        sb.append(SocketClient.NETASCII_EOL);
        String sb2 = sb.toString();
        this.__writer.write(sb2);
        this.__writer.flush();
        fireCommandSent(str2, sb2);
        __getReply();
        return this._replyCode;
    }

    public int sendCommand(String str, String str2) {
        return sendCommandWithID(generateCommandID(), str, str2);
    }

    public int sendCommand(String str) {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(IMAPCommand iMAPCommand, String str) {
        return sendCommand(iMAPCommand.getIMAPCommand(), str);
    }

    public boolean doCommand(IMAPCommand iMAPCommand, String str) {
        return IMAPReply.isSuccess(sendCommand(iMAPCommand, str));
    }

    public int sendCommand(IMAPCommand iMAPCommand) {
        return sendCommand(iMAPCommand, (String) null);
    }

    public boolean doCommand(IMAPCommand iMAPCommand) {
        return IMAPReply.isSuccess(sendCommand(iMAPCommand));
    }

    public int sendData(String str) {
        return sendCommandWithID(null, str, null);
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

    /* access modifiers changed from: protected */
    public String generateCommandID() {
        String str = new String(this._initialID);
        boolean z = true;
        int length = this._initialID.length - 1;
        while (z && length >= 0) {
            if (this._initialID[length] == 'Z') {
                this._initialID[length] = 'A';
            } else {
                char[] cArr = this._initialID;
                cArr[length] = (char) (cArr[length] + 1);
                z = false;
            }
            length--;
        }
        return str;
    }
}
