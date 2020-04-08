package org.apache.commons.net.p005io;

import java.util.EventListener;
import java.util.Iterator;
import org.apache.commons.net.util.ListenerList;

/* renamed from: org.apache.commons.net.io.CopyStreamAdapter */
public class CopyStreamAdapter implements CopyStreamListener {
    private final ListenerList internalListeners = new ListenerList();

    public void bytesTransferred(CopyStreamEvent copyStreamEvent) {
        Iterator it = this.internalListeners.iterator();
        while (it.hasNext()) {
            ((CopyStreamListener) ((EventListener) it.next())).bytesTransferred(copyStreamEvent);
        }
    }

    public void bytesTransferred(long j, int i, long j2) {
        Iterator it = this.internalListeners.iterator();
        while (it.hasNext()) {
            ((CopyStreamListener) ((EventListener) it.next())).bytesTransferred(j, i, j2);
        }
    }

    public void addCopyStreamListener(CopyStreamListener copyStreamListener) {
        this.internalListeners.addListener(copyStreamListener);
    }

    public void removeCopyStreamListener(CopyStreamListener copyStreamListener) {
        this.internalListeners.removeListener(copyStreamListener);
    }
}
