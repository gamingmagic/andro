package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.λ */
final class C1266 extends C0762sz {
    C1266() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 467;
        C0618op opVar = C0618op.KOREAN;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r5 = C0622ot.m741(bArr, opVar);
        byteBuffer.get();
        byteBuffer.getInt();
        byteBuffer.getInt();
        if (!z) {
            String str = r5;
            if (!r5.endsWith(".wav")) {
                str = new StringBuilder(String.valueOf(str)).append(".wav").toString();
            }
            C1014.f6136.mo4428(str, 1.0f);
        }
    }
}
