package org.apache.http.client.utils;

import java.util.StringTokenizer;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
public class Rfc3492Idn implements Idn {
    private static final String ACE_PREFIX = "xn--";
    private static final int base = 36;
    private static final int damp = 700;
    private static final char delimiter = '-';
    private static final int initial_bias = 72;
    private static final int initial_n = 128;
    private static final int skew = 38;
    private static final int tmax = 26;
    private static final int tmin = 1;

    private int adapt(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = i / damp;
        } else {
            i3 = i / 2;
        }
        int i4 = i3 + (i3 / i2);
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    private int digit(char c) {
        if (c >= 'A' && c <= 'Z') {
            return c - 'A';
        }
        if (c >= 'a' && c <= 'z') {
            return c - 'a';
        }
        if (c >= '0' && c <= '9') {
            return (c - '0') + 26;
        }
        throw new IllegalArgumentException("illegal digit: " + c);
    }

    public String toUnicode(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (sb.length() > 0) {
                sb.append('.');
            }
            if (nextToken.startsWith(ACE_PREFIX)) {
                nextToken = decode(nextToken.substring(4));
            }
            sb.append(nextToken);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String decode(String str) {
        int i;
        int i2 = 128;
        int i3 = 0;
        int i4 = initial_bias;
        StringBuilder sb = new StringBuilder(str.length());
        int lastIndexOf = str.lastIndexOf(45);
        if (lastIndexOf != -1) {
            sb.append(str.subSequence(0, lastIndexOf));
            str = str.substring(lastIndexOf + 1);
        }
        while (!str.isEmpty()) {
            int i5 = i3;
            int i6 = 1;
            int i7 = 36;
            while (!str.isEmpty()) {
                char charAt = str.charAt(0);
                str = str.substring(1);
                int digit = digit(charAt);
                i3 += digit * i6;
                if (i7 <= i4 + 1) {
                    i = 1;
                } else if (i7 >= i4 + 26) {
                    i = 26;
                } else {
                    i = i7 - i4;
                }
                if (digit < i) {
                    break;
                }
                i6 *= 36 - i;
                i7 += 36;
            }
            i4 = adapt(i3 - i5, sb.length() + 1, i5 == 0);
            i2 += i3 / (sb.length() + 1);
            int length = i3 % (sb.length() + 1);
            sb.insert(length, (char) i2);
            i3 = length + 1;
        }
        return sb.toString();
    }
}
