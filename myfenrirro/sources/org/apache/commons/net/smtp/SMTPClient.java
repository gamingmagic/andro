package org.apache.commons.net.smtp;

import java.io.Writer;
import org.apache.commons.net.p005io.DotTerminatedMessageWriter;

public class SMTPClient extends SMTP {
    public SMTPClient() {
    }

    public SMTPClient(String str) {
        super(str);
    }

    public boolean completePendingCommand() {
        return SMTPReply.isPositiveCompletion(getReply());
    }

    public boolean login(String str) {
        return SMTPReply.isPositiveCompletion(helo(str));
    }

    public boolean login() {
        String hostName = getLocalAddress().getHostName();
        if (hostName == null) {
            return false;
        }
        return SMTPReply.isPositiveCompletion(helo(hostName));
    }

    public boolean setSender(RelayPath relayPath) {
        return SMTPReply.isPositiveCompletion(mail(relayPath.toString()));
    }

    public boolean setSender(String str) {
        return SMTPReply.isPositiveCompletion(mail("<" + str + ">"));
    }

    public boolean addRecipient(RelayPath relayPath) {
        return SMTPReply.isPositiveCompletion(rcpt(relayPath.toString()));
    }

    public boolean addRecipient(String str) {
        return SMTPReply.isPositiveCompletion(rcpt("<" + str + ">"));
    }

    public Writer sendMessageData() {
        if (!SMTPReply.isPositiveIntermediate(data())) {
            return null;
        }
        return new DotTerminatedMessageWriter(this._writer);
    }

    public boolean sendShortMessageData(String str) {
        Writer sendMessageData = sendMessageData();
        if (sendMessageData == null) {
            return false;
        }
        sendMessageData.write(str);
        sendMessageData.close();
        return completePendingCommand();
    }

    public boolean sendSimpleMessage(String str, String str2, String str3) {
        if (!setSender(str)) {
            return false;
        }
        if (!addRecipient(str2)) {
            return false;
        }
        return sendShortMessageData(str3);
    }

    public boolean sendSimpleMessage(String str, String[] strArr, String str2) {
        boolean z = false;
        if (!setSender(str)) {
            return false;
        }
        for (String addRecipient : strArr) {
            if (addRecipient(addRecipient)) {
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        return sendShortMessageData(str2);
    }

    public boolean logout() {
        return SMTPReply.isPositiveCompletion(quit());
    }

    public boolean reset() {
        return SMTPReply.isPositiveCompletion(rset());
    }

    public boolean verify(String str) {
        int vrfy = vrfy(str);
        return vrfy == 250 || vrfy == 251;
    }

    public String listHelp() {
        if (SMTPReply.isPositiveCompletion(help())) {
            return getReplyString();
        }
        return null;
    }

    public String listHelp(String str) {
        if (SMTPReply.isPositiveCompletion(help(str))) {
            return getReplyString();
        }
        return null;
    }

    public boolean sendNoOp() {
        return SMTPReply.isPositiveCompletion(noop());
    }
}
