package org.apache.commons.net.smtp;

public class SimpleSMTPHeader {
    private StringBuffer __cc = null;
    private String __from;
    private StringBuffer __headerFields = new StringBuffer();
    private String __subject;
    private String __to;

    public SimpleSMTPHeader(String str, String str2, String str3) {
        this.__to = str2;
        this.__from = str;
        this.__subject = str3;
    }

    public void addHeaderField(String str, String str2) {
        this.__headerFields.append(str);
        this.__headerFields.append(": ");
        this.__headerFields.append(str2);
        this.__headerFields.append(10);
    }

    public void addCC(String str) {
        if (this.__cc == null) {
            this.__cc = new StringBuffer();
        } else {
            this.__cc.append(", ");
        }
        this.__cc.append(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.__headerFields.length() > 0) {
            sb.append(this.__headerFields.toString());
        }
        sb.append("From: ");
        sb.append(this.__from);
        sb.append("\nTo: ");
        sb.append(this.__to);
        if (this.__cc != null) {
            sb.append("\nCc: ");
            sb.append(this.__cc.toString());
        }
        if (this.__subject != null) {
            sb.append("\nSubject: ");
            sb.append(this.__subject);
        }
        sb.append(10);
        sb.append(10);
        return sb.toString();
    }
}
