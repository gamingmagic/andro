package org.apache.http.impl.client;

import java.net.URI;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
public class AutoRetryHttpClient implements HttpClient {
    private final HttpClient backend;
    private final Log log;
    private final ServiceUnavailableRetryStrategy retryStrategy;

    public AutoRetryHttpClient(HttpClient httpClient, ServiceUnavailableRetryStrategy serviceUnavailableRetryStrategy) {
        this.log = LogFactory.getLog(getClass());
        Args.notNull(httpClient, "HttpClient");
        Args.notNull(serviceUnavailableRetryStrategy, "ServiceUnavailableRetryStrategy");
        this.backend = httpClient;
        this.retryStrategy = serviceUnavailableRetryStrategy;
    }

    public AutoRetryHttpClient() {
        this(new DefaultHttpClient(), new DefaultServiceUnavailableRetryStrategy());
    }

    public AutoRetryHttpClient(ServiceUnavailableRetryStrategy serviceUnavailableRetryStrategy) {
        this(new DefaultHttpClient(), serviceUnavailableRetryStrategy);
    }

    public AutoRetryHttpClient(HttpClient httpClient) {
        this(httpClient, new DefaultServiceUnavailableRetryStrategy());
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return execute(httpHost, httpRequest, (HttpContext) null);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return execute(httpHost, httpRequest, responseHandler, null);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return responseHandler.handleResponse(execute(httpHost, httpRequest, httpContext));
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest) {
        return execute(httpUriRequest, (HttpContext) null);
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        URI uri = httpUriRequest.getURI();
        return execute(new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme()), (HttpRequest) httpUriRequest, httpContext);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return execute(httpUriRequest, responseHandler, (HttpContext) null);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return responseHandler.handleResponse(execute(httpUriRequest, httpContext));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.HttpResponse execute(org.apache.http.HttpHost r8, org.apache.http.HttpRequest r9, org.apache.http.protocol.HttpContext r10) {
        /*
            r7 = this;
            r3 = 1
        L_0x0001:
            org.apache.http.client.HttpClient r0 = r7.backend
            org.apache.http.HttpResponse r4 = r0.execute(r8, r9, r10)
            org.apache.http.client.ServiceUnavailableRetryStrategy r0 = r7.retryStrategy     // Catch:{ RuntimeException -> 0x0042 }
            boolean r0 = r0.retryRequest(r4, r3, r10)     // Catch:{ RuntimeException -> 0x0042 }
            if (r0 == 0) goto L_0x0041
            org.apache.http.HttpEntity r0 = r4.getEntity()     // Catch:{ RuntimeException -> 0x0042 }
            org.apache.http.util.EntityUtils.consume(r0)     // Catch:{ RuntimeException -> 0x0042 }
            org.apache.http.client.ServiceUnavailableRetryStrategy r0 = r7.retryStrategy     // Catch:{ RuntimeException -> 0x0042 }
            long r5 = r0.getRetryInterval()     // Catch:{ RuntimeException -> 0x0042 }
            org.apache.commons.logging.Log r0 = r7.log     // Catch:{ InterruptedException -> 0x0034 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0034 }
            java.lang.String r2 = "Wait for "
            r1.<init>(r2)     // Catch:{ InterruptedException -> 0x0034 }
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch:{ InterruptedException -> 0x0034 }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException -> 0x0034 }
            r0.trace(r1)     // Catch:{ InterruptedException -> 0x0034 }
            java.lang.Thread.sleep(r5)     // Catch:{ InterruptedException -> 0x0034 }
            goto L_0x0054
        L_0x0034:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ RuntimeException -> 0x0042 }
            r0.interrupt()     // Catch:{ RuntimeException -> 0x0042 }
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ RuntimeException -> 0x0042 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0042 }
            throw r0     // Catch:{ RuntimeException -> 0x0042 }
        L_0x0041:
            return r4
        L_0x0042:
            r5 = move-exception
            org.apache.http.HttpEntity r0 = r4.getEntity()     // Catch:{ IOException -> 0x004b }
            org.apache.http.util.EntityUtils.consume(r0)     // Catch:{ IOException -> 0x004b }
            goto L_0x0053
        L_0x004b:
            r6 = move-exception
            org.apache.commons.logging.Log r0 = r7.log
            java.lang.String r1 = "I/O error consuming response content"
            r0.warn(r1, r6)
        L_0x0053:
            throw r5
        L_0x0054:
            int r3 = r3 + 1
            goto L_0x0001
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.AutoRetryHttpClient.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):org.apache.http.HttpResponse");
    }

    public ClientConnectionManager getConnectionManager() {
        return this.backend.getConnectionManager();
    }

    public HttpParams getParams() {
        return this.backend.getParams();
    }
}
