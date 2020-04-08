package com.roworkshop.p003ro;

/* renamed from: com.roworkshop.ro.natives */
public class natives {
    public static native int decodebmp(byte[] bArr, int[] iArr, int[] iArr2);

    public static native void decodedes(byte[] bArr, int i, int i2, int i3);

    public static native void procpacketrecv(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2);

    public static native int procpacketsend(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2);

    static {
        System.loadLibrary("natives");
    }
}
