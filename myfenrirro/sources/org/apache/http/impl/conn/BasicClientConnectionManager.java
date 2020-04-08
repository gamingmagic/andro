package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
public class BasicClientConnectionManager implements ClientConnectionManager {
    private static final AtomicLong COUNTER = new AtomicLong();
    public static final String MISUSE_MESSAGE = "Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    private ManagedClientConnectionImpl conn;
    private final ClientConnectionOperator connOperator;
    private final Log log;
    private HttpPoolEntry poolEntry;
    private final SchemeRegistry schemeRegistry;
    private volatile boolean shutdown;

    static {
    }

    public BasicClientConnectionManager(SchemeRegistry schemeRegistry2) {
        this.log = LogFactory.getLog(getClass());
        Args.notNull(schemeRegistry2, "Scheme registry");
        this.schemeRegistry = schemeRegistry2;
        this.connOperator = createConnectionOperator(schemeRegistry2);
    }

    public BasicClientConnectionManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    /* access modifiers changed from: protected */
    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry2) {
        return new DefaultClientConnectionOperator(schemeRegistry2);
    }

    public final ClientConnectionRequest requestConnection(final HttpRoute httpRoute, final Object obj) {
        return new ClientConnectionRequest() {
            public void abortRequest() {
            }

            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
                return BasicClientConnectionManager.this.getConnection(httpRoute, obj);
            }
        };
    }

    private void assertNotShutdown() {
        Asserts.check(!this.shutdown, "Connection manager has been shut down");
    }

    /* access modifiers changed from: 0000 */
    public ManagedClientConnection getConnection(HttpRoute httpRoute, Object obj) {
        Args.notNull(httpRoute, "Route");
        synchronized (this) {
            assertNotShutdown();
            if (this.log.isDebugEnabled()) {
                this.log.debug("Get connection for route " + httpRoute);
            }
            Asserts.check(this.conn == null, MISUSE_MESSAGE);
            if (this.poolEntry != null && !this.poolEntry.getPlannedRoute().equals(httpRoute)) {
                this.poolEntry.close();
                this.poolEntry = null;
            }
            if (this.poolEntry == null) {
                this.poolEntry = new HttpPoolEntry(this.log, Long.toString(COUNTER.getAndIncrement()), httpRoute, this.connOperator.createConnection(), 0, TimeUnit.MILLISECONDS);
            }
            if (this.poolEntry.isExpired(System.currentTimeMillis())) {
                this.poolEntry.close();
                this.poolEntry.getTracker().reset();
            }
            this.conn = new ManagedClientConnectionImpl(this, this.connOperator, this.poolEntry);
            ManagedClientConnectionImpl managedClientConnectionImpl = this.conn;
            return managedClientConnectionImpl;
        }
    }

    private void shutdownConnection(HttpClientConnection httpClientConnection) {
        try {
            httpClientConnection.shutdown();
        } catch (IOException e) {
            if (this.log.isDebugEnabled()) {
                this.log.debug("I/O exception shutting down connection", e);
            }
        }
    }

    public void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        String str;
        Args.check(managedClientConnection instanceof ManagedClientConnectionImpl, "Connection class mismatch, connection not obtained from this manager");
        ManagedClientConnectionImpl managedClientConnectionImpl = (ManagedClientConnectionImpl) managedClientConnection;
        ManagedClientConnectionImpl managedClientConnectionImpl2 = managedClientConnectionImpl;
        synchronized (managedClientConnectionImpl) {
            if (this.log.isDebugEnabled()) {
                this.log.debug("Releasing connection " + managedClientConnection);
            }
            if (managedClientConnectionImpl2.getPoolEntry() != null) {
                Asserts.check(managedClientConnectionImpl2.getManager() == this, "Connection not obtained from this manager");
                synchronized (this) {
                    if (this.shutdown) {
                        shutdownConnection(managedClientConnectionImpl2);
                        return;
                    }
                    try {
                        if (managedClientConnectionImpl2.isOpen() && !managedClientConnectionImpl2.isMarkedReusable()) {
                            shutdownConnection(managedClientConnectionImpl2);
                        }
                        if (managedClientConnectionImpl2.isMarkedReusable()) {
                            this.poolEntry.updateExpiry(j, timeUnit != null ? timeUnit : TimeUnit.MILLISECONDS);
                            if (this.log.isDebugEnabled()) {
                                if (j > 0) {
                                    str = "for " + j + " " + timeUnit;
                                } else {
                                    str = "indefinitely";
                                }
                                this.log.debug("Connection can be kept alive " + str);
                            }
                        }
                        managedClientConnectionImpl2.detach();
                        this.conn = null;
                        if (this.poolEntry.isClosed()) {
                            this.poolEntry = null;
                        }
                    } catch (Throwable th) {
                        managedClientConnectionImpl2.detach();
                        this.conn = null;
                        if (this.poolEntry.isClosed()) {
                            this.poolEntry = null;
                        }
                        throw th;
                    }
                }
            }
        }
    }

    public void closeExpiredConnections() {
        synchronized (this) {
            assertNotShutdown();
            long currentTimeMillis = System.currentTimeMillis();
            if (this.poolEntry != null && this.poolEntry.isExpired(currentTimeMillis)) {
                this.poolEntry.close();
                this.poolEntry.getTracker().reset();
            }
        }
    }

    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        synchronized (this) {
            assertNotShutdown();
            long millis = timeUnit.toMillis(j);
            long j2 = millis;
            if (millis < 0) {
                j2 = 0;
            }
            long currentTimeMillis = System.currentTimeMillis() - j2;
            if (this.poolEntry != null && this.poolEntry.getUpdated() <= currentTimeMillis) {
                this.poolEntry.close();
                this.poolEntry.getTracker().reset();
            }
        }
    }

    public void shutdown() {
        synchronized (this) {
            this.shutdown = true;
            try {
                if (this.poolEntry != null) {
                    this.poolEntry.close();
                }
                this.poolEntry = null;
                this.conn = null;
            } catch (Throwable th) {
                this.poolEntry = null;
                this.conn = null;
                throw th;
            }
        }
    }
}
