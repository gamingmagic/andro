package org.apache.http.conn.ssl;

import org.apache.http.util.Args;

final class SubjectName {
    static final int DNS = 2;

    /* renamed from: IP */
    static final int f9011IP = 7;
    private final int type;
    private final String value;

    /* renamed from: IP */
    static SubjectName m2729IP(String str) {
        return new SubjectName(str, 7);
    }

    static SubjectName DNS(String str) {
        return new SubjectName(str, 2);
    }

    SubjectName(String str, int i) {
        this.value = (String) Args.notNull(str, "Value");
        this.type = Args.positive(i, "Type");
    }

    public final int getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final String toString() {
        return this.value;
    }
}
