package org.apache.http.impl.execchain;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
public class ServiceUnavailableRetryExec implements ClientExecChain {
    private final Log log = LogFactory.getLog(getClass());
    private final ClientExecChain requestExecutor;
    private final ServiceUnavailableRetryStrategy retryStrategy;

    public ServiceUnavailableRetryExec(ClientExecChain clientExecChain, ServiceUnavailableRetryStrategy serviceUnavailableRetryStrategy) {
        Args.notNull(clientExecChain, "HTTP request executor");
        Args.notNull(serviceUnavailableRetryStrategy, "Retry strategy");
        this.requestExecutor = clientExecChain;
        this.retryStrategy = serviceUnavailableRetryStrategy;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.client.methods.CloseableHttpResponse execute(org.apache.http.conn.routing.HttpRoute r10, org.apache.http.client.methods.HttpRequestWrapper r11, org.apache.http.client.protocol.HttpClientContext r12, org.apache.http.client.methods.HttpExecutionAware r13) {
        /*
            r9 = this;
            org.apache.http.Header[] r4 = r11.getAllHeaders()
            r5 = 1
        L_0x0005:
            org.apache.http.impl.execchain.ClientExecChain r0 = r9.requestExecutor
            org.apache.http.client.methods.CloseableHttpResponse r6 = r0.execute(r10, r11, r12, r13)
            org.apache.http.client.ServiceUnavailableRetryStrategy r0 = r9.retryStrategy     // Catch:{ RuntimeException -> 0x0053 }
            boolean r0 = r0.retryRequest(r6, r5, r12)     // Catch:{ RuntimeException -> 0x0053 }
            if (r0 == 0) goto L_0x0052
            boolean r0 = org.apache.http.impl.execchain.RequestEntityProxy.isRepeatable(r11)     // Catch:{ RuntimeException -> 0x0053 }
            if (r0 == 0) goto L_0x0052
            r6.close()     // Catch:{ RuntimeException -> 0x0053 }
            org.apache.http.client.ServiceUnavailableRetryStrategy r0 = r9.retryStrategy     // Catch:{ RuntimeException -> 0x0053 }
            long r0 = r0.getRetryInterval()     // Catch:{ RuntimeException -> 0x0053 }
            r7 = r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x004e
            org.apache.commons.logging.Log r0 = r9.log     // Catch:{ InterruptedException -> 0x0041 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0041 }
            java.lang.String r2 = "Wait for "
            r1.<init>(r2)     // Catch:{ InterruptedException -> 0x0041 }
            java.lang.StringBuilder r1 = r1.append(r7)     // Catch:{ InterruptedException -> 0x0041 }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException -> 0x0041 }
            r0.trace(r1)     // Catch:{ InterruptedException -> 0x0041 }
            java.lang.Thread.sleep(r7)     // Catch:{ InterruptedException -> 0x0041 }
            goto L_0x004e
        L_0x0041:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ RuntimeException -> 0x0053 }
            r0.interrupt()     // Catch:{ RuntimeException -> 0x0053 }
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ RuntimeException -> 0x0053 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0053 }
            throw r0     // Catch:{ RuntimeException -> 0x0053 }
        L_0x004e:
            r11.setHeaders(r4)     // Catch:{ RuntimeException -> 0x0053 }
            goto L_0x0058
        L_0x0052:
            return r6
        L_0x0053:
            r7 = move-exception
            r6.close()
            throw r7
        L_0x0058:
            int r5 = r5 + 1
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.execchain.ServiceUnavailableRetryExec.execute(org.apache.http.conn.routing.HttpRoute, org.apache.http.client.methods.HttpRequestWrapper, org.apache.http.client.protocol.HttpClientContext, org.apache.http.client.methods.HttpExecutionAware):org.apache.http.client.methods.CloseableHttpResponse");
    }
}
