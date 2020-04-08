package org.apache.commons.net.nntp;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.net.p005io.DotTerminatedMessageReader;
import org.apache.commons.net.p005io.Util;

class ReplyIterator implements Iterable<String>, Iterator<String> {
    private String line;
    private final BufferedReader reader;
    private Exception savedException;

    ReplyIterator(BufferedReader bufferedReader, boolean z) {
        this.reader = z ? new DotTerminatedMessageReader(bufferedReader) : bufferedReader;
        this.line = this.reader.readLine();
        if (this.line == null) {
            Util.closeQuietly((Closeable) this.reader);
        }
    }

    ReplyIterator(BufferedReader bufferedReader) {
        this(bufferedReader, true);
    }

    public boolean hasNext() {
        if (this.savedException == null) {
            return this.line != null;
        }
        throw new NoSuchElementException(this.savedException.toString());
    }

    public String next() {
        if (this.savedException != null) {
            throw new NoSuchElementException(this.savedException.toString());
        }
        String str = this.line;
        if (str == null) {
            throw new NoSuchElementException();
        }
        try {
            this.line = this.reader.readLine();
            if (this.line == null) {
                Util.closeQuietly((Closeable) this.reader);
            }
        } catch (IOException e) {
            this.savedException = e;
            Util.closeQuietly((Closeable) this.reader);
        }
        return str;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public Iterator<String> iterator() {
        return this;
    }
}
