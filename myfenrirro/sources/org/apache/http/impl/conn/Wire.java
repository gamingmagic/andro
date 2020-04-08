package org.apache.http.impl.conn;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.commons.logging.Log;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.TokenParser;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class Wire {

    /* renamed from: id */
    private final String f9022id;
    private final Log log;

    public Wire(Log log2, String str) {
        this.log = log2;
        this.f9022id = str;
    }

    public Wire(Log log2) {
        this(log2, "");
    }

    private void wire(String str, InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            } else if (read == 13) {
                sb.append("[\\r]");
            } else if (read == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, "\"");
                sb.insert(0, str);
                this.log.debug(this.f9022id + " " + sb.toString());
                sb.setLength(0);
            } else if (read < 32 || read > 127) {
                sb.append("[0x");
                sb.append(Integer.toHexString(read));
                sb.append("]");
            } else {
                sb.append((char) read);
            }
        }
        if (sb.length() > 0) {
            sb.append(TokenParser.DQUOTE);
            sb.insert(0, TokenParser.DQUOTE);
            sb.insert(0, str);
            this.log.debug(this.f9022id + " " + sb.toString());
        }
    }

    public boolean enabled() {
        return this.log.isDebugEnabled();
    }

    public void output(InputStream inputStream) {
        Args.notNull(inputStream, "Output");
        wire(">> ", inputStream);
    }

    public void input(InputStream inputStream) {
        Args.notNull(inputStream, "Input");
        wire("<< ", inputStream);
    }

    public void output(byte[] bArr, int i, int i2) {
        Args.notNull(bArr, "Output");
        wire(">> ", new ByteArrayInputStream(bArr, i, i2));
    }

    public void input(byte[] bArr, int i, int i2) {
        Args.notNull(bArr, "Input");
        wire("<< ", new ByteArrayInputStream(bArr, i, i2));
    }

    public void output(byte[] bArr) {
        Args.notNull(bArr, "Output");
        wire(">> ", new ByteArrayInputStream(bArr));
    }

    public void input(byte[] bArr) {
        Args.notNull(bArr, "Input");
        wire("<< ", new ByteArrayInputStream(bArr));
    }

    public void output(int i) {
        output(new byte[]{(byte) i});
    }

    public void input(int i) {
        input(new byte[]{(byte) i});
    }

    public void output(String str) {
        Args.notNull(str, "Output");
        output(str.getBytes());
    }

    public void input(String str) {
        Args.notNull(str, "Input");
        input(str.getBytes());
    }
}
