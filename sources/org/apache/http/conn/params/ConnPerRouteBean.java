package org.apache.http.conn.params;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
public final class ConnPerRouteBean implements ConnPerRoute {
    public static final int DEFAULT_MAX_CONNECTIONS_PER_ROUTE = 2;
    private volatile int defaultMax;
    private final ConcurrentHashMap<HttpRoute, Integer> maxPerHostMap;

    public ConnPerRouteBean(int i) {
        this.maxPerHostMap = new ConcurrentHashMap<>();
        setDefaultMaxPerRoute(i);
    }

    public ConnPerRouteBean() {
        this(2);
    }

    public final int getDefaultMax() {
        return this.defaultMax;
    }

    public final int getDefaultMaxPerRoute() {
        return this.defaultMax;
    }

    public final void setDefaultMaxPerRoute(int i) {
        Args.positive(i, "Default max per route");
        this.defaultMax = i;
    }

    public final void setMaxForRoute(HttpRoute httpRoute, int i) {
        Args.notNull(httpRoute, "HTTP route");
        Args.positive(i, "Max per route");
        this.maxPerHostMap.put(httpRoute, Integer.valueOf(i));
    }

    public final int getMaxForRoute(HttpRoute httpRoute) {
        Args.notNull(httpRoute, "HTTP route");
        Integer num = (Integer) this.maxPerHostMap.get(httpRoute);
        if (num != null) {
            return num.intValue();
        }
        return this.defaultMax;
    }

    public final void setMaxForRoutes(Map<HttpRoute, Integer> map) {
        if (map != null) {
            this.maxPerHostMap.clear();
            this.maxPerHostMap.putAll(map);
        }
    }

    public final String toString() {
        return this.maxPerHostMap.toString();
    }
}
