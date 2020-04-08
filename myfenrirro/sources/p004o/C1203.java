package p004o;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: o.ˮ̃ */
final class C1203 extends C0762sz {
    C1203() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 221;
        byteBuffer.getShort();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r7 = C0622ot.m741(bArr, opVar);
        byte b = byteBuffer.get();
        if (!z && C1014.f6137.f1636.f6522 != null) {
            C2012 r8 = C1014.f6137.f1636.f6522;
            Iterator it = r8.f8900.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2013 r9 = (C2013) it.next();
                if (r9.f8906.equals(r7)) {
                    r8.f8900.remove(r9);
                    if (b != 0) {
                        C1294 r0 = C1014.f6147.f51.f1390;
                        C0252cp cpVar = C1014.f6158;
                        String r4 = C1014.f6160.mo3796(182);
                        r0.mo4285(String.format(r4 == null ? "MSG182" : r4, new Object[]{r7}), 16711680);
                    } else {
                        C1294 r02 = C1014.f6147.f51.f1390;
                        C0252cp cpVar2 = C1014.f6158;
                        String r42 = C1014.f6160.mo3796(181);
                        r02.mo4285(String.format(r42 == null ? "MSG181" : r42, new Object[]{r7}), 16711680);
                    }
                }
            }
            if (r7.equals(C1014.f6137.f1636.f8657)) {
                C1014.f6137.f1636.f6522 = null;
                C1014.f6147.f51.f1390.mo3538();
                if (b != 0) {
                    C1746 r03 = C1014.f6147.f51.f1427;
                    C0252cp cpVar3 = C1014.f6158;
                    String r43 = C1014.f6160.mo3796(69);
                    r03.mo4490(r43 == null ? "MSG69" : r43, 16711680);
                }
            }
        }
    }
}
