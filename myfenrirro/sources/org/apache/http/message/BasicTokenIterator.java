package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.HeaderIterator;
import org.apache.http.ParseException;
import org.apache.http.TokenIterator;
import org.apache.http.util.Args;

public class BasicTokenIterator implements TokenIterator {
    public static final String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
    protected String currentHeader;
    protected String currentToken;
    protected final HeaderIterator headerIt;
    protected int searchPos = findNext(-1);

    public BasicTokenIterator(HeaderIterator headerIterator) {
        this.headerIt = (HeaderIterator) Args.notNull(headerIterator, "Header iterator");
    }

    public boolean hasNext() {
        return this.currentToken != null;
    }

    public String nextToken() {
        if (this.currentToken == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        String str = this.currentToken;
        this.searchPos = findNext(this.searchPos);
        return str;
    }

    public final Object next() {
        return nextToken();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }

    /* access modifiers changed from: protected */
    public int findNext(int i) {
        int i2;
        if (i >= 0) {
            i2 = findTokenSeparator(i);
        } else if (!this.headerIt.hasNext()) {
            return -1;
        } else {
            this.currentHeader = this.headerIt.nextHeader().getValue();
            i2 = 0;
        }
        int findTokenStart = findTokenStart(i2);
        if (findTokenStart < 0) {
            this.currentToken = null;
            return -1;
        }
        int findTokenEnd = findTokenEnd(findTokenStart);
        this.currentToken = createToken(this.currentHeader, findTokenStart, findTokenEnd);
        return findTokenEnd;
    }

    /* access modifiers changed from: protected */
    public String createToken(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    /* access modifiers changed from: protected */
    public int findTokenStart(int i) {
        int notNegative = Args.notNegative(i, "Search position");
        boolean z = false;
        while (!z && this.currentHeader != null) {
            int length = this.currentHeader.length();
            while (!z && notNegative < length) {
                char charAt = this.currentHeader.charAt(notNegative);
                if (isTokenSeparator(charAt) || isWhitespace(charAt)) {
                    notNegative++;
                } else if (isTokenChar(this.currentHeader.charAt(notNegative))) {
                    z = true;
                } else {
                    throw new ParseException("Invalid character before token (pos " + notNegative + "): " + this.currentHeader);
                }
            }
            if (!z) {
                if (this.headerIt.hasNext()) {
                    this.currentHeader = this.headerIt.nextHeader().getValue();
                    notNegative = 0;
                } else {
                    this.currentHeader = null;
                }
            }
        }
        if (z) {
            return notNegative;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int findTokenSeparator(int i) {
        int notNegative = Args.notNegative(i, "Search position");
        boolean z = false;
        int length = this.currentHeader.length();
        while (!z && notNegative < length) {
            char charAt = this.currentHeader.charAt(notNegative);
            if (isTokenSeparator(charAt)) {
                z = true;
            } else if (isWhitespace(charAt)) {
                notNegative++;
            } else if (isTokenChar(charAt)) {
                throw new ParseException("Tokens without separator (pos " + notNegative + "): " + this.currentHeader);
            } else {
                throw new ParseException("Invalid character after token (pos " + notNegative + "): " + this.currentHeader);
            }
        }
        return notNegative;
    }

    /* access modifiers changed from: protected */
    public int findTokenEnd(int i) {
        Args.notNegative(i, "Search position");
        int length = this.currentHeader.length();
        int i2 = i + 1;
        while (i2 < length && isTokenChar(this.currentHeader.charAt(i2))) {
            i2++;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public boolean isTokenSeparator(char c) {
        return c == ',';
    }

    /* access modifiers changed from: protected */
    public boolean isWhitespace(char c) {
        return c == 9 || Character.isSpaceChar(c);
    }

    /* access modifiers changed from: protected */
    public boolean isTokenChar(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        if (Character.isISOControl(c)) {
            return false;
        }
        if (isHttpSeparator(c)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean isHttpSeparator(char c) {
        return HTTP_SEPARATORS.indexOf(c) >= 0;
    }
}
