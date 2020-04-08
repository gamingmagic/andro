package p004o;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: o.灂 */
final class C1669 extends C0762sz {
    C1669() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2550;
        C0560mn mnVar = C0560mn.values()[byteBuffer.get()];
        long j = byteBuffer.getLong();
        if (!z) {
            C1973 r5 = C1014.f6147.f51.f1433.f782;
            if (r5.f8782 == j && r5.f8783 == mnVar) {
                C1014.f6147.f51.f1433.mo3538();
                C0297eb ebVar = C1014.f6147.f51.f1451;
                C0298if ifVar = (C0298if) ((C0299) ((C0185ai) ebVar.f813.getAdapter()).f384.get(mnVar.ordinal())).f817.getAdapter();
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < ((C0300[]) ifVar.f8049).length; i3++) {
                    if (((C0300[]) ifVar.f8049)[i3].f827.f8782 != j) {
                        arrayList.add(((C0300[]) ifVar.f8049)[i3].f827);
                    }
                }
                if (arrayList.size() != ((C0300[]) ifVar.f8049).length) {
                    ebVar.mo3672(arrayList);
                }
            }
        }
    }
}
