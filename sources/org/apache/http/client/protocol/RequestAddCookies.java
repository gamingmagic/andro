package org.apache.http.client.protocol;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.config.Lookup;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class RequestAddCookies implements HttpRequestInterceptor {
    private final Log log = LogFactory.getLog(getClass());

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        if (!httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            HttpClientContext adapt = HttpClientContext.adapt(httpContext);
            CookieStore cookieStore = adapt.getCookieStore();
            if (cookieStore == null) {
                this.log.debug("Cookie store not specified in HTTP context");
                return;
            }
            Lookup cookieSpecRegistry = adapt.getCookieSpecRegistry();
            if (cookieSpecRegistry == null) {
                this.log.debug("CookieSpec registry not specified in HTTP context");
                return;
            }
            HttpHost targetHost = adapt.getTargetHost();
            if (targetHost == null) {
                this.log.debug("Target host not set in the context");
                return;
            }
            RouteInfo httpRoute = adapt.getHttpRoute();
            if (httpRoute == null) {
                this.log.debug("Connection route not set in the context");
                return;
            }
            String cookieSpec = adapt.getRequestConfig().getCookieSpec();
            if (cookieSpec == null) {
                cookieSpec = CookieSpecs.DEFAULT;
            }
            if (this.log.isDebugEnabled()) {
                this.log.debug("CookieSpec selected: " + cookieSpec);
            }
            URI uri = null;
            if (httpRequest instanceof HttpUriRequest) {
                uri = ((HttpUriRequest) httpRequest).getURI();
            } else {
                try {
                    uri = new URI(httpRequest.getRequestLine().getUri());
                } catch (URISyntaxException unused) {
                }
            }
            String path = uri != null ? uri.getPath() : null;
            String hostName = targetHost.getHostName();
            int port = targetHost.getPort();
            if (port < 0) {
                port = httpRoute.getTargetHost().getPort();
            }
            CookieOrigin cookieOrigin = new CookieOrigin(hostName, port >= 0 ? port : 0, !TextUtils.isEmpty(path) ? path : "/", httpRoute.isSecure());
            CookieSpecProvider cookieSpecProvider = (CookieSpecProvider) cookieSpecRegistry.lookup(cookieSpec);
            if (cookieSpecProvider == null) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Unsupported cookie policy: " + cookieSpec);
                }
                return;
            }
            CookieSpec create = cookieSpecProvider.create(adapt);
            List<Cookie> cookies = cookieStore.getCookies();
            ArrayList arrayList = new ArrayList();
            Date date = new Date();
            boolean z = false;
            for (Cookie cookie : cookies) {
                if (cookie.isExpired(date)) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Cookie " + cookie + " expired");
                    }
                    z = true;
                } else if (create.match(cookie, cookieOrigin)) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Cookie " + cookie + " match " + cookieOrigin);
                    }
                    arrayList.add(cookie);
                }
            }
            if (z) {
                cookieStore.clearExpired(date);
            }
            if (!arrayList.isEmpty()) {
                for (Header addHeader : create.formatCookies(arrayList)) {
                    httpRequest.addHeader(addHeader);
                }
            }
            if (create.getVersion() > 0) {
                Header versionHeader = create.getVersionHeader();
                if (versionHeader != null) {
                    httpRequest.addHeader(versionHeader);
                }
            }
            httpContext.setAttribute("http.cookie-spec", create);
            httpContext.setAttribute("http.cookie-origin", cookieOrigin);
        }
    }
}
