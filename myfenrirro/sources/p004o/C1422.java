package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.㥳 */
final class C1422 extends C0762sz {
    C1422() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = -28666;
        byteBuffer.getShort();
        byte[] bArr = new byte[256];
        byteBuffer.get(bArr);
        byte[] bArr2 = bArr;
        if (!z) {
            String r15 = C0622ot.m741(bArr2, C0618op.LATIN);
            if (C1014.f6144.f7007 != null) {
                C1014.f6144.f7007.f7022 = null;
            }
            C1428 r0 = C1014.f6144;
            r0.mo3387(new C1976(r0, C1014.f6140.f4480, C1014.f6140.f4441, C0585nl.LOGIN, C1014.f6147, new C1024(this, r15), C1014.f6153, C1014.f6153));
        }
    }
}
