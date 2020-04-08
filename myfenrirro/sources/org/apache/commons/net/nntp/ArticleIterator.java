package org.apache.commons.net.nntp;

import java.util.Iterator;

class ArticleIterator implements Iterable<Article>, Iterator<Article> {
    private final Iterator<String> stringIterator;

    public ArticleIterator(Iterable<String> iterable) {
        this.stringIterator = iterable.iterator();
    }

    public boolean hasNext() {
        return this.stringIterator.hasNext();
    }

    public Article next() {
        return NNTPClient.__parseArticleEntry((String) this.stringIterator.next());
    }

    public void remove() {
        this.stringIterator.remove();
    }

    public Iterator<Article> iterator() {
        return this;
    }
}
