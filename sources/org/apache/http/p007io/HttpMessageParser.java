package org.apache.http.p007io;

import org.apache.http.HttpMessage;

/* renamed from: org.apache.http.io.HttpMessageParser */
public interface HttpMessageParser<T extends HttpMessage> {
    T parse();
}
