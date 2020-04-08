package org.apache.http.impl.conn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Lookup;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpClientConnectionOperator;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.UnsupportedSchemeException;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
public class DefaultHttpClientConnectionOperator implements HttpClientConnectionOperator {
    static final String SOCKET_FACTORY_REGISTRY = "http.socket-factory-registry";
    private final DnsResolver dnsResolver;
    private final Log log = LogFactory.getLog(getClass());
    private final SchemePortResolver schemePortResolver;
    private final Lookup<ConnectionSocketFactory> socketFactoryRegistry;

    public DefaultHttpClientConnectionOperator(Lookup<ConnectionSocketFactory> lookup, SchemePortResolver schemePortResolver2, DnsResolver dnsResolver2) {
        Args.notNull(lookup, "Socket factory registry");
        this.socketFactoryRegistry = lookup;
        this.schemePortResolver = schemePortResolver2 != null ? schemePortResolver2 : DefaultSchemePortResolver.INSTANCE;
        this.dnsResolver = dnsResolver2 != null ? dnsResolver2 : SystemDefaultDnsResolver.INSTANCE;
    }

    private Lookup<ConnectionSocketFactory> getSocketFactoryRegistry(HttpContext httpContext) {
        Lookup lookup = (Lookup) httpContext.getAttribute("http.socket-factory-registry");
        if (lookup == null) {
            return this.socketFactoryRegistry;
        }
        return lookup;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0171 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void connect(org.apache.http.conn.ManagedHttpClientConnection r16, org.apache.http.HttpHost r17, java.net.InetSocketAddress r18, int r19, org.apache.http.config.SocketConfig r20, org.apache.http.protocol.HttpContext r21) {
        /*
            r15 = this;
            r0 = r21
            org.apache.http.config.Lookup r0 = r15.getSocketFactoryRegistry(r0)
            r1 = r17
            java.lang.String r1 = r1.getSchemeName()
            java.lang.Object r0 = r0.lookup(r1)
            org.apache.http.conn.socket.ConnectionSocketFactory r0 = (org.apache.http.conn.socket.ConnectionSocketFactory) r0
            r7 = r0
            if (r7 != 0) goto L_0x0034
            org.apache.http.conn.UnsupportedSchemeException r0 = new org.apache.http.conn.UnsupportedSchemeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r17
            java.lang.String r2 = r2.getSchemeName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " protocol is not supported"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0034:
            r0 = r17
            java.net.InetAddress r0 = r0.getAddress()
            if (r0 == 0) goto L_0x0049
            r0 = 1
            java.net.InetAddress[] r8 = new java.net.InetAddress[r0]
            r0 = r17
            java.net.InetAddress r0 = r0.getAddress()
            r1 = 0
            r8[r1] = r0
            goto L_0x0055
        L_0x0049:
            org.apache.http.conn.DnsResolver r0 = r15.dnsResolver
            r1 = r17
            java.lang.String r1 = r1.getHostName()
            java.net.InetAddress[] r8 = r0.resolve(r1)
        L_0x0055:
            org.apache.http.conn.SchemePortResolver r0 = r15.schemePortResolver
            r1 = r17
            int r9 = r0.resolve(r1)
            r10 = 0
        L_0x005e:
            int r0 = r8.length
            if (r10 >= r0) goto L_0x0175
            r11 = r8[r10]
            int r0 = r8.length
            int r0 = r0 + -1
            if (r10 != r0) goto L_0x006a
            r12 = 1
            goto L_0x006b
        L_0x006a:
            r12 = 0
        L_0x006b:
            r0 = r21
            java.net.Socket r13 = r7.createSocket(r0)
            r0 = r20
            int r0 = r0.getSoTimeout()
            r13.setSoTimeout(r0)
            r0 = r20
            boolean r0 = r0.isSoReuseAddress()
            r13.setReuseAddress(r0)
            r0 = r20
            boolean r0 = r0.isTcpNoDelay()
            r13.setTcpNoDelay(r0)
            r0 = r20
            boolean r0 = r0.isSoKeepAlive()
            r13.setKeepAlive(r0)
            r0 = r20
            int r0 = r0.getRcvBufSize()
            if (r0 <= 0) goto L_0x00a6
            r0 = r20
            int r0 = r0.getRcvBufSize()
            r13.setReceiveBufferSize(r0)
        L_0x00a6:
            r0 = r20
            int r0 = r0.getSndBufSize()
            if (r0 <= 0) goto L_0x00b7
            r0 = r20
            int r0 = r0.getSndBufSize()
            r13.setSendBufferSize(r0)
        L_0x00b7:
            r0 = r20
            int r14 = r0.getSoLinger()
            if (r14 < 0) goto L_0x00c3
            r0 = 1
            r13.setSoLinger(r0, r14)
        L_0x00c3:
            r0 = r16
            r0.bind(r13)
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            r0.<init>(r11, r9)
            r11 = r0
            org.apache.commons.logging.Log r0 = r15.log
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L_0x00ea
            org.apache.commons.logging.Log r0 = r15.log
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Connecting to "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.debug(r1)
        L_0x00ea:
            r0 = r7
            r1 = r19
            r2 = r13
            r3 = r17
            r4 = r11
            r5 = r18
            r6 = r21
            java.net.Socket r13 = r0.connectSocket(r1, r2, r3, r4, r5, r6)     // Catch:{ SocketTimeoutException -> 0x011d, ConnectException -> 0x0129, NoRouteToHostException -> 0x014b }
            r0 = r16
            r0.bind(r13)     // Catch:{ SocketTimeoutException -> 0x011d, ConnectException -> 0x0129, NoRouteToHostException -> 0x014b }
            org.apache.commons.logging.Log r0 = r15.log     // Catch:{ SocketTimeoutException -> 0x011d, ConnectException -> 0x0129, NoRouteToHostException -> 0x014b }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ SocketTimeoutException -> 0x011d, ConnectException -> 0x0129, NoRouteToHostException -> 0x014b }
            if (r0 == 0) goto L_0x011c
            org.apache.commons.logging.Log r0 = r15.log     // Catch:{ SocketTimeoutException -> 0x011d, ConnectException -> 0x0129, NoRouteToHostException -> 0x014b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x011d, ConnectException -> 0x0129, NoRouteToHostException -> 0x014b }
            java.lang.String r2 = "Connection established "
            r1.<init>(r2)     // Catch:{ SocketTimeoutException -> 0x011d, ConnectException -> 0x0129, NoRouteToHostException -> 0x014b }
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ SocketTimeoutException -> 0x011d, ConnectException -> 0x0129, NoRouteToHostException -> 0x014b }
            java.lang.String r1 = r1.toString()     // Catch:{ SocketTimeoutException -> 0x011d, ConnectException -> 0x0129, NoRouteToHostException -> 0x014b }
            r0.debug(r1)     // Catch:{ SocketTimeoutException -> 0x011d, ConnectException -> 0x0129, NoRouteToHostException -> 0x014b }
        L_0x011c:
            return
        L_0x011d:
            r13 = move-exception
            if (r12 == 0) goto L_0x0128
            org.apache.http.conn.ConnectTimeoutException r0 = new org.apache.http.conn.ConnectTimeoutException
            r1 = r17
            r0.<init>(r13, r1, r8)
            throw r0
        L_0x0128:
            goto L_0x014f
        L_0x0129:
            r13 = move-exception
            if (r12 == 0) goto L_0x014a
            java.lang.String r16 = r13.getMessage()
            java.lang.String r0 = "Connection timed out"
            r1 = r16
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0142
            org.apache.http.conn.ConnectTimeoutException r0 = new org.apache.http.conn.ConnectTimeoutException
            r1 = r17
            r0.<init>(r13, r1, r8)
            throw r0
        L_0x0142:
            org.apache.http.conn.HttpHostConnectException r0 = new org.apache.http.conn.HttpHostConnectException
            r1 = r17
            r0.<init>(r13, r1, r8)
            throw r0
        L_0x014a:
            goto L_0x014f
        L_0x014b:
            r13 = move-exception
            if (r12 == 0) goto L_0x014f
            throw r13
        L_0x014f:
            org.apache.commons.logging.Log r0 = r15.log
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L_0x0171
            org.apache.commons.logging.Log r0 = r15.log
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Connect to "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " timed out. Connection will be retried using another IP address"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.debug(r1)
        L_0x0171:
            int r10 = r10 + 1
            goto L_0x005e
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(org.apache.http.conn.ManagedHttpClientConnection, org.apache.http.HttpHost, java.net.InetSocketAddress, int, org.apache.http.config.SocketConfig, org.apache.http.protocol.HttpContext):void");
    }

    public void upgrade(ManagedHttpClientConnection managedHttpClientConnection, HttpHost httpHost, HttpContext httpContext) {
        ConnectionSocketFactory connectionSocketFactory = (ConnectionSocketFactory) getSocketFactoryRegistry(HttpClientContext.adapt(httpContext)).lookup(httpHost.getSchemeName());
        if (connectionSocketFactory == null) {
            throw new UnsupportedSchemeException(httpHost.getSchemeName() + " protocol is not supported");
        } else if (!(connectionSocketFactory instanceof LayeredConnectionSocketFactory)) {
            throw new UnsupportedSchemeException(httpHost.getSchemeName() + " protocol does not support connection upgrade");
        } else {
            managedHttpClientConnection.bind(((LayeredConnectionSocketFactory) connectionSocketFactory).createLayeredSocket(managedHttpClientConnection.getSocket(), httpHost.getHostName(), this.schemePortResolver.resolve(httpHost), httpContext));
        }
    }
}
