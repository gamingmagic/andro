package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.C2085SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.impl.cookie.BrowserCompatSpecFactory.SecurityLevel;
import org.apache.http.message.BasicHeaderElement;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
public class BrowserCompatSpec extends CookieSpecBase {
    private static final String[] DEFAULT_DATE_PATTERNS = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};

    static {
    }

    public BrowserCompatSpec(String[] strArr, SecurityLevel securityLevel) {
        CommonCookieAttributeHandler[] commonCookieAttributeHandlerArr = new CommonCookieAttributeHandler[7];
        commonCookieAttributeHandlerArr[0] = new BrowserCompatVersionAttributeHandler();
        commonCookieAttributeHandlerArr[1] = new BasicDomainHandler();
        commonCookieAttributeHandlerArr[2] = securityLevel == SecurityLevel.SECURITYLEVEL_IE_MEDIUM ? new BasicPathHandler() {
            public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
            }
        } : new BasicPathHandler();
        commonCookieAttributeHandlerArr[3] = new BasicMaxAgeHandler();
        commonCookieAttributeHandlerArr[4] = new BasicSecureHandler();
        commonCookieAttributeHandlerArr[5] = new BasicCommentHandler();
        commonCookieAttributeHandlerArr[6] = new BasicExpiresHandler(strArr != null ? (String[]) strArr.clone() : DEFAULT_DATE_PATTERNS);
        super(commonCookieAttributeHandlerArr);
    }

    public BrowserCompatSpec(String[] strArr) {
        this(strArr, SecurityLevel.SECURITYLEVEL_DEFAULT);
    }

    public BrowserCompatSpec() {
        this(null, SecurityLevel.SECURITYLEVEL_DEFAULT);
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        ParserCursor parserCursor;
        CharArrayBuffer charArrayBuffer;
        Args.notNull(header, "Header");
        Args.notNull(cookieOrigin, "Cookie origin");
        if (!header.getName().equalsIgnoreCase(C2085SM.SET_COOKIE)) {
            throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
        }
        HeaderElement[] elements = header.getElements();
        boolean z = false;
        boolean z2 = false;
        HeaderElement[] headerElementArr = elements;
        int length = elements.length;
        for (int i = 0; i < length; i++) {
            HeaderElement headerElement = headerElementArr[i];
            if (headerElement.getParameterByName(ClientCookie.VERSION_ATTR) != null) {
                z = true;
            }
            if (headerElement.getParameterByName(ClientCookie.EXPIRES_ATTR) != null) {
                z2 = true;
            }
        }
        if (!z2 && z) {
            return parse(elements, cookieOrigin);
        }
        NetscapeDraftHeaderParser netscapeDraftHeaderParser = NetscapeDraftHeaderParser.DEFAULT;
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
        HeaderElement parseHeader = netscapeDraftHeaderParser.parseHeader(charArrayBuffer, parserCursor);
        String name = parseHeader.getName();
        String value2 = parseHeader.getValue();
        if (name == null || name.isEmpty()) {
            throw new MalformedCookieException("Cookie name may not be empty");
        }
        BasicClientCookie basicClientCookie = new BasicClientCookie(name, value2);
        BasicClientCookie basicClientCookie2 = basicClientCookie;
        basicClientCookie.setPath(getDefaultPath(cookieOrigin));
        basicClientCookie2.setDomain(getDefaultDomain(cookieOrigin));
        NameValuePair[] parameters = parseHeader.getParameters();
        for (int length2 = parameters.length - 1; length2 >= 0; length2--) {
            NameValuePair nameValuePair = parameters[length2];
            String lowerCase = nameValuePair.getName().toLowerCase(Locale.ROOT);
            basicClientCookie2.setAttribute(lowerCase, nameValuePair.getValue());
            CookieAttributeHandler findAttribHandler = findAttribHandler(lowerCase);
            if (findAttribHandler != null) {
                findAttribHandler.parse(basicClientCookie2, nameValuePair.getValue());
            }
        }
        if (z2) {
            basicClientCookie2.setVersion(0);
        }
        return Collections.singletonList(basicClientCookie2);
    }

    private static boolean isQuoteEnclosed(String str) {
        return str != null && str.startsWith("\"") && str.endsWith("\"");
    }

    public List<Header> formatCookies(List<Cookie> list) {
        Args.notEmpty(list, "List of cookies");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 20);
        charArrayBuffer.append(C2085SM.COOKIE);
        charArrayBuffer.append(": ");
        for (int i = 0; i < list.size(); i++) {
            Cookie cookie = (Cookie) list.get(i);
            if (i > 0) {
                charArrayBuffer.append("; ");
            }
            String name = cookie.getName();
            String value = cookie.getValue();
            if (cookie.getVersion() <= 0 || isQuoteEnclosed(value)) {
                charArrayBuffer.append(name);
                charArrayBuffer.append("=");
                if (value != null) {
                    charArrayBuffer.append(value);
                }
            } else {
                BasicHeaderValueFormatter.INSTANCE.formatHeaderElement(charArrayBuffer, (HeaderElement) new BasicHeaderElement(name, value), false);
            }
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new BufferedHeader(charArrayBuffer));
        return arrayList;
    }

    public int getVersion() {
        return 0;
    }

    public Header getVersionHeader() {
        return null;
    }

    public String toString() {
        return "compatibility";
    }
}
