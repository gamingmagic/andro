package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
public class DefaultRedirectHandler implements RedirectHandler {
    private static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    private final Log log = LogFactory.getLog(getClass());

    public boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(httpResponse, "HTTP response");
        switch (httpResponse.getStatusLine().getStatusCode()) {
            case HttpStatus.SC_MOVED_PERMANENTLY /*301*/:
            case HttpStatus.SC_MOVED_TEMPORARILY /*302*/:
            case HttpStatus.SC_TEMPORARY_REDIRECT /*307*/:
                String method = ((HttpRequest) httpContext.getAttribute("http.request")).getRequestLine().getMethod();
                return method.equalsIgnoreCase(HttpGet.METHOD_NAME) || method.equalsIgnoreCase(HttpHead.METHOD_NAME);
            case HttpStatus.SC_SEE_OTHER /*303*/:
                return true;
            default:
                return false;
        }
    }

    public URI getLocationURI(HttpResponse httpResponse, HttpContext httpContext) {
        URI uri;
        Args.notNull(httpResponse, "HTTP response");
        Header firstHeader = httpResponse.getFirstHeader("location");
        if (firstHeader == null) {
            throw new ProtocolException("Received redirect response " + httpResponse.getStatusLine() + " but no location header");
        }
        String value = firstHeader.getValue();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Redirect requested to location '" + value + "'");
        }
        try {
            URI uri2 = new URI(value);
            HttpParams params = httpResponse.getParams();
            if (!uri2.isAbsolute()) {
                if (params.isParameterTrue(ClientPNames.REJECT_RELATIVE_REDIRECT)) {
                    throw new ProtocolException("Relative redirect location '" + uri2 + "' not allowed");
                }
                HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
                Asserts.notNull(httpHost, "Target host");
                try {
                    uri2 = URIUtils.resolve(URIUtils.rewriteURI(new URI(((HttpRequest) httpContext.getAttribute("http.request")).getRequestLine().getUri()), httpHost, true), uri2);
                } catch (URISyntaxException e) {
                    throw new ProtocolException(e.getMessage(), e);
                }
            }
            if (params.isParameterFalse(ClientPNames.ALLOW_CIRCULAR_REDIRECTS)) {
                RedirectLocations redirectLocations = (RedirectLocations) httpContext.getAttribute("http.protocol.redirect-locations");
                if (redirectLocations == null) {
                    redirectLocations = new RedirectLocations();
                    httpContext.setAttribute("http.protocol.redirect-locations", redirectLocations);
                }
                if (uri2.getFragment() != null) {
                    try {
                        uri = URIUtils.rewriteURI(uri2, new HttpHost(uri2.getHost(), uri2.getPort(), uri2.getScheme()), true);
                    } catch (URISyntaxException e2) {
                        throw new ProtocolException(e2.getMessage(), e2);
                    }
                } else {
                    uri = uri2;
                }
                if (redirectLocations.contains(uri)) {
                    throw new CircularRedirectException("Circular redirect to '" + uri + "'");
                }
                redirectLocations.add(uri);
            }
            return uri2;
        } catch (URISyntaxException e3) {
            throw new ProtocolException("Invalid redirect URI: " + value, e3);
        }
    }
}
