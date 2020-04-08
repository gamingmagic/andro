package org.apache.commons.net.nntp;

import java.util.Iterator;

class NewsgroupIterator implements Iterable<NewsgroupInfo>, Iterator<NewsgroupInfo> {
    private final Iterator<String> stringIterator;

    public NewsgroupIterator(Iterable<String> iterable) {
        this.stringIterator = iterable.iterator();
    }

    public boolean hasNext() {
        return this.stringIterator.hasNext();
    }

    public NewsgroupInfo next() {
        return NNTPClient.__parseNewsgroupListEntry((String) this.stringIterator.next());
    }

    public void remove() {
        this.stringIterator.remove();
    }

    public Iterator<NewsgroupInfo> iterator() {
        return this;
    }
}
