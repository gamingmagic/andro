package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.p005io.CRLFLineReader;
import org.apache.http.message.TokenParser;

public class FTP extends SocketClient {
    public static final int ASCII_FILE_TYPE = 0;
    public static final int BINARY_FILE_TYPE = 2;
    public static final int BLOCK_TRANSFER_MODE = 11;
    public static final int CARRIAGE_CONTROL_TEXT_FORMAT = 6;
    public static final int COMPRESSED_TRANSFER_MODE = 12;
    public static final String DEFAULT_CONTROL_ENCODING = "ISO-8859-1";
    public static final int DEFAULT_DATA_PORT = 20;
    public static final int DEFAULT_PORT = 21;
    public static final int EBCDIC_FILE_TYPE = 1;
    public static final int FILE_STRUCTURE = 7;
    public static final int LOCAL_FILE_TYPE = 3;
    public static final int NON_PRINT_TEXT_FORMAT = 4;
    public static final int PAGE_STRUCTURE = 9;
    public static final int RECORD_STRUCTURE = 8;
    public static final int REPLY_CODE_LEN = 3;
    public static final int STREAM_TRANSFER_MODE = 10;
    public static final int TELNET_TEXT_FORMAT = 5;
    private static final String __modes = "AEILNTCFRPSBC";
    protected ProtocolCommandSupport _commandSupport_;
    protected String _controlEncoding;
    protected BufferedReader _controlInput_;
    protected BufferedWriter _controlOutput_;
    protected boolean _newReplyString;
    protected int _replyCode;
    protected ArrayList<String> _replyLines;
    protected String _replyString;
    protected boolean strictMultilineParsing = false;

    public FTP() {
        setDefaultPort(21);
        this._replyLines = new ArrayList<>();
        this._newReplyString = false;
        this._replyString = null;
        this._controlEncoding = "ISO-8859-1";
        this._commandSupport_ = new ProtocolCommandSupport(this);
    }

    private boolean __strictCheck(String str, String str2) {
        return !str.startsWith(str2) || str.charAt(3) != ' ';
    }

    private boolean __lenientCheck(String str) {
        return str.length() <= 3 || str.charAt(3) == '-' || !Character.isDigit(str.charAt(0));
    }

    private void __getReply() {
        __getReply(true);
    }

    /* access modifiers changed from: protected */
    public void __getReplyNoReport() {
        __getReply(false);
    }

    private void __getReply(boolean z) {
        this._newReplyString = true;
        this._replyLines.clear();
        String readLine = this._controlInput_.readLine();
        if (readLine == null) {
            throw new FTPConnectionClosedException("Connection closed without indication.");
        }
        int length = readLine.length();
        if (length < 3) {
            throw new MalformedServerReplyException("Truncated server reply: " + readLine);
        }
        try {
            String substring = readLine.substring(0, 3);
            this._replyCode = Integer.parseInt(substring);
            this._replyLines.add(readLine);
            if (length > 3 && readLine.charAt(3) == '-') {
                while (true) {
                    String readLine2 = this._controlInput_.readLine();
                    if (readLine2 == null) {
                        throw new FTPConnectionClosedException("Connection closed without indication.");
                    }
                    this._replyLines.add(readLine2);
                    if (isStrictMultilineParsing()) {
                        if (!__strictCheck(readLine2, substring)) {
                            break;
                        }
                    } else if (!__lenientCheck(readLine2)) {
                        break;
                    }
                }
            }
            fireReplyReceived(this._replyCode, getReplyString());
            if (this._replyCode == 421) {
                throw new FTPConnectionClosedException("FTP response 421 received.  Server closed connection.");
            }
        } catch (NumberFormatException unused) {
            throw new MalformedServerReplyException("Could not parse response code.\nServer Reply: " + readLine);
        }
    }

    /* access modifiers changed from: protected */
    public void _connectAction_() {
        super._connectAction_();
        this._controlInput_ = new CRLFLineReader(new InputStreamReader(this._input_, getControlEncoding()));
        this._controlOutput_ = new BufferedWriter(new OutputStreamWriter(this._output_, getControlEncoding()));
        if (this.connectTimeout > 0) {
            int soTimeout = this._socket_.getSoTimeout();
            this._socket_.setSoTimeout(this.connectTimeout);
            try {
                __getReply();
                if (FTPReply.isPositivePreliminary(this._replyCode)) {
                    __getReply();
                }
                this._socket_.setSoTimeout(soTimeout);
            } catch (SocketTimeoutException e) {
                IOException iOException = new IOException("Timed out waiting for initial connect reply");
                iOException.initCause(e);
                throw iOException;
            } catch (Throwable th) {
                while (true) {
                }
                this._socket_.setSoTimeout(soTimeout);
                throw th;
            }
        } else {
            __getReply();
            if (FTPReply.isPositivePreliminary(this._replyCode)) {
                __getReply();
            }
        }
    }

    public void setControlEncoding(String str) {
        this._controlEncoding = str;
    }

    public String getControlEncoding() {
        return this._controlEncoding;
    }

    public void disconnect() {
        super.disconnect();
        this._controlInput_ = null;
        this._controlOutput_ = null;
        this._newReplyString = false;
        this._replyString = null;
    }

    public int sendCommand(String str, String str2) {
        if (this._controlOutput_ == null) {
            throw new IOException("Connection is not open");
        }
        String __buildMessage = __buildMessage(str, str2);
        __send(__buildMessage);
        fireCommandSent(str, __buildMessage);
        __getReply();
        return this._replyCode;
    }

    private String __buildMessage(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            sb.append(TokenParser.f9030SP);
            sb.append(str2);
        }
        sb.append(SocketClient.NETASCII_EOL);
        return sb.toString();
    }

    private void __send(String str) {
        try {
            this._controlOutput_.write(str);
            this._controlOutput_.flush();
        } catch (SocketException e) {
            if (!isConnected()) {
                throw new FTPConnectionClosedException("Connection unexpectedly closed.");
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public void __noop() {
        __send(__buildMessage(FTPCommand.getCommand(32), null));
        __getReplyNoReport();
    }

    public int sendCommand(int i, String str) {
        return sendCommand(FTPCommand.getCommand(i), str);
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
        StringBuilder sb = new StringBuilder(256);
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

    public int user(String str) {
        return sendCommand(0, str);
    }

    public int pass(String str) {
        return sendCommand(1, str);
    }

    public int acct(String str) {
        return sendCommand(2, str);
    }

    public int abor() {
        return sendCommand(21);
    }

    public int cwd(String str) {
        return sendCommand(3, str);
    }

    public int cdup() {
        return sendCommand(4);
    }

    public int quit() {
        return sendCommand(7);
    }

    public int rein() {
        return sendCommand(6);
    }

    public int smnt(String str) {
        return sendCommand(5, str);
    }

    public int port(InetAddress inetAddress, int i) {
        StringBuilder sb = new StringBuilder(24);
        sb.append(inetAddress.getHostAddress().replace('.', ','));
        int i2 = i >>> 8;
        sb.append(',');
        sb.append(i2);
        sb.append(',');
        sb.append(i & 255);
        return sendCommand(8, sb.toString());
    }

    public int eprt(InetAddress inetAddress, int i) {
        StringBuilder sb = new StringBuilder();
        String hostAddress = inetAddress.getHostAddress();
        int indexOf = hostAddress.indexOf("%");
        if (indexOf > 0) {
            hostAddress = hostAddress.substring(0, indexOf);
        }
        sb.append("|");
        if (inetAddress instanceof Inet4Address) {
            sb.append("1");
        } else if (inetAddress instanceof Inet6Address) {
            sb.append("2");
        }
        sb.append("|");
        sb.append(hostAddress);
        sb.append("|");
        sb.append(i);
        sb.append("|");
        return sendCommand(37, sb.toString());
    }

    public int pasv() {
        return sendCommand(9);
    }

    public int epsv() {
        return sendCommand(36);
    }

    public int type(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(__modes.charAt(i));
        sb.append(TokenParser.f9030SP);
        if (i == 3) {
            sb.append(i2);
        } else {
            sb.append(__modes.charAt(i2));
        }
        return sendCommand(10, sb.toString());
    }

    public int type(int i) {
        return sendCommand(10, __modes.substring(i, i + 1));
    }

    public int stru(int i) {
        return sendCommand(11, __modes.substring(i, i + 1));
    }

    public int mode(int i) {
        return sendCommand(12, __modes.substring(i, i + 1));
    }

    public int retr(String str) {
        return sendCommand(13, str);
    }

    public int stor(String str) {
        return sendCommand(14, str);
    }

    public int stou() {
        return sendCommand(15);
    }

    public int stou(String str) {
        return sendCommand(15, str);
    }

    public int appe(String str) {
        return sendCommand(16, str);
    }

    public int allo(int i) {
        return sendCommand(17, Integer.toString(i));
    }

    public int feat() {
        return sendCommand(34);
    }

    public int allo(int i, int i2) {
        return sendCommand(17, Integer.toString(i) + " R " + Integer.toString(i2));
    }

    public int rest(String str) {
        return sendCommand(18, str);
    }

    public int mdtm(String str) {
        return sendCommand(33, str);
    }

    public int mfmt(String str, String str2) {
        return sendCommand(35, str2 + " " + str);
    }

    public int rnfr(String str) {
        return sendCommand(19, str);
    }

    public int rnto(String str) {
        return sendCommand(20, str);
    }

    public int dele(String str) {
        return sendCommand(22, str);
    }

    public int rmd(String str) {
        return sendCommand(23, str);
    }

    public int mkd(String str) {
        return sendCommand(24, str);
    }

    public int pwd() {
        return sendCommand(25);
    }

    public int list() {
        return sendCommand(26);
    }

    public int list(String str) {
        return sendCommand(26, str);
    }

    public int mlsd() {
        return sendCommand(38);
    }

    public int mlsd(String str) {
        return sendCommand(38, str);
    }

    public int mlst() {
        return sendCommand(39);
    }

    public int mlst(String str) {
        return sendCommand(39, str);
    }

    public int nlst() {
        return sendCommand(27);
    }

    public int nlst(String str) {
        return sendCommand(27, str);
    }

    public int site(String str) {
        return sendCommand(28, str);
    }

    public int syst() {
        return sendCommand(29);
    }

    public int stat() {
        return sendCommand(30);
    }

    public int stat(String str) {
        return sendCommand(30, str);
    }

    public int help() {
        return sendCommand(31);
    }

    public int help(String str) {
        return sendCommand(31, str);
    }

    public int noop() {
        return sendCommand(32);
    }

    public boolean isStrictMultilineParsing() {
        return this.strictMultilineParsing;
    }

    public void setStrictMultilineParsing(boolean z) {
        this.strictMultilineParsing = z;
    }

    /* access modifiers changed from: protected */
    public ProtocolCommandSupport getCommandSupport() {
        return this._commandSupport_;
    }
}
