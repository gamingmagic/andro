package org.apache.commons.net.p005io;

import java.util.EventListener;

/* renamed from: org.apache.commons.net.io.CopyStreamListener */
public interface CopyStreamListener extends EventListener {
    void bytesTransferred(long j, int i, long j2);

    void bytesTransferred(CopyStreamEvent copyStreamEvent);
}
