package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ઽૈ */
final class C1333 extends C0762sz {
    C1333() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2565;
        C0557mk mkVar = C0557mk.values()[byteBuffer.get()];
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        int i3 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        C1472 r17 = C1472.values()[byteBuffer.get()];
        boolean z2 = byteBuffer.get() != 0;
        boolean z3 = byteBuffer.get() != 0;
        byte b = byteBuffer.get();
        C1111 r0 = new C1111(byteBuffer);
        C1665 r02 = new C1665(byteBuffer);
        short s3 = byteBuffer.getShort();
        if (!z) {
            int i4 = (short) (s - 2);
            C1746 r03 = C1014.f6147.f51.f1427;
            C0252cp cpVar = C1014.f6158;
            int i5 = mkVar.f1810;
            String r24 = C1014.f6160.mo3796(i5);
            r03.mo4490(r24 == null ? "MSG" + i5 : r24, 16776960);
            C1992 r27 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(i4));
            if (r27 != null) {
                r27.f8846 -= s2;
                if (r27.f8846 <= 0) {
                    C1014.f6137.f1636.f6528.remove(r27);
                }
                C1014.f6147.f51.f1445.mo4536(r27.f8839);
            }
            C1992 r04 = new C1992(i3, s2, b, r17, z3, z2, false, 0, 0, 0, r0, 0, 0, r02);
            C1992 r28 = r04;
            C0290dv dvVar = C1014.f6147.f51.f1428;
            int i6 = 0;
            while (i6 < dvVar.f799.length && dvVar.f799[i6] != null) {
                i6++;
            }
            if (i6 == dvVar.f799.length) {
                C0592ns.m674("can't add item to rodex: no slot");
            } else {
                dvVar.f803[i6] = i4;
                dvVar.f799[i6] = r28;
                C0453ix ixVar = C1014.f6147.f51;
                C1992 r242 = r28;
                ixVar.mo3871(dvVar.f789[i6], C1014.f6158.f674.mo3608(r242.f8848, r242.f8837, false), ixVar.f1450);
                dvVar.f790[i6].setText(String.valueOf(r28.f8846));
                dvVar.f790[i6].setVisibility(0);
                dvVar.mo3662();
            }
            C1014.f6147.f51.f1428.mo3663(s3);
        }
    }
}
