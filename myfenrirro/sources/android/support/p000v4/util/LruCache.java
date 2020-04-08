package android.support.p000v4.util;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: android.support.v4.util.LruCache */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i;
        this.map = new LinkedHashMap<>(0, 0.75f, true);
    }

    public void resize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.maxSize = i;
            trimToSize(i);
        }
    }

    public final V get(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.map.get(k);
            if (v != null) {
                this.hitCount++;
                return v;
            }
            this.missCount++;
            V create = create(k);
            if (create == null) {
                return null;
            }
            synchronized (this) {
                this.createCount++;
                V put = this.map.put(k, create);
                if (put != null) {
                    this.map.put(k, put);
                } else {
                    this.size += safeSizeOf(k, create);
                }
                if (put != null) {
                    entryRemoved(false, k, create, put);
                    return put;
                }
                trimToSize(this.maxSize);
                return create;
            }
        }
    }

    public final V put(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.putCount++;
            this.size += safeSizeOf(k, v);
            V put = this.map.put(k, v);
            if (put != null) {
                this.size -= safeSizeOf(k, put);
            }
            if (put != null) {
                entryRemoved(false, k, put, v);
            }
            trimToSize(this.maxSize);
            return put;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L_0x0000:
            r5 = r6
            monitor-enter(r6)
            int r0 = r6.size     // Catch:{ all -> 0x0070 }
            if (r0 < 0) goto L_0x0012
            java.util.LinkedHashMap<K, V> r0 = r6.map     // Catch:{ all -> 0x0070 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0033
            int r0 = r6.size     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0033
        L_0x0012:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r1.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.Class r2 = r6.getClass()     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0070 }
            r0.<init>(r1)     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0033:
            int r0 = r6.size     // Catch:{ all -> 0x0070 }
            if (r0 <= r7) goto L_0x003f
            java.util.LinkedHashMap<K, V> r0 = r6.map     // Catch:{ all -> 0x0070 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0041
        L_0x003f:
            monitor-exit(r5)     // Catch:{ all -> 0x0070 }
            return
        L_0x0041:
            java.util.LinkedHashMap<K, V> r0 = r6.map     // Catch:{ all -> 0x0070 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0070 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0070 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0070 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0070 }
            r4 = r0
            java.lang.Object r3 = r4.getKey()     // Catch:{ all -> 0x0070 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0070 }
            java.util.LinkedHashMap<K, V> r0 = r6.map     // Catch:{ all -> 0x0070 }
            r0.remove(r3)     // Catch:{ all -> 0x0070 }
            int r0 = r6.size     // Catch:{ all -> 0x0070 }
            int r1 = r6.safeSizeOf(r3, r4)     // Catch:{ all -> 0x0070 }
            int r0 = r0 - r1
            r6.size = r0     // Catch:{ all -> 0x0070 }
            int r0 = r6.evictionCount     // Catch:{ all -> 0x0070 }
            int r0 = r0 + 1
            r6.evictionCount = r0     // Catch:{ all -> 0x0070 }
            monitor-exit(r5)     // Catch:{ all -> 0x0070 }
            goto L_0x0073
        L_0x0070:
            r7 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0070 }
            throw r7
        L_0x0073:
            r0 = 1
            r1 = 0
            r6.entryRemoved(r0, r3, r4, r1)
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.util.LruCache.trimToSize(int):void");
    }

    public final V remove(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V remove = this.map.remove(k);
            if (remove != null) {
                this.size -= safeSizeOf(k, remove);
            }
            if (remove != null) {
                entryRemoved(false, k, remove, null);
            }
            return remove;
        }
    }

    /* access modifiers changed from: protected */
    public void entryRemoved(boolean z, K k, V v, V v2) {
    }

    /* access modifiers changed from: protected */
    public V create(K k) {
        return null;
    }

    private int safeSizeOf(K k, V v) {
        int sizeOf = sizeOf(k, v);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* access modifiers changed from: protected */
    public int sizeOf(K k, V v) {
        return 1;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int size() {
        return this.size;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    public final synchronized Map<K, V> snapshot() {
        return new LinkedHashMap(this.map);
    }

    public final synchronized String toString() {
        int i;
        i = this.hitCount + this.missCount;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i != 0 ? (this.hitCount * 100) / i : 0)});
    }
}
