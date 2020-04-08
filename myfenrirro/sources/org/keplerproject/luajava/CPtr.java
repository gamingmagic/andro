package org.keplerproject.luajava;

public class CPtr {
    private long peer;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (CPtr.class != obj.getClass()) {
            return false;
        }
        return this.peer == ((CPtr) obj).peer;
    }

    /* access modifiers changed from: protected */
    public long getPeer() {
        return this.peer;
    }

    CPtr() {
    }
}
