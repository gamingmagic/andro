package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.懁 */
final class C1597 extends C0762sz {
    C1597() {
    }

    /* renamed from: 鷭 */
    static void m2279(int i, int i2, C1867[] r3) {
        C1014.f6152.f7978.f6456 = i;
        C1014.f6152.f7978.f6455 = i2;
        C1014.f6147.f51.f1377.mo3731(r3);
        C1014.f6147.f51.f1377.mo3537h_();
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 647;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        C1867[] r2 = new C1867[i];
        for (int i5 = 0; i5 < i; i5++) {
            r2[i5] = new C1867(byteBuffer);
        }
        if (!z) {
            m2279(i3, i4, r2);
        }
    }
}
