package org.apache.commons.net.ftp.parser;

import org.apache.commons.net.ftp.Configurable;
import org.apache.commons.net.ftp.FTPClientConfig;

public class NTFTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    private static final String DEFAULT_DATE_FORMAT = "MM-dd-yy hh:mma";
    private static final String DEFAULT_DATE_FORMAT2 = "MM-dd-yy kk:mm";
    private static final String REGEX = "(\\S+)\\s+(\\S+)\\s+(?:(<DIR>)|([0-9]+))\\s+(\\S.*)";
    private FTPTimestampParser timestampParser;

    public NTFTPEntryParser() {
        this(null);
    }

    public NTFTPEntryParser(FTPClientConfig fTPClientConfig) {
        super(REGEX);
        configure(fTPClientConfig);
        FTPClientConfig fTPClientConfig2 = new FTPClientConfig(FTPClientConfig.SYST_NT, DEFAULT_DATE_FORMAT2, null, null, null, null);
        fTPClientConfig2.setDefaultDateFormatStr(DEFAULT_DATE_FORMAT2);
        this.timestampParser = new FTPTimestampParserImpl();
        ((Configurable) this.timestampParser).configure(fTPClientConfig2);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.commons.net.ftp.FTPFile parseFTPEntry(java.lang.String r7) {
        /*
            r6 = this;
            org.apache.commons.net.ftp.FTPFile r2 = new org.apache.commons.net.ftp.FTPFile
            r2.<init>()
            r2.setRawListing(r7)
            boolean r0 = r6.matches(r7)
            if (r0 == 0) goto L_0x0087
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 1
            java.lang.String r1 = r6.group(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 2
            java.lang.String r1 = r6.group(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r7 = r0.toString()
            r0 = 3
            java.lang.String r3 = r6.group(r0)
            r0 = 4
            java.lang.String r4 = r6.group(r0)
            r0 = 5
            java.lang.String r5 = r6.group(r0)
            java.util.Calendar r0 = super.parseTimestamp(r7)     // Catch:{ ParseException -> 0x0046 }
            r2.setTimestamp(r0)     // Catch:{ ParseException -> 0x0046 }
            goto L_0x0050
        L_0x0046:
            org.apache.commons.net.ftp.parser.FTPTimestampParser r0 = r6.timestampParser     // Catch:{ ParseException -> 0x0050 }
            java.util.Calendar r0 = r0.parseTimestamp(r7)     // Catch:{ ParseException -> 0x0050 }
            r2.setTimestamp(r0)     // Catch:{ ParseException -> 0x0050 }
        L_0x0050:
            if (r5 == 0) goto L_0x0062
            java.lang.String r0 = "."
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = ".."
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0064
        L_0x0062:
            r0 = 0
            return r0
        L_0x0064:
            r2.setName(r5)
            java.lang.String r0 = "<DIR>"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0079
            r0 = 1
            r2.setType(r0)
            r0 = 0
            r2.setSize(r0)
            goto L_0x0086
        L_0x0079:
            r0 = 0
            r2.setType(r0)
            if (r4 == 0) goto L_0x0086
            long r0 = java.lang.Long.parseLong(r4)
            r2.setSize(r0)
        L_0x0086:
            return r2
        L_0x0087:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ftp.parser.NTFTPEntryParser.parseFTPEntry(java.lang.String):org.apache.commons.net.ftp.FTPFile");
    }

    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_NT, DEFAULT_DATE_FORMAT, null, null, null, null);
    }
}
