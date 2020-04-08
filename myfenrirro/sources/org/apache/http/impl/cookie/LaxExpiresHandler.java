package org.apache.http.impl.cookie;

import java.util.BitSet;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.C2085SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class LaxExpiresHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("^([0-9]{1,2})([^0-9].*)?$");
    private static final BitSet DELIMS;
    private static final Map<String, Integer> MONTHS;
    private static final Pattern MONTH_PATTERN = Pattern.compile("^(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)(.*)?$", 2);
    private static final Pattern TIME_PATTERN = Pattern.compile("^([0-9]{1,2}):([0-9]{1,2}):([0-9]{1,2})([^0-9].*)?$");
    static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final Pattern YEAR_PATTERN = Pattern.compile("^([0-9]{2,4})([^0-9].*)?$");

    static {
        BitSet bitSet = new BitSet();
        bitSet.set(9);
        for (int i = 32; i <= 47; i++) {
            bitSet.set(i);
        }
        for (int i2 = 59; i2 <= 64; i2++) {
            bitSet.set(i2);
        }
        for (int i3 = 91; i3 <= 96; i3++) {
            bitSet.set(i3);
        }
        for (int i4 = 123; i4 <= 126; i4++) {
            bitSet.set(i4);
        }
        DELIMS = bitSet;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(12);
        concurrentHashMap.put("jan", Integer.valueOf(0));
        concurrentHashMap.put("feb", Integer.valueOf(1));
        concurrentHashMap.put("mar", Integer.valueOf(2));
        concurrentHashMap.put("apr", Integer.valueOf(3));
        concurrentHashMap.put("may", Integer.valueOf(4));
        concurrentHashMap.put("jun", Integer.valueOf(5));
        concurrentHashMap.put("jul", Integer.valueOf(6));
        concurrentHashMap.put("aug", Integer.valueOf(7));
        concurrentHashMap.put("sep", Integer.valueOf(8));
        concurrentHashMap.put("oct", Integer.valueOf(9));
        concurrentHashMap.put("nov", Integer.valueOf(10));
        concurrentHashMap.put("dec", Integer.valueOf(11));
        MONTHS = concurrentHashMap;
    }

    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, C2085SM.COOKIE);
        ParserCursor parserCursor = new ParserCursor(0, str.length());
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (!parserCursor.atEnd()) {
            try {
                skipDelims(str, parserCursor);
                sb.setLength(0);
                copyContent(str, parserCursor, sb);
                if (sb.length() == 0) {
                    break;
                }
                if (!z) {
                    Matcher matcher = TIME_PATTERN.matcher(sb);
                    if (matcher.matches()) {
                        z = true;
                        i3 = Integer.parseInt(matcher.group(1));
                        i2 = Integer.parseInt(matcher.group(2));
                        i = Integer.parseInt(matcher.group(3));
                    }
                }
                if (!z2) {
                    Matcher matcher2 = DAY_OF_MONTH_PATTERN.matcher(sb);
                    if (matcher2.matches()) {
                        z2 = true;
                        i4 = Integer.parseInt(matcher2.group(1));
                    }
                }
                if (!z3) {
                    Matcher matcher3 = MONTH_PATTERN.matcher(sb);
                    if (matcher3.matches()) {
                        z3 = true;
                        i5 = ((Integer) MONTHS.get(matcher3.group(1).toLowerCase(Locale.ROOT))).intValue();
                    }
                }
                if (!z4) {
                    Matcher matcher4 = YEAR_PATTERN.matcher(sb);
                    if (matcher4.matches()) {
                        z4 = true;
                        i6 = Integer.parseInt(matcher4.group(1));
                    }
                }
            } catch (NumberFormatException unused) {
                throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
            }
        }
        if (!z || !z2 || !z3 || !z4) {
            throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
        }
        if (i6 >= 70 && i6 <= 99) {
            i6 += 1900;
        }
        if (i6 >= 0 && i6 <= 69) {
            i6 += 2000;
        }
        if (i4 <= 0 || i4 > 31 || i6 < 1601 || i3 > 23 || i2 > 59 || i > 59) {
            throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(UTC);
        instance.setTimeInMillis(0);
        instance.set(13, i);
        instance.set(12, i2);
        instance.set(11, i3);
        instance.set(5, i4);
        instance.set(2, i5);
        instance.set(1, i6);
        setCookie.setExpiryDate(instance.getTime());
    }

    private void skipDelims(CharSequence charSequence, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            if (!DELIMS.get(charSequence.charAt(pos2))) {
                break;
            }
            pos++;
        }
        parserCursor.updatePos(pos);
    }

    private void copyContent(CharSequence charSequence, ParserCursor parserCursor, StringBuilder sb) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            char charAt = charSequence.charAt(pos2);
            if (DELIMS.get(charAt)) {
                break;
            }
            pos++;
            sb.append(charAt);
        }
        parserCursor.updatePos(pos);
    }

    public String getAttributeName() {
        return ClientCookie.EXPIRES_ATTR;
    }
}
