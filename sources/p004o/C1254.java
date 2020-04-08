package p004o;

import java.nio.ByteBuffer;
import java.util.HashMap;
import p004o.C0760sy.C0761;

/* renamed from: o.ˮ͔ */
final class C1254 extends C0762sz {
    C1254() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 693;
        byteBuffer.getShort();
        C1770[] r5 = new C1770[i];
        for (int i3 = 0; i3 < r5.length; i3++) {
            ByteBuffer byteBuffer2 = byteBuffer;
            C1770 r2 = new C1770();
            r2.f8305 = byteBuffer2.getInt();
            r2.f8304 = byteBuffer2.getInt();
            r2.f8302 = byteBuffer2.getShort();
            r2.f8301 = byteBuffer2.getShort();
            r5[i3] = r2;
        }
        if (!z) {
            m2005(r5);
        }
    }

    /* renamed from: 鷭 */
    static void m2005(C1770[] r17) {
        C0240 r11;
        C1770[] r10 = r17;
        int length = r17.length;
        for (int i = 0; i < length; i++) {
            C1770 r172 = r10[i];
            C0238ce ceVar = (C0238ce) C1014.f6152.f7979.get(Integer.valueOf(r172.f8305));
            C0761 r12 = C1014.f6158.f674.f624.mo4093(r172.f8305);
            if (ceVar == null) {
                HashMap<Integer, C0238ce> hashMap = C1014.f6152.f7979;
                Integer valueOf = Integer.valueOf(r172.f8305);
                ceVar = new C0238ce();
                hashMap.put(valueOf, ceVar);
            }
            if (ceVar.f562 == null || ceVar.f562.length <= 0) {
                ceVar.f562 = new C0240[1];
                ceVar.f562[0] = new C0240(0, 1002, 0, 1, "");
            }
            C0240 r13 = ceVar.f562[0];
            C0240[] r16 = ceVar.f562;
            int length2 = r16.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                r11 = r16[i2];
                if ((r172.f8304 <= 0 || r11.f574 != r172.f8304) && (r172.f8303 <= 0 || r11.f575 != r172.f8303)) {
                    i2++;
                }
            }
            r13 = r11;
            if (r172.f8304 > 0) {
                r13.f574 = r172.f8304;
            }
            if (r172.f8303 > 0) {
                r13.f575 = r172.f8303;
            }
            r13.f573 = r172.f8301;
            r13.f572 = r172.f8302;
            if (r12 != null) {
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r112 = C1014.f6160.mo3796(1611);
                r0.mo4490(String.format(r112 == null ? "MSG1611" : r112, new Object[]{r12.f4667, r13.f570, Short.valueOf(r13.f573), Short.valueOf(r13.f572)}), 16776960);
            }
        }
        C1014.f6147.f51.f1392.mo3594();
    }
}
