package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̇ */
final class C1206 extends C0762sz {

    /* renamed from: 鷭 */
    static final int[] f6323 = {855, -1, -1, 831, 834};

    C1206() {
    }

    static {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 330;
        int i3 = byteBuffer.getInt();
        if (!z && i3 >= 0 && i3 < f6323.length && f6323[i3] >= 0) {
            C1746 r0 = C1014.f6147.f51.f1427;
            C0252cp cpVar = C1014.f6158;
            int i4 = f6323[i3];
            String r5 = C1014.f6160.mo3796(i4);
            r0.mo4490(r5 == null ? "MSG" + i4 : r5, 16776960);
        }
    }
}
