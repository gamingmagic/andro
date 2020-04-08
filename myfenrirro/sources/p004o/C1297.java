package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Ӝ */
final class C1297 extends C0762sz {
    C1297() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2240;
        int i3 = byteBuffer.getInt();
        byteBuffer.getShort();
        C0244ch[] chVarArr = new C0244ch[i];
        for (int i4 = 0; i4 < chVarArr.length; i4++) {
            chVarArr[i4] = new C0244ch(byteBuffer);
        }
        if (!z) {
            C1658.m2327(i3, chVarArr);
        }
    }
}
