package org.apache.commons.net.smtp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandListener;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.p005io.CRLFLineReader;
import org.apache.http.message.TokenParser;

public class SMTP extends SocketClient {
    public static final int DEFAULT_PORT = 25;
    private static final String __DEFAULT_ENCODING = "ISO-8859-1";
    protected ProtocolCommandSupport _commandSupport_;
    private boolean _newReplyString;
    BufferedReader _reader;
    private int _replyCode;
    private final ArrayList<String> _replyLines;
    private String _replyString;
    BufferedWriter _writer;
    protected final String encoding;

    public SMTP() {
        this("ISO-8859-1");
    }

    public SMTP(String str) {
        setDefaultPort(25);
        this._replyLines = new ArrayList<>();
        this._newReplyString = false;
        this._replyString = null;
        this._commandSupport_ = new ProtocolCommandSupport(this);
        this.encoding = str;
    }

    private int __sendCommand(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            if (z) {
                sb.append(TokenParser.f9030SP);
            }
            sb.append(str2);
        }
        sb.append(SocketClient.NETASCII_EOL);
        BufferedWriter bufferedWriter = this._writer;
        String sb2 = sb.toString();
        bufferedWriter.write(sb2);
        this._writer.flush();
        fireCommandSent(str, sb2);
        __getReply();
        return this._replyCode;
    }

    private int __sendCommand(int i, String str, boolean z) {
        return __sendCommand(SMTPCommand.getCommand(i), str, z);
    }

    private void __getReply() {
        this._newReplyString = true;
        this._replyLines.clear();
        String readLine = this._reader.readLine();
        if (readLine == null) {
            throw new SMTPConnectionClosedException("Connection closed without indication.");
        }
        int length = readLine.length();
        if (length < 3) {
            throw new MalformedServerReplyException("Truncated server reply: " + readLine);
        }
        try {
            this._replyCode = Integer.parseInt(readLine.substring(0, 3));
            this._replyLines.add(readLine);
            if (length > 3 && readLine.charAt(3) == '-') {
                while (true) {
                    String readLine2 = this._reader.readLine();
                    if (readLine2 != null) {
                        this._replyLines.add(readLine2);
                        if (readLine2.length() >= 4 && readLine2.charAt(3) != '-' && Character.isDigit(readLine2.charAt(0))) {
                            break;
                        }
                    } else {
                        throw new SMTPConnectionClosedException("Connection closed without indication.");
                    }
                }
            }
            fireReplyReceived(this._replyCode, getReplyString());
            if (this._replyCode == 421) {
                throw new SMTPConnectionClosedException("SMTP response 421 received.  Server closed connection.");
            }
        } catch (NumberFormatException unused) {
            throw new MalformedServerReplyException("Could not parse response code.\nServer Reply: " + readLine);
        }
    }

    /* access modifiers changed from: protected */
    public void _connectAction_() {
        super._connectAction_();
        this._reader = new CRLFLineReader(new InputStreamReader(this._input_, this.encoding));
        this._writer = new BufferedWriter(new OutputStreamWriter(this._output_, this.encoding));
        __getReply();
    }

    public void disconnect() {
        super.disconnect();
        this._reader = null;
        this._writer = null;
        this._replyString = null;
        this._replyLines.clear();
        this._newReplyString = false;
    }

    public int sendCommand(String str, String str2) {
        return __sendCommand(str, str2, true);
    }

    public int sendCommand(int i, String str) {
        return sendCommand(SMTPCommand.getCommand(i), str);
    }

    public int sendCommand(String str) {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(int i) {
        return sendCommand(i, (String) null);
    }

    public int getReplyCode() {
        return this._replyCode;
    }

    public int getReply() {
        __getReply();
        return this._replyCode;
    }

    public String[] getReplyStrings() {
        return (String[]) this._replyLines.toArray(new String[this._replyLines.size()]);
    }

    public String getReplyString() {
        if (!this._newReplyString) {
            return this._replyString;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this._replyLines.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(SocketClient.NETASCII_EOL);
        }
        this._newReplyString = false;
        String sb2 = sb.toString();
        this._replyString = sb2;
        return sb2;
    }

    public int helo(String str) {
        return sendCommand(0, str);
    }

    public int mail(String str) {
        return __sendCommand(1, str, false);
    }

    public int rcpt(String str) {
        return __sendCommand(2, str, false);
    }

    public int data() {
        return sendCommand(3);
    }

    public int send(String str) {
        return sendCommand(4, str);
    }

    public int soml(String str) {
        return sendCommand(5, str);
    }

    public int saml(String str) {
        return sendCommand(6, str);
    }

    public int rset() {
        return sendCommand(7);
    }

    public int vrfy(String str) {
        return sendCommand(8, str);
    }

    public int expn(String str) {
        return sendCommand(9, str);
    }

    public int help() {
        return sendCommand(10);
    }

    public int help(String str) {
        return sendCommand(10, str);
    }

    public int noop() {
        return sendCommand(11);
    }

    public int turn() {
        return sendCommand(12);
    }

    public int quit() {
        return sendCommand(13);
    }

    public void removeProtocolCommandistener(ProtocolCommandListener protocolCommandListener) {
        removeProtocolCommandListener(protocolCommandListener);
    }

    /* access modifiers changed from: protected */
    public ProtocolCommandSupport getCommandSupport() {
        return this._commandSupport_;
    }
}
