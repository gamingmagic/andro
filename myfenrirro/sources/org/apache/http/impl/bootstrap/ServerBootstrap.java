package org.apache.http.impl.bootstrap;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.ExceptionLogger;
import org.apache.http.HttpConnectionFactory;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseFactory;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.DefaultBHttpServerConnection;
import org.apache.http.protocol.HttpExpectationVerifier;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestHandler;
import org.apache.http.protocol.HttpRequestHandlerMapper;

public class ServerBootstrap {
    private ConnectionReuseStrategy connStrategy;
    private ConnectionConfig connectionConfig;
    private HttpConnectionFactory<? extends DefaultBHttpServerConnection> connectionFactory;
    private ExceptionLogger exceptionLogger;
    private HttpExpectationVerifier expectationVerifier;
    private Map<String, HttpRequestHandler> handlerMap;
    private HttpRequestHandlerMapper handlerMapper;
    private HttpProcessor httpProcessor;
    private int listenerPort;
    private InetAddress localAddress;
    private LinkedList<HttpRequestInterceptor> requestFirst;
    private LinkedList<HttpRequestInterceptor> requestLast;
    private HttpResponseFactory responseFactory;
    private LinkedList<HttpResponseInterceptor> responseFirst;
    private LinkedList<HttpResponseInterceptor> responseLast;
    private String serverInfo;
    private ServerSocketFactory serverSocketFactory;
    private SocketConfig socketConfig;
    private SSLContext sslContext;
    private SSLServerSetupHandler sslSetupHandler;

    private ServerBootstrap() {
    }

    public static ServerBootstrap bootstrap() {
        return new ServerBootstrap();
    }

    public final ServerBootstrap setListenerPort(int i) {
        this.listenerPort = i;
        return this;
    }

    public final ServerBootstrap setLocalAddress(InetAddress inetAddress) {
        this.localAddress = inetAddress;
        return this;
    }

    public final ServerBootstrap setSocketConfig(SocketConfig socketConfig2) {
        this.socketConfig = socketConfig2;
        return this;
    }

    public final ServerBootstrap setConnectionConfig(ConnectionConfig connectionConfig2) {
        this.connectionConfig = connectionConfig2;
        return this;
    }

    public final ServerBootstrap setHttpProcessor(HttpProcessor httpProcessor2) {
        this.httpProcessor = httpProcessor2;
        return this;
    }

    public final ServerBootstrap addInterceptorFirst(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor == null) {
            return this;
        }
        if (this.responseFirst == null) {
            this.responseFirst = new LinkedList<>();
        }
        this.responseFirst.addFirst(httpResponseInterceptor);
        return this;
    }

    public final ServerBootstrap addInterceptorLast(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor == null) {
            return this;
        }
        if (this.responseLast == null) {
            this.responseLast = new LinkedList<>();
        }
        this.responseLast.addLast(httpResponseInterceptor);
        return this;
    }

    public final ServerBootstrap addInterceptorFirst(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor == null) {
            return this;
        }
        if (this.requestFirst == null) {
            this.requestFirst = new LinkedList<>();
        }
        this.requestFirst.addFirst(httpRequestInterceptor);
        return this;
    }

    public final ServerBootstrap addInterceptorLast(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor == null) {
            return this;
        }
        if (this.requestLast == null) {
            this.requestLast = new LinkedList<>();
        }
        this.requestLast.addLast(httpRequestInterceptor);
        return this;
    }

    public final ServerBootstrap setServerInfo(String str) {
        this.serverInfo = str;
        return this;
    }

    public final ServerBootstrap setConnectionReuseStrategy(ConnectionReuseStrategy connectionReuseStrategy) {
        this.connStrategy = connectionReuseStrategy;
        return this;
    }

    public final ServerBootstrap setResponseFactory(HttpResponseFactory httpResponseFactory) {
        this.responseFactory = httpResponseFactory;
        return this;
    }

    public final ServerBootstrap setHandlerMapper(HttpRequestHandlerMapper httpRequestHandlerMapper) {
        this.handlerMapper = httpRequestHandlerMapper;
        return this;
    }

    public final ServerBootstrap registerHandler(String str, HttpRequestHandler httpRequestHandler) {
        if (str == null || httpRequestHandler == null) {
            return this;
        }
        if (this.handlerMap == null) {
            this.handlerMap = new HashMap();
        }
        this.handlerMap.put(str, httpRequestHandler);
        return this;
    }

    public final ServerBootstrap setExpectationVerifier(HttpExpectationVerifier httpExpectationVerifier) {
        this.expectationVerifier = httpExpectationVerifier;
        return this;
    }

    public final ServerBootstrap setConnectionFactory(HttpConnectionFactory<? extends DefaultBHttpServerConnection> httpConnectionFactory) {
        this.connectionFactory = httpConnectionFactory;
        return this;
    }

    public final ServerBootstrap setSslSetupHandler(SSLServerSetupHandler sSLServerSetupHandler) {
        this.sslSetupHandler = sSLServerSetupHandler;
        return this;
    }

    public final ServerBootstrap setServerSocketFactory(ServerSocketFactory serverSocketFactory2) {
        this.serverSocketFactory = serverSocketFactory2;
        return this;
    }

    public final ServerBootstrap setSslContext(SSLContext sSLContext) {
        this.sslContext = sSLContext;
        return this;
    }

    public final ServerBootstrap setExceptionLogger(ExceptionLogger exceptionLogger2) {
        this.exceptionLogger = exceptionLogger2;
        return this;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [org.apache.http.protocol.HttpRequestHandlerMapper] */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r4v0, types: [org.apache.http.protocol.HttpRequestHandlerMapper] */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.impl.bootstrap.HttpServer create() {
        /*
            r14 = this;
            org.apache.http.protocol.HttpProcessor r9 = r14.httpProcessor
            if (r9 != 0) goto L_0x00a4
            org.apache.http.protocol.HttpProcessorBuilder r10 = org.apache.http.protocol.HttpProcessorBuilder.create()
            java.util.LinkedList<org.apache.http.HttpRequestInterceptor> r0 = r14.requestFirst
            if (r0 == 0) goto L_0x0023
            java.util.LinkedList<org.apache.http.HttpRequestInterceptor> r0 = r14.requestFirst
            java.util.Iterator r11 = r0.iterator()
        L_0x0012:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r11.next()
            org.apache.http.HttpRequestInterceptor r0 = (org.apache.http.HttpRequestInterceptor) r0
            r12 = r0
            r10.addFirst(r12)
            goto L_0x0012
        L_0x0023:
            java.util.LinkedList<org.apache.http.HttpResponseInterceptor> r0 = r14.responseFirst
            if (r0 == 0) goto L_0x003e
            java.util.LinkedList<org.apache.http.HttpResponseInterceptor> r0 = r14.responseFirst
            java.util.Iterator r11 = r0.iterator()
        L_0x002d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r11.next()
            org.apache.http.HttpResponseInterceptor r0 = (org.apache.http.HttpResponseInterceptor) r0
            r12 = r0
            r10.addFirst(r12)
            goto L_0x002d
        L_0x003e:
            java.lang.String r11 = r14.serverInfo
            if (r11 != 0) goto L_0x0044
            java.lang.String r11 = "Apache-HttpCore/1.1"
        L_0x0044:
            r0 = 4
            org.apache.http.HttpResponseInterceptor[] r0 = new org.apache.http.HttpResponseInterceptor[r0]
            org.apache.http.protocol.ResponseDate r1 = new org.apache.http.protocol.ResponseDate
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            org.apache.http.protocol.ResponseServer r1 = new org.apache.http.protocol.ResponseServer
            r1.<init>(r11)
            r2 = 1
            r0[r2] = r1
            org.apache.http.protocol.ResponseContent r1 = new org.apache.http.protocol.ResponseContent
            r1.<init>()
            r2 = 2
            r0[r2] = r1
            org.apache.http.protocol.ResponseConnControl r1 = new org.apache.http.protocol.ResponseConnControl
            r1.<init>()
            r2 = 3
            r0[r2] = r1
            r10.addAll(r0)
            java.util.LinkedList<org.apache.http.HttpRequestInterceptor> r0 = r14.requestLast
            if (r0 == 0) goto L_0x0085
            java.util.LinkedList<org.apache.http.HttpRequestInterceptor> r0 = r14.requestLast
            java.util.Iterator r12 = r0.iterator()
        L_0x0074:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r12.next()
            org.apache.http.HttpRequestInterceptor r0 = (org.apache.http.HttpRequestInterceptor) r0
            r13 = r0
            r10.addLast(r13)
            goto L_0x0074
        L_0x0085:
            java.util.LinkedList<org.apache.http.HttpResponseInterceptor> r0 = r14.responseLast
            if (r0 == 0) goto L_0x00a0
            java.util.LinkedList<org.apache.http.HttpResponseInterceptor> r0 = r14.responseLast
            java.util.Iterator r12 = r0.iterator()
        L_0x008f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r12.next()
            org.apache.http.HttpResponseInterceptor r0 = (org.apache.http.HttpResponseInterceptor) r0
            r13 = r0
            r10.addLast(r13)
            goto L_0x008f
        L_0x00a0:
            org.apache.http.protocol.HttpProcessor r9 = r10.build()
        L_0x00a4:
            org.apache.http.protocol.HttpRequestHandlerMapper r10 = r14.handlerMapper
            if (r10 != 0) goto L_0x00d9
            org.apache.http.protocol.UriHttpRequestHandlerMapper r11 = new org.apache.http.protocol.UriHttpRequestHandlerMapper
            r11.<init>()
            java.util.Map<java.lang.String, org.apache.http.protocol.HttpRequestHandler> r0 = r14.handlerMap
            if (r0 == 0) goto L_0x00d8
            java.util.Map<java.lang.String, org.apache.http.protocol.HttpRequestHandler> r0 = r14.handlerMap
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r12 = r0.iterator()
        L_0x00bb:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r13 = r0
            java.lang.Object r0 = r13.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r13.getValue()
            org.apache.http.protocol.HttpRequestHandler r1 = (org.apache.http.protocol.HttpRequestHandler) r1
            r11.register(r0, r1)
            goto L_0x00bb
        L_0x00d8:
            r10 = r11
        L_0x00d9:
            org.apache.http.ConnectionReuseStrategy r11 = r14.connStrategy
            if (r11 != 0) goto L_0x00df
            org.apache.http.impl.DefaultConnectionReuseStrategy r11 = org.apache.http.impl.DefaultConnectionReuseStrategy.INSTANCE
        L_0x00df:
            org.apache.http.HttpResponseFactory r12 = r14.responseFactory
            if (r12 != 0) goto L_0x00e5
            org.apache.http.impl.DefaultHttpResponseFactory r12 = org.apache.http.impl.DefaultHttpResponseFactory.INSTANCE
        L_0x00e5:
            org.apache.http.protocol.HttpService r13 = new org.apache.http.protocol.HttpService
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r10
            org.apache.http.protocol.HttpExpectationVerifier r5 = r14.expectationVerifier
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            javax.net.ServerSocketFactory r9 = r14.serverSocketFactory
            if (r9 != 0) goto L_0x0104
            javax.net.ssl.SSLContext r0 = r14.sslContext
            if (r0 == 0) goto L_0x0100
            javax.net.ssl.SSLContext r0 = r14.sslContext
            javax.net.ssl.SSLServerSocketFactory r9 = r0.getServerSocketFactory()
            goto L_0x0104
        L_0x0100:
            javax.net.ServerSocketFactory r9 = javax.net.ServerSocketFactory.getDefault()
        L_0x0104:
            org.apache.http.HttpConnectionFactory<? extends org.apache.http.impl.DefaultBHttpServerConnection> r10 = r14.connectionFactory
            if (r10 != 0) goto L_0x0116
            org.apache.http.config.ConnectionConfig r0 = r14.connectionConfig
            if (r0 == 0) goto L_0x0114
            org.apache.http.impl.DefaultBHttpServerConnectionFactory r10 = new org.apache.http.impl.DefaultBHttpServerConnectionFactory
            org.apache.http.config.ConnectionConfig r0 = r14.connectionConfig
            r10.<init>(r0)
            goto L_0x0116
        L_0x0114:
            org.apache.http.impl.DefaultBHttpServerConnectionFactory r10 = org.apache.http.impl.DefaultBHttpServerConnectionFactory.INSTANCE
        L_0x0116:
            org.apache.http.ExceptionLogger r11 = r14.exceptionLogger
            if (r11 != 0) goto L_0x011c
            org.apache.http.ExceptionLogger r11 = org.apache.http.ExceptionLogger.NO_OP
        L_0x011c:
            org.apache.http.impl.bootstrap.HttpServer r0 = new org.apache.http.impl.bootstrap.HttpServer
            int r1 = r14.listenerPort
            if (r1 <= 0) goto L_0x0125
            int r1 = r14.listenerPort
            goto L_0x0126
        L_0x0125:
            r1 = 0
        L_0x0126:
            java.net.InetAddress r2 = r14.localAddress
            org.apache.http.config.SocketConfig r3 = r14.socketConfig
            if (r3 == 0) goto L_0x012f
            org.apache.http.config.SocketConfig r3 = r14.socketConfig
            goto L_0x0131
        L_0x012f:
            org.apache.http.config.SocketConfig r3 = org.apache.http.config.SocketConfig.DEFAULT
        L_0x0131:
            r4 = r9
            r5 = r13
            r6 = r10
            org.apache.http.impl.bootstrap.SSLServerSetupHandler r7 = r14.sslSetupHandler
            r8 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.bootstrap.ServerBootstrap.create():org.apache.http.impl.bootstrap.HttpServer");
    }
}
