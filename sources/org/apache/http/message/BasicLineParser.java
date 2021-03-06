package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class BasicLineParser implements LineParser {
    @Deprecated
    public static final BasicLineParser DEFAULT = new BasicLineParser();
    public static final BasicLineParser INSTANCE = new BasicLineParser();
    protected final ProtocolVersion protocol;

    static {
    }

    public BasicLineParser(ProtocolVersion protocolVersion) {
        this.protocol = protocolVersion != null ? protocolVersion : HttpVersion.HTTP_1_1;
    }

    public BasicLineParser() {
        this(null);
    }

    public static ProtocolVersion parseProtocolVersion(String str, LineParser lineParser) {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return (lineParser != null ? lineParser : INSTANCE).parseProtocolVersion(charArrayBuffer, new ParserCursor(0, str.length()));
    }

    public ProtocolVersion parseProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        Args.notNull(charArrayBuffer, "Char array buffer");
        Args.notNull(parserCursor, "Parser cursor");
        String protocol2 = this.protocol.getProtocol();
        int length = protocol2.length();
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        skipWhitespace(charArrayBuffer, parserCursor);
        int pos2 = parserCursor.getPos();
        if (pos2 + length + 4 > upperBound) {
            throw new ParseException("Not a valid protocol version: " + charArrayBuffer.substring(pos, upperBound));
        }
        boolean z = true;
        int i = 0;
        while (z && i < length) {
            z = charArrayBuffer.charAt(pos2 + i) == protocol2.charAt(i);
            i++;
        }
        if (z) {
            z = charArrayBuffer.charAt(pos2 + length) == '/';
        }
        if (!z) {
            throw new ParseException("Not a valid protocol version: " + charArrayBuffer.substring(pos, upperBound));
        }
        int i2 = pos2 + length + 1;
        int indexOf = charArrayBuffer.indexOf(46, i2, upperBound);
        if (indexOf == -1) {
            throw new ParseException("Invalid protocol version number: " + charArrayBuffer.substring(pos, upperBound));
        }
        try {
            int parseInt = Integer.parseInt(charArrayBuffer.substringTrimmed(i2, indexOf));
            int i3 = indexOf + 1;
            int indexOf2 = charArrayBuffer.indexOf(32, i3, upperBound);
            if (indexOf2 == -1) {
                indexOf2 = upperBound;
            }
            try {
                int parseInt2 = Integer.parseInt(charArrayBuffer.substringTrimmed(i3, indexOf2));
                parserCursor.updatePos(indexOf2);
                return createProtocolVersion(parseInt, parseInt2);
            } catch (NumberFormatException unused) {
                throw new ParseException("Invalid protocol minor version number: " + charArrayBuffer.substring(pos, upperBound));
            }
        } catch (NumberFormatException unused2) {
            throw new ParseException("Invalid protocol major version number: " + charArrayBuffer.substring(pos, upperBound));
        }
    }

    /* access modifiers changed from: protected */
    public ProtocolVersion createProtocolVersion(int i, int i2) {
        return this.protocol.forVersion(i, i2);
    }

    public boolean hasProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        Args.notNull(charArrayBuffer, "Char array buffer");
        Args.notNull(parserCursor, "Parser cursor");
        int pos = parserCursor.getPos();
        String protocol2 = this.protocol.getProtocol();
        int length = protocol2.length();
        if (charArrayBuffer.length() < length + 4) {
            return false;
        }
        if (pos < 0) {
            pos = (charArrayBuffer.length() - 4) - length;
        } else if (pos == 0) {
            while (pos < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
                pos++;
            }
        }
        if (pos + length + 4 > charArrayBuffer.length()) {
            return false;
        }
        boolean z = true;
        int i = 0;
        while (z && i < length) {
            z = charArrayBuffer.charAt(pos + i) == protocol2.charAt(i);
            i++;
        }
        if (z) {
            z = charArrayBuffer.charAt(pos + length) == '/';
        }
        return z;
    }

    public static RequestLine parseRequestLine(String str, LineParser lineParser) {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return (lineParser != null ? lineParser : INSTANCE).parseRequestLine(charArrayBuffer, new ParserCursor(0, str.length()));
    }

    public RequestLine parseRequestLine(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        Args.notNull(charArrayBuffer, "Char array buffer");
        Args.notNull(parserCursor, "Parser cursor");
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        try {
            skipWhitespace(charArrayBuffer, parserCursor);
            int pos2 = parserCursor.getPos();
            int indexOf = charArrayBuffer.indexOf(32, pos2, upperBound);
            if (indexOf < 0) {
                throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
            }
            String substringTrimmed = charArrayBuffer.substringTrimmed(pos2, indexOf);
            parserCursor.updatePos(indexOf);
            skipWhitespace(charArrayBuffer, parserCursor);
            int pos3 = parserCursor.getPos();
            int indexOf2 = charArrayBuffer.indexOf(32, pos3, upperBound);
            if (indexOf2 < 0) {
                throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
            }
            String substringTrimmed2 = charArrayBuffer.substringTrimmed(pos3, indexOf2);
            parserCursor.updatePos(indexOf2);
            ProtocolVersion parseProtocolVersion = parseProtocolVersion(charArrayBuffer, parserCursor);
            skipWhitespace(charArrayBuffer, parserCursor);
            if (parserCursor.atEnd()) {
                return createRequestLine(substringTrimmed, substringTrimmed2, parseProtocolVersion);
            }
            throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
        } catch (IndexOutOfBoundsException unused) {
            throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
        }
    }

    /* access modifiers changed from: protected */
    public RequestLine createRequestLine(String str, String str2, ProtocolVersion protocolVersion) {
        return new BasicRequestLine(str, str2, protocolVersion);
    }

    public static StatusLine parseStatusLine(String str, LineParser lineParser) {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return (lineParser != null ? lineParser : INSTANCE).parseStatusLine(charArrayBuffer, new ParserCursor(0, str.length()));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        throw new org.apache.http.ParseException("Status line contains invalid status code: " + r10.substring(r3, r4));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.StatusLine parseStatusLine(org.apache.http.util.CharArrayBuffer r10, org.apache.http.message.ParserCursor r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Char array buffer"
            org.apache.http.util.Args.notNull(r10, r0)
            java.lang.String r0 = "Parser cursor"
            org.apache.http.util.Args.notNull(r11, r0)
            int r3 = r11.getPos()
            int r4 = r11.getUpperBound()
            org.apache.http.ProtocolVersion r5 = r9.parseProtocolVersion(r10, r11)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            r9.skipWhitespace(r10, r11)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            int r11 = r11.getPos()     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            r0 = 32
            int r6 = r10.indexOf(r0, r11, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            if (r6 >= 0) goto L_0x0026
            r6 = r4
        L_0x0026:
            java.lang.String r11 = r10.substringTrimmed(r11, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            r8 = 0
        L_0x002b:
            int r0 = r11.length()     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            if (r8 >= r0) goto L_0x0057
            char r0 = r11.charAt(r8)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            boolean r0 = java.lang.Character.isDigit(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            if (r0 != 0) goto L_0x0054
            org.apache.http.ParseException r0 = new org.apache.http.ParseException     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            java.lang.String r2 = "Status line contains invalid status code: "
            r1.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            java.lang.String r2 = r10.substring(r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            java.lang.String r1 = r1.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            r0.<init>(r1)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
        L_0x0054:
            int r8 = r8 + 1
            goto L_0x002b
        L_0x0057:
            int r7 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x005c }
            goto L_0x0075
        L_0x005c:
            org.apache.http.ParseException r0 = new org.apache.http.ParseException     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            java.lang.String r2 = "Status line contains invalid status code: "
            r1.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            java.lang.String r2 = r10.substring(r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            java.lang.String r1 = r1.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            r0.<init>(r1)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
        L_0x0075:
            r11 = r6
            if (r6 >= r4) goto L_0x007d
            java.lang.String r8 = r10.substringTrimmed(r11, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            goto L_0x007f
        L_0x007d:
            java.lang.String r8 = ""
        L_0x007f:
            org.apache.http.StatusLine r0 = r9.createStatusLine(r5, r7, r8)     // Catch:{ IndexOutOfBoundsException -> 0x0084 }
            return r0
        L_0x0084:
            org.apache.http.ParseException r0 = new org.apache.http.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid status line: "
            r1.<init>(r2)
            java.lang.String r2 = r10.substring(r3, r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.message.BasicLineParser.parseStatusLine(org.apache.http.util.CharArrayBuffer, org.apache.http.message.ParserCursor):org.apache.http.StatusLine");
    }

    /* access modifiers changed from: protected */
    public StatusLine createStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        return new BasicStatusLine(protocolVersion, i, str);
    }

    public static Header parseHeader(String str, LineParser lineParser) {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return (lineParser != null ? lineParser : INSTANCE).parseHeader(charArrayBuffer);
    }

    public Header parseHeader(CharArrayBuffer charArrayBuffer) {
        return new BufferedHeader(charArrayBuffer);
    }

    /* access modifiers changed from: protected */
    public void skipWhitespace(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        while (pos < upperBound && HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
            pos++;
        }
        parserCursor.updatePos(pos);
    }
}
