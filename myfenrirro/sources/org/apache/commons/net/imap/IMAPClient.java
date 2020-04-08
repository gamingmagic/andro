package org.apache.commons.net.imap;

import org.apache.commons.net.imap.IMAP.IMAPState;

public class IMAPClient extends IMAP {

    public enum FETCH_ITEM_NAMES {
        ALL,
        FAST,
        FULL,
        BODY,
        BODYSTRUCTURE,
        ENVELOPE,
        FLAGS,
        INTERNALDATE,
        RFC822,
        UID
    }

    public enum SEARCH_CRITERIA {
        ALL,
        ANSWERED,
        BCC,
        BEFORE,
        BODY,
        CC,
        DELETED,
        DRAFT,
        FLAGGED,
        FROM,
        HEADER,
        KEYWORD,
        LARGER,
        NEW,
        NOT,
        OLD,
        ON,
        OR,
        RECENT,
        SEEN,
        SENTBEFORE,
        SENTON,
        SENTSINCE,
        SINCE,
        SMALLER,
        SUBJECT,
        TEXT,
        TO,
        UID,
        UNANSWERED,
        UNDELETED,
        UNDRAFT,
        UNFLAGGED,
        UNKEYWORD,
        UNSEEN
    }

    public enum STATUS_DATA_ITEMS {
        MESSAGES,
        RECENT,
        UIDNEXT,
        UIDVALIDITY,
        UNSEEN
    }

    public boolean capability() {
        return doCommand(IMAPCommand.CAPABILITY);
    }

    public boolean noop() {
        return doCommand(IMAPCommand.NOOP);
    }

    public boolean logout() {
        return doCommand(IMAPCommand.LOGOUT);
    }

    public boolean login(String str, String str2) {
        if (getState() != IMAPState.NOT_AUTH_STATE) {
            return false;
        }
        if (!doCommand(IMAPCommand.LOGIN, str + " " + str2)) {
            return false;
        }
        setState(IMAPState.AUTH_STATE);
        return true;
    }

    public boolean select(String str) {
        return doCommand(IMAPCommand.SELECT, str);
    }

    public boolean examine(String str) {
        return doCommand(IMAPCommand.EXAMINE, str);
    }

    public boolean create(String str) {
        return doCommand(IMAPCommand.CREATE, str);
    }

    public boolean delete(String str) {
        return doCommand(IMAPCommand.DELETE, str);
    }

    public boolean rename(String str, String str2) {
        return doCommand(IMAPCommand.RENAME, str + " " + str2);
    }

    public boolean subscribe(String str) {
        return doCommand(IMAPCommand.SUBSCRIBE, str);
    }

    public boolean unsubscribe(String str) {
        return doCommand(IMAPCommand.UNSUBSCRIBE, str);
    }

    public boolean list(String str, String str2) {
        return doCommand(IMAPCommand.LIST, str + " " + str2);
    }

    public boolean lsub(String str, String str2) {
        return doCommand(IMAPCommand.LSUB, str + " " + str2);
    }

    public boolean status(String str, String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            throw new IllegalArgumentException("STATUS command requires at least one data item name");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(strArr[i]);
        }
        sb.append(")");
        return doCommand(IMAPCommand.STATUS, sb.toString());
    }

    public boolean append(String str, String str2, String str3) {
        if (str2 != null) {
            str = str + " " + str2;
        }
        if (str3 != null) {
            if (str3.charAt(0) == '{') {
                str = str + " " + str3;
            } else {
                str = str + " {" + str3 + "}";
            }
        }
        return doCommand(IMAPCommand.APPEND, str);
    }

    public boolean append(String str) {
        return append(str, null, null);
    }

    public boolean check() {
        return doCommand(IMAPCommand.CHECK);
    }

    public boolean close() {
        return doCommand(IMAPCommand.CLOSE);
    }

    public boolean expunge() {
        return doCommand(IMAPCommand.EXPUNGE);
    }

    public boolean search(String str, String str2) {
        String str3 = "";
        if (str != null) {
            str3 = str3 + "CHARSET " + str;
        }
        return doCommand(IMAPCommand.SEARCH, str3 + str2);
    }

    public boolean search(String str) {
        return search(null, str);
    }

    public boolean fetch(String str, String str2) {
        return doCommand(IMAPCommand.FETCH, str + " " + str2);
    }

    public boolean store(String str, String str2, String str3) {
        return doCommand(IMAPCommand.STORE, str + " " + str2 + " " + str3);
    }

    public boolean copy(String str, String str2) {
        return doCommand(IMAPCommand.COPY, str + " " + str2);
    }

    public boolean uid(String str, String str2) {
        return doCommand(IMAPCommand.UID, str + " " + str2);
    }
}
