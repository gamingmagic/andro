package org.apache.http.p007io;

/* renamed from: org.apache.http.io.HttpTransportMetrics */
public interface HttpTransportMetrics {
    long getBytesTransferred();

    void reset();
}
