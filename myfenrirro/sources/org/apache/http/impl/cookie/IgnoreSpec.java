package org.apache.http.impl.cookie;

import java.util.Collections;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class IgnoreSpec extends CookieSpecBase {
    public int getVersion() {
        return 0;
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        return Collections.emptyList();
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        return false;
    }

    public List<Header> formatCookies(List<Cookie> list) {
        return Collections.emptyList();
    }

    public Header getVersionHeader() {
        return null;
    }
}
