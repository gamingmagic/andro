package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.균 */
final class C1887 extends C0762sz {
    C1887() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C1992 r7;
        this.f4671 = 2567;
        boolean z2 = byteBuffer.get() != 0;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        if (!z) {
            if (!z2) {
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r6 = C1014.f6160.mo3796(2603);
                r0.mo4490(r6 == null ? "MSG2603" : r6, 16776960);
                return;
            }
            short s4 = (short) (s - 2);
            C0290dv dvVar = C1014.f6147.f51.f1428;
            short s5 = s4;
            int i3 = 0;
            while (i3 < dvVar.f803.length && dvVar.f803[i3] != s5) {
                i3++;
            }
            if (i3 == dvVar.f803.length) {
                C0592ns.m674("rodex write remove failed to find item with index " + s5);
                r7 = null;
            } else {
                C1992 r8 = dvVar.f799[i3];
                if (r8 == null) {
                    C0592ns.m674("rodex write item/idex desync");
                    r7 = null;
                } else {
                    r8.f8846 -= s2;
                    if (r8.f8846 <= 0) {
                        dvVar.f803[i3] = -1;
                        dvVar.f799[i3] = null;
                        dvVar.f789[i3].setImageBitmap(null);
                        dvVar.f790[i3].setText("");
                    } else {
                        dvVar.f790[i3].setText(String.valueOf(r8.f8846));
                    }
                    dvVar.mo3662();
                    r7 = r8;
                }
            }
            C1992 r82 = (C1992) C1014.f6137.f1636.f6528.get(Short.valueOf(s4));
            if (r82 != null) {
                r82.f8846 += s2;
            } else {
                r7.f8846 = s2;
                C1014.f6137.f1636.f6528.put(Integer.valueOf(s4), r7);
            }
            C1014.f6147.f51.f1445.mo4536(r7.f8839);
            C1014.f6147.f51.f1428.mo3663(s3);
        }
    }
}
