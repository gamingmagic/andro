package p004o;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: o.ˮ̿ */
final class C1242 extends C0762sz {
    C1242() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 419;
        byte b = byteBuffer.get();
        int i3 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        if (!z) {
            if (b == 0) {
                C0252cp cpVar = C1014.f6158;
                String r7 = C1014.f6160.mo3796(592);
                String str = r7 == null ? "MSG592" : r7;
                Object[] objArr = new Object[1];
                C1701 r5 = C1014.f6158.f674.f608.mo4465(i3);
                objArr[0] = r5 == null ? null : r5.mo4462(true);
                C1014.f6147.f51.f1427.mo4490(String.format(str, objArr), 16711680);
                return;
            }
            int i4 = 0;
            Iterator it = C1014.f6137.f1636.f6528.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    C1992 r72 = (C1992) it.next();
                    if (r72.f8848 == i3) {
                        i4 = r72.f8846;
                        break;
                    }
                } else {
                    break;
                }
            }
            C1014.f6147.f51.f1427.mo4488(i3, i4);
        }
    }
}
