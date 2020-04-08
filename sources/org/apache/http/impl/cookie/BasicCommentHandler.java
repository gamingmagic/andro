package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.C2085SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class BasicCommentHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, C2085SM.COOKIE);
        setCookie.setComment(str);
    }

    public String getAttributeName() {
        return ClientCookie.COMMENT_ATTR;
    }
}
