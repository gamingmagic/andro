package org.apache.commons.net;

import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintCommandListener implements ProtocolCommandListener {
    private final boolean __directionMarker;
    private final char __eolMarker;
    private final boolean __nologin;
    private final PrintWriter __writer;

    public PrintCommandListener(PrintStream printStream) {
        this(new PrintWriter(printStream));
    }

    public PrintCommandListener(PrintStream printStream, boolean z) {
        this(new PrintWriter(printStream), z);
    }

    public PrintCommandListener(PrintStream printStream, boolean z, char c) {
        this(new PrintWriter(printStream), z, c);
    }

    public PrintCommandListener(PrintStream printStream, boolean z, char c, boolean z2) {
        this(new PrintWriter(printStream), z, c, z2);
    }

    public PrintCommandListener(PrintWriter printWriter) {
        this(printWriter, false);
    }

    public PrintCommandListener(PrintWriter printWriter, boolean z) {
        this(printWriter, z, 0);
    }

    public PrintCommandListener(PrintWriter printWriter, boolean z, char c) {
        this(printWriter, z, c, false);
    }

    public PrintCommandListener(PrintWriter printWriter, boolean z, char c, boolean z2) {
        this.__writer = printWriter;
        this.__nologin = z;
        this.__eolMarker = c;
        this.__directionMarker = z2;
    }

    public void protocolCommandSent(ProtocolCommandEvent protocolCommandEvent) {
        if (this.__directionMarker) {
            this.__writer.print("> ");
        }
        if (this.__nologin) {
            String command = protocolCommandEvent.getCommand();
            if ("PASS".equalsIgnoreCase(command) || "USER".equalsIgnoreCase(command)) {
                this.__writer.print(command);
                this.__writer.println(" *******");
            } else if ("LOGIN".equalsIgnoreCase(command)) {
                String message = protocolCommandEvent.getMessage();
                this.__writer.print(message.substring(0, message.indexOf("LOGIN") + 5));
                this.__writer.println(" *******");
            } else {
                this.__writer.print(getPrintableString(protocolCommandEvent.getMessage()));
            }
        } else {
            this.__writer.print(getPrintableString(protocolCommandEvent.getMessage()));
        }
        this.__writer.flush();
    }

    private String getPrintableString(String str) {
        if (this.__eolMarker == 0) {
            return str;
        }
        int indexOf = str.indexOf(SocketClient.NETASCII_EOL);
        if (indexOf <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, indexOf));
        sb.append(this.__eolMarker);
        sb.append(str.substring(indexOf));
        return sb.toString();
    }

    public void protocolReplyReceived(ProtocolCommandEvent protocolCommandEvent) {
        if (this.__directionMarker) {
            this.__writer.print("< ");
        }
        this.__writer.print(protocolCommandEvent.getMessage());
        this.__writer.flush();
    }
}
