package org.apache.http.conn.routing;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.routing.RouteInfo.LayerType;
import org.apache.http.conn.routing.RouteInfo.TunnelType;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
public final class HttpRoute implements Cloneable, RouteInfo {
    private final LayerType layered;
    private final InetAddress localAddress;
    private final List<HttpHost> proxyChain;
    private final boolean secure;
    private final HttpHost targetHost;
    private final TunnelType tunnelled;

    private HttpRoute(HttpHost httpHost, InetAddress inetAddress, List<HttpHost> list, boolean z, TunnelType tunnelType, LayerType layerType) {
        Args.notNull(httpHost, "Target host");
        this.targetHost = normalize(httpHost);
        this.localAddress = inetAddress;
        if (list == null || list.isEmpty()) {
            this.proxyChain = null;
        } else {
            this.proxyChain = new ArrayList(list);
        }
        if (tunnelType == TunnelType.TUNNELLED) {
            Args.check(this.proxyChain != null, "Proxy required if tunnelled");
        }
        this.secure = z;
        this.tunnelled = tunnelType != null ? tunnelType : TunnelType.PLAIN;
        this.layered = layerType != null ? layerType : LayerType.PLAIN;
    }

    private static int getDefaultPort(String str) {
        if (HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(str)) {
            return 80;
        }
        if ("https".equalsIgnoreCase(str)) {
            return 443;
        }
        return -1;
    }

    private static HttpHost normalize(HttpHost httpHost) {
        if (httpHost.getPort() >= 0) {
            return httpHost;
        }
        InetAddress address = httpHost.getAddress();
        String schemeName = httpHost.getSchemeName();
        if (address != null) {
            return new HttpHost(address, getDefaultPort(schemeName), schemeName);
        }
        return new HttpHost(httpHost.getHostName(), getDefaultPort(schemeName), schemeName);
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, HttpHost[] httpHostArr, boolean z, TunnelType tunnelType, LayerType layerType) {
        this(httpHost, inetAddress, httpHostArr != null ? Arrays.asList(httpHostArr) : null, z, tunnelType, layerType);
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, HttpHost httpHost2, boolean z, TunnelType tunnelType, LayerType layerType) {
        this(httpHost, inetAddress, httpHost2 != null ? Collections.singletonList(httpHost2) : null, z, tunnelType, layerType);
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, boolean z) {
        this(httpHost, inetAddress, Collections.emptyList(), z, TunnelType.PLAIN, LayerType.PLAIN);
    }

    public HttpRoute(HttpHost httpHost) {
        this(httpHost, (InetAddress) null, Collections.emptyList(), false, TunnelType.PLAIN, LayerType.PLAIN);
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, HttpHost httpHost2, boolean z) {
        boolean z2 = z;
        this(httpHost, inetAddress, Collections.singletonList(Args.notNull(httpHost2, "Proxy host")), z2, z2 ? TunnelType.TUNNELLED : TunnelType.PLAIN, z ? LayerType.LAYERED : LayerType.PLAIN);
    }

    public HttpRoute(HttpHost httpHost, HttpHost httpHost2) {
        this(httpHost, null, httpHost2, false);
    }

    public final HttpHost getTargetHost() {
        return this.targetHost;
    }

    public final InetAddress getLocalAddress() {
        return this.localAddress;
    }

    public final InetSocketAddress getLocalSocketAddress() {
        if (this.localAddress != null) {
            return new InetSocketAddress(this.localAddress, 0);
        }
        return null;
    }

    public final int getHopCount() {
        if (this.proxyChain != null) {
            return this.proxyChain.size() + 1;
        }
        return 1;
    }

    public final HttpHost getHopTarget(int i) {
        Args.notNegative(i, "Hop index");
        int hopCount = getHopCount();
        Args.check(i < hopCount, "Hop index exceeds tracked route length");
        if (i < hopCount - 1) {
            return (HttpHost) this.proxyChain.get(i);
        }
        return this.targetHost;
    }

    public final HttpHost getProxyHost() {
        if (this.proxyChain == null || this.proxyChain.isEmpty()) {
            return null;
        }
        return (HttpHost) this.proxyChain.get(0);
    }

    public final TunnelType getTunnelType() {
        return this.tunnelled;
    }

    public final boolean isTunnelled() {
        return this.tunnelled == TunnelType.TUNNELLED;
    }

    public final LayerType getLayerType() {
        return this.layered;
    }

    public final boolean isLayered() {
        return this.layered == LayerType.LAYERED;
    }

    public final boolean isSecure() {
        return this.secure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRoute)) {
            return false;
        }
        HttpRoute httpRoute = (HttpRoute) obj;
        return this.secure == httpRoute.secure && this.tunnelled == httpRoute.tunnelled && this.layered == httpRoute.layered && LangUtils.equals((Object) this.targetHost, (Object) httpRoute.targetHost) && LangUtils.equals((Object) this.localAddress, (Object) httpRoute.localAddress) && LangUtils.equals((Object) this.proxyChain, (Object) httpRoute.proxyChain);
    }

    public final int hashCode() {
        int hashCode = LangUtils.hashCode(LangUtils.hashCode(17, (Object) this.targetHost), (Object) this.localAddress);
        if (this.proxyChain != null) {
            for (HttpHost hashCode2 : this.proxyChain) {
                hashCode = LangUtils.hashCode(hashCode, (Object) hashCode2);
            }
        }
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(hashCode, this.secure), (Object) this.tunnelled), (Object) this.layered);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getHopCount() * 30) + 50);
        if (this.localAddress != null) {
            sb.append(this.localAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.tunnelled == TunnelType.TUNNELLED) {
            sb.append('t');
        }
        if (this.layered == LayerType.LAYERED) {
            sb.append('l');
        }
        if (this.secure) {
            sb.append('s');
        }
        sb.append("}->");
        if (this.proxyChain != null) {
            for (HttpHost append : this.proxyChain) {
                sb.append(append);
                sb.append("->");
            }
        }
        sb.append(this.targetHost);
        return sb.toString();
    }

    public final Object clone() {
        return super.clone();
    }
}
