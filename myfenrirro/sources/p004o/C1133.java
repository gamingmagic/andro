package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ɓ */
final class C1133 extends C0762sz {

    /* renamed from: 鷭 */
    int f6236;

    C1133() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 306;
        this.f6236 = byteBuffer.getInt();
        if (!z) {
            C0540lv r3 = C1014.f6142.mo3978(this.f6236);
            if (!(r3 == null || r3.f1728 == null)) {
                C0955y yVar = r3.f1728;
                if (yVar.f5679 != null) {
                    if (yVar.f5686 != null) {
                        yVar.f5686 = null;
                    }
                    yVar.mo4155();
                }
            }
        }
    }
}
