package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.醯 */
final class C1774 extends C0762sz {
    C1774() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 107;
        int position = byteBuffer.position();
        if (C1014.f6140.f4470 >= 20100413) {
            byteBuffer.get();
        }
        if (C1014.f6140.f4470 >= 20100413) {
            byteBuffer.get();
        }
        if (C1014.f6140.f4470 >= 20100413) {
            byteBuffer.get();
        }
        byteBuffer.get(new byte[20]);
        int position2 = byteBuffer.position();
        C0599nz[] nzVarArr = new C0599nz[i];
        for (int i3 = 0; i3 < nzVarArr.length; i3++) {
            nzVarArr[i3] = new C0599nz(byteBuffer);
        }
        if (!z) {
            C1972.m2639(nzVarArr, i2 - (position2 - position));
        }
    }
}
