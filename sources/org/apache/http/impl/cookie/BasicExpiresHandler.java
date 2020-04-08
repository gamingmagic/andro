package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.utils.DateUtils;
import org.apache.http.cookie.C2085SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class BasicExpiresHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    private final String[] datepatterns;

    public BasicExpiresHandler(String[] strArr) {
        Args.notNull(strArr, "Array of date patterns");
        this.datepatterns = strArr;
    }

    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, C2085SM.COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for 'expires' attribute");
        }
        Date parseDate = DateUtils.parseDate(str, this.datepatterns);
        if (parseDate == null) {
            throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
        }
        setCookie.setExpiryDate(parseDate);
    }

    public String getAttributeName() {
        return ClientCookie.EXPIRES_ATTR;
    }
}
