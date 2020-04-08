package org.apache.http.impl.client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.NonRepeatableRequestException;
import org.apache.http.client.RedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

@Deprecated
public class DefaultRequestDirector implements RequestDirector {
    private final HttpAuthenticator authenticator;
    protected final ClientConnectionManager connManager;
    private int execCount;
    protected final HttpProcessor httpProcessor;
    protected final ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log;
    protected ManagedClientConnection managedConn;
    private final int maxRedirects;
    protected final HttpParams params;
    @Deprecated
    protected final AuthenticationHandler proxyAuthHandler;
    protected final AuthState proxyAuthState;
    protected final AuthenticationStrategy proxyAuthStrategy;
    private int redirectCount;
    @Deprecated
    protected final RedirectHandler redirectHandler;
    protected final RedirectStrategy redirectStrategy;
    protected final HttpRequestExecutor requestExec;
    protected final HttpRequestRetryHandler retryHandler;
    protected final ConnectionReuseStrategy reuseStrategy;
    protected final HttpRoutePlanner routePlanner;
    @Deprecated
    protected final AuthenticationHandler targetAuthHandler;
    protected final AuthState targetAuthState;
    protected final AuthenticationStrategy targetAuthStrategy;
    protected final UserTokenHandler userTokenHandler;
    private HttpHost virtualHost;

    @Deprecated
    public DefaultRequestDirector(HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor2, HttpRequestRetryHandler httpRequestRetryHandler, RedirectHandler redirectHandler2, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler2, HttpParams httpParams) {
        this(LogFactory.getLog(DefaultRequestDirector.class), httpRequestExecutor, clientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpRoutePlanner, httpProcessor2, httpRequestRetryHandler, (RedirectStrategy) new DefaultRedirectStrategyAdaptor(redirectHandler2), (AuthenticationStrategy) new AuthenticationStrategyAdaptor(authenticationHandler), (AuthenticationStrategy) new AuthenticationStrategyAdaptor(authenticationHandler2), userTokenHandler2, httpParams);
    }

    @Deprecated
    public DefaultRequestDirector(Log log2, HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor2, HttpRequestRetryHandler httpRequestRetryHandler, RedirectStrategy redirectStrategy2, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler2, HttpParams httpParams) {
        this(LogFactory.getLog(DefaultRequestDirector.class), httpRequestExecutor, clientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpRoutePlanner, httpProcessor2, httpRequestRetryHandler, redirectStrategy2, (AuthenticationStrategy) new AuthenticationStrategyAdaptor(authenticationHandler), (AuthenticationStrategy) new AuthenticationStrategyAdaptor(authenticationHandler2), userTokenHandler2, httpParams);
    }

    public DefaultRequestDirector(Log log2, HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor2, HttpRequestRetryHandler httpRequestRetryHandler, RedirectStrategy redirectStrategy2, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler2, HttpParams httpParams) {
        Args.notNull(log2, "Log");
        Args.notNull(httpRequestExecutor, "Request executor");
        Args.notNull(clientConnectionManager, "Client connection manager");
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        Args.notNull(connectionKeepAliveStrategy, "Connection keep alive strategy");
        Args.notNull(httpRoutePlanner, "Route planner");
        Args.notNull(httpProcessor2, "HTTP protocol processor");
        Args.notNull(httpRequestRetryHandler, "HTTP request retry handler");
        Args.notNull(redirectStrategy2, "Redirect strategy");
        Args.notNull(authenticationStrategy, "Target authentication strategy");
        Args.notNull(authenticationStrategy2, "Proxy authentication strategy");
        Args.notNull(userTokenHandler2, "User token handler");
        Args.notNull(httpParams, "HTTP parameters");
        this.log = log2;
        this.authenticator = new HttpAuthenticator(log2);
        this.requestExec = httpRequestExecutor;
        this.connManager = clientConnectionManager;
        this.reuseStrategy = connectionReuseStrategy;
        this.keepAliveStrategy = connectionKeepAliveStrategy;
        this.routePlanner = httpRoutePlanner;
        this.httpProcessor = httpProcessor2;
        this.retryHandler = httpRequestRetryHandler;
        this.redirectStrategy = redirectStrategy2;
        this.targetAuthStrategy = authenticationStrategy;
        this.proxyAuthStrategy = authenticationStrategy2;
        this.userTokenHandler = userTokenHandler2;
        this.params = httpParams;
        if (redirectStrategy2 instanceof DefaultRedirectStrategyAdaptor) {
            this.redirectHandler = ((DefaultRedirectStrategyAdaptor) redirectStrategy2).getHandler();
        } else {
            this.redirectHandler = null;
        }
        if (authenticationStrategy instanceof AuthenticationStrategyAdaptor) {
            this.targetAuthHandler = ((AuthenticationStrategyAdaptor) authenticationStrategy).getHandler();
        } else {
            this.targetAuthHandler = null;
        }
        if (authenticationStrategy2 instanceof AuthenticationStrategyAdaptor) {
            this.proxyAuthHandler = ((AuthenticationStrategyAdaptor) authenticationStrategy2).getHandler();
        } else {
            this.proxyAuthHandler = null;
        }
        this.managedConn = null;
        this.execCount = 0;
        this.redirectCount = 0;
        this.targetAuthState = new AuthState();
        this.proxyAuthState = new AuthState();
        this.maxRedirects = this.params.getIntParameter(ClientPNames.MAX_REDIRECTS, 100);
    }

    private RequestWrapper wrapRequest(HttpRequest httpRequest) {
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            return new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpRequest);
        }
        return new RequestWrapper(httpRequest);
    }

    /* access modifiers changed from: protected */
    public void rewriteRequestURI(RequestWrapper requestWrapper, HttpRoute httpRoute) {
        URI uri;
        try {
            URI uri2 = requestWrapper.getURI();
            if (httpRoute.getProxyHost() == null || httpRoute.isTunnelled()) {
                if (uri2.isAbsolute()) {
                    uri = URIUtils.rewriteURI(uri2, null, true);
                } else {
                    uri = URIUtils.rewriteURI(uri2);
                }
            } else if (!uri2.isAbsolute()) {
                uri = URIUtils.rewriteURI(uri2, httpRoute.getTargetHost(), true);
            } else {
                uri = URIUtils.rewriteURI(uri2);
            }
            requestWrapper.setURI(uri);
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid URI: " + requestWrapper.getRequestLine().getUri(), e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:15|(1:17)|18|19|20|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a6, code lost:
        if (org.apache.http.params.HttpConnectionParams.isStaleCheckingEnabled(r12.params) == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        if (r12.managedConn.isOpen() == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b0, code lost:
        r12.log.debug("Stale connection check");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bd, code lost:
        if (r12.managedConn.isStale() == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bf, code lost:
        r12.log.debug("Stale connection detected");
        r12.managedConn.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0093 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.HttpResponse execute(org.apache.http.HttpHost r13, org.apache.http.HttpRequest r14, org.apache.http.protocol.HttpContext r15) {
        /*
            r12 = this;
            java.lang.String r0 = "http.auth.target-scope"
            org.apache.http.auth.AuthState r1 = r12.targetAuthState
            r15.setAttribute(r0, r1)
            java.lang.String r0 = "http.auth.proxy-scope"
            org.apache.http.auth.AuthState r1 = r12.proxyAuthState
            r15.setAttribute(r0, r1)
            org.apache.http.impl.client.RequestWrapper r3 = r12.wrapRequest(r14)
            org.apache.http.params.HttpParams r0 = r12.params
            r3.setParams(r0)
            org.apache.http.conn.routing.HttpRoute r4 = r12.determineRoute(r13, r3, r15)
            org.apache.http.params.HttpParams r0 = r3.getParams()
            java.lang.String r1 = "http.virtual-host"
            java.lang.Object r0 = r0.getParameter(r1)
            org.apache.http.HttpHost r0 = (org.apache.http.HttpHost) r0
            r12.virtualHost = r0
            org.apache.http.HttpHost r0 = r12.virtualHost
            if (r0 == 0) goto L_0x0058
            org.apache.http.HttpHost r0 = r12.virtualHost
            int r0 = r0.getPort()
            r1 = -1
            if (r0 != r1) goto L_0x0058
            if (r13 == 0) goto L_0x003a
            r0 = r13
            goto L_0x003e
        L_0x003a:
            org.apache.http.HttpHost r0 = r4.getTargetHost()
        L_0x003e:
            int r6 = r0.getPort()
            r0 = -1
            if (r6 == r0) goto L_0x0058
            org.apache.http.HttpHost r0 = new org.apache.http.HttpHost
            org.apache.http.HttpHost r1 = r12.virtualHost
            java.lang.String r1 = r1.getHostName()
            org.apache.http.HttpHost r2 = r12.virtualHost
            java.lang.String r2 = r2.getSchemeName()
            r0.<init>(r1, r6, r2)
            r12.virtualHost = r0
        L_0x0058:
            org.apache.http.impl.client.RoutedRequest r5 = new org.apache.http.impl.client.RoutedRequest
            r5.<init>(r3, r4)
            r6 = 0
            r3 = 0
            r4 = 0
        L_0x0060:
            if (r3 != 0) goto L_0x0252
            org.apache.http.impl.client.RequestWrapper r7 = r5.getRequest()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.conn.routing.HttpRoute r4 = r5.getRoute()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r0 = "http.user-token"
            java.lang.Object r8 = r15.getAttribute(r0)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.conn.ManagedClientConnection r0 = r12.managedConn     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 != 0) goto L_0x00cb
            org.apache.http.conn.ClientConnectionManager r0 = r12.connManager     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.conn.ClientConnectionRequest r9 = r0.requestConnection(r4, r8)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            boolean r0 = r14 instanceof org.apache.http.client.methods.AbortableHttpRequest     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x0084
            r0 = r14
            org.apache.http.client.methods.AbortableHttpRequest r0 = (org.apache.http.client.methods.AbortableHttpRequest) r0     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.setConnectionRequest(r9)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x0084:
            org.apache.http.params.HttpParams r0 = r12.params     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            long r10 = org.apache.http.client.params.HttpClientParams.getConnectionManagerTimeout(r0)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0093 }
            org.apache.http.conn.ManagedClientConnection r0 = r9.getConnection(r10, r0)     // Catch:{ InterruptedException -> 0x0093 }
            r12.managedConn = r0     // Catch:{ InterruptedException -> 0x0093 }
            goto L_0x00a0
        L_0x0093:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.interrupt()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.<init>()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            throw r0     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x00a0:
            org.apache.http.params.HttpParams r0 = r12.params     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            boolean r0 = org.apache.http.params.HttpConnectionParams.isStaleCheckingEnabled(r0)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x00cb
            org.apache.http.conn.ManagedClientConnection r0 = r12.managedConn     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            boolean r0 = r0.isOpen()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x00cb
            org.apache.commons.logging.Log r0 = r12.log     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r1 = "Stale connection check"
            r0.debug(r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.conn.ManagedClientConnection r0 = r12.managedConn     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            boolean r0 = r0.isStale()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x00cb
            org.apache.commons.logging.Log r0 = r12.log     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r1 = "Stale connection detected"
            r0.debug(r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.conn.ManagedClientConnection r0 = r12.managedConn     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.close()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x00cb:
            boolean r0 = r14 instanceof org.apache.http.client.methods.AbortableHttpRequest     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x00d7
            r0 = r14
            org.apache.http.client.methods.AbortableHttpRequest r0 = (org.apache.http.client.methods.AbortableHttpRequest) r0     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.conn.ManagedClientConnection r1 = r12.managedConn     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.setReleaseTrigger(r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x00d7:
            r12.tryConnect(r5, r15)     // Catch:{ TunnelRefusedException -> 0x00db }
            goto L_0x00f3
        L_0x00db:
            r9 = move-exception
            org.apache.commons.logging.Log r0 = r12.log     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x00ed
            org.apache.commons.logging.Log r0 = r12.log     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r1 = r9.getMessage()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.debug(r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x00ed:
            org.apache.http.HttpResponse r4 = r9.getResponse()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            goto L_0x0252
        L_0x00f3:
            java.net.URI r0 = r7.getURI()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r9 = r0.getUserInfo()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r9 == 0) goto L_0x010c
            org.apache.http.auth.AuthState r0 = r12.targetAuthState     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.impl.auth.BasicScheme r1 = new org.apache.http.impl.auth.BasicScheme     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r1.<init>()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.auth.UsernamePasswordCredentials r2 = new org.apache.http.auth.UsernamePasswordCredentials     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r2.<init>(r9)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.update(r1, r2)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x010c:
            org.apache.http.HttpHost r0 = r12.virtualHost     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x0113
            org.apache.http.HttpHost r13 = r12.virtualHost     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            goto L_0x0121
        L_0x0113:
            java.net.URI r10 = r7.getURI()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            boolean r0 = r10.isAbsolute()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x0121
            org.apache.http.HttpHost r13 = org.apache.http.client.utils.URIUtils.extractHost(r10)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x0121:
            if (r13 != 0) goto L_0x0127
            org.apache.http.HttpHost r13 = r4.getTargetHost()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x0127:
            r7.resetHeaders()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r12.rewriteRequestURI(r7, r4)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r0 = "http.target_host"
            r15.setAttribute(r0, r13)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r0 = "http.route"
            r15.setAttribute(r0, r4)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r0 = "http.connection"
            org.apache.http.conn.ManagedClientConnection r1 = r12.managedConn     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r15.setAttribute(r0, r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.protocol.HttpRequestExecutor r0 = r12.requestExec     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.protocol.HttpProcessor r1 = r12.httpProcessor     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.preProcess(r7, r1, r15)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.HttpResponse r4 = r12.tryExecute(r5, r15)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r4 == 0) goto L_0x0060
            org.apache.http.params.HttpParams r0 = r12.params     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r4.setParams(r0)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.protocol.HttpRequestExecutor r0 = r12.requestExec     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.protocol.HttpProcessor r1 = r12.httpProcessor     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.postProcess(r4, r1, r15)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.ConnectionReuseStrategy r0 = r12.reuseStrategy     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            boolean r6 = r0.keepAlive(r4, r15)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r6 == 0) goto L_0x01ac
            org.apache.http.conn.ConnectionKeepAliveStrategy r0 = r12.keepAliveStrategy     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            long r10 = r0.getKeepAliveDuration(r4, r15)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.commons.logging.Log r0 = r12.log     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x01a5
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x018f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r1 = "for "
            r0.<init>(r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.StringBuilder r0 = r0.append(r10)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r7 = r0.toString()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            goto L_0x0191
        L_0x018f:
            java.lang.String r7 = "indefinitely"
        L_0x0191:
            org.apache.commons.logging.Log r0 = r12.log     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r2 = "Connection can be kept alive "
            r1.<init>(r2)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.StringBuilder r1 = r1.append(r7)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r1 = r1.toString()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.debug(r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x01a5:
            org.apache.http.conn.ManagedClientConnection r0 = r12.managedConn     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.setIdleDuration(r10, r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x01ac:
            org.apache.http.impl.client.RoutedRequest r10 = r12.handleResponse(r5, r4, r15)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r10 != 0) goto L_0x01b5
            r3 = 1
            goto L_0x0238
        L_0x01b5:
            if (r6 == 0) goto L_0x01c5
            org.apache.http.HttpEntity r0 = r4.getEntity()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.util.EntityUtils.consume(r0)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.conn.ManagedClientConnection r0 = r12.managedConn     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.markReusable()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            goto L_0x0226
        L_0x01c5:
            org.apache.http.conn.ManagedClientConnection r0 = r12.managedConn     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.close()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.auth.AuthState r0 = r12.proxyAuthState     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.auth.AuthProtocolState r0 = r0.getState()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.CHALLENGED     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            int r0 = r0.compareTo(r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 <= 0) goto L_0x01f8
            org.apache.http.auth.AuthState r0 = r12.proxyAuthState     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.auth.AuthScheme r0 = r0.getAuthScheme()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x01f8
            org.apache.http.auth.AuthState r0 = r12.proxyAuthState     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.auth.AuthScheme r0 = r0.getAuthScheme()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            boolean r0 = r0.isConnectionBased()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x01f8
            org.apache.commons.logging.Log r0 = r12.log     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r1 = "Resetting proxy auth state"
            r0.debug(r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.auth.AuthState r0 = r12.proxyAuthState     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.reset()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x01f8:
            org.apache.http.auth.AuthState r0 = r12.targetAuthState     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.auth.AuthProtocolState r0 = r0.getState()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.CHALLENGED     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            int r0 = r0.compareTo(r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 <= 0) goto L_0x0226
            org.apache.http.auth.AuthState r0 = r12.targetAuthState     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.auth.AuthScheme r0 = r0.getAuthScheme()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x0226
            org.apache.http.auth.AuthState r0 = r12.targetAuthState     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.auth.AuthScheme r0 = r0.getAuthScheme()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            boolean r0 = r0.isConnectionBased()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x0226
            org.apache.commons.logging.Log r0 = r12.log     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r1 = "Resetting target auth state"
            r0.debug(r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.auth.AuthState r0 = r12.targetAuthState     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.reset()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x0226:
            org.apache.http.conn.routing.HttpRoute r0 = r10.getRoute()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.conn.routing.HttpRoute r1 = r5.getRoute()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            boolean r0 = r0.equals(r1)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 != 0) goto L_0x0237
            r12.releaseConnection()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x0237:
            r5 = r10
        L_0x0238:
            org.apache.http.conn.ManagedClientConnection r0 = r12.managedConn     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x0250
            if (r8 != 0) goto L_0x0249
            org.apache.http.client.UserTokenHandler r0 = r12.userTokenHandler     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.Object r8 = r0.getUserToken(r15)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            java.lang.String r0 = "http.user-token"
            r15.setAttribute(r0, r8)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x0249:
            if (r8 == 0) goto L_0x0250
            org.apache.http.conn.ManagedClientConnection r0 = r12.managedConn     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.setState(r8)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x0250:
            goto L_0x0060
        L_0x0252:
            if (r4 == 0) goto L_0x0264
            org.apache.http.HttpEntity r0 = r4.getEntity()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 == 0) goto L_0x0264
            org.apache.http.HttpEntity r0 = r4.getEntity()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            boolean r0 = r0.isStreaming()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            if (r0 != 0) goto L_0x026f
        L_0x0264:
            if (r6 == 0) goto L_0x026b
            org.apache.http.conn.ManagedClientConnection r0 = r12.managedConn     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.markReusable()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x026b:
            r12.releaseConnection()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            goto L_0x027e
        L_0x026f:
            org.apache.http.HttpEntity r7 = r4.getEntity()     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.conn.BasicManagedEntity r0 = new org.apache.http.conn.BasicManagedEntity     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            org.apache.http.conn.ManagedClientConnection r1 = r12.managedConn     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r0.<init>(r7, r1, r6)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
            r7 = r0
            r4.setEntity(r7)     // Catch:{ ConnectionShutdownException -> 0x027f, HttpException -> 0x028b, IOException -> 0x0290, RuntimeException -> 0x0295 }
        L_0x027e:
            return r4
        L_0x027f:
            r4 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException
            java.lang.String r0 = "Connection has been shut down"
            r7.<init>(r0)
            r7.initCause(r4)
            throw r7
        L_0x028b:
            r4 = move-exception
            r12.abortConnection()
            throw r4
        L_0x0290:
            r4 = move-exception
            r12.abortConnection()
            throw r4
        L_0x0295:
            r4 = move-exception
            r12.abortConnection()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.DefaultRequestDirector.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):org.apache.http.HttpResponse");
    }

    private void tryConnect(RoutedRequest routedRequest, HttpContext httpContext) {
        HttpRoute route = routedRequest.getRoute();
        RequestWrapper request = routedRequest.getRequest();
        int i = 0;
        while (true) {
            httpContext.setAttribute("http.request", request);
            i++;
            try {
                if (!this.managedConn.isOpen()) {
                    this.managedConn.open(route, httpContext, this.params);
                } else {
                    this.managedConn.setSocketTimeout(HttpConnectionParams.getSoTimeout(this.params));
                }
                establishRoute(route, httpContext);
                return;
            } catch (IOException e) {
                try {
                    this.managedConn.close();
                } catch (IOException unused) {
                }
                if (!this.retryHandler.retryRequest(e, i, httpContext)) {
                    throw e;
                } else if (this.log.isInfoEnabled()) {
                    this.log.info("I/O exception (" + e.getClass().getName() + ") caught when connecting to " + route + ": " + e.getMessage());
                    if (this.log.isDebugEnabled()) {
                        this.log.debug(e.getMessage(), e);
                    }
                    this.log.info("Retrying connect to " + route);
                }
            }
        }
    }

    private HttpResponse tryExecute(RoutedRequest routedRequest, HttpContext httpContext) {
        RequestWrapper request = routedRequest.getRequest();
        HttpRoute route = routedRequest.getRoute();
        IOException e = null;
        while (true) {
            this.execCount++;
            request.incrementExecCount();
            if (!request.isRepeatable()) {
                this.log.debug("Cannot retry non-repeatable request");
                if (e != null) {
                    throw new NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed.", e);
                }
                throw new NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity.");
            }
            try {
                if (!this.managedConn.isOpen()) {
                    if (!route.isTunnelled()) {
                        this.log.debug("Reopening the direct connection.");
                        this.managedConn.open(route, httpContext, this.params);
                    } else {
                        this.log.debug("Proxied connection. Need to start over.");
                        return null;
                    }
                }
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Attempt " + this.execCount + " to execute request");
                }
                return this.requestExec.execute(request, this.managedConn, httpContext);
            } catch (IOException e2) {
                e = e2;
                this.log.debug("Closing the connection.");
                try {
                    this.managedConn.close();
                } catch (IOException unused) {
                }
                if (this.retryHandler.retryRequest(e, request.getExecCount(), httpContext)) {
                    if (this.log.isInfoEnabled()) {
                        this.log.info("I/O exception (" + e.getClass().getName() + ") caught when processing request to " + route + ": " + e.getMessage());
                    }
                    if (this.log.isDebugEnabled()) {
                        this.log.debug(e.getMessage(), e);
                    }
                    if (this.log.isInfoEnabled()) {
                        this.log.info("Retrying request to " + route);
                    }
                } else if (e instanceof NoHttpResponseException) {
                    NoHttpResponseException noHttpResponseException = new NoHttpResponseException(route.getTargetHost().toHostString() + " failed to respond");
                    NoHttpResponseException noHttpResponseException2 = noHttpResponseException;
                    noHttpResponseException.setStackTrace(e.getStackTrace());
                    throw noHttpResponseException2;
                } else {
                    throw e;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void releaseConnection() {
        try {
            this.managedConn.releaseConnection();
        } catch (IOException e) {
            this.log.debug("IOException releasing connection", e);
        }
        this.managedConn = null;
    }

    /* access modifiers changed from: protected */
    public HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.routePlanner.determineRoute(httpHost != null ? httpHost : (HttpHost) httpRequest.getParams().getParameter(ClientPNames.DEFAULT_HOST), httpRequest, httpContext);
    }

    /* access modifiers changed from: protected */
    public void establishRoute(HttpRoute httpRoute, HttpContext httpContext) {
        int nextStep;
        BasicRouteDirector basicRouteDirector = new BasicRouteDirector();
        do {
            HttpRoute route = this.managedConn.getRoute();
            nextStep = basicRouteDirector.nextStep(httpRoute, route);
            switch (nextStep) {
                case -1:
                    throw new HttpException("Unable to establish route: planned = " + httpRoute + "; current = " + route);
                case 0:
                    break;
                case 1:
                case 2:
                    this.managedConn.open(httpRoute, httpContext, this.params);
                    continue;
                case 3:
                    boolean createTunnelToTarget = createTunnelToTarget(httpRoute, httpContext);
                    this.log.debug("Tunnel to target created.");
                    this.managedConn.tunnelTarget(createTunnelToTarget, this.params);
                    continue;
                case 4:
                    int hopCount = route.getHopCount() - 1;
                    boolean createTunnelToProxy = createTunnelToProxy(httpRoute, hopCount, httpContext);
                    this.log.debug("Tunnel to proxy created.");
                    this.managedConn.tunnelProxy(httpRoute.getHopTarget(hopCount), createTunnelToProxy, this.params);
                    continue;
                case 5:
                    this.managedConn.layerProtocol(httpContext, this.params);
                    continue;
                default:
                    throw new IllegalStateException("Unknown step indicator " + nextStep + " from RouteDirector.");
            }
        } while (nextStep > 0);
    }

    /* access modifiers changed from: protected */
    public boolean createTunnelToTarget(HttpRoute httpRoute, HttpContext httpContext) {
        HttpResponse execute;
        HttpHost proxyHost = httpRoute.getProxyHost();
        HttpHost targetHost = httpRoute.getTargetHost();
        while (true) {
            if (!this.managedConn.isOpen()) {
                this.managedConn.open(httpRoute, httpContext, this.params);
            }
            HttpRequest createConnectRequest = createConnectRequest(httpRoute, httpContext);
            createConnectRequest.setParams(this.params);
            httpContext.setAttribute("http.target_host", targetHost);
            httpContext.setAttribute("http.route", httpRoute);
            httpContext.setAttribute(ExecutionContext.HTTP_PROXY_HOST, proxyHost);
            httpContext.setAttribute("http.connection", this.managedConn);
            httpContext.setAttribute("http.request", createConnectRequest);
            this.requestExec.preProcess(createConnectRequest, this.httpProcessor, httpContext);
            execute = this.requestExec.execute(createConnectRequest, this.managedConn, httpContext);
            execute.setParams(this.params);
            this.requestExec.postProcess(execute, this.httpProcessor, httpContext);
            if (execute.getStatusLine().getStatusCode() < 200) {
                throw new HttpException("Unexpected response to CONNECT request: " + execute.getStatusLine());
            } else if (HttpClientParams.isAuthenticating(this.params)) {
                if (this.authenticator.isAuthenticationRequested(proxyHost, execute, this.proxyAuthStrategy, this.proxyAuthState, httpContext) && this.authenticator.authenticate(proxyHost, execute, this.proxyAuthStrategy, this.proxyAuthState, httpContext)) {
                    if (this.reuseStrategy.keepAlive(execute, httpContext)) {
                        this.log.debug("Connection kept alive");
                        EntityUtils.consume(execute.getEntity());
                    } else {
                        this.managedConn.close();
                    }
                }
            }
        }
        if (execute.getStatusLine().getStatusCode() > 299) {
            HttpEntity entity = execute.getEntity();
            if (entity != null) {
                execute.setEntity(new BufferedHttpEntity(entity));
            }
            this.managedConn.close();
            throw new TunnelRefusedException("CONNECT refused by proxy: " + execute.getStatusLine(), execute);
        }
        this.managedConn.markReusable();
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean createTunnelToProxy(HttpRoute httpRoute, int i, HttpContext httpContext) {
        throw new HttpException("Proxy chains are not supported.");
    }

    /* access modifiers changed from: protected */
    public HttpRequest createConnectRequest(HttpRoute httpRoute, HttpContext httpContext) {
        HttpHost targetHost = httpRoute.getTargetHost();
        String hostName = targetHost.getHostName();
        int port = targetHost.getPort();
        if (port < 0) {
            port = this.connManager.getSchemeRegistry().getScheme(targetHost.getSchemeName()).getDefaultPort();
        }
        StringBuilder sb = new StringBuilder(hostName.length() + 6);
        sb.append(hostName);
        sb.append(':');
        sb.append(Integer.toString(port));
        return new BasicHttpRequest("CONNECT", sb.toString(), HttpProtocolParams.getVersion(this.params));
    }

    /* access modifiers changed from: protected */
    public RoutedRequest handleResponse(RoutedRequest routedRequest, HttpResponse httpResponse, HttpContext httpContext) {
        HttpRoute route = routedRequest.getRoute();
        RequestWrapper request = routedRequest.getRequest();
        HttpParams params2 = request.getParams();
        if (HttpClientParams.isAuthenticating(params2)) {
            HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
            if (httpHost == null) {
                httpHost = route.getTargetHost();
            }
            if (httpHost.getPort() < 0) {
                httpHost = new HttpHost(httpHost.getHostName(), this.connManager.getSchemeRegistry().getScheme(httpHost).getDefaultPort(), httpHost.getSchemeName());
            }
            boolean isAuthenticationRequested = this.authenticator.isAuthenticationRequested(httpHost, httpResponse, this.targetAuthStrategy, this.targetAuthState, httpContext);
            HttpHost proxyHost = route.getProxyHost();
            if (proxyHost == null) {
                proxyHost = route.getTargetHost();
            }
            boolean isAuthenticationRequested2 = this.authenticator.isAuthenticationRequested(proxyHost, httpResponse, this.proxyAuthStrategy, this.proxyAuthState, httpContext);
            if (isAuthenticationRequested && this.authenticator.authenticate(httpHost, httpResponse, this.targetAuthStrategy, this.targetAuthState, httpContext)) {
                return routedRequest;
            }
            if (isAuthenticationRequested2 && this.authenticator.authenticate(proxyHost, httpResponse, this.proxyAuthStrategy, this.proxyAuthState, httpContext)) {
                return routedRequest;
            }
        }
        if (!HttpClientParams.isRedirecting(params2) || !this.redirectStrategy.isRedirected(request, httpResponse, httpContext)) {
            return null;
        }
        if (this.redirectCount >= this.maxRedirects) {
            throw new RedirectException("Maximum redirects (" + this.maxRedirects + ") exceeded");
        }
        this.redirectCount++;
        this.virtualHost = null;
        HttpUriRequest redirect = this.redirectStrategy.getRedirect(request, httpResponse, httpContext);
        redirect.setHeaders(request.getOriginal().getAllHeaders());
        URI uri = redirect.getURI();
        HttpHost extractHost = URIUtils.extractHost(uri);
        if (extractHost == null) {
            throw new ProtocolException("Redirect URI does not specify a valid host name: " + uri);
        }
        if (!route.getTargetHost().equals(extractHost)) {
            this.log.debug("Resetting target auth state");
            this.targetAuthState.reset();
            AuthScheme authScheme = this.proxyAuthState.getAuthScheme();
            if (authScheme != null && authScheme.isConnectionBased()) {
                this.log.debug("Resetting proxy auth state");
                this.proxyAuthState.reset();
            }
        }
        RequestWrapper wrapRequest = wrapRequest(redirect);
        wrapRequest.setParams(params2);
        HttpRoute determineRoute = determineRoute(extractHost, wrapRequest, httpContext);
        RoutedRequest routedRequest2 = new RoutedRequest(wrapRequest, determineRoute);
        if (this.log.isDebugEnabled()) {
            this.log.debug("Redirecting to '" + uri + "' via " + determineRoute);
        }
        return routedRequest2;
    }

    private void abortConnection() {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection != null) {
            this.managedConn = null;
            try {
                managedClientConnection.abortConnection();
            } catch (IOException e) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug(e.getMessage(), e);
                }
            }
            try {
                managedClientConnection.releaseConnection();
            } catch (IOException e2) {
                this.log.debug("Error releasing connection", e2);
            }
        }
    }
}
