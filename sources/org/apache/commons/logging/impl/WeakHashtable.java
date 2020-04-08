package org.apache.commons.logging.impl;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public final class WeakHashtable extends Hashtable {
    private static final int MAX_CHANGES_BEFORE_PURGE = 100;
    private static final int PARTIAL_PURGE_COUNT = 10;
    private int changeCount = 0;
    private ReferenceQueue queue = new ReferenceQueue();

    static final class Entry implements java.util.Map.Entry {
        private final Object key;
        private final Object value;

        Entry(Object obj, Object obj2, C20671 r3) {
            this(obj, obj2);
        }

        private Entry(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
                if (getValue() != null ? getValue().equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() == null ? 0 : getValue().hashCode());
        }

        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("Entry.setValue is not supported.");
        }

        public final Object getValue() {
            return this.value;
        }

        public final Object getKey() {
            return this.key;
        }
    }

    static final class Referenced {
        private final int hashCode;
        private final WeakReference reference;

        Referenced(Object obj, ReferenceQueue referenceQueue, C20671 r3) {
            this(obj, referenceQueue);
        }

        Referenced(Object obj, C20671 r2) {
            this(obj);
        }

        static Object access$100(Referenced referenced) {
            return referenced.getValue();
        }

        private Referenced(Object obj) {
            this.reference = new WeakReference(obj);
            this.hashCode = obj.hashCode();
        }

        private Referenced(Object obj, ReferenceQueue referenceQueue) {
            this.reference = new WeakKey(obj, referenceQueue, this, null);
            this.hashCode = obj.hashCode();
        }

        public final int hashCode() {
            return this.hashCode;
        }

        private Object getValue() {
            return this.reference.get();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Referenced)) {
                return false;
            }
            Referenced referenced = (Referenced) obj;
            Object value = getValue();
            Object value2 = referenced.getValue();
            if (value != null) {
                return value.equals(value2);
            }
            boolean z = value2 == null;
            if (z) {
                return hashCode() == referenced.hashCode();
            }
            return z;
        }
    }

    static final class WeakKey extends WeakReference {
        private final Referenced referenced;

        WeakKey(Object obj, ReferenceQueue referenceQueue, Referenced referenced2, C20671 r4) {
            this(obj, referenceQueue, referenced2);
        }

        static Referenced access$400(WeakKey weakKey) {
            return weakKey.getReferenced();
        }

        private WeakKey(Object obj, ReferenceQueue referenceQueue, Referenced referenced2) {
            super(obj, referenceQueue);
            this.referenced = referenced2;
        }

        private Referenced getReferenced() {
            return this.referenced;
        }
    }

    public final boolean containsKey(Object obj) {
        return super.containsKey(new Referenced(obj, (C20671) null));
    }

    public final Enumeration elements() {
        purge();
        return super.elements();
    }

    public final Set entrySet() {
        purge();
        Set<java.util.Map.Entry> entrySet = super.entrySet();
        HashSet hashSet = new HashSet();
        for (java.util.Map.Entry entry : entrySet) {
            Object access$100 = Referenced.access$100((Referenced) entry.getKey());
            Object value = entry.getValue();
            if (access$100 != null) {
                hashSet.add(new Entry(access$100, value, null));
            }
        }
        return hashSet;
    }

    public final Object get(Object obj) {
        return super.get(new Referenced(obj, (C20671) null));
    }

    public final Enumeration keys() {
        purge();
        return new Enumeration(this, super.keys()) {
            private final WeakHashtable this$0;
            private final Enumeration val$enumer;

            public boolean hasMoreElements() {
                return this.val$enumer.hasMoreElements();
            }

            {
                this.this$0 = r1;
                this.val$enumer = r2;
            }

            public Object nextElement() {
                return Referenced.access$100((Referenced) this.val$enumer.nextElement());
            }
        };
    }

    public final Set keySet() {
        purge();
        Set<Referenced> keySet = super.keySet();
        HashSet hashSet = new HashSet();
        for (Referenced access$100 : keySet) {
            Object access$1002 = Referenced.access$100(access$100);
            if (access$1002 != null) {
                hashSet.add(access$1002);
            }
        }
        return hashSet;
    }

    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("Null keys are not allowed");
        } else if (obj2 == null) {
            throw new NullPointerException("Null values are not allowed");
        } else {
            int i = this.changeCount;
            this.changeCount = i + 1;
            if (i > 100) {
                purge();
                this.changeCount = 0;
            } else if (this.changeCount % 10 == 0) {
                purgeOne();
            }
            return super.put(new Referenced(obj, this.queue, null), obj2);
        }
    }

    public final void putAll(Map map) {
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    public final Collection values() {
        purge();
        return super.values();
    }

    public final Object remove(Object obj) {
        int i = this.changeCount;
        this.changeCount = i + 1;
        if (i > 100) {
            purge();
            this.changeCount = 0;
        } else if (this.changeCount % 10 == 0) {
            purgeOne();
        }
        return super.remove(new Referenced(obj, (C20671) null));
    }

    public final boolean isEmpty() {
        purge();
        return super.isEmpty();
    }

    public final int size() {
        purge();
        return super.size();
    }

    public final String toString() {
        purge();
        return super.toString();
    }

    /* access modifiers changed from: protected */
    public final void rehash() {
        purge();
        super.rehash();
    }

    private void purge() {
        synchronized (this.queue) {
            while (true) {
                WeakKey weakKey = (WeakKey) this.queue.poll();
                if (weakKey != null) {
                    super.remove(WeakKey.access$400(weakKey));
                }
            }
            while (true) {
            }
        }
    }

    private void purgeOne() {
        synchronized (this.queue) {
            WeakKey weakKey = (WeakKey) this.queue.poll();
            if (weakKey != null) {
                super.remove(WeakKey.access$400(weakKey));
            }
        }
    }
}
