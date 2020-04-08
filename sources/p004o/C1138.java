package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ɞ */
final class C1138 extends C0762sz {
    C1138() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 435;
        C0618op opVar = C0618op.KOREAN;
        byte[] bArr = new byte[64];
        byteBuffer.get(bArr);
        String r5 = C0622ot.m741(bArr, opVar);
        byte b = byteBuffer.get();
        if (!z) {
            if (r5.equals("") || b == -1) {
                C1014.f6147.f51.f1387.mo3538();
                return;
            }
            C1733 r4 = C1014.f6147.f51.f1387;
            if (r4.f7975 == null || !r4.f7975.equals(r5)) {
                r4.f7975 = r5;
                r4.f7976.setImageBitmap(null);
                C1014.f6158.mo3387((Runnable) new C1497(r4, r5));
            }
            C1014.f6147.f51.f1387.mo3537h_();
        }
    }
}
