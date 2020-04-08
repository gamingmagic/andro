package org.apache.commons.net.ftp.parser;

import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFileEntryParser;

public interface FTPFileEntryParserFactory {
    FTPFileEntryParser createFileEntryParser(String str);

    FTPFileEntryParser createFileEntryParser(FTPClientConfig fTPClientConfig);
}
