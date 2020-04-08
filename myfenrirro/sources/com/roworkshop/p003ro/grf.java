package com.roworkshop.p003ro;

/* renamed from: com.roworkshop.ro.grf */
public class grf {
    public static native int append(byte[] bArr, byte[] bArr2);

    public static native int delete(byte[] bArr);

    public static native void free();

    public static native int open(String str);

    static {
        System.loadLibrary("grf");
    }
}
