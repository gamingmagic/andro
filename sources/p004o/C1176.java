package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ʣ */
final class C1176 extends C0762sz {
    C1176() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 346;
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r8 = C0622ot.m741(bArr, opVar);
        C0618op opVar2 = C0618op.LOCAL;
        byte[] bArr2 = new byte[40];
        byteBuffer.get(bArr2);
        String r7 = C0622ot.m741(bArr2, opVar2);
        if (!z) {
            C1746 r0 = C1014.f6147.f51.f1427;
            C0252cp cpVar = C1014.f6158;
            String r5 = C1014.f6160.mo3796(365);
            r0.mo4490(String.format(r5 == null ? "MSG365" : r5, new Object[]{r8}), 16776960);
            if (r7.length() > 0) {
                C1746 r02 = C1014.f6147.f51.f1427;
                C0252cp cpVar2 = C1014.f6158;
                String r52 = C1014.f6160.mo3796(366);
                r02.mo4490(String.format(r52 == null ? "MSG366" : r52, new Object[]{r7}), 16776960);
            }
            if (C1014.f6137.f1636.f6541 != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= C1014.f6137.f1636.f6541.f7213.size()) {
                        break;
                    } else if (((C1506) C1014.f6137.f1636.f6541.f7213.get(i3)).f7233 == r8) {
                        C1014.f6137.f1636.f6541.f7213.remove(i3);
                        break;
                    } else {
                        i3++;
                    }
                }
                if (C1014.f6147.f51.f1383.f1626.getParent() != null) {
                    C1014.f6147.f51.f1383.f7300.mo4444();
                }
                if (r8.equals(C1014.f6137.f1636.f8657)) {
                    C1014.f6137.f1636.f8637 = 0;
                    C1014.f6147.f51.f1422.mo4454a_();
                }
            }
        }
    }
}
