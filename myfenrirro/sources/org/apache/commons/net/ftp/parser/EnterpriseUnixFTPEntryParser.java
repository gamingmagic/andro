package org.apache.commons.net.ftp.parser;

import java.util.Calendar;
import org.apache.commons.net.ftp.FTPFile;

public class EnterpriseUnixFTPEntryParser extends RegexFTPFileEntryParserImpl {
    private static final String MONTHS = "(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)";
    private static final String REGEX = "(([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z]))(\\S*)\\s*(\\S+)\\s*(\\S*)\\s*(\\d*)\\s*(\\d*)\\s*(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)\\s*((?:[012]\\d*)|(?:3[01]))\\s*((\\d\\d\\d\\d)|((?:[01]\\d)|(?:2[0123])):([012345]\\d))\\s(\\S*)(\\s*.*)";

    public EnterpriseUnixFTPEntryParser() {
        super(REGEX);
    }

    public FTPFile parseFTPEntry(String str) {
        FTPFile fTPFile = new FTPFile();
        fTPFile.setRawListing(str);
        if (!matches(str)) {
            return null;
        }
        String group = group(14);
        String group2 = group(15);
        String group3 = group(16);
        String group4 = group(17);
        String group5 = group(18);
        String group6 = group(20);
        String group7 = group(21);
        String group8 = group(22);
        String group9 = group(23);
        fTPFile.setType(0);
        fTPFile.setUser(group);
        fTPFile.setGroup(group2);
        try {
            fTPFile.setSize(Long.parseLong(group3));
        } catch (NumberFormatException unused) {
        }
        Calendar instance = Calendar.getInstance();
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        try {
            int indexOf = MONTHS.indexOf(group4) / 4;
            if (group6 != null) {
                instance.set(1, Integer.parseInt(group6));
            } else {
                int i = instance.get(1);
                if (instance.get(2) < indexOf) {
                    i--;
                }
                instance.set(1, i);
                instance.set(11, Integer.parseInt(group7));
                instance.set(12, Integer.parseInt(group8));
            }
            instance.set(2, indexOf);
            instance.set(5, Integer.parseInt(group5));
            fTPFile.setTimestamp(instance);
        } catch (NumberFormatException unused2) {
        }
        fTPFile.setName(group9);
        return fTPFile;
    }
}
