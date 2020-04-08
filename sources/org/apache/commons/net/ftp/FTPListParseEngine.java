package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class FTPListParseEngine {
    private ListIterator<String> _internalIterator = this.entries.listIterator();
    private List<String> entries = new LinkedList();
    private final FTPFileEntryParser parser;

    public FTPListParseEngine(FTPFileEntryParser fTPFileEntryParser) {
        this.parser = fTPFileEntryParser;
    }

    public void readServerList(InputStream inputStream, String str) {
        this.entries = new LinkedList();
        readStream(inputStream, str);
        this.parser.preParse(this.entries);
        resetIterator();
    }

    private void readStream(InputStream inputStream, String str) {
        BufferedReader bufferedReader;
        if (str == null) {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
        }
        while (true) {
            String readNextEntry = this.parser.readNextEntry(bufferedReader);
            if (readNextEntry != null) {
                this.entries.add(readNextEntry);
            } else {
                bufferedReader.close();
                return;
            }
        }
    }

    public FTPFile[] getNext(int i) {
        LinkedList linkedList = new LinkedList();
        while (i > 0 && this._internalIterator.hasNext()) {
            linkedList.add(this.parser.parseFTPEntry((String) this._internalIterator.next()));
            i--;
        }
        return (FTPFile[]) linkedList.toArray(new FTPFile[linkedList.size()]);
    }

    public FTPFile[] getPrevious(int i) {
        LinkedList linkedList = new LinkedList();
        while (i > 0 && this._internalIterator.hasPrevious()) {
            linkedList.add(0, this.parser.parseFTPEntry((String) this._internalIterator.previous()));
            i--;
        }
        return (FTPFile[]) linkedList.toArray(new FTPFile[linkedList.size()]);
    }

    public FTPFile[] getFiles() {
        return getFiles(FTPFileFilters.NON_NULL);
    }

    public FTPFile[] getFiles(FTPFileFilter fTPFileFilter) {
        ArrayList arrayList = new ArrayList();
        for (String parseFTPEntry : this.entries) {
            FTPFile parseFTPEntry2 = this.parser.parseFTPEntry(parseFTPEntry);
            if (fTPFileFilter.accept(parseFTPEntry2)) {
                arrayList.add(parseFTPEntry2);
            }
        }
        return (FTPFile[]) arrayList.toArray(new FTPFile[arrayList.size()]);
    }

    public boolean hasNext() {
        return this._internalIterator.hasNext();
    }

    public boolean hasPrevious() {
        return this._internalIterator.hasPrevious();
    }

    public void resetIterator() {
        this._internalIterator = this.entries.listIterator();
    }

    @Deprecated
    public void readServerList(InputStream inputStream) {
        readServerList(inputStream, null);
    }
}
