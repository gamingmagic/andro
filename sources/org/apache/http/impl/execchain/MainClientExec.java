package org.apache.http.impl.execchain;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.NonRepeatableRequestException;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.ConnectionRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRouteDirector;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.auth.HttpAuthenticator;
import org.apache.http.impl.conn.ConnectionShutdownException;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
public class MainClientExec implements ClientExecChain {
    private final HttpAuthenticator authenticator;
    private final HttpClientConnectionManager connManager;
    private final ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log;
    private final AuthenticationStrategy proxyAuthStrategy;
    private final HttpProcessor proxyHttpProcessor;
    private final HttpRequestExecutor requestExecutor;
    private final ConnectionReuseStrategy reuseStrategy;
    private final HttpRouteDirector routeDirector;
    private final AuthenticationStrategy targetAuthStrategy;
    private final UserTokenHandler userTokenHandler;

    public MainClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpProcessor httpProcessor, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler2) {
        this.log = LogFactory.getLog(getClass());
        Args.notNull(httpRequestExecutor, "HTTP request executor");
        Args.notNull(httpClientConnectionManager, "Client connection manager");
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        Args.notNull(connectionKeepAliveStrategy, "Connection keep alive strategy");
        Args.notNull(httpProcessor, "Proxy HTTP processor");
        Args.notNull(authenticationStrategy, "Target authentication strategy");
        Args.notNull(authenticationStrategy2, "Proxy authentication strategy");
        Args.notNull(userTokenHandler2, "User token handler");
        this.authenticator = new HttpAuthenticator();
        this.routeDirector = new BasicRouteDirector();
        this.requestExecutor = httpRequestExecutor;
        this.connManager = httpClientConnectionManager;
        this.reuseStrategy = connectionReuseStrategy;
        this.keepAliveStrategy = connectionKeepAliveStrategy;
        this.proxyHttpProcessor = httpProcessor;
        this.targetAuthStrategy = authenticationStrategy;
        this.proxyAuthStrategy = authenticationStrategy2;
        this.userTokenHandler = userTokenHandler2;
    }

    public MainClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler2) {
        this(httpRequestExecutor, httpClientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, new ImmutableHttpProcessor(new RequestTargetHost()), authenticationStrategy, authenticationStrategy2, userTokenHandler2);
    }

    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) {
        HttpResponse httpResponse;
        String str;
        Args.notNull(httpRoute, "HTTP route");
        Args.notNull(httpRequestWrapper, "HTTP request");
        Args.notNull(httpClientContext, "HTTP context");
        AuthState targetAuthState = httpClientContext.getTargetAuthState();
        if (targetAuthState == null) {
            targetAuthState = new AuthState();
            httpClientContext.setAttribute("http.auth.target-scope", targetAuthState);
        }
        AuthState proxyAuthState = httpClientContext.getProxyAuthState();
        if (proxyAuthState == null) {
            proxyAuthState = new AuthState();
            httpClientContext.setAttribute("http.auth.proxy-scope", proxyAuthState);
        }
        if (httpRequestWrapper instanceof HttpEntityEnclosingRequest) {
            RequestEntityProxy.enhance((HttpEntityEnclosingRequest) httpRequestWrapper);
        }
        Object userToken = httpClientContext.getUserToken();
        ConnectionRequest requestConnection = this.connManager.requestConnection(httpRoute, userToken);
        if (httpExecutionAware != null) {
            if (httpExecutionAware.isAborted()) {
                requestConnection.cancel();
                throw new RequestAbortedException("Request aborted");
            }
            httpExecutionAware.setCancellable(requestConnection);
        }
        RequestConfig requestConfig = httpClientContext.getRequestConfig();
        try {
            int connectionRequestTimeout = requestConfig.getConnectionRequestTimeout();
            HttpClientConnection httpClientConnection = requestConnection.get(connectionRequestTimeout > 0 ? (long) connectionRequestTimeout : 0, TimeUnit.MILLISECONDS);
            httpClientContext.setAttribute("http.connection", httpClientConnection);
            if (requestConfig.isStaleConnectionCheckEnabled() && httpClientConnection.isOpen()) {
                this.log.debug("Stale connection check");
                if (httpClientConnection.isStale()) {
                    this.log.debug("Stale connection detected");
                    httpClientConnection.close();
                }
            }
            ConnectionHolder connectionHolder = new ConnectionHolder(this.log, this.connManager, httpClientConnection);
            if (httpExecutionAware != null) {
                try {
                    httpExecutionAware.setCancellable(connectionHolder);
                } catch (ConnectionShutdownException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Connection has been shut down");
                    interruptedIOException.initCause(e);
                    throw interruptedIOException;
                } catch (HttpException e2) {
                    connectionHolder.abortConnection();
                    throw e2;
                } catch (IOException e3) {
                    connectionHolder.abortConnection();
                    if (proxyAuthState.isConnectionBased()) {
                        proxyAuthState.reset();
                    }
                    if (targetAuthState.isConnectionBased()) {
                        targetAuthState.reset();
                    }
                    throw e3;
                } catch (RuntimeException e4) {
                    connectionHolder.abortConnection();
                    if (proxyAuthState.isConnectionBased()) {
                        proxyAuthState.reset();
                    }
                    if (targetAuthState.isConnectionBased()) {
                        targetAuthState.reset();
                    }
                    throw e4;
                } catch (Error e5) {
                    this.connManager.shutdown();
                    throw e5;
                }
            }
            int i = 1;
            while (true) {
                if (i > 1 && !RequestEntityProxy.isRepeatable(httpRequestWrapper)) {
                    throw new NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity.");
                } else if (httpExecutionAware == null || !httpExecutionAware.isAborted()) {
                    if (!httpClientConnection.isOpen()) {
                        this.log.debug("Opening connection " + httpRoute);
                        try {
                            establishRoute(proxyAuthState, httpClientConnection, httpRoute, httpRequestWrapper, httpClientContext);
                        } catch (TunnelRefusedException e6) {
                            if (this.log.isDebugEnabled()) {
                                this.log.debug(e6.getMessage());
                            }
                            httpResponse = e6.getResponse();
                        }
                    }
                    int socketTimeout = requestConfig.getSocketTimeout();
                    if (socketTimeout >= 0) {
                        httpClientConnection.setSocketTimeout(socketTimeout);
                    }
                    if (httpExecutionAware == null || !httpExecutionAware.isAborted()) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Executing request " + httpRequestWrapper.getRequestLine());
                        }
                        if (!httpRequestWrapper.containsHeader("Authorization")) {
                            if (this.log.isDebugEnabled()) {
                                this.log.debug("Target auth state: " + targetAuthState.getState());
                            }
                            this.authenticator.generateAuthResponse(httpRequestWrapper, targetAuthState, httpClientContext);
                        }
                        if (!httpRequestWrapper.containsHeader("Proxy-Authorization") && !httpRoute.isTunnelled()) {
                            if (this.log.isDebugEnabled()) {
                                this.log.debug("Proxy auth state: " + proxyAuthState.getState());
                            }
                            this.authenticator.generateAuthResponse(httpRequestWrapper, proxyAuthState, httpClientContext);
                        }
                        httpResponse = this.requestExecutor.execute(httpRequestWrapper, httpClientConnection, httpClientContext);
                        if (this.reuseStrategy.keepAlive(httpResponse, httpClientContext)) {
                            long keepAliveDuration = this.keepAliveStrategy.getKeepAliveDuration(httpResponse, httpClientContext);
                            if (this.log.isDebugEnabled()) {
                                if (keepAliveDuration > 0) {
                                    str = "for " + keepAliveDuration + " " + TimeUnit.MILLISECONDS;
                                } else {
                                    str = "indefinitely";
                                }
                                this.log.debug("Connection can be kept alive " + str);
                            }
                            connectionHolder.setValidFor(keepAliveDuration, TimeUnit.MILLISECONDS);
                            connectionHolder.markReusable();
                        } else {
                            connectionHolder.markNonReusable();
                        }
                        if (!needAuthentication(targetAuthState, proxyAuthState, httpRoute, httpResponse, httpClientContext)) {
                            break;
                        }
                        HttpEntity entity = httpResponse.getEntity();
                        if (connectionHolder.isReusable()) {
                            EntityUtils.consume(entity);
                        } else {
                            httpClientConnection.close();
                            if (proxyAuthState.getState() == AuthProtocolState.SUCCESS && proxyAuthState.isConnectionBased()) {
                                this.log.debug("Resetting proxy auth state");
                                proxyAuthState.reset();
                            }
                            if (targetAuthState.getState() == AuthProtocolState.SUCCESS && targetAuthState.isConnectionBased()) {
                                this.log.debug("Resetting target auth state");
                                targetAuthState.reset();
                            }
                        }
                        HttpRequest original = httpRequestWrapper.getOriginal();
                        if (!original.containsHeader("Authorization")) {
                            httpRequestWrapper.removeHeaders("Authorization");
                        }
                        if (!original.containsHeader("Proxy-Authorization")) {
                            httpRequestWrapper.removeHeaders("Proxy-Authorization");
                        }
                        i++;
                    } else {
                        throw new RequestAbortedException("Request aborted");
                    }
                } else {
                    throw new RequestAbortedException("Request aborted");
                }
            }
            if (userToken == null) {
                userToken = this.userTokenHandler.getUserToken(httpClientContext);
                httpClientContext.setAttribute("http.user-token", userToken);
            }
            if (userToken != null) {
                connectionHolder.setState(userToken);
            }
            HttpEntity entity2 = httpResponse.getEntity();
            if (entity2 != null && entity2.isStreaming()) {
                return new HttpResponseProxy(httpResponse, connectionHolder);
            }
            connectionHolder.releaseConnection();
            return new HttpResponseProxy(httpResponse, null);
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            throw new RequestAbortedException("Request aborted", e7);
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (cause == 0) {
                cause = e8;
            }
            throw new RequestAbortedException("Request execution failed", cause);
        }
    }

    /* access modifiers changed from: 0000 */
    public void establishRoute(AuthState authState, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, HttpClientContext httpClientContext) {
        int nextStep;
        int connectTimeout = httpClientContext.getRequestConfig().getConnectTimeout();
        RouteTracker routeTracker = new RouteTracker(httpRoute);
        do {
            HttpRoute route = routeTracker.toRoute();
            nextStep = this.routeDirector.nextStep(httpRoute, route);
            switch (nextStep) {
                case -1:
                    throw new HttpException("Unable to establish route: planned = " + httpRoute + "; current = " + route);
                case 0:
                    this.connManager.routeComplete(httpClientConnection, httpRoute, httpClientContext);
                    continue;
                case 1:
                    this.connManager.connect(httpClientConnection, httpRoute, connectTimeout > 0 ? connectTimeout : 0, httpClientContext);
                    routeTracker.connectTarget(httpRoute.isSecure());
                    continue;
                case 2:
                    this.connManager.connect(httpClientConnection, httpRoute, connectTimeout > 0 ? connectTimeout : 0, httpClientContext);
                    routeTracker.connectProxy(httpRoute.getProxyHost(), false);
                    continue;
                case 3:
                    boolean createTunnelToTarget = createTunnelToTarget(authState, httpClientConnection, httpRoute, httpRequest, httpClientContext);
                    this.log.debug("Tunnel to target created.");
                    routeTracker.tunnelTarget(createTunnelToTarget);
                    continue;
                case 4:
                    int hopCount = route.getHopCount() - 1;
                    boolean createTunnelToProxy = createTunnelToProxy(httpRoute, hopCount, httpClientContext);
                    this.log.debug("Tunnel to proxy created.");
                    routeTracker.tunnelProxy(httpRoute.getHopTarget(hopCount), createTunnelToProxy);
                    continue;
                case 5:
                    this.connManager.upgrade(httpClientConnection, httpRoute, httpClientContext);
                    routeTracker.layerProtocol(httpRoute.isSecure());
                    continue;
                default:
                    throw new IllegalStateException("Unknown step indicator " + nextStep + " from RouteDirector.");
            }
        } while (nextStep > 0);
    }

    private boolean createTunnelToTarget(AuthState authState, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, HttpClientContext httpClientContext) {
        RequestConfig requestConfig = httpClientContext.getRequestConfig();
        int connectTimeout = requestConfig.getConnectTimeout();
        HttpHost targetHost = httpRoute.getTargetHost();
        HttpHost proxyHost = httpRoute.getProxyHost();
        HttpResponse httpResponse = null;
        BasicHttpRequest basicHttpRequest = new BasicHttpRequest("CONNECT", targetHost.toHostString(), httpRequest.getProtocolVersion());
        this.requestExecutor.preProcess(basicHttpRequest, this.proxyHttpProcessor, httpClientContext);
        while (httpResponse == null) {
            if (!httpClientConnection.isOpen()) {
                this.connManager.connect(httpClientConnection, httpRoute, connectTimeout > 0 ? connectTimeout : 0, httpClientContext);
            }
            basicHttpRequest.removeHeaders("Proxy-Authorization");
            this.authenticator.generateAuthResponse(basicHttpRequest, authState, httpClientContext);
            httpResponse = this.requestExecutor.execute(basicHttpRequest, httpClientConnection, httpClientContext);
            this.requestExecutor.postProcess(httpResponse, this.proxyHttpProcessor, httpClientContext);
            if (httpResponse.getStatusLine().getStatusCode() < 200) {
                throw new HttpException("Unexpected response to CONNECT request: " + httpResponse.getStatusLine());
            } else if (requestConfig.isAuthenticationEnabled() && this.authenticator.isAuthenticationRequested(proxyHost, httpResponse, this.proxyAuthStrategy, authState, httpClientContext) && this.authenticator.handleAuthChallenge(proxyHost, httpResponse, this.proxyAuthStrategy, authState, httpClientContext)) {
                if (this.reuseStrategy.keepAlive(httpResponse, httpClientContext)) {
                    this.log.debug("Connection kept alive");
                    EntityUtils.consume(httpResponse.getEntity());
                } else {
                    httpClientConnection.close();
                }
                httpResponse = null;
            }
        }
        if (httpResponse.getStatusLine().getStatusCode() <= 299) {
            return false;
        }
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null) {
            httpResponse.setEntity(new BufferedHttpEntity(entity));
        }
        httpClientConnection.close();
        throw new TunnelRefusedException("CONNECT refused by proxy: " + httpResponse.getStatusLine(), httpResponse);
    }

    private boolean createTunnelToProxy(HttpRoute httpRoute, int i, HttpClientContext httpClientContext) {
        throw new HttpException("Proxy chains are not supported.");
    }

    private boolean needAuthentication(AuthState authState, AuthState authState2, HttpRoute httpRoute, HttpResponse httpResponse, HttpClientContext httpClientContext) {
        if (httpClientContext.getRequestConfig().isAuthenticationEnabled()) {
            HttpHost targetHost = httpClientContext.getTargetHost();
            if (targetHost == null) {
                targetHost = httpRoute.getTargetHost();
            }
            if (targetHost.getPort() < 0) {
                targetHost = new HttpHost(targetHost.getHostName(), httpRoute.getTargetHost().getPort(), targetHost.getSchemeName());
            }
            boolean isAuthenticationRequested = this.authenticator.isAuthenticationRequested(targetHost, httpResponse, this.targetAuthStrategy, authState, httpClientContext);
            HttpHost proxyHost = httpRoute.getProxyHost();
            if (proxyHost == null) {
                proxyHost = httpRoute.getTargetHost();
            }
            boolean isAuthenticationRequested2 = this.authenticator.isAuthenticationRequested(proxyHost, httpResponse, this.proxyAuthStrategy, authState2, httpClientContext);
            if (isAuthenticationRequested) {
                return this.authenticator.handleAuthChallenge(targetHost, httpResponse, this.targetAuthStrategy, authState, httpClientContext);
            }
            if (isAuthenticationRequested2) {
                return this.authenticator.handleAuthChallenge(proxyHost, httpResponse, this.proxyAuthStrategy, authState2, httpClientContext);
            }
        }
        return false;
    }
}
