package org.apache.commons.net.pop3;

import java.io.Reader;
import java.security.MessageDigest;
import java.util.ListIterator;
import java.util.StringTokenizer;
import org.apache.commons.net.p005io.DotTerminatedMessageReader;
import org.apache.http.message.TokenParser;

public class POP3Client extends POP3 {
    private static POP3MessageInfo __parseStatus(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        if (!stringTokenizer.hasMoreElements()) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreElements()) {
                return null;
            }
            return new POP3MessageInfo(parseInt, Integer.parseInt(stringTokenizer.nextToken()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static POP3MessageInfo __parseUID(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        StringTokenizer stringTokenizer2 = stringTokenizer;
        if (!stringTokenizer.hasMoreElements()) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(stringTokenizer2.nextToken());
            if (!stringTokenizer2.hasMoreElements()) {
                return null;
            }
            return new POP3MessageInfo(parseInt, stringTokenizer2.nextToken());
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public boolean capa() {
        if (sendCommand(12) != 0) {
            return false;
        }
        getAdditionalReply();
        return true;
    }

    public boolean login(String str, String str2) {
        if (getState() != 0) {
            return false;
        }
        if (sendCommand(0, str) != 0) {
            return false;
        }
        if (sendCommand(1, str2) != 0) {
            return false;
        }
        setState(1);
        return true;
    }

    public boolean login(String str, String str2, String str3) {
        if (getState() != 0) {
            return false;
        }
        byte[] digest = MessageDigest.getInstance("MD5").digest((str2 + str3).getBytes());
        StringBuilder sb = new StringBuilder(128);
        for (byte b : digest) {
            byte b2 = b & 255;
            if (b2 <= 15) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(b2));
        }
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append(str);
        sb2.append(TokenParser.f9030SP);
        sb2.append(sb.toString());
        if (sendCommand(9, sb2.toString()) != 0) {
            return false;
        }
        setState(1);
        return true;
    }

    public boolean logout() {
        if (getState() == 1) {
            setState(2);
        }
        sendCommand(2);
        return this._replyCode == 0;
    }

    public boolean noop() {
        if (getState() == 1) {
            return sendCommand(7) == 0;
        }
        return false;
    }

    public boolean deleteMessage(int i) {
        if (getState() == 1) {
            return sendCommand(6, Integer.toString(i)) == 0;
        }
        return false;
    }

    public boolean reset() {
        if (getState() == 1) {
            return sendCommand(8) == 0;
        }
        return false;
    }

    public POP3MessageInfo status() {
        if (getState() != 1) {
            return null;
        }
        if (sendCommand(3) != 0) {
            return null;
        }
        return __parseStatus(this._lastReplyLine.substring(3));
    }

    public POP3MessageInfo listMessage(int i) {
        if (getState() != 1) {
            return null;
        }
        if (sendCommand(4, Integer.toString(i)) != 0) {
            return null;
        }
        return __parseStatus(this._lastReplyLine.substring(3));
    }

    public POP3MessageInfo[] listMessages() {
        if (getState() != 1) {
            return null;
        }
        if (sendCommand(4) != 0) {
            return null;
        }
        getAdditionalReply();
        POP3MessageInfo[] pOP3MessageInfoArr = new POP3MessageInfo[(this._replyLines.size() - 2)];
        ListIterator listIterator = this._replyLines.listIterator(1);
        for (int i = 0; i < pOP3MessageInfoArr.length; i++) {
            pOP3MessageInfoArr[i] = __parseStatus((String) listIterator.next());
        }
        return pOP3MessageInfoArr;
    }

    public POP3MessageInfo listUniqueIdentifier(int i) {
        if (getState() != 1) {
            return null;
        }
        if (sendCommand(11, Integer.toString(i)) != 0) {
            return null;
        }
        return __parseUID(this._lastReplyLine.substring(3));
    }

    public POP3MessageInfo[] listUniqueIdentifiers() {
        if (getState() != 1) {
            return null;
        }
        if (sendCommand(11) != 0) {
            return null;
        }
        getAdditionalReply();
        POP3MessageInfo[] pOP3MessageInfoArr = new POP3MessageInfo[(this._replyLines.size() - 2)];
        ListIterator listIterator = this._replyLines.listIterator(1);
        for (int i = 0; i < pOP3MessageInfoArr.length; i++) {
            pOP3MessageInfoArr[i] = __parseUID((String) listIterator.next());
        }
        return pOP3MessageInfoArr;
    }

    public Reader retrieveMessage(int i) {
        if (getState() != 1) {
            return null;
        }
        if (sendCommand(5, Integer.toString(i)) != 0) {
            return null;
        }
        return new DotTerminatedMessageReader(this._reader);
    }

    public Reader retrieveMessageTop(int i, int i2) {
        if (i2 < 0 || getState() != 1) {
            return null;
        }
        if (sendCommand(10, Integer.toString(i) + " " + Integer.toString(i2)) != 0) {
            return null;
        }
        return new DotTerminatedMessageReader(this._reader);
    }
}
