package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˡ */
final class C1198 extends C0762sz {
    C1198() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2824;
        boolean z2 = C1014.f6140.f4471 ? C1014.f6140.f4470 >= 20180919 : C1014.f6140.f4472 ? C1014.f6140.f4470 >= 20180919 : C1014.f6140.f4470 >= 20181002;
        if (C1014.f6140.f4501) {
            byteBuffer.get();
        }
        int i3 = z2 ? i : 24;
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[i3];
        byteBuffer.get(bArr);
        C0622ot.m741(bArr, opVar);
        if (!z) {
        }
    }
}
