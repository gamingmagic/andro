package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ʳ */
final class C1184 extends C0762sz {
    C1184() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2599;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        if (!z) {
            m1936(s, i3);
        }
    }

    /* renamed from: 鷭 */
    static void m1936(short s, int i) {
        C0570mx mxVar;
        switch (s) {
            case 5:
                mxVar = C0570mx.HEAL;
                break;
            case 7:
                mxVar = C0570mx.SP_HEAL;
                break;
            default:
                return;
        }
        C1014.f6142.f1680.f1187.add(new C1632(i, C1014.f6142.f1680.f1195, System.currentTimeMillis(), mxVar));
    }
}
