package org.apache.http.impl.client;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.BackoffManager;
import org.apache.http.client.ConnectionBackoffStrategy;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.InputStreamFactory;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.Lookup;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.impl.execchain.ClientExecChain;
import org.apache.http.impl.execchain.MainClientExec;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.util.TextUtils;

public class HttpClientBuilder {
    private boolean authCachingDisabled;
    private Lookup<AuthSchemeProvider> authSchemeRegistry;
    private boolean automaticRetriesDisabled;
    private BackoffManager backoffManager;
    private List<Closeable> closeables;
    private HttpClientConnectionManager connManager;
    private boolean connManagerShared;
    private long connTimeToLive = -1;
    private TimeUnit connTimeToLiveTimeUnit = TimeUnit.MILLISECONDS;
    private ConnectionBackoffStrategy connectionBackoffStrategy;
    private boolean connectionStateDisabled;
    private boolean contentCompressionDisabled;
    private Map<String, InputStreamFactory> contentDecoderMap;
    private boolean cookieManagementDisabled;
    private Lookup<CookieSpecProvider> cookieSpecRegistry;
    private CookieStore cookieStore;
    private CredentialsProvider credentialsProvider;
    private ConnectionConfig defaultConnectionConfig;
    private Collection<? extends Header> defaultHeaders;
    private RequestConfig defaultRequestConfig;
    private SocketConfig defaultSocketConfig;
    private DnsResolver dnsResolver;
    private boolean evictExpiredConnections;
    private boolean evictIdleConnections;
    private HostnameVerifier hostnameVerifier;
    private HttpProcessor httpprocessor;
    private ConnectionKeepAliveStrategy keepAliveStrategy;
    private int maxConnPerRoute = 0;
    private int maxConnTotal = 0;
    private long maxIdleTime;
    private TimeUnit maxIdleTimeUnit;
    private HttpHost proxy;
    private AuthenticationStrategy proxyAuthStrategy;
    private PublicSuffixMatcher publicSuffixMatcher;
    private boolean redirectHandlingDisabled;
    private RedirectStrategy redirectStrategy;
    private HttpRequestExecutor requestExec;
    private LinkedList<HttpRequestInterceptor> requestFirst;
    private LinkedList<HttpRequestInterceptor> requestLast;
    private LinkedList<HttpResponseInterceptor> responseFirst;
    private LinkedList<HttpResponseInterceptor> responseLast;
    private HttpRequestRetryHandler retryHandler;
    private ConnectionReuseStrategy reuseStrategy;
    private HttpRoutePlanner routePlanner;
    private SchemePortResolver schemePortResolver;
    private ServiceUnavailableRetryStrategy serviceUnavailStrategy;
    private SSLContext sslContext;
    private LayeredConnectionSocketFactory sslSocketFactory;
    private boolean systemProperties;
    private AuthenticationStrategy targetAuthStrategy;
    private String userAgent;
    private UserTokenHandler userTokenHandler;

    public static HttpClientBuilder create() {
        return new HttpClientBuilder();
    }

    protected HttpClientBuilder() {
    }

    public final HttpClientBuilder setRequestExecutor(HttpRequestExecutor httpRequestExecutor) {
        this.requestExec = httpRequestExecutor;
        return this;
    }

    @Deprecated
    public final HttpClientBuilder setHostnameVerifier(X509HostnameVerifier x509HostnameVerifier) {
        this.hostnameVerifier = x509HostnameVerifier;
        return this;
    }

    public final HttpClientBuilder setSSLHostnameVerifier(HostnameVerifier hostnameVerifier2) {
        this.hostnameVerifier = hostnameVerifier2;
        return this;
    }

    public final HttpClientBuilder setPublicSuffixMatcher(PublicSuffixMatcher publicSuffixMatcher2) {
        this.publicSuffixMatcher = publicSuffixMatcher2;
        return this;
    }

    @Deprecated
    public final HttpClientBuilder setSslcontext(SSLContext sSLContext) {
        return setSSLContext(sSLContext);
    }

    public final HttpClientBuilder setSSLContext(SSLContext sSLContext) {
        this.sslContext = sSLContext;
        return this;
    }

    public final HttpClientBuilder setSSLSocketFactory(LayeredConnectionSocketFactory layeredConnectionSocketFactory) {
        this.sslSocketFactory = layeredConnectionSocketFactory;
        return this;
    }

    public final HttpClientBuilder setMaxConnTotal(int i) {
        this.maxConnTotal = i;
        return this;
    }

    public final HttpClientBuilder setMaxConnPerRoute(int i) {
        this.maxConnPerRoute = i;
        return this;
    }

    public final HttpClientBuilder setDefaultSocketConfig(SocketConfig socketConfig) {
        this.defaultSocketConfig = socketConfig;
        return this;
    }

    public final HttpClientBuilder setDefaultConnectionConfig(ConnectionConfig connectionConfig) {
        this.defaultConnectionConfig = connectionConfig;
        return this;
    }

    public final HttpClientBuilder setConnectionTimeToLive(long j, TimeUnit timeUnit) {
        this.connTimeToLive = j;
        this.connTimeToLiveTimeUnit = timeUnit;
        return this;
    }

    public final HttpClientBuilder setConnectionManager(HttpClientConnectionManager httpClientConnectionManager) {
        this.connManager = httpClientConnectionManager;
        return this;
    }

    public final HttpClientBuilder setConnectionManagerShared(boolean z) {
        this.connManagerShared = z;
        return this;
    }

    public final HttpClientBuilder setConnectionReuseStrategy(ConnectionReuseStrategy connectionReuseStrategy) {
        this.reuseStrategy = connectionReuseStrategy;
        return this;
    }

    public final HttpClientBuilder setKeepAliveStrategy(ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        this.keepAliveStrategy = connectionKeepAliveStrategy;
        return this;
    }

    public final HttpClientBuilder setTargetAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.targetAuthStrategy = authenticationStrategy;
        return this;
    }

    public final HttpClientBuilder setProxyAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.proxyAuthStrategy = authenticationStrategy;
        return this;
    }

    public final HttpClientBuilder setUserTokenHandler(UserTokenHandler userTokenHandler2) {
        this.userTokenHandler = userTokenHandler2;
        return this;
    }

    public final HttpClientBuilder disableConnectionState() {
        this.connectionStateDisabled = true;
        return this;
    }

    public final HttpClientBuilder setSchemePortResolver(SchemePortResolver schemePortResolver2) {
        this.schemePortResolver = schemePortResolver2;
        return this;
    }

    public final HttpClientBuilder setUserAgent(String str) {
        this.userAgent = str;
        return this;
    }

    public final HttpClientBuilder setDefaultHeaders(Collection<? extends Header> collection) {
        this.defaultHeaders = collection;
        return this;
    }

    public final HttpClientBuilder addInterceptorFirst(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor == null) {
            return this;
        }
        if (this.responseFirst == null) {
            this.responseFirst = new LinkedList<>();
        }
        this.responseFirst.addFirst(httpResponseInterceptor);
        return this;
    }

    public final HttpClientBuilder addInterceptorLast(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor == null) {
            return this;
        }
        if (this.responseLast == null) {
            this.responseLast = new LinkedList<>();
        }
        this.responseLast.addLast(httpResponseInterceptor);
        return this;
    }

    public final HttpClientBuilder addInterceptorFirst(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor == null) {
            return this;
        }
        if (this.requestFirst == null) {
            this.requestFirst = new LinkedList<>();
        }
        this.requestFirst.addFirst(httpRequestInterceptor);
        return this;
    }

    public final HttpClientBuilder addInterceptorLast(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor == null) {
            return this;
        }
        if (this.requestLast == null) {
            this.requestLast = new LinkedList<>();
        }
        this.requestLast.addLast(httpRequestInterceptor);
        return this;
    }

    public final HttpClientBuilder disableCookieManagement() {
        this.cookieManagementDisabled = true;
        return this;
    }

    public final HttpClientBuilder disableContentCompression() {
        this.contentCompressionDisabled = true;
        return this;
    }

    public final HttpClientBuilder disableAuthCaching() {
        this.authCachingDisabled = true;
        return this;
    }

    public final HttpClientBuilder setHttpProcessor(HttpProcessor httpProcessor) {
        this.httpprocessor = httpProcessor;
        return this;
    }

    public final HttpClientBuilder setDnsResolver(DnsResolver dnsResolver2) {
        this.dnsResolver = dnsResolver2;
        return this;
    }

    public final HttpClientBuilder setRetryHandler(HttpRequestRetryHandler httpRequestRetryHandler) {
        this.retryHandler = httpRequestRetryHandler;
        return this;
    }

    public final HttpClientBuilder disableAutomaticRetries() {
        this.automaticRetriesDisabled = true;
        return this;
    }

    public final HttpClientBuilder setProxy(HttpHost httpHost) {
        this.proxy = httpHost;
        return this;
    }

    public final HttpClientBuilder setRoutePlanner(HttpRoutePlanner httpRoutePlanner) {
        this.routePlanner = httpRoutePlanner;
        return this;
    }

    public final HttpClientBuilder setRedirectStrategy(RedirectStrategy redirectStrategy2) {
        this.redirectStrategy = redirectStrategy2;
        return this;
    }

    public final HttpClientBuilder disableRedirectHandling() {
        this.redirectHandlingDisabled = true;
        return this;
    }

    public final HttpClientBuilder setConnectionBackoffStrategy(ConnectionBackoffStrategy connectionBackoffStrategy2) {
        this.connectionBackoffStrategy = connectionBackoffStrategy2;
        return this;
    }

    public final HttpClientBuilder setBackoffManager(BackoffManager backoffManager2) {
        this.backoffManager = backoffManager2;
        return this;
    }

    public final HttpClientBuilder setServiceUnavailableRetryStrategy(ServiceUnavailableRetryStrategy serviceUnavailableRetryStrategy) {
        this.serviceUnavailStrategy = serviceUnavailableRetryStrategy;
        return this;
    }

    public final HttpClientBuilder setDefaultCookieStore(CookieStore cookieStore2) {
        this.cookieStore = cookieStore2;
        return this;
    }

    public final HttpClientBuilder setDefaultCredentialsProvider(CredentialsProvider credentialsProvider2) {
        this.credentialsProvider = credentialsProvider2;
        return this;
    }

    public final HttpClientBuilder setDefaultAuthSchemeRegistry(Lookup<AuthSchemeProvider> lookup) {
        this.authSchemeRegistry = lookup;
        return this;
    }

    public final HttpClientBuilder setDefaultCookieSpecRegistry(Lookup<CookieSpecProvider> lookup) {
        this.cookieSpecRegistry = lookup;
        return this;
    }

    public final HttpClientBuilder setContentDecoderRegistry(Map<String, InputStreamFactory> map) {
        this.contentDecoderMap = map;
        return this;
    }

    public final HttpClientBuilder setDefaultRequestConfig(RequestConfig requestConfig) {
        this.defaultRequestConfig = requestConfig;
        return this;
    }

    public final HttpClientBuilder useSystemProperties() {
        this.systemProperties = true;
        return this;
    }

    public final HttpClientBuilder evictExpiredConnections() {
        this.evictExpiredConnections = true;
        return this;
    }

    @Deprecated
    public final HttpClientBuilder evictIdleConnections(Long l, TimeUnit timeUnit) {
        return evictIdleConnections(l.longValue(), timeUnit);
    }

    public final HttpClientBuilder evictIdleConnections(long j, TimeUnit timeUnit) {
        this.evictIdleConnections = true;
        this.maxIdleTime = j;
        this.maxIdleTimeUnit = timeUnit;
        return this;
    }

    /* access modifiers changed from: protected */
    public ClientExecChain createMainExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpProcessor httpProcessor, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler2) {
        return new MainClientExec(httpRequestExecutor, httpClientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpProcessor, authenticationStrategy, authenticationStrategy2, userTokenHandler2);
    }

    /* access modifiers changed from: protected */
    public ClientExecChain decorateMainExec(ClientExecChain clientExecChain) {
        return clientExecChain;
    }

    /* access modifiers changed from: protected */
    public ClientExecChain decorateProtocolExec(ClientExecChain clientExecChain) {
        return clientExecChain;
    }

    /* access modifiers changed from: protected */
    public void addCloseable(Closeable closeable) {
        if (closeable != null) {
            if (this.closeables == null) {
                this.closeables = new ArrayList();
            }
            this.closeables.add(closeable);
        }
    }

    private static String[] split(String str) {
        if (TextUtils.isBlank(str)) {
            return null;
        }
        return str.split(" *, *");
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [org.apache.http.conn.HttpClientConnectionManager] */
    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [org.apache.http.conn.HttpClientConnectionManager] */
    /* JADX WARNING: type inference failed for: r2v1, types: [org.apache.http.conn.HttpClientConnectionManager] */
    /* JADX WARNING: type inference failed for: r18v2 */
    /* JADX WARNING: type inference failed for: r2v2, types: [org.apache.http.conn.HttpClientConnectionManager] */
    /* JADX WARNING: type inference failed for: r1v4, types: [org.apache.http.conn.HttpClientConnectionManager] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r0v176, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARNING: type inference failed for: r16v9 */
    /* JADX WARNING: type inference failed for: r1v33, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARNING: type inference failed for: r1v34, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARNING: type inference failed for: r1v35, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 10 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.impl.client.CloseableHttpClient build() {
        /*
            r20 = this;
            r0 = r20
            org.apache.http.conn.util.PublicSuffixMatcher r10 = r0.publicSuffixMatcher
            if (r10 != 0) goto L_0x000a
            org.apache.http.conn.util.PublicSuffixMatcher r10 = org.apache.http.conn.util.PublicSuffixMatcherLoader.getDefault()
        L_0x000a:
            r0 = r20
            org.apache.http.protocol.HttpRequestExecutor r11 = r0.requestExec
            if (r11 != 0) goto L_0x0015
            org.apache.http.protocol.HttpRequestExecutor r11 = new org.apache.http.protocol.HttpRequestExecutor
            r11.<init>()
        L_0x0015:
            r0 = r20
            org.apache.http.conn.HttpClientConnectionManager r12 = r0.connManager
            if (r12 != 0) goto L_0x011b
            r0 = r20
            org.apache.http.conn.socket.LayeredConnectionSocketFactory r13 = r0.sslSocketFactory
            if (r13 != 0) goto L_0x0085
            r0 = r20
            boolean r0 = r0.systemProperties
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "https.protocols"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String[] r14 = split(r0)
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            r0 = r20
            boolean r0 = r0.systemProperties
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "https.cipherSuites"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String[] r15 = split(r0)
            goto L_0x0045
        L_0x0044:
            r15 = 0
        L_0x0045:
            r0 = r20
            javax.net.ssl.HostnameVerifier r0 = r0.hostnameVerifier
            r16 = r0
            if (r16 != 0) goto L_0x0054
            org.apache.http.conn.ssl.DefaultHostnameVerifier r16 = new org.apache.http.conn.ssl.DefaultHostnameVerifier
            r0 = r16
            r0.<init>(r10)
        L_0x0054:
            r0 = r20
            javax.net.ssl.SSLContext r0 = r0.sslContext
            if (r0 == 0) goto L_0x0066
            org.apache.http.conn.ssl.SSLConnectionSocketFactory r13 = new org.apache.http.conn.ssl.SSLConnectionSocketFactory
            r0 = r20
            javax.net.ssl.SSLContext r0 = r0.sslContext
            r1 = r16
            r13.<init>(r0, r14, r15, r1)
            goto L_0x0085
        L_0x0066:
            r0 = r20
            boolean r0 = r0.systemProperties
            if (r0 == 0) goto L_0x007a
            org.apache.http.conn.ssl.SSLConnectionSocketFactory r13 = new org.apache.http.conn.ssl.SSLConnectionSocketFactory
            javax.net.SocketFactory r0 = javax.net.ssl.SSLSocketFactory.getDefault()
            javax.net.ssl.SSLSocketFactory r0 = (javax.net.ssl.SSLSocketFactory) r0
            r1 = r16
            r13.<init>(r0, r14, r15, r1)
            goto L_0x0085
        L_0x007a:
            org.apache.http.conn.ssl.SSLConnectionSocketFactory r13 = new org.apache.http.conn.ssl.SSLConnectionSocketFactory
            javax.net.ssl.SSLContext r0 = org.apache.http.ssl.SSLContexts.createDefault()
            r1 = r16
            r13.<init>(r0, r1)
        L_0x0085:
            org.apache.http.impl.conn.PoolingHttpClientConnectionManager r14 = new org.apache.http.impl.conn.PoolingHttpClientConnectionManager
            org.apache.http.config.RegistryBuilder r1 = org.apache.http.config.RegistryBuilder.create()
            java.lang.String r2 = "http"
            org.apache.http.conn.socket.PlainConnectionSocketFactory r3 = org.apache.http.conn.socket.PlainConnectionSocketFactory.getSocketFactory()
            org.apache.http.config.RegistryBuilder r1 = r1.register(r2, r3)
            java.lang.String r2 = "https"
            org.apache.http.config.RegistryBuilder r1 = r1.register(r2, r13)
            org.apache.http.config.Registry r1 = r1.build()
            r2 = r20
            org.apache.http.conn.DnsResolver r4 = r2.dnsResolver
            r2 = r20
            long r5 = r2.connTimeToLive
            r2 = r20
            java.util.concurrent.TimeUnit r2 = r2.connTimeToLiveTimeUnit
            if (r2 == 0) goto L_0x00b2
            r2 = r20
            java.util.concurrent.TimeUnit r7 = r2.connTimeToLiveTimeUnit
            goto L_0x00b4
        L_0x00b2:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
        L_0x00b4:
            r0 = r14
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r0 = r20
            org.apache.http.config.SocketConfig r0 = r0.defaultSocketConfig
            if (r0 == 0) goto L_0x00c7
            r0 = r20
            org.apache.http.config.SocketConfig r0 = r0.defaultSocketConfig
            r14.setDefaultSocketConfig(r0)
        L_0x00c7:
            r0 = r20
            org.apache.http.config.ConnectionConfig r0 = r0.defaultConnectionConfig
            if (r0 == 0) goto L_0x00d4
            r0 = r20
            org.apache.http.config.ConnectionConfig r0 = r0.defaultConnectionConfig
            r14.setDefaultConnectionConfig(r0)
        L_0x00d4:
            r0 = r20
            boolean r0 = r0.systemProperties
            if (r0 == 0) goto L_0x0100
            java.lang.String r0 = "http.keepAlive"
            java.lang.String r1 = "true"
            java.lang.String r15 = java.lang.System.getProperty(r0, r1)
            java.lang.String r0 = "true"
            boolean r0 = r0.equalsIgnoreCase(r15)
            if (r0 == 0) goto L_0x0100
            java.lang.String r0 = "http.maxConnections"
            java.lang.String r1 = "5"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            int r16 = java.lang.Integer.parseInt(r0)
            r0 = r16
            r14.setDefaultMaxPerRoute(r0)
            int r0 = r16 * 2
            r14.setMaxTotal(r0)
        L_0x0100:
            r0 = r20
            int r0 = r0.maxConnTotal
            if (r0 <= 0) goto L_0x010d
            r0 = r20
            int r0 = r0.maxConnTotal
            r14.setMaxTotal(r0)
        L_0x010d:
            r0 = r20
            int r0 = r0.maxConnPerRoute
            if (r0 <= 0) goto L_0x011a
            r0 = r20
            int r0 = r0.maxConnPerRoute
            r14.setDefaultMaxPerRoute(r0)
        L_0x011a:
            r12 = r14
        L_0x011b:
            r0 = r20
            org.apache.http.ConnectionReuseStrategy r13 = r0.reuseStrategy
            if (r13 != 0) goto L_0x013c
            r0 = r20
            boolean r0 = r0.systemProperties
            if (r0 == 0) goto L_0x013a
            java.lang.String r0 = "http.keepAlive"
            java.lang.String r1 = "true"
            java.lang.String r14 = java.lang.System.getProperty(r0, r1)
            java.lang.String r0 = "true"
            boolean r0 = r0.equalsIgnoreCase(r14)
            if (r0 != 0) goto L_0x013a
            org.apache.http.impl.NoConnectionReuseStrategy r13 = org.apache.http.impl.NoConnectionReuseStrategy.INSTANCE
            goto L_0x013c
        L_0x013a:
            org.apache.http.impl.client.DefaultClientConnectionReuseStrategy r13 = org.apache.http.impl.client.DefaultClientConnectionReuseStrategy.INSTANCE
        L_0x013c:
            r0 = r20
            org.apache.http.conn.ConnectionKeepAliveStrategy r14 = r0.keepAliveStrategy
            if (r14 != 0) goto L_0x0144
            org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy r14 = org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy.INSTANCE
        L_0x0144:
            r0 = r20
            org.apache.http.client.AuthenticationStrategy r15 = r0.targetAuthStrategy
            if (r15 != 0) goto L_0x014c
            org.apache.http.impl.client.TargetAuthenticationStrategy r15 = org.apache.http.impl.client.TargetAuthenticationStrategy.INSTANCE
        L_0x014c:
            r0 = r20
            org.apache.http.client.AuthenticationStrategy r0 = r0.proxyAuthStrategy
            r16 = r0
            if (r16 != 0) goto L_0x0156
            org.apache.http.impl.client.ProxyAuthenticationStrategy r16 = org.apache.http.impl.client.ProxyAuthenticationStrategy.INSTANCE
        L_0x0156:
            r0 = r20
            org.apache.http.client.UserTokenHandler r0 = r0.userTokenHandler
            r17 = r0
            if (r17 != 0) goto L_0x0169
            r0 = r20
            boolean r0 = r0.connectionStateDisabled
            if (r0 != 0) goto L_0x0167
            org.apache.http.impl.client.DefaultUserTokenHandler r17 = org.apache.http.impl.client.DefaultUserTokenHandler.INSTANCE
            goto L_0x0169
        L_0x0167:
            org.apache.http.impl.client.NoopUserTokenHandler r17 = org.apache.http.impl.client.NoopUserTokenHandler.INSTANCE
        L_0x0169:
            r0 = r20
            java.lang.String r0 = r0.userAgent
            r18 = r0
            if (r18 != 0) goto L_0x018d
            r0 = r20
            boolean r0 = r0.systemProperties
            if (r0 == 0) goto L_0x017d
            java.lang.String r0 = "http.agent"
            java.lang.String r18 = java.lang.System.getProperty(r0)
        L_0x017d:
            if (r18 != 0) goto L_0x018d
            java.lang.String r0 = "Apache-HttpClient"
            java.lang.String r1 = "org.apache.http.client"
            r2 = r20
            java.lang.Class r2 = r2.getClass()
            java.lang.String r18 = org.apache.http.util.VersionInfo.getUserAgent(r0, r1, r2)
        L_0x018d:
            r0 = r20
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            org.apache.http.protocol.ImmutableHttpProcessor r5 = new org.apache.http.protocol.ImmutableHttpProcessor
            r6 = 2
            org.apache.http.HttpRequestInterceptor[] r6 = new org.apache.http.HttpRequestInterceptor[r6]
            org.apache.http.protocol.RequestTargetHost r7 = new org.apache.http.protocol.RequestTargetHost
            r7.<init>()
            r8 = 0
            r6[r8] = r7
            org.apache.http.protocol.RequestUserAgent r7 = new org.apache.http.protocol.RequestUserAgent
            r8 = r18
            r7.<init>(r8)
            r8 = 1
            r6[r8] = r7
            r5.<init>(r6)
            r6 = r15
            r7 = r16
            r8 = r17
            org.apache.http.impl.execchain.ClientExecChain r11 = r0.createMainExec(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r20
            org.apache.http.impl.execchain.ClientExecChain r11 = r0.decorateMainExec(r11)
            r0 = r20
            org.apache.http.protocol.HttpProcessor r13 = r0.httpprocessor
            if (r13 != 0) goto L_0x032a
            org.apache.http.protocol.HttpProcessorBuilder r13 = org.apache.http.protocol.HttpProcessorBuilder.create()
            r0 = r20
            java.util.LinkedList<org.apache.http.HttpRequestInterceptor> r0 = r0.requestFirst
            if (r0 == 0) goto L_0x01e5
            r0 = r20
            java.util.LinkedList<org.apache.http.HttpRequestInterceptor> r0 = r0.requestFirst
            java.util.Iterator r14 = r0.iterator()
        L_0x01d4:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01e5
            java.lang.Object r0 = r14.next()
            org.apache.http.HttpRequestInterceptor r0 = (org.apache.http.HttpRequestInterceptor) r0
            r15 = r0
            r13.addFirst(r15)
            goto L_0x01d4
        L_0x01e5:
            r0 = r20
            java.util.LinkedList<org.apache.http.HttpResponseInterceptor> r0 = r0.responseFirst
            if (r0 == 0) goto L_0x0204
            r0 = r20
            java.util.LinkedList<org.apache.http.HttpResponseInterceptor> r0 = r0.responseFirst
            java.util.Iterator r14 = r0.iterator()
        L_0x01f3:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0204
            java.lang.Object r0 = r14.next()
            org.apache.http.HttpResponseInterceptor r0 = (org.apache.http.HttpResponseInterceptor) r0
            r15 = r0
            r13.addFirst(r15)
            goto L_0x01f3
        L_0x0204:
            r0 = 6
            org.apache.http.HttpRequestInterceptor[] r0 = new org.apache.http.HttpRequestInterceptor[r0]
            org.apache.http.client.protocol.RequestDefaultHeaders r1 = new org.apache.http.client.protocol.RequestDefaultHeaders
            r2 = r20
            java.util.Collection<? extends org.apache.http.Header> r2 = r2.defaultHeaders
            r1.<init>(r2)
            r2 = 0
            r0[r2] = r1
            org.apache.http.protocol.RequestContent r1 = new org.apache.http.protocol.RequestContent
            r1.<init>()
            r2 = 1
            r0[r2] = r1
            org.apache.http.protocol.RequestTargetHost r1 = new org.apache.http.protocol.RequestTargetHost
            r1.<init>()
            r2 = 2
            r0[r2] = r1
            org.apache.http.client.protocol.RequestClientConnControl r1 = new org.apache.http.client.protocol.RequestClientConnControl
            r1.<init>()
            r2 = 3
            r0[r2] = r1
            org.apache.http.protocol.RequestUserAgent r1 = new org.apache.http.protocol.RequestUserAgent
            r2 = r18
            r1.<init>(r2)
            r2 = 4
            r0[r2] = r1
            org.apache.http.client.protocol.RequestExpectContinue r1 = new org.apache.http.client.protocol.RequestExpectContinue
            r1.<init>()
            r2 = 5
            r0[r2] = r1
            r13.addAll(r0)
            r0 = r20
            boolean r0 = r0.cookieManagementDisabled
            if (r0 != 0) goto L_0x024e
            org.apache.http.client.protocol.RequestAddCookies r0 = new org.apache.http.client.protocol.RequestAddCookies
            r0.<init>()
            r13.add(r0)
        L_0x024e:
            r0 = r20
            boolean r0 = r0.contentCompressionDisabled
            if (r0 != 0) goto L_0x027b
            r0 = r20
            java.util.Map<java.lang.String, org.apache.http.client.entity.InputStreamFactory> r0 = r0.contentDecoderMap
            if (r0 == 0) goto L_0x0273
            java.util.ArrayList r14 = new java.util.ArrayList
            r0 = r20
            java.util.Map<java.lang.String, org.apache.http.client.entity.InputStreamFactory> r0 = r0.contentDecoderMap
            java.util.Set r0 = r0.keySet()
            r14.<init>(r0)
            java.util.Collections.sort(r14)
            org.apache.http.client.protocol.RequestAcceptEncoding r0 = new org.apache.http.client.protocol.RequestAcceptEncoding
            r0.<init>(r14)
            r13.add(r0)
            goto L_0x027b
        L_0x0273:
            org.apache.http.client.protocol.RequestAcceptEncoding r0 = new org.apache.http.client.protocol.RequestAcceptEncoding
            r0.<init>()
            r13.add(r0)
        L_0x027b:
            r0 = r20
            boolean r0 = r0.authCachingDisabled
            if (r0 != 0) goto L_0x0289
            org.apache.http.client.protocol.RequestAuthCache r0 = new org.apache.http.client.protocol.RequestAuthCache
            r0.<init>()
            r13.add(r0)
        L_0x0289:
            r0 = r20
            boolean r0 = r0.cookieManagementDisabled
            if (r0 != 0) goto L_0x0297
            org.apache.http.client.protocol.ResponseProcessCookies r0 = new org.apache.http.client.protocol.ResponseProcessCookies
            r0.<init>()
            r13.add(r0)
        L_0x0297:
            r0 = r20
            boolean r0 = r0.contentCompressionDisabled
            if (r0 != 0) goto L_0x02e8
            r0 = r20
            java.util.Map<java.lang.String, org.apache.http.client.entity.InputStreamFactory> r0 = r0.contentDecoderMap
            if (r0 == 0) goto L_0x02e0
            org.apache.http.config.RegistryBuilder r14 = org.apache.http.config.RegistryBuilder.create()
            r0 = r20
            java.util.Map<java.lang.String, org.apache.http.client.entity.InputStreamFactory> r0 = r0.contentDecoderMap
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r15 = r0.iterator()
        L_0x02b3:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x02d3
            java.lang.Object r0 = r15.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r16 = r0
            r0 = r16
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r1 = r16
            java.lang.Object r1 = r1.getValue()
            r14.register(r0, r1)
            goto L_0x02b3
        L_0x02d3:
            org.apache.http.client.protocol.ResponseContentEncoding r0 = new org.apache.http.client.protocol.ResponseContentEncoding
            org.apache.http.config.Registry r1 = r14.build()
            r0.<init>(r1)
            r13.add(r0)
            goto L_0x02e8
        L_0x02e0:
            org.apache.http.client.protocol.ResponseContentEncoding r0 = new org.apache.http.client.protocol.ResponseContentEncoding
            r0.<init>()
            r13.add(r0)
        L_0x02e8:
            r0 = r20
            java.util.LinkedList<org.apache.http.HttpRequestInterceptor> r0 = r0.requestLast
            if (r0 == 0) goto L_0x0307
            r0 = r20
            java.util.LinkedList<org.apache.http.HttpRequestInterceptor> r0 = r0.requestLast
            java.util.Iterator r14 = r0.iterator()
        L_0x02f6:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0307
            java.lang.Object r0 = r14.next()
            org.apache.http.HttpRequestInterceptor r0 = (org.apache.http.HttpRequestInterceptor) r0
            r15 = r0
            r13.addLast(r15)
            goto L_0x02f6
        L_0x0307:
            r0 = r20
            java.util.LinkedList<org.apache.http.HttpResponseInterceptor> r0 = r0.responseLast
            if (r0 == 0) goto L_0x0326
            r0 = r20
            java.util.LinkedList<org.apache.http.HttpResponseInterceptor> r0 = r0.responseLast
            java.util.Iterator r14 = r0.iterator()
        L_0x0315:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0326
            java.lang.Object r0 = r14.next()
            org.apache.http.HttpResponseInterceptor r0 = (org.apache.http.HttpResponseInterceptor) r0
            r15 = r0
            r13.addLast(r15)
            goto L_0x0315
        L_0x0326:
            org.apache.http.protocol.HttpProcessor r13 = r13.build()
        L_0x032a:
            org.apache.http.impl.execchain.ProtocolExec r0 = new org.apache.http.impl.execchain.ProtocolExec
            r0.<init>(r11, r13)
            r11 = r0
            r0 = r20
            org.apache.http.impl.execchain.ClientExecChain r11 = r0.decorateProtocolExec(r11)
            r0 = r20
            boolean r0 = r0.automaticRetriesDisabled
            if (r0 != 0) goto L_0x034a
            r0 = r20
            org.apache.http.client.HttpRequestRetryHandler r13 = r0.retryHandler
            if (r13 != 0) goto L_0x0344
            org.apache.http.impl.client.DefaultHttpRequestRetryHandler r13 = org.apache.http.impl.client.DefaultHttpRequestRetryHandler.INSTANCE
        L_0x0344:
            org.apache.http.impl.execchain.RetryExec r0 = new org.apache.http.impl.execchain.RetryExec
            r0.<init>(r11, r13)
            r11 = r0
        L_0x034a:
            r0 = r20
            org.apache.http.conn.routing.HttpRoutePlanner r13 = r0.routePlanner
            if (r13 != 0) goto L_0x037d
            r0 = r20
            org.apache.http.conn.SchemePortResolver r14 = r0.schemePortResolver
            if (r14 != 0) goto L_0x0358
            org.apache.http.impl.conn.DefaultSchemePortResolver r14 = org.apache.http.impl.conn.DefaultSchemePortResolver.INSTANCE
        L_0x0358:
            r0 = r20
            org.apache.http.HttpHost r0 = r0.proxy
            if (r0 == 0) goto L_0x0368
            org.apache.http.impl.conn.DefaultProxyRoutePlanner r13 = new org.apache.http.impl.conn.DefaultProxyRoutePlanner
            r0 = r20
            org.apache.http.HttpHost r0 = r0.proxy
            r13.<init>(r0, r14)
            goto L_0x037d
        L_0x0368:
            r0 = r20
            boolean r0 = r0.systemProperties
            if (r0 == 0) goto L_0x0378
            org.apache.http.impl.conn.SystemDefaultRoutePlanner r13 = new org.apache.http.impl.conn.SystemDefaultRoutePlanner
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
            r13.<init>(r14, r0)
            goto L_0x037d
        L_0x0378:
            org.apache.http.impl.conn.DefaultRoutePlanner r13 = new org.apache.http.impl.conn.DefaultRoutePlanner
            r13.<init>(r14)
        L_0x037d:
            r0 = r20
            org.apache.http.client.ServiceUnavailableRetryStrategy r14 = r0.serviceUnavailStrategy
            if (r14 == 0) goto L_0x0389
            org.apache.http.impl.execchain.ServiceUnavailableRetryExec r0 = new org.apache.http.impl.execchain.ServiceUnavailableRetryExec
            r0.<init>(r11, r14)
            r11 = r0
        L_0x0389:
            r0 = r20
            boolean r0 = r0.redirectHandlingDisabled
            if (r0 != 0) goto L_0x039d
            r0 = r20
            org.apache.http.client.RedirectStrategy r15 = r0.redirectStrategy
            if (r15 != 0) goto L_0x0397
            org.apache.http.impl.client.DefaultRedirectStrategy r15 = org.apache.http.impl.client.DefaultRedirectStrategy.INSTANCE
        L_0x0397:
            org.apache.http.impl.execchain.RedirectExec r0 = new org.apache.http.impl.execchain.RedirectExec
            r0.<init>(r11, r13, r15)
            r11 = r0
        L_0x039d:
            r0 = r20
            org.apache.http.client.BackoffManager r0 = r0.backoffManager
            if (r0 == 0) goto L_0x03b7
            r0 = r20
            org.apache.http.client.ConnectionBackoffStrategy r0 = r0.connectionBackoffStrategy
            if (r0 == 0) goto L_0x03b7
            org.apache.http.impl.execchain.BackoffStrategyExec r0 = new org.apache.http.impl.execchain.BackoffStrategyExec
            r1 = r20
            org.apache.http.client.ConnectionBackoffStrategy r1 = r1.connectionBackoffStrategy
            r2 = r20
            org.apache.http.client.BackoffManager r2 = r2.backoffManager
            r0.<init>(r11, r1, r2)
            r11 = r0
        L_0x03b7:
            r0 = r20
            org.apache.http.config.Lookup<org.apache.http.auth.AuthSchemeProvider> r15 = r0.authSchemeRegistry
            if (r15 != 0) goto L_0x03fc
            org.apache.http.config.RegistryBuilder r0 = org.apache.http.config.RegistryBuilder.create()
            java.lang.String r1 = "Basic"
            org.apache.http.impl.auth.BasicSchemeFactory r2 = new org.apache.http.impl.auth.BasicSchemeFactory
            r2.<init>()
            org.apache.http.config.RegistryBuilder r0 = r0.register(r1, r2)
            java.lang.String r1 = "Digest"
            org.apache.http.impl.auth.DigestSchemeFactory r2 = new org.apache.http.impl.auth.DigestSchemeFactory
            r2.<init>()
            org.apache.http.config.RegistryBuilder r0 = r0.register(r1, r2)
            java.lang.String r1 = "NTLM"
            org.apache.http.impl.auth.NTLMSchemeFactory r2 = new org.apache.http.impl.auth.NTLMSchemeFactory
            r2.<init>()
            org.apache.http.config.RegistryBuilder r0 = r0.register(r1, r2)
            java.lang.String r1 = "Negotiate"
            org.apache.http.impl.auth.SPNegoSchemeFactory r2 = new org.apache.http.impl.auth.SPNegoSchemeFactory
            r2.<init>()
            org.apache.http.config.RegistryBuilder r0 = r0.register(r1, r2)
            java.lang.String r1 = "Kerberos"
            org.apache.http.impl.auth.KerberosSchemeFactory r2 = new org.apache.http.impl.auth.KerberosSchemeFactory
            r2.<init>()
            org.apache.http.config.RegistryBuilder r0 = r0.register(r1, r2)
            org.apache.http.config.Registry r15 = r0.build()
        L_0x03fc:
            r0 = r20
            org.apache.http.config.Lookup<org.apache.http.cookie.CookieSpecProvider> r0 = r0.cookieSpecRegistry
            r16 = r0
            if (r16 != 0) goto L_0x0408
            org.apache.http.config.Lookup r16 = org.apache.http.impl.client.CookieSpecRegistries.createDefault(r10)
        L_0x0408:
            r0 = r20
            org.apache.http.client.CookieStore r10 = r0.cookieStore
            if (r10 != 0) goto L_0x0413
            org.apache.http.impl.client.BasicCookieStore r10 = new org.apache.http.impl.client.BasicCookieStore
            r10.<init>()
        L_0x0413:
            r0 = r20
            org.apache.http.client.CredentialsProvider r14 = r0.credentialsProvider
            if (r14 != 0) goto L_0x042a
            r0 = r20
            boolean r0 = r0.systemProperties
            if (r0 == 0) goto L_0x0425
            org.apache.http.impl.client.SystemDefaultCredentialsProvider r14 = new org.apache.http.impl.client.SystemDefaultCredentialsProvider
            r14.<init>()
            goto L_0x042a
        L_0x0425:
            org.apache.http.impl.client.BasicCredentialsProvider r14 = new org.apache.http.impl.client.BasicCredentialsProvider
            r14.<init>()
        L_0x042a:
            r0 = r20
            java.util.List<java.io.Closeable> r0 = r0.closeables
            if (r0 == 0) goto L_0x043c
            java.util.ArrayList r17 = new java.util.ArrayList
            r0 = r20
            java.util.List<java.io.Closeable> r0 = r0.closeables
            r1 = r17
            r1.<init>(r0)
            goto L_0x043e
        L_0x043c:
            r17 = 0
        L_0x043e:
            r0 = r20
            boolean r0 = r0.connManagerShared
            if (r0 != 0) goto L_0x04ac
            if (r17 != 0) goto L_0x044e
            java.util.ArrayList r17 = new java.util.ArrayList
            r0 = r17
            r1 = 1
            r0.<init>(r1)
        L_0x044e:
            r18 = r12
            r0 = r20
            boolean r0 = r0.evictExpiredConnections
            if (r0 != 0) goto L_0x045c
            r0 = r20
            boolean r0 = r0.evictIdleConnections
            if (r0 == 0) goto L_0x049e
        L_0x045c:
            org.apache.http.impl.client.IdleConnectionEvictor r19 = new org.apache.http.impl.client.IdleConnectionEvictor
            r1 = r18
            r2 = r20
            long r2 = r2.maxIdleTime
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x046f
            r2 = r20
            long r2 = r2.maxIdleTime
            goto L_0x0471
        L_0x046f:
            r2 = 10
        L_0x0471:
            r4 = r20
            java.util.concurrent.TimeUnit r4 = r4.maxIdleTimeUnit
            if (r4 == 0) goto L_0x047c
            r4 = r20
            java.util.concurrent.TimeUnit r4 = r4.maxIdleTimeUnit
            goto L_0x047e
        L_0x047c:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
        L_0x047e:
            r5 = r20
            long r5 = r5.maxIdleTime
            r7 = r20
            java.util.concurrent.TimeUnit r7 = r7.maxIdleTimeUnit
            r0 = r19
            r0.<init>(r1, r2, r4, r5, r7)
            org.apache.http.impl.client.HttpClientBuilder$1 r0 = new org.apache.http.impl.client.HttpClientBuilder$1
            r1 = r20
            r2 = r19
            r0.<init>(r2)
            r1 = r17
            r1.add(r0)
            r0 = r19
            r0.start()
        L_0x049e:
            org.apache.http.impl.client.HttpClientBuilder$2 r0 = new org.apache.http.impl.client.HttpClientBuilder$2
            r1 = r20
            r2 = r18
            r0.<init>(r2)
            r1 = r17
            r1.add(r0)
        L_0x04ac:
            org.apache.http.impl.client.InternalHttpClient r0 = new org.apache.http.impl.client.InternalHttpClient
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r16
            r5 = r15
            r6 = r10
            r7 = r14
            r8 = r20
            org.apache.http.client.config.RequestConfig r8 = r8.defaultRequestConfig
            if (r8 == 0) goto L_0x04c1
            r8 = r20
            org.apache.http.client.config.RequestConfig r8 = r8.defaultRequestConfig
            goto L_0x04c3
        L_0x04c1:
            org.apache.http.client.config.RequestConfig r8 = org.apache.http.client.config.RequestConfig.DEFAULT
        L_0x04c3:
            r9 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.HttpClientBuilder.build():org.apache.http.impl.client.CloseableHttpClient");
    }
}
