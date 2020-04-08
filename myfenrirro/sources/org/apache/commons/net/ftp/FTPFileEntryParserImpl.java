package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.util.List;

public abstract class FTPFileEntryParserImpl implements FTPFileEntryParser {
    public String readNextEntry(BufferedReader bufferedReader) {
        return bufferedReader.readLine();
    }

    public List<String> preParse(List<String> list) {
        return list;
    }
}
