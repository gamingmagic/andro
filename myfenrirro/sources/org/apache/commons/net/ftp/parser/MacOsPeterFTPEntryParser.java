package org.apache.commons.net.ftp.parser;

import android.support.p000v4.view.MotionEventCompat;
import java.text.ParseException;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.http.HttpStatus;

public class MacOsPeterFTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    static final String DEFAULT_DATE_FORMAT = "MMM d yyyy";
    static final String DEFAULT_RECENT_DATE_FORMAT = "MMM d HH:mm";
    private static final String REGEX = "([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s+((folder\\s+)|((\\d+)\\s+(\\d+)\\s+))(\\d+)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3}))\\s+(\\d+(?::\\d+)?)\\s+(\\S*)(\\s*.*)";

    public MacOsPeterFTPEntryParser() {
        this(null);
    }

    public MacOsPeterFTPEntryParser(FTPClientConfig fTPClientConfig) {
        super(REGEX);
        configure(fTPClientConfig);
    }

    public FTPFile parseFTPEntry(String str) {
        int i;
        FTPFile fTPFile = new FTPFile();
        fTPFile.setRawListing(str);
        boolean z = false;
        if (!matches(str)) {
            return null;
        }
        String group = group(1);
        String str2 = "0";
        String group2 = group(20);
        String str3 = group(21) + " " + group(22);
        String group3 = group(23);
        String group4 = group(24);
        try {
            fTPFile.setTimestamp(super.parseTimestamp(str3));
        } catch (ParseException unused) {
        }
        switch (group.charAt(0)) {
            case MotionEventCompat.AXIS_GENERIC_14 /*45*/:
            case HttpStatus.SC_PROCESSING /*102*/:
                i = 0;
                break;
            case 'b':
            case 'c':
                z = true;
                i = 0;
                break;
            case 'd':
                i = 1;
                break;
            case HttpStatus.SC_SWITCHING_PROTOCOLS /*101*/:
                i = 2;
                break;
            case 'l':
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        fTPFile.setType(i);
        int i2 = 4;
        int i3 = 0;
        while (i3 < 3) {
            fTPFile.setPermission(i3, 0, !group(i2).equals("-"));
            fTPFile.setPermission(i3, 1, !group(i2 + 1).equals("-"));
            String group5 = group(i2 + 2);
            if (group5.equals("-") || Character.isUpperCase(group5.charAt(0))) {
                fTPFile.setPermission(i3, 2, false);
            } else {
                fTPFile.setPermission(i3, 2, true);
            }
            i3++;
            i2 += 4;
        }
        if (!z) {
            try {
                fTPFile.setHardLinkCount(Integer.parseInt(str2));
            } catch (NumberFormatException unused2) {
            }
        }
        fTPFile.setUser(null);
        fTPFile.setGroup(null);
        try {
            fTPFile.setSize(Long.parseLong(group2));
        } catch (NumberFormatException unused3) {
        }
        if (group4 != null) {
            group3 = group3 + group4;
            if (i == 2) {
                int indexOf = group3.indexOf(" -> ");
                if (indexOf != -1) {
                    fTPFile.setName(group3.substring(0, indexOf));
                    fTPFile.setLink(group3.substring(indexOf + 4));
                    return fTPFile;
                }
            }
        }
        fTPFile.setName(group3);
        return fTPFile;
    }

    /* access modifiers changed from: protected */
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_UNIX, "MMM d yyyy", "MMM d HH:mm", null, null, null);
    }
}
