package org.apache.commons.net.p005io;

import java.io.IOException;

/* renamed from: org.apache.commons.net.io.CopyStreamException */
public class CopyStreamException extends IOException {
    private static final long serialVersionUID = -2602899129433221532L;
    private final long totalBytesTransferred;

    public CopyStreamException(String str, long j, IOException iOException) {
        super(str);
        initCause(iOException);
        this.totalBytesTransferred = j;
    }

    public long getTotalBytesTransferred() {
        return this.totalBytesTransferred;
    }

    public IOException getIOException() {
        return (IOException) getCause();
    }
}
