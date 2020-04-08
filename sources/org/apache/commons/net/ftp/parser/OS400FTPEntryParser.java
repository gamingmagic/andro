package org.apache.commons.net.ftp.parser;

import java.text.ParseException;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;

public class OS400FTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    private static final String DEFAULT_DATE_FORMAT = "yy/MM/dd HH:mm:ss";
    private static final String REGEX = "(\\S+)\\s+(\\d+)\\s+(\\S+)\\s+(\\S+)\\s+(\\*\\S+)\\s+(\\S+/?)\\s*";

    public OS400FTPEntryParser() {
        this(null);
    }

    public OS400FTPEntryParser(FTPClientConfig fTPClientConfig) {
        super(REGEX);
        configure(fTPClientConfig);
    }

    public FTPFile parseFTPEntry(String str) {
        int i;
        FTPFile fTPFile = new FTPFile();
        fTPFile.setRawListing(str);
        if (!matches(str)) {
            return null;
        }
        String group = group(1);
        String group2 = group(2);
        String str2 = group(3) + " " + group(4);
        String group3 = group(5);
        String group4 = group(6);
        try {
            fTPFile.setTimestamp(super.parseTimestamp(str2));
        } catch (ParseException unused) {
        }
        if (group3.equalsIgnoreCase("*STMF")) {
            i = 0;
        } else if (group3.equalsIgnoreCase("*DIR")) {
            i = 1;
        } else {
            i = 3;
        }
        fTPFile.setType(i);
        fTPFile.setUser(group);
        try {
            fTPFile.setSize(Long.parseLong(group2));
        } catch (NumberFormatException unused2) {
        }
        if (group4.endsWith("/")) {
            group4 = group4.substring(0, group4.length() - 1);
        }
        int lastIndexOf = group4.lastIndexOf(47);
        if (lastIndexOf >= 0) {
            group4 = group4.substring(lastIndexOf + 1);
        }
        fTPFile.setName(group4);
        return fTPFile;
    }

    /* access modifiers changed from: protected */
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_OS400, DEFAULT_DATE_FORMAT, null, null, null, null);
    }
}
