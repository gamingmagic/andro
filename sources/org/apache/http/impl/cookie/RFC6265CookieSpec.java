package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.C2085SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookiePriorityComparator;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.ParserCursor;
import org.apache.http.message.TokenParser;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.SAFE)
public class RFC6265CookieSpec implements CookieSpec {
    private static final char COMMA_CHAR = ',';
    private static final char DQUOTE_CHAR = '\"';
    private static final char EQUAL_CHAR = '=';
    private static final char ESCAPE_CHAR = '\\';
    private static final char PARAM_DELIMITER = ';';
    private static final BitSet SPECIAL_CHARS = TokenParser.INIT_BITSET(32, 34, 44, 59, 92);
    private static final BitSet TOKEN_DELIMS = TokenParser.INIT_BITSET(61, 59);
    private static final BitSet VALUE_DELIMS = TokenParser.INIT_BITSET(59);
    private final Map<String, CookieAttributeHandler> attribHandlerMap;
    private final CookieAttributeHandler[] attribHandlers;
    private final TokenParser tokenParser;

    static {
    }

    protected RFC6265CookieSpec(CommonCookieAttributeHandler... commonCookieAttributeHandlerArr) {
        this.attribHandlers = (CookieAttributeHandler[]) commonCookieAttributeHandlerArr.clone();
        this.attribHandlerMap = new ConcurrentHashMap(commonCookieAttributeHandlerArr.length);
        for (CommonCookieAttributeHandler commonCookieAttributeHandler : commonCookieAttributeHandlerArr) {
            this.attribHandlerMap.put(commonCookieAttributeHandler.getAttributeName().toLowerCase(Locale.ROOT), commonCookieAttributeHandler);
        }
        this.tokenParser = TokenParser.INSTANCE;
    }

    static String getDefaultPath(CookieOrigin cookieOrigin) {
        String path = cookieOrigin.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf < 0) {
            return path;
        }
        if (lastIndexOf == 0) {
            lastIndexOf = 1;
        }
        return path.substring(0, lastIndexOf);
    }

    static String getDefaultDomain(CookieOrigin cookieOrigin) {
        return cookieOrigin.getHost();
    }

    public final List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        ParserCursor parserCursor;
        CharArrayBuffer charArrayBuffer;
        Args.notNull(header, "Header");
        Args.notNull(cookieOrigin, "Cookie origin");
        if (!header.getName().equalsIgnoreCase(C2085SM.SET_COOKIE)) {
            throw new MalformedCookieException("Unrecognized cookie header: '" + header.toString() + "'");
        }
        if (header instanceof FormattedHeader) {
            charArrayBuffer = ((FormattedHeader) header).getBuffer();
            parserCursor = new ParserCursor(((FormattedHeader) header).getValuePos(), charArrayBuffer.length());
        } else {
            String value = header.getValue();
            if (value == null) {
                throw new MalformedCookieException("Header value is null");
            }
            charArrayBuffer = new CharArrayBuffer(value.length());
            charArrayBuffer.append(value);
            parserCursor = new ParserCursor(0, charArrayBuffer.length());
        }
        String parseToken = this.tokenParser.parseToken(charArrayBuffer, parserCursor, TOKEN_DELIMS);
        if (parseToken.length() == 0) {
            return Collections.emptyList();
        }
        if (parserCursor.atEnd()) {
            return Collections.emptyList();
        }
        char charAt = charArrayBuffer.charAt(parserCursor.getPos());
        parserCursor.updatePos(parserCursor.getPos() + 1);
        if (charAt != '=') {
            throw new MalformedCookieException("Cookie value is invalid: '" + header.toString() + "'");
        }
        String parseValue = this.tokenParser.parseValue(charArrayBuffer, parserCursor, VALUE_DELIMS);
        if (!parserCursor.atEnd()) {
            parserCursor.updatePos(parserCursor.getPos() + 1);
        }
        BasicClientCookie basicClientCookie = new BasicClientCookie(parseToken, parseValue);
        BasicClientCookie basicClientCookie2 = basicClientCookie;
        basicClientCookie.setPath(getDefaultPath(cookieOrigin));
        basicClientCookie2.setDomain(getDefaultDomain(cookieOrigin));
        basicClientCookie2.setCreationDate(new Date());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (!parserCursor.atEnd()) {
            String lowerCase = this.tokenParser.parseToken(charArrayBuffer, parserCursor, TOKEN_DELIMS).toLowerCase(Locale.ROOT);
            String str = null;
            if (!parserCursor.atEnd()) {
                char charAt2 = charArrayBuffer.charAt(parserCursor.getPos());
                parserCursor.updatePos(parserCursor.getPos() + 1);
                if (charAt2 == '=') {
                    str = this.tokenParser.parseToken(charArrayBuffer, parserCursor, VALUE_DELIMS);
                    if (!parserCursor.atEnd()) {
                        parserCursor.updatePos(parserCursor.getPos() + 1);
                    }
                }
            }
            basicClientCookie2.setAttribute(lowerCase, str);
            linkedHashMap.put(lowerCase, str);
        }
        if (linkedHashMap.containsKey(ClientCookie.MAX_AGE_ATTR)) {
            linkedHashMap.remove(ClientCookie.EXPIRES_ATTR);
        }
        for (Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getValue();
            CookieAttributeHandler cookieAttributeHandler = (CookieAttributeHandler) this.attribHandlerMap.get((String) entry.getKey());
            if (cookieAttributeHandler != null) {
                cookieAttributeHandler.parse(basicClientCookie2, str2);
            }
        }
        return Collections.singletonList(basicClientCookie2);
    }

    public final void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, C2085SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        for (CookieAttributeHandler validate : this.attribHandlers) {
            validate.validate(cookie, cookieOrigin);
        }
    }

    public final boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, C2085SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        for (CookieAttributeHandler match : this.attribHandlers) {
            if (!match.match(cookie, cookieOrigin)) {
                return false;
            }
        }
        return true;
    }

    public List<Header> formatCookies(List<Cookie> list) {
        Args.notEmpty(list, "List of cookies");
        if (list.size() > 1) {
            List<Cookie> arrayList = new ArrayList<>(list);
            list = arrayList;
            Collections.sort(arrayList, CookiePriorityComparator.INSTANCE);
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 20);
        charArrayBuffer.append(C2085SM.COOKIE);
        charArrayBuffer.append(": ");
        for (int i = 0; i < list.size(); i++) {
            Cookie cookie = (Cookie) list.get(i);
            if (i > 0) {
                charArrayBuffer.append((char) PARAM_DELIMITER);
                charArrayBuffer.append((char) TokenParser.f9030SP);
            }
            charArrayBuffer.append(cookie.getName());
            String value = cookie.getValue();
            if (value != null) {
                charArrayBuffer.append((char) EQUAL_CHAR);
                if (containsSpecialChar(value)) {
                    charArrayBuffer.append('\"');
                    for (int i2 = 0; i2 < value.length(); i2++) {
                        char charAt = value.charAt(i2);
                        if (charAt == '\"' || charAt == '\\') {
                            charArrayBuffer.append('\\');
                        }
                        charArrayBuffer.append(charAt);
                    }
                    charArrayBuffer.append('\"');
                } else {
                    charArrayBuffer.append(value);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(new BufferedHeader(charArrayBuffer));
        return arrayList2;
    }

    /* access modifiers changed from: 0000 */
    public boolean containsSpecialChar(CharSequence charSequence) {
        return containsChars(charSequence, SPECIAL_CHARS);
    }

    /* access modifiers changed from: 0000 */
    public boolean containsChars(CharSequence charSequence, BitSet bitSet) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (bitSet.get(charSequence.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public final int getVersion() {
        return 0;
    }

    public final Header getVersionHeader() {
        return null;
    }
}
