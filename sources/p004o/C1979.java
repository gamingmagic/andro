package p004o;

import java.nio.ByteBuffer;
import p004o.C0643pc.aux;

/* renamed from: o.뽟 */
final class C1979 extends C0762sz {
    C1979() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2117;
        int i3 = byteBuffer.getInt();
        int i4 = C1014.f6140.f4443 != aux.iRO_Renewal ? byteBuffer.getInt() : 0;
        if (!z) {
            C1014.f6152.f7978.f6456 = i3;
            C1014.f6152.f7978.f6455 = i4;
            C1014.f6147.f51.f1391.mo3537h_();
            C1014.f6147.f51.f1391.mo4416e_();
            int i5 = C1014.f6140.f4470 >= 20131223 ? 9 : 8;
            for (int i6 = 0; i6 < i5; i6++) {
                C1014.f6144.mo3652((C0839ue) new C1391(i6));
            }
        }
    }
}
