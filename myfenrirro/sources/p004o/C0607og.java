package p004o;

import java.io.DataInputStream;
import java.io.FileInputStream;

/* renamed from: o.og */
public final class C0607og extends DataInputStream {
    public C0607og(FileInputStream fileInputStream) {
        super(fileInputStream);
    }

    /* renamed from: 鷭 */
    public final int mo4030() {
        int readInt = super.readInt();
        return ((readInt & 255) << 24) | ((65280 & readInt) << 8) | ((16711680 & readInt) >>> 8) | ((-16777216 & readInt) >>> 24);
    }
}
