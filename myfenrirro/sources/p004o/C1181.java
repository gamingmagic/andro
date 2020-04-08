package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: o.ʯ */
final class C1181 extends C0762sz {
    C1181() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C1506 r7;
        this.f4671 = 491;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (!z) {
            if (C1014.f6137.f1636.f6541 != null) {
                C1503 r72 = C1014.f6137.f1636.f6541;
                int i4 = 0;
                while (true) {
                    if (i4 >= r72.f7213.size()) {
                        r7 = null;
                        break;
                    }
                    C1506 r3 = (C1506) r72.f7213.get(i4);
                    if (r3.f7240 == i3) {
                        r7 = r3;
                        break;
                    }
                    i4++;
                }
                if (r7 != null) {
                    r7.f7231 = s;
                    r7.f7239 = s2;
                } else {
                    return;
                }
            }
            if (C1014.f6142.f1695.f7347 != null) {
                if (s <= 0 || s2 <= 0) {
                    C1739 r73 = C1014.f6142.f1695.f7347;
                    r73.f8015 = (HashMap) r73.f8015.clone();
                    r73.f8015.remove(Integer.valueOf(i3));
                } else {
                    C1739 r74 = C1014.f6142.f1695.f7347;
                    short s3 = s2;
                    if (C1014.f6142.f1695 != null) {
                        C1346 r5 = (C1346) r74.f8015.get(Integer.valueOf(i3));
                        if (r5 == null) {
                            r5 = new C1346(r74);
                            r74.f8015 = (HashMap) r74.f8015.clone();
                            r74.f8015.put(Integer.valueOf(i3), r5);
                        }
                        r5.mo4339(new Point(s, s3));
                    }
                }
            }
        }
    }
}
