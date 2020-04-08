package org.apache.commons.net.nntp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.p005io.CRLFLineReader;
import org.apache.http.message.TokenParser;

public class NNTP extends SocketClient {
    public static final int DEFAULT_PORT = 119;
    private static final String __DEFAULT_ENCODING = "ISO-8859-1";
    protected ProtocolCommandSupport _commandSupport_ = new ProtocolCommandSupport(this);
    boolean _isAllowedToPost = false;
    protected BufferedReader _reader_ = null;
    int _replyCode;
    String _replyString = null;
    protected BufferedWriter _writer_ = null;

    public NNTP() {
        setDefaultPort(DEFAULT_PORT);
    }

    private void __getReply() {
        this._replyString = this._reader_.readLine();
        if (this._replyString == null) {
            throw new NNTPConnectionClosedException("Connection closed without indication.");
        } else if (this._replyString.length() < 3) {
            throw new MalformedServerReplyException("Truncated server reply: " + this._replyString);
        } else {
            try {
                this._replyCode = Integer.parseInt(this._replyString.substring(0, 3));
                fireReplyReceived(this._replyCode, this._replyString + SocketClient.NETASCII_EOL);
                if (this._replyCode == 400) {
                    throw new NNTPConnectionClosedException("NNTP response 400 received.  Server closed connection.");
                }
            } catch (NumberFormatException unused) {
                throw new MalformedServerReplyException("Could not parse response code.\nServer Reply: " + this._replyString);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _connectAction_() {
        super._connectAction_();
        this._reader_ = new CRLFLineReader(new InputStreamReader(this._input_, "ISO-8859-1"));
        this._writer_ = new BufferedWriter(new OutputStreamWriter(this._output_, "ISO-8859-1"));
        __getReply();
        this._isAllowedToPost = this._replyCode == 200;
    }

    public void disconnect() {
        super.disconnect();
        this._reader_ = null;
        this._writer_ = null;
        this._replyString = null;
        this._isAllowedToPost = false;
    }

    public boolean isAllowedToPost() {
        return this._isAllowedToPost;
    }

    public int sendCommand(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            sb.append(TokenParser.f9030SP);
            sb.append(str2);
        }
        sb.append(SocketClient.NETASCII_EOL);
        BufferedWriter bufferedWriter = this._writer_;
        String sb2 = sb.toString();
        bufferedWriter.write(sb2);
        this._writer_.flush();
        fireCommandSent(str, sb2);
        __getReply();
        return this._replyCode;
    }

    public int sendCommand(int i, String str) {
        return sendCommand(NNTPCommand.getCommand(i), str);
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

    public String getReplyString() {
        return this._replyString;
    }

    public int article(String str) {
        return sendCommand(0, str);
    }

    public int article(long j) {
        return sendCommand(0, Long.toString(j));
    }

    public int article() {
        return sendCommand(0);
    }

    public int body(String str) {
        return sendCommand(1, str);
    }

    public int body(long j) {
        return sendCommand(1, Long.toString(j));
    }

    public int body() {
        return sendCommand(1);
    }

    public int head(String str) {
        return sendCommand(3, str);
    }

    public int head(long j) {
        return sendCommand(3, Long.toString(j));
    }

    public int head() {
        return sendCommand(3);
    }

    public int stat(String str) {
        return sendCommand(14, str);
    }

    public int stat(long j) {
        return sendCommand(14, Long.toString(j));
    }

    public int stat() {
        return sendCommand(14);
    }

    public int group(String str) {
        return sendCommand(2, str);
    }

    public int help() {
        return sendCommand(4);
    }

    public int ihave(String str) {
        return sendCommand(5, str);
    }

    public int last() {
        return sendCommand(6);
    }

    public int list() {
        return sendCommand(7);
    }

    public int next() {
        return sendCommand(10);
    }

    public int newgroups(String str, String str2, boolean z, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(TokenParser.f9030SP);
        sb.append(str2);
        if (z) {
            sb.append(TokenParser.f9030SP);
            sb.append("GMT");
        }
        if (str3 != null) {
            sb.append(" <");
            sb.append(str3);
            sb.append('>');
        }
        return sendCommand(8, sb.toString());
    }

    public int newnews(String str, String str2, String str3, boolean z, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(TokenParser.f9030SP);
        sb.append(str2);
        sb.append(TokenParser.f9030SP);
        sb.append(str3);
        if (z) {
            sb.append(TokenParser.f9030SP);
            sb.append("GMT");
        }
        if (str4 != null) {
            sb.append(" <");
            sb.append(str4);
            sb.append('>');
        }
        return sendCommand(9, sb.toString());
    }

    public int post() {
        return sendCommand(11);
    }

    public int quit() {
        return sendCommand(12);
    }

    public int authinfoUser(String str) {
        return sendCommand(15, "USER " + str);
    }

    public int authinfoPass(String str) {
        return sendCommand(15, "PASS " + str);
    }

    public int xover(String str) {
        return sendCommand(16, str);
    }

    public int xhdr(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = sb;
        sb.append(" ");
        sb2.append(str2);
        return sendCommand(17, sb2.toString());
    }

    public int listActive(String str) {
        StringBuilder sb = new StringBuilder("ACTIVE ");
        sb.append(str);
        return sendCommand(7, sb.toString());
    }

    @Deprecated
    public int article(int i) {
        return article((long) i);
    }

    @Deprecated
    public int body(int i) {
        return body((long) i);
    }

    @Deprecated
    public int head(int i) {
        return head((long) i);
    }

    @Deprecated
    public int stat(int i) {
        return stat((long) i);
    }

    /* access modifiers changed from: protected */
    public ProtocolCommandSupport getCommandSupport() {
        return this._commandSupport_;
    }
}
