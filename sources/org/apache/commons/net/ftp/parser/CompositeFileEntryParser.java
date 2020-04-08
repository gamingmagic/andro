package org.apache.commons.net.ftp.parser;

import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileEntryParser;
import org.apache.commons.net.ftp.FTPFileEntryParserImpl;

public class CompositeFileEntryParser extends FTPFileEntryParserImpl {
    private FTPFileEntryParser cachedFtpFileEntryParser = null;
    private final FTPFileEntryParser[] ftpFileEntryParsers;

    public CompositeFileEntryParser(FTPFileEntryParser[] fTPFileEntryParserArr) {
        this.ftpFileEntryParsers = fTPFileEntryParserArr;
    }

    public FTPFile parseFTPEntry(String str) {
        FTPFileEntryParser[] fTPFileEntryParserArr;
        if (this.cachedFtpFileEntryParser != null) {
            FTPFile parseFTPEntry = this.cachedFtpFileEntryParser.parseFTPEntry(str);
            if (parseFTPEntry != null) {
                return parseFTPEntry;
            }
        } else {
            for (FTPFileEntryParser fTPFileEntryParser : this.ftpFileEntryParsers) {
                FTPFile parseFTPEntry2 = fTPFileEntryParser.parseFTPEntry(str);
                if (parseFTPEntry2 != null) {
                    this.cachedFtpFileEntryParser = fTPFileEntryParser;
                    return parseFTPEntry2;
                }
            }
        }
        return null;
    }
}
