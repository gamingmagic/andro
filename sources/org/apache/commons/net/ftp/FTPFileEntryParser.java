package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.util.List;

public interface FTPFileEntryParser {
    FTPFile parseFTPEntry(String str);

    List<String> preParse(List<String> list);

    String readNextEntry(BufferedReader bufferedReader);
}
