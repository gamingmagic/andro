package org.apache.http.message;

import java.util.List;
import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class BasicListHeaderIterator implements HeaderIterator {
    protected final List<Header> allHeaders;
    protected int currentIndex = findNext(-1);
    protected String headerName;
    protected int lastIndex = -1;

    public BasicListHeaderIterator(List<Header> list, String str) {
        this.allHeaders = (List) Args.notNull(list, "Header list");
        this.headerName = str;
    }

    /* access modifiers changed from: protected */
    public int findNext(int i) {
        int i2 = i;
        if (i < -1) {
            return -1;
        }
        int size = this.allHeaders.size() - 1;
        boolean z = false;
        while (!z && i2 < size) {
            i2++;
            z = filterHeader(i2);
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public boolean filterHeader(int i) {
        if (this.headerName == null) {
            return true;
        }
        return this.headerName.equalsIgnoreCase(((Header) this.allHeaders.get(i)).getName());
    }

    public boolean hasNext() {
        return this.currentIndex >= 0;
    }

    public Header nextHeader() {
        int i = this.currentIndex;
        if (i < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.lastIndex = i;
        this.currentIndex = findNext(i);
        return (Header) this.allHeaders.get(i);
    }

    public final Object next() {
        return nextHeader();
    }

    public void remove() {
        Asserts.check(this.lastIndex >= 0, "No header to remove");
        this.allHeaders.remove(this.lastIndex);
        this.lastIndex = -1;
        this.currentIndex--;
    }
}
