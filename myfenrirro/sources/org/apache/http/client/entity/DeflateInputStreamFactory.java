package org.apache.http.client.entity;

import java.io.InputStream;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class DeflateInputStreamFactory implements InputStreamFactory {
    private static final DeflateInputStreamFactory INSTANCE = new DeflateInputStreamFactory();

    static {
    }

    public static DeflateInputStreamFactory getInstance() {
        return INSTANCE;
    }

    public InputStream create(InputStream inputStream) {
        return new DeflateInputStream(inputStream);
    }
}
