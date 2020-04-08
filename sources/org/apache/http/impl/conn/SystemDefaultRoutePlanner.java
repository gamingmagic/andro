package org.apache.http.impl.conn;

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
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
public class SystemDefaultRoutePlanner extends DefaultRoutePlanner {
    private final ProxySelector proxySelector;

    /* renamed from: org.apache.http.impl.conn.SystemDefaultRoutePlanner$1 */
    static /* synthetic */ class C20991 {
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
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.SystemDefaultRoutePlanner.C20991.m3193clinit():void");
        }
    }

    public SystemDefaultRoutePlanner(SchemePortResolver schemePortResolver, ProxySelector proxySelector2) {
        super(schemePortResolver);
        this.proxySelector = proxySelector2;
    }

    public SystemDefaultRoutePlanner(ProxySelector proxySelector2) {
        this(null, proxySelector2);
    }

    /* access modifiers changed from: protected */
    public HttpHost determineProxy(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        try {
            URI uri = new URI(httpHost.toURI());
            ProxySelector proxySelector2 = this.proxySelector;
            if (proxySelector2 == null) {
                proxySelector2 = ProxySelector.getDefault();
            }
            if (proxySelector2 == null) {
                return null;
            }
            Proxy chooseProxy = chooseProxy(proxySelector2.select(uri));
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

    private String getHost(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.isUnresolved() ? inetSocketAddress.getHostName() : inetSocketAddress.getAddress().getHostAddress();
    }

    private Proxy chooseProxy(List<Proxy> list) {
        Proxy proxy = null;
        int i = 0;
        while (proxy == null && i < list.size()) {
            Proxy proxy2 = (Proxy) list.get(i);
            switch (C20991.$SwitchMap$java$net$Proxy$Type[proxy2.type().ordinal()]) {
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
