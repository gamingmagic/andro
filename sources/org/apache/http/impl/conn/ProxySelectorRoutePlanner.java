package org.apache.http.impl.conn;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Deprecated
public class ProxySelectorRoutePlanner implements HttpRoutePlanner {
    protected ProxySelector proxySelector;
    protected final SchemeRegistry schemeRegistry;

    /* renamed from: org.apache.http.impl.conn.ProxySelectorRoutePlanner$1 */
    static /* synthetic */ class C20971 {
        static final /* synthetic */ int[] $SwitchMap$java$net$Proxy$Type = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|7)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0015 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0021 */
        static {
            /*
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$java$net$Proxy$Type = r0
                int[] r0 = $SwitchMap$java$net$Proxy$Type     // Catch:{ NoSuchFieldError -> 0x0015 }
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch:{ NoSuchFieldError -> 0x0015 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0015 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r0 = $SwitchMap$java$net$Proxy$Type     // Catch:{ NoSuchFieldError -> 0x0021 }
                java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = $SwitchMap$java$net$Proxy$Type     // Catch:{ NoSuchFieldError -> 0x002d }
                java.net.Proxy$Type r1 = java.net.Proxy.Type.SOCKS     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002d }
                return
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.ProxySelectorRoutePlanner.C20971.m3191clinit():void");
        }
    }

    public ProxySelectorRoutePlanner(SchemeRegistry schemeRegistry2, ProxySelector proxySelector2) {
        Args.notNull(schemeRegistry2, "SchemeRegistry");
        this.schemeRegistry = schemeRegistry2;
        this.proxySelector = proxySelector2;
    }

    public ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    public void setProxySelector(ProxySelector proxySelector2) {
        this.proxySelector = proxySelector2;
    }

    public HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        HttpRoute httpRoute;
        Args.notNull(httpRequest, "HTTP request");
        HttpRoute forcedRoute = ConnRouteParams.getForcedRoute(httpRequest.getParams());
        if (forcedRoute != null) {
            return forcedRoute;
        }
        Asserts.notNull(httpHost, "Target host");
        InetAddress localAddress = ConnRouteParams.getLocalAddress(httpRequest.getParams());
        HttpHost determineProxy = determineProxy(httpHost, httpRequest, httpContext);
        boolean isLayered = this.schemeRegistry.getScheme(httpHost.getSchemeName()).isLayered();
        if (determineProxy == null) {
            httpRoute = new HttpRoute(httpHost, localAddress, isLayered);
        } else {
            httpRoute = new HttpRoute(httpHost, localAddress, determineProxy, isLayered);
        }
        return httpRoute;
    }

    /* access modifiers changed from: protected */
    public HttpHost determineProxy(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        ProxySelector proxySelector2 = this.proxySelector;
        if (proxySelector2 == null) {
            proxySelector2 = ProxySelector.getDefault();
        }
        if (proxySelector2 == null) {
            return null;
        }
        try {
            Proxy chooseProxy = chooseProxy(proxySelector2.select(new URI(httpHost.toURI())), httpHost, httpRequest, httpContext);
            HttpHost httpHost2 = null;
            if (chooseProxy.type() == Type.HTTP) {
                if (!(chooseProxy.address() instanceof InetSocketAddress)) {
                    throw new HttpException("Unable to handle non-Inet proxy address: " + chooseProxy.address());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) chooseProxy.address();
                httpHost2 = new HttpHost(getHost(inetSocketAddress), inetSocketAddress.getPort());
            }
            return httpHost2;
        } catch (URISyntaxException e) {
            throw new HttpException("Cannot convert host to URI: " + httpHost, e);
        }
    }

    /* access modifiers changed from: protected */
    public String getHost(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.isUnresolved() ? inetSocketAddress.getHostName() : inetSocketAddress.getAddress().getHostAddress();
    }

    /* access modifiers changed from: protected */
    public Proxy chooseProxy(List<Proxy> list, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        Args.notEmpty(list, "List of proxies");
        Proxy proxy = null;
        int i = 0;
        while (proxy == null && i < list.size()) {
            Proxy proxy2 = (Proxy) list.get(i);
            switch (C20971.$SwitchMap$java$net$Proxy$Type[proxy2.type().ordinal()]) {
                case 1:
                case 2:
                    proxy = proxy2;
                    break;
            }
            i++;
        }
        if (proxy == null) {
            return Proxy.NO_PROXY;
        }
        return proxy;
    }
}
