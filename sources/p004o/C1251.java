package p004o;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: o.ˮ͒ */
final class C1251 extends C0762sz {

    /* renamed from: o.ˮ͒$鷭 */
    class C1252 {

        /* renamed from: Ą */
        C1120[] f6409 = new C1120[3];

        /* renamed from: ȃ */
        short f6411;

        /* renamed from: ˮ͈ */
        int f6412;

        /* renamed from: 櫯 */
        int f6413;

        /* renamed from: 鷭 */
        int f6414;

        C1252(ByteBuffer byteBuffer) {
            this.f6414 = byteBuffer.getInt();
            this.f6413 = byteBuffer.getInt();
            this.f6412 = byteBuffer.getInt();
            this.f6411 = byteBuffer.getShort();
            for (int i = 0; i < this.f6409.length; i++) {
                this.f6409[i] = new C1120(byteBuffer);
            }
        }
    }

    C1251() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 690;
        int i3 = byteBuffer.getInt();
        C1252[] r8 = new C1252[i];
        for (int i4 = 0; i4 < i; i4++) {
            r8[i4] = new C1252(byteBuffer);
        }
        if (!z) {
            for (int i5 = 0; i5 < i3; i5++) {
                C1252 r12 = r8[i5];
                C0238ce ceVar = (C0238ce) C1014.f6152.f7979.get(Integer.valueOf(r12.f6414));
                if (ceVar == null) {
                    HashMap<Integer, C0238ce> hashMap = C1014.f6152.f7979;
                    Integer valueOf = Integer.valueOf(r12.f6414);
                    ceVar = new C0238ce();
                    hashMap.put(valueOf, ceVar);
                    ceVar.f565 = C0239if.ACTIVE;
                }
                ceVar.f564 = (long) r12.f6413;
                ceVar.f563 = (long) r12.f6412;
                ceVar.f562 = new C0240[r12.f6411];
                for (int i6 = 0; i6 < r12.f6411; i6++) {
                    C1120 r10 = r8[i5].f6409[i6];
                    ceVar.f562[i6] = new C0240(0, r10.f6224, 0, r10.f6223, r10.f6222);
                }
            }
            C1014.f6147.f51.f1392.mo3594();
        }
    }
}
