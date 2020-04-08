package org.apache.http.impl.client;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.BackoffManager;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.util.Args;

public class AIMDBackoffManager implements BackoffManager {
    private double backoffFactor;
    private int cap;
    private final Clock clock;
    private final ConnPoolControl<HttpRoute> connPerRoute;
    private long coolDown;
    private final Map<HttpRoute, Long> lastRouteBackoffs;
    private final Map<HttpRoute, Long> lastRouteProbes;

    public AIMDBackoffManager(ConnPoolControl<HttpRoute> connPoolControl) {
        this(connPoolControl, new SystemClock());
    }

    AIMDBackoffManager(ConnPoolControl<HttpRoute> connPoolControl, Clock clock2) {
        this.coolDown = 5000;
        this.backoffFactor = 0.5d;
        this.cap = 2;
        this.clock = clock2;
        this.connPerRoute = connPoolControl;
        this.lastRouteProbes = new HashMap();
        this.lastRouteBackoffs = new HashMap();
    }

    public void backOff(HttpRoute httpRoute) {
        synchronized (this.connPerRoute) {
            int maxPerRoute = this.connPerRoute.getMaxPerRoute(httpRoute);
            Long lastUpdate = getLastUpdate(this.lastRouteBackoffs, httpRoute);
            long currentTime = this.clock.getCurrentTime();
            long j = currentTime;
            if (currentTime - lastUpdate.longValue() >= this.coolDown) {
                this.connPerRoute.setMaxPerRoute(httpRoute, getBackedOffPoolSize(maxPerRoute));
                this.lastRouteBackoffs.put(httpRoute, Long.valueOf(j));
            }
        }
    }

    private int getBackedOffPoolSize(int i) {
        if (i <= 1) {
            return 1;
        }
        return (int) Math.floor(this.backoffFactor * ((double) i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void probe(org.apache.http.conn.routing.HttpRoute r11) {
        /*
            r10 = this;
            org.apache.http.pool.ConnPoolControl<org.apache.http.conn.routing.HttpRoute> r4 = r10.connPerRoute
            monitor-enter(r4)
            org.apache.http.pool.ConnPoolControl<org.apache.http.conn.routing.HttpRoute> r0 = r10.connPerRoute     // Catch:{ all -> 0x004e }
            int r5 = r0.getMaxPerRoute(r11)     // Catch:{ all -> 0x004e }
            int r0 = r10.cap     // Catch:{ all -> 0x004e }
            if (r5 < r0) goto L_0x0010
            int r5 = r10.cap     // Catch:{ all -> 0x004e }
            goto L_0x0012
        L_0x0010:
            int r5 = r5 + 1
        L_0x0012:
            java.util.Map<org.apache.http.conn.routing.HttpRoute, java.lang.Long> r0 = r10.lastRouteProbes     // Catch:{ all -> 0x004e }
            java.lang.Long r6 = r10.getLastUpdate(r0, r11)     // Catch:{ all -> 0x004e }
            java.util.Map<org.apache.http.conn.routing.HttpRoute, java.lang.Long> r0 = r10.lastRouteBackoffs     // Catch:{ all -> 0x004e }
            java.lang.Long r7 = r10.getLastUpdate(r0, r11)     // Catch:{ all -> 0x004e }
            org.apache.http.impl.client.Clock r0 = r10.clock     // Catch:{ all -> 0x004e }
            long r0 = r0.getCurrentTime()     // Catch:{ all -> 0x004e }
            r8 = r0
            long r2 = r6.longValue()     // Catch:{ all -> 0x004e }
            long r0 = r0 - r2
            long r2 = r10.coolDown     // Catch:{ all -> 0x004e }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x003c
            long r0 = r7.longValue()     // Catch:{ all -> 0x004e }
            long r0 = r8 - r0
            long r2 = r10.coolDown     // Catch:{ all -> 0x004e }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x003e
        L_0x003c:
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            return
        L_0x003e:
            org.apache.http.pool.ConnPoolControl<org.apache.http.conn.routing.HttpRoute> r0 = r10.connPerRoute     // Catch:{ all -> 0x004e }
            r0.setMaxPerRoute(r11, r5)     // Catch:{ all -> 0x004e }
            java.util.Map<org.apache.http.conn.routing.HttpRoute, java.lang.Long> r0 = r10.lastRouteProbes     // Catch:{ all -> 0x004e }
            java.lang.Long r1 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x004e }
            r0.put(r11, r1)     // Catch:{ all -> 0x004e }
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            return
        L_0x004e:
            r11 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.AIMDBackoffManager.probe(org.apache.http.conn.routing.HttpRoute):void");
    }

    private Long getLastUpdate(Map<HttpRoute, Long> map, HttpRoute httpRoute) {
        Long l = (Long) map.get(httpRoute);
        if (l == null) {
            return Long.valueOf(0);
        }
        return l;
    }

    public void setBackoffFactor(double d) {
        Args.check(d > 0.0d && d < 1.0d, "Backoff factor must be 0.0 < f < 1.0");
        this.backoffFactor = d;
    }

    public void setCooldownMillis(long j) {
        Args.positive(this.coolDown, "Cool down");
        this.coolDown = j;
    }

    public void setPerHostConnectionCap(int i) {
        Args.positive(i, "Per host connection cap");
        this.cap = i;
    }
}
